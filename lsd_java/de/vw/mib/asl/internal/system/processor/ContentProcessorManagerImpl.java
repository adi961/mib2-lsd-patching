/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.system.processor;

import de.vw.mib.app.desktop.ContentManager;
import de.vw.mib.asl.api.system.contentprocessor.AbstractContentProcessor;
import de.vw.mib.asl.api.system.contentprocessor.ContentProcessorManager;
import de.vw.mib.asl.framework.api.dsiproxy.DSIProxy;
import de.vw.mib.asl.internal.system.SystemServices;
import de.vw.mib.asl.internal.system.processor.ContentProcessorManagerImpl$1;
import de.vw.mib.asl.internal.system.processor.ContentProcessorManagerImpl$2;
import de.vw.mib.asl.internal.system.processor.DelegatingContentProcessor;
import de.vw.mib.asl.internal.system.processor.ThreadSwitchingContentProcessor;
import de.vw.mib.asl.internal.system.util.SystemLogger;
import de.vw.mib.genericevents.ThreadSwitchingTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.dsi.ifc.powermanagement.DSIPowerManagement;
import org.osgi.framework.BundleContext;

public class ContentProcessorManagerImpl
implements ContentProcessorManager {
    private final DelegatingContentProcessor delegatingContentProcessor = new DelegatingContentProcessor();
    private final List contentProcessorsWithoutContentManager = new ArrayList();
    private ContentManager contentManager;
    private SystemLogger systemLogger;
    private int tryToTrackRetryCounter;
    private DSIPowerManagement dsiPowerManagement;
    static /* synthetic */ Class class$org$dsi$ifc$powermanagement$DSIPowerManagement;
    static /* synthetic */ Class class$de$vw$mib$app$desktop$ContentProcessor;
    static /* synthetic */ Class class$de$vw$mib$app$desktop$ContentManager;

    public ContentProcessorManagerImpl(SystemServices systemServices) {
        this.systemLogger = new SystemLogger(systemServices.getAsl1Logger(), super.getClass());
        DSIProxy dSIProxy = systemServices.getDsiProxy();
        this.dsiPowerManagement = (DSIPowerManagement)dSIProxy.getService(null, class$org$dsi$ifc$powermanagement$DSIPowerManagement == null ? (class$org$dsi$ifc$powermanagement$DSIPowerManagement = ContentProcessorManagerImpl.class$("org.dsi.ifc.powermanagement.DSIPowerManagement")) : class$org$dsi$ifc$powermanagement$DSIPowerManagement);
        this.registerContentProcessorToOsgi(systemServices);
        this.tryToTrackContentManager(systemServices);
    }

    private void tryToTrackContentManager(SystemServices systemServices) {
        try {
            this.trackContentManager(systemServices);
        }
        catch (NullPointerException nullPointerException) {
            ++this.tryToTrackRetryCounter;
            if (this.tryToTrackRetryCounter <= 10) {
                this.systemLogger.info("tryToTrackContentManager - caught NullPointerException -> retry");
                systemServices.getThreadSwitcher().enqueue(new ContentProcessorManagerImpl$1(this, systemServices));
            } else {
                this.systemLogger.info("tryToTrackContentManager - caught NullPointerException -> maximum number of retries reached -> ABORT");
                this.dsiPowerManagement.rebootSystem();
            }
            return;
        }
        this.systemLogger.info("tryToTrackContentManager - success");
    }

    @Override
    public void registerContentProcessor(AbstractContentProcessor abstractContentProcessor) {
        this.verifyContentProcessor(abstractContentProcessor);
        this.delegatingContentProcessor.addDelegate(abstractContentProcessor.getScreenArea(), abstractContentProcessor);
        this.installContentManager(abstractContentProcessor);
    }

    void onContentManagerAdded(ContentManager contentManager) {
        this.contentManager = contentManager;
        Iterator iterator = this.contentProcessorsWithoutContentManager.iterator();
        while (iterator.hasNext()) {
            AbstractContentProcessor abstractContentProcessor = (AbstractContentProcessor)iterator.next();
            abstractContentProcessor.installContentManager(contentManager);
        }
        this.contentProcessorsWithoutContentManager.clear();
    }

    private void verifyContentProcessor(AbstractContentProcessor abstractContentProcessor) {
        if (abstractContentProcessor == null) {
            throw new IllegalArgumentException("The given content processor must not be null");
        }
    }

    private void installContentManager(AbstractContentProcessor abstractContentProcessor) {
        if (this.contentManager == null) {
            this.contentProcessorsWithoutContentManager.add(abstractContentProcessor);
        } else {
            abstractContentProcessor.installContentManager(this.contentManager);
        }
    }

    private void registerContentProcessorToOsgi(SystemServices systemServices) {
        ThreadSwitchingTarget threadSwitchingTarget = systemServices.getThreadSwitcher();
        ThreadSwitchingContentProcessor threadSwitchingContentProcessor = new ThreadSwitchingContentProcessor(threadSwitchingTarget, this.delegatingContentProcessor);
        systemServices.getBundleContext().registerService((class$de$vw$mib$app$desktop$ContentProcessor == null ? (class$de$vw$mib$app$desktop$ContentProcessor = ContentProcessorManagerImpl.class$("de.vw.mib.app.desktop.ContentProcessor")) : class$de$vw$mib$app$desktop$ContentProcessor).getName(), (Object)threadSwitchingContentProcessor, null);
    }

    private void trackContentManager(SystemServices systemServices) {
        ThreadSwitchingTarget threadSwitchingTarget = systemServices.getThreadSwitcher();
        BundleContext bundleContext = systemServices.getBundleContext();
        if (bundleContext == null) {
            this.systemLogger.info("trackContentManager - BundleContext == null");
        }
        new ContentProcessorManagerImpl$2(this, bundleContext, (class$de$vw$mib$app$desktop$ContentManager == null ? (class$de$vw$mib$app$desktop$ContentManager = ContentProcessorManagerImpl.class$("de.vw.mib.app.desktop.ContentManager")) : class$de$vw$mib$app$desktop$ContentManager).getName(), null, threadSwitchingTarget).open();
    }

    static /* synthetic */ Class class$(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static /* synthetic */ void access$000(ContentProcessorManagerImpl contentProcessorManagerImpl, SystemServices systemServices) {
        contentProcessorManagerImpl.tryToTrackContentManager(systemServices);
    }
}

