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

public class Base32_init_1042801703229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435112;
     Object term435367;
     Object term435370;

    public Base32_init_1042801703229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term435213 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term435213, term435213.getClass(), "PAD", (byte) 0);
        setIntField(term435213, term435213.getClass(), "unencodedBlockSize", 0);
        setIntField(term435213, term435213.getClass(), "encodedBlockSize", 0);
        term435112 = (byte[]) newByteArray(0);
        term435367 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term435368 = (byte[]) newByteArray(91);
        byte[] term435369 = (byte[]) newByteArray(32);
        setIntField(term435367, term435367.getClass(), "decodeSize", 7);
        setByteElement(term435368, 0, (byte) -1);
        setByteElement(term435368, 1, (byte) -1);
        setByteElement(term435368, 2, (byte) -1);
        setByteElement(term435368, 3, (byte) -1);
        setByteElement(term435368, 4, (byte) -1);
        setByteElement(term435368, 5, (byte) -1);
        setByteElement(term435368, 6, (byte) -1);
        setByteElement(term435368, 7, (byte) -1);
        setByteElement(term435368, 8, (byte) -1);
        setByteElement(term435368, 9, (byte) -1);
        setByteElement(term435368, 10, (byte) -1);
        setByteElement(term435368, 11, (byte) -1);
        setByteElement(term435368, 12, (byte) -1);
        setByteElement(term435368, 13, (byte) -1);
        setByteElement(term435368, 14, (byte) -1);
        setByteElement(term435368, 15, (byte) -1);
        setByteElement(term435368, 16, (byte) -1);
        setByteElement(term435368, 17, (byte) -1);
        setByteElement(term435368, 18, (byte) -1);
        setByteElement(term435368, 19, (byte) -1);
        setByteElement(term435368, 20, (byte) -1);
        setByteElement(term435368, 21, (byte) -1);
        setByteElement(term435368, 22, (byte) -1);
        setByteElement(term435368, 23, (byte) -1);
        setByteElement(term435368, 24, (byte) -1);
        setByteElement(term435368, 25, (byte) -1);
        setByteElement(term435368, 26, (byte) -1);
        setByteElement(term435368, 27, (byte) -1);
        setByteElement(term435368, 28, (byte) -1);
        setByteElement(term435368, 29, (byte) -1);
        setByteElement(term435368, 30, (byte) -1);
        setByteElement(term435368, 31, (byte) -1);
        setByteElement(term435368, 32, (byte) -1);
        setByteElement(term435368, 33, (byte) -1);
        setByteElement(term435368, 34, (byte) -1);
        setByteElement(term435368, 35, (byte) -1);
        setByteElement(term435368, 36, (byte) -1);
        setByteElement(term435368, 37, (byte) -1);
        setByteElement(term435368, 38, (byte) -1);
        setByteElement(term435368, 39, (byte) -1);
        setByteElement(term435368, 40, (byte) -1);
        setByteElement(term435368, 41, (byte) -1);
        setByteElement(term435368, 42, (byte) -1);
        setByteElement(term435368, 43, (byte) -1);
        setByteElement(term435368, 44, (byte) -1);
        setByteElement(term435368, 45, (byte) -1);
        setByteElement(term435368, 46, (byte) -1);
        setByteElement(term435368, 47, (byte) -1);
        setByteElement(term435368, 48, (byte) -1);
        setByteElement(term435368, 49, (byte) -1);
        setByteElement(term435368, 50, (byte) 26);
        setByteElement(term435368, 51, (byte) 27);
        setByteElement(term435368, 52, (byte) 28);
        setByteElement(term435368, 53, (byte) 29);
        setByteElement(term435368, 54, (byte) 30);
        setByteElement(term435368, 55, (byte) 31);
        setByteElement(term435368, 56, (byte) -1);
        setByteElement(term435368, 57, (byte) -1);
        setByteElement(term435368, 58, (byte) -1);
        setByteElement(term435368, 59, (byte) -1);
        setByteElement(term435368, 60, (byte) -1);
        setByteElement(term435368, 61, (byte) -1);
        setByteElement(term435368, 62, (byte) -1);
        setByteElement(term435368, 63, (byte) -1);
        setByteElement(term435368, 64, (byte) -1);
        setByteElement(term435368, 66, (byte) 1);
        setByteElement(term435368, 67, (byte) 2);
        setByteElement(term435368, 68, (byte) 3);
        setByteElement(term435368, 69, (byte) 4);
        setByteElement(term435368, 70, (byte) 5);
        setByteElement(term435368, 71, (byte) 6);
        setByteElement(term435368, 72, (byte) 7);
        setByteElement(term435368, 73, (byte) 8);
        setByteElement(term435368, 74, (byte) 9);
        setByteElement(term435368, 75, (byte) 10);
        setByteElement(term435368, 76, (byte) 11);
        setByteElement(term435368, 77, (byte) 12);
        setByteElement(term435368, 78, (byte) 13);
        setByteElement(term435368, 79, (byte) 14);
        setByteElement(term435368, 80, (byte) 15);
        setByteElement(term435368, 81, (byte) 16);
        setByteElement(term435368, 82, (byte) 17);
        setByteElement(term435368, 83, (byte) 18);
        setByteElement(term435368, 84, (byte) 19);
        setByteElement(term435368, 85, (byte) 20);
        setByteElement(term435368, 86, (byte) 21);
        setByteElement(term435368, 87, (byte) 22);
        setByteElement(term435368, 88, (byte) 23);
        setByteElement(term435368, 89, (byte) 24);
        setByteElement(term435368, 90, (byte) 25);
        setField(term435367, term435367.getClass(), "decodeTable", term435368);
        setIntField(term435367, term435367.getClass(), "encodeSize", 8);
        setByteElement(term435369, 0, (byte) 65);
        setByteElement(term435369, 1, (byte) 66);
        setByteElement(term435369, 2, (byte) 67);
        setByteElement(term435369, 3, (byte) 68);
        setByteElement(term435369, 4, (byte) 69);
        setByteElement(term435369, 5, (byte) 70);
        setByteElement(term435369, 6, (byte) 71);
        setByteElement(term435369, 7, (byte) 72);
        setByteElement(term435369, 8, (byte) 73);
        setByteElement(term435369, 9, (byte) 74);
        setByteElement(term435369, 10, (byte) 75);
        setByteElement(term435369, 11, (byte) 76);
        setByteElement(term435369, 12, (byte) 77);
        setByteElement(term435369, 13, (byte) 78);
        setByteElement(term435369, 14, (byte) 79);
        setByteElement(term435369, 15, (byte) 80);
        setByteElement(term435369, 16, (byte) 81);
        setByteElement(term435369, 17, (byte) 82);
        setByteElement(term435369, 18, (byte) 83);
        setByteElement(term435369, 19, (byte) 84);
        setByteElement(term435369, 20, (byte) 85);
        setByteElement(term435369, 21, (byte) 86);
        setByteElement(term435369, 22, (byte) 87);
        setByteElement(term435369, 23, (byte) 88);
        setByteElement(term435369, 24, (byte) 89);
        setByteElement(term435369, 25, (byte) 90);
        setByteElement(term435369, 26, (byte) 50);
        setByteElement(term435369, 27, (byte) 51);
        setByteElement(term435369, 28, (byte) 52);
        setByteElement(term435369, 29, (byte) 53);
        setByteElement(term435369, 30, (byte) 54);
        setByteElement(term435369, 31, (byte) 55);
        setField(term435367, term435367.getClass(), "encodeTable", term435369);
        setField(term435367, term435367.getClass(), "lineSeparator", null);
        setByteField(term435367, term435367.getClass(), "PAD", (byte) 61);
        setByteField(term435367, term435367.getClass(), "pad", (byte) 61);
        setIntField(term435367, term435367.getClass(), "unencodedBlockSize", 5);
        setIntField(term435367, term435367.getClass(), "encodedBlockSize", 8);
        setIntField(term435367, term435367.getClass(), "lineLength", 0);
        setIntField(term435367, term435367.getClass(), "chunkSeparatorLength", 0);
        term435370 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term435112;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term435367));
        assertTrue(recursiveEquals(term435112, term435370));
    }

};


