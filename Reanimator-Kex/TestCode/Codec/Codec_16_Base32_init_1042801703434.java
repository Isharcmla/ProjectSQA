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

public class Base32_init_1042801703434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886661;
     Object term927243;
     Object term927247;

    public Base32_init_1042801703434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term890918 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term887672 = (byte[]) newByteArray(0);
        byte[] term889723 = (byte[]) newByteArray(0);
        setByteField(term890918, term890918.getClass(), "PAD", (byte) 0);
        setIntField(term890918, term890918.getClass(), "unencodedBlockSize", 0);
        setIntField(term890918, term890918.getClass(), "encodedBlockSize", 0);
        setIntField(term890918, term890918.getClass(), "lineLength", 0);
        setIntField(term890918, term890918.getClass(), "chunkSeparatorLength", 0);
        setByteField(term890918, term890918.getClass(), "pad", (byte) -128);
        setField(term890918, term890918.getClass(), "encodeTable", null);
        setField(term890918, term890918.getClass(), "decodeTable", term887672);
        setIntField(term890918, term890918.getClass(), "encodeSize", 0);
        setField(term890918, term890918.getClass(), "lineSeparator", term889723);
        setIntField(term890918, term890918.getClass(), "decodeSize", 0);
        term886661 = (byte[]) newByteArray(2);
        term927243 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term927244 = (byte[]) newByteArray(88);
        byte[] term927245 = (byte[]) newByteArray(32);
        byte[] term927246 = (byte[]) newByteArray(2);
        setIntField(term927243, term927243.getClass(), "decodeSize", 9);
        setByteElement(term927244, 0, (byte) -1);
        setByteElement(term927244, 1, (byte) -1);
        setByteElement(term927244, 2, (byte) -1);
        setByteElement(term927244, 3, (byte) -1);
        setByteElement(term927244, 4, (byte) -1);
        setByteElement(term927244, 5, (byte) -1);
        setByteElement(term927244, 6, (byte) -1);
        setByteElement(term927244, 7, (byte) -1);
        setByteElement(term927244, 8, (byte) -1);
        setByteElement(term927244, 9, (byte) -1);
        setByteElement(term927244, 10, (byte) -1);
        setByteElement(term927244, 11, (byte) -1);
        setByteElement(term927244, 12, (byte) -1);
        setByteElement(term927244, 13, (byte) -1);
        setByteElement(term927244, 14, (byte) -1);
        setByteElement(term927244, 15, (byte) -1);
        setByteElement(term927244, 16, (byte) -1);
        setByteElement(term927244, 17, (byte) -1);
        setByteElement(term927244, 18, (byte) -1);
        setByteElement(term927244, 19, (byte) -1);
        setByteElement(term927244, 20, (byte) -1);
        setByteElement(term927244, 21, (byte) -1);
        setByteElement(term927244, 22, (byte) -1);
        setByteElement(term927244, 23, (byte) -1);
        setByteElement(term927244, 24, (byte) -1);
        setByteElement(term927244, 25, (byte) -1);
        setByteElement(term927244, 26, (byte) -1);
        setByteElement(term927244, 27, (byte) -1);
        setByteElement(term927244, 28, (byte) -1);
        setByteElement(term927244, 29, (byte) -1);
        setByteElement(term927244, 30, (byte) -1);
        setByteElement(term927244, 31, (byte) -1);
        setByteElement(term927244, 32, (byte) -1);
        setByteElement(term927244, 33, (byte) -1);
        setByteElement(term927244, 34, (byte) -1);
        setByteElement(term927244, 35, (byte) -1);
        setByteElement(term927244, 36, (byte) -1);
        setByteElement(term927244, 37, (byte) -1);
        setByteElement(term927244, 38, (byte) -1);
        setByteElement(term927244, 39, (byte) -1);
        setByteElement(term927244, 40, (byte) -1);
        setByteElement(term927244, 41, (byte) -1);
        setByteElement(term927244, 42, (byte) -1);
        setByteElement(term927244, 43, (byte) -1);
        setByteElement(term927244, 44, (byte) -1);
        setByteElement(term927244, 45, (byte) -1);
        setByteElement(term927244, 46, (byte) -1);
        setByteElement(term927244, 47, (byte) -1);
        setByteElement(term927244, 49, (byte) 1);
        setByteElement(term927244, 50, (byte) 2);
        setByteElement(term927244, 51, (byte) 3);
        setByteElement(term927244, 52, (byte) 4);
        setByteElement(term927244, 53, (byte) 5);
        setByteElement(term927244, 54, (byte) 6);
        setByteElement(term927244, 55, (byte) 7);
        setByteElement(term927244, 56, (byte) 8);
        setByteElement(term927244, 57, (byte) 9);
        setByteElement(term927244, 58, (byte) -1);
        setByteElement(term927244, 59, (byte) -1);
        setByteElement(term927244, 60, (byte) -1);
        setByteElement(term927244, 61, (byte) -1);
        setByteElement(term927244, 62, (byte) -1);
        setByteElement(term927244, 63, (byte) -1);
        setByteElement(term927244, 64, (byte) -1);
        setByteElement(term927244, 65, (byte) 10);
        setByteElement(term927244, 66, (byte) 11);
        setByteElement(term927244, 67, (byte) 12);
        setByteElement(term927244, 68, (byte) 13);
        setByteElement(term927244, 69, (byte) 14);
        setByteElement(term927244, 70, (byte) 15);
        setByteElement(term927244, 71, (byte) 16);
        setByteElement(term927244, 72, (byte) 17);
        setByteElement(term927244, 73, (byte) 18);
        setByteElement(term927244, 74, (byte) 19);
        setByteElement(term927244, 75, (byte) 20);
        setByteElement(term927244, 76, (byte) 21);
        setByteElement(term927244, 77, (byte) 22);
        setByteElement(term927244, 78, (byte) 23);
        setByteElement(term927244, 79, (byte) 24);
        setByteElement(term927244, 80, (byte) 25);
        setByteElement(term927244, 81, (byte) 26);
        setByteElement(term927244, 82, (byte) 27);
        setByteElement(term927244, 83, (byte) 28);
        setByteElement(term927244, 84, (byte) 29);
        setByteElement(term927244, 85, (byte) 30);
        setByteElement(term927244, 86, (byte) 31);
        setByteElement(term927244, 87, (byte) 32);
        setField(term927243, term927243.getClass(), "decodeTable", term927244);
        setIntField(term927243, term927243.getClass(), "encodeSize", 10);
        setByteElement(term927245, 0, (byte) 48);
        setByteElement(term927245, 1, (byte) 49);
        setByteElement(term927245, 2, (byte) 50);
        setByteElement(term927245, 3, (byte) 51);
        setByteElement(term927245, 4, (byte) 52);
        setByteElement(term927245, 5, (byte) 53);
        setByteElement(term927245, 6, (byte) 54);
        setByteElement(term927245, 7, (byte) 55);
        setByteElement(term927245, 8, (byte) 56);
        setByteElement(term927245, 9, (byte) 57);
        setByteElement(term927245, 10, (byte) 65);
        setByteElement(term927245, 11, (byte) 66);
        setByteElement(term927245, 12, (byte) 67);
        setByteElement(term927245, 13, (byte) 68);
        setByteElement(term927245, 14, (byte) 69);
        setByteElement(term927245, 15, (byte) 70);
        setByteElement(term927245, 16, (byte) 71);
        setByteElement(term927245, 17, (byte) 72);
        setByteElement(term927245, 18, (byte) 73);
        setByteElement(term927245, 19, (byte) 74);
        setByteElement(term927245, 20, (byte) 75);
        setByteElement(term927245, 21, (byte) 76);
        setByteElement(term927245, 22, (byte) 77);
        setByteElement(term927245, 23, (byte) 78);
        setByteElement(term927245, 24, (byte) 79);
        setByteElement(term927245, 25, (byte) 80);
        setByteElement(term927245, 26, (byte) 81);
        setByteElement(term927245, 27, (byte) 82);
        setByteElement(term927245, 28, (byte) 83);
        setByteElement(term927245, 29, (byte) 84);
        setByteElement(term927245, 30, (byte) 85);
        setByteElement(term927245, 31, (byte) 86);
        setField(term927243, term927243.getClass(), "encodeTable", term927245);
        setField(term927243, term927243.getClass(), "lineSeparator", term927246);
        setByteField(term927243, term927243.getClass(), "PAD", (byte) 61);
        setByteField(term927243, term927243.getClass(), "pad", (byte) 61);
        setIntField(term927243, term927243.getClass(), "unencodedBlockSize", 5);
        setIntField(term927243, term927243.getClass(), "encodedBlockSize", 8);
        setIntField(term927243, term927243.getClass(), "lineLength", 0);
        setIntField(term927243, term927243.getClass(), "chunkSeparatorLength", 2);
        term927247 = (byte[]) newByteArray(2);
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
        args[1] = term886661;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term927243));
        assertTrue(recursiveEquals(term886661, term927247));
    }

};


