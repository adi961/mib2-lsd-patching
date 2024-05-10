/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.system.processor;

import de.vw.mib.app.desktop.ContentManager;
import de.vw.mib.asl.internal.system.processor.ContentProcessorManagerImpl$2;

class ContentProcessorManagerImpl$2$1
implements Runnable {
    private final /* synthetic */ ContentManager val$manager;
    private final /* synthetic */ ContentProcessorManagerImpl$2 this$1;

    ContentProcessorManagerImpl$2$1(ContentProcessorManagerImpl$2 contentProcessorManagerImpl$2, ContentManager contentManager) {
        this.this$1 = contentProcessorManagerImpl$2;
        this.val$manager = contentManager;
    }

    @Override
    public void run() {
        ContentProcessorManagerImpl$2.access$100(this.this$1).onContentManagerAdded(this.val$manager);
    }
}

