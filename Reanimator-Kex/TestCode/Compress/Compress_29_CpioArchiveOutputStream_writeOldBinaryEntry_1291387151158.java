package org.apache.commons.compress.archivers.cpio;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveOutputStream_writeOldBinaryEntry_1291387151158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67587;
     Object term67849;

    public CpioArchiveOutputStream_writeOldBinaryEntry_1291387151158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67587 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term67725 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setLongField(term67587, term67587.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term67587, term67587.getClass(), "out", term67725);
        term67849 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term67849, term67849.getClass(), "inode", 94646012458565632L);
        setShortField(term67849, term67849.getClass(), "fileFormat", (short) -32764);
        setLongField(term67849, term67849.getClass(), "min", 18350521712641L);
        setField(term67849, term67849.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term67849;
        args[1] = false;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term67587, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


