/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.navigation.api.impl;

import de.vw.mib.asl.api.navigation.ASLNavigationServicesListener;
import de.vw.mib.asl.api.navigation.GuidanceInfo;
import de.vw.mib.asl.api.navigation.ILocationWrapper;
import de.vw.mib.asl.api.navigation.NavAddress;
import de.vw.mib.asl.api.navigation.map.ASLNavigationMapFactory;
import de.vw.mib.asl.api.navigation.map.ASLNavigationServiceMainMap;
import de.vw.mib.asl.api.navigation.memory.ASLNavigationMemoryFactory;
import de.vw.mib.asl.api.navigation.poi.ASLNavigationPoiFactory;
import de.vw.mib.asl.api.navigation.util.ASLNavigationUtilFactory;
import de.vw.mib.asl.internal.navigation.api.impl.TargetASLNavigationServices;
import de.vw.mib.asl.internal.navigation.gateway.INavGateway;
import de.vw.mib.genericevents.AbstractTarget;
import org.dsi.ifc.global.NavLocation;
import org.dsi.ifc.navigation.NavRouteListData;
import org.dsi.ifc.navigation.RgInfoForNextDestination;
import org.dsi.ifc.navigation.Route;
import org.dsi.ifc.navigation.RouteDestination;
import org.dsi.ifc.organizer.AdbEntry;

