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

public class Base32_init_1042801703398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term792811;
     Object term826811;
     Object term826815;

    public Base32_init_1042801703398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term798661 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term793334 = (byte[]) newByteArray(0);
        setByteField(term798661, term798661.getClass(), "PAD", (byte) 0);
        setIntField(term798661, term798661.getClass(), "unencodedBlockSize", 0);
        setIntField(term798661, term798661.getClass(), "encodedBlockSize", 0);
        setIntField(term798661, term798661.getClass(), "lineLength", 0);
        setIntField(term798661, term798661.getClass(), "chunkSeparatorLength", 0);
        setByteField(term798661, term798661.getClass(), "pad", (byte) 0);
        setField(term798661, term798661.getClass(), "encodeTable", null);
        setField(term798661, term798661.getClass(), "decodeTable", term793334);
        setIntField(term798661, term798661.getClass(), "encodeSize", 0);
        setField(term798661, term798661.getClass(), "lineSeparator", null);
        setIntField(term798661, term798661.getClass(), "decodeSize", 0);
        term792811 = (byte[]) newByteArray(4);
        term826811 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term826812 = (byte[]) newByteArray(88);
        byte[] term826813 = (byte[]) newByteArray(32);
        byte[] term826814 = (byte[]) newByteArray(4);
        setIntField(term826811, term826811.getClass(), "decodeSize", 11);
        setByteElement(term826812, 0, (byte) -1);
        setByteElement(term826812, 1, (byte) -1);
        setByteElement(term826812, 2, (byte) -1);
        setByteElement(term826812, 3, (byte) -1);
        setByteElement(term826812, 4, (byte) -1);
        setByteElement(term826812, 5, (byte) -1);
        setByteElement(term826812, 6, (byte) -1);
        setByteElement(term826812, 7, (byte) -1);
        setByteElement(term826812, 8, (byte) -1);
        setByteElement(term826812, 9, (byte) -1);
        setByteElement(term826812, 10, (byte) -1);
        setByteElement(term826812, 11, (byte) -1);
        setByteElement(term826812, 12, (byte) -1);
        setByteElement(term826812, 13, (byte) -1);
        setByteElement(term826812, 14, (byte) -1);
        setByteElement(term826812, 15, (byte) -1);
        setByteElement(term826812, 16, (byte) -1);
        setByteElement(term826812, 17, (byte) -1);
        setByteElement(term826812, 18, (byte) -1);
        setByteElement(term826812, 19, (byte) -1);
        setByteElement(term826812, 20, (byte) -1);
        setByteElement(term826812, 21, (byte) -1);
        setByteElement(term826812, 22, (byte) -1);
        setByteElement(term826812, 23, (byte) -1);
        setByteElement(term826812, 24, (byte) -1);
        setByteElement(term826812, 25, (byte) -1);
        setByteElement(term826812, 26, (byte) -1);
        setByteElement(term826812, 27, (byte) -1);
        setByteElement(term826812, 28, (byte) -1);
        setByteElement(term826812, 29, (byte) -1);
        setByteElement(term826812, 30, (byte) -1);
        setByteElement(term826812, 31, (byte) -1);
        setByteElement(term826812, 32, (byte) -1);
        setByteElement(term826812, 33, (byte) -1);
        setByteElement(term826812, 34, (byte) -1);
        setByteElement(term826812, 35, (byte) -1);
        setByteElement(term826812, 36, (byte) -1);
        setByteElement(term826812, 37, (byte) -1);
        setByteElement(term826812, 38, (byte) -1);
        setByteElement(term826812, 39, (byte) -1);
        setByteElement(term826812, 40, (byte) -1);
        setByteElement(term826812, 41, (byte) -1);
        setByteElement(term826812, 42, (byte) -1);
        setByteElement(term826812, 43, (byte) -1);
        setByteElement(term826812, 44, (byte) -1);
        setByteElement(term826812, 45, (byte) -1);
        setByteElement(term826812, 46, (byte) -1);
        setByteElement(term826812, 47, (byte) -1);
        setByteElement(term826812, 49, (byte) 1);
        setByteElement(term826812, 50, (byte) 2);
        setByteElement(term826812, 51, (byte) 3);
        setByteElement(term826812, 52, (byte) 4);
        setByteElement(term826812, 53, (byte) 5);
        setByteElement(term826812, 54, (byte) 6);
        setByteElement(term826812, 55, (byte) 7);
        setByteElement(term826812, 56, (byte) 8);
        setByteElement(term826812, 57, (byte) 9);
        setByteElement(term826812, 58, (byte) -1);
        setByteElement(term826812, 59, (byte) -1);
        setByteElement(term826812, 60, (byte) -1);
        setByteElement(term826812, 61, (byte) -1);
        setByteElement(term826812, 62, (byte) -1);
        setByteElement(term826812, 63, (byte) -1);
        setByteElement(term826812, 64, (byte) -1);
        setByteElement(term826812, 65, (byte) 10);
        setByteElement(term826812, 66, (byte) 11);
        setByteElement(term826812, 67, (byte) 12);
        setByteElement(term826812, 68, (byte) 13);
        setByteElement(term826812, 69, (byte) 14);
        setByteElement(term826812, 70, (byte) 15);
        setByteElement(term826812, 71, (byte) 16);
        setByteElement(term826812, 72, (byte) 17);
        setByteElement(term826812, 73, (byte) 18);
        setByteElement(term826812, 74, (byte) 19);
        setByteElement(term826812, 75, (byte) 20);
        setByteElement(term826812, 76, (byte) 21);
        setByteElement(term826812, 77, (byte) 22);
        setByteElement(term826812, 78, (byte) 23);
        setByteElement(term826812, 79, (byte) 24);
        setByteElement(term826812, 80, (byte) 25);
        setByteElement(term826812, 81, (byte) 26);
        setByteElement(term826812, 82, (byte) 27);
        setByteElement(term826812, 83, (byte) 28);
        setByteElement(term826812, 84, (byte) 29);
        setByteElement(term826812, 85, (byte) 30);
        setByteElement(term826812, 86, (byte) 31);
        setByteElement(term826812, 87, (byte) 32);
        setField(term826811, term826811.getClass(), "decodeTable", term826812);
        setIntField(term826811, term826811.getClass(), "encodeSize", 12);
        setByteElement(term826813, 0, (byte) 48);
        setByteElement(term826813, 1, (byte) 49);
        setByteElement(term826813, 2, (byte) 50);
        setByteElement(term826813, 3, (byte) 51);
        setByteElement(term826813, 4, (byte) 52);
        setByteElement(term826813, 5, (byte) 53);
        setByteElement(term826813, 6, (byte) 54);
        setByteElement(term826813, 7, (byte) 55);
        setByteElement(term826813, 8, (byte) 56);
        setByteElement(term826813, 9, (byte) 57);
        setByteElement(term826813, 10, (byte) 65);
        setByteElement(term826813, 11, (byte) 66);
        setByteElement(term826813, 12, (byte) 67);
        setByteElement(term826813, 13, (byte) 68);
        setByteElement(term826813, 14, (byte) 69);
        setByteElement(term826813, 15, (byte) 70);
        setByteElement(term826813, 16, (byte) 71);
        setByteElement(term826813, 17, (byte) 72);
        setByteElement(term826813, 18, (byte) 73);
        setByteElement(term826813, 19, (byte) 74);
        setByteElement(term826813, 20, (byte) 75);
        setByteElement(term826813, 21, (byte) 76);
        setByteElement(term826813, 22, (byte) 77);
        setByteElement(term826813, 23, (byte) 78);
        setByteElement(term826813, 24, (byte) 79);
        setByteElement(term826813, 25, (byte) 80);
        setByteElement(term826813, 26, (byte) 81);
        setByteElement(term826813, 27, (byte) 82);
        setByteElement(term826813, 28, (byte) 83);
        setByteElement(term826813, 29, (byte) 84);
        setByteElement(term826813, 30, (byte) 85);
        setByteElement(term826813, 31, (byte) 86);
        setField(term826811, term826811.getClass(), "encodeTable", term826813);
        setField(term826811, term826811.getClass(), "lineSeparator", term826814);
        setByteField(term826811, term826811.getClass(), "PAD", (byte) 61);
        setByteField(term826811, term826811.getClass(), "pad", (byte) 61);
        setIntField(term826811, term826811.getClass(), "unencodedBlockSize", 5);
        setIntField(term826811, term826811.getClass(), "encodedBlockSize", 8);
        setIntField(term826811, term826811.getClass(), "lineLength", 0);
        setIntField(term826811, term826811.getClass(), "chunkSeparatorLength", 4);
        term826815 = (byte[]) newByteArray(4);
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
        args[1] = term792811;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term826811));
        assertTrue(recursiveEquals(term792811, term826815));
    }

};


