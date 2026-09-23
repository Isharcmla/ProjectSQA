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

public class Base32_init_1099337581231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435496;
     Object term435756;
     Object term435759;

    public Base32_init_1099337581231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term435605 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term435605, term435605.getClass(), "PAD", (byte) 0);
        setIntField(term435605, term435605.getClass(), "unencodedBlockSize", 0);
        setIntField(term435605, term435605.getClass(), "encodedBlockSize", 0);
        setIntField(term435605, term435605.getClass(), "lineLength", 0);
        setIntField(term435605, term435605.getClass(), "chunkSeparatorLength", 0);
        setByteField(term435605, term435605.getClass(), "pad", (byte) 0);
        term435496 = (byte[]) newByteArray(0);
        term435756 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term435757 = (byte[]) newByteArray(88);
        byte[] term435758 = (byte[]) newByteArray(32);
        setIntField(term435756, term435756.getClass(), "decodeSize", 7);
        setByteElement(term435757, 0, (byte) -1);
        setByteElement(term435757, 1, (byte) -1);
        setByteElement(term435757, 2, (byte) -1);
        setByteElement(term435757, 3, (byte) -1);
        setByteElement(term435757, 4, (byte) -1);
        setByteElement(term435757, 5, (byte) -1);
        setByteElement(term435757, 6, (byte) -1);
        setByteElement(term435757, 7, (byte) -1);
        setByteElement(term435757, 8, (byte) -1);
        setByteElement(term435757, 9, (byte) -1);
        setByteElement(term435757, 10, (byte) -1);
        setByteElement(term435757, 11, (byte) -1);
        setByteElement(term435757, 12, (byte) -1);
        setByteElement(term435757, 13, (byte) -1);
        setByteElement(term435757, 14, (byte) -1);
        setByteElement(term435757, 15, (byte) -1);
        setByteElement(term435757, 16, (byte) -1);
        setByteElement(term435757, 17, (byte) -1);
        setByteElement(term435757, 18, (byte) -1);
        setByteElement(term435757, 19, (byte) -1);
        setByteElement(term435757, 20, (byte) -1);
        setByteElement(term435757, 21, (byte) -1);
        setByteElement(term435757, 22, (byte) -1);
        setByteElement(term435757, 23, (byte) -1);
        setByteElement(term435757, 24, (byte) -1);
        setByteElement(term435757, 25, (byte) -1);
        setByteElement(term435757, 26, (byte) -1);
        setByteElement(term435757, 27, (byte) -1);
        setByteElement(term435757, 28, (byte) -1);
        setByteElement(term435757, 29, (byte) -1);
        setByteElement(term435757, 30, (byte) -1);
        setByteElement(term435757, 31, (byte) -1);
        setByteElement(term435757, 32, (byte) -1);
        setByteElement(term435757, 33, (byte) -1);
        setByteElement(term435757, 34, (byte) -1);
        setByteElement(term435757, 35, (byte) -1);
        setByteElement(term435757, 36, (byte) -1);
        setByteElement(term435757, 37, (byte) -1);
        setByteElement(term435757, 38, (byte) -1);
        setByteElement(term435757, 39, (byte) -1);
        setByteElement(term435757, 40, (byte) -1);
        setByteElement(term435757, 41, (byte) -1);
        setByteElement(term435757, 42, (byte) -1);
        setByteElement(term435757, 43, (byte) -1);
        setByteElement(term435757, 44, (byte) -1);
        setByteElement(term435757, 45, (byte) -1);
        setByteElement(term435757, 46, (byte) -1);
        setByteElement(term435757, 47, (byte) -1);
        setByteElement(term435757, 49, (byte) 1);
        setByteElement(term435757, 50, (byte) 2);
        setByteElement(term435757, 51, (byte) 3);
        setByteElement(term435757, 52, (byte) 4);
        setByteElement(term435757, 53, (byte) 5);
        setByteElement(term435757, 54, (byte) 6);
        setByteElement(term435757, 55, (byte) 7);
        setByteElement(term435757, 56, (byte) 8);
        setByteElement(term435757, 57, (byte) 9);
        setByteElement(term435757, 58, (byte) -1);
        setByteElement(term435757, 59, (byte) -1);
        setByteElement(term435757, 60, (byte) -1);
        setByteElement(term435757, 61, (byte) -1);
        setByteElement(term435757, 62, (byte) -1);
        setByteElement(term435757, 63, (byte) -1);
        setByteElement(term435757, 64, (byte) -1);
        setByteElement(term435757, 65, (byte) 10);
        setByteElement(term435757, 66, (byte) 11);
        setByteElement(term435757, 67, (byte) 12);
        setByteElement(term435757, 68, (byte) 13);
        setByteElement(term435757, 69, (byte) 14);
        setByteElement(term435757, 70, (byte) 15);
        setByteElement(term435757, 71, (byte) 16);
        setByteElement(term435757, 72, (byte) 17);
        setByteElement(term435757, 73, (byte) 18);
        setByteElement(term435757, 74, (byte) 19);
        setByteElement(term435757, 75, (byte) 20);
        setByteElement(term435757, 76, (byte) 21);
        setByteElement(term435757, 77, (byte) 22);
        setByteElement(term435757, 78, (byte) 23);
        setByteElement(term435757, 79, (byte) 24);
        setByteElement(term435757, 80, (byte) 25);
        setByteElement(term435757, 81, (byte) 26);
        setByteElement(term435757, 82, (byte) 27);
        setByteElement(term435757, 83, (byte) 28);
        setByteElement(term435757, 84, (byte) 29);
        setByteElement(term435757, 85, (byte) 30);
        setByteElement(term435757, 86, (byte) 31);
        setByteElement(term435757, 87, (byte) 32);
        setField(term435756, term435756.getClass(), "decodeTable", term435757);
        setIntField(term435756, term435756.getClass(), "encodeSize", 8);
        setByteElement(term435758, 0, (byte) 48);
        setByteElement(term435758, 1, (byte) 49);
        setByteElement(term435758, 2, (byte) 50);
        setByteElement(term435758, 3, (byte) 51);
        setByteElement(term435758, 4, (byte) 52);
        setByteElement(term435758, 5, (byte) 53);
        setByteElement(term435758, 6, (byte) 54);
        setByteElement(term435758, 7, (byte) 55);
        setByteElement(term435758, 8, (byte) 56);
        setByteElement(term435758, 9, (byte) 57);
        setByteElement(term435758, 10, (byte) 65);
        setByteElement(term435758, 11, (byte) 66);
        setByteElement(term435758, 12, (byte) 67);
        setByteElement(term435758, 13, (byte) 68);
        setByteElement(term435758, 14, (byte) 69);
        setByteElement(term435758, 15, (byte) 70);
        setByteElement(term435758, 16, (byte) 71);
        setByteElement(term435758, 17, (byte) 72);
        setByteElement(term435758, 18, (byte) 73);
        setByteElement(term435758, 19, (byte) 74);
        setByteElement(term435758, 20, (byte) 75);
        setByteElement(term435758, 21, (byte) 76);
        setByteElement(term435758, 22, (byte) 77);
        setByteElement(term435758, 23, (byte) 78);
        setByteElement(term435758, 24, (byte) 79);
        setByteElement(term435758, 25, (byte) 80);
        setByteElement(term435758, 26, (byte) 81);
        setByteElement(term435758, 27, (byte) 82);
        setByteElement(term435758, 28, (byte) 83);
        setByteElement(term435758, 29, (byte) 84);
        setByteElement(term435758, 30, (byte) 85);
        setByteElement(term435758, 31, (byte) 86);
        setField(term435756, term435756.getClass(), "encodeTable", term435758);
        setField(term435756, term435756.getClass(), "lineSeparator", null);
        setByteField(term435756, term435756.getClass(), "PAD", (byte) 61);
        setByteField(term435756, term435756.getClass(), "pad", (byte) 0);
        setIntField(term435756, term435756.getClass(), "unencodedBlockSize", 5);
        setIntField(term435756, term435756.getClass(), "encodedBlockSize", 8);
        setIntField(term435756, term435756.getClass(), "lineLength", 0);
        setIntField(term435756, term435756.getClass(), "chunkSeparatorLength", 0);
        term435759 = (byte[]) newByteArray(0);
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
        args[1] = term435496;
        args[2] = true;
        args[3] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term435756));
        assertTrue(recursiveEquals(term435496, (byte) 0));
    }

};


