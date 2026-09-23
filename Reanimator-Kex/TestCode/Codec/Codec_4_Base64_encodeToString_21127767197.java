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

public class Base64_encodeToString_21127767197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52371;
     Object term49148;

    public Base64_encodeToString_21127767197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52371 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term49157 = (byte[]) newByteArray(760);
        setField(term52371, term52371.getClass(), "buffer", null);
        setIntField(term52371, term52371.getClass(), "pos", 0);
        setIntField(term52371, term52371.getClass(), "readPos", 0);
        setIntField(term52371, term52371.getClass(), "currentLinePos", 0);
        setIntField(term52371, term52371.getClass(), "modulus", 0);
        setBooleanField(term52371, term52371.getClass(), "eof", false);
        setIntField(term52371, term52371.getClass(), "lineLength", 212893681);
        setField(term52371, term52371.getClass(), "lineSeparator", term49157);
        setIntField(term52371, term52371.getClass(), "encodeSize", 765);
        term49148 = (byte[]) newByteArray(2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term49148;
        try {
            callMethod(klass, "encodeToString", argTypes, term52371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


