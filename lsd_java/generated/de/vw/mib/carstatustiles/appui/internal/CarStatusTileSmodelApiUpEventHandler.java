/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.carstatustiles.appui.internal;

import de.vw.mib.app.framework.AppDefinition;
import de.vw.mib.appui.AbstractModelApiUpEventHandler;
import de.vw.mib.datapool.AppAdapterListItemControlManager;
import de.vw.mib.datapool.ModelDatapool;
import de.vw.mib.event.dispatcher.StatemachineEventDispatcher;
import de.vw.mib.modelapi.ModelApiUpEvent;
import de.vw.mib.modelapi.ui.ModelApiUpEventHandler;

public class CarStatusTileSmodelApiUpEventHandler
extends AbstractModelApiUpEventHandler
implements ModelApiUpEventHandler {
    public CarStatusTileSmodelApiUpEventHandler(AppDefinition appDefinition, StatemachineEventDispatcher statemachineEventDispatcher, ModelDatapool modelDatapool, AppAdapterListItemControlManager appAdapterListItemControlManager) {
        super(appDefinition, statemachineEventDispatcher, modelDatapool, appAdapterListItemControlManager);
    }

    @Override
    protected void onDatapoolUpdate(ModelApiUpEvent modelApiUpEvent) {
        int n = modelApiUpEvent.getActionId();
        switch (n) {
            case 0: {
                this.modelDatapool.setInteger(-1378156544, modelApiUpEvent.getInt(0));
                break;
            }
            case 1: {
                this.modelDatapool.setFlagVector(21208, (boolean[])modelApiUpEvent.getObject(0));
                break;
            }
            case 2: {
                this.modelDatapool.setInteger(1645412608, modelApiUpEvent.getInt(0));
                break;
            }
            case 3: {
                this.modelDatapool.setInteger(28637, modelApiUpEvent.getInt(0));
                break;
            }
            case 4: {
                this.modelDatapool.setInteger(10673, modelApiUpEvent.getInt(0));
                break;
            }
            case 5: {
                this.modelDatapool.setInteger(252510464, modelApiUpEvent.getInt(0));
                break;
            }
            case 6: {
                this.modelDatapool.setFlagVector(14901, (boolean[])modelApiUpEvent.getObject(0));
                break;
            }
            case 7: {
                this.modelDatapool.setBoolean(11790, modelApiUpEvent.getBoolean(0));
                break;
            }
            case 8: {
                this.modelDatapool.setInteger(27598, modelApiUpEvent.getInt(0));
                this.modelDatapool.setInteger(1020526592, modelApiUpEvent.getInt(1));
                this.modelDatapool.setInteger(-2115764224, modelApiUpEvent.getInt(2));
                this.modelDatapool.setInteger(-803012352, modelApiUpEvent.getInt(3));
                this.modelDatapool.setInteger(-2037121024, modelApiUpEvent.getInt(4));
                this.modelDatapool.setInteger(27696, modelApiUpEvent.getInt(5));
                this.modelDatapool.setInteger(1006829824, modelApiUpEvent.getInt(6));
                this.modelDatapool.setInteger(-1006239488, modelApiUpEvent.getInt(7));
                this.modelDatapool.setInteger(-1107164928, modelApiUpEvent.getInt(8));
                this.modelDatapool.setInteger(27135, modelApiUpEvent.getInt(9));
                this.modelDatapool.setInteger(-1785790464, modelApiUpEvent.getInt(10));
                this.modelDatapool.setInteger(1871380480, modelApiUpEvent.getInt(11));
                this.modelDatapool.setInteger(20090, modelApiUpEvent.getInt(12));
                this.modelDatapool.setInteger(16270, modelApiUpEvent.getInt(13));
                this.modelDatapool.setInteger(0x10C10000, modelApiUpEvent.getInt(14));
                this.modelDatapool.setInteger(18045, modelApiUpEvent.getInt(15));
                this.modelDatapool.setInteger(15045, modelApiUpEvent.getInt(16));
                this.modelDatapool.setInteger(29290, modelApiUpEvent.getInt(17));
                break;
            }
            default: {
                super.onDatapoolUpdate(modelApiUpEvent);
            }
        }
    }
}

