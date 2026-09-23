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

public class Base64_decode_1981855093113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63383;
     Object term132654;
     Object term132653;

    public Base64_decode_1981855093113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63383 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term63383, term63383.getClass(), "buffer", null);
        setIntField(term63383, term63383.getClass(), "pos", 0);
        setIntField(term63383, term63383.getClass(), "readPos", 0);
        setIntField(term63383, term63383.getClass(), "currentLinePos", 0);
        setIntField(term63383, term63383.getClass(), "modulus", 0);
        setBooleanField(term63383, term63383.getClass(), "eof", false);
        setIntField(term63383, term63383.getClass(), "decodeSize", 490);
        setIntField(term63383, term63383.getClass(), "x", 0);
        term132654 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term132654, term132654.getClass(), "encodeTable", null);
        setIntField(term132654, term132654.getClass(), "lineLength", 0);
        setField(term132654, term132654.getClass(), "lineSeparator", null);
        setIntField(term132654, term132654.getClass(), "decodeSize", 490);
        setIntField(term132654, term132654.getClass(), "encodeSize", 0);
        setField(term132654, term132654.getClass(), "buffer", null);
        setIntField(term132654, term132654.getClass(), "pos", 0);
        setIntField(term132654, term132654.getClass(), "readPos", 0);
        setIntField(term132654, term132654.getClass(), "currentLinePos", 0);
        setIntField(term132654, term132654.getClass(), "modulus", 0);
        setBooleanField(term132654, term132654.getClass(), "eof", false);
        setIntField(term132654, term132654.getClass(), "x", 0);
        term132653 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "decode", argTypes, term63383, args);
        assertTrue(recursiveEquals(term63383, term132654));
        assertTrue(recursiveEquals(retValue, term132653));
    }

};


