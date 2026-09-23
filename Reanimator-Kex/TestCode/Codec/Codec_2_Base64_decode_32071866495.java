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

public class Base64_decode_32071866495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22212;
     Object term22120;
     Object term92730;
     Object term92731;
     Object term92728;

    public Base64_decode_32071866495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22212 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term22120 = (byte[]) newByteArray(0);
        term92730 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term92730, term92730.getClass(), "encodeTable", null);
        setIntField(term92730, term92730.getClass(), "lineLength", 0);
        setField(term92730, term92730.getClass(), "lineSeparator", null);
        setIntField(term92730, term92730.getClass(), "decodeSize", 0);
        setIntField(term92730, term92730.getClass(), "encodeSize", 0);
        setField(term92730, term92730.getClass(), "buf", null);
        setIntField(term92730, term92730.getClass(), "pos", 0);
        setIntField(term92730, term92730.getClass(), "readPos", 0);
        setIntField(term92730, term92730.getClass(), "currentLinePos", 0);
        setIntField(term92730, term92730.getClass(), "modulus", 0);
        setBooleanField(term92730, term92730.getClass(), "eof", false);
        setIntField(term92730, term92730.getClass(), "x", 0);
        term92731 = (byte[]) newByteArray(0);
        term92728 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22120;
        Object retValue = callMethod(klass, "decode", argTypes, term22212, args);
        assertTrue(recursiveEquals(term22212, term92730));
        assertTrue(recursiveEquals(term22120, term92731));
        assertTrue(recursiveEquals(retValue, term92728));
    }

};


