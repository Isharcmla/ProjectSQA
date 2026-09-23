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

public class Base32_init_1042801703309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586891;
     Object term593140;
     Object term593144;

    public Base32_init_1042801703309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term592515 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term587396 = (byte[]) newByteArray(0);
        setByteField(term592515, term592515.getClass(), "PAD", (byte) 0);
        setIntField(term592515, term592515.getClass(), "unencodedBlockSize", 0);
        setIntField(term592515, term592515.getClass(), "encodedBlockSize", 0);
        setIntField(term592515, term592515.getClass(), "lineLength", 0);
        setIntField(term592515, term592515.getClass(), "chunkSeparatorLength", 0);
        setByteField(term592515, term592515.getClass(), "pad", (byte) -128);
        setField(term592515, term592515.getClass(), "encodeTable", null);
        setField(term592515, term592515.getClass(), "decodeTable", term587396);
        term586891 = (byte[]) newByteArray(5);
        term593140 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term593141 = (byte[]) newByteArray(88);
        byte[] term593142 = (byte[]) newByteArray(32);
        byte[] term593143 = (byte[]) newByteArray(5);
        setIntField(term593140, term593140.getClass(), "decodeSize", 12);
        setByteElement(term593141, 0, (byte) -1);
        setByteElement(term593141, 1, (byte) -1);
        setByteElement(term593141, 2, (byte) -1);
        setByteElement(term593141, 3, (byte) -1);
        setByteElement(term593141, 4, (byte) -1);
        setByteElement(term593141, 5, (byte) -1);
        setByteElement(term593141, 6, (byte) -1);
        setByteElement(term593141, 7, (byte) -1);
        setByteElement(term593141, 8, (byte) -1);
        setByteElement(term593141, 9, (byte) -1);
        setByteElement(term593141, 10, (byte) -1);
        setByteElement(term593141, 11, (byte) -1);
        setByteElement(term593141, 12, (byte) -1);
        setByteElement(term593141, 13, (byte) -1);
        setByteElement(term593141, 14, (byte) -1);
        setByteElement(term593141, 15, (byte) -1);
        setByteElement(term593141, 16, (byte) -1);
        setByteElement(term593141, 17, (byte) -1);
        setByteElement(term593141, 18, (byte) -1);
        setByteElement(term593141, 19, (byte) -1);
        setByteElement(term593141, 20, (byte) -1);
        setByteElement(term593141, 21, (byte) -1);
        setByteElement(term593141, 22, (byte) -1);
        setByteElement(term593141, 23, (byte) -1);
        setByteElement(term593141, 24, (byte) -1);
        setByteElement(term593141, 25, (byte) -1);
        setByteElement(term593141, 26, (byte) -1);
        setByteElement(term593141, 27, (byte) -1);
        setByteElement(term593141, 28, (byte) -1);
        setByteElement(term593141, 29, (byte) -1);
        setByteElement(term593141, 30, (byte) -1);
        setByteElement(term593141, 31, (byte) -1);
        setByteElement(term593141, 32, (byte) -1);
        setByteElement(term593141, 33, (byte) -1);
        setByteElement(term593141, 34, (byte) -1);
        setByteElement(term593141, 35, (byte) -1);
        setByteElement(term593141, 36, (byte) -1);
        setByteElement(term593141, 37, (byte) -1);
        setByteElement(term593141, 38, (byte) -1);
        setByteElement(term593141, 39, (byte) -1);
        setByteElement(term593141, 40, (byte) -1);
        setByteElement(term593141, 41, (byte) -1);
        setByteElement(term593141, 42, (byte) -1);
        setByteElement(term593141, 43, (byte) -1);
        setByteElement(term593141, 44, (byte) -1);
        setByteElement(term593141, 45, (byte) -1);
        setByteElement(term593141, 46, (byte) -1);
        setByteElement(term593141, 47, (byte) -1);
        setByteElement(term593141, 49, (byte) 1);
        setByteElement(term593141, 50, (byte) 2);
        setByteElement(term593141, 51, (byte) 3);
        setByteElement(term593141, 52, (byte) 4);
        setByteElement(term593141, 53, (byte) 5);
        setByteElement(term593141, 54, (byte) 6);
        setByteElement(term593141, 55, (byte) 7);
        setByteElement(term593141, 56, (byte) 8);
        setByteElement(term593141, 57, (byte) 9);
        setByteElement(term593141, 58, (byte) -1);
        setByteElement(term593141, 59, (byte) -1);
        setByteElement(term593141, 60, (byte) -1);
        setByteElement(term593141, 61, (byte) -1);
        setByteElement(term593141, 62, (byte) -1);
        setByteElement(term593141, 63, (byte) -1);
        setByteElement(term593141, 64, (byte) -1);
        setByteElement(term593141, 65, (byte) 10);
        setByteElement(term593141, 66, (byte) 11);
        setByteElement(term593141, 67, (byte) 12);
        setByteElement(term593141, 68, (byte) 13);
        setByteElement(term593141, 69, (byte) 14);
        setByteElement(term593141, 70, (byte) 15);
        setByteElement(term593141, 71, (byte) 16);
        setByteElement(term593141, 72, (byte) 17);
        setByteElement(term593141, 73, (byte) 18);
        setByteElement(term593141, 74, (byte) 19);
        setByteElement(term593141, 75, (byte) 20);
        setByteElement(term593141, 76, (byte) 21);
        setByteElement(term593141, 77, (byte) 22);
        setByteElement(term593141, 78, (byte) 23);
        setByteElement(term593141, 79, (byte) 24);
        setByteElement(term593141, 80, (byte) 25);
        setByteElement(term593141, 81, (byte) 26);
        setByteElement(term593141, 82, (byte) 27);
        setByteElement(term593141, 83, (byte) 28);
        setByteElement(term593141, 84, (byte) 29);
        setByteElement(term593141, 85, (byte) 30);
        setByteElement(term593141, 86, (byte) 31);
        setByteElement(term593141, 87, (byte) 32);
        setField(term593140, term593140.getClass(), "decodeTable", term593141);
        setIntField(term593140, term593140.getClass(), "encodeSize", 13);
        setByteElement(term593142, 0, (byte) 48);
        setByteElement(term593142, 1, (byte) 49);
        setByteElement(term593142, 2, (byte) 50);
        setByteElement(term593142, 3, (byte) 51);
        setByteElement(term593142, 4, (byte) 52);
        setByteElement(term593142, 5, (byte) 53);
        setByteElement(term593142, 6, (byte) 54);
        setByteElement(term593142, 7, (byte) 55);
        setByteElement(term593142, 8, (byte) 56);
        setByteElement(term593142, 9, (byte) 57);
        setByteElement(term593142, 10, (byte) 65);
        setByteElement(term593142, 11, (byte) 66);
        setByteElement(term593142, 12, (byte) 67);
        setByteElement(term593142, 13, (byte) 68);
        setByteElement(term593142, 14, (byte) 69);
        setByteElement(term593142, 15, (byte) 70);
        setByteElement(term593142, 16, (byte) 71);
        setByteElement(term593142, 17, (byte) 72);
        setByteElement(term593142, 18, (byte) 73);
        setByteElement(term593142, 19, (byte) 74);
        setByteElement(term593142, 20, (byte) 75);
        setByteElement(term593142, 21, (byte) 76);
        setByteElement(term593142, 22, (byte) 77);
        setByteElement(term593142, 23, (byte) 78);
        setByteElement(term593142, 24, (byte) 79);
        setByteElement(term593142, 25, (byte) 80);
        setByteElement(term593142, 26, (byte) 81);
        setByteElement(term593142, 27, (byte) 82);
        setByteElement(term593142, 28, (byte) 83);
        setByteElement(term593142, 29, (byte) 84);
        setByteElement(term593142, 30, (byte) 85);
        setByteElement(term593142, 31, (byte) 86);
        setField(term593140, term593140.getClass(), "encodeTable", term593142);
        setField(term593140, term593140.getClass(), "lineSeparator", term593143);
        setByteField(term593140, term593140.getClass(), "PAD", (byte) 61);
        setByteField(term593140, term593140.getClass(), "pad", (byte) 61);
        setIntField(term593140, term593140.getClass(), "unencodedBlockSize", 5);
        setIntField(term593140, term593140.getClass(), "encodedBlockSize", 8);
        setIntField(term593140, term593140.getClass(), "lineLength", 0);
        setIntField(term593140, term593140.getClass(), "chunkSeparatorLength", 5);
        term593144 = (byte[]) newByteArray(5);
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
        args[1] = term586891;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term593140));
        assertTrue(recursiveEquals(term586891, term593144));
    }

};


