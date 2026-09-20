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
import static org.apache.commons.compress.archivers.cpio.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.cpio.EqualityUtils.*;
import java.util.HashMap;
import java.lang.Object;

public class CpioArchiveOutputStream_init_53926348220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1462;

    public CpioArchiveOutputStream_init_53926348220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1463 = new HashMap();
        term1462 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1464 = newInstance(Class.forName("java.io.FilterOutputStream"));
        Object term1465 = newInstance(Class.forName("java.lang.Object"));
        setField(term1462, term1462.getClass(), "cpioEntry", null);
        setBooleanField(term1462, term1462.getClass(), "closed", false);
        setBooleanField(term1462, term1462.getClass(), "finished", false);
        setShortField(term1462, term1462.getClass(), "entryFormat", (short) 1);
        setField(term1462, term1462.getClass(), "names", term1463);
        setLongField(term1462, term1462.getClass(), "crc", 0L);
        setLongField(term1462, term1462.getClass(), "written", 0L);
        setField(term1464, term1464.getClass(), "out", null);
        setBooleanField(term1464, term1464.getClass(), "closed", false);
        setField(term1464, term1464.getClass(), "closeLock", term1465);
        setField(term1462, term1462.getClass(), "out", term1464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1462));
    }

};
