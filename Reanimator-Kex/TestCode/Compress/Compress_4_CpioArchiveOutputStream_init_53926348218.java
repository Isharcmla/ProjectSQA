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

public class CpioArchiveOutputStream_init_53926348218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1698;

    public CpioArchiveOutputStream_init_53926348218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1699 = new HashMap();
        term1698 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        Object term1700 = newInstance(Class.forName("java.io.FilterOutputStream"));
        Object term1701 = newInstance(Class.forName("java.lang.Object"));
        byte[] term1702 = (byte[]) newByteArray(1);
        setField(term1698, term1698.getClass(), "entry", null);
        setBooleanField(term1698, term1698.getClass(), "closed", false);
        setBooleanField(term1698, term1698.getClass(), "finished", false);
        setShortField(term1698, term1698.getClass(), "entryFormat", (short) 1);
        setField(term1698, term1698.getClass(), "names", term1699);
        setLongField(term1698, term1698.getClass(), "crc", 0L);
        setLongField(term1698, term1698.getClass(), "written", 0L);
        setField(term1700, term1700.getClass(), "out", null);
        setBooleanField(term1700, term1700.getClass(), "closed", false);
        setField(term1700, term1700.getClass(), "closeLock", term1701);
        setField(term1698, term1698.getClass(), "out", term1700);
        setField(term1698, term1698.getClass(), "oneByte", term1702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1698));
    }

};


