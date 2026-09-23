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
import java.util.zip.ZipException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveOutputStream_writeOldBinaryEntry_1291387151156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109962;
     Object term110150;

    public CpioArchiveOutputStream_writeOldBinaryEntry_1291387151156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109962 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term110026 = newInstance(Class.forName("java.util.jar.JarOutputStream"));
        setField(term109962, term109962.getClass(), "out", term110026);
        term110150 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setShortField(term110150, term110150.getClass(), "fileFormat", (short) 4);
        setLongField(term110150, term110150.getClass(), "min", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term110150;
        args[1] = false;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term109962, args);
            assertTrue(false);
        }
        catch (ZipException e) {
        }

    }

};


