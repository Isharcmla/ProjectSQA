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

public class Base64_setInitialBuffer_166773615266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10150;
     Object term10054;
     Object term12247;
     Object term12249;

    public Base64_setInitialBuffer_166773615266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10150 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        term10054 = (byte[]) newByteArray(0);
        term12247 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term12248 = (byte[]) newByteArray(0);
        setField(term12247, term12247.getClass(), "encodeTable", null);
        setIntField(term12247, term12247.getClass(), "lineLength", 0);
        setField(term12247, term12247.getClass(), "lineSeparator", null);
        setIntField(term12247, term12247.getClass(), "decodeSize", 0);
        setIntField(term12247, term12247.getClass(), "encodeSize", 0);
        setField(term12247, term12247.getClass(), "buf", term12248);
        setIntField(term12247, term12247.getClass(), "pos", 0);
        setIntField(term12247, term12247.getClass(), "readPos", 0);
        setIntField(term12247, term12247.getClass(), "currentLinePos", 0);
        setIntField(term12247, term12247.getClass(), "modulus", 0);
        setBooleanField(term12247, term12247.getClass(), "eof", false);
        setIntField(term12247, term12247.getClass(), "x", 0);
        term12249 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term10054;
        args[1] = 0;
        args[2] = 0;
        callMethod(klass, "setInitialBuffer", argTypes, term10150, args);
        assertTrue(recursiveEquals(term10150, term12247));
        assertTrue(recursiveEquals(term10054, term12249));
    }

};


