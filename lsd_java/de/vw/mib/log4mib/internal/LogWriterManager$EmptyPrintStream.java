/*
 * Decompiled with CFR 0.152.
 */
package de.vw.mib.log4mib.internal;

import de.vw.mib.log4mib.internal.LogWriterManager$EmptyPrintStream$1;
import java.io.PrintStream;

class LogWriterManager$EmptyPrintStream
extends PrintStream {
    LogWriterManager$EmptyPrintStream() {
        super(new LogWriterManager$EmptyPrintStream$1());
    }
}

