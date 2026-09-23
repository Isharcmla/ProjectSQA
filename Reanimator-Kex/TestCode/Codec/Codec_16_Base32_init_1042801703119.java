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
import java.lang.IllegalArgumentException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Base32_init_1042801703119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145934;

    public Base32_init_1042801703119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term154521 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term147418 = (byte[]) newByteArray(0);
        setByteField(term154521, term154521.getClass(), "PAD", (byte) 0);
        setIntField(term154521, term154521.getClass(), "unencodedBlockSize", 0);
        setIntField(term154521, term154521.getClass(), "encodedBlockSize", 0);
        setIntField(term154521, term154521.getClass(), "lineLength", 0);
        setIntField(term154521, term154521.getClass(), "chunkSeparatorLength", 0);
        setByteField(term154521, term154521.getClass(), "pad", (byte) 0);
        setField(term154521, term154521.getClass(), "encodeTable", null);
        setField(term154521, term154521.getClass(), "decodeTable", term147418);
        term145934 = (byte[]) newByteArray(495);
        setByteElement(term145934, 7, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 1;
        args[1] = term145934;
        args[2] = true;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


