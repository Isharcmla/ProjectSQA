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

public class Base64_encodeToString_211277671119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110131;
     Object term109966;

    public Base64_encodeToString_211277671119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110131 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term110131, term110131.getClass(), "buffer", null);
        setIntField(term110131, term110131.getClass(), "pos", 0);
        setIntField(term110131, term110131.getClass(), "readPos", 0);
        setIntField(term110131, term110131.getClass(), "currentLinePos", 0);
        setIntField(term110131, term110131.getClass(), "modulus", 0);
        setBooleanField(term110131, term110131.getClass(), "eof", false);
        setIntField(term110131, term110131.getClass(), "lineLength", -2147483647);
        setField(term110131, term110131.getClass(), "lineSeparator", null);
        setIntField(term110131, term110131.getClass(), "encodeSize", 4);
        term109966 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term109966;
        try {
            callMethod(klass, "encodeToString", argTypes, term110131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


