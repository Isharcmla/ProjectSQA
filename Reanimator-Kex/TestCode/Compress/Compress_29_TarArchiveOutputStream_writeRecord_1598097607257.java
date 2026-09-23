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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_writeRecord_1598097607257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146415;
     Object term146262;

    public TarArchiveOutputStream_writeRecord_1598097607257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146415 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term146491 = newInstance(Class.forName("org.tukaani.xz.CountingOutputStream"));
        setIntField(term146415, term146415.getClass(), "recordSize", 0);
        setField(term146415, term146415.getClass(), "out", term146491);
        term146262 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term146262;
        try {
            callMethod(klass, "writeRecord", argTypes, term146415, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


