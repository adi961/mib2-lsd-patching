/*
 * Decompiled with CFR 0.152.
 */
package generated.de.vw.mib.drivingdatatiles.appui.internal;

import de.vw.mib.app.framework.AppDefinition;
import de.vw.mib.appui.AbstractModelApiUpEventHandler;
import de.vw.mib.datapool.AppAdapterListItemControlManager;
import de.vw.mib.datapool.ModelDatapool;
import de.vw.mib.event.dispatcher.StatemachineEventDispatcher;
import de.vw.mib.modelapi.ModelApiUpEvent;
import de.vw.mib.modelapi.ui.ModelApiUpEventHandler;

public class DrivingDataTileSmodelApiUpEventHandler
extends AbstractModelApiUpEventHandler
implements ModelApiUpEventHandler {
    public DrivingDataTileSmodelApiUpEventHandler(AppDefinition appDefinition, StatemachineEventDispatcher statemachineEventDispatcher, ModelDatapool modelDatapool, AppAdapterListItemControlManager appAdapterListItemControlManager) {
        super(appDefinition, statemachineEventDispatcher, modelDatapool, appAdapterListItemControlManager);
    }

    @Override
    protected void onDatapoolUpdate(ModelApiUpEvent modelApiUpEvent) {
        int n = modelApiUpEvent.getActionId();
        switch (n) {
            case 0: {
                this.modelDatapool.setBoolean(-554106880, modelApiUpEvent.getBoolean(0));
                break;
            }
            case 1: {
                this.modelDatapool.setInteger(630784000, modelApiUpEvent.getInt(0));
                break;
            }
            case 2: {
                this.modelDatapool.setInteger(-1316159488, modelApiUpEvent.getInt(0));
                break;
            }
            case 3: {
                this.modelDatapool.setBoolean(1827405824, modelApiUpEvent.getBoolean(0));
                this.modelDatapool.setBoolean(-1987706880, modelApiUpEvent.getBoolean(1));
                this.modelDatapool.setBoolean(992411904, modelApiUpEvent.getBoolean(2));
                this.modelDatapool.setBoolean(-68288512, modelApiUpEvent.getBoolean(3));
                break;
            }
            case 4: {
                this.modelDatapool.setIntegerVector(12690, (int[])modelApiUpEvent.getObject(0));
                this.modelDatapool.setIntegerVector(1039925248, (int[])modelApiUpEvent.getObject(2));
                break;
            }
            case 5: {
                this.modelDatapool.setIntegerVector(-1410072576, (int[])modelApiUpEvent.getObject(0));
                this.modelDatapool.setIntegerVector(-843120640, (int[])modelApiUpEvent.getObject(2));
                break;
            }
            case 6: {
                this.modelDatapool.setIntegerVector(16807, (int[])modelApiUpEvent.getObject(0));
                this.modelDatapool.setIntegerVector(-897384448, (int[])modelApiUpEvent.getObject(2));
                break;
            }
            default: {
                super.onDatapoolUpdate(modelApiUpEvent);
            }
        }
    }
}

