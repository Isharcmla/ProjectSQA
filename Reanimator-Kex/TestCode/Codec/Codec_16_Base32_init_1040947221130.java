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

public class Base32_init_1040947221130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199657;

    public Base32_init_1040947221130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term185858 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term185747 = (byte[]) newByteArray(0);
        setByteField(term185858, term185858.getClass(), "PAD", (byte) 0);
        setIntField(term185858, term185858.getClass(), "unencodedBlockSize", 0);
        setIntField(term185858, term185858.getClass(), "encodedBlockSize", 0);
        setIntField(term185858, term185858.getClass(), "lineLength", 0);
        setIntField(term185858, term185858.getClass(), "chunkSeparatorLength", 0);
        setByteField(term185858, term185858.getClass(), "pad", (byte) 0);
        setField(term185858, term185858.getClass(), "encodeTable", term185747);
        setField(term185858, term185858.getClass(), "decodeTable", term185747);
        setIntField(term185858, term185858.getClass(), "encodeSize", 0);
        setField(term185858, term185858.getClass(), "lineSeparator", term185747);
        setIntField(term185858, term185858.getClass(), "decodeSize", 0);
        term199657 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term199658 = (byte[]) newByteArray(88);
        byte[] term199659 = (byte[]) newByteArray(32);
        setIntField(term199657, term199657.getClass(), "decodeSize", 7);
        setByteElement(term199658, 0, (byte) -1);
        setByteElement(term199658, 1, (byte) -1);
        setByteElement(term199658, 2, (byte) -1);
        setByteElement(term199658, 3, (byte) -1);
        setByteElement(term199658, 4, (byte) -1);
        setByteElement(term199658, 5, (byte) -1);
        setByteElement(term199658, 6, (byte) -1);
        setByteElement(term199658, 7, (byte) -1);
        setByteElement(term199658, 8, (byte) -1);
        setByteElement(term199658, 9, (byte) -1);
        setByteElement(term199658, 10, (byte) -1);
        setByteElement(term199658, 11, (byte) -1);
        setByteElement(term199658, 12, (byte) -1);
        setByteElement(term199658, 13, (byte) -1);
        setByteElement(term199658, 14, (byte) -1);
        setByteElement(term199658, 15, (byte) -1);
        setByteElement(term199658, 16, (byte) -1);
        setByteElement(term199658, 17, (byte) -1);
        setByteElement(term199658, 18, (byte) -1);
        setByteElement(term199658, 19, (byte) -1);
        setByteElement(term199658, 20, (byte) -1);
        setByteElement(term199658, 21, (byte) -1);
        setByteElement(term199658, 22, (byte) -1);
        setByteElement(term199658, 23, (byte) -1);
        setByteElement(term199658, 24, (byte) -1);
        setByteElement(term199658, 25, (byte) -1);
        setByteElement(term199658, 26, (byte) -1);
        setByteElement(term199658, 27, (byte) -1);
        setByteElement(term199658, 28, (byte) -1);
        setByteElement(term199658, 29, (byte) -1);
        setByteElement(term199658, 30, (byte) -1);
        setByteElement(term199658, 31, (byte) -1);
        setByteElement(term199658, 32, (byte) -1);
        setByteElement(term199658, 33, (byte) -1);
        setByteElement(term199658, 34, (byte) -1);
        setByteElement(term199658, 35, (byte) -1);
        setByteElement(term199658, 36, (byte) -1);
        setByteElement(term199658, 37, (byte) -1);
        setByteElement(term199658, 38, (byte) -1);
        setByteElement(term199658, 39, (byte) -1);
        setByteElement(term199658, 40, (byte) -1);
        setByteElement(term199658, 41, (byte) -1);
        setByteElement(term199658, 42, (byte) -1);
        setByteElement(term199658, 43, (byte) -1);
        setByteElement(term199658, 44, (byte) -1);
        setByteElement(term199658, 45, (byte) -1);
        setByteElement(term199658, 46, (byte) -1);
        setByteElement(term199658, 47, (byte) -1);
        setByteElement(term199658, 49, (byte) 1);
        setByteElement(term199658, 50, (byte) 2);
        setByteElement(term199658, 51, (byte) 3);
        setByteElement(term199658, 52, (byte) 4);
        setByteElement(term199658, 53, (byte) 5);
        setByteElement(term199658, 54, (byte) 6);
        setByteElement(term199658, 55, (byte) 7);
        setByteElement(term199658, 56, (byte) 8);
        setByteElement(term199658, 57, (byte) 9);
        setByteElement(term199658, 58, (byte) -1);
        setByteElement(term199658, 59, (byte) -1);
        setByteElement(term199658, 60, (byte) -1);
        setByteElement(term199658, 61, (byte) -1);
        setByteElement(term199658, 62, (byte) -1);
        setByteElement(term199658, 63, (byte) -1);
        setByteElement(term199658, 64, (byte) -1);
        setByteElement(term199658, 65, (byte) 10);
        setByteElement(term199658, 66, (byte) 11);
        setByteElement(term199658, 67, (byte) 12);
        setByteElement(term199658, 68, (byte) 13);
        setByteElement(term199658, 69, (byte) 14);
        setByteElement(term199658, 70, (byte) 15);
        setByteElement(term199658, 71, (byte) 16);
        setByteElement(term199658, 72, (byte) 17);
        setByteElement(term199658, 73, (byte) 18);
        setByteElement(term199658, 74, (byte) 19);
        setByteElement(term199658, 75, (byte) 20);
        setByteElement(term199658, 76, (byte) 21);
        setByteElement(term199658, 77, (byte) 22);
        setByteElement(term199658, 78, (byte) 23);
        setByteElement(term199658, 79, (byte) 24);
        setByteElement(term199658, 80, (byte) 25);
        setByteElement(term199658, 81, (byte) 26);
        setByteElement(term199658, 82, (byte) 27);
        setByteElement(term199658, 83, (byte) 28);
        setByteElement(term199658, 84, (byte) 29);
        setByteElement(term199658, 85, (byte) 30);
        setByteElement(term199658, 86, (byte) 31);
        setByteElement(term199658, 87, (byte) 32);
        setField(term199657, term199657.getClass(), "decodeTable", term199658);
        setIntField(term199657, term199657.getClass(), "encodeSize", 8);
        setByteElement(term199659, 0, (byte) 48);
        setByteElement(term199659, 1, (byte) 49);
        setByteElement(term199659, 2, (byte) 50);
        setByteElement(term199659, 3, (byte) 51);
        setByteElement(term199659, 4, (byte) 52);
        setByteElement(term199659, 5, (byte) 53);
        setByteElement(term199659, 6, (byte) 54);
        setByteElement(term199659, 7, (byte) 55);
        setByteElement(term199659, 8, (byte) 56);
        setByteElement(term199659, 9, (byte) 57);
        setByteElement(term199659, 10, (byte) 65);
        setByteElement(term199659, 11, (byte) 66);
        setByteElement(term199659, 12, (byte) 67);
        setByteElement(term199659, 13, (byte) 68);
        setByteElement(term199659, 14, (byte) 69);
        setByteElement(term199659, 15, (byte) 70);
        setByteElement(term199659, 16, (byte) 71);
        setByteElement(term199659, 17, (byte) 72);
        setByteElement(term199659, 18, (byte) 73);
        setByteElement(term199659, 19, (byte) 74);
        setByteElement(term199659, 20, (byte) 75);
        setByteElement(term199659, 21, (byte) 76);
        setByteElement(term199659, 22, (byte) 77);
        setByteElement(term199659, 23, (byte) 78);
        setByteElement(term199659, 24, (byte) 79);
        setByteElement(term199659, 25, (byte) 80);
        setByteElement(term199659, 26, (byte) 81);
        setByteElement(term199659, 27, (byte) 82);
        setByteElement(term199659, 28, (byte) 83);
        setByteElement(term199659, 29, (byte) 84);
        setByteElement(term199659, 30, (byte) 85);
        setByteElement(term199659, 31, (byte) 86);
        setField(term199657, term199657.getClass(), "encodeTable", term199659);
        setField(term199657, term199657.getClass(), "lineSeparator", null);
        setByteField(term199657, term199657.getClass(), "PAD", (byte) 61);
        setByteField(term199657, term199657.getClass(), "pad", (byte) -128);
        setIntField(term199657, term199657.getClass(), "unencodedBlockSize", 5);
        setIntField(term199657, term199657.getClass(), "encodedBlockSize", 8);
        setIntField(term199657, term199657.getClass(), "lineLength", 0);
        setIntField(term199657, term199657.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = true;
        args[1] = (byte) -128;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term199657));
    }

};


