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

public class Base32_init_1042801703213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427703;

    public Base32_init_1042801703213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term425222 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term423055 = (byte[]) newByteArray(512);
        setByteField(term425222, term425222.getClass(), "PAD", (byte) 0);
        setIntField(term425222, term425222.getClass(), "unencodedBlockSize", 0);
        setIntField(term425222, term425222.getClass(), "encodedBlockSize", 0);
        setIntField(term425222, term425222.getClass(), "lineLength", 0);
        setIntField(term425222, term425222.getClass(), "chunkSeparatorLength", 0);
        setByteField(term425222, term425222.getClass(), "pad", (byte) 0);
        setField(term425222, term425222.getClass(), "encodeTable", term423055);
        setField(term425222, term425222.getClass(), "decodeTable", term423055);
        setIntField(term425222, term425222.getClass(), "encodeSize", 0);
        setField(term425222, term425222.getClass(), "lineSeparator", term423055);
        setIntField(term425222, term425222.getClass(), "decodeSize", 0);
        term427703 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term427704 = (byte[]) newByteArray(91);
        byte[] term427705 = (byte[]) newByteArray(32);
        setIntField(term427703, term427703.getClass(), "decodeSize", 7);
        setByteElement(term427704, 0, (byte) -1);
        setByteElement(term427704, 1, (byte) -1);
        setByteElement(term427704, 2, (byte) -1);
        setByteElement(term427704, 3, (byte) -1);
        setByteElement(term427704, 4, (byte) -1);
        setByteElement(term427704, 5, (byte) -1);
        setByteElement(term427704, 6, (byte) -1);
        setByteElement(term427704, 7, (byte) -1);
        setByteElement(term427704, 8, (byte) -1);
        setByteElement(term427704, 9, (byte) -1);
        setByteElement(term427704, 10, (byte) -1);
        setByteElement(term427704, 11, (byte) -1);
        setByteElement(term427704, 12, (byte) -1);
        setByteElement(term427704, 13, (byte) -1);
        setByteElement(term427704, 14, (byte) -1);
        setByteElement(term427704, 15, (byte) -1);
        setByteElement(term427704, 16, (byte) -1);
        setByteElement(term427704, 17, (byte) -1);
        setByteElement(term427704, 18, (byte) -1);
        setByteElement(term427704, 19, (byte) -1);
        setByteElement(term427704, 20, (byte) -1);
        setByteElement(term427704, 21, (byte) -1);
        setByteElement(term427704, 22, (byte) -1);
        setByteElement(term427704, 23, (byte) -1);
        setByteElement(term427704, 24, (byte) -1);
        setByteElement(term427704, 25, (byte) -1);
        setByteElement(term427704, 26, (byte) -1);
        setByteElement(term427704, 27, (byte) -1);
        setByteElement(term427704, 28, (byte) -1);
        setByteElement(term427704, 29, (byte) -1);
        setByteElement(term427704, 30, (byte) -1);
        setByteElement(term427704, 31, (byte) -1);
        setByteElement(term427704, 32, (byte) -1);
        setByteElement(term427704, 33, (byte) -1);
        setByteElement(term427704, 34, (byte) -1);
        setByteElement(term427704, 35, (byte) -1);
        setByteElement(term427704, 36, (byte) -1);
        setByteElement(term427704, 37, (byte) -1);
        setByteElement(term427704, 38, (byte) -1);
        setByteElement(term427704, 39, (byte) -1);
        setByteElement(term427704, 40, (byte) -1);
        setByteElement(term427704, 41, (byte) -1);
        setByteElement(term427704, 42, (byte) -1);
        setByteElement(term427704, 43, (byte) -1);
        setByteElement(term427704, 44, (byte) -1);
        setByteElement(term427704, 45, (byte) -1);
        setByteElement(term427704, 46, (byte) -1);
        setByteElement(term427704, 47, (byte) -1);
        setByteElement(term427704, 48, (byte) -1);
        setByteElement(term427704, 49, (byte) -1);
        setByteElement(term427704, 50, (byte) 26);
        setByteElement(term427704, 51, (byte) 27);
        setByteElement(term427704, 52, (byte) 28);
        setByteElement(term427704, 53, (byte) 29);
        setByteElement(term427704, 54, (byte) 30);
        setByteElement(term427704, 55, (byte) 31);
        setByteElement(term427704, 56, (byte) -1);
        setByteElement(term427704, 57, (byte) -1);
        setByteElement(term427704, 58, (byte) -1);
        setByteElement(term427704, 59, (byte) -1);
        setByteElement(term427704, 60, (byte) -1);
        setByteElement(term427704, 61, (byte) -1);
        setByteElement(term427704, 62, (byte) -1);
        setByteElement(term427704, 63, (byte) -1);
        setByteElement(term427704, 64, (byte) -1);
        setByteElement(term427704, 66, (byte) 1);
        setByteElement(term427704, 67, (byte) 2);
        setByteElement(term427704, 68, (byte) 3);
        setByteElement(term427704, 69, (byte) 4);
        setByteElement(term427704, 70, (byte) 5);
        setByteElement(term427704, 71, (byte) 6);
        setByteElement(term427704, 72, (byte) 7);
        setByteElement(term427704, 73, (byte) 8);
        setByteElement(term427704, 74, (byte) 9);
        setByteElement(term427704, 75, (byte) 10);
        setByteElement(term427704, 76, (byte) 11);
        setByteElement(term427704, 77, (byte) 12);
        setByteElement(term427704, 78, (byte) 13);
        setByteElement(term427704, 79, (byte) 14);
        setByteElement(term427704, 80, (byte) 15);
        setByteElement(term427704, 81, (byte) 16);
        setByteElement(term427704, 82, (byte) 17);
        setByteElement(term427704, 83, (byte) 18);
        setByteElement(term427704, 84, (byte) 19);
        setByteElement(term427704, 85, (byte) 20);
        setByteElement(term427704, 86, (byte) 21);
        setByteElement(term427704, 87, (byte) 22);
        setByteElement(term427704, 88, (byte) 23);
        setByteElement(term427704, 89, (byte) 24);
        setByteElement(term427704, 90, (byte) 25);
        setField(term427703, term427703.getClass(), "decodeTable", term427704);
        setIntField(term427703, term427703.getClass(), "encodeSize", 8);
        setByteElement(term427705, 0, (byte) 65);
        setByteElement(term427705, 1, (byte) 66);
        setByteElement(term427705, 2, (byte) 67);
        setByteElement(term427705, 3, (byte) 68);
        setByteElement(term427705, 4, (byte) 69);
        setByteElement(term427705, 5, (byte) 70);
        setByteElement(term427705, 6, (byte) 71);
        setByteElement(term427705, 7, (byte) 72);
        setByteElement(term427705, 8, (byte) 73);
        setByteElement(term427705, 9, (byte) 74);
        setByteElement(term427705, 10, (byte) 75);
        setByteElement(term427705, 11, (byte) 76);
        setByteElement(term427705, 12, (byte) 77);
        setByteElement(term427705, 13, (byte) 78);
        setByteElement(term427705, 14, (byte) 79);
        setByteElement(term427705, 15, (byte) 80);
        setByteElement(term427705, 16, (byte) 81);
        setByteElement(term427705, 17, (byte) 82);
        setByteElement(term427705, 18, (byte) 83);
        setByteElement(term427705, 19, (byte) 84);
        setByteElement(term427705, 20, (byte) 85);
        setByteElement(term427705, 21, (byte) 86);
        setByteElement(term427705, 22, (byte) 87);
        setByteElement(term427705, 23, (byte) 88);
        setByteElement(term427705, 24, (byte) 89);
        setByteElement(term427705, 25, (byte) 90);
        setByteElement(term427705, 26, (byte) 50);
        setByteElement(term427705, 27, (byte) 51);
        setByteElement(term427705, 28, (byte) 52);
        setByteElement(term427705, 29, (byte) 53);
        setByteElement(term427705, 30, (byte) 54);
        setByteElement(term427705, 31, (byte) 55);
        setField(term427703, term427703.getClass(), "encodeTable", term427705);
        setField(term427703, term427703.getClass(), "lineSeparator", null);
        setByteField(term427703, term427703.getClass(), "PAD", (byte) 61);
        setByteField(term427703, term427703.getClass(), "pad", (byte) 61);
        setIntField(term427703, term427703.getClass(), "unencodedBlockSize", 5);
        setIntField(term427703, term427703.getClass(), "encodedBlockSize", 8);
        setIntField(term427703, term427703.getClass(), "lineLength", 0);
        setIntField(term427703, term427703.getClass(), "chunkSeparatorLength", 0);
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
        assertTrue(recursiveEquals(instance, term427703));
    }

};


