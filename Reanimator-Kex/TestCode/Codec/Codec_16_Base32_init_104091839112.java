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
import java.lang.Byte;

public class Base32_init_104091839112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1336;

    public Base32_init_104091839112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Byte((byte) 47);
        term1336 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1337 = (byte[]) newByteArray(91);
        byte[] term1338 = (byte[]) newByteArray(32);
        setIntField(term1336, term1336.getClass(), "decodeSize", 7);
        setByteElement(term1337, 0, (byte) -1);
        setByteElement(term1337, 1, (byte) -1);
        setByteElement(term1337, 2, (byte) -1);
        setByteElement(term1337, 3, (byte) -1);
        setByteElement(term1337, 4, (byte) -1);
        setByteElement(term1337, 5, (byte) -1);
        setByteElement(term1337, 6, (byte) -1);
        setByteElement(term1337, 7, (byte) -1);
        setByteElement(term1337, 8, (byte) -1);
        setByteElement(term1337, 9, (byte) -1);
        setByteElement(term1337, 10, (byte) -1);
        setByteElement(term1337, 11, (byte) -1);
        setByteElement(term1337, 12, (byte) -1);
        setByteElement(term1337, 13, (byte) -1);
        setByteElement(term1337, 14, (byte) -1);
        setByteElement(term1337, 15, (byte) -1);
        setByteElement(term1337, 16, (byte) -1);
        setByteElement(term1337, 17, (byte) -1);
        setByteElement(term1337, 18, (byte) -1);
        setByteElement(term1337, 19, (byte) -1);
        setByteElement(term1337, 20, (byte) -1);
        setByteElement(term1337, 21, (byte) -1);
        setByteElement(term1337, 22, (byte) -1);
        setByteElement(term1337, 23, (byte) -1);
        setByteElement(term1337, 24, (byte) -1);
        setByteElement(term1337, 25, (byte) -1);
        setByteElement(term1337, 26, (byte) -1);
        setByteElement(term1337, 27, (byte) -1);
        setByteElement(term1337, 28, (byte) -1);
        setByteElement(term1337, 29, (byte) -1);
        setByteElement(term1337, 30, (byte) -1);
        setByteElement(term1337, 31, (byte) -1);
        setByteElement(term1337, 32, (byte) -1);
        setByteElement(term1337, 33, (byte) -1);
        setByteElement(term1337, 34, (byte) -1);
        setByteElement(term1337, 35, (byte) -1);
        setByteElement(term1337, 36, (byte) -1);
        setByteElement(term1337, 37, (byte) -1);
        setByteElement(term1337, 38, (byte) -1);
        setByteElement(term1337, 39, (byte) -1);
        setByteElement(term1337, 40, (byte) -1);
        setByteElement(term1337, 41, (byte) -1);
        setByteElement(term1337, 42, (byte) -1);
        setByteElement(term1337, 43, (byte) -1);
        setByteElement(term1337, 44, (byte) -1);
        setByteElement(term1337, 45, (byte) -1);
        setByteElement(term1337, 46, (byte) -1);
        setByteElement(term1337, 47, (byte) -1);
        setByteElement(term1337, 48, (byte) -1);
        setByteElement(term1337, 49, (byte) -1);
        setByteElement(term1337, 50, (byte) 26);
        setByteElement(term1337, 51, (byte) 27);
        setByteElement(term1337, 52, (byte) 28);
        setByteElement(term1337, 53, (byte) 29);
        setByteElement(term1337, 54, (byte) 30);
        setByteElement(term1337, 55, (byte) 31);
        setByteElement(term1337, 56, (byte) -1);
        setByteElement(term1337, 57, (byte) -1);
        setByteElement(term1337, 58, (byte) -1);
        setByteElement(term1337, 59, (byte) -1);
        setByteElement(term1337, 60, (byte) -1);
        setByteElement(term1337, 61, (byte) -1);
        setByteElement(term1337, 62, (byte) -1);
        setByteElement(term1337, 63, (byte) -1);
        setByteElement(term1337, 64, (byte) -1);
        setByteElement(term1337, 66, (byte) 1);
        setByteElement(term1337, 67, (byte) 2);
        setByteElement(term1337, 68, (byte) 3);
        setByteElement(term1337, 69, (byte) 4);
        setByteElement(term1337, 70, (byte) 5);
        setByteElement(term1337, 71, (byte) 6);
        setByteElement(term1337, 72, (byte) 7);
        setByteElement(term1337, 73, (byte) 8);
        setByteElement(term1337, 74, (byte) 9);
        setByteElement(term1337, 75, (byte) 10);
        setByteElement(term1337, 76, (byte) 11);
        setByteElement(term1337, 77, (byte) 12);
        setByteElement(term1337, 78, (byte) 13);
        setByteElement(term1337, 79, (byte) 14);
        setByteElement(term1337, 80, (byte) 15);
        setByteElement(term1337, 81, (byte) 16);
        setByteElement(term1337, 82, (byte) 17);
        setByteElement(term1337, 83, (byte) 18);
        setByteElement(term1337, 84, (byte) 19);
        setByteElement(term1337, 85, (byte) 20);
        setByteElement(term1337, 86, (byte) 21);
        setByteElement(term1337, 87, (byte) 22);
        setByteElement(term1337, 88, (byte) 23);
        setByteElement(term1337, 89, (byte) 24);
        setByteElement(term1337, 90, (byte) 25);
        setField(term1336, term1336.getClass(), "decodeTable", term1337);
        setIntField(term1336, term1336.getClass(), "encodeSize", 8);
        setByteElement(term1338, 0, (byte) 65);
        setByteElement(term1338, 1, (byte) 66);
        setByteElement(term1338, 2, (byte) 67);
        setByteElement(term1338, 3, (byte) 68);
        setByteElement(term1338, 4, (byte) 69);
        setByteElement(term1338, 5, (byte) 70);
        setByteElement(term1338, 6, (byte) 71);
        setByteElement(term1338, 7, (byte) 72);
        setByteElement(term1338, 8, (byte) 73);
        setByteElement(term1338, 9, (byte) 74);
        setByteElement(term1338, 10, (byte) 75);
        setByteElement(term1338, 11, (byte) 76);
        setByteElement(term1338, 12, (byte) 77);
        setByteElement(term1338, 13, (byte) 78);
        setByteElement(term1338, 14, (byte) 79);
        setByteElement(term1338, 15, (byte) 80);
        setByteElement(term1338, 16, (byte) 81);
        setByteElement(term1338, 17, (byte) 82);
        setByteElement(term1338, 18, (byte) 83);
        setByteElement(term1338, 19, (byte) 84);
        setByteElement(term1338, 20, (byte) 85);
        setByteElement(term1338, 21, (byte) 86);
        setByteElement(term1338, 22, (byte) 87);
        setByteElement(term1338, 23, (byte) 88);
        setByteElement(term1338, 24, (byte) 89);
        setByteElement(term1338, 25, (byte) 90);
        setByteElement(term1338, 26, (byte) 50);
        setByteElement(term1338, 27, (byte) 51);
        setByteElement(term1338, 28, (byte) 52);
        setByteElement(term1338, 29, (byte) 53);
        setByteElement(term1338, 30, (byte) 54);
        setByteElement(term1338, 31, (byte) 55);
        setField(term1336, term1336.getClass(), "encodeTable", term1338);
        setField(term1336, term1336.getClass(), "lineSeparator", null);
        setByteField(term1336, term1336.getClass(), "PAD", (byte) 61);
        setByteField(term1336, term1336.getClass(), "pad", (byte) 47);
        setIntField(term1336, term1336.getClass(), "unencodedBlockSize", 5);
        setIntField(term1336, term1336.getClass(), "encodedBlockSize", 8);
        setIntField(term1336, term1336.getClass(), "lineLength", 0);
        setIntField(term1336, term1336.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1336));
        assertTrue(recursiveEquals(term1, (byte) 47));
    }

};


