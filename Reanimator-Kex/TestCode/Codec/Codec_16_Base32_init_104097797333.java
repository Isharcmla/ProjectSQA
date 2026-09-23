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

public class Base32_init_104097797333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11070;

    public Base32_init_104097797333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10917 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term11070 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term11071 = (byte[]) newByteArray(91);
        byte[] term11072 = (byte[]) newByteArray(32);
        setIntField(term11070, term11070.getClass(), "decodeSize", 7);
        setByteElement(term11071, 0, (byte) -1);
        setByteElement(term11071, 1, (byte) -1);
        setByteElement(term11071, 2, (byte) -1);
        setByteElement(term11071, 3, (byte) -1);
        setByteElement(term11071, 4, (byte) -1);
        setByteElement(term11071, 5, (byte) -1);
        setByteElement(term11071, 6, (byte) -1);
        setByteElement(term11071, 7, (byte) -1);
        setByteElement(term11071, 8, (byte) -1);
        setByteElement(term11071, 9, (byte) -1);
        setByteElement(term11071, 10, (byte) -1);
        setByteElement(term11071, 11, (byte) -1);
        setByteElement(term11071, 12, (byte) -1);
        setByteElement(term11071, 13, (byte) -1);
        setByteElement(term11071, 14, (byte) -1);
        setByteElement(term11071, 15, (byte) -1);
        setByteElement(term11071, 16, (byte) -1);
        setByteElement(term11071, 17, (byte) -1);
        setByteElement(term11071, 18, (byte) -1);
        setByteElement(term11071, 19, (byte) -1);
        setByteElement(term11071, 20, (byte) -1);
        setByteElement(term11071, 21, (byte) -1);
        setByteElement(term11071, 22, (byte) -1);
        setByteElement(term11071, 23, (byte) -1);
        setByteElement(term11071, 24, (byte) -1);
        setByteElement(term11071, 25, (byte) -1);
        setByteElement(term11071, 26, (byte) -1);
        setByteElement(term11071, 27, (byte) -1);
        setByteElement(term11071, 28, (byte) -1);
        setByteElement(term11071, 29, (byte) -1);
        setByteElement(term11071, 30, (byte) -1);
        setByteElement(term11071, 31, (byte) -1);
        setByteElement(term11071, 32, (byte) -1);
        setByteElement(term11071, 33, (byte) -1);
        setByteElement(term11071, 34, (byte) -1);
        setByteElement(term11071, 35, (byte) -1);
        setByteElement(term11071, 36, (byte) -1);
        setByteElement(term11071, 37, (byte) -1);
        setByteElement(term11071, 38, (byte) -1);
        setByteElement(term11071, 39, (byte) -1);
        setByteElement(term11071, 40, (byte) -1);
        setByteElement(term11071, 41, (byte) -1);
        setByteElement(term11071, 42, (byte) -1);
        setByteElement(term11071, 43, (byte) -1);
        setByteElement(term11071, 44, (byte) -1);
        setByteElement(term11071, 45, (byte) -1);
        setByteElement(term11071, 46, (byte) -1);
        setByteElement(term11071, 47, (byte) -1);
        setByteElement(term11071, 48, (byte) -1);
        setByteElement(term11071, 49, (byte) -1);
        setByteElement(term11071, 50, (byte) 26);
        setByteElement(term11071, 51, (byte) 27);
        setByteElement(term11071, 52, (byte) 28);
        setByteElement(term11071, 53, (byte) 29);
        setByteElement(term11071, 54, (byte) 30);
        setByteElement(term11071, 55, (byte) 31);
        setByteElement(term11071, 56, (byte) -1);
        setByteElement(term11071, 57, (byte) -1);
        setByteElement(term11071, 58, (byte) -1);
        setByteElement(term11071, 59, (byte) -1);
        setByteElement(term11071, 60, (byte) -1);
        setByteElement(term11071, 61, (byte) -1);
        setByteElement(term11071, 62, (byte) -1);
        setByteElement(term11071, 63, (byte) -1);
        setByteElement(term11071, 64, (byte) -1);
        setByteElement(term11071, 66, (byte) 1);
        setByteElement(term11071, 67, (byte) 2);
        setByteElement(term11071, 68, (byte) 3);
        setByteElement(term11071, 69, (byte) 4);
        setByteElement(term11071, 70, (byte) 5);
        setByteElement(term11071, 71, (byte) 6);
        setByteElement(term11071, 72, (byte) 7);
        setByteElement(term11071, 73, (byte) 8);
        setByteElement(term11071, 74, (byte) 9);
        setByteElement(term11071, 75, (byte) 10);
        setByteElement(term11071, 76, (byte) 11);
        setByteElement(term11071, 77, (byte) 12);
        setByteElement(term11071, 78, (byte) 13);
        setByteElement(term11071, 79, (byte) 14);
        setByteElement(term11071, 80, (byte) 15);
        setByteElement(term11071, 81, (byte) 16);
        setByteElement(term11071, 82, (byte) 17);
        setByteElement(term11071, 83, (byte) 18);
        setByteElement(term11071, 84, (byte) 19);
        setByteElement(term11071, 85, (byte) 20);
        setByteElement(term11071, 86, (byte) 21);
        setByteElement(term11071, 87, (byte) 22);
        setByteElement(term11071, 88, (byte) 23);
        setByteElement(term11071, 89, (byte) 24);
        setByteElement(term11071, 90, (byte) 25);
        setField(term11070, term11070.getClass(), "decodeTable", term11071);
        setIntField(term11070, term11070.getClass(), "encodeSize", 8);
        setByteElement(term11072, 0, (byte) 65);
        setByteElement(term11072, 1, (byte) 66);
        setByteElement(term11072, 2, (byte) 67);
        setByteElement(term11072, 3, (byte) 68);
        setByteElement(term11072, 4, (byte) 69);
        setByteElement(term11072, 5, (byte) 70);
        setByteElement(term11072, 6, (byte) 71);
        setByteElement(term11072, 7, (byte) 72);
        setByteElement(term11072, 8, (byte) 73);
        setByteElement(term11072, 9, (byte) 74);
        setByteElement(term11072, 10, (byte) 75);
        setByteElement(term11072, 11, (byte) 76);
        setByteElement(term11072, 12, (byte) 77);
        setByteElement(term11072, 13, (byte) 78);
        setByteElement(term11072, 14, (byte) 79);
        setByteElement(term11072, 15, (byte) 80);
        setByteElement(term11072, 16, (byte) 81);
        setByteElement(term11072, 17, (byte) 82);
        setByteElement(term11072, 18, (byte) 83);
        setByteElement(term11072, 19, (byte) 84);
        setByteElement(term11072, 20, (byte) 85);
        setByteElement(term11072, 21, (byte) 86);
        setByteElement(term11072, 22, (byte) 87);
        setByteElement(term11072, 23, (byte) 88);
        setByteElement(term11072, 24, (byte) 89);
        setByteElement(term11072, 25, (byte) 90);
        setByteElement(term11072, 26, (byte) 50);
        setByteElement(term11072, 27, (byte) 51);
        setByteElement(term11072, 28, (byte) 52);
        setByteElement(term11072, 29, (byte) 53);
        setByteElement(term11072, 30, (byte) 54);
        setByteElement(term11072, 31, (byte) 55);
        setField(term11070, term11070.getClass(), "encodeTable", term11072);
        setField(term11070, term11070.getClass(), "lineSeparator", null);
        setByteField(term11070, term11070.getClass(), "PAD", (byte) 61);
        setByteField(term11070, term11070.getClass(), "pad", (byte) 61);
        setIntField(term11070, term11070.getClass(), "unencodedBlockSize", 5);
        setIntField(term11070, term11070.getClass(), "encodedBlockSize", 8);
        setIntField(term11070, term11070.getClass(), "lineLength", 0);
        setIntField(term11070, term11070.getClass(), "chunkSeparatorLength", 0);
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
        assertTrue(recursiveEquals(instance, term11070));
    }

};


