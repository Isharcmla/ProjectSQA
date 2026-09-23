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

public class Base32_init_1042801703159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277720;
     Object term278347;
     Object term278351;

    public Base32_init_1042801703159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term277829 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term277829, term277829.getClass(), "PAD", (byte) 0);
        setIntField(term277829, term277829.getClass(), "unencodedBlockSize", 0);
        setIntField(term277829, term277829.getClass(), "encodedBlockSize", 0);
        setIntField(term277829, term277829.getClass(), "lineLength", 0);
        setIntField(term277829, term277829.getClass(), "chunkSeparatorLength", 0);
        setByteField(term277829, term277829.getClass(), "pad", (byte) 0);
        term277720 = (byte[]) newByteArray(0);
        term278347 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term278348 = (byte[]) newByteArray(88);
        byte[] term278349 = (byte[]) newByteArray(32);
        byte[] term278350 = (byte[]) newByteArray(0);
        setIntField(term278347, term278347.getClass(), "decodeSize", 7);
        setByteElement(term278348, 0, (byte) -1);
        setByteElement(term278348, 1, (byte) -1);
        setByteElement(term278348, 2, (byte) -1);
        setByteElement(term278348, 3, (byte) -1);
        setByteElement(term278348, 4, (byte) -1);
        setByteElement(term278348, 5, (byte) -1);
        setByteElement(term278348, 6, (byte) -1);
        setByteElement(term278348, 7, (byte) -1);
        setByteElement(term278348, 8, (byte) -1);
        setByteElement(term278348, 9, (byte) -1);
        setByteElement(term278348, 10, (byte) -1);
        setByteElement(term278348, 11, (byte) -1);
        setByteElement(term278348, 12, (byte) -1);
        setByteElement(term278348, 13, (byte) -1);
        setByteElement(term278348, 14, (byte) -1);
        setByteElement(term278348, 15, (byte) -1);
        setByteElement(term278348, 16, (byte) -1);
        setByteElement(term278348, 17, (byte) -1);
        setByteElement(term278348, 18, (byte) -1);
        setByteElement(term278348, 19, (byte) -1);
        setByteElement(term278348, 20, (byte) -1);
        setByteElement(term278348, 21, (byte) -1);
        setByteElement(term278348, 22, (byte) -1);
        setByteElement(term278348, 23, (byte) -1);
        setByteElement(term278348, 24, (byte) -1);
        setByteElement(term278348, 25, (byte) -1);
        setByteElement(term278348, 26, (byte) -1);
        setByteElement(term278348, 27, (byte) -1);
        setByteElement(term278348, 28, (byte) -1);
        setByteElement(term278348, 29, (byte) -1);
        setByteElement(term278348, 30, (byte) -1);
        setByteElement(term278348, 31, (byte) -1);
        setByteElement(term278348, 32, (byte) -1);
        setByteElement(term278348, 33, (byte) -1);
        setByteElement(term278348, 34, (byte) -1);
        setByteElement(term278348, 35, (byte) -1);
        setByteElement(term278348, 36, (byte) -1);
        setByteElement(term278348, 37, (byte) -1);
        setByteElement(term278348, 38, (byte) -1);
        setByteElement(term278348, 39, (byte) -1);
        setByteElement(term278348, 40, (byte) -1);
        setByteElement(term278348, 41, (byte) -1);
        setByteElement(term278348, 42, (byte) -1);
        setByteElement(term278348, 43, (byte) -1);
        setByteElement(term278348, 44, (byte) -1);
        setByteElement(term278348, 45, (byte) -1);
        setByteElement(term278348, 46, (byte) -1);
        setByteElement(term278348, 47, (byte) -1);
        setByteElement(term278348, 49, (byte) 1);
        setByteElement(term278348, 50, (byte) 2);
        setByteElement(term278348, 51, (byte) 3);
        setByteElement(term278348, 52, (byte) 4);
        setByteElement(term278348, 53, (byte) 5);
        setByteElement(term278348, 54, (byte) 6);
        setByteElement(term278348, 55, (byte) 7);
        setByteElement(term278348, 56, (byte) 8);
        setByteElement(term278348, 57, (byte) 9);
        setByteElement(term278348, 58, (byte) -1);
        setByteElement(term278348, 59, (byte) -1);
        setByteElement(term278348, 60, (byte) -1);
        setByteElement(term278348, 61, (byte) -1);
        setByteElement(term278348, 62, (byte) -1);
        setByteElement(term278348, 63, (byte) -1);
        setByteElement(term278348, 64, (byte) -1);
        setByteElement(term278348, 65, (byte) 10);
        setByteElement(term278348, 66, (byte) 11);
        setByteElement(term278348, 67, (byte) 12);
        setByteElement(term278348, 68, (byte) 13);
        setByteElement(term278348, 69, (byte) 14);
        setByteElement(term278348, 70, (byte) 15);
        setByteElement(term278348, 71, (byte) 16);
        setByteElement(term278348, 72, (byte) 17);
        setByteElement(term278348, 73, (byte) 18);
        setByteElement(term278348, 74, (byte) 19);
        setByteElement(term278348, 75, (byte) 20);
        setByteElement(term278348, 76, (byte) 21);
        setByteElement(term278348, 77, (byte) 22);
        setByteElement(term278348, 78, (byte) 23);
        setByteElement(term278348, 79, (byte) 24);
        setByteElement(term278348, 80, (byte) 25);
        setByteElement(term278348, 81, (byte) 26);
        setByteElement(term278348, 82, (byte) 27);
        setByteElement(term278348, 83, (byte) 28);
        setByteElement(term278348, 84, (byte) 29);
        setByteElement(term278348, 85, (byte) 30);
        setByteElement(term278348, 86, (byte) 31);
        setByteElement(term278348, 87, (byte) 32);
        setField(term278347, term278347.getClass(), "decodeTable", term278348);
        setIntField(term278347, term278347.getClass(), "encodeSize", 8);
        setByteElement(term278349, 0, (byte) 48);
        setByteElement(term278349, 1, (byte) 49);
        setByteElement(term278349, 2, (byte) 50);
        setByteElement(term278349, 3, (byte) 51);
        setByteElement(term278349, 4, (byte) 52);
        setByteElement(term278349, 5, (byte) 53);
        setByteElement(term278349, 6, (byte) 54);
        setByteElement(term278349, 7, (byte) 55);
        setByteElement(term278349, 8, (byte) 56);
        setByteElement(term278349, 9, (byte) 57);
        setByteElement(term278349, 10, (byte) 65);
        setByteElement(term278349, 11, (byte) 66);
        setByteElement(term278349, 12, (byte) 67);
        setByteElement(term278349, 13, (byte) 68);
        setByteElement(term278349, 14, (byte) 69);
        setByteElement(term278349, 15, (byte) 70);
        setByteElement(term278349, 16, (byte) 71);
        setByteElement(term278349, 17, (byte) 72);
        setByteElement(term278349, 18, (byte) 73);
        setByteElement(term278349, 19, (byte) 74);
        setByteElement(term278349, 20, (byte) 75);
        setByteElement(term278349, 21, (byte) 76);
        setByteElement(term278349, 22, (byte) 77);
        setByteElement(term278349, 23, (byte) 78);
        setByteElement(term278349, 24, (byte) 79);
        setByteElement(term278349, 25, (byte) 80);
        setByteElement(term278349, 26, (byte) 81);
        setByteElement(term278349, 27, (byte) 82);
        setByteElement(term278349, 28, (byte) 83);
        setByteElement(term278349, 29, (byte) 84);
        setByteElement(term278349, 30, (byte) 85);
        setByteElement(term278349, 31, (byte) 86);
        setField(term278347, term278347.getClass(), "encodeTable", term278349);
        setField(term278347, term278347.getClass(), "lineSeparator", term278350);
        setByteField(term278347, term278347.getClass(), "PAD", (byte) 61);
        setByteField(term278347, term278347.getClass(), "pad", (byte) 61);
        setIntField(term278347, term278347.getClass(), "unencodedBlockSize", 5);
        setIntField(term278347, term278347.getClass(), "encodedBlockSize", 8);
        setIntField(term278347, term278347.getClass(), "lineLength", 0);
        setIntField(term278347, term278347.getClass(), "chunkSeparatorLength", 0);
        term278351 = (byte[]) newByteArray(0);
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
        args[1] = term277720;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term278347));
        assertTrue(recursiveEquals(term277720, term278351));
    }

};


