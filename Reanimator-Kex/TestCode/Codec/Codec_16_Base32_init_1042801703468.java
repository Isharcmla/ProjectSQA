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

public class Base32_init_1042801703468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term965352;
     Object term1024081;
     Object term1024085;

    public Base32_init_1042801703468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term971946 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term966836 = (byte[]) newByteArray(0);
        setByteField(term971946, term971946.getClass(), "PAD", (byte) 0);
        setIntField(term971946, term971946.getClass(), "unencodedBlockSize", 0);
        setIntField(term971946, term971946.getClass(), "encodedBlockSize", 0);
        setIntField(term971946, term971946.getClass(), "lineLength", 0);
        setIntField(term971946, term971946.getClass(), "chunkSeparatorLength", 0);
        setByteField(term971946, term971946.getClass(), "pad", (byte) 0);
        setField(term971946, term971946.getClass(), "encodeTable", null);
        setField(term971946, term971946.getClass(), "decodeTable", term966836);
        term965352 = (byte[]) newByteArray(495);
        setByteElement(term965352, 5, (byte) -128);
        term1024081 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1024082 = (byte[]) newByteArray(88);
        byte[] term1024083 = (byte[]) newByteArray(32);
        byte[] term1024084 = (byte[]) newByteArray(495);
        setIntField(term1024081, term1024081.getClass(), "decodeSize", 502);
        setByteElement(term1024082, 0, (byte) -1);
        setByteElement(term1024082, 1, (byte) -1);
        setByteElement(term1024082, 2, (byte) -1);
        setByteElement(term1024082, 3, (byte) -1);
        setByteElement(term1024082, 4, (byte) -1);
        setByteElement(term1024082, 5, (byte) -1);
        setByteElement(term1024082, 6, (byte) -1);
        setByteElement(term1024082, 7, (byte) -1);
        setByteElement(term1024082, 8, (byte) -1);
        setByteElement(term1024082, 9, (byte) -1);
        setByteElement(term1024082, 10, (byte) -1);
        setByteElement(term1024082, 11, (byte) -1);
        setByteElement(term1024082, 12, (byte) -1);
        setByteElement(term1024082, 13, (byte) -1);
        setByteElement(term1024082, 14, (byte) -1);
        setByteElement(term1024082, 15, (byte) -1);
        setByteElement(term1024082, 16, (byte) -1);
        setByteElement(term1024082, 17, (byte) -1);
        setByteElement(term1024082, 18, (byte) -1);
        setByteElement(term1024082, 19, (byte) -1);
        setByteElement(term1024082, 20, (byte) -1);
        setByteElement(term1024082, 21, (byte) -1);
        setByteElement(term1024082, 22, (byte) -1);
        setByteElement(term1024082, 23, (byte) -1);
        setByteElement(term1024082, 24, (byte) -1);
        setByteElement(term1024082, 25, (byte) -1);
        setByteElement(term1024082, 26, (byte) -1);
        setByteElement(term1024082, 27, (byte) -1);
        setByteElement(term1024082, 28, (byte) -1);
        setByteElement(term1024082, 29, (byte) -1);
        setByteElement(term1024082, 30, (byte) -1);
        setByteElement(term1024082, 31, (byte) -1);
        setByteElement(term1024082, 32, (byte) -1);
        setByteElement(term1024082, 33, (byte) -1);
        setByteElement(term1024082, 34, (byte) -1);
        setByteElement(term1024082, 35, (byte) -1);
        setByteElement(term1024082, 36, (byte) -1);
        setByteElement(term1024082, 37, (byte) -1);
        setByteElement(term1024082, 38, (byte) -1);
        setByteElement(term1024082, 39, (byte) -1);
        setByteElement(term1024082, 40, (byte) -1);
        setByteElement(term1024082, 41, (byte) -1);
        setByteElement(term1024082, 42, (byte) -1);
        setByteElement(term1024082, 43, (byte) -1);
        setByteElement(term1024082, 44, (byte) -1);
        setByteElement(term1024082, 45, (byte) -1);
        setByteElement(term1024082, 46, (byte) -1);
        setByteElement(term1024082, 47, (byte) -1);
        setByteElement(term1024082, 49, (byte) 1);
        setByteElement(term1024082, 50, (byte) 2);
        setByteElement(term1024082, 51, (byte) 3);
        setByteElement(term1024082, 52, (byte) 4);
        setByteElement(term1024082, 53, (byte) 5);
        setByteElement(term1024082, 54, (byte) 6);
        setByteElement(term1024082, 55, (byte) 7);
        setByteElement(term1024082, 56, (byte) 8);
        setByteElement(term1024082, 57, (byte) 9);
        setByteElement(term1024082, 58, (byte) -1);
        setByteElement(term1024082, 59, (byte) -1);
        setByteElement(term1024082, 60, (byte) -1);
        setByteElement(term1024082, 61, (byte) -1);
        setByteElement(term1024082, 62, (byte) -1);
        setByteElement(term1024082, 63, (byte) -1);
        setByteElement(term1024082, 64, (byte) -1);
        setByteElement(term1024082, 65, (byte) 10);
        setByteElement(term1024082, 66, (byte) 11);
        setByteElement(term1024082, 67, (byte) 12);
        setByteElement(term1024082, 68, (byte) 13);
        setByteElement(term1024082, 69, (byte) 14);
        setByteElement(term1024082, 70, (byte) 15);
        setByteElement(term1024082, 71, (byte) 16);
        setByteElement(term1024082, 72, (byte) 17);
        setByteElement(term1024082, 73, (byte) 18);
        setByteElement(term1024082, 74, (byte) 19);
        setByteElement(term1024082, 75, (byte) 20);
        setByteElement(term1024082, 76, (byte) 21);
        setByteElement(term1024082, 77, (byte) 22);
        setByteElement(term1024082, 78, (byte) 23);
        setByteElement(term1024082, 79, (byte) 24);
        setByteElement(term1024082, 80, (byte) 25);
        setByteElement(term1024082, 81, (byte) 26);
        setByteElement(term1024082, 82, (byte) 27);
        setByteElement(term1024082, 83, (byte) 28);
        setByteElement(term1024082, 84, (byte) 29);
        setByteElement(term1024082, 85, (byte) 30);
        setByteElement(term1024082, 86, (byte) 31);
        setByteElement(term1024082, 87, (byte) 32);
        setField(term1024081, term1024081.getClass(), "decodeTable", term1024082);
        setIntField(term1024081, term1024081.getClass(), "encodeSize", 503);
        setByteElement(term1024083, 0, (byte) 48);
        setByteElement(term1024083, 1, (byte) 49);
        setByteElement(term1024083, 2, (byte) 50);
        setByteElement(term1024083, 3, (byte) 51);
        setByteElement(term1024083, 4, (byte) 52);
        setByteElement(term1024083, 5, (byte) 53);
        setByteElement(term1024083, 6, (byte) 54);
        setByteElement(term1024083, 7, (byte) 55);
        setByteElement(term1024083, 8, (byte) 56);
        setByteElement(term1024083, 9, (byte) 57);
        setByteElement(term1024083, 10, (byte) 65);
        setByteElement(term1024083, 11, (byte) 66);
        setByteElement(term1024083, 12, (byte) 67);
        setByteElement(term1024083, 13, (byte) 68);
        setByteElement(term1024083, 14, (byte) 69);
        setByteElement(term1024083, 15, (byte) 70);
        setByteElement(term1024083, 16, (byte) 71);
        setByteElement(term1024083, 17, (byte) 72);
        setByteElement(term1024083, 18, (byte) 73);
        setByteElement(term1024083, 19, (byte) 74);
        setByteElement(term1024083, 20, (byte) 75);
        setByteElement(term1024083, 21, (byte) 76);
        setByteElement(term1024083, 22, (byte) 77);
        setByteElement(term1024083, 23, (byte) 78);
        setByteElement(term1024083, 24, (byte) 79);
        setByteElement(term1024083, 25, (byte) 80);
        setByteElement(term1024083, 26, (byte) 81);
        setByteElement(term1024083, 27, (byte) 82);
        setByteElement(term1024083, 28, (byte) 83);
        setByteElement(term1024083, 29, (byte) 84);
        setByteElement(term1024083, 30, (byte) 85);
        setByteElement(term1024083, 31, (byte) 86);
        setField(term1024081, term1024081.getClass(), "encodeTable", term1024083);
        setByteElement(term1024084, 5, (byte) -128);
        setField(term1024081, term1024081.getClass(), "lineSeparator", term1024084);
        setByteField(term1024081, term1024081.getClass(), "PAD", (byte) 61);
        setByteField(term1024081, term1024081.getClass(), "pad", (byte) 61);
        setIntField(term1024081, term1024081.getClass(), "unencodedBlockSize", 5);
        setIntField(term1024081, term1024081.getClass(), "encodedBlockSize", 8);
        setIntField(term1024081, term1024081.getClass(), "lineLength", 0);
        setIntField(term1024081, term1024081.getClass(), "chunkSeparatorLength", 495);
        term1024085 = (byte[]) newByteArray(495);
        setByteElement(term1024085, 5, (byte) -128);
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
        args[1] = term965352;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1024081));
        assertTrue(recursiveEquals(term965352, term1024085));
    }

};


