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

public class Base64_encodeToString_21127767191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37454;
     Object term36309;

    public Base64_encodeToString_21127767191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37454 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term36309 = (byte[]) newByteArray(512);
        setField(term37454, term37454.getClass(), "buffer", term36309);
        setIntField(term37454, term37454.getClass(), "pos", 0);
        setIntField(term37454, term37454.getClass(), "readPos", 0);
        setIntField(term37454, term37454.getClass(), "currentLinePos", 0);
        setIntField(term37454, term37454.getClass(), "modulus", 0);
        setBooleanField(term37454, term37454.getClass(), "eof", false);
        setIntField(term37454, term37454.getClass(), "lineLength", 2);
        setField(term37454, term37454.getClass(), "lineSeparator", term36309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term36309;
        try {
            callMethod(klass, "encodeToString", argTypes, term37454, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


