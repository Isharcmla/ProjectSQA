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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CpioArchiveOutputStream_writeOldBinaryEntry_1291387151166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72059;
     Object term72249;

    public CpioArchiveOutputStream_writeOldBinaryEntry_1291387151166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72059 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term72125 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setLongField(term72059, term72059.getClass(), "nextArtificalDeviceAndInode", 0L);
        setField(term72059, term72059.getClass(), "out", term72125);
        term72249 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term72249, term72249.getClass(), "inode", 0L);
        setShortField(term72249, term72249.getClass(), "fileFormat", (short) 4);
        setLongField(term72249, term72249.getClass(), "min", 0L);
        setField(term72249, term72249.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72249;
        args[1] = false;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term72059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


