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

public class Base64_decode_182478305283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12872;
     Object term15087;

    public Base64_decode_182478305283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12872 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setBooleanField(term12872, term12872.getClass(), "eof", true);
        term15087 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setField(term15087, term15087.getClass(), "encodeTable", null);
        setIntField(term15087, term15087.getClass(), "lineLength", 0);
        setField(term15087, term15087.getClass(), "lineSeparator", null);
        setIntField(term15087, term15087.getClass(), "decodeSize", 0);
        setIntField(term15087, term15087.getClass(), "encodeSize", 0);
        setField(term15087, term15087.getClass(), "buffer", null);
        setIntField(term15087, term15087.getClass(), "pos", 0);
        setIntField(term15087, term15087.getClass(), "readPos", 0);
        setIntField(term15087, term15087.getClass(), "currentLinePos", 0);
        setIntField(term15087, term15087.getClass(), "modulus", 0);
        setBooleanField(term15087, term15087.getClass(), "eof", true);
        setIntField(term15087, term15087.getClass(), "x", 0);
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
        callMethod(klass, "decode", argTypes, term12872, args);
        assertTrue(recursiveEquals(term12872, term15087));
    }

};


