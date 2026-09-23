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

public class Base32_init_104091913581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60371;

    public Base32_init_104091913581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term60215 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term60215, term60215.getClass(), "PAD", (byte) 0);
        setIntField(term60215, term60215.getClass(), "unencodedBlockSize", 0);
        setIntField(term60215, term60215.getClass(), "encodedBlockSize", 0);
        term60371 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term60372 = (byte[]) newByteArray(91);
        byte[] term60373 = (byte[]) newByteArray(32);
        setIntField(term60371, term60371.getClass(), "decodeSize", 7);
        setByteElement(term60372, 0, (byte) -1);
        setByteElement(term60372, 1, (byte) -1);
        setByteElement(term60372, 2, (byte) -1);
        setByteElement(term60372, 3, (byte) -1);
        setByteElement(term60372, 4, (byte) -1);
        setByteElement(term60372, 5, (byte) -1);
        setByteElement(term60372, 6, (byte) -1);
        setByteElement(term60372, 7, (byte) -1);
        setByteElement(term60372, 8, (byte) -1);
        setByteElement(term60372, 9, (byte) -1);
        setByteElement(term60372, 10, (byte) -1);
        setByteElement(term60372, 11, (byte) -1);
        setByteElement(term60372, 12, (byte) -1);
        setByteElement(term60372, 13, (byte) -1);
        setByteElement(term60372, 14, (byte) -1);
        setByteElement(term60372, 15, (byte) -1);
        setByteElement(term60372, 16, (byte) -1);
        setByteElement(term60372, 17, (byte) -1);
        setByteElement(term60372, 18, (byte) -1);
        setByteElement(term60372, 19, (byte) -1);
        setByteElement(term60372, 20, (byte) -1);
        setByteElement(term60372, 21, (byte) -1);
        setByteElement(term60372, 22, (byte) -1);
        setByteElement(term60372, 23, (byte) -1);
        setByteElement(term60372, 24, (byte) -1);
        setByteElement(term60372, 25, (byte) -1);
        setByteElement(term60372, 26, (byte) -1);
        setByteElement(term60372, 27, (byte) -1);
        setByteElement(term60372, 28, (byte) -1);
        setByteElement(term60372, 29, (byte) -1);
        setByteElement(term60372, 30, (byte) -1);
        setByteElement(term60372, 31, (byte) -1);
        setByteElement(term60372, 32, (byte) -1);
        setByteElement(term60372, 33, (byte) -1);
        setByteElement(term60372, 34, (byte) -1);
        setByteElement(term60372, 35, (byte) -1);
        setByteElement(term60372, 36, (byte) -1);
        setByteElement(term60372, 37, (byte) -1);
        setByteElement(term60372, 38, (byte) -1);
        setByteElement(term60372, 39, (byte) -1);
        setByteElement(term60372, 40, (byte) -1);
        setByteElement(term60372, 41, (byte) -1);
        setByteElement(term60372, 42, (byte) -1);
        setByteElement(term60372, 43, (byte) -1);
        setByteElement(term60372, 44, (byte) -1);
        setByteElement(term60372, 45, (byte) -1);
        setByteElement(term60372, 46, (byte) -1);
        setByteElement(term60372, 47, (byte) -1);
        setByteElement(term60372, 48, (byte) -1);
        setByteElement(term60372, 49, (byte) -1);
        setByteElement(term60372, 50, (byte) 26);
        setByteElement(term60372, 51, (byte) 27);
        setByteElement(term60372, 52, (byte) 28);
        setByteElement(term60372, 53, (byte) 29);
        setByteElement(term60372, 54, (byte) 30);
        setByteElement(term60372, 55, (byte) 31);
        setByteElement(term60372, 56, (byte) -1);
        setByteElement(term60372, 57, (byte) -1);
        setByteElement(term60372, 58, (byte) -1);
        setByteElement(term60372, 59, (byte) -1);
        setByteElement(term60372, 60, (byte) -1);
        setByteElement(term60372, 61, (byte) -1);
        setByteElement(term60372, 62, (byte) -1);
        setByteElement(term60372, 63, (byte) -1);
        setByteElement(term60372, 64, (byte) -1);
        setByteElement(term60372, 66, (byte) 1);
        setByteElement(term60372, 67, (byte) 2);
        setByteElement(term60372, 68, (byte) 3);
        setByteElement(term60372, 69, (byte) 4);
        setByteElement(term60372, 70, (byte) 5);
        setByteElement(term60372, 71, (byte) 6);
        setByteElement(term60372, 72, (byte) 7);
        setByteElement(term60372, 73, (byte) 8);
        setByteElement(term60372, 74, (byte) 9);
        setByteElement(term60372, 75, (byte) 10);
        setByteElement(term60372, 76, (byte) 11);
        setByteElement(term60372, 77, (byte) 12);
        setByteElement(term60372, 78, (byte) 13);
        setByteElement(term60372, 79, (byte) 14);
        setByteElement(term60372, 80, (byte) 15);
        setByteElement(term60372, 81, (byte) 16);
        setByteElement(term60372, 82, (byte) 17);
        setByteElement(term60372, 83, (byte) 18);
        setByteElement(term60372, 84, (byte) 19);
        setByteElement(term60372, 85, (byte) 20);
        setByteElement(term60372, 86, (byte) 21);
        setByteElement(term60372, 87, (byte) 22);
        setByteElement(term60372, 88, (byte) 23);
        setByteElement(term60372, 89, (byte) 24);
        setByteElement(term60372, 90, (byte) 25);
        setField(term60371, term60371.getClass(), "decodeTable", term60372);
        setIntField(term60371, term60371.getClass(), "encodeSize", 8);
        setByteElement(term60373, 0, (byte) 65);
        setByteElement(term60373, 1, (byte) 66);
        setByteElement(term60373, 2, (byte) 67);
        setByteElement(term60373, 3, (byte) 68);
        setByteElement(term60373, 4, (byte) 69);
        setByteElement(term60373, 5, (byte) 70);
        setByteElement(term60373, 6, (byte) 71);
        setByteElement(term60373, 7, (byte) 72);
        setByteElement(term60373, 8, (byte) 73);
        setByteElement(term60373, 9, (byte) 74);
        setByteElement(term60373, 10, (byte) 75);
        setByteElement(term60373, 11, (byte) 76);
        setByteElement(term60373, 12, (byte) 77);
        setByteElement(term60373, 13, (byte) 78);
        setByteElement(term60373, 14, (byte) 79);
        setByteElement(term60373, 15, (byte) 80);
        setByteElement(term60373, 16, (byte) 81);
        setByteElement(term60373, 17, (byte) 82);
        setByteElement(term60373, 18, (byte) 83);
        setByteElement(term60373, 19, (byte) 84);
        setByteElement(term60373, 20, (byte) 85);
        setByteElement(term60373, 21, (byte) 86);
        setByteElement(term60373, 22, (byte) 87);
        setByteElement(term60373, 23, (byte) 88);
        setByteElement(term60373, 24, (byte) 89);
        setByteElement(term60373, 25, (byte) 90);
        setByteElement(term60373, 26, (byte) 50);
        setByteElement(term60373, 27, (byte) 51);
        setByteElement(term60373, 28, (byte) 52);
        setByteElement(term60373, 29, (byte) 53);
        setByteElement(term60373, 30, (byte) 54);
        setByteElement(term60373, 31, (byte) 55);
        setField(term60371, term60371.getClass(), "encodeTable", term60373);
        setField(term60371, term60371.getClass(), "lineSeparator", null);
        setByteField(term60371, term60371.getClass(), "PAD", (byte) 61);
        setByteField(term60371, term60371.getClass(), "pad", (byte) 61);
        setIntField(term60371, term60371.getClass(), "unencodedBlockSize", 5);
        setIntField(term60371, term60371.getClass(), "encodedBlockSize", 8);
        setIntField(term60371, term60371.getClass(), "lineLength", 0);
        setIntField(term60371, term60371.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term60371));
    }

};


