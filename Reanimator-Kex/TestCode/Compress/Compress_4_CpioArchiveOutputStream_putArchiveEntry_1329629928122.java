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

public class CpioArchiveOutputStream_putArchiveEntry_1329629928122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37788;

    public CpioArchiveOutputStream_putArchiveEntry_1329629928122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37788 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term37912 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveEntry"));
        setBooleanField(term37788, term37788.getClass(), "closed", false);
        setLongField(term37912, term37912.getClass(), "filesize", 0L);
        setIntField(term37912, term37912.getClass(), "alignmentBoundary", 0);
        setShortField(term37912, term37912.getClass(), "fileFormat", (short) 2);
        setLongField(term37912, term37912.getClass(), "chksum", 261120L);
        setField(term37788, term37788.getClass(), "entry", term37912);
        setLongField(term37788, term37788.getClass(), "written", 0L);
        setLongField(term37788, term37788.getClass(), "crc", -261121L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term37788, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


