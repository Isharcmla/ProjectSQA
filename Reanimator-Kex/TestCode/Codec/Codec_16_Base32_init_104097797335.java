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

public class Base32_init_104097797335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11198;
     Object term11452;
     Object term11455;

    public Base32_init_104097797335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11298 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term11298, term11298.getClass(), "PAD", (byte) 0);
        setIntField(term11298, term11298.getClass(), "unencodedBlockSize", 0);
        setIntField(term11298, term11298.getClass(), "encodedBlockSize", 0);
        term11198 = (byte[]) newByteArray(0);
        term11452 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term11453 = (byte[]) newByteArray(91);
        byte[] term11454 = (byte[]) newByteArray(32);
        setIntField(term11452, term11452.getClass(), "decodeSize", 7);
        setByteElement(term11453, 0, (byte) -1);
        setByteElement(term11453, 1, (byte) -1);
        setByteElement(term11453, 2, (byte) -1);
        setByteElement(term11453, 3, (byte) -1);
        setByteElement(term11453, 4, (byte) -1);
        setByteElement(term11453, 5, (byte) -1);
        setByteElement(term11453, 6, (byte) -1);
        setByteElement(term11453, 7, (byte) -1);
        setByteElement(term11453, 8, (byte) -1);
        setByteElement(term11453, 9, (byte) -1);
        setByteElement(term11453, 10, (byte) -1);
        setByteElement(term11453, 11, (byte) -1);
        setByteElement(term11453, 12, (byte) -1);
        setByteElement(term11453, 13, (byte) -1);
        setByteElement(term11453, 14, (byte) -1);
        setByteElement(term11453, 15, (byte) -1);
        setByteElement(term11453, 16, (byte) -1);
        setByteElement(term11453, 17, (byte) -1);
        setByteElement(term11453, 18, (byte) -1);
        setByteElement(term11453, 19, (byte) -1);
        setByteElement(term11453, 20, (byte) -1);
        setByteElement(term11453, 21, (byte) -1);
        setByteElement(term11453, 22, (byte) -1);
        setByteElement(term11453, 23, (byte) -1);
        setByteElement(term11453, 24, (byte) -1);
        setByteElement(term11453, 25, (byte) -1);
        setByteElement(term11453, 26, (byte) -1);
        setByteElement(term11453, 27, (byte) -1);
        setByteElement(term11453, 28, (byte) -1);
        setByteElement(term11453, 29, (byte) -1);
        setByteElement(term11453, 30, (byte) -1);
        setByteElement(term11453, 31, (byte) -1);
        setByteElement(term11453, 32, (byte) -1);
        setByteElement(term11453, 33, (byte) -1);
        setByteElement(term11453, 34, (byte) -1);
        setByteElement(term11453, 35, (byte) -1);
        setByteElement(term11453, 36, (byte) -1);
        setByteElement(term11453, 37, (byte) -1);
        setByteElement(term11453, 38, (byte) -1);
        setByteElement(term11453, 39, (byte) -1);
        setByteElement(term11453, 40, (byte) -1);
        setByteElement(term11453, 41, (byte) -1);
        setByteElement(term11453, 42, (byte) -1);
        setByteElement(term11453, 43, (byte) -1);
        setByteElement(term11453, 44, (byte) -1);
        setByteElement(term11453, 45, (byte) -1);
        setByteElement(term11453, 46, (byte) -1);
        setByteElement(term11453, 47, (byte) -1);
        setByteElement(term11453, 48, (byte) -1);
        setByteElement(term11453, 49, (byte) -1);
        setByteElement(term11453, 50, (byte) 26);
        setByteElement(term11453, 51, (byte) 27);
        setByteElement(term11453, 52, (byte) 28);
        setByteElement(term11453, 53, (byte) 29);
        setByteElement(term11453, 54, (byte) 30);
        setByteElement(term11453, 55, (byte) 31);
        setByteElement(term11453, 56, (byte) -1);
        setByteElement(term11453, 57, (byte) -1);
        setByteElement(term11453, 58, (byte) -1);
        setByteElement(term11453, 59, (byte) -1);
        setByteElement(term11453, 60, (byte) -1);
        setByteElement(term11453, 61, (byte) -1);
        setByteElement(term11453, 62, (byte) -1);
        setByteElement(term11453, 63, (byte) -1);
        setByteElement(term11453, 64, (byte) -1);
        setByteElement(term11453, 66, (byte) 1);
        setByteElement(term11453, 67, (byte) 2);
        setByteElement(term11453, 68, (byte) 3);
        setByteElement(term11453, 69, (byte) 4);
        setByteElement(term11453, 70, (byte) 5);
        setByteElement(term11453, 71, (byte) 6);
        setByteElement(term11453, 72, (byte) 7);
        setByteElement(term11453, 73, (byte) 8);
        setByteElement(term11453, 74, (byte) 9);
        setByteElement(term11453, 75, (byte) 10);
        setByteElement(term11453, 76, (byte) 11);
        setByteElement(term11453, 77, (byte) 12);
        setByteElement(term11453, 78, (byte) 13);
        setByteElement(term11453, 79, (byte) 14);
        setByteElement(term11453, 80, (byte) 15);
        setByteElement(term11453, 81, (byte) 16);
        setByteElement(term11453, 82, (byte) 17);
        setByteElement(term11453, 83, (byte) 18);
        setByteElement(term11453, 84, (byte) 19);
        setByteElement(term11453, 85, (byte) 20);
        setByteElement(term11453, 86, (byte) 21);
        setByteElement(term11453, 87, (byte) 22);
        setByteElement(term11453, 88, (byte) 23);
        setByteElement(term11453, 89, (byte) 24);
        setByteElement(term11453, 90, (byte) 25);
        setField(term11452, term11452.getClass(), "decodeTable", term11453);
        setIntField(term11452, term11452.getClass(), "encodeSize", 8);
        setByteElement(term11454, 0, (byte) 65);
        setByteElement(term11454, 1, (byte) 66);
        setByteElement(term11454, 2, (byte) 67);
        setByteElement(term11454, 3, (byte) 68);
        setByteElement(term11454, 4, (byte) 69);
        setByteElement(term11454, 5, (byte) 70);
        setByteElement(term11454, 6, (byte) 71);
        setByteElement(term11454, 7, (byte) 72);
        setByteElement(term11454, 8, (byte) 73);
        setByteElement(term11454, 9, (byte) 74);
        setByteElement(term11454, 10, (byte) 75);
        setByteElement(term11454, 11, (byte) 76);
        setByteElement(term11454, 12, (byte) 77);
        setByteElement(term11454, 13, (byte) 78);
        setByteElement(term11454, 14, (byte) 79);
        setByteElement(term11454, 15, (byte) 80);
        setByteElement(term11454, 16, (byte) 81);
        setByteElement(term11454, 17, (byte) 82);
        setByteElement(term11454, 18, (byte) 83);
        setByteElement(term11454, 19, (byte) 84);
        setByteElement(term11454, 20, (byte) 85);
        setByteElement(term11454, 21, (byte) 86);
        setByteElement(term11454, 22, (byte) 87);
        setByteElement(term11454, 23, (byte) 88);
        setByteElement(term11454, 24, (byte) 89);
        setByteElement(term11454, 25, (byte) 90);
        setByteElement(term11454, 26, (byte) 50);
        setByteElement(term11454, 27, (byte) 51);
        setByteElement(term11454, 28, (byte) 52);
        setByteElement(term11454, 29, (byte) 53);
        setByteElement(term11454, 30, (byte) 54);
        setByteElement(term11454, 31, (byte) 55);
        setField(term11452, term11452.getClass(), "encodeTable", term11454);
        setField(term11452, term11452.getClass(), "lineSeparator", null);
        setByteField(term11452, term11452.getClass(), "PAD", (byte) 61);
        setByteField(term11452, term11452.getClass(), "pad", (byte) 61);
        setIntField(term11452, term11452.getClass(), "unencodedBlockSize", 5);
        setIntField(term11452, term11452.getClass(), "encodedBlockSize", 8);
        setIntField(term11452, term11452.getClass(), "lineLength", 0);
        setIntField(term11452, term11452.getClass(), "chunkSeparatorLength", 0);
        term11455 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term11198;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11452));
        assertTrue(recursiveEquals(term11198, term11455));
    }

};


