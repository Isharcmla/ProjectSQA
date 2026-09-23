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

public class Base32_init_1042801703275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term502865;
     Object term509193;
     Object term509197;

    public Base32_init_1042801703275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term508714 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term503388 = (byte[]) newByteArray(0);
        setByteField(term508714, term508714.getClass(), "PAD", (byte) 0);
        setIntField(term508714, term508714.getClass(), "unencodedBlockSize", 0);
        setIntField(term508714, term508714.getClass(), "encodedBlockSize", 0);
        setIntField(term508714, term508714.getClass(), "lineLength", 0);
        setIntField(term508714, term508714.getClass(), "chunkSeparatorLength", 0);
        setByteField(term508714, term508714.getClass(), "pad", (byte) -128);
        setField(term508714, term508714.getClass(), "encodeTable", null);
        setField(term508714, term508714.getClass(), "decodeTable", term503388);
        setIntField(term508714, term508714.getClass(), "encodeSize", 0);
        setField(term508714, term508714.getClass(), "lineSeparator", null);
        setIntField(term508714, term508714.getClass(), "decodeSize", 0);
        term502865 = (byte[]) newByteArray(4);
        term509193 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term509194 = (byte[]) newByteArray(88);
        byte[] term509195 = (byte[]) newByteArray(32);
        byte[] term509196 = (byte[]) newByteArray(4);
        setIntField(term509193, term509193.getClass(), "decodeSize", 11);
        setByteElement(term509194, 0, (byte) -1);
        setByteElement(term509194, 1, (byte) -1);
        setByteElement(term509194, 2, (byte) -1);
        setByteElement(term509194, 3, (byte) -1);
        setByteElement(term509194, 4, (byte) -1);
        setByteElement(term509194, 5, (byte) -1);
        setByteElement(term509194, 6, (byte) -1);
        setByteElement(term509194, 7, (byte) -1);
        setByteElement(term509194, 8, (byte) -1);
        setByteElement(term509194, 9, (byte) -1);
        setByteElement(term509194, 10, (byte) -1);
        setByteElement(term509194, 11, (byte) -1);
        setByteElement(term509194, 12, (byte) -1);
        setByteElement(term509194, 13, (byte) -1);
        setByteElement(term509194, 14, (byte) -1);
        setByteElement(term509194, 15, (byte) -1);
        setByteElement(term509194, 16, (byte) -1);
        setByteElement(term509194, 17, (byte) -1);
        setByteElement(term509194, 18, (byte) -1);
        setByteElement(term509194, 19, (byte) -1);
        setByteElement(term509194, 20, (byte) -1);
        setByteElement(term509194, 21, (byte) -1);
        setByteElement(term509194, 22, (byte) -1);
        setByteElement(term509194, 23, (byte) -1);
        setByteElement(term509194, 24, (byte) -1);
        setByteElement(term509194, 25, (byte) -1);
        setByteElement(term509194, 26, (byte) -1);
        setByteElement(term509194, 27, (byte) -1);
        setByteElement(term509194, 28, (byte) -1);
        setByteElement(term509194, 29, (byte) -1);
        setByteElement(term509194, 30, (byte) -1);
        setByteElement(term509194, 31, (byte) -1);
        setByteElement(term509194, 32, (byte) -1);
        setByteElement(term509194, 33, (byte) -1);
        setByteElement(term509194, 34, (byte) -1);
        setByteElement(term509194, 35, (byte) -1);
        setByteElement(term509194, 36, (byte) -1);
        setByteElement(term509194, 37, (byte) -1);
        setByteElement(term509194, 38, (byte) -1);
        setByteElement(term509194, 39, (byte) -1);
        setByteElement(term509194, 40, (byte) -1);
        setByteElement(term509194, 41, (byte) -1);
        setByteElement(term509194, 42, (byte) -1);
        setByteElement(term509194, 43, (byte) -1);
        setByteElement(term509194, 44, (byte) -1);
        setByteElement(term509194, 45, (byte) -1);
        setByteElement(term509194, 46, (byte) -1);
        setByteElement(term509194, 47, (byte) -1);
        setByteElement(term509194, 49, (byte) 1);
        setByteElement(term509194, 50, (byte) 2);
        setByteElement(term509194, 51, (byte) 3);
        setByteElement(term509194, 52, (byte) 4);
        setByteElement(term509194, 53, (byte) 5);
        setByteElement(term509194, 54, (byte) 6);
        setByteElement(term509194, 55, (byte) 7);
        setByteElement(term509194, 56, (byte) 8);
        setByteElement(term509194, 57, (byte) 9);
        setByteElement(term509194, 58, (byte) -1);
        setByteElement(term509194, 59, (byte) -1);
        setByteElement(term509194, 60, (byte) -1);
        setByteElement(term509194, 61, (byte) -1);
        setByteElement(term509194, 62, (byte) -1);
        setByteElement(term509194, 63, (byte) -1);
        setByteElement(term509194, 64, (byte) -1);
        setByteElement(term509194, 65, (byte) 10);
        setByteElement(term509194, 66, (byte) 11);
        setByteElement(term509194, 67, (byte) 12);
        setByteElement(term509194, 68, (byte) 13);
        setByteElement(term509194, 69, (byte) 14);
        setByteElement(term509194, 70, (byte) 15);
        setByteElement(term509194, 71, (byte) 16);
        setByteElement(term509194, 72, (byte) 17);
        setByteElement(term509194, 73, (byte) 18);
        setByteElement(term509194, 74, (byte) 19);
        setByteElement(term509194, 75, (byte) 20);
        setByteElement(term509194, 76, (byte) 21);
        setByteElement(term509194, 77, (byte) 22);
        setByteElement(term509194, 78, (byte) 23);
        setByteElement(term509194, 79, (byte) 24);
        setByteElement(term509194, 80, (byte) 25);
        setByteElement(term509194, 81, (byte) 26);
        setByteElement(term509194, 82, (byte) 27);
        setByteElement(term509194, 83, (byte) 28);
        setByteElement(term509194, 84, (byte) 29);
        setByteElement(term509194, 85, (byte) 30);
        setByteElement(term509194, 86, (byte) 31);
        setByteElement(term509194, 87, (byte) 32);
        setField(term509193, term509193.getClass(), "decodeTable", term509194);
        setIntField(term509193, term509193.getClass(), "encodeSize", 12);
        setByteElement(term509195, 0, (byte) 48);
        setByteElement(term509195, 1, (byte) 49);
        setByteElement(term509195, 2, (byte) 50);
        setByteElement(term509195, 3, (byte) 51);
        setByteElement(term509195, 4, (byte) 52);
        setByteElement(term509195, 5, (byte) 53);
        setByteElement(term509195, 6, (byte) 54);
        setByteElement(term509195, 7, (byte) 55);
        setByteElement(term509195, 8, (byte) 56);
        setByteElement(term509195, 9, (byte) 57);
        setByteElement(term509195, 10, (byte) 65);
        setByteElement(term509195, 11, (byte) 66);
        setByteElement(term509195, 12, (byte) 67);
        setByteElement(term509195, 13, (byte) 68);
        setByteElement(term509195, 14, (byte) 69);
        setByteElement(term509195, 15, (byte) 70);
        setByteElement(term509195, 16, (byte) 71);
        setByteElement(term509195, 17, (byte) 72);
        setByteElement(term509195, 18, (byte) 73);
        setByteElement(term509195, 19, (byte) 74);
        setByteElement(term509195, 20, (byte) 75);
        setByteElement(term509195, 21, (byte) 76);
        setByteElement(term509195, 22, (byte) 77);
        setByteElement(term509195, 23, (byte) 78);
        setByteElement(term509195, 24, (byte) 79);
        setByteElement(term509195, 25, (byte) 80);
        setByteElement(term509195, 26, (byte) 81);
        setByteElement(term509195, 27, (byte) 82);
        setByteElement(term509195, 28, (byte) 83);
        setByteElement(term509195, 29, (byte) 84);
        setByteElement(term509195, 30, (byte) 85);
        setByteElement(term509195, 31, (byte) 86);
        setField(term509193, term509193.getClass(), "encodeTable", term509195);
        setField(term509193, term509193.getClass(), "lineSeparator", term509196);
        setByteField(term509193, term509193.getClass(), "PAD", (byte) 61);
        setByteField(term509193, term509193.getClass(), "pad", (byte) 61);
        setIntField(term509193, term509193.getClass(), "unencodedBlockSize", 5);
        setIntField(term509193, term509193.getClass(), "encodedBlockSize", 8);
        setIntField(term509193, term509193.getClass(), "lineLength", 0);
        setIntField(term509193, term509193.getClass(), "chunkSeparatorLength", 4);
        term509197 = (byte[]) newByteArray(4);
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
        args[1] = term502865;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term509193));
        assertTrue(recursiveEquals(term502865, term509197));
    }

};


