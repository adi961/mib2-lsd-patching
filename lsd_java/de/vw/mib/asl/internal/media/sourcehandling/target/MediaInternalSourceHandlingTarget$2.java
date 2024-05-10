/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.media.sourcehandling.target;

import de.vw.mib.asl.framework.api.entertainmentmanager.core.EntertainmentManagerCoreService;
import de.vw.mib.asl.framework.api.framework.component.ASLComponentAPICallback;
import de.vw.mib.asl.internal.media.accessor.MediaObjectAccessor;
import de.vw.mib.asl.internal.media.sourcehandling.SourceHandlingPersistence;
import de.vw.mib.asl.internal.media.sourcehandling.state.MediaCollector;
import de.vw.mib.asl.internal.media.sourcehandling.target.MediaInternalSourceHandlingTarget;

class MediaInternalSourceHandlingTarget$2
implements ASLComponentAPICallback {
    private final /* synthetic */ MediaInternalSourceHandlingTarget this$0;

    MediaInternalSourceHandlingTarget$2(MediaInternalSourceHandlingTarget mediaInternalSourceHandlingTarget) {
        this.this$0 = mediaInternalSourceHandlingTarget;
    }

    @Override
    public void registered(Class clazz, Object object) {
        MediaCollector mediaCollector;
        int n;
        boolean bl;
        block7: {
            EntertainmentManagerCoreService entertainmentManagerCoreService = (EntertainmentManagerCoreService)object;
            MediaObjectAccessor.mMediaController.sourcesAvailable(this.this$0);
            bl = entertainmentManagerCoreService.getContext() == 2;
            n = SourceHandlingPersistence.getInstance().getObjectId();
            mediaCollector = MediaInternalSourceHandlingTarget.access$000(this.this$0).mediaCollectorFromObjectId(n);
            try {
                boolean bl2;
                if (this.this$0.isTraceEnabled()) {
                    this.this$0.trace().append("MediaInternalSourceHandlingTarget.gotEvent(POWER_ON): check AUX").append(", objectId=").append(n).append(", aslId=").append(n & 0xFFFF0000).append(", collector=").append(mediaCollector).log();
                }
                boolean bl3 = (n & 0xFFFF0000) == 3;
                boolean bl4 = bl2 = mediaCollector != null && MediaCollector.EMPTY != mediaCollector;
                if (this.this$0.isTraceEnabled()) {
                    this.this$0.trace().append("MediaInternalSourceHandlingTarget.gotEvent(POWER_ON): ").append(", isAUX=").append(bl3).append(", isReqMediaCollectorAvailable=").append(bl2).log();
                }
                if (bl3 && !bl2) {
                    if (this.this$0.isTraceEnabled()) {
                        this.this$0.trace().append("MediaInternalSourceHandlingTarget.gotEvent(POWER_ON): FALL BACK TO DEFAULT DEVICE").log();
                    }
                    n = 0;
                    mediaCollector = MediaInternalSourceHandlingTarget.access$000(this.this$0).mediaCollectorFromObjectId(n);
                }
            }
            catch (Exception exception) {
                if (!this.this$0.isTraceEnabled()) break block7;
                this.this$0.trace().append("MediaInternalSourceHandlingTarget.gotEvent(POWER_ON): ERROR ").append(exception.getMessage()).log();
            }
        }
        MediaInternalSourceHandlingTarget.access$100(this.this$0, bl, n & 0xFFFF0000);
        if (bl) {
            MediaInternalSourceHandlingTarget.access$200(this.this$0, mediaCollector);
        }
    }
}

