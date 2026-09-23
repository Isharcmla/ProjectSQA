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

public class Base32_init_104091913526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8891;

    public Base32_init_104091913526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8587 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term7475 = (byte[]) newByteArray(0);
        setByteField(term8587, term8587.getClass(), "PAD", (byte) 0);
        setIntField(term8587, term8587.getClass(), "unencodedBlockSize", 0);
        setIntField(term8587, term8587.getClass(), "encodedBlockSize", 0);
        setIntField(term8587, term8587.getClass(), "lineLength", 0);
        setIntField(term8587, term8587.getClass(), "chunkSeparatorLength", 0);
        setByteField(term8587, term8587.getClass(), "pad", (byte) -128);
        setField(term8587, term8587.getClass(), "encodeTable", null);
        setField(term8587, term8587.getClass(), "decodeTable", term7475);
        term8891 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term8892 = (byte[]) newByteArray(91);
        byte[] term8893 = (byte[]) newByteArray(32);
        byte[] term8894 = (byte[]) newByteArray(2);
        setIntField(term8891, term8891.getClass(), "decodeSize", 9);
        setByteElement(term8892, 0, (byte) -1);
        setByteElement(term8892, 1, (byte) -1);
        setByteElement(term8892, 2, (byte) -1);
        setByteElement(term8892, 3, (byte) -1);
        setByteElement(term8892, 4, (byte) -1);
        setByteElement(term8892, 5, (byte) -1);
        setByteElement(term8892, 6, (byte) -1);
        setByteElement(term8892, 7, (byte) -1);
        setByteElement(term8892, 8, (byte) -1);
        setByteElement(term8892, 9, (byte) -1);
        setByteElement(term8892, 10, (byte) -1);
        setByteElement(term8892, 11, (byte) -1);
        setByteElement(term8892, 12, (byte) -1);
        setByteElement(term8892, 13, (byte) -1);
        setByteElement(term8892, 14, (byte) -1);
        setByteElement(term8892, 15, (byte) -1);
        setByteElement(term8892, 16, (byte) -1);
        setByteElement(term8892, 17, (byte) -1);
        setByteElement(term8892, 18, (byte) -1);
        setByteElement(term8892, 19, (byte) -1);
        setByteElement(term8892, 20, (byte) -1);
        setByteElement(term8892, 21, (byte) -1);
        setByteElement(term8892, 22, (byte) -1);
        setByteElement(term8892, 23, (byte) -1);
        setByteElement(term8892, 24, (byte) -1);
        setByteElement(term8892, 25, (byte) -1);
        setByteElement(term8892, 26, (byte) -1);
        setByteElement(term8892, 27, (byte) -1);
        setByteElement(term8892, 28, (byte) -1);
        setByteElement(term8892, 29, (byte) -1);
        setByteElement(term8892, 30, (byte) -1);
        setByteElement(term8892, 31, (byte) -1);
        setByteElement(term8892, 32, (byte) -1);
        setByteElement(term8892, 33, (byte) -1);
        setByteElement(term8892, 34, (byte) -1);
        setByteElement(term8892, 35, (byte) -1);
        setByteElement(term8892, 36, (byte) -1);
        setByteElement(term8892, 37, (byte) -1);
        setByteElement(term8892, 38, (byte) -1);
        setByteElement(term8892, 39, (byte) -1);
        setByteElement(term8892, 40, (byte) -1);
        setByteElement(term8892, 41, (byte) -1);
        setByteElement(term8892, 42, (byte) -1);
        setByteElement(term8892, 43, (byte) -1);
        setByteElement(term8892, 44, (byte) -1);
        setByteElement(term8892, 45, (byte) -1);
        setByteElement(term8892, 46, (byte) -1);
        setByteElement(term8892, 47, (byte) -1);
        setByteElement(term8892, 48, (byte) -1);
        setByteElement(term8892, 49, (byte) -1);
        setByteElement(term8892, 50, (byte) 26);
        setByteElement(term8892, 51, (byte) 27);
        setByteElement(term8892, 52, (byte) 28);
        setByteElement(term8892, 53, (byte) 29);
        setByteElement(term8892, 54, (byte) 30);
        setByteElement(term8892, 55, (byte) 31);
        setByteElement(term8892, 56, (byte) -1);
        setByteElement(term8892, 57, (byte) -1);
        setByteElement(term8892, 58, (byte) -1);
        setByteElement(term8892, 59, (byte) -1);
        setByteElement(term8892, 60, (byte) -1);
        setByteElement(term8892, 61, (byte) -1);
        setByteElement(term8892, 62, (byte) -1);
        setByteElement(term8892, 63, (byte) -1);
        setByteElement(term8892, 64, (byte) -1);
        setByteElement(term8892, 66, (byte) 1);
        setByteElement(term8892, 67, (byte) 2);
        setByteElement(term8892, 68, (byte) 3);
        setByteElement(term8892, 69, (byte) 4);
        setByteElement(term8892, 70, (byte) 5);
        setByteElement(term8892, 71, (byte) 6);
        setByteElement(term8892, 72, (byte) 7);
        setByteElement(term8892, 73, (byte) 8);
        setByteElement(term8892, 74, (byte) 9);
        setByteElement(term8892, 75, (byte) 10);
        setByteElement(term8892, 76, (byte) 11);
        setByteElement(term8892, 77, (byte) 12);
        setByteElement(term8892, 78, (byte) 13);
        setByteElement(term8892, 79, (byte) 14);
        setByteElement(term8892, 80, (byte) 15);
        setByteElement(term8892, 81, (byte) 16);
        setByteElement(term8892, 82, (byte) 17);
        setByteElement(term8892, 83, (byte) 18);
        setByteElement(term8892, 84, (byte) 19);
        setByteElement(term8892, 85, (byte) 20);
        setByteElement(term8892, 86, (byte) 21);
        setByteElement(term8892, 87, (byte) 22);
        setByteElement(term8892, 88, (byte) 23);
        setByteElement(term8892, 89, (byte) 24);
        setByteElement(term8892, 90, (byte) 25);
        setField(term8891, term8891.getClass(), "decodeTable", term8892);
        setIntField(term8891, term8891.getClass(), "encodeSize", 10);
        setByteElement(term8893, 0, (byte) 65);
        setByteElement(term8893, 1, (byte) 66);
        setByteElement(term8893, 2, (byte) 67);
        setByteElement(term8893, 3, (byte) 68);
        setByteElement(term8893, 4, (byte) 69);
        setByteElement(term8893, 5, (byte) 70);
        setByteElement(term8893, 6, (byte) 71);
        setByteElement(term8893, 7, (byte) 72);
        setByteElement(term8893, 8, (byte) 73);
        setByteElement(term8893, 9, (byte) 74);
        setByteElement(term8893, 10, (byte) 75);
        setByteElement(term8893, 11, (byte) 76);
        setByteElement(term8893, 12, (byte) 77);
        setByteElement(term8893, 13, (byte) 78);
        setByteElement(term8893, 14, (byte) 79);
        setByteElement(term8893, 15, (byte) 80);
        setByteElement(term8893, 16, (byte) 81);
        setByteElement(term8893, 17, (byte) 82);
        setByteElement(term8893, 18, (byte) 83);
        setByteElement(term8893, 19, (byte) 84);
        setByteElement(term8893, 20, (byte) 85);
        setByteElement(term8893, 21, (byte) 86);
        setByteElement(term8893, 22, (byte) 87);
        setByteElement(term8893, 23, (byte) 88);
        setByteElement(term8893, 24, (byte) 89);
        setByteElement(term8893, 25, (byte) 90);
        setByteElement(term8893, 26, (byte) 50);
        setByteElement(term8893, 27, (byte) 51);
        setByteElement(term8893, 28, (byte) 52);
        setByteElement(term8893, 29, (byte) 53);
        setByteElement(term8893, 30, (byte) 54);
        setByteElement(term8893, 31, (byte) 55);
        setField(term8891, term8891.getClass(), "encodeTable", term8893);
        setByteElement(term8894, 0, (byte) 13);
        setByteElement(term8894, 1, (byte) 10);
        setField(term8891, term8891.getClass(), "lineSeparator", term8894);
        setByteField(term8891, term8891.getClass(), "PAD", (byte) 61);
        setByteField(term8891, term8891.getClass(), "pad", (byte) 61);
        setIntField(term8891, term8891.getClass(), "unencodedBlockSize", 5);
        setIntField(term8891, term8891.getClass(), "encodedBlockSize", 8);
        setIntField(term8891, term8891.getClass(), "lineLength", 0);
        setIntField(term8891, term8891.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8891));
    }

};


