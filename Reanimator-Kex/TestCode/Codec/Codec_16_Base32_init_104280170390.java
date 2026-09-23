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

public class Base32_init_104280170390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78713;
     Object term93119;
     Object term93123;

    public Base32_init_104280170390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81330 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term81330, term81330.getClass(), "PAD", (byte) -128);
        setIntField(term81330, term81330.getClass(), "unencodedBlockSize", 0);
        setIntField(term81330, term81330.getClass(), "encodedBlockSize", 0);
        setIntField(term81330, term81330.getClass(), "lineLength", 0);
        setIntField(term81330, term81330.getClass(), "chunkSeparatorLength", 0);
        setByteField(term81330, term81330.getClass(), "pad", (byte) -128);
        setField(term81330, term81330.getClass(), "encodeTable", null);
        setField(term81330, term81330.getClass(), "decodeTable", null);
        term78713 = (byte[]) newByteArray(2);
        term93119 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term93120 = (byte[]) newByteArray(88);
        byte[] term93121 = (byte[]) newByteArray(32);
        byte[] term93122 = (byte[]) newByteArray(2);
        setIntField(term93119, term93119.getClass(), "decodeSize", 9);
        setByteElement(term93120, 0, (byte) -1);
        setByteElement(term93120, 1, (byte) -1);
        setByteElement(term93120, 2, (byte) -1);
        setByteElement(term93120, 3, (byte) -1);
        setByteElement(term93120, 4, (byte) -1);
        setByteElement(term93120, 5, (byte) -1);
        setByteElement(term93120, 6, (byte) -1);
        setByteElement(term93120, 7, (byte) -1);
        setByteElement(term93120, 8, (byte) -1);
        setByteElement(term93120, 9, (byte) -1);
        setByteElement(term93120, 10, (byte) -1);
        setByteElement(term93120, 11, (byte) -1);
        setByteElement(term93120, 12, (byte) -1);
        setByteElement(term93120, 13, (byte) -1);
        setByteElement(term93120, 14, (byte) -1);
        setByteElement(term93120, 15, (byte) -1);
        setByteElement(term93120, 16, (byte) -1);
        setByteElement(term93120, 17, (byte) -1);
        setByteElement(term93120, 18, (byte) -1);
        setByteElement(term93120, 19, (byte) -1);
        setByteElement(term93120, 20, (byte) -1);
        setByteElement(term93120, 21, (byte) -1);
        setByteElement(term93120, 22, (byte) -1);
        setByteElement(term93120, 23, (byte) -1);
        setByteElement(term93120, 24, (byte) -1);
        setByteElement(term93120, 25, (byte) -1);
        setByteElement(term93120, 26, (byte) -1);
        setByteElement(term93120, 27, (byte) -1);
        setByteElement(term93120, 28, (byte) -1);
        setByteElement(term93120, 29, (byte) -1);
        setByteElement(term93120, 30, (byte) -1);
        setByteElement(term93120, 31, (byte) -1);
        setByteElement(term93120, 32, (byte) -1);
        setByteElement(term93120, 33, (byte) -1);
        setByteElement(term93120, 34, (byte) -1);
        setByteElement(term93120, 35, (byte) -1);
        setByteElement(term93120, 36, (byte) -1);
        setByteElement(term93120, 37, (byte) -1);
        setByteElement(term93120, 38, (byte) -1);
        setByteElement(term93120, 39, (byte) -1);
        setByteElement(term93120, 40, (byte) -1);
        setByteElement(term93120, 41, (byte) -1);
        setByteElement(term93120, 42, (byte) -1);
        setByteElement(term93120, 43, (byte) -1);
        setByteElement(term93120, 44, (byte) -1);
        setByteElement(term93120, 45, (byte) -1);
        setByteElement(term93120, 46, (byte) -1);
        setByteElement(term93120, 47, (byte) -1);
        setByteElement(term93120, 49, (byte) 1);
        setByteElement(term93120, 50, (byte) 2);
        setByteElement(term93120, 51, (byte) 3);
        setByteElement(term93120, 52, (byte) 4);
        setByteElement(term93120, 53, (byte) 5);
        setByteElement(term93120, 54, (byte) 6);
        setByteElement(term93120, 55, (byte) 7);
        setByteElement(term93120, 56, (byte) 8);
        setByteElement(term93120, 57, (byte) 9);
        setByteElement(term93120, 58, (byte) -1);
        setByteElement(term93120, 59, (byte) -1);
        setByteElement(term93120, 60, (byte) -1);
        setByteElement(term93120, 61, (byte) -1);
        setByteElement(term93120, 62, (byte) -1);
        setByteElement(term93120, 63, (byte) -1);
        setByteElement(term93120, 64, (byte) -1);
        setByteElement(term93120, 65, (byte) 10);
        setByteElement(term93120, 66, (byte) 11);
        setByteElement(term93120, 67, (byte) 12);
        setByteElement(term93120, 68, (byte) 13);
        setByteElement(term93120, 69, (byte) 14);
        setByteElement(term93120, 70, (byte) 15);
        setByteElement(term93120, 71, (byte) 16);
        setByteElement(term93120, 72, (byte) 17);
        setByteElement(term93120, 73, (byte) 18);
        setByteElement(term93120, 74, (byte) 19);
        setByteElement(term93120, 75, (byte) 20);
        setByteElement(term93120, 76, (byte) 21);
        setByteElement(term93120, 77, (byte) 22);
        setByteElement(term93120, 78, (byte) 23);
        setByteElement(term93120, 79, (byte) 24);
        setByteElement(term93120, 80, (byte) 25);
        setByteElement(term93120, 81, (byte) 26);
        setByteElement(term93120, 82, (byte) 27);
        setByteElement(term93120, 83, (byte) 28);
        setByteElement(term93120, 84, (byte) 29);
        setByteElement(term93120, 85, (byte) 30);
        setByteElement(term93120, 86, (byte) 31);
        setByteElement(term93120, 87, (byte) 32);
        setField(term93119, term93119.getClass(), "decodeTable", term93120);
        setIntField(term93119, term93119.getClass(), "encodeSize", 10);
        setByteElement(term93121, 0, (byte) 48);
        setByteElement(term93121, 1, (byte) 49);
        setByteElement(term93121, 2, (byte) 50);
        setByteElement(term93121, 3, (byte) 51);
        setByteElement(term93121, 4, (byte) 52);
        setByteElement(term93121, 5, (byte) 53);
        setByteElement(term93121, 6, (byte) 54);
        setByteElement(term93121, 7, (byte) 55);
        setByteElement(term93121, 8, (byte) 56);
        setByteElement(term93121, 9, (byte) 57);
        setByteElement(term93121, 10, (byte) 65);
        setByteElement(term93121, 11, (byte) 66);
        setByteElement(term93121, 12, (byte) 67);
        setByteElement(term93121, 13, (byte) 68);
        setByteElement(term93121, 14, (byte) 69);
        setByteElement(term93121, 15, (byte) 70);
        setByteElement(term93121, 16, (byte) 71);
        setByteElement(term93121, 17, (byte) 72);
        setByteElement(term93121, 18, (byte) 73);
        setByteElement(term93121, 19, (byte) 74);
        setByteElement(term93121, 20, (byte) 75);
        setByteElement(term93121, 21, (byte) 76);
        setByteElement(term93121, 22, (byte) 77);
        setByteElement(term93121, 23, (byte) 78);
        setByteElement(term93121, 24, (byte) 79);
        setByteElement(term93121, 25, (byte) 80);
        setByteElement(term93121, 26, (byte) 81);
        setByteElement(term93121, 27, (byte) 82);
        setByteElement(term93121, 28, (byte) 83);
        setByteElement(term93121, 29, (byte) 84);
        setByteElement(term93121, 30, (byte) 85);
        setByteElement(term93121, 31, (byte) 86);
        setField(term93119, term93119.getClass(), "encodeTable", term93121);
        setField(term93119, term93119.getClass(), "lineSeparator", term93122);
        setByteField(term93119, term93119.getClass(), "PAD", (byte) 61);
        setByteField(term93119, term93119.getClass(), "pad", (byte) 61);
        setIntField(term93119, term93119.getClass(), "unencodedBlockSize", 5);
        setIntField(term93119, term93119.getClass(), "encodedBlockSize", 8);
        setIntField(term93119, term93119.getClass(), "lineLength", 0);
        setIntField(term93119, term93119.getClass(), "chunkSeparatorLength", 2);
        term93123 = (byte[]) newByteArray(2);
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
        args[1] = term78713;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term93119));
        assertTrue(recursiveEquals(term78713, term93123));
    }

};


