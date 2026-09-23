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

public class Base32_init_1099337581317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607303;

    public Base32_init_1099337581317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term606134 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term605829 = (byte[]) newByteArray(0);
        byte[] term605634 = (byte[]) newByteArray(194);
        setByteField(term606134, term606134.getClass(), "PAD", (byte) 0);
        setIntField(term606134, term606134.getClass(), "unencodedBlockSize", 0);
        setIntField(term606134, term606134.getClass(), "encodedBlockSize", 0);
        setIntField(term606134, term606134.getClass(), "lineLength", 0);
        setIntField(term606134, term606134.getClass(), "chunkSeparatorLength", 0);
        setByteField(term606134, term606134.getClass(), "pad", (byte) 0);
        setField(term606134, term606134.getClass(), "encodeTable", term605829);
        setField(term606134, term606134.getClass(), "decodeTable", term605634);
        setIntField(term606134, term606134.getClass(), "encodeSize", 0);
        setField(term606134, term606134.getClass(), "lineSeparator", term605634);
        setIntField(term606134, term606134.getClass(), "decodeSize", 0);
        term607303 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term607304 = (byte[]) newByteArray(88);
        byte[] term607305 = (byte[]) newByteArray(32);
        setIntField(term607303, term607303.getClass(), "decodeSize", 7);
        setByteElement(term607304, 0, (byte) -1);
        setByteElement(term607304, 1, (byte) -1);
        setByteElement(term607304, 2, (byte) -1);
        setByteElement(term607304, 3, (byte) -1);
        setByteElement(term607304, 4, (byte) -1);
        setByteElement(term607304, 5, (byte) -1);
        setByteElement(term607304, 6, (byte) -1);
        setByteElement(term607304, 7, (byte) -1);
        setByteElement(term607304, 8, (byte) -1);
        setByteElement(term607304, 9, (byte) -1);
        setByteElement(term607304, 10, (byte) -1);
        setByteElement(term607304, 11, (byte) -1);
        setByteElement(term607304, 12, (byte) -1);
        setByteElement(term607304, 13, (byte) -1);
        setByteElement(term607304, 14, (byte) -1);
        setByteElement(term607304, 15, (byte) -1);
        setByteElement(term607304, 16, (byte) -1);
        setByteElement(term607304, 17, (byte) -1);
        setByteElement(term607304, 18, (byte) -1);
        setByteElement(term607304, 19, (byte) -1);
        setByteElement(term607304, 20, (byte) -1);
        setByteElement(term607304, 21, (byte) -1);
        setByteElement(term607304, 22, (byte) -1);
        setByteElement(term607304, 23, (byte) -1);
        setByteElement(term607304, 24, (byte) -1);
        setByteElement(term607304, 25, (byte) -1);
        setByteElement(term607304, 26, (byte) -1);
        setByteElement(term607304, 27, (byte) -1);
        setByteElement(term607304, 28, (byte) -1);
        setByteElement(term607304, 29, (byte) -1);
        setByteElement(term607304, 30, (byte) -1);
        setByteElement(term607304, 31, (byte) -1);
        setByteElement(term607304, 32, (byte) -1);
        setByteElement(term607304, 33, (byte) -1);
        setByteElement(term607304, 34, (byte) -1);
        setByteElement(term607304, 35, (byte) -1);
        setByteElement(term607304, 36, (byte) -1);
        setByteElement(term607304, 37, (byte) -1);
        setByteElement(term607304, 38, (byte) -1);
        setByteElement(term607304, 39, (byte) -1);
        setByteElement(term607304, 40, (byte) -1);
        setByteElement(term607304, 41, (byte) -1);
        setByteElement(term607304, 42, (byte) -1);
        setByteElement(term607304, 43, (byte) -1);
        setByteElement(term607304, 44, (byte) -1);
        setByteElement(term607304, 45, (byte) -1);
        setByteElement(term607304, 46, (byte) -1);
        setByteElement(term607304, 47, (byte) -1);
        setByteElement(term607304, 49, (byte) 1);
        setByteElement(term607304, 50, (byte) 2);
        setByteElement(term607304, 51, (byte) 3);
        setByteElement(term607304, 52, (byte) 4);
        setByteElement(term607304, 53, (byte) 5);
        setByteElement(term607304, 54, (byte) 6);
        setByteElement(term607304, 55, (byte) 7);
        setByteElement(term607304, 56, (byte) 8);
        setByteElement(term607304, 57, (byte) 9);
        setByteElement(term607304, 58, (byte) -1);
        setByteElement(term607304, 59, (byte) -1);
        setByteElement(term607304, 60, (byte) -1);
        setByteElement(term607304, 61, (byte) -1);
        setByteElement(term607304, 62, (byte) -1);
        setByteElement(term607304, 63, (byte) -1);
        setByteElement(term607304, 64, (byte) -1);
        setByteElement(term607304, 65, (byte) 10);
        setByteElement(term607304, 66, (byte) 11);
        setByteElement(term607304, 67, (byte) 12);
        setByteElement(term607304, 68, (byte) 13);
        setByteElement(term607304, 69, (byte) 14);
        setByteElement(term607304, 70, (byte) 15);
        setByteElement(term607304, 71, (byte) 16);
        setByteElement(term607304, 72, (byte) 17);
        setByteElement(term607304, 73, (byte) 18);
        setByteElement(term607304, 74, (byte) 19);
        setByteElement(term607304, 75, (byte) 20);
        setByteElement(term607304, 76, (byte) 21);
        setByteElement(term607304, 77, (byte) 22);
        setByteElement(term607304, 78, (byte) 23);
        setByteElement(term607304, 79, (byte) 24);
        setByteElement(term607304, 80, (byte) 25);
        setByteElement(term607304, 81, (byte) 26);
        setByteElement(term607304, 82, (byte) 27);
        setByteElement(term607304, 83, (byte) 28);
        setByteElement(term607304, 84, (byte) 29);
        setByteElement(term607304, 85, (byte) 30);
        setByteElement(term607304, 86, (byte) 31);
        setByteElement(term607304, 87, (byte) 32);
        setField(term607303, term607303.getClass(), "decodeTable", term607304);
        setIntField(term607303, term607303.getClass(), "encodeSize", 8);
        setByteElement(term607305, 0, (byte) 48);
        setByteElement(term607305, 1, (byte) 49);
        setByteElement(term607305, 2, (byte) 50);
        setByteElement(term607305, 3, (byte) 51);
        setByteElement(term607305, 4, (byte) 52);
        setByteElement(term607305, 5, (byte) 53);
        setByteElement(term607305, 6, (byte) 54);
        setByteElement(term607305, 7, (byte) 55);
        setByteElement(term607305, 8, (byte) 56);
        setByteElement(term607305, 9, (byte) 57);
        setByteElement(term607305, 10, (byte) 65);
        setByteElement(term607305, 11, (byte) 66);
        setByteElement(term607305, 12, (byte) 67);
        setByteElement(term607305, 13, (byte) 68);
        setByteElement(term607305, 14, (byte) 69);
        setByteElement(term607305, 15, (byte) 70);
        setByteElement(term607305, 16, (byte) 71);
        setByteElement(term607305, 17, (byte) 72);
        setByteElement(term607305, 18, (byte) 73);
        setByteElement(term607305, 19, (byte) 74);
        setByteElement(term607305, 20, (byte) 75);
        setByteElement(term607305, 21, (byte) 76);
        setByteElement(term607305, 22, (byte) 77);
        setByteElement(term607305, 23, (byte) 78);
        setByteElement(term607305, 24, (byte) 79);
        setByteElement(term607305, 25, (byte) 80);
        setByteElement(term607305, 26, (byte) 81);
        setByteElement(term607305, 27, (byte) 82);
        setByteElement(term607305, 28, (byte) 83);
        setByteElement(term607305, 29, (byte) 84);
        setByteElement(term607305, 30, (byte) 85);
        setByteElement(term607305, 31, (byte) 86);
        setField(term607303, term607303.getClass(), "encodeTable", term607305);
        setField(term607303, term607303.getClass(), "lineSeparator", null);
        setByteField(term607303, term607303.getClass(), "PAD", (byte) 61);
        setByteField(term607303, term607303.getClass(), "pad", (byte) -128);
        setIntField(term607303, term607303.getClass(), "unencodedBlockSize", 5);
        setIntField(term607303, term607303.getClass(), "encodedBlockSize", 8);
        setIntField(term607303, term607303.getClass(), "lineLength", 0);
        setIntField(term607303, term607303.getClass(), "chunkSeparatorLength", 0);
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
        args[3] = (byte) -128;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term607303));
    }

};


