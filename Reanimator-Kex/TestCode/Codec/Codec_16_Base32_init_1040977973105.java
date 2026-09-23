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

public class Base32_init_1040977973105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114043;
     Object term114602;
     Object term114605;

    public Base32_init_1040977973105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114168 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term114050 = (byte[]) newByteArray(0);
        setByteField(term114168, term114168.getClass(), "PAD", (byte) 0);
        setIntField(term114168, term114168.getClass(), "unencodedBlockSize", 0);
        setIntField(term114168, term114168.getClass(), "encodedBlockSize", 0);
        setIntField(term114168, term114168.getClass(), "lineLength", 0);
        setIntField(term114168, term114168.getClass(), "chunkSeparatorLength", 0);
        setByteField(term114168, term114168.getClass(), "pad", (byte) 0);
        setField(term114168, term114168.getClass(), "encodeTable", term114050);
        setField(term114168, term114168.getClass(), "decodeTable", term114050);
        setIntField(term114168, term114168.getClass(), "encodeSize", 0);
        setField(term114168, term114168.getClass(), "lineSeparator", term114050);
        setIntField(term114168, term114168.getClass(), "decodeSize", 0);
        term114043 = (byte[]) newByteArray(0);
        term114602 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term114603 = (byte[]) newByteArray(91);
        byte[] term114604 = (byte[]) newByteArray(32);
        setIntField(term114602, term114602.getClass(), "decodeSize", 7);
        setByteElement(term114603, 0, (byte) -1);
        setByteElement(term114603, 1, (byte) -1);
        setByteElement(term114603, 2, (byte) -1);
        setByteElement(term114603, 3, (byte) -1);
        setByteElement(term114603, 4, (byte) -1);
        setByteElement(term114603, 5, (byte) -1);
        setByteElement(term114603, 6, (byte) -1);
        setByteElement(term114603, 7, (byte) -1);
        setByteElement(term114603, 8, (byte) -1);
        setByteElement(term114603, 9, (byte) -1);
        setByteElement(term114603, 10, (byte) -1);
        setByteElement(term114603, 11, (byte) -1);
        setByteElement(term114603, 12, (byte) -1);
        setByteElement(term114603, 13, (byte) -1);
        setByteElement(term114603, 14, (byte) -1);
        setByteElement(term114603, 15, (byte) -1);
        setByteElement(term114603, 16, (byte) -1);
        setByteElement(term114603, 17, (byte) -1);
        setByteElement(term114603, 18, (byte) -1);
        setByteElement(term114603, 19, (byte) -1);
        setByteElement(term114603, 20, (byte) -1);
        setByteElement(term114603, 21, (byte) -1);
        setByteElement(term114603, 22, (byte) -1);
        setByteElement(term114603, 23, (byte) -1);
        setByteElement(term114603, 24, (byte) -1);
        setByteElement(term114603, 25, (byte) -1);
        setByteElement(term114603, 26, (byte) -1);
        setByteElement(term114603, 27, (byte) -1);
        setByteElement(term114603, 28, (byte) -1);
        setByteElement(term114603, 29, (byte) -1);
        setByteElement(term114603, 30, (byte) -1);
        setByteElement(term114603, 31, (byte) -1);
        setByteElement(term114603, 32, (byte) -1);
        setByteElement(term114603, 33, (byte) -1);
        setByteElement(term114603, 34, (byte) -1);
        setByteElement(term114603, 35, (byte) -1);
        setByteElement(term114603, 36, (byte) -1);
        setByteElement(term114603, 37, (byte) -1);
        setByteElement(term114603, 38, (byte) -1);
        setByteElement(term114603, 39, (byte) -1);
        setByteElement(term114603, 40, (byte) -1);
        setByteElement(term114603, 41, (byte) -1);
        setByteElement(term114603, 42, (byte) -1);
        setByteElement(term114603, 43, (byte) -1);
        setByteElement(term114603, 44, (byte) -1);
        setByteElement(term114603, 45, (byte) -1);
        setByteElement(term114603, 46, (byte) -1);
        setByteElement(term114603, 47, (byte) -1);
        setByteElement(term114603, 48, (byte) -1);
        setByteElement(term114603, 49, (byte) -1);
        setByteElement(term114603, 50, (byte) 26);
        setByteElement(term114603, 51, (byte) 27);
        setByteElement(term114603, 52, (byte) 28);
        setByteElement(term114603, 53, (byte) 29);
        setByteElement(term114603, 54, (byte) 30);
        setByteElement(term114603, 55, (byte) 31);
        setByteElement(term114603, 56, (byte) -1);
        setByteElement(term114603, 57, (byte) -1);
        setByteElement(term114603, 58, (byte) -1);
        setByteElement(term114603, 59, (byte) -1);
        setByteElement(term114603, 60, (byte) -1);
        setByteElement(term114603, 61, (byte) -1);
        setByteElement(term114603, 62, (byte) -1);
        setByteElement(term114603, 63, (byte) -1);
        setByteElement(term114603, 64, (byte) -1);
        setByteElement(term114603, 66, (byte) 1);
        setByteElement(term114603, 67, (byte) 2);
        setByteElement(term114603, 68, (byte) 3);
        setByteElement(term114603, 69, (byte) 4);
        setByteElement(term114603, 70, (byte) 5);
        setByteElement(term114603, 71, (byte) 6);
        setByteElement(term114603, 72, (byte) 7);
        setByteElement(term114603, 73, (byte) 8);
        setByteElement(term114603, 74, (byte) 9);
        setByteElement(term114603, 75, (byte) 10);
        setByteElement(term114603, 76, (byte) 11);
        setByteElement(term114603, 77, (byte) 12);
        setByteElement(term114603, 78, (byte) 13);
        setByteElement(term114603, 79, (byte) 14);
        setByteElement(term114603, 80, (byte) 15);
        setByteElement(term114603, 81, (byte) 16);
        setByteElement(term114603, 82, (byte) 17);
        setByteElement(term114603, 83, (byte) 18);
        setByteElement(term114603, 84, (byte) 19);
        setByteElement(term114603, 85, (byte) 20);
        setByteElement(term114603, 86, (byte) 21);
        setByteElement(term114603, 87, (byte) 22);
        setByteElement(term114603, 88, (byte) 23);
        setByteElement(term114603, 89, (byte) 24);
        setByteElement(term114603, 90, (byte) 25);
        setField(term114602, term114602.getClass(), "decodeTable", term114603);
        setIntField(term114602, term114602.getClass(), "encodeSize", 8);
        setByteElement(term114604, 0, (byte) 65);
        setByteElement(term114604, 1, (byte) 66);
        setByteElement(term114604, 2, (byte) 67);
        setByteElement(term114604, 3, (byte) 68);
        setByteElement(term114604, 4, (byte) 69);
        setByteElement(term114604, 5, (byte) 70);
        setByteElement(term114604, 6, (byte) 71);
        setByteElement(term114604, 7, (byte) 72);
        setByteElement(term114604, 8, (byte) 73);
        setByteElement(term114604, 9, (byte) 74);
        setByteElement(term114604, 10, (byte) 75);
        setByteElement(term114604, 11, (byte) 76);
        setByteElement(term114604, 12, (byte) 77);
        setByteElement(term114604, 13, (byte) 78);
        setByteElement(term114604, 14, (byte) 79);
        setByteElement(term114604, 15, (byte) 80);
        setByteElement(term114604, 16, (byte) 81);
        setByteElement(term114604, 17, (byte) 82);
        setByteElement(term114604, 18, (byte) 83);
        setByteElement(term114604, 19, (byte) 84);
        setByteElement(term114604, 20, (byte) 85);
        setByteElement(term114604, 21, (byte) 86);
        setByteElement(term114604, 22, (byte) 87);
        setByteElement(term114604, 23, (byte) 88);
        setByteElement(term114604, 24, (byte) 89);
        setByteElement(term114604, 25, (byte) 90);
        setByteElement(term114604, 26, (byte) 50);
        setByteElement(term114604, 27, (byte) 51);
        setByteElement(term114604, 28, (byte) 52);
        setByteElement(term114604, 29, (byte) 53);
        setByteElement(term114604, 30, (byte) 54);
        setByteElement(term114604, 31, (byte) 55);
        setField(term114602, term114602.getClass(), "encodeTable", term114604);
        setField(term114602, term114602.getClass(), "lineSeparator", null);
        setByteField(term114602, term114602.getClass(), "PAD", (byte) 61);
        setByteField(term114602, term114602.getClass(), "pad", (byte) 61);
        setIntField(term114602, term114602.getClass(), "unencodedBlockSize", 5);
        setIntField(term114602, term114602.getClass(), "encodedBlockSize", 8);
        setIntField(term114602, term114602.getClass(), "lineLength", 0);
        setIntField(term114602, term114602.getClass(), "chunkSeparatorLength", 0);
        term114605 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term114043;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term114602));
        assertTrue(recursiveEquals(term114043, term114605));
    }

};


