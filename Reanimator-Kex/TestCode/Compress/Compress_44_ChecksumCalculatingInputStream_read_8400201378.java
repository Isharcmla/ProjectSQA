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

public class ChecksumCalculatingInputStream_read_8400201378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;

    public ChecksumCalculatingInputStream_read_8400201378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        setField(term2, term2.getClass(), "in", null);
        setField(term2, term2.getClass(), "checksum", null);
        term3 = (byte[]) newByteArray(5);
        setByteElement(term3, 0, (byte) 47);
        setByteElement(term3, 1, (byte) 48);
        setByteElement(term3, 2, (byte) 89);
        setByteElement(term3, 3, (byte) 75);
        setByteElement(term3, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3;
        try {
            callMethod(klass, "read", argTypes, term2, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


