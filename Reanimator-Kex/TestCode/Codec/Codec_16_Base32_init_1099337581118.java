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

public class Base32_init_1099337581118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145829;
     Object term158941;
     Object term158945;

    public Base32_init_1099337581118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145931 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term145931, term145931.getClass(), "PAD", (byte) 0);
        setIntField(term145931, term145931.getClass(), "unencodedBlockSize", 0);
        setIntField(term145931, term145931.getClass(), "encodedBlockSize", 0);
        term145829 = (byte[]) newByteArray(0);
        term158941 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term158942 = (byte[]) newByteArray(91);
        byte[] term158943 = (byte[]) newByteArray(32);
        byte[] term158944 = (byte[]) newByteArray(0);
        setIntField(term158941, term158941.getClass(), "decodeSize", 7);
        setByteElement(term158942, 0, (byte) -1);
        setByteElement(term158942, 1, (byte) -1);
        setByteElement(term158942, 2, (byte) -1);
        setByteElement(term158942, 3, (byte) -1);
        setByteElement(term158942, 4, (byte) -1);
        setByteElement(term158942, 5, (byte) -1);
        setByteElement(term158942, 6, (byte) -1);
        setByteElement(term158942, 7, (byte) -1);
        setByteElement(term158942, 8, (byte) -1);
        setByteElement(term158942, 9, (byte) -1);
        setByteElement(term158942, 10, (byte) -1);
        setByteElement(term158942, 11, (byte) -1);
        setByteElement(term158942, 12, (byte) -1);
        setByteElement(term158942, 13, (byte) -1);
        setByteElement(term158942, 14, (byte) -1);
        setByteElement(term158942, 15, (byte) -1);
        setByteElement(term158942, 16, (byte) -1);
        setByteElement(term158942, 17, (byte) -1);
        setByteElement(term158942, 18, (byte) -1);
        setByteElement(term158942, 19, (byte) -1);
        setByteElement(term158942, 20, (byte) -1);
        setByteElement(term158942, 21, (byte) -1);
        setByteElement(term158942, 22, (byte) -1);
        setByteElement(term158942, 23, (byte) -1);
        setByteElement(term158942, 24, (byte) -1);
        setByteElement(term158942, 25, (byte) -1);
        setByteElement(term158942, 26, (byte) -1);
        setByteElement(term158942, 27, (byte) -1);
        setByteElement(term158942, 28, (byte) -1);
        setByteElement(term158942, 29, (byte) -1);
        setByteElement(term158942, 30, (byte) -1);
        setByteElement(term158942, 31, (byte) -1);
        setByteElement(term158942, 32, (byte) -1);
        setByteElement(term158942, 33, (byte) -1);
        setByteElement(term158942, 34, (byte) -1);
        setByteElement(term158942, 35, (byte) -1);
        setByteElement(term158942, 36, (byte) -1);
        setByteElement(term158942, 37, (byte) -1);
        setByteElement(term158942, 38, (byte) -1);
        setByteElement(term158942, 39, (byte) -1);
        setByteElement(term158942, 40, (byte) -1);
        setByteElement(term158942, 41, (byte) -1);
        setByteElement(term158942, 42, (byte) -1);
        setByteElement(term158942, 43, (byte) -1);
        setByteElement(term158942, 44, (byte) -1);
        setByteElement(term158942, 45, (byte) -1);
        setByteElement(term158942, 46, (byte) -1);
        setByteElement(term158942, 47, (byte) -1);
        setByteElement(term158942, 48, (byte) -1);
        setByteElement(term158942, 49, (byte) -1);
        setByteElement(term158942, 50, (byte) 26);
        setByteElement(term158942, 51, (byte) 27);
        setByteElement(term158942, 52, (byte) 28);
        setByteElement(term158942, 53, (byte) 29);
        setByteElement(term158942, 54, (byte) 30);
        setByteElement(term158942, 55, (byte) 31);
        setByteElement(term158942, 56, (byte) -1);
        setByteElement(term158942, 57, (byte) -1);
        setByteElement(term158942, 58, (byte) -1);
        setByteElement(term158942, 59, (byte) -1);
        setByteElement(term158942, 60, (byte) -1);
        setByteElement(term158942, 61, (byte) -1);
        setByteElement(term158942, 62, (byte) -1);
        setByteElement(term158942, 63, (byte) -1);
        setByteElement(term158942, 64, (byte) -1);
        setByteElement(term158942, 66, (byte) 1);
        setByteElement(term158942, 67, (byte) 2);
        setByteElement(term158942, 68, (byte) 3);
        setByteElement(term158942, 69, (byte) 4);
        setByteElement(term158942, 70, (byte) 5);
        setByteElement(term158942, 71, (byte) 6);
        setByteElement(term158942, 72, (byte) 7);
        setByteElement(term158942, 73, (byte) 8);
        setByteElement(term158942, 74, (byte) 9);
        setByteElement(term158942, 75, (byte) 10);
        setByteElement(term158942, 76, (byte) 11);
        setByteElement(term158942, 77, (byte) 12);
        setByteElement(term158942, 78, (byte) 13);
        setByteElement(term158942, 79, (byte) 14);
        setByteElement(term158942, 80, (byte) 15);
        setByteElement(term158942, 81, (byte) 16);
        setByteElement(term158942, 82, (byte) 17);
        setByteElement(term158942, 83, (byte) 18);
        setByteElement(term158942, 84, (byte) 19);
        setByteElement(term158942, 85, (byte) 20);
        setByteElement(term158942, 86, (byte) 21);
        setByteElement(term158942, 87, (byte) 22);
        setByteElement(term158942, 88, (byte) 23);
        setByteElement(term158942, 89, (byte) 24);
        setByteElement(term158942, 90, (byte) 25);
        setField(term158941, term158941.getClass(), "decodeTable", term158942);
        setIntField(term158941, term158941.getClass(), "encodeSize", 8);
        setByteElement(term158943, 0, (byte) 65);
        setByteElement(term158943, 1, (byte) 66);
        setByteElement(term158943, 2, (byte) 67);
        setByteElement(term158943, 3, (byte) 68);
        setByteElement(term158943, 4, (byte) 69);
        setByteElement(term158943, 5, (byte) 70);
        setByteElement(term158943, 6, (byte) 71);
        setByteElement(term158943, 7, (byte) 72);
        setByteElement(term158943, 8, (byte) 73);
        setByteElement(term158943, 9, (byte) 74);
        setByteElement(term158943, 10, (byte) 75);
        setByteElement(term158943, 11, (byte) 76);
        setByteElement(term158943, 12, (byte) 77);
        setByteElement(term158943, 13, (byte) 78);
        setByteElement(term158943, 14, (byte) 79);
        setByteElement(term158943, 15, (byte) 80);
        setByteElement(term158943, 16, (byte) 81);
        setByteElement(term158943, 17, (byte) 82);
        setByteElement(term158943, 18, (byte) 83);
        setByteElement(term158943, 19, (byte) 84);
        setByteElement(term158943, 20, (byte) 85);
        setByteElement(term158943, 21, (byte) 86);
        setByteElement(term158943, 22, (byte) 87);
        setByteElement(term158943, 23, (byte) 88);
        setByteElement(term158943, 24, (byte) 89);
        setByteElement(term158943, 25, (byte) 90);
        setByteElement(term158943, 26, (byte) 50);
        setByteElement(term158943, 27, (byte) 51);
        setByteElement(term158943, 28, (byte) 52);
        setByteElement(term158943, 29, (byte) 53);
        setByteElement(term158943, 30, (byte) 54);
        setByteElement(term158943, 31, (byte) 55);
        setField(term158941, term158941.getClass(), "encodeTable", term158943);
        setField(term158941, term158941.getClass(), "lineSeparator", term158944);
        setByteField(term158941, term158941.getClass(), "PAD", (byte) 61);
        setByteField(term158941, term158941.getClass(), "pad", (byte) 0);
        setIntField(term158941, term158941.getClass(), "unencodedBlockSize", 5);
        setIntField(term158941, term158941.getClass(), "encodedBlockSize", 8);
        setIntField(term158941, term158941.getClass(), "lineLength", 0);
        setIntField(term158941, term158941.getClass(), "chunkSeparatorLength", 0);
        term158945 = (byte[]) newByteArray(0);
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
        args[0] = 1;
        args[1] = term145829;
        args[2] = false;
        args[3] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term158941));
        assertTrue(recursiveEquals(term145829, (byte) 0));
    }

};


