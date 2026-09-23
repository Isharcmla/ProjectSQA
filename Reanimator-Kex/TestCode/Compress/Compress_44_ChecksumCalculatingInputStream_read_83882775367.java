package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChecksumCalculatingInputStream_read_83882775367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14264;

    public ChecksumCalculatingInputStream_read_83882775367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14264 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term14398 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term14532 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term14686 = newInstance(Class.forName("org.apache.commons.compress.compressors.brotli.BrotliCompressorInputStream"));
        setField(term14532, term14532.getClass(), "in", term14686);
        setField(term14398, term14398.getClass(), "in", term14532);
        setField(term14264, term14264.getClass(), "in", term14398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        try {
            callMethod(klass, "read", argTypes, term14264, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


