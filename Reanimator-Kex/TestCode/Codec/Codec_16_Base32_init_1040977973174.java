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

public class Base32_init_1040977973174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347032;

    public Base32_init_1040977973174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term344687 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term342520 = (byte[]) newByteArray(512);
        setByteField(term344687, term344687.getClass(), "PAD", (byte) 0);
        setIntField(term344687, term344687.getClass(), "unencodedBlockSize", 0);
        setIntField(term344687, term344687.getClass(), "encodedBlockSize", 0);
        setIntField(term344687, term344687.getClass(), "lineLength", 0);
        setIntField(term344687, term344687.getClass(), "chunkSeparatorLength", 0);
        setByteField(term344687, term344687.getClass(), "pad", (byte) 0);
        setField(term344687, term344687.getClass(), "encodeTable", term342520);
        setField(term344687, term344687.getClass(), "decodeTable", term342520);
        setIntField(term344687, term344687.getClass(), "encodeSize", 0);
        setField(term344687, term344687.getClass(), "lineSeparator", term342520);
        setIntField(term344687, term344687.getClass(), "decodeSize", 0);
        term347032 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term347033 = (byte[]) newByteArray(91);
        byte[] term347034 = (byte[]) newByteArray(32);
        setIntField(term347032, term347032.getClass(), "decodeSize", 7);
        setByteElement(term347033, 0, (byte) -1);
        setByteElement(term347033, 1, (byte) -1);
        setByteElement(term347033, 2, (byte) -1);
        setByteElement(term347033, 3, (byte) -1);
        setByteElement(term347033, 4, (byte) -1);
        setByteElement(term347033, 5, (byte) -1);
        setByteElement(term347033, 6, (byte) -1);
        setByteElement(term347033, 7, (byte) -1);
        setByteElement(term347033, 8, (byte) -1);
        setByteElement(term347033, 9, (byte) -1);
        setByteElement(term347033, 10, (byte) -1);
        setByteElement(term347033, 11, (byte) -1);
        setByteElement(term347033, 12, (byte) -1);
        setByteElement(term347033, 13, (byte) -1);
        setByteElement(term347033, 14, (byte) -1);
        setByteElement(term347033, 15, (byte) -1);
        setByteElement(term347033, 16, (byte) -1);
        setByteElement(term347033, 17, (byte) -1);
        setByteElement(term347033, 18, (byte) -1);
        setByteElement(term347033, 19, (byte) -1);
        setByteElement(term347033, 20, (byte) -1);
        setByteElement(term347033, 21, (byte) -1);
        setByteElement(term347033, 22, (byte) -1);
        setByteElement(term347033, 23, (byte) -1);
        setByteElement(term347033, 24, (byte) -1);
        setByteElement(term347033, 25, (byte) -1);
        setByteElement(term347033, 26, (byte) -1);
        setByteElement(term347033, 27, (byte) -1);
        setByteElement(term347033, 28, (byte) -1);
        setByteElement(term347033, 29, (byte) -1);
        setByteElement(term347033, 30, (byte) -1);
        setByteElement(term347033, 31, (byte) -1);
        setByteElement(term347033, 32, (byte) -1);
        setByteElement(term347033, 33, (byte) -1);
        setByteElement(term347033, 34, (byte) -1);
        setByteElement(term347033, 35, (byte) -1);
        setByteElement(term347033, 36, (byte) -1);
        setByteElement(term347033, 37, (byte) -1);
        setByteElement(term347033, 38, (byte) -1);
        setByteElement(term347033, 39, (byte) -1);
        setByteElement(term347033, 40, (byte) -1);
        setByteElement(term347033, 41, (byte) -1);
        setByteElement(term347033, 42, (byte) -1);
        setByteElement(term347033, 43, (byte) -1);
        setByteElement(term347033, 44, (byte) -1);
        setByteElement(term347033, 45, (byte) -1);
        setByteElement(term347033, 46, (byte) -1);
        setByteElement(term347033, 47, (byte) -1);
        setByteElement(term347033, 48, (byte) -1);
        setByteElement(term347033, 49, (byte) -1);
        setByteElement(term347033, 50, (byte) 26);
        setByteElement(term347033, 51, (byte) 27);
        setByteElement(term347033, 52, (byte) 28);
        setByteElement(term347033, 53, (byte) 29);
        setByteElement(term347033, 54, (byte) 30);
        setByteElement(term347033, 55, (byte) 31);
        setByteElement(term347033, 56, (byte) -1);
        setByteElement(term347033, 57, (byte) -1);
        setByteElement(term347033, 58, (byte) -1);
        setByteElement(term347033, 59, (byte) -1);
        setByteElement(term347033, 60, (byte) -1);
        setByteElement(term347033, 61, (byte) -1);
        setByteElement(term347033, 62, (byte) -1);
        setByteElement(term347033, 63, (byte) -1);
        setByteElement(term347033, 64, (byte) -1);
        setByteElement(term347033, 66, (byte) 1);
        setByteElement(term347033, 67, (byte) 2);
        setByteElement(term347033, 68, (byte) 3);
        setByteElement(term347033, 69, (byte) 4);
        setByteElement(term347033, 70, (byte) 5);
        setByteElement(term347033, 71, (byte) 6);
        setByteElement(term347033, 72, (byte) 7);
        setByteElement(term347033, 73, (byte) 8);
        setByteElement(term347033, 74, (byte) 9);
        setByteElement(term347033, 75, (byte) 10);
        setByteElement(term347033, 76, (byte) 11);
        setByteElement(term347033, 77, (byte) 12);
        setByteElement(term347033, 78, (byte) 13);
        setByteElement(term347033, 79, (byte) 14);
        setByteElement(term347033, 80, (byte) 15);
        setByteElement(term347033, 81, (byte) 16);
        setByteElement(term347033, 82, (byte) 17);
        setByteElement(term347033, 83, (byte) 18);
        setByteElement(term347033, 84, (byte) 19);
        setByteElement(term347033, 85, (byte) 20);
        setByteElement(term347033, 86, (byte) 21);
        setByteElement(term347033, 87, (byte) 22);
        setByteElement(term347033, 88, (byte) 23);
        setByteElement(term347033, 89, (byte) 24);
        setByteElement(term347033, 90, (byte) 25);
        setField(term347032, term347032.getClass(), "decodeTable", term347033);
        setIntField(term347032, term347032.getClass(), "encodeSize", 8);
        setByteElement(term347034, 0, (byte) 65);
        setByteElement(term347034, 1, (byte) 66);
        setByteElement(term347034, 2, (byte) 67);
        setByteElement(term347034, 3, (byte) 68);
        setByteElement(term347034, 4, (byte) 69);
        setByteElement(term347034, 5, (byte) 70);
        setByteElement(term347034, 6, (byte) 71);
        setByteElement(term347034, 7, (byte) 72);
        setByteElement(term347034, 8, (byte) 73);
        setByteElement(term347034, 9, (byte) 74);
        setByteElement(term347034, 10, (byte) 75);
        setByteElement(term347034, 11, (byte) 76);
        setByteElement(term347034, 12, (byte) 77);
        setByteElement(term347034, 13, (byte) 78);
        setByteElement(term347034, 14, (byte) 79);
        setByteElement(term347034, 15, (byte) 80);
        setByteElement(term347034, 16, (byte) 81);
        setByteElement(term347034, 17, (byte) 82);
        setByteElement(term347034, 18, (byte) 83);
        setByteElement(term347034, 19, (byte) 84);
        setByteElement(term347034, 20, (byte) 85);
        setByteElement(term347034, 21, (byte) 86);
        setByteElement(term347034, 22, (byte) 87);
        setByteElement(term347034, 23, (byte) 88);
        setByteElement(term347034, 24, (byte) 89);
        setByteElement(term347034, 25, (byte) 90);
        setByteElement(term347034, 26, (byte) 50);
        setByteElement(term347034, 27, (byte) 51);
        setByteElement(term347034, 28, (byte) 52);
        setByteElement(term347034, 29, (byte) 53);
        setByteElement(term347034, 30, (byte) 54);
        setByteElement(term347034, 31, (byte) 55);
        setField(term347032, term347032.getClass(), "encodeTable", term347034);
        setField(term347032, term347032.getClass(), "lineSeparator", null);
        setByteField(term347032, term347032.getClass(), "PAD", (byte) 61);
        setByteField(term347032, term347032.getClass(), "pad", (byte) 61);
        setIntField(term347032, term347032.getClass(), "unencodedBlockSize", 5);
        setIntField(term347032, term347032.getClass(), "encodedBlockSize", 8);
        setIntField(term347032, term347032.getClass(), "lineLength", 0);
        setIntField(term347032, term347032.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term347032));
    }

};


