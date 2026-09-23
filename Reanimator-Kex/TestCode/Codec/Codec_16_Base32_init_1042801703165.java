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

public class Base32_init_1042801703165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278687;
     Object term318054;
     Object term318058;

    public Base32_init_1042801703165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280302 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term280302, term280302.getClass(), "PAD", (byte) -128);
        setIntField(term280302, term280302.getClass(), "unencodedBlockSize", 0);
        setIntField(term280302, term280302.getClass(), "encodedBlockSize", 0);
        setIntField(term280302, term280302.getClass(), "lineLength", 0);
        setIntField(term280302, term280302.getClass(), "chunkSeparatorLength", 0);
        setByteField(term280302, term280302.getClass(), "pad", (byte) -128);
        setField(term280302, term280302.getClass(), "encodeTable", null);
        setField(term280302, term280302.getClass(), "decodeTable", null);
        term278687 = (byte[]) newByteArray(1);
        term318054 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term318055 = (byte[]) newByteArray(88);
        byte[] term318056 = (byte[]) newByteArray(32);
        byte[] term318057 = (byte[]) newByteArray(1);
        setIntField(term318054, term318054.getClass(), "decodeSize", 8);
        setByteElement(term318055, 0, (byte) -1);
        setByteElement(term318055, 1, (byte) -1);
        setByteElement(term318055, 2, (byte) -1);
        setByteElement(term318055, 3, (byte) -1);
        setByteElement(term318055, 4, (byte) -1);
        setByteElement(term318055, 5, (byte) -1);
        setByteElement(term318055, 6, (byte) -1);
        setByteElement(term318055, 7, (byte) -1);
        setByteElement(term318055, 8, (byte) -1);
        setByteElement(term318055, 9, (byte) -1);
        setByteElement(term318055, 10, (byte) -1);
        setByteElement(term318055, 11, (byte) -1);
        setByteElement(term318055, 12, (byte) -1);
        setByteElement(term318055, 13, (byte) -1);
        setByteElement(term318055, 14, (byte) -1);
        setByteElement(term318055, 15, (byte) -1);
        setByteElement(term318055, 16, (byte) -1);
        setByteElement(term318055, 17, (byte) -1);
        setByteElement(term318055, 18, (byte) -1);
        setByteElement(term318055, 19, (byte) -1);
        setByteElement(term318055, 20, (byte) -1);
        setByteElement(term318055, 21, (byte) -1);
        setByteElement(term318055, 22, (byte) -1);
        setByteElement(term318055, 23, (byte) -1);
        setByteElement(term318055, 24, (byte) -1);
        setByteElement(term318055, 25, (byte) -1);
        setByteElement(term318055, 26, (byte) -1);
        setByteElement(term318055, 27, (byte) -1);
        setByteElement(term318055, 28, (byte) -1);
        setByteElement(term318055, 29, (byte) -1);
        setByteElement(term318055, 30, (byte) -1);
        setByteElement(term318055, 31, (byte) -1);
        setByteElement(term318055, 32, (byte) -1);
        setByteElement(term318055, 33, (byte) -1);
        setByteElement(term318055, 34, (byte) -1);
        setByteElement(term318055, 35, (byte) -1);
        setByteElement(term318055, 36, (byte) -1);
        setByteElement(term318055, 37, (byte) -1);
        setByteElement(term318055, 38, (byte) -1);
        setByteElement(term318055, 39, (byte) -1);
        setByteElement(term318055, 40, (byte) -1);
        setByteElement(term318055, 41, (byte) -1);
        setByteElement(term318055, 42, (byte) -1);
        setByteElement(term318055, 43, (byte) -1);
        setByteElement(term318055, 44, (byte) -1);
        setByteElement(term318055, 45, (byte) -1);
        setByteElement(term318055, 46, (byte) -1);
        setByteElement(term318055, 47, (byte) -1);
        setByteElement(term318055, 49, (byte) 1);
        setByteElement(term318055, 50, (byte) 2);
        setByteElement(term318055, 51, (byte) 3);
        setByteElement(term318055, 52, (byte) 4);
        setByteElement(term318055, 53, (byte) 5);
        setByteElement(term318055, 54, (byte) 6);
        setByteElement(term318055, 55, (byte) 7);
        setByteElement(term318055, 56, (byte) 8);
        setByteElement(term318055, 57, (byte) 9);
        setByteElement(term318055, 58, (byte) -1);
        setByteElement(term318055, 59, (byte) -1);
        setByteElement(term318055, 60, (byte) -1);
        setByteElement(term318055, 61, (byte) -1);
        setByteElement(term318055, 62, (byte) -1);
        setByteElement(term318055, 63, (byte) -1);
        setByteElement(term318055, 64, (byte) -1);
        setByteElement(term318055, 65, (byte) 10);
        setByteElement(term318055, 66, (byte) 11);
        setByteElement(term318055, 67, (byte) 12);
        setByteElement(term318055, 68, (byte) 13);
        setByteElement(term318055, 69, (byte) 14);
        setByteElement(term318055, 70, (byte) 15);
        setByteElement(term318055, 71, (byte) 16);
        setByteElement(term318055, 72, (byte) 17);
        setByteElement(term318055, 73, (byte) 18);
        setByteElement(term318055, 74, (byte) 19);
        setByteElement(term318055, 75, (byte) 20);
        setByteElement(term318055, 76, (byte) 21);
        setByteElement(term318055, 77, (byte) 22);
        setByteElement(term318055, 78, (byte) 23);
        setByteElement(term318055, 79, (byte) 24);
        setByteElement(term318055, 80, (byte) 25);
        setByteElement(term318055, 81, (byte) 26);
        setByteElement(term318055, 82, (byte) 27);
        setByteElement(term318055, 83, (byte) 28);
        setByteElement(term318055, 84, (byte) 29);
        setByteElement(term318055, 85, (byte) 30);
        setByteElement(term318055, 86, (byte) 31);
        setByteElement(term318055, 87, (byte) 32);
        setField(term318054, term318054.getClass(), "decodeTable", term318055);
        setIntField(term318054, term318054.getClass(), "encodeSize", 9);
        setByteElement(term318056, 0, (byte) 48);
        setByteElement(term318056, 1, (byte) 49);
        setByteElement(term318056, 2, (byte) 50);
        setByteElement(term318056, 3, (byte) 51);
        setByteElement(term318056, 4, (byte) 52);
        setByteElement(term318056, 5, (byte) 53);
        setByteElement(term318056, 6, (byte) 54);
        setByteElement(term318056, 7, (byte) 55);
        setByteElement(term318056, 8, (byte) 56);
        setByteElement(term318056, 9, (byte) 57);
        setByteElement(term318056, 10, (byte) 65);
        setByteElement(term318056, 11, (byte) 66);
        setByteElement(term318056, 12, (byte) 67);
        setByteElement(term318056, 13, (byte) 68);
        setByteElement(term318056, 14, (byte) 69);
        setByteElement(term318056, 15, (byte) 70);
        setByteElement(term318056, 16, (byte) 71);
        setByteElement(term318056, 17, (byte) 72);
        setByteElement(term318056, 18, (byte) 73);
        setByteElement(term318056, 19, (byte) 74);
        setByteElement(term318056, 20, (byte) 75);
        setByteElement(term318056, 21, (byte) 76);
        setByteElement(term318056, 22, (byte) 77);
        setByteElement(term318056, 23, (byte) 78);
        setByteElement(term318056, 24, (byte) 79);
        setByteElement(term318056, 25, (byte) 80);
        setByteElement(term318056, 26, (byte) 81);
        setByteElement(term318056, 27, (byte) 82);
        setByteElement(term318056, 28, (byte) 83);
        setByteElement(term318056, 29, (byte) 84);
        setByteElement(term318056, 30, (byte) 85);
        setByteElement(term318056, 31, (byte) 86);
        setField(term318054, term318054.getClass(), "encodeTable", term318056);
        setField(term318054, term318054.getClass(), "lineSeparator", term318057);
        setByteField(term318054, term318054.getClass(), "PAD", (byte) 61);
        setByteField(term318054, term318054.getClass(), "pad", (byte) 61);
        setIntField(term318054, term318054.getClass(), "unencodedBlockSize", 5);
        setIntField(term318054, term318054.getClass(), "encodedBlockSize", 8);
        setIntField(term318054, term318054.getClass(), "lineLength", 0);
        setIntField(term318054, term318054.getClass(), "chunkSeparatorLength", 1);
        term318058 = (byte[]) newByteArray(1);
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
        args[1] = term278687;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term318054));
        assertTrue(recursiveEquals(term278687, term318058));
    }

};


