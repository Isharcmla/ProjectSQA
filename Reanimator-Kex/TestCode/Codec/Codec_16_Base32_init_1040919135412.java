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

public class Base32_init_1040919135412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852075;

    public Base32_init_1040919135412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term850080 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term846323 = (byte[]) newByteArray(0);
        byte[] term846835 = (byte[]) newByteArray(0);
        setByteField(term850080, term850080.getClass(), "PAD", (byte) 0);
        setIntField(term850080, term850080.getClass(), "unencodedBlockSize", 0);
        setIntField(term850080, term850080.getClass(), "encodedBlockSize", 0);
        setIntField(term850080, term850080.getClass(), "lineLength", 0);
        setIntField(term850080, term850080.getClass(), "chunkSeparatorLength", 0);
        setByteField(term850080, term850080.getClass(), "pad", (byte) -128);
        setField(term850080, term850080.getClass(), "encodeTable", term846323);
        setField(term850080, term850080.getClass(), "decodeTable", term846835);
        setIntField(term850080, term850080.getClass(), "encodeSize", 0);
        setField(term850080, term850080.getClass(), "lineSeparator", null);
        setIntField(term850080, term850080.getClass(), "decodeSize", 0);
        term852075 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term852076 = (byte[]) newByteArray(91);
        byte[] term852077 = (byte[]) newByteArray(32);
        byte[] term852078 = (byte[]) newByteArray(2);
        setIntField(term852075, term852075.getClass(), "decodeSize", 9);
        setByteElement(term852076, 0, (byte) -1);
        setByteElement(term852076, 1, (byte) -1);
        setByteElement(term852076, 2, (byte) -1);
        setByteElement(term852076, 3, (byte) -1);
        setByteElement(term852076, 4, (byte) -1);
        setByteElement(term852076, 5, (byte) -1);
        setByteElement(term852076, 6, (byte) -1);
        setByteElement(term852076, 7, (byte) -1);
        setByteElement(term852076, 8, (byte) -1);
        setByteElement(term852076, 9, (byte) -1);
        setByteElement(term852076, 10, (byte) -1);
        setByteElement(term852076, 11, (byte) -1);
        setByteElement(term852076, 12, (byte) -1);
        setByteElement(term852076, 13, (byte) -1);
        setByteElement(term852076, 14, (byte) -1);
        setByteElement(term852076, 15, (byte) -1);
        setByteElement(term852076, 16, (byte) -1);
        setByteElement(term852076, 17, (byte) -1);
        setByteElement(term852076, 18, (byte) -1);
        setByteElement(term852076, 19, (byte) -1);
        setByteElement(term852076, 20, (byte) -1);
        setByteElement(term852076, 21, (byte) -1);
        setByteElement(term852076, 22, (byte) -1);
        setByteElement(term852076, 23, (byte) -1);
        setByteElement(term852076, 24, (byte) -1);
        setByteElement(term852076, 25, (byte) -1);
        setByteElement(term852076, 26, (byte) -1);
        setByteElement(term852076, 27, (byte) -1);
        setByteElement(term852076, 28, (byte) -1);
        setByteElement(term852076, 29, (byte) -1);
        setByteElement(term852076, 30, (byte) -1);
        setByteElement(term852076, 31, (byte) -1);
        setByteElement(term852076, 32, (byte) -1);
        setByteElement(term852076, 33, (byte) -1);
        setByteElement(term852076, 34, (byte) -1);
        setByteElement(term852076, 35, (byte) -1);
        setByteElement(term852076, 36, (byte) -1);
        setByteElement(term852076, 37, (byte) -1);
        setByteElement(term852076, 38, (byte) -1);
        setByteElement(term852076, 39, (byte) -1);
        setByteElement(term852076, 40, (byte) -1);
        setByteElement(term852076, 41, (byte) -1);
        setByteElement(term852076, 42, (byte) -1);
        setByteElement(term852076, 43, (byte) -1);
        setByteElement(term852076, 44, (byte) -1);
        setByteElement(term852076, 45, (byte) -1);
        setByteElement(term852076, 46, (byte) -1);
        setByteElement(term852076, 47, (byte) -1);
        setByteElement(term852076, 48, (byte) -1);
        setByteElement(term852076, 49, (byte) -1);
        setByteElement(term852076, 50, (byte) 26);
        setByteElement(term852076, 51, (byte) 27);
        setByteElement(term852076, 52, (byte) 28);
        setByteElement(term852076, 53, (byte) 29);
        setByteElement(term852076, 54, (byte) 30);
        setByteElement(term852076, 55, (byte) 31);
        setByteElement(term852076, 56, (byte) -1);
        setByteElement(term852076, 57, (byte) -1);
        setByteElement(term852076, 58, (byte) -1);
        setByteElement(term852076, 59, (byte) -1);
        setByteElement(term852076, 60, (byte) -1);
        setByteElement(term852076, 61, (byte) -1);
        setByteElement(term852076, 62, (byte) -1);
        setByteElement(term852076, 63, (byte) -1);
        setByteElement(term852076, 64, (byte) -1);
        setByteElement(term852076, 66, (byte) 1);
        setByteElement(term852076, 67, (byte) 2);
        setByteElement(term852076, 68, (byte) 3);
        setByteElement(term852076, 69, (byte) 4);
        setByteElement(term852076, 70, (byte) 5);
        setByteElement(term852076, 71, (byte) 6);
        setByteElement(term852076, 72, (byte) 7);
        setByteElement(term852076, 73, (byte) 8);
        setByteElement(term852076, 74, (byte) 9);
        setByteElement(term852076, 75, (byte) 10);
        setByteElement(term852076, 76, (byte) 11);
        setByteElement(term852076, 77, (byte) 12);
        setByteElement(term852076, 78, (byte) 13);
        setByteElement(term852076, 79, (byte) 14);
        setByteElement(term852076, 80, (byte) 15);
        setByteElement(term852076, 81, (byte) 16);
        setByteElement(term852076, 82, (byte) 17);
        setByteElement(term852076, 83, (byte) 18);
        setByteElement(term852076, 84, (byte) 19);
        setByteElement(term852076, 85, (byte) 20);
        setByteElement(term852076, 86, (byte) 21);
        setByteElement(term852076, 87, (byte) 22);
        setByteElement(term852076, 88, (byte) 23);
        setByteElement(term852076, 89, (byte) 24);
        setByteElement(term852076, 90, (byte) 25);
        setField(term852075, term852075.getClass(), "decodeTable", term852076);
        setIntField(term852075, term852075.getClass(), "encodeSize", 10);
        setByteElement(term852077, 0, (byte) 65);
        setByteElement(term852077, 1, (byte) 66);
        setByteElement(term852077, 2, (byte) 67);
        setByteElement(term852077, 3, (byte) 68);
        setByteElement(term852077, 4, (byte) 69);
        setByteElement(term852077, 5, (byte) 70);
        setByteElement(term852077, 6, (byte) 71);
        setByteElement(term852077, 7, (byte) 72);
        setByteElement(term852077, 8, (byte) 73);
        setByteElement(term852077, 9, (byte) 74);
        setByteElement(term852077, 10, (byte) 75);
        setByteElement(term852077, 11, (byte) 76);
        setByteElement(term852077, 12, (byte) 77);
        setByteElement(term852077, 13, (byte) 78);
        setByteElement(term852077, 14, (byte) 79);
        setByteElement(term852077, 15, (byte) 80);
        setByteElement(term852077, 16, (byte) 81);
        setByteElement(term852077, 17, (byte) 82);
        setByteElement(term852077, 18, (byte) 83);
        setByteElement(term852077, 19, (byte) 84);
        setByteElement(term852077, 20, (byte) 85);
        setByteElement(term852077, 21, (byte) 86);
        setByteElement(term852077, 22, (byte) 87);
        setByteElement(term852077, 23, (byte) 88);
        setByteElement(term852077, 24, (byte) 89);
        setByteElement(term852077, 25, (byte) 90);
        setByteElement(term852077, 26, (byte) 50);
        setByteElement(term852077, 27, (byte) 51);
        setByteElement(term852077, 28, (byte) 52);
        setByteElement(term852077, 29, (byte) 53);
        setByteElement(term852077, 30, (byte) 54);
        setByteElement(term852077, 31, (byte) 55);
        setField(term852075, term852075.getClass(), "encodeTable", term852077);
        setByteElement(term852078, 0, (byte) 13);
        setByteElement(term852078, 1, (byte) 10);
        setField(term852075, term852075.getClass(), "lineSeparator", term852078);
        setByteField(term852075, term852075.getClass(), "PAD", (byte) 61);
        setByteField(term852075, term852075.getClass(), "pad", (byte) 61);
        setIntField(term852075, term852075.getClass(), "unencodedBlockSize", 5);
        setIntField(term852075, term852075.getClass(), "encodedBlockSize", 8);
        setIntField(term852075, term852075.getClass(), "lineLength", 0);
        setIntField(term852075, term852075.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term852075));
    }

};


