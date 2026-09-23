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

public class Base32_init_1099337581271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497726;
     Object term501590;
     Object term501593;

    public Base32_init_1099337581271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term500416 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term498759 = (byte[]) newByteArray(0);
        term497726 = (byte[]) newByteArray(512);
        setByteField(term500416, term500416.getClass(), "PAD", (byte) 0);
        setIntField(term500416, term500416.getClass(), "unencodedBlockSize", 0);
        setIntField(term500416, term500416.getClass(), "encodedBlockSize", 0);
        setIntField(term500416, term500416.getClass(), "lineLength", 0);
        setIntField(term500416, term500416.getClass(), "chunkSeparatorLength", 0);
        setByteField(term500416, term500416.getClass(), "pad", (byte) 0);
        setField(term500416, term500416.getClass(), "encodeTable", term498759);
        setField(term500416, term500416.getClass(), "decodeTable", term497726);
        setIntField(term500416, term500416.getClass(), "encodeSize", 0);
        setField(term500416, term500416.getClass(), "lineSeparator", term498759);
        setIntField(term500416, term500416.getClass(), "decodeSize", 0);
        term501590 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term501591 = (byte[]) newByteArray(88);
        byte[] term501592 = (byte[]) newByteArray(32);
        setIntField(term501590, term501590.getClass(), "decodeSize", 7);
        setByteElement(term501591, 0, (byte) -1);
        setByteElement(term501591, 1, (byte) -1);
        setByteElement(term501591, 2, (byte) -1);
        setByteElement(term501591, 3, (byte) -1);
        setByteElement(term501591, 4, (byte) -1);
        setByteElement(term501591, 5, (byte) -1);
        setByteElement(term501591, 6, (byte) -1);
        setByteElement(term501591, 7, (byte) -1);
        setByteElement(term501591, 8, (byte) -1);
        setByteElement(term501591, 9, (byte) -1);
        setByteElement(term501591, 10, (byte) -1);
        setByteElement(term501591, 11, (byte) -1);
        setByteElement(term501591, 12, (byte) -1);
        setByteElement(term501591, 13, (byte) -1);
        setByteElement(term501591, 14, (byte) -1);
        setByteElement(term501591, 15, (byte) -1);
        setByteElement(term501591, 16, (byte) -1);
        setByteElement(term501591, 17, (byte) -1);
        setByteElement(term501591, 18, (byte) -1);
        setByteElement(term501591, 19, (byte) -1);
        setByteElement(term501591, 20, (byte) -1);
        setByteElement(term501591, 21, (byte) -1);
        setByteElement(term501591, 22, (byte) -1);
        setByteElement(term501591, 23, (byte) -1);
        setByteElement(term501591, 24, (byte) -1);
        setByteElement(term501591, 25, (byte) -1);
        setByteElement(term501591, 26, (byte) -1);
        setByteElement(term501591, 27, (byte) -1);
        setByteElement(term501591, 28, (byte) -1);
        setByteElement(term501591, 29, (byte) -1);
        setByteElement(term501591, 30, (byte) -1);
        setByteElement(term501591, 31, (byte) -1);
        setByteElement(term501591, 32, (byte) -1);
        setByteElement(term501591, 33, (byte) -1);
        setByteElement(term501591, 34, (byte) -1);
        setByteElement(term501591, 35, (byte) -1);
        setByteElement(term501591, 36, (byte) -1);
        setByteElement(term501591, 37, (byte) -1);
        setByteElement(term501591, 38, (byte) -1);
        setByteElement(term501591, 39, (byte) -1);
        setByteElement(term501591, 40, (byte) -1);
        setByteElement(term501591, 41, (byte) -1);
        setByteElement(term501591, 42, (byte) -1);
        setByteElement(term501591, 43, (byte) -1);
        setByteElement(term501591, 44, (byte) -1);
        setByteElement(term501591, 45, (byte) -1);
        setByteElement(term501591, 46, (byte) -1);
        setByteElement(term501591, 47, (byte) -1);
        setByteElement(term501591, 49, (byte) 1);
        setByteElement(term501591, 50, (byte) 2);
        setByteElement(term501591, 51, (byte) 3);
        setByteElement(term501591, 52, (byte) 4);
        setByteElement(term501591, 53, (byte) 5);
        setByteElement(term501591, 54, (byte) 6);
        setByteElement(term501591, 55, (byte) 7);
        setByteElement(term501591, 56, (byte) 8);
        setByteElement(term501591, 57, (byte) 9);
        setByteElement(term501591, 58, (byte) -1);
        setByteElement(term501591, 59, (byte) -1);
        setByteElement(term501591, 60, (byte) -1);
        setByteElement(term501591, 61, (byte) -1);
        setByteElement(term501591, 62, (byte) -1);
        setByteElement(term501591, 63, (byte) -1);
        setByteElement(term501591, 64, (byte) -1);
        setByteElement(term501591, 65, (byte) 10);
        setByteElement(term501591, 66, (byte) 11);
        setByteElement(term501591, 67, (byte) 12);
        setByteElement(term501591, 68, (byte) 13);
        setByteElement(term501591, 69, (byte) 14);
        setByteElement(term501591, 70, (byte) 15);
        setByteElement(term501591, 71, (byte) 16);
        setByteElement(term501591, 72, (byte) 17);
        setByteElement(term501591, 73, (byte) 18);
        setByteElement(term501591, 74, (byte) 19);
        setByteElement(term501591, 75, (byte) 20);
        setByteElement(term501591, 76, (byte) 21);
        setByteElement(term501591, 77, (byte) 22);
        setByteElement(term501591, 78, (byte) 23);
        setByteElement(term501591, 79, (byte) 24);
        setByteElement(term501591, 80, (byte) 25);
        setByteElement(term501591, 81, (byte) 26);
        setByteElement(term501591, 82, (byte) 27);
        setByteElement(term501591, 83, (byte) 28);
        setByteElement(term501591, 84, (byte) 29);
        setByteElement(term501591, 85, (byte) 30);
        setByteElement(term501591, 86, (byte) 31);
        setByteElement(term501591, 87, (byte) 32);
        setField(term501590, term501590.getClass(), "decodeTable", term501591);
        setIntField(term501590, term501590.getClass(), "encodeSize", 8);
        setByteElement(term501592, 0, (byte) 48);
        setByteElement(term501592, 1, (byte) 49);
        setByteElement(term501592, 2, (byte) 50);
        setByteElement(term501592, 3, (byte) 51);
        setByteElement(term501592, 4, (byte) 52);
        setByteElement(term501592, 5, (byte) 53);
        setByteElement(term501592, 6, (byte) 54);
        setByteElement(term501592, 7, (byte) 55);
        setByteElement(term501592, 8, (byte) 56);
        setByteElement(term501592, 9, (byte) 57);
        setByteElement(term501592, 10, (byte) 65);
        setByteElement(term501592, 11, (byte) 66);
        setByteElement(term501592, 12, (byte) 67);
        setByteElement(term501592, 13, (byte) 68);
        setByteElement(term501592, 14, (byte) 69);
        setByteElement(term501592, 15, (byte) 70);
        setByteElement(term501592, 16, (byte) 71);
        setByteElement(term501592, 17, (byte) 72);
        setByteElement(term501592, 18, (byte) 73);
        setByteElement(term501592, 19, (byte) 74);
        setByteElement(term501592, 20, (byte) 75);
        setByteElement(term501592, 21, (byte) 76);
        setByteElement(term501592, 22, (byte) 77);
        setByteElement(term501592, 23, (byte) 78);
        setByteElement(term501592, 24, (byte) 79);
        setByteElement(term501592, 25, (byte) 80);
        setByteElement(term501592, 26, (byte) 81);
        setByteElement(term501592, 27, (byte) 82);
        setByteElement(term501592, 28, (byte) 83);
        setByteElement(term501592, 29, (byte) 84);
        setByteElement(term501592, 30, (byte) 85);
        setByteElement(term501592, 31, (byte) 86);
        setField(term501590, term501590.getClass(), "encodeTable", term501592);
        setField(term501590, term501590.getClass(), "lineSeparator", null);
        setByteField(term501590, term501590.getClass(), "PAD", (byte) 61);
        setByteField(term501590, term501590.getClass(), "pad", (byte) 126);
        setIntField(term501590, term501590.getClass(), "unencodedBlockSize", 5);
        setIntField(term501590, term501590.getClass(), "encodedBlockSize", 8);
        setIntField(term501590, term501590.getClass(), "lineLength", 0);
        setIntField(term501590, term501590.getClass(), "chunkSeparatorLength", 512);
        term501593 = (byte[]) newByteArray(512);
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
        args[1] = term497726;
        args[2] = true;
        args[3] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term501590));
        assertTrue(recursiveEquals(term497726, (byte) 126));
    }

};


