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

public class Base32_init_1042801703351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654975;
     Object term715916;
     Object term715920;

    public Base32_init_1042801703351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term667572 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term655994 = (byte[]) newByteArray(0);
        setByteField(term667572, term667572.getClass(), "PAD", (byte) 0);
        setIntField(term667572, term667572.getClass(), "unencodedBlockSize", 0);
        setIntField(term667572, term667572.getClass(), "encodedBlockSize", 0);
        setIntField(term667572, term667572.getClass(), "lineLength", 0);
        setIntField(term667572, term667572.getClass(), "chunkSeparatorLength", 0);
        setByteField(term667572, term667572.getClass(), "pad", (byte) -128);
        setField(term667572, term667572.getClass(), "encodeTable", null);
        setField(term667572, term667572.getClass(), "decodeTable", term655994);
        setIntField(term667572, term667572.getClass(), "encodeSize", 0);
        setField(term667572, term667572.getClass(), "lineSeparator", null);
        setIntField(term667572, term667572.getClass(), "decodeSize", 0);
        term654975 = (byte[]) newByteArray(10);
        term715916 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term715917 = (byte[]) newByteArray(88);
        byte[] term715918 = (byte[]) newByteArray(32);
        byte[] term715919 = (byte[]) newByteArray(10);
        setIntField(term715916, term715916.getClass(), "decodeSize", 17);
        setByteElement(term715917, 0, (byte) -1);
        setByteElement(term715917, 1, (byte) -1);
        setByteElement(term715917, 2, (byte) -1);
        setByteElement(term715917, 3, (byte) -1);
        setByteElement(term715917, 4, (byte) -1);
        setByteElement(term715917, 5, (byte) -1);
        setByteElement(term715917, 6, (byte) -1);
        setByteElement(term715917, 7, (byte) -1);
        setByteElement(term715917, 8, (byte) -1);
        setByteElement(term715917, 9, (byte) -1);
        setByteElement(term715917, 10, (byte) -1);
        setByteElement(term715917, 11, (byte) -1);
        setByteElement(term715917, 12, (byte) -1);
        setByteElement(term715917, 13, (byte) -1);
        setByteElement(term715917, 14, (byte) -1);
        setByteElement(term715917, 15, (byte) -1);
        setByteElement(term715917, 16, (byte) -1);
        setByteElement(term715917, 17, (byte) -1);
        setByteElement(term715917, 18, (byte) -1);
        setByteElement(term715917, 19, (byte) -1);
        setByteElement(term715917, 20, (byte) -1);
        setByteElement(term715917, 21, (byte) -1);
        setByteElement(term715917, 22, (byte) -1);
        setByteElement(term715917, 23, (byte) -1);
        setByteElement(term715917, 24, (byte) -1);
        setByteElement(term715917, 25, (byte) -1);
        setByteElement(term715917, 26, (byte) -1);
        setByteElement(term715917, 27, (byte) -1);
        setByteElement(term715917, 28, (byte) -1);
        setByteElement(term715917, 29, (byte) -1);
        setByteElement(term715917, 30, (byte) -1);
        setByteElement(term715917, 31, (byte) -1);
        setByteElement(term715917, 32, (byte) -1);
        setByteElement(term715917, 33, (byte) -1);
        setByteElement(term715917, 34, (byte) -1);
        setByteElement(term715917, 35, (byte) -1);
        setByteElement(term715917, 36, (byte) -1);
        setByteElement(term715917, 37, (byte) -1);
        setByteElement(term715917, 38, (byte) -1);
        setByteElement(term715917, 39, (byte) -1);
        setByteElement(term715917, 40, (byte) -1);
        setByteElement(term715917, 41, (byte) -1);
        setByteElement(term715917, 42, (byte) -1);
        setByteElement(term715917, 43, (byte) -1);
        setByteElement(term715917, 44, (byte) -1);
        setByteElement(term715917, 45, (byte) -1);
        setByteElement(term715917, 46, (byte) -1);
        setByteElement(term715917, 47, (byte) -1);
        setByteElement(term715917, 49, (byte) 1);
        setByteElement(term715917, 50, (byte) 2);
        setByteElement(term715917, 51, (byte) 3);
        setByteElement(term715917, 52, (byte) 4);
        setByteElement(term715917, 53, (byte) 5);
        setByteElement(term715917, 54, (byte) 6);
        setByteElement(term715917, 55, (byte) 7);
        setByteElement(term715917, 56, (byte) 8);
        setByteElement(term715917, 57, (byte) 9);
        setByteElement(term715917, 58, (byte) -1);
        setByteElement(term715917, 59, (byte) -1);
        setByteElement(term715917, 60, (byte) -1);
        setByteElement(term715917, 61, (byte) -1);
        setByteElement(term715917, 62, (byte) -1);
        setByteElement(term715917, 63, (byte) -1);
        setByteElement(term715917, 64, (byte) -1);
        setByteElement(term715917, 65, (byte) 10);
        setByteElement(term715917, 66, (byte) 11);
        setByteElement(term715917, 67, (byte) 12);
        setByteElement(term715917, 68, (byte) 13);
        setByteElement(term715917, 69, (byte) 14);
        setByteElement(term715917, 70, (byte) 15);
        setByteElement(term715917, 71, (byte) 16);
        setByteElement(term715917, 72, (byte) 17);
        setByteElement(term715917, 73, (byte) 18);
        setByteElement(term715917, 74, (byte) 19);
        setByteElement(term715917, 75, (byte) 20);
        setByteElement(term715917, 76, (byte) 21);
        setByteElement(term715917, 77, (byte) 22);
        setByteElement(term715917, 78, (byte) 23);
        setByteElement(term715917, 79, (byte) 24);
        setByteElement(term715917, 80, (byte) 25);
        setByteElement(term715917, 81, (byte) 26);
        setByteElement(term715917, 82, (byte) 27);
        setByteElement(term715917, 83, (byte) 28);
        setByteElement(term715917, 84, (byte) 29);
        setByteElement(term715917, 85, (byte) 30);
        setByteElement(term715917, 86, (byte) 31);
        setByteElement(term715917, 87, (byte) 32);
        setField(term715916, term715916.getClass(), "decodeTable", term715917);
        setIntField(term715916, term715916.getClass(), "encodeSize", 18);
        setByteElement(term715918, 0, (byte) 48);
        setByteElement(term715918, 1, (byte) 49);
        setByteElement(term715918, 2, (byte) 50);
        setByteElement(term715918, 3, (byte) 51);
        setByteElement(term715918, 4, (byte) 52);
        setByteElement(term715918, 5, (byte) 53);
        setByteElement(term715918, 6, (byte) 54);
        setByteElement(term715918, 7, (byte) 55);
        setByteElement(term715918, 8, (byte) 56);
        setByteElement(term715918, 9, (byte) 57);
        setByteElement(term715918, 10, (byte) 65);
        setByteElement(term715918, 11, (byte) 66);
        setByteElement(term715918, 12, (byte) 67);
        setByteElement(term715918, 13, (byte) 68);
        setByteElement(term715918, 14, (byte) 69);
        setByteElement(term715918, 15, (byte) 70);
        setByteElement(term715918, 16, (byte) 71);
        setByteElement(term715918, 17, (byte) 72);
        setByteElement(term715918, 18, (byte) 73);
        setByteElement(term715918, 19, (byte) 74);
        setByteElement(term715918, 20, (byte) 75);
        setByteElement(term715918, 21, (byte) 76);
        setByteElement(term715918, 22, (byte) 77);
        setByteElement(term715918, 23, (byte) 78);
        setByteElement(term715918, 24, (byte) 79);
        setByteElement(term715918, 25, (byte) 80);
        setByteElement(term715918, 26, (byte) 81);
        setByteElement(term715918, 27, (byte) 82);
        setByteElement(term715918, 28, (byte) 83);
        setByteElement(term715918, 29, (byte) 84);
        setByteElement(term715918, 30, (byte) 85);
        setByteElement(term715918, 31, (byte) 86);
        setField(term715916, term715916.getClass(), "encodeTable", term715918);
        setField(term715916, term715916.getClass(), "lineSeparator", term715919);
        setByteField(term715916, term715916.getClass(), "PAD", (byte) 61);
        setByteField(term715916, term715916.getClass(), "pad", (byte) 61);
        setIntField(term715916, term715916.getClass(), "unencodedBlockSize", 5);
        setIntField(term715916, term715916.getClass(), "encodedBlockSize", 8);
        setIntField(term715916, term715916.getClass(), "lineLength", 0);
        setIntField(term715916, term715916.getClass(), "chunkSeparatorLength", 10);
        term715920 = (byte[]) newByteArray(10);
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
        args[1] = term654975;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term715916));
        assertTrue(recursiveEquals(term654975, term715920));
    }

};


