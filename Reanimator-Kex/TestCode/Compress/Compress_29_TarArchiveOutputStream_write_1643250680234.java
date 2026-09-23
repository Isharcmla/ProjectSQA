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

public class TarArchiveOutputStream_write_1643250680234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133823;
     Object term133640;

    public TarArchiveOutputStream_write_1643250680234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133823 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term133647 = (byte[]) newByteArray(0);
        Object term133957 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term133823, term133823.getClass(), "haveUnclosedEntry", true);
        setLongField(term133823, term133823.getClass(), "currBytes", -2287828610972304411L);
        setLongField(term133823, term133823.getClass(), "currSize", 2287828610972287004L);
        setIntField(term133823, term133823.getClass(), "assemLen", 0);
        setField(term133823, term133823.getClass(), "recordBuf", term133647);
        setIntField(term133823, term133823.getClass(), "recordSize", 0);
        setField(term133823, term133823.getClass(), "out", term133957);
        term133640 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term133640;
        args[1] = 0;
        args[2] = 1022;
        try {
            callMethod(klass, "write", argTypes, term133823, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


