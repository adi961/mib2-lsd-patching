/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.asl.internal.speechnavigation.usecase.application;

import de.vw.mib.asl.framework.internal.framework.ServiceManager;
import de.vw.mib.asl.internal.speechnavigation.usecase.application.ApplicationVariant;

public class ApplicationVariantImpl
implements ApplicationVariant {
    @Override
    public boolean isCHNVariant() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(112) && !ServiceManager.configManagerDiag.isFeatureFlagSet(169);
    }

    @Override
    public boolean isNARVariant() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(141);
    }

    @Override
    public boolean isEUVariant() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(123);
    }

    @Override
    public boolean isJPNVariant() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(126);
    }

    @Override
    public boolean isTWNVariant() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(169);
    }

    @Override
    public boolean isKORVariant() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(139);
    }

    @Override
    public boolean isOneshotAvailable() {
        return ServiceManager.configManagerDiag.isFeatureFlagSet(639);
    }
}

