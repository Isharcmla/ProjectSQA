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
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Base64_encodeToString_21127767197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67356;
     Object term67257;

    public Base64_encodeToString_21127767197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67356 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term67356, term67356.getClass(), "buffer", null);
        setIntField(term67356, term67356.getClass(), "pos", 0);
        setIntField(term67356, term67356.getClass(), "readPos", 0);
        setIntField(term67356, term67356.getClass(), "currentLinePos", 0);
        setIntField(term67356, term67356.getClass(), "modulus", 0);
        setBooleanField(term67356, term67356.getClass(), "eof", false);
        term67257 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term67257;
        callMethod(klass, "encodeToString", argTypes, term67356, args);
    }

};


