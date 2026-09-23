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
import static org.apache.commons.codec.binary.EqualityUtils.*;

public class Base64_encode_684374180100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60426;
     Object term64751;

    public Base64_encode_684374180100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60426 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term60320 = (byte[]) newByteArray(0);
        setBooleanField(term60426, term60426.getClass(), "eof", false);
        setField(term60426, term60426.getClass(), "buffer", term60320);
        setIntField(term60426, term60426.getClass(), "pos", -2147483648);
        setIntField(term60426, term60426.getClass(), "encodeSize", -2147483647);
        term64751 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term64752 = (byte[]) newByteArray(0);
        setField(term64751, term64751.getClass(), "encodeTable", null);
        setIntField(term64751, term64751.getClass(), "lineLength", 0);
        setField(term64751, term64751.getClass(), "lineSeparator", null);
        setIntField(term64751, term64751.getClass(), "decodeSize", 0);
        setIntField(term64751, term64751.getClass(), "encodeSize", -2147483647);
        setField(term64751, term64751.getClass(), "buffer", term64752);
        setIntField(term64751, term64751.getClass(), "pos", -2147483648);
        setIntField(term64751, term64751.getClass(), "readPos", 0);
        setIntField(term64751, term64751.getClass(), "currentLinePos", 0);
        setIntField(term64751, term64751.getClass(), "modulus", 0);
        setBooleanField(term64751, term64751.getClass(), "eof", true);
        setIntField(term64751, term64751.getClass(), "x", 0);
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
        callMethod(klass, "encode", argTypes, term60426, args);
        assertTrue(recursiveEquals(term60426, term64751));
    }

};


