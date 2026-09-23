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

public class Base64_encode_1461127536109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30107;
     Object term30015;
     Object term125085;
     Object term125086;
     Object term125083;

    public Base64_encode_1461127536109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30107 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term30015 = (byte[]) newByteArray(0);
        term125085 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term125085, term125085.getClass(), "encodeTable", null);
        setIntField(term125085, term125085.getClass(), "lineLength", 0);
        setField(term125085, term125085.getClass(), "lineSeparator", null);
        setIntField(term125085, term125085.getClass(), "decodeSize", 0);
        setIntField(term125085, term125085.getClass(), "encodeSize", 0);
        setField(term125085, term125085.getClass(), "buffer", null);
        setIntField(term125085, term125085.getClass(), "pos", 0);
        setIntField(term125085, term125085.getClass(), "readPos", 0);
        setIntField(term125085, term125085.getClass(), "currentLinePos", 0);
        setIntField(term125085, term125085.getClass(), "modulus", 0);
        setBooleanField(term125085, term125085.getClass(), "eof", false);
        setIntField(term125085, term125085.getClass(), "x", 0);
        term125086 = (byte[]) newByteArray(0);
        term125083 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30015;
        Object retValue = callMethod(klass, "encode", argTypes, term30107, args);
        assertTrue(recursiveEquals(term30107, term125085));
        assertTrue(recursiveEquals(term30015, term125086));
        assertTrue(recursiveEquals(retValue, term125083));
    }

};


