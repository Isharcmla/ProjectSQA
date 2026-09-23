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

public class Base32_init_1042801703247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441756;
     Object term443895;
     Object term443899;

    public Base32_init_1042801703247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term443627 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term442311 = (byte[]) newByteArray(0);
        setByteField(term443627, term443627.getClass(), "PAD", (byte) 0);
        setIntField(term443627, term443627.getClass(), "unencodedBlockSize", 0);
        setIntField(term443627, term443627.getClass(), "encodedBlockSize", 0);
        setIntField(term443627, term443627.getClass(), "lineLength", 0);
        setIntField(term443627, term443627.getClass(), "chunkSeparatorLength", 0);
        setByteField(term443627, term443627.getClass(), "pad", (byte) -128);
        setField(term443627, term443627.getClass(), "encodeTable", null);
        setField(term443627, term443627.getClass(), "decodeTable", term442311);
        setIntField(term443627, term443627.getClass(), "encodeSize", 0);
        setField(term443627, term443627.getClass(), "lineSeparator", null);
        setIntField(term443627, term443627.getClass(), "decodeSize", 0);
        term441756 = (byte[]) newByteArray(10);
        term443895 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term443896 = (byte[]) newByteArray(88);
        byte[] term443897 = (byte[]) newByteArray(32);
        byte[] term443898 = (byte[]) newByteArray(10);
        setIntField(term443895, term443895.getClass(), "decodeSize", 17);
        setByteElement(term443896, 0, (byte) -1);
        setByteElement(term443896, 1, (byte) -1);
        setByteElement(term443896, 2, (byte) -1);
        setByteElement(term443896, 3, (byte) -1);
        setByteElement(term443896, 4, (byte) -1);
        setByteElement(term443896, 5, (byte) -1);
        setByteElement(term443896, 6, (byte) -1);
        setByteElement(term443896, 7, (byte) -1);
        setByteElement(term443896, 8, (byte) -1);
        setByteElement(term443896, 9, (byte) -1);
        setByteElement(term443896, 10, (byte) -1);
        setByteElement(term443896, 11, (byte) -1);
        setByteElement(term443896, 12, (byte) -1);
        setByteElement(term443896, 13, (byte) -1);
        setByteElement(term443896, 14, (byte) -1);
        setByteElement(term443896, 15, (byte) -1);
        setByteElement(term443896, 16, (byte) -1);
        setByteElement(term443896, 17, (byte) -1);
        setByteElement(term443896, 18, (byte) -1);
        setByteElement(term443896, 19, (byte) -1);
        setByteElement(term443896, 20, (byte) -1);
        setByteElement(term443896, 21, (byte) -1);
        setByteElement(term443896, 22, (byte) -1);
        setByteElement(term443896, 23, (byte) -1);
        setByteElement(term443896, 24, (byte) -1);
        setByteElement(term443896, 25, (byte) -1);
        setByteElement(term443896, 26, (byte) -1);
        setByteElement(term443896, 27, (byte) -1);
        setByteElement(term443896, 28, (byte) -1);
        setByteElement(term443896, 29, (byte) -1);
        setByteElement(term443896, 30, (byte) -1);
        setByteElement(term443896, 31, (byte) -1);
        setByteElement(term443896, 32, (byte) -1);
        setByteElement(term443896, 33, (byte) -1);
        setByteElement(term443896, 34, (byte) -1);
        setByteElement(term443896, 35, (byte) -1);
        setByteElement(term443896, 36, (byte) -1);
        setByteElement(term443896, 37, (byte) -1);
        setByteElement(term443896, 38, (byte) -1);
        setByteElement(term443896, 39, (byte) -1);
        setByteElement(term443896, 40, (byte) -1);
        setByteElement(term443896, 41, (byte) -1);
        setByteElement(term443896, 42, (byte) -1);
        setByteElement(term443896, 43, (byte) -1);
        setByteElement(term443896, 44, (byte) -1);
        setByteElement(term443896, 45, (byte) -1);
        setByteElement(term443896, 46, (byte) -1);
        setByteElement(term443896, 47, (byte) -1);
        setByteElement(term443896, 49, (byte) 1);
        setByteElement(term443896, 50, (byte) 2);
        setByteElement(term443896, 51, (byte) 3);
        setByteElement(term443896, 52, (byte) 4);
        setByteElement(term443896, 53, (byte) 5);
        setByteElement(term443896, 54, (byte) 6);
        setByteElement(term443896, 55, (byte) 7);
        setByteElement(term443896, 56, (byte) 8);
        setByteElement(term443896, 57, (byte) 9);
        setByteElement(term443896, 58, (byte) -1);
        setByteElement(term443896, 59, (byte) -1);
        setByteElement(term443896, 60, (byte) -1);
        setByteElement(term443896, 61, (byte) -1);
        setByteElement(term443896, 62, (byte) -1);
        setByteElement(term443896, 63, (byte) -1);
        setByteElement(term443896, 64, (byte) -1);
        setByteElement(term443896, 65, (byte) 10);
        setByteElement(term443896, 66, (byte) 11);
        setByteElement(term443896, 67, (byte) 12);
        setByteElement(term443896, 68, (byte) 13);
        setByteElement(term443896, 69, (byte) 14);
        setByteElement(term443896, 70, (byte) 15);
        setByteElement(term443896, 71, (byte) 16);
        setByteElement(term443896, 72, (byte) 17);
        setByteElement(term443896, 73, (byte) 18);
        setByteElement(term443896, 74, (byte) 19);
        setByteElement(term443896, 75, (byte) 20);
        setByteElement(term443896, 76, (byte) 21);
        setByteElement(term443896, 77, (byte) 22);
        setByteElement(term443896, 78, (byte) 23);
        setByteElement(term443896, 79, (byte) 24);
        setByteElement(term443896, 80, (byte) 25);
        setByteElement(term443896, 81, (byte) 26);
        setByteElement(term443896, 82, (byte) 27);
        setByteElement(term443896, 83, (byte) 28);
        setByteElement(term443896, 84, (byte) 29);
        setByteElement(term443896, 85, (byte) 30);
        setByteElement(term443896, 86, (byte) 31);
        setByteElement(term443896, 87, (byte) 32);
        setField(term443895, term443895.getClass(), "decodeTable", term443896);
        setIntField(term443895, term443895.getClass(), "encodeSize", 18);
        setByteElement(term443897, 0, (byte) 48);
        setByteElement(term443897, 1, (byte) 49);
        setByteElement(term443897, 2, (byte) 50);
        setByteElement(term443897, 3, (byte) 51);
        setByteElement(term443897, 4, (byte) 52);
        setByteElement(term443897, 5, (byte) 53);
        setByteElement(term443897, 6, (byte) 54);
        setByteElement(term443897, 7, (byte) 55);
        setByteElement(term443897, 8, (byte) 56);
        setByteElement(term443897, 9, (byte) 57);
        setByteElement(term443897, 10, (byte) 65);
        setByteElement(term443897, 11, (byte) 66);
        setByteElement(term443897, 12, (byte) 67);
        setByteElement(term443897, 13, (byte) 68);
        setByteElement(term443897, 14, (byte) 69);
        setByteElement(term443897, 15, (byte) 70);
        setByteElement(term443897, 16, (byte) 71);
        setByteElement(term443897, 17, (byte) 72);
        setByteElement(term443897, 18, (byte) 73);
        setByteElement(term443897, 19, (byte) 74);
        setByteElement(term443897, 20, (byte) 75);
        setByteElement(term443897, 21, (byte) 76);
        setByteElement(term443897, 22, (byte) 77);
        setByteElement(term443897, 23, (byte) 78);
        setByteElement(term443897, 24, (byte) 79);
        setByteElement(term443897, 25, (byte) 80);
        setByteElement(term443897, 26, (byte) 81);
        setByteElement(term443897, 27, (byte) 82);
        setByteElement(term443897, 28, (byte) 83);
        setByteElement(term443897, 29, (byte) 84);
        setByteElement(term443897, 30, (byte) 85);
        setByteElement(term443897, 31, (byte) 86);
        setField(term443895, term443895.getClass(), "encodeTable", term443897);
        setField(term443895, term443895.getClass(), "lineSeparator", term443898);
        setByteField(term443895, term443895.getClass(), "PAD", (byte) 61);
        setByteField(term443895, term443895.getClass(), "pad", (byte) 61);
        setIntField(term443895, term443895.getClass(), "unencodedBlockSize", 5);
        setIntField(term443895, term443895.getClass(), "encodedBlockSize", 8);
        setIntField(term443895, term443895.getClass(), "lineLength", 0);
        setIntField(term443895, term443895.getClass(), "chunkSeparatorLength", 10);
        term443899 = (byte[]) newByteArray(10);
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
        args[1] = term441756;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term443895));
        assertTrue(recursiveEquals(term441756, term443899));
    }

};


