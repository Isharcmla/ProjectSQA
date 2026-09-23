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

public class Base32_init_1099337581402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811894;

    public Base32_init_1099337581402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term812055 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term811903 = (byte[]) newByteArray(0);
        setByteField(term812055, term812055.getClass(), "PAD", (byte) 0);
        setIntField(term812055, term812055.getClass(), "unencodedBlockSize", 0);
        setIntField(term812055, term812055.getClass(), "encodedBlockSize", 0);
        setIntField(term812055, term812055.getClass(), "lineLength", 0);
        setIntField(term812055, term812055.getClass(), "chunkSeparatorLength", 0);
        setByteField(term812055, term812055.getClass(), "pad", (byte) -128);
        setField(term812055, term812055.getClass(), "encodeTable", term811903);
        setField(term812055, term812055.getClass(), "decodeTable", null);
        setIntField(term812055, term812055.getClass(), "encodeSize", 0);
        setField(term812055, term812055.getClass(), "lineSeparator", null);
        setIntField(term812055, term812055.getClass(), "decodeSize", 0);
        term811894 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        argTypes[3] = byte.class;
        Object[] args = new Object[4];
        args[0] = 1;
        args[1] = term811894;
        args[2] = false;
        args[3] = (byte) 13;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


