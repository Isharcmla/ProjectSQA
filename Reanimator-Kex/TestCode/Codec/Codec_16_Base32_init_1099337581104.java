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

public class Base32_init_1099337581104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113629;
     Object term114322;
     Object term114325;

    public Base32_init_1099337581104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113731 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term113731, term113731.getClass(), "PAD", (byte) 0);
        setIntField(term113731, term113731.getClass(), "unencodedBlockSize", 0);
        setIntField(term113731, term113731.getClass(), "encodedBlockSize", 0);
        term113629 = (byte[]) newByteArray(0);
        term114322 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term114323 = (byte[]) newByteArray(91);
        byte[] term114324 = (byte[]) newByteArray(32);
        setIntField(term114322, term114322.getClass(), "decodeSize", 7);
        setByteElement(term114323, 0, (byte) -1);
        setByteElement(term114323, 1, (byte) -1);
        setByteElement(term114323, 2, (byte) -1);
        setByteElement(term114323, 3, (byte) -1);
        setByteElement(term114323, 4, (byte) -1);
        setByteElement(term114323, 5, (byte) -1);
        setByteElement(term114323, 6, (byte) -1);
        setByteElement(term114323, 7, (byte) -1);
        setByteElement(term114323, 8, (byte) -1);
        setByteElement(term114323, 9, (byte) -1);
        setByteElement(term114323, 10, (byte) -1);
        setByteElement(term114323, 11, (byte) -1);
        setByteElement(term114323, 12, (byte) -1);
        setByteElement(term114323, 13, (byte) -1);
        setByteElement(term114323, 14, (byte) -1);
        setByteElement(term114323, 15, (byte) -1);
        setByteElement(term114323, 16, (byte) -1);
        setByteElement(term114323, 17, (byte) -1);
        setByteElement(term114323, 18, (byte) -1);
        setByteElement(term114323, 19, (byte) -1);
        setByteElement(term114323, 20, (byte) -1);
        setByteElement(term114323, 21, (byte) -1);
        setByteElement(term114323, 22, (byte) -1);
        setByteElement(term114323, 23, (byte) -1);
        setByteElement(term114323, 24, (byte) -1);
        setByteElement(term114323, 25, (byte) -1);
        setByteElement(term114323, 26, (byte) -1);
        setByteElement(term114323, 27, (byte) -1);
        setByteElement(term114323, 28, (byte) -1);
        setByteElement(term114323, 29, (byte) -1);
        setByteElement(term114323, 30, (byte) -1);
        setByteElement(term114323, 31, (byte) -1);
        setByteElement(term114323, 32, (byte) -1);
        setByteElement(term114323, 33, (byte) -1);
        setByteElement(term114323, 34, (byte) -1);
        setByteElement(term114323, 35, (byte) -1);
        setByteElement(term114323, 36, (byte) -1);
        setByteElement(term114323, 37, (byte) -1);
        setByteElement(term114323, 38, (byte) -1);
        setByteElement(term114323, 39, (byte) -1);
        setByteElement(term114323, 40, (byte) -1);
        setByteElement(term114323, 41, (byte) -1);
        setByteElement(term114323, 42, (byte) -1);
        setByteElement(term114323, 43, (byte) -1);
        setByteElement(term114323, 44, (byte) -1);
        setByteElement(term114323, 45, (byte) -1);
        setByteElement(term114323, 46, (byte) -1);
        setByteElement(term114323, 47, (byte) -1);
        setByteElement(term114323, 48, (byte) -1);
        setByteElement(term114323, 49, (byte) -1);
        setByteElement(term114323, 50, (byte) 26);
        setByteElement(term114323, 51, (byte) 27);
        setByteElement(term114323, 52, (byte) 28);
        setByteElement(term114323, 53, (byte) 29);
        setByteElement(term114323, 54, (byte) 30);
        setByteElement(term114323, 55, (byte) 31);
        setByteElement(term114323, 56, (byte) -1);
        setByteElement(term114323, 57, (byte) -1);
        setByteElement(term114323, 58, (byte) -1);
        setByteElement(term114323, 59, (byte) -1);
        setByteElement(term114323, 60, (byte) -1);
        setByteElement(term114323, 61, (byte) -1);
        setByteElement(term114323, 62, (byte) -1);
        setByteElement(term114323, 63, (byte) -1);
        setByteElement(term114323, 64, (byte) -1);
        setByteElement(term114323, 66, (byte) 1);
        setByteElement(term114323, 67, (byte) 2);
        setByteElement(term114323, 68, (byte) 3);
        setByteElement(term114323, 69, (byte) 4);
        setByteElement(term114323, 70, (byte) 5);
        setByteElement(term114323, 71, (byte) 6);
        setByteElement(term114323, 72, (byte) 7);
        setByteElement(term114323, 73, (byte) 8);
        setByteElement(term114323, 74, (byte) 9);
        setByteElement(term114323, 75, (byte) 10);
        setByteElement(term114323, 76, (byte) 11);
        setByteElement(term114323, 77, (byte) 12);
        setByteElement(term114323, 78, (byte) 13);
        setByteElement(term114323, 79, (byte) 14);
        setByteElement(term114323, 80, (byte) 15);
        setByteElement(term114323, 81, (byte) 16);
        setByteElement(term114323, 82, (byte) 17);
        setByteElement(term114323, 83, (byte) 18);
        setByteElement(term114323, 84, (byte) 19);
        setByteElement(term114323, 85, (byte) 20);
        setByteElement(term114323, 86, (byte) 21);
        setByteElement(term114323, 87, (byte) 22);
        setByteElement(term114323, 88, (byte) 23);
        setByteElement(term114323, 89, (byte) 24);
        setByteElement(term114323, 90, (byte) 25);
        setField(term114322, term114322.getClass(), "decodeTable", term114323);
        setIntField(term114322, term114322.getClass(), "encodeSize", 8);
        setByteElement(term114324, 0, (byte) 65);
        setByteElement(term114324, 1, (byte) 66);
        setByteElement(term114324, 2, (byte) 67);
        setByteElement(term114324, 3, (byte) 68);
        setByteElement(term114324, 4, (byte) 69);
        setByteElement(term114324, 5, (byte) 70);
        setByteElement(term114324, 6, (byte) 71);
        setByteElement(term114324, 7, (byte) 72);
        setByteElement(term114324, 8, (byte) 73);
        setByteElement(term114324, 9, (byte) 74);
        setByteElement(term114324, 10, (byte) 75);
        setByteElement(term114324, 11, (byte) 76);
        setByteElement(term114324, 12, (byte) 77);
        setByteElement(term114324, 13, (byte) 78);
        setByteElement(term114324, 14, (byte) 79);
        setByteElement(term114324, 15, (byte) 80);
        setByteElement(term114324, 16, (byte) 81);
        setByteElement(term114324, 17, (byte) 82);
        setByteElement(term114324, 18, (byte) 83);
        setByteElement(term114324, 19, (byte) 84);
        setByteElement(term114324, 20, (byte) 85);
        setByteElement(term114324, 21, (byte) 86);
        setByteElement(term114324, 22, (byte) 87);
        setByteElement(term114324, 23, (byte) 88);
        setByteElement(term114324, 24, (byte) 89);
        setByteElement(term114324, 25, (byte) 90);
        setByteElement(term114324, 26, (byte) 50);
        setByteElement(term114324, 27, (byte) 51);
        setByteElement(term114324, 28, (byte) 52);
        setByteElement(term114324, 29, (byte) 53);
        setByteElement(term114324, 30, (byte) 54);
        setByteElement(term114324, 31, (byte) 55);
        setField(term114322, term114322.getClass(), "encodeTable", term114324);
        setField(term114322, term114322.getClass(), "lineSeparator", null);
        setByteField(term114322, term114322.getClass(), "PAD", (byte) 61);
        setByteField(term114322, term114322.getClass(), "pad", (byte) 0);
        setIntField(term114322, term114322.getClass(), "unencodedBlockSize", 5);
        setIntField(term114322, term114322.getClass(), "encodedBlockSize", 8);
        setIntField(term114322, term114322.getClass(), "lineLength", 0);
        setIntField(term114322, term114322.getClass(), "chunkSeparatorLength", 0);
        term114325 = (byte[]) newByteArray(0);
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
        args[1] = term113629;
        args[2] = false;
        args[3] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term114322));
        assertTrue(recursiveEquals(term113629, (byte) 0));
    }

};


