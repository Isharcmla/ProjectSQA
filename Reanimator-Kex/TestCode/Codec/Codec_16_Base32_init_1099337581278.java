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

public class Base32_init_1099337581278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510341;

    public Base32_init_1099337581278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term509840 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term509535 = (byte[]) newByteArray(0);
        byte[] term509340 = (byte[]) newByteArray(194);
        setByteField(term509840, term509840.getClass(), "PAD", (byte) 0);
        setIntField(term509840, term509840.getClass(), "unencodedBlockSize", 0);
        setIntField(term509840, term509840.getClass(), "encodedBlockSize", 0);
        setIntField(term509840, term509840.getClass(), "lineLength", 0);
        setIntField(term509840, term509840.getClass(), "chunkSeparatorLength", 0);
        setByteField(term509840, term509840.getClass(), "pad", (byte) 0);
        setField(term509840, term509840.getClass(), "encodeTable", term509535);
        setField(term509840, term509840.getClass(), "decodeTable", term509340);
        setIntField(term509840, term509840.getClass(), "encodeSize", 0);
        setField(term509840, term509840.getClass(), "lineSeparator", term509340);
        setIntField(term509840, term509840.getClass(), "decodeSize", 0);
        term510341 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term510342 = (byte[]) newByteArray(91);
        byte[] term510343 = (byte[]) newByteArray(32);
        setIntField(term510341, term510341.getClass(), "decodeSize", 7);
        setByteElement(term510342, 0, (byte) -1);
        setByteElement(term510342, 1, (byte) -1);
        setByteElement(term510342, 2, (byte) -1);
        setByteElement(term510342, 3, (byte) -1);
        setByteElement(term510342, 4, (byte) -1);
        setByteElement(term510342, 5, (byte) -1);
        setByteElement(term510342, 6, (byte) -1);
        setByteElement(term510342, 7, (byte) -1);
        setByteElement(term510342, 8, (byte) -1);
        setByteElement(term510342, 9, (byte) -1);
        setByteElement(term510342, 10, (byte) -1);
        setByteElement(term510342, 11, (byte) -1);
        setByteElement(term510342, 12, (byte) -1);
        setByteElement(term510342, 13, (byte) -1);
        setByteElement(term510342, 14, (byte) -1);
        setByteElement(term510342, 15, (byte) -1);
        setByteElement(term510342, 16, (byte) -1);
        setByteElement(term510342, 17, (byte) -1);
        setByteElement(term510342, 18, (byte) -1);
        setByteElement(term510342, 19, (byte) -1);
        setByteElement(term510342, 20, (byte) -1);
        setByteElement(term510342, 21, (byte) -1);
        setByteElement(term510342, 22, (byte) -1);
        setByteElement(term510342, 23, (byte) -1);
        setByteElement(term510342, 24, (byte) -1);
        setByteElement(term510342, 25, (byte) -1);
        setByteElement(term510342, 26, (byte) -1);
        setByteElement(term510342, 27, (byte) -1);
        setByteElement(term510342, 28, (byte) -1);
        setByteElement(term510342, 29, (byte) -1);
        setByteElement(term510342, 30, (byte) -1);
        setByteElement(term510342, 31, (byte) -1);
        setByteElement(term510342, 32, (byte) -1);
        setByteElement(term510342, 33, (byte) -1);
        setByteElement(term510342, 34, (byte) -1);
        setByteElement(term510342, 35, (byte) -1);
        setByteElement(term510342, 36, (byte) -1);
        setByteElement(term510342, 37, (byte) -1);
        setByteElement(term510342, 38, (byte) -1);
        setByteElement(term510342, 39, (byte) -1);
        setByteElement(term510342, 40, (byte) -1);
        setByteElement(term510342, 41, (byte) -1);
        setByteElement(term510342, 42, (byte) -1);
        setByteElement(term510342, 43, (byte) -1);
        setByteElement(term510342, 44, (byte) -1);
        setByteElement(term510342, 45, (byte) -1);
        setByteElement(term510342, 46, (byte) -1);
        setByteElement(term510342, 47, (byte) -1);
        setByteElement(term510342, 48, (byte) -1);
        setByteElement(term510342, 49, (byte) -1);
        setByteElement(term510342, 50, (byte) 26);
        setByteElement(term510342, 51, (byte) 27);
        setByteElement(term510342, 52, (byte) 28);
        setByteElement(term510342, 53, (byte) 29);
        setByteElement(term510342, 54, (byte) 30);
        setByteElement(term510342, 55, (byte) 31);
        setByteElement(term510342, 56, (byte) -1);
        setByteElement(term510342, 57, (byte) -1);
        setByteElement(term510342, 58, (byte) -1);
        setByteElement(term510342, 59, (byte) -1);
        setByteElement(term510342, 60, (byte) -1);
        setByteElement(term510342, 61, (byte) -1);
        setByteElement(term510342, 62, (byte) -1);
        setByteElement(term510342, 63, (byte) -1);
        setByteElement(term510342, 64, (byte) -1);
        setByteElement(term510342, 66, (byte) 1);
        setByteElement(term510342, 67, (byte) 2);
        setByteElement(term510342, 68, (byte) 3);
        setByteElement(term510342, 69, (byte) 4);
        setByteElement(term510342, 70, (byte) 5);
        setByteElement(term510342, 71, (byte) 6);
        setByteElement(term510342, 72, (byte) 7);
        setByteElement(term510342, 73, (byte) 8);
        setByteElement(term510342, 74, (byte) 9);
        setByteElement(term510342, 75, (byte) 10);
        setByteElement(term510342, 76, (byte) 11);
        setByteElement(term510342, 77, (byte) 12);
        setByteElement(term510342, 78, (byte) 13);
        setByteElement(term510342, 79, (byte) 14);
        setByteElement(term510342, 80, (byte) 15);
        setByteElement(term510342, 81, (byte) 16);
        setByteElement(term510342, 82, (byte) 17);
        setByteElement(term510342, 83, (byte) 18);
        setByteElement(term510342, 84, (byte) 19);
        setByteElement(term510342, 85, (byte) 20);
        setByteElement(term510342, 86, (byte) 21);
        setByteElement(term510342, 87, (byte) 22);
        setByteElement(term510342, 88, (byte) 23);
        setByteElement(term510342, 89, (byte) 24);
        setByteElement(term510342, 90, (byte) 25);
        setField(term510341, term510341.getClass(), "decodeTable", term510342);
        setIntField(term510341, term510341.getClass(), "encodeSize", 8);
        setByteElement(term510343, 0, (byte) 65);
        setByteElement(term510343, 1, (byte) 66);
        setByteElement(term510343, 2, (byte) 67);
        setByteElement(term510343, 3, (byte) 68);
        setByteElement(term510343, 4, (byte) 69);
        setByteElement(term510343, 5, (byte) 70);
        setByteElement(term510343, 6, (byte) 71);
        setByteElement(term510343, 7, (byte) 72);
        setByteElement(term510343, 8, (byte) 73);
        setByteElement(term510343, 9, (byte) 74);
        setByteElement(term510343, 10, (byte) 75);
        setByteElement(term510343, 11, (byte) 76);
        setByteElement(term510343, 12, (byte) 77);
        setByteElement(term510343, 13, (byte) 78);
        setByteElement(term510343, 14, (byte) 79);
        setByteElement(term510343, 15, (byte) 80);
        setByteElement(term510343, 16, (byte) 81);
        setByteElement(term510343, 17, (byte) 82);
        setByteElement(term510343, 18, (byte) 83);
        setByteElement(term510343, 19, (byte) 84);
        setByteElement(term510343, 20, (byte) 85);
        setByteElement(term510343, 21, (byte) 86);
        setByteElement(term510343, 22, (byte) 87);
        setByteElement(term510343, 23, (byte) 88);
        setByteElement(term510343, 24, (byte) 89);
        setByteElement(term510343, 25, (byte) 90);
        setByteElement(term510343, 26, (byte) 50);
        setByteElement(term510343, 27, (byte) 51);
        setByteElement(term510343, 28, (byte) 52);
        setByteElement(term510343, 29, (byte) 53);
        setByteElement(term510343, 30, (byte) 54);
        setByteElement(term510343, 31, (byte) 55);
        setField(term510341, term510341.getClass(), "encodeTable", term510343);
        setField(term510341, term510341.getClass(), "lineSeparator", null);
        setByteField(term510341, term510341.getClass(), "PAD", (byte) 61);
        setByteField(term510341, term510341.getClass(), "pad", (byte) -128);
        setIntField(term510341, term510341.getClass(), "unencodedBlockSize", 5);
        setIntField(term510341, term510341.getClass(), "encodedBlockSize", 8);
        setIntField(term510341, term510341.getClass(), "lineLength", 0);
        setIntField(term510341, term510341.getClass(), "chunkSeparatorLength", 0);
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
        args[3] = (byte) -128;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term510341));
    }

};


