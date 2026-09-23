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

public class Base32_init_1099337581323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622233;

    public Base32_init_1099337581323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term620274 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term620160 = (byte[]) newByteArray(0);
        setByteField(term620274, term620274.getClass(), "PAD", (byte) 0);
        setIntField(term620274, term620274.getClass(), "unencodedBlockSize", 0);
        setIntField(term620274, term620274.getClass(), "encodedBlockSize", 0);
        setIntField(term620274, term620274.getClass(), "lineLength", 0);
        setIntField(term620274, term620274.getClass(), "chunkSeparatorLength", 0);
        setByteField(term620274, term620274.getClass(), "pad", (byte) 0);
        setField(term620274, term620274.getClass(), "encodeTable", term620160);
        setField(term620274, term620274.getClass(), "decodeTable", term620160);
        setIntField(term620274, term620274.getClass(), "encodeSize", 0);
        setField(term620274, term620274.getClass(), "lineSeparator", term620160);
        setIntField(term620274, term620274.getClass(), "decodeSize", 0);
        term622233 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term622234 = (byte[]) newByteArray(88);
        byte[] term622235 = (byte[]) newByteArray(32);
        setIntField(term622233, term622233.getClass(), "decodeSize", 7);
        setByteElement(term622234, 0, (byte) -1);
        setByteElement(term622234, 1, (byte) -1);
        setByteElement(term622234, 2, (byte) -1);
        setByteElement(term622234, 3, (byte) -1);
        setByteElement(term622234, 4, (byte) -1);
        setByteElement(term622234, 5, (byte) -1);
        setByteElement(term622234, 6, (byte) -1);
        setByteElement(term622234, 7, (byte) -1);
        setByteElement(term622234, 8, (byte) -1);
        setByteElement(term622234, 9, (byte) -1);
        setByteElement(term622234, 10, (byte) -1);
        setByteElement(term622234, 11, (byte) -1);
        setByteElement(term622234, 12, (byte) -1);
        setByteElement(term622234, 13, (byte) -1);
        setByteElement(term622234, 14, (byte) -1);
        setByteElement(term622234, 15, (byte) -1);
        setByteElement(term622234, 16, (byte) -1);
        setByteElement(term622234, 17, (byte) -1);
        setByteElement(term622234, 18, (byte) -1);
        setByteElement(term622234, 19, (byte) -1);
        setByteElement(term622234, 20, (byte) -1);
        setByteElement(term622234, 21, (byte) -1);
        setByteElement(term622234, 22, (byte) -1);
        setByteElement(term622234, 23, (byte) -1);
        setByteElement(term622234, 24, (byte) -1);
        setByteElement(term622234, 25, (byte) -1);
        setByteElement(term622234, 26, (byte) -1);
        setByteElement(term622234, 27, (byte) -1);
        setByteElement(term622234, 28, (byte) -1);
        setByteElement(term622234, 29, (byte) -1);
        setByteElement(term622234, 30, (byte) -1);
        setByteElement(term622234, 31, (byte) -1);
        setByteElement(term622234, 32, (byte) -1);
        setByteElement(term622234, 33, (byte) -1);
        setByteElement(term622234, 34, (byte) -1);
        setByteElement(term622234, 35, (byte) -1);
        setByteElement(term622234, 36, (byte) -1);
        setByteElement(term622234, 37, (byte) -1);
        setByteElement(term622234, 38, (byte) -1);
        setByteElement(term622234, 39, (byte) -1);
        setByteElement(term622234, 40, (byte) -1);
        setByteElement(term622234, 41, (byte) -1);
        setByteElement(term622234, 42, (byte) -1);
        setByteElement(term622234, 43, (byte) -1);
        setByteElement(term622234, 44, (byte) -1);
        setByteElement(term622234, 45, (byte) -1);
        setByteElement(term622234, 46, (byte) -1);
        setByteElement(term622234, 47, (byte) -1);
        setByteElement(term622234, 49, (byte) 1);
        setByteElement(term622234, 50, (byte) 2);
        setByteElement(term622234, 51, (byte) 3);
        setByteElement(term622234, 52, (byte) 4);
        setByteElement(term622234, 53, (byte) 5);
        setByteElement(term622234, 54, (byte) 6);
        setByteElement(term622234, 55, (byte) 7);
        setByteElement(term622234, 56, (byte) 8);
        setByteElement(term622234, 57, (byte) 9);
        setByteElement(term622234, 58, (byte) -1);
        setByteElement(term622234, 59, (byte) -1);
        setByteElement(term622234, 60, (byte) -1);
        setByteElement(term622234, 61, (byte) -1);
        setByteElement(term622234, 62, (byte) -1);
        setByteElement(term622234, 63, (byte) -1);
        setByteElement(term622234, 64, (byte) -1);
        setByteElement(term622234, 65, (byte) 10);
        setByteElement(term622234, 66, (byte) 11);
        setByteElement(term622234, 67, (byte) 12);
        setByteElement(term622234, 68, (byte) 13);
        setByteElement(term622234, 69, (byte) 14);
        setByteElement(term622234, 70, (byte) 15);
        setByteElement(term622234, 71, (byte) 16);
        setByteElement(term622234, 72, (byte) 17);
        setByteElement(term622234, 73, (byte) 18);
        setByteElement(term622234, 74, (byte) 19);
        setByteElement(term622234, 75, (byte) 20);
        setByteElement(term622234, 76, (byte) 21);
        setByteElement(term622234, 77, (byte) 22);
        setByteElement(term622234, 78, (byte) 23);
        setByteElement(term622234, 79, (byte) 24);
        setByteElement(term622234, 80, (byte) 25);
        setByteElement(term622234, 81, (byte) 26);
        setByteElement(term622234, 82, (byte) 27);
        setByteElement(term622234, 83, (byte) 28);
        setByteElement(term622234, 84, (byte) 29);
        setByteElement(term622234, 85, (byte) 30);
        setByteElement(term622234, 86, (byte) 31);
        setByteElement(term622234, 87, (byte) 32);
        setField(term622233, term622233.getClass(), "decodeTable", term622234);
        setIntField(term622233, term622233.getClass(), "encodeSize", 8);
        setByteElement(term622235, 0, (byte) 48);
        setByteElement(term622235, 1, (byte) 49);
        setByteElement(term622235, 2, (byte) 50);
        setByteElement(term622235, 3, (byte) 51);
        setByteElement(term622235, 4, (byte) 52);
        setByteElement(term622235, 5, (byte) 53);
        setByteElement(term622235, 6, (byte) 54);
        setByteElement(term622235, 7, (byte) 55);
        setByteElement(term622235, 8, (byte) 56);
        setByteElement(term622235, 9, (byte) 57);
        setByteElement(term622235, 10, (byte) 65);
        setByteElement(term622235, 11, (byte) 66);
        setByteElement(term622235, 12, (byte) 67);
        setByteElement(term622235, 13, (byte) 68);
        setByteElement(term622235, 14, (byte) 69);
        setByteElement(term622235, 15, (byte) 70);
        setByteElement(term622235, 16, (byte) 71);
        setByteElement(term622235, 17, (byte) 72);
        setByteElement(term622235, 18, (byte) 73);
        setByteElement(term622235, 19, (byte) 74);
        setByteElement(term622235, 20, (byte) 75);
        setByteElement(term622235, 21, (byte) 76);
        setByteElement(term622235, 22, (byte) 77);
        setByteElement(term622235, 23, (byte) 78);
        setByteElement(term622235, 24, (byte) 79);
        setByteElement(term622235, 25, (byte) 80);
        setByteElement(term622235, 26, (byte) 81);
        setByteElement(term622235, 27, (byte) 82);
        setByteElement(term622235, 28, (byte) 83);
        setByteElement(term622235, 29, (byte) 84);
        setByteElement(term622235, 30, (byte) 85);
        setByteElement(term622235, 31, (byte) 86);
        setField(term622233, term622233.getClass(), "encodeTable", term622235);
        setField(term622233, term622233.getClass(), "lineSeparator", null);
        setByteField(term622233, term622233.getClass(), "PAD", (byte) 61);
        setByteField(term622233, term622233.getClass(), "pad", (byte) 126);
        setIntField(term622233, term622233.getClass(), "unencodedBlockSize", 5);
        setIntField(term622233, term622233.getClass(), "encodedBlockSize", 8);
        setIntField(term622233, term622233.getClass(), "lineLength", 0);
        setIntField(term622233, term622233.getClass(), "chunkSeparatorLength", 0);
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
        args[2] = true;
        args[3] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term622233));
    }

};


