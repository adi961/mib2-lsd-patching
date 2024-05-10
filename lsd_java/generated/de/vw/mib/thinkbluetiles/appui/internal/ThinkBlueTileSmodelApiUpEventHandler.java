/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.thinkbluetiles.appui.internal;

import de.vw.mib.app.framework.AppDefinition;
import de.vw.mib.appui.AbstractModelApiUpEventHandler;
import de.vw.mib.datapool.AppAdapterListItemControlManager;
import de.vw.mib.datapool.ModelDatapool;
import de.vw.mib.event.dispatcher.StatemachineEventDispatcher;
import de.vw.mib.modelapi.ModelApiUpEvent;
import de.vw.mib.modelapi.ui.ModelApiUpEventHandler;

public class ThinkBlueTileSmodelApiUpEventHandler
extends AbstractModelApiUpEventHandler
implements ModelApiUpEventHandler {
    public ThinkBlueTileSmodelApiUpEventHandler(AppDefinition appDefinition, StatemachineEventDispatcher statemachineEventDispatcher, ModelDatapool modelDatapool, AppAdapterListItemControlManager appAdapterListItemControlManager) {
        super(appDefinition, statemachineEventDispatcher, modelDatapool, appAdapterListItemControlManager);
    }

    @Override
    protected void onDatapoolUpdate(ModelApiUpEvent modelApiUpEvent) {
        int n = modelApiUpEvent.getActionId();
        switch (n) {
            case 0: {
                this.modelDatapool.setBoolean(22871, modelApiUpEvent.getBoolean(0));
                break;
            }
            case 1: {
                this.modelDatapool.setInteger(1428095232, modelApiUpEvent.getInt(0));
                break;
            }
            case 2: {
                this.modelDatapool.setBoolean(-674562048, modelApiUpEvent.getBoolean(0));
                break;
            }
            case 3: {
                this.modelDatapool.setInteger(-585170688, modelApiUpEvent.getInt(0));
                break;
            }
            case 4: {
                this.modelDatapool.setInteger(1888681984, modelApiUpEvent.getInt(0));
                break;
            }
            case 5: {
                this.modelDatapool.setInteger(0x10C00000, modelApiUpEvent.getInt(0));
                break;
            }
            case 6: {
                this.modelDatapool.setInteger(12423, modelApiUpEvent.getInt(0));
                break;
            }
            case 7: {
                this.modelDatapool.setInteger(13582, modelApiUpEvent.getInt(0));
                break;
            }
            case 8: {
                this.modelDatapool.setInteger(0x60060100, modelApiUpEvent.getInt(0));
                break;
            }
            case 9: {
                this.modelDatapool.setInteger(2007498752, modelApiUpEvent.getInt(0));
                break;
            }
            case 10: {
                this.modelDatapool.setInteger(1744044032, modelApiUpEvent.getInt(0));
                break;
            }
            case 11: {
                this.modelDatapool.setInteger(923992320, modelApiUpEvent.getInt(0));
                break;
            }
            case 12: {
                this.modelDatapool.setInteger(32345, modelApiUpEvent.getInt(0));
                break;
            }
            case 13: {
                this.modelDatapool.setIntegerVector(16886, (int[])modelApiUpEvent.getObject(0));
                break;
            }
            case 14: {
                this.modelDatapool.setInteger(19253, modelApiUpEvent.getInt(0));
                break;
            }
            case 15: {
                this.modelDatapool.setInteger(11909, modelApiUpEvent.getInt(0));
                break;
            }
            default: {
                super.onDatapoolUpdate(modelApiUpEvent);
            }
        }
    }
}

