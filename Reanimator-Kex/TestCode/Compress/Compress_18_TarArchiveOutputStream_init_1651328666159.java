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
import java.lang.ArithmeticException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_init_1651328666159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public TarArchiveOutputStream_init_1651328666159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280881 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term280710 = (byte[]) newByteArray(0);
        setField(term280881, term280881.getClass(), "oneByte", term280710);
        setLongField(term280881, term280881.getClass(), "bytesWritten", 0L);
        setIntField(term280881, term280881.getClass(), "longFileMode", 0);
        setIntField(term280881, term280881.getClass(), "bigNumberMode", 0);
        setBooleanField(term280881, term280881.getClass(), "closed", false);
        setBooleanField(term280881, term280881.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term280881, term280881.getClass(), "finished", false);
        setBooleanField(term280881, term280881.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setField(term280881, term280881.getClass(), "out", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.OutputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


