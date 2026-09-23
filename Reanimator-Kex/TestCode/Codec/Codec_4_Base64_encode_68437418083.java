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

public class Base64_encode_68437418083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31837;

    public Base64_encode_68437418083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31837 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term31730 = (byte[]) newByteArray(0);
        setBooleanField(term31837, term31837.getClass(), "eof", false);
        setField(term31837, term31837.getClass(), "buffer", term31730);
        setIntField(term31837, term31837.getClass(), "pos", -2147483648);
        setIntField(term31837, term31837.getClass(), "encodeSize", -2147483648);
        setIntField(term31837, term31837.getClass(), "modulus", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = -1;
        try {
            callMethod(klass, "encode", argTypes, term31837, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


