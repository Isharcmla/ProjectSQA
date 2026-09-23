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

public class Base64_decode_1829600792115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72798;
     Object term65546;
     Object term138601;
     Object term138602;
     Object term138600;

    public Base64_decode_1829600792115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72798 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term72798, term72798.getClass(), "buffer", null);
        setIntField(term72798, term72798.getClass(), "pos", 0);
        setIntField(term72798, term72798.getClass(), "readPos", 0);
        setIntField(term72798, term72798.getClass(), "currentLinePos", 0);
        setIntField(term72798, term72798.getClass(), "modulus", 0);
        setBooleanField(term72798, term72798.getClass(), "eof", false);
        setIntField(term72798, term72798.getClass(), "decodeSize", 491);
        setIntField(term72798, term72798.getClass(), "x", 0);
        term65546 = (byte[]) newByteArray(655);
        setByteElement(term65546, 0, (byte) -128);
        term138601 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term138601, term138601.getClass(), "encodeTable", null);
        setIntField(term138601, term138601.getClass(), "lineLength", 0);
        setField(term138601, term138601.getClass(), "lineSeparator", null);
        setIntField(term138601, term138601.getClass(), "decodeSize", 491);
        setIntField(term138601, term138601.getClass(), "encodeSize", 0);
        setField(term138601, term138601.getClass(), "buffer", null);
        setIntField(term138601, term138601.getClass(), "pos", 0);
        setIntField(term138601, term138601.getClass(), "readPos", 0);
        setIntField(term138601, term138601.getClass(), "currentLinePos", 0);
        setIntField(term138601, term138601.getClass(), "modulus", 0);
        setBooleanField(term138601, term138601.getClass(), "eof", true);
        setIntField(term138601, term138601.getClass(), "x", 0);
        term138602 = (byte[]) newByteArray(655);
        setByteElement(term138602, 0, (byte) -128);
        term138600 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term65546;
        Object retValue = callMethod(klass, "decode", argTypes, term72798, args);
        assertTrue(recursiveEquals(term72798, term138601));
        assertTrue(recursiveEquals(term65546, term138602));
        assertTrue(recursiveEquals(retValue, term138600));
    }

};


