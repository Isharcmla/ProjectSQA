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

public class Base32_init_1042801703244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441346;

    public Base32_init_1042801703244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term439576 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term439463 = (byte[]) newByteArray(0);
        setByteField(term439576, term439576.getClass(), "PAD", (byte) 0);
        setIntField(term439576, term439576.getClass(), "unencodedBlockSize", 0);
        setIntField(term439576, term439576.getClass(), "encodedBlockSize", 0);
        setIntField(term439576, term439576.getClass(), "lineLength", 0);
        setIntField(term439576, term439576.getClass(), "chunkSeparatorLength", 0);
        setByteField(term439576, term439576.getClass(), "pad", (byte) 0);
        setField(term439576, term439576.getClass(), "encodeTable", null);
        setField(term439576, term439576.getClass(), "decodeTable", term439463);
        setIntField(term439576, term439576.getClass(), "encodeSize", 0);
        setField(term439576, term439576.getClass(), "lineSeparator", term439463);
        setIntField(term439576, term439576.getClass(), "decodeSize", 0);
        term441346 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term441347 = (byte[]) newByteArray(91);
        byte[] term441348 = (byte[]) newByteArray(32);
        setIntField(term441346, term441346.getClass(), "decodeSize", 7);
        setByteElement(term441347, 0, (byte) -1);
        setByteElement(term441347, 1, (byte) -1);
        setByteElement(term441347, 2, (byte) -1);
        setByteElement(term441347, 3, (byte) -1);
        setByteElement(term441347, 4, (byte) -1);
        setByteElement(term441347, 5, (byte) -1);
        setByteElement(term441347, 6, (byte) -1);
        setByteElement(term441347, 7, (byte) -1);
        setByteElement(term441347, 8, (byte) -1);
        setByteElement(term441347, 9, (byte) -1);
        setByteElement(term441347, 10, (byte) -1);
        setByteElement(term441347, 11, (byte) -1);
        setByteElement(term441347, 12, (byte) -1);
        setByteElement(term441347, 13, (byte) -1);
        setByteElement(term441347, 14, (byte) -1);
        setByteElement(term441347, 15, (byte) -1);
        setByteElement(term441347, 16, (byte) -1);
        setByteElement(term441347, 17, (byte) -1);
        setByteElement(term441347, 18, (byte) -1);
        setByteElement(term441347, 19, (byte) -1);
        setByteElement(term441347, 20, (byte) -1);
        setByteElement(term441347, 21, (byte) -1);
        setByteElement(term441347, 22, (byte) -1);
        setByteElement(term441347, 23, (byte) -1);
        setByteElement(term441347, 24, (byte) -1);
        setByteElement(term441347, 25, (byte) -1);
        setByteElement(term441347, 26, (byte) -1);
        setByteElement(term441347, 27, (byte) -1);
        setByteElement(term441347, 28, (byte) -1);
        setByteElement(term441347, 29, (byte) -1);
        setByteElement(term441347, 30, (byte) -1);
        setByteElement(term441347, 31, (byte) -1);
        setByteElement(term441347, 32, (byte) -1);
        setByteElement(term441347, 33, (byte) -1);
        setByteElement(term441347, 34, (byte) -1);
        setByteElement(term441347, 35, (byte) -1);
        setByteElement(term441347, 36, (byte) -1);
        setByteElement(term441347, 37, (byte) -1);
        setByteElement(term441347, 38, (byte) -1);
        setByteElement(term441347, 39, (byte) -1);
        setByteElement(term441347, 40, (byte) -1);
        setByteElement(term441347, 41, (byte) -1);
        setByteElement(term441347, 42, (byte) -1);
        setByteElement(term441347, 43, (byte) -1);
        setByteElement(term441347, 44, (byte) -1);
        setByteElement(term441347, 45, (byte) -1);
        setByteElement(term441347, 46, (byte) -1);
        setByteElement(term441347, 47, (byte) -1);
        setByteElement(term441347, 48, (byte) -1);
        setByteElement(term441347, 49, (byte) -1);
        setByteElement(term441347, 50, (byte) 26);
        setByteElement(term441347, 51, (byte) 27);
        setByteElement(term441347, 52, (byte) 28);
        setByteElement(term441347, 53, (byte) 29);
        setByteElement(term441347, 54, (byte) 30);
        setByteElement(term441347, 55, (byte) 31);
        setByteElement(term441347, 56, (byte) -1);
        setByteElement(term441347, 57, (byte) -1);
        setByteElement(term441347, 58, (byte) -1);
        setByteElement(term441347, 59, (byte) -1);
        setByteElement(term441347, 60, (byte) -1);
        setByteElement(term441347, 61, (byte) -1);
        setByteElement(term441347, 62, (byte) -1);
        setByteElement(term441347, 63, (byte) -1);
        setByteElement(term441347, 64, (byte) -1);
        setByteElement(term441347, 66, (byte) 1);
        setByteElement(term441347, 67, (byte) 2);
        setByteElement(term441347, 68, (byte) 3);
        setByteElement(term441347, 69, (byte) 4);
        setByteElement(term441347, 70, (byte) 5);
        setByteElement(term441347, 71, (byte) 6);
        setByteElement(term441347, 72, (byte) 7);
        setByteElement(term441347, 73, (byte) 8);
        setByteElement(term441347, 74, (byte) 9);
        setByteElement(term441347, 75, (byte) 10);
        setByteElement(term441347, 76, (byte) 11);
        setByteElement(term441347, 77, (byte) 12);
        setByteElement(term441347, 78, (byte) 13);
        setByteElement(term441347, 79, (byte) 14);
        setByteElement(term441347, 80, (byte) 15);
        setByteElement(term441347, 81, (byte) 16);
        setByteElement(term441347, 82, (byte) 17);
        setByteElement(term441347, 83, (byte) 18);
        setByteElement(term441347, 84, (byte) 19);
        setByteElement(term441347, 85, (byte) 20);
        setByteElement(term441347, 86, (byte) 21);
        setByteElement(term441347, 87, (byte) 22);
        setByteElement(term441347, 88, (byte) 23);
        setByteElement(term441347, 89, (byte) 24);
        setByteElement(term441347, 90, (byte) 25);
        setField(term441346, term441346.getClass(), "decodeTable", term441347);
        setIntField(term441346, term441346.getClass(), "encodeSize", 8);
        setByteElement(term441348, 0, (byte) 65);
        setByteElement(term441348, 1, (byte) 66);
        setByteElement(term441348, 2, (byte) 67);
        setByteElement(term441348, 3, (byte) 68);
        setByteElement(term441348, 4, (byte) 69);
        setByteElement(term441348, 5, (byte) 70);
        setByteElement(term441348, 6, (byte) 71);
        setByteElement(term441348, 7, (byte) 72);
        setByteElement(term441348, 8, (byte) 73);
        setByteElement(term441348, 9, (byte) 74);
        setByteElement(term441348, 10, (byte) 75);
        setByteElement(term441348, 11, (byte) 76);
        setByteElement(term441348, 12, (byte) 77);
        setByteElement(term441348, 13, (byte) 78);
        setByteElement(term441348, 14, (byte) 79);
        setByteElement(term441348, 15, (byte) 80);
        setByteElement(term441348, 16, (byte) 81);
        setByteElement(term441348, 17, (byte) 82);
        setByteElement(term441348, 18, (byte) 83);
        setByteElement(term441348, 19, (byte) 84);
        setByteElement(term441348, 20, (byte) 85);
        setByteElement(term441348, 21, (byte) 86);
        setByteElement(term441348, 22, (byte) 87);
        setByteElement(term441348, 23, (byte) 88);
        setByteElement(term441348, 24, (byte) 89);
        setByteElement(term441348, 25, (byte) 90);
        setByteElement(term441348, 26, (byte) 50);
        setByteElement(term441348, 27, (byte) 51);
        setByteElement(term441348, 28, (byte) 52);
        setByteElement(term441348, 29, (byte) 53);
        setByteElement(term441348, 30, (byte) 54);
        setByteElement(term441348, 31, (byte) 55);
        setField(term441346, term441346.getClass(), "encodeTable", term441348);
        setField(term441346, term441346.getClass(), "lineSeparator", null);
        setByteField(term441346, term441346.getClass(), "PAD", (byte) 61);
        setByteField(term441346, term441346.getClass(), "pad", (byte) 61);
        setIntField(term441346, term441346.getClass(), "unencodedBlockSize", 5);
        setIntField(term441346, term441346.getClass(), "encodedBlockSize", 8);
        setIntField(term441346, term441346.getClass(), "lineLength", 0);
        setIntField(term441346, term441346.getClass(), "chunkSeparatorLength", 0);
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
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term441346));
    }

};


