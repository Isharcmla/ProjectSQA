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

public class Base64_decode_1981855093125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162203;

    public Base64_decode_1981855093125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162203 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term162203, term162203.getClass(), "buffer", null);
        setIntField(term162203, term162203.getClass(), "pos", 0);
        setIntField(term162203, term162203.getClass(), "readPos", 0);
        setIntField(term162203, term162203.getClass(), "currentLinePos", 0);
        setIntField(term162203, term162203.getClass(), "modulus", 0);
        setBooleanField(term162203, term162203.getClass(), "eof", false);
        setIntField(term162203, term162203.getClass(), "decodeSize", 255);
        setIntField(term162203, term162203.getClass(), "x", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        callMethod(klass, "decode", argTypes, term162203, args);
    }

};


