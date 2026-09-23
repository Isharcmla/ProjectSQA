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

public class Base32_decode_1987425317467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018869;
     Object term1018975;

    public Base32_decode_1987425317467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1018869 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setIntField(term1018869, term1018869.getClass(), "decodeSize", 0);
        term1018975 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context"));
        byte[] term1018763 = (byte[]) newByteArray(0);
        setBooleanField(term1018975, term1018975.getClass(), "eof", false);
        setIntField(term1018975, term1018975.getClass(), "modulus", 2);
        setField(term1018975, term1018975.getClass(), "buffer", term1018763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.apache.commons.codec.binary.BaseNCodec$Context");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = 0;
        args[2] = -2147483648;
        args[3] = term1018975;
        callMethod(klass, "decode", argTypes, term1018869, args);
    }

};


