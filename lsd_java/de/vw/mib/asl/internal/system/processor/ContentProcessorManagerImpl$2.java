/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.system.processor;

import de.vw.mib.app.desktop.ContentManager;
import de.vw.mib.asl.internal.system.processor.ContentProcessorManagerImpl;
import de.vw.mib.asl.internal.system.processor.ContentProcessorManagerImpl$2$1;
import de.vw.mib.genericevents.ThreadSwitchingTarget;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;

class ContentProcessorManagerImpl$2
extends ServiceTracker {
    private final /* synthetic */ ThreadSwitchingTarget val$threadSwitcher;
    private final /* synthetic */ ContentProcessorManagerImpl this$0;

    ContentProcessorManagerImpl$2(ContentProcessorManagerImpl contentProcessorManagerImpl, BundleContext bundleContext, String string, ServiceTrackerCustomizer serviceTrackerCustomizer, ThreadSwitchingTarget threadSwitchingTarget) {
        this.this$0 = contentProcessorManagerImpl;
        this.val$threadSwitcher = threadSwitchingTarget;
        super(bundleContext, string, serviceTrackerCustomizer);
    }

    @Override
    public Object addingService(ServiceReference serviceReference) {
        ContentManager contentManager = (ContentManager)super.addingService(serviceReference);
        this.installContentManager(contentManager);
        return contentManager;
    }

    private void installContentManager(ContentManager contentManager) {
        this.val$threadSwitcher.enqueue(new ContentProcessorManagerImpl$2$1(this, contentManager));
    }

    static /* synthetic */ ContentProcessorManagerImpl access$100(ContentProcessorManagerImpl$2 contentProcessorManagerImpl$2) {
        return contentProcessorManagerImpl$2.this$0;
    }
}

