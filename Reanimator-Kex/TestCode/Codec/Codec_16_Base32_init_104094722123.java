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

public class Base32_init_104094722123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6358;

    public Base32_init_104094722123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6207 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term6096 = (byte[]) newByteArray(0);
        setByteField(term6207, term6207.getClass(), "PAD", (byte) 0);
        setIntField(term6207, term6207.getClass(), "unencodedBlockSize", 0);
        setIntField(term6207, term6207.getClass(), "encodedBlockSize", 0);
        setIntField(term6207, term6207.getClass(), "lineLength", 0);
        setIntField(term6207, term6207.getClass(), "chunkSeparatorLength", 0);
        setByteField(term6207, term6207.getClass(), "pad", (byte) 0);
        setField(term6207, term6207.getClass(), "encodeTable", term6096);
        setField(term6207, term6207.getClass(), "decodeTable", term6096);
        setIntField(term6207, term6207.getClass(), "encodeSize", 0);
        setField(term6207, term6207.getClass(), "lineSeparator", term6096);
        setIntField(term6207, term6207.getClass(), "decodeSize", 0);
        term6358 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term6359 = (byte[]) newByteArray(91);
        byte[] term6360 = (byte[]) newByteArray(32);
        setIntField(term6358, term6358.getClass(), "decodeSize", 7);
        setByteElement(term6359, 0, (byte) -1);
        setByteElement(term6359, 1, (byte) -1);
        setByteElement(term6359, 2, (byte) -1);
        setByteElement(term6359, 3, (byte) -1);
        setByteElement(term6359, 4, (byte) -1);
        setByteElement(term6359, 5, (byte) -1);
        setByteElement(term6359, 6, (byte) -1);
        setByteElement(term6359, 7, (byte) -1);
        setByteElement(term6359, 8, (byte) -1);
        setByteElement(term6359, 9, (byte) -1);
        setByteElement(term6359, 10, (byte) -1);
        setByteElement(term6359, 11, (byte) -1);
        setByteElement(term6359, 12, (byte) -1);
        setByteElement(term6359, 13, (byte) -1);
        setByteElement(term6359, 14, (byte) -1);
        setByteElement(term6359, 15, (byte) -1);
        setByteElement(term6359, 16, (byte) -1);
        setByteElement(term6359, 17, (byte) -1);
        setByteElement(term6359, 18, (byte) -1);
        setByteElement(term6359, 19, (byte) -1);
        setByteElement(term6359, 20, (byte) -1);
        setByteElement(term6359, 21, (byte) -1);
        setByteElement(term6359, 22, (byte) -1);
        setByteElement(term6359, 23, (byte) -1);
        setByteElement(term6359, 24, (byte) -1);
        setByteElement(term6359, 25, (byte) -1);
        setByteElement(term6359, 26, (byte) -1);
        setByteElement(term6359, 27, (byte) -1);
        setByteElement(term6359, 28, (byte) -1);
        setByteElement(term6359, 29, (byte) -1);
        setByteElement(term6359, 30, (byte) -1);
        setByteElement(term6359, 31, (byte) -1);
        setByteElement(term6359, 32, (byte) -1);
        setByteElement(term6359, 33, (byte) -1);
        setByteElement(term6359, 34, (byte) -1);
        setByteElement(term6359, 35, (byte) -1);
        setByteElement(term6359, 36, (byte) -1);
        setByteElement(term6359, 37, (byte) -1);
        setByteElement(term6359, 38, (byte) -1);
        setByteElement(term6359, 39, (byte) -1);
        setByteElement(term6359, 40, (byte) -1);
        setByteElement(term6359, 41, (byte) -1);
        setByteElement(term6359, 42, (byte) -1);
        setByteElement(term6359, 43, (byte) -1);
        setByteElement(term6359, 44, (byte) -1);
        setByteElement(term6359, 45, (byte) -1);
        setByteElement(term6359, 46, (byte) -1);
        setByteElement(term6359, 47, (byte) -1);
        setByteElement(term6359, 48, (byte) -1);
        setByteElement(term6359, 49, (byte) -1);
        setByteElement(term6359, 50, (byte) 26);
        setByteElement(term6359, 51, (byte) 27);
        setByteElement(term6359, 52, (byte) 28);
        setByteElement(term6359, 53, (byte) 29);
        setByteElement(term6359, 54, (byte) 30);
        setByteElement(term6359, 55, (byte) 31);
        setByteElement(term6359, 56, (byte) -1);
        setByteElement(term6359, 57, (byte) -1);
        setByteElement(term6359, 58, (byte) -1);
        setByteElement(term6359, 59, (byte) -1);
        setByteElement(term6359, 60, (byte) -1);
        setByteElement(term6359, 61, (byte) -1);
        setByteElement(term6359, 62, (byte) -1);
        setByteElement(term6359, 63, (byte) -1);
        setByteElement(term6359, 64, (byte) -1);
        setByteElement(term6359, 66, (byte) 1);
        setByteElement(term6359, 67, (byte) 2);
        setByteElement(term6359, 68, (byte) 3);
        setByteElement(term6359, 69, (byte) 4);
        setByteElement(term6359, 70, (byte) 5);
        setByteElement(term6359, 71, (byte) 6);
        setByteElement(term6359, 72, (byte) 7);
        setByteElement(term6359, 73, (byte) 8);
        setByteElement(term6359, 74, (byte) 9);
        setByteElement(term6359, 75, (byte) 10);
        setByteElement(term6359, 76, (byte) 11);
        setByteElement(term6359, 77, (byte) 12);
        setByteElement(term6359, 78, (byte) 13);
        setByteElement(term6359, 79, (byte) 14);
        setByteElement(term6359, 80, (byte) 15);
        setByteElement(term6359, 81, (byte) 16);
        setByteElement(term6359, 82, (byte) 17);
        setByteElement(term6359, 83, (byte) 18);
        setByteElement(term6359, 84, (byte) 19);
        setByteElement(term6359, 85, (byte) 20);
        setByteElement(term6359, 86, (byte) 21);
        setByteElement(term6359, 87, (byte) 22);
        setByteElement(term6359, 88, (byte) 23);
        setByteElement(term6359, 89, (byte) 24);
        setByteElement(term6359, 90, (byte) 25);
        setField(term6358, term6358.getClass(), "decodeTable", term6359);
        setIntField(term6358, term6358.getClass(), "encodeSize", 8);
        setByteElement(term6360, 0, (byte) 65);
        setByteElement(term6360, 1, (byte) 66);
        setByteElement(term6360, 2, (byte) 67);
        setByteElement(term6360, 3, (byte) 68);
        setByteElement(term6360, 4, (byte) 69);
        setByteElement(term6360, 5, (byte) 70);
        setByteElement(term6360, 6, (byte) 71);
        setByteElement(term6360, 7, (byte) 72);
        setByteElement(term6360, 8, (byte) 73);
        setByteElement(term6360, 9, (byte) 74);
        setByteElement(term6360, 10, (byte) 75);
        setByteElement(term6360, 11, (byte) 76);
        setByteElement(term6360, 12, (byte) 77);
        setByteElement(term6360, 13, (byte) 78);
        setByteElement(term6360, 14, (byte) 79);
        setByteElement(term6360, 15, (byte) 80);
        setByteElement(term6360, 16, (byte) 81);
        setByteElement(term6360, 17, (byte) 82);
        setByteElement(term6360, 18, (byte) 83);
        setByteElement(term6360, 19, (byte) 84);
        setByteElement(term6360, 20, (byte) 85);
        setByteElement(term6360, 21, (byte) 86);
        setByteElement(term6360, 22, (byte) 87);
        setByteElement(term6360, 23, (byte) 88);
        setByteElement(term6360, 24, (byte) 89);
        setByteElement(term6360, 25, (byte) 90);
        setByteElement(term6360, 26, (byte) 50);
        setByteElement(term6360, 27, (byte) 51);
        setByteElement(term6360, 28, (byte) 52);
        setByteElement(term6360, 29, (byte) 53);
        setByteElement(term6360, 30, (byte) 54);
        setByteElement(term6360, 31, (byte) 55);
        setField(term6358, term6358.getClass(), "encodeTable", term6360);
        setField(term6358, term6358.getClass(), "lineSeparator", null);
        setByteField(term6358, term6358.getClass(), "PAD", (byte) 61);
        setByteField(term6358, term6358.getClass(), "pad", (byte) -128);
        setIntField(term6358, term6358.getClass(), "unencodedBlockSize", 5);
        setIntField(term6358, term6358.getClass(), "encodedBlockSize", 8);
        setIntField(term6358, term6358.getClass(), "lineLength", 0);
        setIntField(term6358, term6358.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = false;
        args[1] = (byte) -128;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6358));
    }

};


