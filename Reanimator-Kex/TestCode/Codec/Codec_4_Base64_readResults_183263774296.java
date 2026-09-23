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

public class Base64_readResults_183263774296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49146;
     Object term53149;

    public Base64_readResults_183263774296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49146 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term49146, term49146.getClass(), "buffer", null);
        term53149 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term53149, term53149.getClass(), "encodeTable", null);
        setIntField(term53149, term53149.getClass(), "lineLength", 0);
        setField(term53149, term53149.getClass(), "lineSeparator", null);
        setIntField(term53149, term53149.getClass(), "decodeSize", 0);
        setIntField(term53149, term53149.getClass(), "encodeSize", 0);
        setField(term53149, term53149.getClass(), "buffer", null);
        setIntField(term53149, term53149.getClass(), "pos", 0);
        setIntField(term53149, term53149.getClass(), "readPos", 0);
        setIntField(term53149, term53149.getClass(), "currentLinePos", 0);
        setIntField(term53149, term53149.getClass(), "modulus", 0);
        setBooleanField(term53149, term53149.getClass(), "eof", false);
        setIntField(term53149, term53149.getClass(), "x", 0);
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
        Object retValue = callMethod(klass, "readResults", argTypes, term49146, args);
        assertTrue(recursiveEquals(term49146, term53149));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


