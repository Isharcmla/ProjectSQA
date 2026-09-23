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

public class Base64_decode_1829600792108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30009;
     Object term27800;
     Object term125058;
     Object term125059;
     Object term125057;

    public Base64_decode_1829600792108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30009 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term30009, term30009.getClass(), "buffer", null);
        setIntField(term30009, term30009.getClass(), "pos", 0);
        setIntField(term30009, term30009.getClass(), "readPos", 0);
        setIntField(term30009, term30009.getClass(), "currentLinePos", 0);
        setIntField(term30009, term30009.getClass(), "modulus", 0);
        setBooleanField(term30009, term30009.getClass(), "eof", false);
        setIntField(term30009, term30009.getClass(), "decodeSize", 3);
        setIntField(term30009, term30009.getClass(), "x", 0);
        term27800 = (byte[]) newByteArray(4);
        setByteElement(term27800, 0, (byte) -128);
        setByteElement(term27800, 3, (byte) -128);
        term125058 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term125058, term125058.getClass(), "encodeTable", null);
        setIntField(term125058, term125058.getClass(), "lineLength", 0);
        setField(term125058, term125058.getClass(), "lineSeparator", null);
        setIntField(term125058, term125058.getClass(), "decodeSize", 3);
        setIntField(term125058, term125058.getClass(), "encodeSize", 0);
        setField(term125058, term125058.getClass(), "buffer", null);
        setIntField(term125058, term125058.getClass(), "pos", 0);
        setIntField(term125058, term125058.getClass(), "readPos", 0);
        setIntField(term125058, term125058.getClass(), "currentLinePos", 0);
        setIntField(term125058, term125058.getClass(), "modulus", 0);
        setBooleanField(term125058, term125058.getClass(), "eof", true);
        setIntField(term125058, term125058.getClass(), "x", 0);
        term125059 = (byte[]) newByteArray(4);
        setByteElement(term125059, 0, (byte) -128);
        setByteElement(term125059, 3, (byte) -128);
        term125057 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27800;
        Object retValue = callMethod(klass, "decode", argTypes, term30009, args);
        assertTrue(recursiveEquals(term30009, term125058));
        assertTrue(recursiveEquals(term27800, term125059));
        assertTrue(recursiveEquals(retValue, term125057));
    }

};


