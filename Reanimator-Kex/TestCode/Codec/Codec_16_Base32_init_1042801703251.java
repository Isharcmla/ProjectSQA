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
import java.lang.Object;

public class Base32_init_1042801703251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445957;
     Object term447342;
     Object term447346;

    public Base32_init_1042801703251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term447140 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term447140, term447140.getClass(), "PAD", (byte) 0);
        setIntField(term447140, term447140.getClass(), "unencodedBlockSize", 0);
        setIntField(term447140, term447140.getClass(), "encodedBlockSize", 0);
        setIntField(term447140, term447140.getClass(), "lineLength", 0);
        setIntField(term447140, term447140.getClass(), "chunkSeparatorLength", 0);
        setByteField(term447140, term447140.getClass(), "pad", (byte) -128);
        setField(term447140, term447140.getClass(), "encodeTable", null);
        setField(term447140, term447140.getClass(), "decodeTable", null);
        setIntField(term447140, term447140.getClass(), "encodeSize", 0);
        setField(term447140, term447140.getClass(), "lineSeparator", null);
        setIntField(term447140, term447140.getClass(), "decodeSize", 0);
        term445957 = (byte[]) newByteArray(4);
        term447342 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term447343 = (byte[]) newByteArray(88);
        byte[] term447344 = (byte[]) newByteArray(32);
        byte[] term447345 = (byte[]) newByteArray(4);
        setIntField(term447342, term447342.getClass(), "decodeSize", 11);
        setByteElement(term447343, 0, (byte) -1);
        setByteElement(term447343, 1, (byte) -1);
        setByteElement(term447343, 2, (byte) -1);
        setByteElement(term447343, 3, (byte) -1);
        setByteElement(term447343, 4, (byte) -1);
        setByteElement(term447343, 5, (byte) -1);
        setByteElement(term447343, 6, (byte) -1);
        setByteElement(term447343, 7, (byte) -1);
        setByteElement(term447343, 8, (byte) -1);
        setByteElement(term447343, 9, (byte) -1);
        setByteElement(term447343, 10, (byte) -1);
        setByteElement(term447343, 11, (byte) -1);
        setByteElement(term447343, 12, (byte) -1);
        setByteElement(term447343, 13, (byte) -1);
        setByteElement(term447343, 14, (byte) -1);
        setByteElement(term447343, 15, (byte) -1);
        setByteElement(term447343, 16, (byte) -1);
        setByteElement(term447343, 17, (byte) -1);
        setByteElement(term447343, 18, (byte) -1);
        setByteElement(term447343, 19, (byte) -1);
        setByteElement(term447343, 20, (byte) -1);
        setByteElement(term447343, 21, (byte) -1);
        setByteElement(term447343, 22, (byte) -1);
        setByteElement(term447343, 23, (byte) -1);
        setByteElement(term447343, 24, (byte) -1);
        setByteElement(term447343, 25, (byte) -1);
        setByteElement(term447343, 26, (byte) -1);
        setByteElement(term447343, 27, (byte) -1);
        setByteElement(term447343, 28, (byte) -1);
        setByteElement(term447343, 29, (byte) -1);
        setByteElement(term447343, 30, (byte) -1);
        setByteElement(term447343, 31, (byte) -1);
        setByteElement(term447343, 32, (byte) -1);
        setByteElement(term447343, 33, (byte) -1);
        setByteElement(term447343, 34, (byte) -1);
        setByteElement(term447343, 35, (byte) -1);
        setByteElement(term447343, 36, (byte) -1);
        setByteElement(term447343, 37, (byte) -1);
        setByteElement(term447343, 38, (byte) -1);
        setByteElement(term447343, 39, (byte) -1);
        setByteElement(term447343, 40, (byte) -1);
        setByteElement(term447343, 41, (byte) -1);
        setByteElement(term447343, 42, (byte) -1);
        setByteElement(term447343, 43, (byte) -1);
        setByteElement(term447343, 44, (byte) -1);
        setByteElement(term447343, 45, (byte) -1);
        setByteElement(term447343, 46, (byte) -1);
        setByteElement(term447343, 47, (byte) -1);
        setByteElement(term447343, 49, (byte) 1);
        setByteElement(term447343, 50, (byte) 2);
        setByteElement(term447343, 51, (byte) 3);
        setByteElement(term447343, 52, (byte) 4);
        setByteElement(term447343, 53, (byte) 5);
        setByteElement(term447343, 54, (byte) 6);
        setByteElement(term447343, 55, (byte) 7);
        setByteElement(term447343, 56, (byte) 8);
        setByteElement(term447343, 57, (byte) 9);
        setByteElement(term447343, 58, (byte) -1);
        setByteElement(term447343, 59, (byte) -1);
        setByteElement(term447343, 60, (byte) -1);
        setByteElement(term447343, 61, (byte) -1);
        setByteElement(term447343, 62, (byte) -1);
        setByteElement(term447343, 63, (byte) -1);
        setByteElement(term447343, 64, (byte) -1);
        setByteElement(term447343, 65, (byte) 10);
        setByteElement(term447343, 66, (byte) 11);
        setByteElement(term447343, 67, (byte) 12);
        setByteElement(term447343, 68, (byte) 13);
        setByteElement(term447343, 69, (byte) 14);
        setByteElement(term447343, 70, (byte) 15);
        setByteElement(term447343, 71, (byte) 16);
        setByteElement(term447343, 72, (byte) 17);
        setByteElement(term447343, 73, (byte) 18);
        setByteElement(term447343, 74, (byte) 19);
        setByteElement(term447343, 75, (byte) 20);
        setByteElement(term447343, 76, (byte) 21);
        setByteElement(term447343, 77, (byte) 22);
        setByteElement(term447343, 78, (byte) 23);
        setByteElement(term447343, 79, (byte) 24);
        setByteElement(term447343, 80, (byte) 25);
        setByteElement(term447343, 81, (byte) 26);
        setByteElement(term447343, 82, (byte) 27);
        setByteElement(term447343, 83, (byte) 28);
        setByteElement(term447343, 84, (byte) 29);
        setByteElement(term447343, 85, (byte) 30);
        setByteElement(term447343, 86, (byte) 31);
        setByteElement(term447343, 87, (byte) 32);
        setField(term447342, term447342.getClass(), "decodeTable", term447343);
        setIntField(term447342, term447342.getClass(), "encodeSize", 12);
        setByteElement(term447344, 0, (byte) 48);
        setByteElement(term447344, 1, (byte) 49);
        setByteElement(term447344, 2, (byte) 50);
        setByteElement(term447344, 3, (byte) 51);
        setByteElement(term447344, 4, (byte) 52);
        setByteElement(term447344, 5, (byte) 53);
        setByteElement(term447344, 6, (byte) 54);
        setByteElement(term447344, 7, (byte) 55);
        setByteElement(term447344, 8, (byte) 56);
        setByteElement(term447344, 9, (byte) 57);
        setByteElement(term447344, 10, (byte) 65);
        setByteElement(term447344, 11, (byte) 66);
        setByteElement(term447344, 12, (byte) 67);
        setByteElement(term447344, 13, (byte) 68);
        setByteElement(term447344, 14, (byte) 69);
        setByteElement(term447344, 15, (byte) 70);
        setByteElement(term447344, 16, (byte) 71);
        setByteElement(term447344, 17, (byte) 72);
        setByteElement(term447344, 18, (byte) 73);
        setByteElement(term447344, 19, (byte) 74);
        setByteElement(term447344, 20, (byte) 75);
        setByteElement(term447344, 21, (byte) 76);
        setByteElement(term447344, 22, (byte) 77);
        setByteElement(term447344, 23, (byte) 78);
        setByteElement(term447344, 24, (byte) 79);
        setByteElement(term447344, 25, (byte) 80);
        setByteElement(term447344, 26, (byte) 81);
        setByteElement(term447344, 27, (byte) 82);
        setByteElement(term447344, 28, (byte) 83);
        setByteElement(term447344, 29, (byte) 84);
        setByteElement(term447344, 30, (byte) 85);
        setByteElement(term447344, 31, (byte) 86);
        setField(term447342, term447342.getClass(), "encodeTable", term447344);
        setField(term447342, term447342.getClass(), "lineSeparator", term447345);
        setByteField(term447342, term447342.getClass(), "PAD", (byte) 61);
        setByteField(term447342, term447342.getClass(), "pad", (byte) 61);
        setIntField(term447342, term447342.getClass(), "unencodedBlockSize", 5);
        setIntField(term447342, term447342.getClass(), "encodedBlockSize", 8);
        setIntField(term447342, term447342.getClass(), "lineLength", 0);
        setIntField(term447342, term447342.getClass(), "chunkSeparatorLength", 4);
        term447346 = (byte[]) newByteArray(4);
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
        args[1] = term445957;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term447342));
        assertTrue(recursiveEquals(term445957, term447346));
    }

};


