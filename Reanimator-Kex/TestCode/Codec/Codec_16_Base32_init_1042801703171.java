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

public class Base32_init_1042801703171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334213;
     Object term342369;
     Object term342373;

    public Base32_init_1042801703171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term342145 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term342145, term342145.getClass(), "PAD", (byte) 0);
        setIntField(term342145, term342145.getClass(), "unencodedBlockSize", 0);
        setIntField(term342145, term342145.getClass(), "encodedBlockSize", 0);
        setIntField(term342145, term342145.getClass(), "lineLength", 0);
        setIntField(term342145, term342145.getClass(), "chunkSeparatorLength", 0);
        setByteField(term342145, term342145.getClass(), "pad", (byte) 0);
        setField(term342145, term342145.getClass(), "encodeTable", null);
        setField(term342145, term342145.getClass(), "decodeTable", null);
        setIntField(term342145, term342145.getClass(), "encodeSize", 0);
        setField(term342145, term342145.getClass(), "lineSeparator", null);
        setIntField(term342145, term342145.getClass(), "decodeSize", 0);
        term334213 = (byte[]) newByteArray(6);
        term342369 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term342370 = (byte[]) newByteArray(88);
        byte[] term342371 = (byte[]) newByteArray(32);
        byte[] term342372 = (byte[]) newByteArray(6);
        setIntField(term342369, term342369.getClass(), "decodeSize", 13);
        setByteElement(term342370, 0, (byte) -1);
        setByteElement(term342370, 1, (byte) -1);
        setByteElement(term342370, 2, (byte) -1);
        setByteElement(term342370, 3, (byte) -1);
        setByteElement(term342370, 4, (byte) -1);
        setByteElement(term342370, 5, (byte) -1);
        setByteElement(term342370, 6, (byte) -1);
        setByteElement(term342370, 7, (byte) -1);
        setByteElement(term342370, 8, (byte) -1);
        setByteElement(term342370, 9, (byte) -1);
        setByteElement(term342370, 10, (byte) -1);
        setByteElement(term342370, 11, (byte) -1);
        setByteElement(term342370, 12, (byte) -1);
        setByteElement(term342370, 13, (byte) -1);
        setByteElement(term342370, 14, (byte) -1);
        setByteElement(term342370, 15, (byte) -1);
        setByteElement(term342370, 16, (byte) -1);
        setByteElement(term342370, 17, (byte) -1);
        setByteElement(term342370, 18, (byte) -1);
        setByteElement(term342370, 19, (byte) -1);
        setByteElement(term342370, 20, (byte) -1);
        setByteElement(term342370, 21, (byte) -1);
        setByteElement(term342370, 22, (byte) -1);
        setByteElement(term342370, 23, (byte) -1);
        setByteElement(term342370, 24, (byte) -1);
        setByteElement(term342370, 25, (byte) -1);
        setByteElement(term342370, 26, (byte) -1);
        setByteElement(term342370, 27, (byte) -1);
        setByteElement(term342370, 28, (byte) -1);
        setByteElement(term342370, 29, (byte) -1);
        setByteElement(term342370, 30, (byte) -1);
        setByteElement(term342370, 31, (byte) -1);
        setByteElement(term342370, 32, (byte) -1);
        setByteElement(term342370, 33, (byte) -1);
        setByteElement(term342370, 34, (byte) -1);
        setByteElement(term342370, 35, (byte) -1);
        setByteElement(term342370, 36, (byte) -1);
        setByteElement(term342370, 37, (byte) -1);
        setByteElement(term342370, 38, (byte) -1);
        setByteElement(term342370, 39, (byte) -1);
        setByteElement(term342370, 40, (byte) -1);
        setByteElement(term342370, 41, (byte) -1);
        setByteElement(term342370, 42, (byte) -1);
        setByteElement(term342370, 43, (byte) -1);
        setByteElement(term342370, 44, (byte) -1);
        setByteElement(term342370, 45, (byte) -1);
        setByteElement(term342370, 46, (byte) -1);
        setByteElement(term342370, 47, (byte) -1);
        setByteElement(term342370, 49, (byte) 1);
        setByteElement(term342370, 50, (byte) 2);
        setByteElement(term342370, 51, (byte) 3);
        setByteElement(term342370, 52, (byte) 4);
        setByteElement(term342370, 53, (byte) 5);
        setByteElement(term342370, 54, (byte) 6);
        setByteElement(term342370, 55, (byte) 7);
        setByteElement(term342370, 56, (byte) 8);
        setByteElement(term342370, 57, (byte) 9);
        setByteElement(term342370, 58, (byte) -1);
        setByteElement(term342370, 59, (byte) -1);
        setByteElement(term342370, 60, (byte) -1);
        setByteElement(term342370, 61, (byte) -1);
        setByteElement(term342370, 62, (byte) -1);
        setByteElement(term342370, 63, (byte) -1);
        setByteElement(term342370, 64, (byte) -1);
        setByteElement(term342370, 65, (byte) 10);
        setByteElement(term342370, 66, (byte) 11);
        setByteElement(term342370, 67, (byte) 12);
        setByteElement(term342370, 68, (byte) 13);
        setByteElement(term342370, 69, (byte) 14);
        setByteElement(term342370, 70, (byte) 15);
        setByteElement(term342370, 71, (byte) 16);
        setByteElement(term342370, 72, (byte) 17);
        setByteElement(term342370, 73, (byte) 18);
        setByteElement(term342370, 74, (byte) 19);
        setByteElement(term342370, 75, (byte) 20);
        setByteElement(term342370, 76, (byte) 21);
        setByteElement(term342370, 77, (byte) 22);
        setByteElement(term342370, 78, (byte) 23);
        setByteElement(term342370, 79, (byte) 24);
        setByteElement(term342370, 80, (byte) 25);
        setByteElement(term342370, 81, (byte) 26);
        setByteElement(term342370, 82, (byte) 27);
        setByteElement(term342370, 83, (byte) 28);
        setByteElement(term342370, 84, (byte) 29);
        setByteElement(term342370, 85, (byte) 30);
        setByteElement(term342370, 86, (byte) 31);
        setByteElement(term342370, 87, (byte) 32);
        setField(term342369, term342369.getClass(), "decodeTable", term342370);
        setIntField(term342369, term342369.getClass(), "encodeSize", 14);
        setByteElement(term342371, 0, (byte) 48);
        setByteElement(term342371, 1, (byte) 49);
        setByteElement(term342371, 2, (byte) 50);
        setByteElement(term342371, 3, (byte) 51);
        setByteElement(term342371, 4, (byte) 52);
        setByteElement(term342371, 5, (byte) 53);
        setByteElement(term342371, 6, (byte) 54);
        setByteElement(term342371, 7, (byte) 55);
        setByteElement(term342371, 8, (byte) 56);
        setByteElement(term342371, 9, (byte) 57);
        setByteElement(term342371, 10, (byte) 65);
        setByteElement(term342371, 11, (byte) 66);
        setByteElement(term342371, 12, (byte) 67);
        setByteElement(term342371, 13, (byte) 68);
        setByteElement(term342371, 14, (byte) 69);
        setByteElement(term342371, 15, (byte) 70);
        setByteElement(term342371, 16, (byte) 71);
        setByteElement(term342371, 17, (byte) 72);
        setByteElement(term342371, 18, (byte) 73);
        setByteElement(term342371, 19, (byte) 74);
        setByteElement(term342371, 20, (byte) 75);
        setByteElement(term342371, 21, (byte) 76);
        setByteElement(term342371, 22, (byte) 77);
        setByteElement(term342371, 23, (byte) 78);
        setByteElement(term342371, 24, (byte) 79);
        setByteElement(term342371, 25, (byte) 80);
        setByteElement(term342371, 26, (byte) 81);
        setByteElement(term342371, 27, (byte) 82);
        setByteElement(term342371, 28, (byte) 83);
        setByteElement(term342371, 29, (byte) 84);
        setByteElement(term342371, 30, (byte) 85);
        setByteElement(term342371, 31, (byte) 86);
        setField(term342369, term342369.getClass(), "encodeTable", term342371);
        setField(term342369, term342369.getClass(), "lineSeparator", term342372);
        setByteField(term342369, term342369.getClass(), "PAD", (byte) 61);
        setByteField(term342369, term342369.getClass(), "pad", (byte) 61);
        setIntField(term342369, term342369.getClass(), "unencodedBlockSize", 5);
        setIntField(term342369, term342369.getClass(), "encodedBlockSize", 8);
        setIntField(term342369, term342369.getClass(), "lineLength", 0);
        setIntField(term342369, term342369.getClass(), "chunkSeparatorLength", 6);
        term342373 = (byte[]) newByteArray(6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 1;
        args[1] = term334213;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term342369));
        assertTrue(recursiveEquals(term334213, term342373));
    }

};


