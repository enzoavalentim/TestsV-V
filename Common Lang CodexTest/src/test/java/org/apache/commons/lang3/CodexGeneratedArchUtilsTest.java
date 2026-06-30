package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.apache.commons.lang3.arch.Processor;
import org.junit.jupiter.api.Test;

class CodexGeneratedArchUtilsTest {

    @Test
    void mapsKnownX86Aliases() {
        final Processor x86 = ArchUtils.getProcessor("i386");
        final Processor x64 = ArchUtils.getProcessor("amd64");

        assertEquals(Processor.Arch.BIT_32, x86.getArch());
        assertEquals(Processor.Type.X86, x86.getType());
        assertEquals(Processor.Arch.BIT_64, x64.getArch());
        assertEquals(Processor.Type.X86, x64.getType());
    }

    @Test
    void mapsPowerPcArmAndRiscVAliases() {
        assertEquals(Processor.Type.PPC, ArchUtils.getProcessor("powerpc64").getType());
        assertEquals(Processor.Arch.BIT_64, ArchUtils.getProcessor("aarch64").getArch());
        assertEquals(Processor.Type.RISC_V, ArchUtils.getProcessor("riscv32").getType());
    }

    @Test
    void unknownArchitectureReturnsNullAndCurrentProcessorLookupIsSafe() {
        assertNull(ArchUtils.getProcessor("not-a-real-architecture"));
        assertNull(ArchUtils.getProcessor(null));
        assertNotNull(new ArchUtils());
        ArchUtils.getProcessor();
    }
}
