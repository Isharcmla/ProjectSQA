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

public class CpioArchiveOutputStream_writeOldBinaryEntry_1291387151127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52168;
     Object term52292;

    public CpioArchiveOutputStream_writeOldBinaryEntry_1291387151127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52168 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        term52292 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setLongField(term52292, term52292.getClass(), "inode", 16384L);
        setShortField(term52292, term52292.getClass(), "fileFormat", (short) 4);
        setLongField(term52292, term52292.getClass(), "min", 0L);
        setField(term52292, term52292.getClass(), "name", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term52292;
        args[1] = false;
        try {
            callMethod(klass, "writeOldBinaryEntry", argTypes, term52168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


