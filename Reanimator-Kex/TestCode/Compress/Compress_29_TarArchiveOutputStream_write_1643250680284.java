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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_write_1643250680284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165649;
     Object term165462;

    public TarArchiveOutputStream_write_1643250680284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165649 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term165469 = (byte[]) newByteArray(0);
        Object term165723 = newInstance(Class.forName("java.util.zip.DeflaterOutputStream"));
        setBooleanField(term165649, term165649.getClass(), "haveUnclosedEntry", true);
        setLongField(term165649, term165649.getClass(), "currBytes", -2323045968174928901L);
        setLongField(term165649, term165649.getClass(), "currSize", 2316259782401986566L);
        setIntField(term165649, term165649.getClass(), "assemLen", 0);
        setField(term165649, term165649.getClass(), "recordBuf", term165469);
        setIntField(term165649, term165649.getClass(), "recordSize", 0);
        setField(term165649, term165649.getClass(), "out", term165723);
        term165462 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term165462;
        args[1] = 0;
        args[2] = 1022;
        callMethod(klass, "write", argTypes, term165649, args);
    }

};


