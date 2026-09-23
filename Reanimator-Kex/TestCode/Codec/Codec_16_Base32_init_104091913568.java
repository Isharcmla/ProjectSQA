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

public class Base32_init_104091913568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46488;

    public Base32_init_104091913568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45737 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term46488 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term46489 = (byte[]) newByteArray(91);
        byte[] term46490 = (byte[]) newByteArray(32);
        setIntField(term46488, term46488.getClass(), "decodeSize", 7);
        setByteElement(term46489, 0, (byte) -1);
        setByteElement(term46489, 1, (byte) -1);
        setByteElement(term46489, 2, (byte) -1);
        setByteElement(term46489, 3, (byte) -1);
        setByteElement(term46489, 4, (byte) -1);
        setByteElement(term46489, 5, (byte) -1);
        setByteElement(term46489, 6, (byte) -1);
        setByteElement(term46489, 7, (byte) -1);
        setByteElement(term46489, 8, (byte) -1);
        setByteElement(term46489, 9, (byte) -1);
        setByteElement(term46489, 10, (byte) -1);
        setByteElement(term46489, 11, (byte) -1);
        setByteElement(term46489, 12, (byte) -1);
        setByteElement(term46489, 13, (byte) -1);
        setByteElement(term46489, 14, (byte) -1);
        setByteElement(term46489, 15, (byte) -1);
        setByteElement(term46489, 16, (byte) -1);
        setByteElement(term46489, 17, (byte) -1);
        setByteElement(term46489, 18, (byte) -1);
        setByteElement(term46489, 19, (byte) -1);
        setByteElement(term46489, 20, (byte) -1);
        setByteElement(term46489, 21, (byte) -1);
        setByteElement(term46489, 22, (byte) -1);
        setByteElement(term46489, 23, (byte) -1);
        setByteElement(term46489, 24, (byte) -1);
        setByteElement(term46489, 25, (byte) -1);
        setByteElement(term46489, 26, (byte) -1);
        setByteElement(term46489, 27, (byte) -1);
        setByteElement(term46489, 28, (byte) -1);
        setByteElement(term46489, 29, (byte) -1);
        setByteElement(term46489, 30, (byte) -1);
        setByteElement(term46489, 31, (byte) -1);
        setByteElement(term46489, 32, (byte) -1);
        setByteElement(term46489, 33, (byte) -1);
        setByteElement(term46489, 34, (byte) -1);
        setByteElement(term46489, 35, (byte) -1);
        setByteElement(term46489, 36, (byte) -1);
        setByteElement(term46489, 37, (byte) -1);
        setByteElement(term46489, 38, (byte) -1);
        setByteElement(term46489, 39, (byte) -1);
        setByteElement(term46489, 40, (byte) -1);
        setByteElement(term46489, 41, (byte) -1);
        setByteElement(term46489, 42, (byte) -1);
        setByteElement(term46489, 43, (byte) -1);
        setByteElement(term46489, 44, (byte) -1);
        setByteElement(term46489, 45, (byte) -1);
        setByteElement(term46489, 46, (byte) -1);
        setByteElement(term46489, 47, (byte) -1);
        setByteElement(term46489, 48, (byte) -1);
        setByteElement(term46489, 49, (byte) -1);
        setByteElement(term46489, 50, (byte) 26);
        setByteElement(term46489, 51, (byte) 27);
        setByteElement(term46489, 52, (byte) 28);
        setByteElement(term46489, 53, (byte) 29);
        setByteElement(term46489, 54, (byte) 30);
        setByteElement(term46489, 55, (byte) 31);
        setByteElement(term46489, 56, (byte) -1);
        setByteElement(term46489, 57, (byte) -1);
        setByteElement(term46489, 58, (byte) -1);
        setByteElement(term46489, 59, (byte) -1);
        setByteElement(term46489, 60, (byte) -1);
        setByteElement(term46489, 61, (byte) -1);
        setByteElement(term46489, 62, (byte) -1);
        setByteElement(term46489, 63, (byte) -1);
        setByteElement(term46489, 64, (byte) -1);
        setByteElement(term46489, 66, (byte) 1);
        setByteElement(term46489, 67, (byte) 2);
        setByteElement(term46489, 68, (byte) 3);
        setByteElement(term46489, 69, (byte) 4);
        setByteElement(term46489, 70, (byte) 5);
        setByteElement(term46489, 71, (byte) 6);
        setByteElement(term46489, 72, (byte) 7);
        setByteElement(term46489, 73, (byte) 8);
        setByteElement(term46489, 74, (byte) 9);
        setByteElement(term46489, 75, (byte) 10);
        setByteElement(term46489, 76, (byte) 11);
        setByteElement(term46489, 77, (byte) 12);
        setByteElement(term46489, 78, (byte) 13);
        setByteElement(term46489, 79, (byte) 14);
        setByteElement(term46489, 80, (byte) 15);
        setByteElement(term46489, 81, (byte) 16);
        setByteElement(term46489, 82, (byte) 17);
        setByteElement(term46489, 83, (byte) 18);
        setByteElement(term46489, 84, (byte) 19);
        setByteElement(term46489, 85, (byte) 20);
        setByteElement(term46489, 86, (byte) 21);
        setByteElement(term46489, 87, (byte) 22);
        setByteElement(term46489, 88, (byte) 23);
        setByteElement(term46489, 89, (byte) 24);
        setByteElement(term46489, 90, (byte) 25);
        setField(term46488, term46488.getClass(), "decodeTable", term46489);
        setIntField(term46488, term46488.getClass(), "encodeSize", 8);
        setByteElement(term46490, 0, (byte) 65);
        setByteElement(term46490, 1, (byte) 66);
        setByteElement(term46490, 2, (byte) 67);
        setByteElement(term46490, 3, (byte) 68);
        setByteElement(term46490, 4, (byte) 69);
        setByteElement(term46490, 5, (byte) 70);
        setByteElement(term46490, 6, (byte) 71);
        setByteElement(term46490, 7, (byte) 72);
        setByteElement(term46490, 8, (byte) 73);
        setByteElement(term46490, 9, (byte) 74);
        setByteElement(term46490, 10, (byte) 75);
        setByteElement(term46490, 11, (byte) 76);
        setByteElement(term46490, 12, (byte) 77);
        setByteElement(term46490, 13, (byte) 78);
        setByteElement(term46490, 14, (byte) 79);
        setByteElement(term46490, 15, (byte) 80);
        setByteElement(term46490, 16, (byte) 81);
        setByteElement(term46490, 17, (byte) 82);
        setByteElement(term46490, 18, (byte) 83);
        setByteElement(term46490, 19, (byte) 84);
        setByteElement(term46490, 20, (byte) 85);
        setByteElement(term46490, 21, (byte) 86);
        setByteElement(term46490, 22, (byte) 87);
        setByteElement(term46490, 23, (byte) 88);
        setByteElement(term46490, 24, (byte) 89);
        setByteElement(term46490, 25, (byte) 90);
        setByteElement(term46490, 26, (byte) 50);
        setByteElement(term46490, 27, (byte) 51);
        setByteElement(term46490, 28, (byte) 52);
        setByteElement(term46490, 29, (byte) 53);
        setByteElement(term46490, 30, (byte) 54);
        setByteElement(term46490, 31, (byte) 55);
        setField(term46488, term46488.getClass(), "encodeTable", term46490);
        setField(term46488, term46488.getClass(), "lineSeparator", null);
        setByteField(term46488, term46488.getClass(), "PAD", (byte) 61);
        setByteField(term46488, term46488.getClass(), "pad", (byte) 61);
        setIntField(term46488, term46488.getClass(), "unencodedBlockSize", 5);
        setIntField(term46488, term46488.getClass(), "encodedBlockSize", 8);
        setIntField(term46488, term46488.getClass(), "lineLength", 0);
        setIntField(term46488, term46488.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46488));
    }

};