public class ASLNavigationServices
implements de.vw.mib.asl.api.navigation.ASLNavigationServices {
    private ASLNavigationServicesListener listener;
    private TargetASLNavigationServices target;

    static NavAddress createNavAddress(ILocationWrapper iLocationWrapper) {
        NavAddress navAddress = new NavAddress();
        navAddress.setCity(iLocationWrapper.getCity());
        navAddress.setCountry(iLocationWrapper.getCountry());
        navAddress.setCountryCode(iLocationWrapper.getCountryCode());
        navAddress.setCrossing(iLocationWrapper.getCrossing());
        navAddress.setHousenumber(iLocationWrapper.getHousenumber());
        navAddress.setLatitude(ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().dsiToDecimal(iLocationWrapper.getLatitude()));
        navAddress.setLongitude(ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().dsiToDecimal(iLocationWrapper.getLongitude()));
        navAddress.setName(iLocationWrapper.getPoiName());
        navAddress.setPhoneNumber(iLocationWrapper.getPhonenumber());
        navAddress.setState(iLocationWrapper.getState());
        navAddress.setStateAbbreviation(iLocationWrapper.getStateAbbreviation());
        navAddress.setStreet(iLocationWrapper.getStreet());
        navAddress.setUrl("");
        navAddress.setZip(iLocationWrapper.getPostalCode());
        return navAddress;
    }

    public ASLNavigationServices(ASLNavigationServicesListener aSLNavigationServicesListener, TargetASLNavigationServices targetASLNavigationServices) {
        this.target = targetASLNavigationServices;
        this.listener = aSLNavigationServicesListener;
    }

   // @Override
    public ASLNavigationServiceMainMap createMainMapService(AbstractTarget abstractTarget, int[] nArray) {
        return ASLNavigationMapFactory.getNavigationMapApi().createMainMapService(abstractTarget, nArray);
    }

   // @Override
    public int getContactCapacity() {
        if (this.isServiceAvailable()) {
            return this.target.getContactCapacity();
        }
        return 0;
    }

   // @Override
    public GuidanceInfo[] getGuidanceInfo() {
        if (this.isServiceAvailable()) {
            GuidanceInfo[] guidanceInfoArray = new GuidanceInfo[2];
            INavGateway iNavGateway = ASLNavigationUtilFactory.getNavigationUtilApi().getNavGateway();
            Route route = iNavGateway.getRgCurrentRoute();
            if (route != null && route.getRoutelist() != null && route.getRoutelist().length > 0) {
                RgInfoForNextDestination rgInfoForNextDestination = iNavGateway.getRgInfoForNextDestination();
                NavRouteListData[] navRouteListDataArray = iNavGateway.getRgDestinationInfo();
                RouteDestination[] routeDestinationArray = route.getRoutelist();
                NavLocation navLocation = routeDestinationArray[routeDestinationArray.length - 1].getRouteLocation();
                ILocationWrapper iLocationWrapper = navLocation != null ? ASLNavigationUtilFactory.getNavigationUtilApi().getLocationWrapper(navLocation) : ASLNavigationUtilFactory.getNavigationUtilApi().getLocationWrapper();
                NavAddress navAddress = ASLNavigationServices.createNavAddress(iLocationWrapper);
                int[] nArray = this.calculateEtaForFinalDest(route, rgInfoForNextDestination, navRouteListDataArray);
                int n = nArray[2];
                int n2 = nArray[0];
                int n3 = nArray[1];
                long l = ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().calculateDistanceFromCCPToFinalDest(rgInfoForNextDestination, route, navRouteListDataArray);
                guidanceInfoArray[1] = new GuidanceInfo(navAddress, n, n2, n3, l);
                if (route.indexOfCurrentDestination < (long)routeDestinationArray.length) {
                    navLocation = routeDestinationArray[(int)route.getIndexOfCurrentDestination()].getRouteLocation();
                    ILocationWrapper iLocationWrapper2 = navLocation != null ? ASLNavigationUtilFactory.getNavigationUtilApi().getLocationWrapper(navLocation) : ASLNavigationUtilFactory.getNavigationUtilApi().getLocationWrapper();
                    navAddress = ASLNavigationServices.createNavAddress(iLocationWrapper2);
                    long l2 = rgInfoForNextDestination.getTimeToNextDest();
                    nArray = ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().calculateEta(l2);
                    n = nArray[2];
                    n2 = nArray[0];
                    n3 = nArray[1];
                    l = rgInfoForNextDestination.getDistanceToNextDest();
                    guidanceInfoArray[0] = new GuidanceInfo(navAddress, n, n2, n3, l);
                }
            }
            return guidanceInfoArray;
        }
        return new GuidanceInfo[0];
    }

   // @Override
    public NavAddress getCurrentCarPosition() {
        if (this.isServiceAvailable()) {
            INavGateway iNavGateway = ASLNavigationUtilFactory.getNavigationUtilApi().getNavGateway();
            NavAddress navAddress = ASLNavigationServices.createNavAddress(ASLNavigationUtilFactory.getNavigationUtilApi().getLocationWrapper(iNavGateway.getSoPosPositionDescription()));
            navAddress.setLatitude(ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().dsiToDecimal(iNavGateway.getSoPosPosition().getLatitude()));
            navAddress.setLongitude(ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().dsiToDecimal(iNavGateway.getSoPosPosition().getLongitude()));
            return navAddress;
        }
        return null;
    }

   // @Override
    public NavAddress getLocationInputAddress() {
        NavLocation navLocation = ASLNavigationUtilFactory.getNavigationUtilApi().getNavigationDp().getExternalLocationInputLocation();
        if (navLocation == null) {
            this.target.warn("No location input address stored!");
        }
        return ASLNavigationServices.createNavAddress(ASLNavigationUtilFactory.getNavigationUtilApi().getLocationWrapper(navLocation));
    }

   // @Override
    public void importContact(AdbEntry adbEntry, int n) {
        this.importContact(adbEntry, n, true);
    }

   // @Override
    public void importContact(AdbEntry adbEntry, int n, boolean bl) {
        if (this.isServiceAvailable()) {
            this.target.importContact(adbEntry, this.listener, n, bl);
        }
    }

   // @Override
    public void importContactSummary(int n, int n2, int n3, int n4) {
        this.target.notifyDestinationImportActive(false);
        if (this.isServiceAvailable()) {
            ASLNavigationMemoryFactory.getNavigationMemoryApi().importContactSummary(n, n2, n3, n4);
        }
    }

   // @Override
    public boolean isGuidanceActive() {
        return this.isServiceAvailable() ? this.target.calculatedRgActive : false;
    }

   // @Override
    public boolean isServiceAvailable() {
        return this.target.isServiceAvailable();
    }

   // @Override
    public int startGuidance(NavAddress[] navAddressArray, boolean bl, int n) {
        if (this.isServiceAvailable()) {
            this.target.trace("ASLNavigationServices.startGuidance() received.");
            if (this.target.isCurrentlyResolvingLocations()) {
                this.target.warn("ASLNavigationServices.startGuidance() blocked because route calculation or location resolving is in progress.");
                return 2;
            }
            this.target.startGuidance(navAddressArray, bl, n);
            return 1;
        }
        this.target.trace("ASLNavigationServices.startGuidance() received but navigation context is not available.");
        return 2;
    }

    private int[] calculateEtaForFinalDest(Route route, RgInfoForNextDestination rgInfoForNextDestination, NavRouteListData[] navRouteListDataArray) {
        long l = rgInfoForNextDestination.getTimeToNextDest() * 0;
        if (navRouteListDataArray != null && navRouteListDataArray.length > 1 && route != null) {
            int n = (int)(route.getIndexOfCurrentDestination() + 1L);
            if (route.getRoutelist() != null && n < navRouteListDataArray.length) {
                l += (long)navRouteListDataArray[n].getRemainingTravelTime();
            }
        }
        return ASLNavigationUtilFactory.getNavigationUtilApi().getNaviHelper().calculateEta(l);
    }

   // @Override
    public boolean isValidOnlinePoiCategory(int n) {
        return ASLNavigationPoiFactory.getNavigationPoiApi().isValidOnlinePoiCategory(n);
    }

   // @Override
    public int[] parseGeoPositionVCard3_0(String string) {
        return this.target.parseGeoPosition(string);
    }

   // @Override
    public int stopGuidance(int n) {
        this.target.trace("ASLNavigationServices.stopGuidance(" + n + ") received.");
        new Exception("Stack trace").printStackTrace();
        if (n != 6) {
            this.target.stopGuidance(n);
        }
        return 1;
    }
}

