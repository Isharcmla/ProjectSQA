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

public class Base64_readResults_183263774294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15361;
     Object term45132;

    public Base64_readResults_183263774294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15361 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term15361, term15361.getClass(), "buffer", null);
        term45132 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term45132, term45132.getClass(), "encodeTable", null);
        setIntField(term45132, term45132.getClass(), "lineLength", 0);
        setField(term45132, term45132.getClass(), "lineSeparator", null);
        setIntField(term45132, term45132.getClass(), "decodeSize", 0);
        setIntField(term45132, term45132.getClass(), "encodeSize", 0);
        setField(term45132, term45132.getClass(), "buffer", null);
        setIntField(term45132, term45132.getClass(), "pos", 0);
        setIntField(term45132, term45132.getClass(), "readPos", 0);
        setIntField(term45132, term45132.getClass(), "currentLinePos", 0);
        setIntField(term45132, term45132.getClass(), "modulus", 0);
        setBooleanField(term45132, term45132.getClass(), "eof", false);
        setIntField(term45132, term45132.getClass(), "x", 0);
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
        args[2] = 0;
        Object retValue = callMethod(klass, "readResults", argTypes, term15361, args);
        assertTrue(recursiveEquals(term15361, term45132));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


