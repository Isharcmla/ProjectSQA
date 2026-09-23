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

public class Base64_decode_1981855093134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79821;
     Object term221509;
     Object term221508;

    public Base64_decode_1981855093134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79821 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term79821, term79821.getClass(), "buffer", null);
        setIntField(term79821, term79821.getClass(), "pos", 0);
        setIntField(term79821, term79821.getClass(), "readPos", 0);
        setIntField(term79821, term79821.getClass(), "currentLinePos", 0);
        setIntField(term79821, term79821.getClass(), "modulus", 0);
        setBooleanField(term79821, term79821.getClass(), "eof", false);
        setIntField(term79821, term79821.getClass(), "decodeSize", 511);
        setIntField(term79821, term79821.getClass(), "x", 0);
        term221509 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term221509, term221509.getClass(), "encodeTable", null);
        setIntField(term221509, term221509.getClass(), "lineLength", 0);
        setField(term221509, term221509.getClass(), "lineSeparator", null);
        setIntField(term221509, term221509.getClass(), "decodeSize", 511);
        setIntField(term221509, term221509.getClass(), "encodeSize", 0);
        setField(term221509, term221509.getClass(), "buffer", null);
        setIntField(term221509, term221509.getClass(), "pos", 0);
        setIntField(term221509, term221509.getClass(), "readPos", 0);
        setIntField(term221509, term221509.getClass(), "currentLinePos", 0);
        setIntField(term221509, term221509.getClass(), "modulus", 0);
        setBooleanField(term221509, term221509.getClass(), "eof", false);
        setIntField(term221509, term221509.getClass(), "x", 0);
        term221508 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        Object retValue = callMethod(klass, "decode", argTypes, term79821, args);
        assertTrue(recursiveEquals(term79821, term221509));
        assertTrue(recursiveEquals(retValue, term221508));
    }

};


