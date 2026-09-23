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

public class Base32_init_1042801703156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268690;
     Object term277560;
     Object term277564;

    public Base32_init_1042801703156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term270674 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term269246 = (byte[]) newByteArray(0);
        setByteField(term270674, term270674.getClass(), "PAD", (byte) 0);
        setIntField(term270674, term270674.getClass(), "unencodedBlockSize", 0);
        setIntField(term270674, term270674.getClass(), "encodedBlockSize", 0);
        setIntField(term270674, term270674.getClass(), "lineLength", 0);
        setIntField(term270674, term270674.getClass(), "chunkSeparatorLength", 0);
        setByteField(term270674, term270674.getClass(), "pad", (byte) -128);
        setField(term270674, term270674.getClass(), "encodeTable", null);
        setField(term270674, term270674.getClass(), "decodeTable", term269246);
        setIntField(term270674, term270674.getClass(), "encodeSize", 0);
        setField(term270674, term270674.getClass(), "lineSeparator", null);
        setIntField(term270674, term270674.getClass(), "decodeSize", 0);
        term268690 = (byte[]) newByteArray(11);
        term277560 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term277561 = (byte[]) newByteArray(88);
        byte[] term277562 = (byte[]) newByteArray(32);
        byte[] term277563 = (byte[]) newByteArray(11);
        setIntField(term277560, term277560.getClass(), "decodeSize", 18);
        setByteElement(term277561, 0, (byte) -1);
        setByteElement(term277561, 1, (byte) -1);
        setByteElement(term277561, 2, (byte) -1);
        setByteElement(term277561, 3, (byte) -1);
        setByteElement(term277561, 4, (byte) -1);
        setByteElement(term277561, 5, (byte) -1);
        setByteElement(term277561, 6, (byte) -1);
        setByteElement(term277561, 7, (byte) -1);
        setByteElement(term277561, 8, (byte) -1);
        setByteElement(term277561, 9, (byte) -1);
        setByteElement(term277561, 10, (byte) -1);
        setByteElement(term277561, 11, (byte) -1);
        setByteElement(term277561, 12, (byte) -1);
        setByteElement(term277561, 13, (byte) -1);
        setByteElement(term277561, 14, (byte) -1);
        setByteElement(term277561, 15, (byte) -1);
        setByteElement(term277561, 16, (byte) -1);
        setByteElement(term277561, 17, (byte) -1);
        setByteElement(term277561, 18, (byte) -1);
        setByteElement(term277561, 19, (byte) -1);
        setByteElement(term277561, 20, (byte) -1);
        setByteElement(term277561, 21, (byte) -1);
        setByteElement(term277561, 22, (byte) -1);
        setByteElement(term277561, 23, (byte) -1);
        setByteElement(term277561, 24, (byte) -1);
        setByteElement(term277561, 25, (byte) -1);
        setByteElement(term277561, 26, (byte) -1);
        setByteElement(term277561, 27, (byte) -1);
        setByteElement(term277561, 28, (byte) -1);
        setByteElement(term277561, 29, (byte) -1);
        setByteElement(term277561, 30, (byte) -1);
        setByteElement(term277561, 31, (byte) -1);
        setByteElement(term277561, 32, (byte) -1);
        setByteElement(term277561, 33, (byte) -1);
        setByteElement(term277561, 34, (byte) -1);
        setByteElement(term277561, 35, (byte) -1);
        setByteElement(term277561, 36, (byte) -1);
        setByteElement(term277561, 37, (byte) -1);
        setByteElement(term277561, 38, (byte) -1);
        setByteElement(term277561, 39, (byte) -1);
        setByteElement(term277561, 40, (byte) -1);
        setByteElement(term277561, 41, (byte) -1);
        setByteElement(term277561, 42, (byte) -1);
        setByteElement(term277561, 43, (byte) -1);
        setByteElement(term277561, 44, (byte) -1);
        setByteElement(term277561, 45, (byte) -1);
        setByteElement(term277561, 46, (byte) -1);
        setByteElement(term277561, 47, (byte) -1);
        setByteElement(term277561, 49, (byte) 1);
        setByteElement(term277561, 50, (byte) 2);
        setByteElement(term277561, 51, (byte) 3);
        setByteElement(term277561, 52, (byte) 4);
        setByteElement(term277561, 53, (byte) 5);
        setByteElement(term277561, 54, (byte) 6);
        setByteElement(term277561, 55, (byte) 7);
        setByteElement(term277561, 56, (byte) 8);
        setByteElement(term277561, 57, (byte) 9);
        setByteElement(term277561, 58, (byte) -1);
        setByteElement(term277561, 59, (byte) -1);
        setByteElement(term277561, 60, (byte) -1);
        setByteElement(term277561, 61, (byte) -1);
        setByteElement(term277561, 62, (byte) -1);
        setByteElement(term277561, 63, (byte) -1);
        setByteElement(term277561, 64, (byte) -1);
        setByteElement(term277561, 65, (byte) 10);
        setByteElement(term277561, 66, (byte) 11);
        setByteElement(term277561, 67, (byte) 12);
        setByteElement(term277561, 68, (byte) 13);
        setByteElement(term277561, 69, (byte) 14);
        setByteElement(term277561, 70, (byte) 15);
        setByteElement(term277561, 71, (byte) 16);
        setByteElement(term277561, 72, (byte) 17);
        setByteElement(term277561, 73, (byte) 18);
        setByteElement(term277561, 74, (byte) 19);
        setByteElement(term277561, 75, (byte) 20);
        setByteElement(term277561, 76, (byte) 21);
        setByteElement(term277561, 77, (byte) 22);
        setByteElement(term277561, 78, (byte) 23);
        setByteElement(term277561, 79, (byte) 24);
        setByteElement(term277561, 80, (byte) 25);
        setByteElement(term277561, 81, (byte) 26);
        setByteElement(term277561, 82, (byte) 27);
        setByteElement(term277561, 83, (byte) 28);
        setByteElement(term277561, 84, (byte) 29);
        setByteElement(term277561, 85, (byte) 30);
        setByteElement(term277561, 86, (byte) 31);
        setByteElement(term277561, 87, (byte) 32);
        setField(term277560, term277560.getClass(), "decodeTable", term277561);
        setIntField(term277560, term277560.getClass(), "encodeSize", 19);
        setByteElement(term277562, 0, (byte) 48);
        setByteElement(term277562, 1, (byte) 49);
        setByteElement(term277562, 2, (byte) 50);
        setByteElement(term277562, 3, (byte) 51);
        setByteElement(term277562, 4, (byte) 52);
        setByteElement(term277562, 5, (byte) 53);
        setByteElement(term277562, 6, (byte) 54);
        setByteElement(term277562, 7, (byte) 55);
        setByteElement(term277562, 8, (byte) 56);
        setByteElement(term277562, 9, (byte) 57);
        setByteElement(term277562, 10, (byte) 65);
        setByteElement(term277562, 11, (byte) 66);
        setByteElement(term277562, 12, (byte) 67);
        setByteElement(term277562, 13, (byte) 68);
        setByteElement(term277562, 14, (byte) 69);
        setByteElement(term277562, 15, (byte) 70);
        setByteElement(term277562, 16, (byte) 71);
        setByteElement(term277562, 17, (byte) 72);
        setByteElement(term277562, 18, (byte) 73);
        setByteElement(term277562, 19, (byte) 74);
        setByteElement(term277562, 20, (byte) 75);
        setByteElement(term277562, 21, (byte) 76);
        setByteElement(term277562, 22, (byte) 77);
        setByteElement(term277562, 23, (byte) 78);
        setByteElement(term277562, 24, (byte) 79);
        setByteElement(term277562, 25, (byte) 80);
        setByteElement(term277562, 26, (byte) 81);
        setByteElement(term277562, 27, (byte) 82);
        setByteElement(term277562, 28, (byte) 83);
        setByteElement(term277562, 29, (byte) 84);
        setByteElement(term277562, 30, (byte) 85);
        setByteElement(term277562, 31, (byte) 86);
        setField(term277560, term277560.getClass(), "encodeTable", term277562);
        setField(term277560, term277560.getClass(), "lineSeparator", term277563);
        setByteField(term277560, term277560.getClass(), "PAD", (byte) 61);
        setByteField(term277560, term277560.getClass(), "pad", (byte) 61);
        setIntField(term277560, term277560.getClass(), "unencodedBlockSize", 5);
        setIntField(term277560, term277560.getClass(), "encodedBlockSize", 8);
        setIntField(term277560, term277560.getClass(), "lineLength", 0);
        setIntField(term277560, term277560.getClass(), "chunkSeparatorLength", 11);
        term277564 = (byte[]) newByteArray(11);
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
        args[1] = term268690;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term277560));
        assertTrue(recursiveEquals(term268690, term277564));
    }

};


