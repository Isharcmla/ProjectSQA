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

public class Base32_init_1042801703227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434987;

    public Base32_init_1042801703227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term434837 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term434837, term434837.getClass(), "PAD", (byte) 0);
        setIntField(term434837, term434837.getClass(), "unencodedBlockSize", 0);
        setIntField(term434837, term434837.getClass(), "encodedBlockSize", 0);
        setIntField(term434837, term434837.getClass(), "lineLength", 0);
        setIntField(term434837, term434837.getClass(), "chunkSeparatorLength", 0);
        setByteField(term434837, term434837.getClass(), "pad", (byte) 0);
        term434987 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term434988 = (byte[]) newByteArray(88);
        byte[] term434989 = (byte[]) newByteArray(32);
        setIntField(term434987, term434987.getClass(), "decodeSize", 7);
        setByteElement(term434988, 0, (byte) -1);
        setByteElement(term434988, 1, (byte) -1);
        setByteElement(term434988, 2, (byte) -1);
        setByteElement(term434988, 3, (byte) -1);
        setByteElement(term434988, 4, (byte) -1);
        setByteElement(term434988, 5, (byte) -1);
        setByteElement(term434988, 6, (byte) -1);
        setByteElement(term434988, 7, (byte) -1);
        setByteElement(term434988, 8, (byte) -1);
        setByteElement(term434988, 9, (byte) -1);
        setByteElement(term434988, 10, (byte) -1);
        setByteElement(term434988, 11, (byte) -1);
        setByteElement(term434988, 12, (byte) -1);
        setByteElement(term434988, 13, (byte) -1);
        setByteElement(term434988, 14, (byte) -1);
        setByteElement(term434988, 15, (byte) -1);
        setByteElement(term434988, 16, (byte) -1);
        setByteElement(term434988, 17, (byte) -1);
        setByteElement(term434988, 18, (byte) -1);
        setByteElement(term434988, 19, (byte) -1);
        setByteElement(term434988, 20, (byte) -1);
        setByteElement(term434988, 21, (byte) -1);
        setByteElement(term434988, 22, (byte) -1);
        setByteElement(term434988, 23, (byte) -1);
        setByteElement(term434988, 24, (byte) -1);
        setByteElement(term434988, 25, (byte) -1);
        setByteElement(term434988, 26, (byte) -1);
        setByteElement(term434988, 27, (byte) -1);
        setByteElement(term434988, 28, (byte) -1);
        setByteElement(term434988, 29, (byte) -1);
        setByteElement(term434988, 30, (byte) -1);
        setByteElement(term434988, 31, (byte) -1);
        setByteElement(term434988, 32, (byte) -1);
        setByteElement(term434988, 33, (byte) -1);
        setByteElement(term434988, 34, (byte) -1);
        setByteElement(term434988, 35, (byte) -1);
        setByteElement(term434988, 36, (byte) -1);
        setByteElement(term434988, 37, (byte) -1);
        setByteElement(term434988, 38, (byte) -1);
        setByteElement(term434988, 39, (byte) -1);
        setByteElement(term434988, 40, (byte) -1);
        setByteElement(term434988, 41, (byte) -1);
        setByteElement(term434988, 42, (byte) -1);
        setByteElement(term434988, 43, (byte) -1);
        setByteElement(term434988, 44, (byte) -1);
        setByteElement(term434988, 45, (byte) -1);
        setByteElement(term434988, 46, (byte) -1);
        setByteElement(term434988, 47, (byte) -1);
        setByteElement(term434988, 49, (byte) 1);
        setByteElement(term434988, 50, (byte) 2);
        setByteElement(term434988, 51, (byte) 3);
        setByteElement(term434988, 52, (byte) 4);
        setByteElement(term434988, 53, (byte) 5);
        setByteElement(term434988, 54, (byte) 6);
        setByteElement(term434988, 55, (byte) 7);
        setByteElement(term434988, 56, (byte) 8);
        setByteElement(term434988, 57, (byte) 9);
        setByteElement(term434988, 58, (byte) -1);
        setByteElement(term434988, 59, (byte) -1);
        setByteElement(term434988, 60, (byte) -1);
        setByteElement(term434988, 61, (byte) -1);
        setByteElement(term434988, 62, (byte) -1);
        setByteElement(term434988, 63, (byte) -1);
        setByteElement(term434988, 64, (byte) -1);
        setByteElement(term434988, 65, (byte) 10);
        setByteElement(term434988, 66, (byte) 11);
        setByteElement(term434988, 67, (byte) 12);
        setByteElement(term434988, 68, (byte) 13);
        setByteElement(term434988, 69, (byte) 14);
        setByteElement(term434988, 70, (byte) 15);
        setByteElement(term434988, 71, (byte) 16);
        setByteElement(term434988, 72, (byte) 17);
        setByteElement(term434988, 73, (byte) 18);
        setByteElement(term434988, 74, (byte) 19);
        setByteElement(term434988, 75, (byte) 20);
        setByteElement(term434988, 76, (byte) 21);
        setByteElement(term434988, 77, (byte) 22);
        setByteElement(term434988, 78, (byte) 23);
        setByteElement(term434988, 79, (byte) 24);
        setByteElement(term434988, 80, (byte) 25);
        setByteElement(term434988, 81, (byte) 26);
        setByteElement(term434988, 82, (byte) 27);
        setByteElement(term434988, 83, (byte) 28);
        setByteElement(term434988, 84, (byte) 29);
        setByteElement(term434988, 85, (byte) 30);
        setByteElement(term434988, 86, (byte) 31);
        setByteElement(term434988, 87, (byte) 32);
        setField(term434987, term434987.getClass(), "decodeTable", term434988);
        setIntField(term434987, term434987.getClass(), "encodeSize", 8);
        setByteElement(term434989, 0, (byte) 48);
        setByteElement(term434989, 1, (byte) 49);
        setByteElement(term434989, 2, (byte) 50);
        setByteElement(term434989, 3, (byte) 51);
        setByteElement(term434989, 4, (byte) 52);
        setByteElement(term434989, 5, (byte) 53);
        setByteElement(term434989, 6, (byte) 54);
        setByteElement(term434989, 7, (byte) 55);
        setByteElement(term434989, 8, (byte) 56);
        setByteElement(term434989, 9, (byte) 57);
        setByteElement(term434989, 10, (byte) 65);
        setByteElement(term434989, 11, (byte) 66);
        setByteElement(term434989, 12, (byte) 67);
        setByteElement(term434989, 13, (byte) 68);
        setByteElement(term434989, 14, (byte) 69);
        setByteElement(term434989, 15, (byte) 70);
        setByteElement(term434989, 16, (byte) 71);
        setByteElement(term434989, 17, (byte) 72);
        setByteElement(term434989, 18, (byte) 73);
        setByteElement(term434989, 19, (byte) 74);
        setByteElement(term434989, 20, (byte) 75);
        setByteElement(term434989, 21, (byte) 76);
        setByteElement(term434989, 22, (byte) 77);
        setByteElement(term434989, 23, (byte) 78);
        setByteElement(term434989, 24, (byte) 79);
        setByteElement(term434989, 25, (byte) 80);
        setByteElement(term434989, 26, (byte) 81);
        setByteElement(term434989, 27, (byte) 82);
        setByteElement(term434989, 28, (byte) 83);
        setByteElement(term434989, 29, (byte) 84);
        setByteElement(term434989, 30, (byte) 85);
        setByteElement(term434989, 31, (byte) 86);
        setField(term434987, term434987.getClass(), "encodeTable", term434989);
        setField(term434987, term434987.getClass(), "lineSeparator", null);
        setByteField(term434987, term434987.getClass(), "PAD", (byte) 61);
        setByteField(term434987, term434987.getClass(), "pad", (byte) 61);
        setIntField(term434987, term434987.getClass(), "unencodedBlockSize", 5);
        setIntField(term434987, term434987.getClass(), "encodedBlockSize", 8);
        setIntField(term434987, term434987.getClass(), "lineLength", 0);
        setIntField(term434987, term434987.getClass(), "chunkSeparatorLength", 0);
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
        args[1] = null;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term434987));
    }

};


