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

public class Base32_init_1099337581444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Base32_init_1099337581444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term932734 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term932432 = (byte[]) newByteArray(44);
        byte[] term932521 = (byte[]) newByteArray(0);
        byte[] term932523 = (byte[]) newByteArray(0);
        setByteField(term932734, term932734.getClass(), "PAD", (byte) 0);
        setIntField(term932734, term932734.getClass(), "unencodedBlockSize", 0);
        setIntField(term932734, term932734.getClass(), "encodedBlockSize", 0);
        setIntField(term932734, term932734.getClass(), "lineLength", 0);
        setIntField(term932734, term932734.getClass(), "chunkSeparatorLength", 0);
        setByteField(term932734, term932734.getClass(), "pad", (byte) 0);
        setByteElement(term932432, 0, (byte) -1);
        setByteElement(term932432, 1, (byte) -1);
        setByteElement(term932432, 2, (byte) -1);
        setByteElement(term932432, 3, (byte) -1);
        setByteElement(term932432, 4, (byte) -1);
        setByteElement(term932432, 5, (byte) -1);
        setByteElement(term932432, 6, (byte) -1);
        setByteElement(term932432, 7, (byte) -1);
        setByteElement(term932432, 8, (byte) -1);
        setByteElement(term932432, 9, (byte) -1);
        setByteElement(term932432, 10, (byte) -1);
        setByteElement(term932432, 11, (byte) -1);
        setByteElement(term932432, 12, (byte) -1);
        setByteElement(term932432, 13, (byte) -1);
        setByteElement(term932432, 14, (byte) -1);
        setByteElement(term932432, 15, (byte) -1);
        setByteElement(term932432, 16, (byte) -1);
        setByteElement(term932432, 17, (byte) -1);
        setByteElement(term932432, 18, (byte) -1);
        setByteElement(term932432, 19, (byte) -1);
        setByteElement(term932432, 20, (byte) -1);
        setByteElement(term932432, 21, (byte) -1);
        setByteElement(term932432, 22, (byte) -1);
        setByteElement(term932432, 23, (byte) -1);
        setByteElement(term932432, 24, (byte) -1);
        setByteElement(term932432, 25, (byte) -1);
        setByteElement(term932432, 26, (byte) -1);
        setByteElement(term932432, 27, (byte) -1);
        setByteElement(term932432, 28, (byte) -1);
        setByteElement(term932432, 29, (byte) -1);
        setByteElement(term932432, 30, (byte) -1);
        setByteElement(term932432, 31, (byte) -1);
        setByteElement(term932432, 32, (byte) -1);
        setByteElement(term932432, 33, (byte) -1);
        setByteElement(term932432, 34, (byte) -1);
        setByteElement(term932432, 35, (byte) -1);
        setByteElement(term932432, 36, (byte) -1);
        setByteElement(term932432, 37, (byte) -1);
        setByteElement(term932432, 38, (byte) -1);
        setByteElement(term932432, 39, (byte) -1);
        setByteElement(term932432, 40, (byte) -1);
        setByteElement(term932432, 41, (byte) -1);
        setByteElement(term932432, 42, (byte) -1);
        setByteElement(term932432, 43, (byte) -1);
        setField(term932734, term932734.getClass(), "encodeTable", term932432);
        setField(term932734, term932734.getClass(), "decodeTable", term932521);
        setIntField(term932734, term932734.getClass(), "encodeSize", 0);
        setField(term932734, term932734.getClass(), "lineSeparator", term932523);
        setIntField(term932734, term932734.getClass(), "decodeSize", 0);
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
        args[0] = 0;
        args[1] = null;
        args[2] = true;
        args[3] = (byte) 32;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


