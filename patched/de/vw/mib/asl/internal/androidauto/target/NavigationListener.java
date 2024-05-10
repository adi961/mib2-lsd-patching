/*
 * Decompiled with CFR 0.151-SNAPSHOT (5569f06-dirty).
 */
package de.vw.mib.asl.internal.androidauto.target;

import de.vw.mib.asl.api.navigation.ASLNavigationServices;
import de.vw.mib.asl.api.navigation.AbstractASLNavigationServicesListener;
import de.vw.mib.asl.framework.internal.framework.ServiceManager;
import de.vw.mib.asl.internal.androidauto.target.AndroidAutoGlobalProperties;
import de.vw.mib.asl.internal.androidauto.target.AndroidAutoTarget;
import de.vw.mib.asl.internal.androidauto.target.StartupHandler;

import java.util.Arrays;

public class NavigationListener
extends AbstractASLNavigationServicesListener {
    private AndroidAutoTarget target;
    private StartupHandler startupHandler;
    private AndroidAutoGlobalProperties properties;
    private ASLNavigationServices navServices;
    private boolean stopGuidancePending = false;

    public NavigationListener(AndroidAutoTarget androidAutoTarget, AndroidAutoGlobalProperties androidAutoGlobalProperties, StartupHandler startupHandler) {
        System.out.println("AADEBUG target ids: getClassifier(): " + androidAutoTarget.getClassifier() + " getSubClassifier(): " + androidAutoTarget.getSubClassifier()+ " getDefaultTargetId(): " + androidAutoTarget.getDefaultTargetId() + " targetId: " +androidAutoTarget.getTargetId());
        System.out.println("AADEBUG: target: " + androidAutoTarget.toString());
        System.out.println("AADEBUG: hashCode: " + androidAutoTarget.hashCode());

        System.out.println("AADEBUG: OBSERVED_EVENTS:");
        for (int i2 = 0; i2 < androidAutoTarget.OBSERVED_EVENTS.length; ++i2) {
            System.out.println("  " + androidAutoTarget.OBSERVED_EVENTS[i2]);
        }

        System.out.println("AADEBUG: DSI_ANDROIDAUTO2_ATTR:");
        for (int i2 = 0; i2 < androidAutoTarget.DSI_ANDROIDAUTO2_ATTR.length; ++i2) {
            System.out.println("  " + androidAutoTarget.DSI_ANDROIDAUTO2_ATTR[i2]);
        }


        this.target = androidAutoTarget;
        this.properties = androidAutoGlobalProperties;
        this.startupHandler = startupHandler;
    }

    public void initNavServices(ASLNavigationServices aSLNavigationServices) {
        this.navServices = aSLNavigationServices;
    }

    // @Override
    public void updateGuidanceActive(boolean bl) {
        if (this.target.isTraceEnabled()) {
            this.target.trace(new StringBuffer().append("NavigationHandler::updateGuidanceActive (ignored) - flag = ").append(bl).toString());
        }
        // if (bl) {
        //     // ServiceManager.aslPropertyManager.valueChangedBoolean(895953920, false);
        //     this.properties.setAndroidAutoNavigationActive(false);
        //     if (this.startupHandler.isDSI2Registered() && this.startupHandler.isDeviceConnected()) {
        // //         this.target.getDSIAndroidAuto2().navFocusNotification(1, true);
        //     }
        // }
        // ServiceManager.aslPropertyManager.valueChangedBoolean(895953920, true);
    }

    // @Override
    public void updateServiceAvailable(boolean bl) {
        if (bl && this.stopGuidancePending) {
            this.stopGuidancePending = false;
            this.stopGuidance();
        }
    }

    public void stopGuidance() {
        if (this.target.isTraceEnabled()) {
            this.target.trace("NavigationHandler::stopGuidance (ignored)");
        }
       // if (this.navServices.isServiceAvailable()) {
       //     this.navServices.stopGuidance(6);
       // } else {
            // this.stopGuidancePending = true;
            // if (this.target.isTraceEnabled()) {
            //     this.target.trace("NavigationListener::stopGuidance() = isServiceAvailable false");
            // }
       // }
    }

    public boolean isGuidanceActive() {
        //return this.navServices.isGuidanceActive();
        return false;
    }
}

