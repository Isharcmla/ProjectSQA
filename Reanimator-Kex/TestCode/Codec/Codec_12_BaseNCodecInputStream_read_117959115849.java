package org.apache.commons.codec.binary;

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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseNCodecInputStream_read_117959115849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36202;
     Object term35058;

    public BaseNCodecInputStream_read_117959115849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36202 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        Object term36284 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setField(term36202, term36202.getClass(), "baseNCodec", term36284);
        term35058 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term35058;
        args[1] = 253;
        args[2] = 2147483523;
        try {
            callMethod(klass, "read", argTypes, term36202, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


