package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_write_1643250680175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131746;

    public TarArchiveOutputStream_write_1643250680175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131746 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term131574 = (byte[]) newByteArray(0);
        Object term131854 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term131952 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        setLongField(term131746, term131746.getClass(), "currBytes", -1087619312021602566L);
        setLongField(term131746, term131746.getClass(), "currSize", 1087619310410932487L);
        setIntField(term131746, term131746.getClass(), "assemLen", 0);
        setField(term131746, term131746.getClass(), "recordBuf", term131574);
        setField(term131854, term131854.getClass(), "outStream", null);
        setField(term131854, term131854.getClass(), "inStream", term131952);
        setField(term131746, term131746.getClass(), "buffer", term131854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 1022;
        try {
            callMethod(klass, "write", argTypes, term131746, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


