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

public class Base32_init_1099337581379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779641;

    public Base32_init_1099337581379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term781282 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term780143 = (byte[]) newByteArray(0);
        setByteField(term781282, term781282.getClass(), "PAD", (byte) 0);
        setIntField(term781282, term781282.getClass(), "unencodedBlockSize", 0);
        setIntField(term781282, term781282.getClass(), "encodedBlockSize", 0);
        setIntField(term781282, term781282.getClass(), "lineLength", 0);
        setIntField(term781282, term781282.getClass(), "chunkSeparatorLength", 0);
        setByteField(term781282, term781282.getClass(), "pad", (byte) -128);
        setField(term781282, term781282.getClass(), "encodeTable", null);
        setField(term781282, term781282.getClass(), "decodeTable", term780143);
        setIntField(term781282, term781282.getClass(), "encodeSize", 0);
        setField(term781282, term781282.getClass(), "lineSeparator", null);
        setIntField(term781282, term781282.getClass(), "decodeSize", 0);
        term779641 = (byte[]) newByteArray(1);
        setByteElement(term779641, 0, (byte) -128);
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
        args[1] = term779641;
        args[2] = false;
        args[3] = (byte) 10;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


