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

public class Base32_init_1042801703469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term972444;
     Object term1025948;
     Object term1025952;

    public Base32_init_1042801703469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term985041 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term973463 = (byte[]) newByteArray(0);
        setByteField(term985041, term985041.getClass(), "PAD", (byte) 0);
        setIntField(term985041, term985041.getClass(), "unencodedBlockSize", 0);
        setIntField(term985041, term985041.getClass(), "encodedBlockSize", 0);
        setIntField(term985041, term985041.getClass(), "lineLength", 0);
        setIntField(term985041, term985041.getClass(), "chunkSeparatorLength", 0);
        setByteField(term985041, term985041.getClass(), "pad", (byte) -128);
        setField(term985041, term985041.getClass(), "encodeTable", null);
        setField(term985041, term985041.getClass(), "decodeTable", term973463);
        setIntField(term985041, term985041.getClass(), "encodeSize", 0);
        setField(term985041, term985041.getClass(), "lineSeparator", null);
        setIntField(term985041, term985041.getClass(), "decodeSize", 0);
        term972444 = (byte[]) newByteArray(10);
        term1025948 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1025949 = (byte[]) newByteArray(88);
        byte[] term1025950 = (byte[]) newByteArray(32);
        byte[] term1025951 = (byte[]) newByteArray(10);
        setIntField(term1025948, term1025948.getClass(), "decodeSize", 17);
        setByteElement(term1025949, 0, (byte) -1);
        setByteElement(term1025949, 1, (byte) -1);
        setByteElement(term1025949, 2, (byte) -1);
        setByteElement(term1025949, 3, (byte) -1);
        setByteElement(term1025949, 4, (byte) -1);
        setByteElement(term1025949, 5, (byte) -1);
        setByteElement(term1025949, 6, (byte) -1);
        setByteElement(term1025949, 7, (byte) -1);
        setByteElement(term1025949, 8, (byte) -1);
        setByteElement(term1025949, 9, (byte) -1);
        setByteElement(term1025949, 10, (byte) -1);
        setByteElement(term1025949, 11, (byte) -1);
        setByteElement(term1025949, 12, (byte) -1);
        setByteElement(term1025949, 13, (byte) -1);
        setByteElement(term1025949, 14, (byte) -1);
        setByteElement(term1025949, 15, (byte) -1);
        setByteElement(term1025949, 16, (byte) -1);
        setByteElement(term1025949, 17, (byte) -1);
        setByteElement(term1025949, 18, (byte) -1);
        setByteElement(term1025949, 19, (byte) -1);
        setByteElement(term1025949, 20, (byte) -1);
        setByteElement(term1025949, 21, (byte) -1);
        setByteElement(term1025949, 22, (byte) -1);
        setByteElement(term1025949, 23, (byte) -1);
        setByteElement(term1025949, 24, (byte) -1);
        setByteElement(term1025949, 25, (byte) -1);
        setByteElement(term1025949, 26, (byte) -1);
        setByteElement(term1025949, 27, (byte) -1);
        setByteElement(term1025949, 28, (byte) -1);
        setByteElement(term1025949, 29, (byte) -1);
        setByteElement(term1025949, 30, (byte) -1);
        setByteElement(term1025949, 31, (byte) -1);
        setByteElement(term1025949, 32, (byte) -1);
        setByteElement(term1025949, 33, (byte) -1);
        setByteElement(term1025949, 34, (byte) -1);
        setByteElement(term1025949, 35, (byte) -1);
        setByteElement(term1025949, 36, (byte) -1);
        setByteElement(term1025949, 37, (byte) -1);
        setByteElement(term1025949, 38, (byte) -1);
        setByteElement(term1025949, 39, (byte) -1);
        setByteElement(term1025949, 40, (byte) -1);
        setByteElement(term1025949, 41, (byte) -1);
        setByteElement(term1025949, 42, (byte) -1);
        setByteElement(term1025949, 43, (byte) -1);
        setByteElement(term1025949, 44, (byte) -1);
        setByteElement(term1025949, 45, (byte) -1);
        setByteElement(term1025949, 46, (byte) -1);
        setByteElement(term1025949, 47, (byte) -1);
        setByteElement(term1025949, 49, (byte) 1);
        setByteElement(term1025949, 50, (byte) 2);
        setByteElement(term1025949, 51, (byte) 3);
        setByteElement(term1025949, 52, (byte) 4);
        setByteElement(term1025949, 53, (byte) 5);
        setByteElement(term1025949, 54, (byte) 6);
        setByteElement(term1025949, 55, (byte) 7);
        setByteElement(term1025949, 56, (byte) 8);
        setByteElement(term1025949, 57, (byte) 9);
        setByteElement(term1025949, 58, (byte) -1);
        setByteElement(term1025949, 59, (byte) -1);
        setByteElement(term1025949, 60, (byte) -1);
        setByteElement(term1025949, 61, (byte) -1);
        setByteElement(term1025949, 62, (byte) -1);
        setByteElement(term1025949, 63, (byte) -1);
        setByteElement(term1025949, 64, (byte) -1);
        setByteElement(term1025949, 65, (byte) 10);
        setByteElement(term1025949, 66, (byte) 11);
        setByteElement(term1025949, 67, (byte) 12);
        setByteElement(term1025949, 68, (byte) 13);
        setByteElement(term1025949, 69, (byte) 14);
        setByteElement(term1025949, 70, (byte) 15);
        setByteElement(term1025949, 71, (byte) 16);
        setByteElement(term1025949, 72, (byte) 17);
        setByteElement(term1025949, 73, (byte) 18);
        setByteElement(term1025949, 74, (byte) 19);
        setByteElement(term1025949, 75, (byte) 20);
        setByteElement(term1025949, 76, (byte) 21);
        setByteElement(term1025949, 77, (byte) 22);
        setByteElement(term1025949, 78, (byte) 23);
        setByteElement(term1025949, 79, (byte) 24);
        setByteElement(term1025949, 80, (byte) 25);
        setByteElement(term1025949, 81, (byte) 26);
        setByteElement(term1025949, 82, (byte) 27);
        setByteElement(term1025949, 83, (byte) 28);
        setByteElement(term1025949, 84, (byte) 29);
        setByteElement(term1025949, 85, (byte) 30);
        setByteElement(term1025949, 86, (byte) 31);
        setByteElement(term1025949, 87, (byte) 32);
        setField(term1025948, term1025948.getClass(), "decodeTable", term1025949);
        setIntField(term1025948, term1025948.getClass(), "encodeSize", 18);
        setByteElement(term1025950, 0, (byte) 48);
        setByteElement(term1025950, 1, (byte) 49);
        setByteElement(term1025950, 2, (byte) 50);
        setByteElement(term1025950, 3, (byte) 51);
        setByteElement(term1025950, 4, (byte) 52);
        setByteElement(term1025950, 5, (byte) 53);
        setByteElement(term1025950, 6, (byte) 54);
        setByteElement(term1025950, 7, (byte) 55);
        setByteElement(term1025950, 8, (byte) 56);
        setByteElement(term1025950, 9, (byte) 57);
        setByteElement(term1025950, 10, (byte) 65);
        setByteElement(term1025950, 11, (byte) 66);
        setByteElement(term1025950, 12, (byte) 67);
        setByteElement(term1025950, 13, (byte) 68);
        setByteElement(term1025950, 14, (byte) 69);
        setByteElement(term1025950, 15, (byte) 70);
        setByteElement(term1025950, 16, (byte) 71);
        setByteElement(term1025950, 17, (byte) 72);
        setByteElement(term1025950, 18, (byte) 73);
        setByteElement(term1025950, 19, (byte) 74);
        setByteElement(term1025950, 20, (byte) 75);
        setByteElement(term1025950, 21, (byte) 76);
        setByteElement(term1025950, 22, (byte) 77);
        setByteElement(term1025950, 23, (byte) 78);
        setByteElement(term1025950, 24, (byte) 79);
        setByteElement(term1025950, 25, (byte) 80);
        setByteElement(term1025950, 26, (byte) 81);
        setByteElement(term1025950, 27, (byte) 82);
        setByteElement(term1025950, 28, (byte) 83);
        setByteElement(term1025950, 29, (byte) 84);
        setByteElement(term1025950, 30, (byte) 85);
        setByteElement(term1025950, 31, (byte) 86);
        setField(term1025948, term1025948.getClass(), "encodeTable", term1025950);
        setField(term1025948, term1025948.getClass(), "lineSeparator", term1025951);
        setByteField(term1025948, term1025948.getClass(), "PAD", (byte) 61);
        setByteField(term1025948, term1025948.getClass(), "pad", (byte) 61);
        setIntField(term1025948, term1025948.getClass(), "unencodedBlockSize", 5);
        setIntField(term1025948, term1025948.getClass(), "encodedBlockSize", 8);
        setIntField(term1025948, term1025948.getClass(), "lineLength", 0);
        setIntField(term1025948, term1025948.getClass(), "chunkSeparatorLength", 10);
        term1025952 = (byte[]) newByteArray(10);
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
        args[1] = term972444;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1025948));
        assertTrue(recursiveEquals(term972444, term1025952));
    }

};


