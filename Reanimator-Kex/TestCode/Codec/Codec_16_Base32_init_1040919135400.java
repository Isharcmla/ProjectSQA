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

public class Base32_init_1040919135400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term827804;

    public Base32_init_1040919135400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term802414 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term801304 = (byte[]) newByteArray(0);
        setByteField(term802414, term802414.getClass(), "PAD", (byte) -128);
        setIntField(term802414, term802414.getClass(), "unencodedBlockSize", 0);
        setIntField(term802414, term802414.getClass(), "encodedBlockSize", 0);
        setIntField(term802414, term802414.getClass(), "lineLength", 0);
        setIntField(term802414, term802414.getClass(), "chunkSeparatorLength", 0);
        setByteField(term802414, term802414.getClass(), "pad", (byte) -128);
        setField(term802414, term802414.getClass(), "encodeTable", null);
        setField(term802414, term802414.getClass(), "decodeTable", term801304);
        term827804 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term827805 = (byte[]) newByteArray(91);
        byte[] term827806 = (byte[]) newByteArray(32);
        byte[] term827807 = (byte[]) newByteArray(2);
        setIntField(term827804, term827804.getClass(), "decodeSize", 9);
        setByteElement(term827805, 0, (byte) -1);
        setByteElement(term827805, 1, (byte) -1);
        setByteElement(term827805, 2, (byte) -1);
        setByteElement(term827805, 3, (byte) -1);
        setByteElement(term827805, 4, (byte) -1);
        setByteElement(term827805, 5, (byte) -1);
        setByteElement(term827805, 6, (byte) -1);
        setByteElement(term827805, 7, (byte) -1);
        setByteElement(term827805, 8, (byte) -1);
        setByteElement(term827805, 9, (byte) -1);
        setByteElement(term827805, 10, (byte) -1);
        setByteElement(term827805, 11, (byte) -1);
        setByteElement(term827805, 12, (byte) -1);
        setByteElement(term827805, 13, (byte) -1);
        setByteElement(term827805, 14, (byte) -1);
        setByteElement(term827805, 15, (byte) -1);
        setByteElement(term827805, 16, (byte) -1);
        setByteElement(term827805, 17, (byte) -1);
        setByteElement(term827805, 18, (byte) -1);
        setByteElement(term827805, 19, (byte) -1);
        setByteElement(term827805, 20, (byte) -1);
        setByteElement(term827805, 21, (byte) -1);
        setByteElement(term827805, 22, (byte) -1);
        setByteElement(term827805, 23, (byte) -1);
        setByteElement(term827805, 24, (byte) -1);
        setByteElement(term827805, 25, (byte) -1);
        setByteElement(term827805, 26, (byte) -1);
        setByteElement(term827805, 27, (byte) -1);
        setByteElement(term827805, 28, (byte) -1);
        setByteElement(term827805, 29, (byte) -1);
        setByteElement(term827805, 30, (byte) -1);
        setByteElement(term827805, 31, (byte) -1);
        setByteElement(term827805, 32, (byte) -1);
        setByteElement(term827805, 33, (byte) -1);
        setByteElement(term827805, 34, (byte) -1);
        setByteElement(term827805, 35, (byte) -1);
        setByteElement(term827805, 36, (byte) -1);
        setByteElement(term827805, 37, (byte) -1);
        setByteElement(term827805, 38, (byte) -1);
        setByteElement(term827805, 39, (byte) -1);
        setByteElement(term827805, 40, (byte) -1);
        setByteElement(term827805, 41, (byte) -1);
        setByteElement(term827805, 42, (byte) -1);
        setByteElement(term827805, 43, (byte) -1);
        setByteElement(term827805, 44, (byte) -1);
        setByteElement(term827805, 45, (byte) -1);
        setByteElement(term827805, 46, (byte) -1);
        setByteElement(term827805, 47, (byte) -1);
        setByteElement(term827805, 48, (byte) -1);
        setByteElement(term827805, 49, (byte) -1);
        setByteElement(term827805, 50, (byte) 26);
        setByteElement(term827805, 51, (byte) 27);
        setByteElement(term827805, 52, (byte) 28);
        setByteElement(term827805, 53, (byte) 29);
        setByteElement(term827805, 54, (byte) 30);
        setByteElement(term827805, 55, (byte) 31);
        setByteElement(term827805, 56, (byte) -1);
        setByteElement(term827805, 57, (byte) -1);
        setByteElement(term827805, 58, (byte) -1);
        setByteElement(term827805, 59, (byte) -1);
        setByteElement(term827805, 60, (byte) -1);
        setByteElement(term827805, 61, (byte) -1);
        setByteElement(term827805, 62, (byte) -1);
        setByteElement(term827805, 63, (byte) -1);
        setByteElement(term827805, 64, (byte) -1);
        setByteElement(term827805, 66, (byte) 1);
        setByteElement(term827805, 67, (byte) 2);
        setByteElement(term827805, 68, (byte) 3);
        setByteElement(term827805, 69, (byte) 4);
        setByteElement(term827805, 70, (byte) 5);
        setByteElement(term827805, 71, (byte) 6);
        setByteElement(term827805, 72, (byte) 7);
        setByteElement(term827805, 73, (byte) 8);
        setByteElement(term827805, 74, (byte) 9);
        setByteElement(term827805, 75, (byte) 10);
        setByteElement(term827805, 76, (byte) 11);
        setByteElement(term827805, 77, (byte) 12);
        setByteElement(term827805, 78, (byte) 13);
        setByteElement(term827805, 79, (byte) 14);
        setByteElement(term827805, 80, (byte) 15);
        setByteElement(term827805, 81, (byte) 16);
        setByteElement(term827805, 82, (byte) 17);
        setByteElement(term827805, 83, (byte) 18);
        setByteElement(term827805, 84, (byte) 19);
        setByteElement(term827805, 85, (byte) 20);
        setByteElement(term827805, 86, (byte) 21);
        setByteElement(term827805, 87, (byte) 22);
        setByteElement(term827805, 88, (byte) 23);
        setByteElement(term827805, 89, (byte) 24);
        setByteElement(term827805, 90, (byte) 25);
        setField(term827804, term827804.getClass(), "decodeTable", term827805);
        setIntField(term827804, term827804.getClass(), "encodeSize", 10);
        setByteElement(term827806, 0, (byte) 65);
        setByteElement(term827806, 1, (byte) 66);
        setByteElement(term827806, 2, (byte) 67);
        setByteElement(term827806, 3, (byte) 68);
        setByteElement(term827806, 4, (byte) 69);
        setByteElement(term827806, 5, (byte) 70);
        setByteElement(term827806, 6, (byte) 71);
        setByteElement(term827806, 7, (byte) 72);
        setByteElement(term827806, 8, (byte) 73);
        setByteElement(term827806, 9, (byte) 74);
        setByteElement(term827806, 10, (byte) 75);
        setByteElement(term827806, 11, (byte) 76);
        setByteElement(term827806, 12, (byte) 77);
        setByteElement(term827806, 13, (byte) 78);
        setByteElement(term827806, 14, (byte) 79);
        setByteElement(term827806, 15, (byte) 80);
        setByteElement(term827806, 16, (byte) 81);
        setByteElement(term827806, 17, (byte) 82);
        setByteElement(term827806, 18, (byte) 83);
        setByteElement(term827806, 19, (byte) 84);
        setByteElement(term827806, 20, (byte) 85);
        setByteElement(term827806, 21, (byte) 86);
        setByteElement(term827806, 22, (byte) 87);
        setByteElement(term827806, 23, (byte) 88);
        setByteElement(term827806, 24, (byte) 89);
        setByteElement(term827806, 25, (byte) 90);
        setByteElement(term827806, 26, (byte) 50);
        setByteElement(term827806, 27, (byte) 51);
        setByteElement(term827806, 28, (byte) 52);
        setByteElement(term827806, 29, (byte) 53);
        setByteElement(term827806, 30, (byte) 54);
        setByteElement(term827806, 31, (byte) 55);
        setField(term827804, term827804.getClass(), "encodeTable", term827806);
        setByteElement(term827807, 0, (byte) 13);
        setByteElement(term827807, 1, (byte) 10);
        setField(term827804, term827804.getClass(), "lineSeparator", term827807);
        setByteField(term827804, term827804.getClass(), "PAD", (byte) 61);
        setByteField(term827804, term827804.getClass(), "pad", (byte) 61);
        setIntField(term827804, term827804.getClass(), "unencodedBlockSize", 5);
        setIntField(term827804, term827804.getClass(), "encodedBlockSize", 8);
        setIntField(term827804, term827804.getClass(), "lineLength", 0);
        setIntField(term827804, term827804.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term827804));
    }

};


