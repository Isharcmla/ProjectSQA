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

public class CpioArchiveOutputStream_createArchiveEntry_607161034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5924;

    public CpioArchiveOutputStream_createArchiveEntry_607161034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5924 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term5924, term5924.getClass(), "entry", null);
        setBooleanField(term5924, term5924.getClass(), "closed", false);
        setBooleanField(term5924, term5924.getClass(), "finished", false);
        setShortField(term5924, term5924.getClass(), "entryFormat", (short) 0);
        setField(term5924, term5924.getClass(), "names", null);
        setLongField(term5924, term5924.getClass(), "crc", 0L);
        setLongField(term5924, term5924.getClass(), "written", 0L);
        setField(term5924, term5924.getClass(), "out", null);
        setField(term5924, term5924.getClass(), "oneByte", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "createArchiveEntry", argTypes, term5924, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


