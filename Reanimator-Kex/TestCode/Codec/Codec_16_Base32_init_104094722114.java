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
import java.lang.Boolean;
import java.lang.Byte;

public class Base32_init_104094722114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;
     Object term1892;

    public Base32_init_104094722114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = new Boolean(false);
        term7 = new Byte((byte) 48);
        term1892 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1893 = (byte[]) newByteArray(91);
        byte[] term1894 = (byte[]) newByteArray(32);
        setIntField(term1892, term1892.getClass(), "decodeSize", 7);
        setByteElement(term1893, 0, (byte) -1);
        setByteElement(term1893, 1, (byte) -1);
        setByteElement(term1893, 2, (byte) -1);
        setByteElement(term1893, 3, (byte) -1);
        setByteElement(term1893, 4, (byte) -1);
        setByteElement(term1893, 5, (byte) -1);
        setByteElement(term1893, 6, (byte) -1);
        setByteElement(term1893, 7, (byte) -1);
        setByteElement(term1893, 8, (byte) -1);
        setByteElement(term1893, 9, (byte) -1);
        setByteElement(term1893, 10, (byte) -1);
        setByteElement(term1893, 11, (byte) -1);
        setByteElement(term1893, 12, (byte) -1);
        setByteElement(term1893, 13, (byte) -1);
        setByteElement(term1893, 14, (byte) -1);
        setByteElement(term1893, 15, (byte) -1);
        setByteElement(term1893, 16, (byte) -1);
        setByteElement(term1893, 17, (byte) -1);
        setByteElement(term1893, 18, (byte) -1);
        setByteElement(term1893, 19, (byte) -1);
        setByteElement(term1893, 20, (byte) -1);
        setByteElement(term1893, 21, (byte) -1);
        setByteElement(term1893, 22, (byte) -1);
        setByteElement(term1893, 23, (byte) -1);
        setByteElement(term1893, 24, (byte) -1);
        setByteElement(term1893, 25, (byte) -1);
        setByteElement(term1893, 26, (byte) -1);
        setByteElement(term1893, 27, (byte) -1);
        setByteElement(term1893, 28, (byte) -1);
        setByteElement(term1893, 29, (byte) -1);
        setByteElement(term1893, 30, (byte) -1);
        setByteElement(term1893, 31, (byte) -1);
        setByteElement(term1893, 32, (byte) -1);
        setByteElement(term1893, 33, (byte) -1);
        setByteElement(term1893, 34, (byte) -1);
        setByteElement(term1893, 35, (byte) -1);
        setByteElement(term1893, 36, (byte) -1);
        setByteElement(term1893, 37, (byte) -1);
        setByteElement(term1893, 38, (byte) -1);
        setByteElement(term1893, 39, (byte) -1);
        setByteElement(term1893, 40, (byte) -1);
        setByteElement(term1893, 41, (byte) -1);
        setByteElement(term1893, 42, (byte) -1);
        setByteElement(term1893, 43, (byte) -1);
        setByteElement(term1893, 44, (byte) -1);
        setByteElement(term1893, 45, (byte) -1);
        setByteElement(term1893, 46, (byte) -1);
        setByteElement(term1893, 47, (byte) -1);
        setByteElement(term1893, 48, (byte) -1);
        setByteElement(term1893, 49, (byte) -1);
        setByteElement(term1893, 50, (byte) 26);
        setByteElement(term1893, 51, (byte) 27);
        setByteElement(term1893, 52, (byte) 28);
        setByteElement(term1893, 53, (byte) 29);
        setByteElement(term1893, 54, (byte) 30);
        setByteElement(term1893, 55, (byte) 31);
        setByteElement(term1893, 56, (byte) -1);
        setByteElement(term1893, 57, (byte) -1);
        setByteElement(term1893, 58, (byte) -1);
        setByteElement(term1893, 59, (byte) -1);
        setByteElement(term1893, 60, (byte) -1);
        setByteElement(term1893, 61, (byte) -1);
        setByteElement(term1893, 62, (byte) -1);
        setByteElement(term1893, 63, (byte) -1);
        setByteElement(term1893, 64, (byte) -1);
        setByteElement(term1893, 66, (byte) 1);
        setByteElement(term1893, 67, (byte) 2);
        setByteElement(term1893, 68, (byte) 3);
        setByteElement(term1893, 69, (byte) 4);
        setByteElement(term1893, 70, (byte) 5);
        setByteElement(term1893, 71, (byte) 6);
        setByteElement(term1893, 72, (byte) 7);
        setByteElement(term1893, 73, (byte) 8);
        setByteElement(term1893, 74, (byte) 9);
        setByteElement(term1893, 75, (byte) 10);
        setByteElement(term1893, 76, (byte) 11);
        setByteElement(term1893, 77, (byte) 12);
        setByteElement(term1893, 78, (byte) 13);
        setByteElement(term1893, 79, (byte) 14);
        setByteElement(term1893, 80, (byte) 15);
        setByteElement(term1893, 81, (byte) 16);
        setByteElement(term1893, 82, (byte) 17);
        setByteElement(term1893, 83, (byte) 18);
        setByteElement(term1893, 84, (byte) 19);
        setByteElement(term1893, 85, (byte) 20);
        setByteElement(term1893, 86, (byte) 21);
        setByteElement(term1893, 87, (byte) 22);
        setByteElement(term1893, 88, (byte) 23);
        setByteElement(term1893, 89, (byte) 24);
        setByteElement(term1893, 90, (byte) 25);
        setField(term1892, term1892.getClass(), "decodeTable", term1893);
        setIntField(term1892, term1892.getClass(), "encodeSize", 8);
        setByteElement(term1894, 0, (byte) 65);
        setByteElement(term1894, 1, (byte) 66);
        setByteElement(term1894, 2, (byte) 67);
        setByteElement(term1894, 3, (byte) 68);
        setByteElement(term1894, 4, (byte) 69);
        setByteElement(term1894, 5, (byte) 70);
        setByteElement(term1894, 6, (byte) 71);
        setByteElement(term1894, 7, (byte) 72);
        setByteElement(term1894, 8, (byte) 73);
        setByteElement(term1894, 9, (byte) 74);
        setByteElement(term1894, 10, (byte) 75);
        setByteElement(term1894, 11, (byte) 76);
        setByteElement(term1894, 12, (byte) 77);
        setByteElement(term1894, 13, (byte) 78);
        setByteElement(term1894, 14, (byte) 79);
        setByteElement(term1894, 15, (byte) 80);
        setByteElement(term1894, 16, (byte) 81);
        setByteElement(term1894, 17, (byte) 82);
        setByteElement(term1894, 18, (byte) 83);
        setByteElement(term1894, 19, (byte) 84);
        setByteElement(term1894, 20, (byte) 85);
        setByteElement(term1894, 21, (byte) 86);
        setByteElement(term1894, 22, (byte) 87);
        setByteElement(term1894, 23, (byte) 88);
        setByteElement(term1894, 24, (byte) 89);
        setByteElement(term1894, 25, (byte) 90);
        setByteElement(term1894, 26, (byte) 50);
        setByteElement(term1894, 27, (byte) 51);
        setByteElement(term1894, 28, (byte) 52);
        setByteElement(term1894, 29, (byte) 53);
        setByteElement(term1894, 30, (byte) 54);
        setByteElement(term1894, 31, (byte) 55);
        setField(term1892, term1892.getClass(), "encodeTable", term1894);
        setField(term1892, term1892.getClass(), "lineSeparator", null);
        setByteField(term1892, term1892.getClass(), "PAD", (byte) 61);
        setByteField(term1892, term1892.getClass(), "pad", (byte) 48);
        setIntField(term1892, term1892.getClass(), "unencodedBlockSize", 5);
        setIntField(term1892, term1892.getClass(), "encodedBlockSize", 8);
        setIntField(term1892, term1892.getClass(), "lineLength", 0);
        setIntField(term1892, term1892.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term5;
        args[1] = term7;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1892));
        assertTrue(recursiveEquals(term5, (byte) 48));
        assertTrue(recursiveEquals(term7, false));
    }

};


