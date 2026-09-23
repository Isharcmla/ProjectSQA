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

public class Base32_init_1040977973369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term719885;
     Object term768358;
     Object term768367;

    public Base32_init_1040977973369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term721561 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term720403 = (byte[]) newByteArray(0);
        setByteField(term721561, term721561.getClass(), "PAD", (byte) -128);
        setIntField(term721561, term721561.getClass(), "unencodedBlockSize", 0);
        setIntField(term721561, term721561.getClass(), "encodedBlockSize", 0);
        setIntField(term721561, term721561.getClass(), "lineLength", 0);
        setIntField(term721561, term721561.getClass(), "chunkSeparatorLength", 0);
        setByteField(term721561, term721561.getClass(), "pad", (byte) 0);
        setField(term721561, term721561.getClass(), "encodeTable", null);
        setField(term721561, term721561.getClass(), "decodeTable", term720403);
        setIntField(term721561, term721561.getClass(), "encodeSize", 0);
        setField(term721561, term721561.getClass(), "lineSeparator", null);
        setIntField(term721561, term721561.getClass(), "decodeSize", 0);
        term719885 = (byte[]) newByteArray(0);
        term768358 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term768364 = (byte[]) newByteArray(91);
        byte[] term768365 = (byte[]) newByteArray(32);
        byte[] term768366 = (byte[]) newByteArray(0);
        setIntField(term768358, term768358.getClass(), "decodeSize", 7);
        setByteElement(term768364, 0, (byte) -1);
        setByteElement(term768364, 1, (byte) -1);
        setByteElement(term768364, 2, (byte) -1);
        setByteElement(term768364, 3, (byte) -1);
        setByteElement(term768364, 4, (byte) -1);
        setByteElement(term768364, 5, (byte) -1);
        setByteElement(term768364, 6, (byte) -1);
        setByteElement(term768364, 7, (byte) -1);
        setByteElement(term768364, 8, (byte) -1);
        setByteElement(term768364, 9, (byte) -1);
        setByteElement(term768364, 10, (byte) -1);
        setByteElement(term768364, 11, (byte) -1);
        setByteElement(term768364, 12, (byte) -1);
        setByteElement(term768364, 13, (byte) -1);
        setByteElement(term768364, 14, (byte) -1);
        setByteElement(term768364, 15, (byte) -1);
        setByteElement(term768364, 16, (byte) -1);
        setByteElement(term768364, 17, (byte) -1);
        setByteElement(term768364, 18, (byte) -1);
        setByteElement(term768364, 19, (byte) -1);
        setByteElement(term768364, 20, (byte) -1);
        setByteElement(term768364, 21, (byte) -1);
        setByteElement(term768364, 22, (byte) -1);
        setByteElement(term768364, 23, (byte) -1);
        setByteElement(term768364, 24, (byte) -1);
        setByteElement(term768364, 25, (byte) -1);
        setByteElement(term768364, 26, (byte) -1);
        setByteElement(term768364, 27, (byte) -1);
        setByteElement(term768364, 28, (byte) -1);
        setByteElement(term768364, 29, (byte) -1);
        setByteElement(term768364, 30, (byte) -1);
        setByteElement(term768364, 31, (byte) -1);
        setByteElement(term768364, 32, (byte) -1);
        setByteElement(term768364, 33, (byte) -1);
        setByteElement(term768364, 34, (byte) -1);
        setByteElement(term768364, 35, (byte) -1);
        setByteElement(term768364, 36, (byte) -1);
        setByteElement(term768364, 37, (byte) -1);
        setByteElement(term768364, 38, (byte) -1);
        setByteElement(term768364, 39, (byte) -1);
        setByteElement(term768364, 40, (byte) -1);
        setByteElement(term768364, 41, (byte) -1);
        setByteElement(term768364, 42, (byte) -1);
        setByteElement(term768364, 43, (byte) -1);
        setByteElement(term768364, 44, (byte) -1);
        setByteElement(term768364, 45, (byte) -1);
        setByteElement(term768364, 46, (byte) -1);
        setByteElement(term768364, 47, (byte) -1);
        setByteElement(term768364, 48, (byte) -1);
        setByteElement(term768364, 49, (byte) -1);
        setByteElement(term768364, 50, (byte) 26);
        setByteElement(term768364, 51, (byte) 27);
        setByteElement(term768364, 52, (byte) 28);
        setByteElement(term768364, 53, (byte) 29);
        setByteElement(term768364, 54, (byte) 30);
        setByteElement(term768364, 55, (byte) 31);
        setByteElement(term768364, 56, (byte) -1);
        setByteElement(term768364, 57, (byte) -1);
        setByteElement(term768364, 58, (byte) -1);
        setByteElement(term768364, 59, (byte) -1);
        setByteElement(term768364, 60, (byte) -1);
        setByteElement(term768364, 61, (byte) -1);
        setByteElement(term768364, 62, (byte) -1);
        setByteElement(term768364, 63, (byte) -1);
        setByteElement(term768364, 64, (byte) -1);
        setByteElement(term768364, 66, (byte) 1);
        setByteElement(term768364, 67, (byte) 2);
        setByteElement(term768364, 68, (byte) 3);
        setByteElement(term768364, 69, (byte) 4);
        setByteElement(term768364, 70, (byte) 5);
        setByteElement(term768364, 71, (byte) 6);
        setByteElement(term768364, 72, (byte) 7);
        setByteElement(term768364, 73, (byte) 8);
        setByteElement(term768364, 74, (byte) 9);
        setByteElement(term768364, 75, (byte) 10);
        setByteElement(term768364, 76, (byte) 11);
        setByteElement(term768364, 77, (byte) 12);
        setByteElement(term768364, 78, (byte) 13);
        setByteElement(term768364, 79, (byte) 14);
        setByteElement(term768364, 80, (byte) 15);
        setByteElement(term768364, 81, (byte) 16);
        setByteElement(term768364, 82, (byte) 17);
        setByteElement(term768364, 83, (byte) 18);
        setByteElement(term768364, 84, (byte) 19);
        setByteElement(term768364, 85, (byte) 20);
        setByteElement(term768364, 86, (byte) 21);
        setByteElement(term768364, 87, (byte) 22);
        setByteElement(term768364, 88, (byte) 23);
        setByteElement(term768364, 89, (byte) 24);
        setByteElement(term768364, 90, (byte) 25);
        setField(term768358, term768358.getClass(), "decodeTable", term768364);
        setIntField(term768358, term768358.getClass(), "encodeSize", 8);
        setByteElement(term768365, 0, (byte) 65);
        setByteElement(term768365, 1, (byte) 66);
        setByteElement(term768365, 2, (byte) 67);
        setByteElement(term768365, 3, (byte) 68);
        setByteElement(term768365, 4, (byte) 69);
        setByteElement(term768365, 5, (byte) 70);
        setByteElement(term768365, 6, (byte) 71);
        setByteElement(term768365, 7, (byte) 72);
        setByteElement(term768365, 8, (byte) 73);
        setByteElement(term768365, 9, (byte) 74);
        setByteElement(term768365, 10, (byte) 75);
        setByteElement(term768365, 11, (byte) 76);
        setByteElement(term768365, 12, (byte) 77);
        setByteElement(term768365, 13, (byte) 78);
        setByteElement(term768365, 14, (byte) 79);
        setByteElement(term768365, 15, (byte) 80);
        setByteElement(term768365, 16, (byte) 81);
        setByteElement(term768365, 17, (byte) 82);
        setByteElement(term768365, 18, (byte) 83);
        setByteElement(term768365, 19, (byte) 84);
        setByteElement(term768365, 20, (byte) 85);
        setByteElement(term768365, 21, (byte) 86);
        setByteElement(term768365, 22, (byte) 87);
        setByteElement(term768365, 23, (byte) 88);
        setByteElement(term768365, 24, (byte) 89);
        setByteElement(term768365, 25, (byte) 90);
        setByteElement(term768365, 26, (byte) 50);
        setByteElement(term768365, 27, (byte) 51);
        setByteElement(term768365, 28, (byte) 52);
        setByteElement(term768365, 29, (byte) 53);
        setByteElement(term768365, 30, (byte) 54);
        setByteElement(term768365, 31, (byte) 55);
        setField(term768358, term768358.getClass(), "encodeTable", term768365);
        setField(term768358, term768358.getClass(), "lineSeparator", term768366);
        setByteField(term768358, term768358.getClass(), "PAD", (byte) 61);
        setByteField(term768358, term768358.getClass(), "pad", (byte) 61);
        setIntField(term768358, term768358.getClass(), "unencodedBlockSize", 5);
        setIntField(term768358, term768358.getClass(), "encodedBlockSize", 8);
        setIntField(term768358, term768358.getClass(), "lineLength", 0);
        setIntField(term768358, term768358.getClass(), "chunkSeparatorLength", 0);
        term768367 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term719885;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term768358));
        assertTrue(recursiveEquals(term719885, term768367));
    }

};


