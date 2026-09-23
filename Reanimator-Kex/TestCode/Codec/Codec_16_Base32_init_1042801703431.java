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

public class Base32_init_1042801703431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862871;
     Object term922813;
     Object term922817;

    public Base32_init_1042801703431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term875948 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term863864 = (byte[]) newByteArray(0);
        setByteField(term875948, term875948.getClass(), "PAD", (byte) 0);
        setIntField(term875948, term875948.getClass(), "unencodedBlockSize", 0);
        setIntField(term875948, term875948.getClass(), "encodedBlockSize", 0);
        setIntField(term875948, term875948.getClass(), "lineLength", 0);
        setIntField(term875948, term875948.getClass(), "chunkSeparatorLength", 0);
        setByteField(term875948, term875948.getClass(), "pad", (byte) -128);
        setField(term875948, term875948.getClass(), "encodeTable", null);
        setField(term875948, term875948.getClass(), "decodeTable", term863864);
        term862871 = (byte[]) newByteArray(495);
        term922813 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term922814 = (byte[]) newByteArray(88);
        byte[] term922815 = (byte[]) newByteArray(32);
        byte[] term922816 = (byte[]) newByteArray(495);
        setIntField(term922813, term922813.getClass(), "decodeSize", 502);
        setByteElement(term922814, 0, (byte) -1);
        setByteElement(term922814, 1, (byte) -1);
        setByteElement(term922814, 2, (byte) -1);
        setByteElement(term922814, 3, (byte) -1);
        setByteElement(term922814, 4, (byte) -1);
        setByteElement(term922814, 5, (byte) -1);
        setByteElement(term922814, 6, (byte) -1);
        setByteElement(term922814, 7, (byte) -1);
        setByteElement(term922814, 8, (byte) -1);
        setByteElement(term922814, 9, (byte) -1);
        setByteElement(term922814, 10, (byte) -1);
        setByteElement(term922814, 11, (byte) -1);
        setByteElement(term922814, 12, (byte) -1);
        setByteElement(term922814, 13, (byte) -1);
        setByteElement(term922814, 14, (byte) -1);
        setByteElement(term922814, 15, (byte) -1);
        setByteElement(term922814, 16, (byte) -1);
        setByteElement(term922814, 17, (byte) -1);
        setByteElement(term922814, 18, (byte) -1);
        setByteElement(term922814, 19, (byte) -1);
        setByteElement(term922814, 20, (byte) -1);
        setByteElement(term922814, 21, (byte) -1);
        setByteElement(term922814, 22, (byte) -1);
        setByteElement(term922814, 23, (byte) -1);
        setByteElement(term922814, 24, (byte) -1);
        setByteElement(term922814, 25, (byte) -1);
        setByteElement(term922814, 26, (byte) -1);
        setByteElement(term922814, 27, (byte) -1);
        setByteElement(term922814, 28, (byte) -1);
        setByteElement(term922814, 29, (byte) -1);
        setByteElement(term922814, 30, (byte) -1);
        setByteElement(term922814, 31, (byte) -1);
        setByteElement(term922814, 32, (byte) -1);
        setByteElement(term922814, 33, (byte) -1);
        setByteElement(term922814, 34, (byte) -1);
        setByteElement(term922814, 35, (byte) -1);
        setByteElement(term922814, 36, (byte) -1);
        setByteElement(term922814, 37, (byte) -1);
        setByteElement(term922814, 38, (byte) -1);
        setByteElement(term922814, 39, (byte) -1);
        setByteElement(term922814, 40, (byte) -1);
        setByteElement(term922814, 41, (byte) -1);
        setByteElement(term922814, 42, (byte) -1);
        setByteElement(term922814, 43, (byte) -1);
        setByteElement(term922814, 44, (byte) -1);
        setByteElement(term922814, 45, (byte) -1);
        setByteElement(term922814, 46, (byte) -1);
        setByteElement(term922814, 47, (byte) -1);
        setByteElement(term922814, 49, (byte) 1);
        setByteElement(term922814, 50, (byte) 2);
        setByteElement(term922814, 51, (byte) 3);
        setByteElement(term922814, 52, (byte) 4);
        setByteElement(term922814, 53, (byte) 5);
        setByteElement(term922814, 54, (byte) 6);
        setByteElement(term922814, 55, (byte) 7);
        setByteElement(term922814, 56, (byte) 8);
        setByteElement(term922814, 57, (byte) 9);
        setByteElement(term922814, 58, (byte) -1);
        setByteElement(term922814, 59, (byte) -1);
        setByteElement(term922814, 60, (byte) -1);
        setByteElement(term922814, 61, (byte) -1);
        setByteElement(term922814, 62, (byte) -1);
        setByteElement(term922814, 63, (byte) -1);
        setByteElement(term922814, 64, (byte) -1);
        setByteElement(term922814, 65, (byte) 10);
        setByteElement(term922814, 66, (byte) 11);
        setByteElement(term922814, 67, (byte) 12);
        setByteElement(term922814, 68, (byte) 13);
        setByteElement(term922814, 69, (byte) 14);
        setByteElement(term922814, 70, (byte) 15);
        setByteElement(term922814, 71, (byte) 16);
        setByteElement(term922814, 72, (byte) 17);
        setByteElement(term922814, 73, (byte) 18);
        setByteElement(term922814, 74, (byte) 19);
        setByteElement(term922814, 75, (byte) 20);
        setByteElement(term922814, 76, (byte) 21);
        setByteElement(term922814, 77, (byte) 22);
        setByteElement(term922814, 78, (byte) 23);
        setByteElement(term922814, 79, (byte) 24);
        setByteElement(term922814, 80, (byte) 25);
        setByteElement(term922814, 81, (byte) 26);
        setByteElement(term922814, 82, (byte) 27);
        setByteElement(term922814, 83, (byte) 28);
        setByteElement(term922814, 84, (byte) 29);
        setByteElement(term922814, 85, (byte) 30);
        setByteElement(term922814, 86, (byte) 31);
        setByteElement(term922814, 87, (byte) 32);
        setField(term922813, term922813.getClass(), "decodeTable", term922814);
        setIntField(term922813, term922813.getClass(), "encodeSize", 503);
        setByteElement(term922815, 0, (byte) 48);
        setByteElement(term922815, 1, (byte) 49);
        setByteElement(term922815, 2, (byte) 50);
        setByteElement(term922815, 3, (byte) 51);
        setByteElement(term922815, 4, (byte) 52);
        setByteElement(term922815, 5, (byte) 53);
        setByteElement(term922815, 6, (byte) 54);
        setByteElement(term922815, 7, (byte) 55);
        setByteElement(term922815, 8, (byte) 56);
        setByteElement(term922815, 9, (byte) 57);
        setByteElement(term922815, 10, (byte) 65);
        setByteElement(term922815, 11, (byte) 66);
        setByteElement(term922815, 12, (byte) 67);
        setByteElement(term922815, 13, (byte) 68);
        setByteElement(term922815, 14, (byte) 69);
        setByteElement(term922815, 15, (byte) 70);
        setByteElement(term922815, 16, (byte) 71);
        setByteElement(term922815, 17, (byte) 72);
        setByteElement(term922815, 18, (byte) 73);
        setByteElement(term922815, 19, (byte) 74);
        setByteElement(term922815, 20, (byte) 75);
        setByteElement(term922815, 21, (byte) 76);
        setByteElement(term922815, 22, (byte) 77);
        setByteElement(term922815, 23, (byte) 78);
        setByteElement(term922815, 24, (byte) 79);
        setByteElement(term922815, 25, (byte) 80);
        setByteElement(term922815, 26, (byte) 81);
        setByteElement(term922815, 27, (byte) 82);
        setByteElement(term922815, 28, (byte) 83);
        setByteElement(term922815, 29, (byte) 84);
        setByteElement(term922815, 30, (byte) 85);
        setByteElement(term922815, 31, (byte) 86);
        setField(term922813, term922813.getClass(), "encodeTable", term922815);
        setField(term922813, term922813.getClass(), "lineSeparator", term922816);
        setByteField(term922813, term922813.getClass(), "PAD", (byte) 61);
        setByteField(term922813, term922813.getClass(), "pad", (byte) 61);
        setIntField(term922813, term922813.getClass(), "unencodedBlockSize", 5);
        setIntField(term922813, term922813.getClass(), "encodedBlockSize", 8);
        setIntField(term922813, term922813.getClass(), "lineLength", 0);
        setIntField(term922813, term922813.getClass(), "chunkSeparatorLength", 495);
        term922817 = (byte[]) newByteArray(495);
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
        args[1] = term862871;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term922813));
        assertTrue(recursiveEquals(term862871, term922817));
    }

};


