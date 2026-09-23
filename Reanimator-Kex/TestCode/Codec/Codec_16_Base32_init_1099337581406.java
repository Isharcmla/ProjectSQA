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

public class Base32_init_1099337581406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817111;

    public Base32_init_1099337581406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term817420 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term817189 = (byte[]) newByteArray(0);
        byte[] term817190 = (byte[]) newByteArray(34);
        byte[] term817226 = (byte[]) newByteArray(0);
        setByteField(term817420, term817420.getClass(), "PAD", (byte) 0);
        setIntField(term817420, term817420.getClass(), "unencodedBlockSize", 0);
        setIntField(term817420, term817420.getClass(), "encodedBlockSize", 0);
        setIntField(term817420, term817420.getClass(), "lineLength", 0);
        setIntField(term817420, term817420.getClass(), "chunkSeparatorLength", 0);
        setByteField(term817420, term817420.getClass(), "pad", (byte) 0);
        setField(term817420, term817420.getClass(), "encodeTable", term817189);
        setByteElement(term817190, 0, (byte) -1);
        setByteElement(term817190, 1, (byte) -1);
        setByteElement(term817190, 2, (byte) -1);
        setByteElement(term817190, 3, (byte) -1);
        setByteElement(term817190, 4, (byte) -1);
        setByteElement(term817190, 5, (byte) -1);
        setByteElement(term817190, 6, (byte) -1);
        setByteElement(term817190, 7, (byte) -1);
        setByteElement(term817190, 8, (byte) -1);
        setByteElement(term817190, 9, (byte) -1);
        setByteElement(term817190, 10, (byte) -1);
        setByteElement(term817190, 11, (byte) -1);
        setByteElement(term817190, 12, (byte) -1);
        setByteElement(term817190, 13, (byte) -1);
        setByteElement(term817190, 14, (byte) -1);
        setByteElement(term817190, 15, (byte) -1);
        setByteElement(term817190, 16, (byte) -1);
        setByteElement(term817190, 17, (byte) -1);
        setByteElement(term817190, 18, (byte) -1);
        setByteElement(term817190, 19, (byte) -1);
        setByteElement(term817190, 20, (byte) -1);
        setByteElement(term817190, 21, (byte) -1);
        setByteElement(term817190, 22, (byte) -1);
        setByteElement(term817190, 23, (byte) -1);
        setByteElement(term817190, 24, (byte) -1);
        setByteElement(term817190, 25, (byte) -1);
        setByteElement(term817190, 26, (byte) -1);
        setByteElement(term817190, 27, (byte) -1);
        setByteElement(term817190, 28, (byte) -1);
        setByteElement(term817190, 29, (byte) -1);
        setByteElement(term817190, 30, (byte) -1);
        setByteElement(term817190, 31, (byte) -1);
        setByteElement(term817190, 32, (byte) -1);
        setByteElement(term817190, 33, (byte) -1);
        setField(term817420, term817420.getClass(), "decodeTable", term817190);
        setIntField(term817420, term817420.getClass(), "encodeSize", 0);
        setField(term817420, term817420.getClass(), "lineSeparator", term817226);
        setIntField(term817420, term817420.getClass(), "decodeSize", 0);
        term817111 = (byte[]) newByteArray(34);
        setByteElement(term817111, 0, (byte) -1);
        setByteElement(term817111, 1, (byte) -1);
        setByteElement(term817111, 2, (byte) -1);
        setByteElement(term817111, 3, (byte) -1);
        setByteElement(term817111, 4, (byte) -1);
        setByteElement(term817111, 5, (byte) -1);
        setByteElement(term817111, 6, (byte) -1);
        setByteElement(term817111, 7, (byte) -1);
        setByteElement(term817111, 8, (byte) -1);
        setByteElement(term817111, 9, (byte) -1);
        setByteElement(term817111, 10, (byte) -1);
        setByteElement(term817111, 11, (byte) -1);
        setByteElement(term817111, 12, (byte) -1);
        setByteElement(term817111, 13, (byte) -1);
        setByteElement(term817111, 14, (byte) -1);
        setByteElement(term817111, 15, (byte) -1);
        setByteElement(term817111, 16, (byte) -1);
        setByteElement(term817111, 17, (byte) -1);
        setByteElement(term817111, 18, (byte) -1);
        setByteElement(term817111, 19, (byte) -1);
        setByteElement(term817111, 20, (byte) -1);
        setByteElement(term817111, 21, (byte) -1);
        setByteElement(term817111, 22, (byte) -1);
        setByteElement(term817111, 23, (byte) -1);
        setByteElement(term817111, 24, (byte) -1);
        setByteElement(term817111, 25, (byte) -1);
        setByteElement(term817111, 26, (byte) -1);
        setByteElement(term817111, 27, (byte) -1);
        setByteElement(term817111, 28, (byte) -1);
        setByteElement(term817111, 29, (byte) -1);
        setByteElement(term817111, 30, (byte) -1);
        setByteElement(term817111, 31, (byte) -1);
        setByteElement(term817111, 32, (byte) -1);
        setByteElement(term817111, 33, (byte) -1);
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
        args[1] = term817111;
        args[2] = true;
        args[3] = (byte) 9;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


