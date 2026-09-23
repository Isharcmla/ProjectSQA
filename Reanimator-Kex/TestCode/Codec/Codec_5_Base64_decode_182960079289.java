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

public class Base64_decode_182960079289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33306;
     Object term29065;

    public Base64_decode_182960079289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33306 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term33306, term33306.getClass(), "buffer", null);
        setIntField(term33306, term33306.getClass(), "pos", 0);
        setIntField(term33306, term33306.getClass(), "readPos", 0);
        setIntField(term33306, term33306.getClass(), "currentLinePos", 0);
        setIntField(term33306, term33306.getClass(), "modulus", 0);
        setBooleanField(term33306, term33306.getClass(), "eof", false);
        setIntField(term33306, term33306.getClass(), "decodeSize", 489);
        term29065 = (byte[]) newByteArray(652);
        setByteElement(term29065, 0, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term29065;
        callMethod(klass, "decode", argTypes, term33306, args);
    }

};


