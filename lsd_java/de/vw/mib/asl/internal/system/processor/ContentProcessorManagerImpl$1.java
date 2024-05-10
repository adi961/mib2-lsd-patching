/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.system.processor;

import de.vw.mib.asl.internal.system.SystemServices;
import de.vw.mib.asl.internal.system.processor.ContentProcessorManagerImpl;

class ContentProcessorManagerImpl$1
implements Runnable {
    private final /* synthetic */ SystemServices val$systemServices;
    private final /* synthetic */ ContentProcessorManagerImpl this$0;

    ContentProcessorManagerImpl$1(ContentProcessorManagerImpl contentProcessorManagerImpl, SystemServices systemServices) {
        this.this$0 = contentProcessorManagerImpl;
        this.val$systemServices = systemServices;
    }

    @Override
    public void run() {
        ContentProcessorManagerImpl.access$000(this.this$0, this.val$systemServices);
    }
}

