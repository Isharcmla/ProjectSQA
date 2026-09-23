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

public class Base32_init_1099337581287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519808;

    public Base32_init_1099337581287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term518316 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term516528 = (byte[]) newByteArray(0);
        byte[] term515971 = (byte[]) newByteArray(556);
        setByteField(term518316, term518316.getClass(), "PAD", (byte) 0);
        setIntField(term518316, term518316.getClass(), "unencodedBlockSize", 0);
        setIntField(term518316, term518316.getClass(), "encodedBlockSize", 0);
        setIntField(term518316, term518316.getClass(), "lineLength", 0);
        setIntField(term518316, term518316.getClass(), "chunkSeparatorLength", 0);
        setByteField(term518316, term518316.getClass(), "pad", (byte) 0);
        setField(term518316, term518316.getClass(), "encodeTable", term516528);
        setField(term518316, term518316.getClass(), "decodeTable", term515971);
        setIntField(term518316, term518316.getClass(), "encodeSize", 0);
        setField(term518316, term518316.getClass(), "lineSeparator", term516528);
        setIntField(term518316, term518316.getClass(), "decodeSize", 0);
        term519808 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term519809 = (byte[]) newByteArray(91);
        byte[] term519810 = (byte[]) newByteArray(32);
        setIntField(term519808, term519808.getClass(), "decodeSize", 7);
        setByteElement(term519809, 0, (byte) -1);
        setByteElement(term519809, 1, (byte) -1);
        setByteElement(term519809, 2, (byte) -1);
        setByteElement(term519809, 3, (byte) -1);
        setByteElement(term519809, 4, (byte) -1);
        setByteElement(term519809, 5, (byte) -1);
        setByteElement(term519809, 6, (byte) -1);
        setByteElement(term519809, 7, (byte) -1);
        setByteElement(term519809, 8, (byte) -1);
        setByteElement(term519809, 9, (byte) -1);
        setByteElement(term519809, 10, (byte) -1);
        setByteElement(term519809, 11, (byte) -1);
        setByteElement(term519809, 12, (byte) -1);
        setByteElement(term519809, 13, (byte) -1);
        setByteElement(term519809, 14, (byte) -1);
        setByteElement(term519809, 15, (byte) -1);
        setByteElement(term519809, 16, (byte) -1);
        setByteElement(term519809, 17, (byte) -1);
        setByteElement(term519809, 18, (byte) -1);
        setByteElement(term519809, 19, (byte) -1);
        setByteElement(term519809, 20, (byte) -1);
        setByteElement(term519809, 21, (byte) -1);
        setByteElement(term519809, 22, (byte) -1);
        setByteElement(term519809, 23, (byte) -1);
        setByteElement(term519809, 24, (byte) -1);
        setByteElement(term519809, 25, (byte) -1);
        setByteElement(term519809, 26, (byte) -1);
        setByteElement(term519809, 27, (byte) -1);
        setByteElement(term519809, 28, (byte) -1);
        setByteElement(term519809, 29, (byte) -1);
        setByteElement(term519809, 30, (byte) -1);
        setByteElement(term519809, 31, (byte) -1);
        setByteElement(term519809, 32, (byte) -1);
        setByteElement(term519809, 33, (byte) -1);
        setByteElement(term519809, 34, (byte) -1);
        setByteElement(term519809, 35, (byte) -1);
        setByteElement(term519809, 36, (byte) -1);
        setByteElement(term519809, 37, (byte) -1);
        setByteElement(term519809, 38, (byte) -1);
        setByteElement(term519809, 39, (byte) -1);
        setByteElement(term519809, 40, (byte) -1);
        setByteElement(term519809, 41, (byte) -1);
        setByteElement(term519809, 42, (byte) -1);
        setByteElement(term519809, 43, (byte) -1);
        setByteElement(term519809, 44, (byte) -1);
        setByteElement(term519809, 45, (byte) -1);
        setByteElement(term519809, 46, (byte) -1);
        setByteElement(term519809, 47, (byte) -1);
        setByteElement(term519809, 48, (byte) -1);
        setByteElement(term519809, 49, (byte) -1);
        setByteElement(term519809, 50, (byte) 26);
        setByteElement(term519809, 51, (byte) 27);
        setByteElement(term519809, 52, (byte) 28);
        setByteElement(term519809, 53, (byte) 29);
        setByteElement(term519809, 54, (byte) 30);
        setByteElement(term519809, 55, (byte) 31);
        setByteElement(term519809, 56, (byte) -1);
        setByteElement(term519809, 57, (byte) -1);
        setByteElement(term519809, 58, (byte) -1);
        setByteElement(term519809, 59, (byte) -1);
        setByteElement(term519809, 60, (byte) -1);
        setByteElement(term519809, 61, (byte) -1);
        setByteElement(term519809, 62, (byte) -1);
        setByteElement(term519809, 63, (byte) -1);
        setByteElement(term519809, 64, (byte) -1);
        setByteElement(term519809, 66, (byte) 1);
        setByteElement(term519809, 67, (byte) 2);
        setByteElement(term519809, 68, (byte) 3);
        setByteElement(term519809, 69, (byte) 4);
        setByteElement(term519809, 70, (byte) 5);
        setByteElement(term519809, 71, (byte) 6);
        setByteElement(term519809, 72, (byte) 7);
        setByteElement(term519809, 73, (byte) 8);
        setByteElement(term519809, 74, (byte) 9);
        setByteElement(term519809, 75, (byte) 10);
        setByteElement(term519809, 76, (byte) 11);
        setByteElement(term519809, 77, (byte) 12);
        setByteElement(term519809, 78, (byte) 13);
        setByteElement(term519809, 79, (byte) 14);
        setByteElement(term519809, 80, (byte) 15);
        setByteElement(term519809, 81, (byte) 16);
        setByteElement(term519809, 82, (byte) 17);
        setByteElement(term519809, 83, (byte) 18);
        setByteElement(term519809, 84, (byte) 19);
        setByteElement(term519809, 85, (byte) 20);
        setByteElement(term519809, 86, (byte) 21);
        setByteElement(term519809, 87, (byte) 22);
        setByteElement(term519809, 88, (byte) 23);
        setByteElement(term519809, 89, (byte) 24);
        setByteElement(term519809, 90, (byte) 25);
        setField(term519808, term519808.getClass(), "decodeTable", term519809);
        setIntField(term519808, term519808.getClass(), "encodeSize", 8);
        setByteElement(term519810, 0, (byte) 65);
        setByteElement(term519810, 1, (byte) 66);
        setByteElement(term519810, 2, (byte) 67);
        setByteElement(term519810, 3, (byte) 68);
        setByteElement(term519810, 4, (byte) 69);
        setByteElement(term519810, 5, (byte) 70);
        setByteElement(term519810, 6, (byte) 71);
        setByteElement(term519810, 7, (byte) 72);
        setByteElement(term519810, 8, (byte) 73);
        setByteElement(term519810, 9, (byte) 74);
        setByteElement(term519810, 10, (byte) 75);
        setByteElement(term519810, 11, (byte) 76);
        setByteElement(term519810, 12, (byte) 77);
        setByteElement(term519810, 13, (byte) 78);
        setByteElement(term519810, 14, (byte) 79);
        setByteElement(term519810, 15, (byte) 80);
        setByteElement(term519810, 16, (byte) 81);
        setByteElement(term519810, 17, (byte) 82);
        setByteElement(term519810, 18, (byte) 83);
        setByteElement(term519810, 19, (byte) 84);
        setByteElement(term519810, 20, (byte) 85);
        setByteElement(term519810, 21, (byte) 86);
        setByteElement(term519810, 22, (byte) 87);
        setByteElement(term519810, 23, (byte) 88);
        setByteElement(term519810, 24, (byte) 89);
        setByteElement(term519810, 25, (byte) 90);
        setByteElement(term519810, 26, (byte) 50);
        setByteElement(term519810, 27, (byte) 51);
        setByteElement(term519810, 28, (byte) 52);
        setByteElement(term519810, 29, (byte) 53);
        setByteElement(term519810, 30, (byte) 54);
        setByteElement(term519810, 31, (byte) 55);
        setField(term519808, term519808.getClass(), "encodeTable", term519810);
        setField(term519808, term519808.getClass(), "lineSeparator", null);
        setByteField(term519808, term519808.getClass(), "PAD", (byte) 61);
        setByteField(term519808, term519808.getClass(), "pad", (byte) 110);
        setIntField(term519808, term519808.getClass(), "unencodedBlockSize", 5);
        setIntField(term519808, term519808.getClass(), "encodedBlockSize", 8);
        setIntField(term519808, term519808.getClass(), "lineLength", 0);
        setIntField(term519808, term519808.getClass(), "chunkSeparatorLength", 0);
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
        args[2] = false;
        args[3] = (byte) 110;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term519808));
    }

};


