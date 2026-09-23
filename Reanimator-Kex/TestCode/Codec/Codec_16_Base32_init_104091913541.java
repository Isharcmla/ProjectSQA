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

public class Base32_init_104091913541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19874;

    public Base32_init_104091913541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19693 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term15937 = (byte[]) newByteArray(0);
        byte[] term16449 = (byte[]) newByteArray(0);
        setByteField(term19693, term19693.getClass(), "PAD", (byte) 0);
        setIntField(term19693, term19693.getClass(), "unencodedBlockSize", 0);
        setIntField(term19693, term19693.getClass(), "encodedBlockSize", 0);
        setIntField(term19693, term19693.getClass(), "lineLength", 0);
        setIntField(term19693, term19693.getClass(), "chunkSeparatorLength", 0);
        setByteField(term19693, term19693.getClass(), "pad", (byte) 0);
        setField(term19693, term19693.getClass(), "encodeTable", term15937);
        setField(term19693, term19693.getClass(), "decodeTable", term16449);
        setIntField(term19693, term19693.getClass(), "encodeSize", 0);
        setField(term19693, term19693.getClass(), "lineSeparator", null);
        setIntField(term19693, term19693.getClass(), "decodeSize", 0);
        term19874 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term19875 = (byte[]) newByteArray(91);
        byte[] term19876 = (byte[]) newByteArray(32);
        byte[] term19877 = (byte[]) newByteArray(2);
        setIntField(term19874, term19874.getClass(), "decodeSize", 9);
        setByteElement(term19875, 0, (byte) -1);
        setByteElement(term19875, 1, (byte) -1);
        setByteElement(term19875, 2, (byte) -1);
        setByteElement(term19875, 3, (byte) -1);
        setByteElement(term19875, 4, (byte) -1);
        setByteElement(term19875, 5, (byte) -1);
        setByteElement(term19875, 6, (byte) -1);
        setByteElement(term19875, 7, (byte) -1);
        setByteElement(term19875, 8, (byte) -1);
        setByteElement(term19875, 9, (byte) -1);
        setByteElement(term19875, 10, (byte) -1);
        setByteElement(term19875, 11, (byte) -1);
        setByteElement(term19875, 12, (byte) -1);
        setByteElement(term19875, 13, (byte) -1);
        setByteElement(term19875, 14, (byte) -1);
        setByteElement(term19875, 15, (byte) -1);
        setByteElement(term19875, 16, (byte) -1);
        setByteElement(term19875, 17, (byte) -1);
        setByteElement(term19875, 18, (byte) -1);
        setByteElement(term19875, 19, (byte) -1);
        setByteElement(term19875, 20, (byte) -1);
        setByteElement(term19875, 21, (byte) -1);
        setByteElement(term19875, 22, (byte) -1);
        setByteElement(term19875, 23, (byte) -1);
        setByteElement(term19875, 24, (byte) -1);
        setByteElement(term19875, 25, (byte) -1);
        setByteElement(term19875, 26, (byte) -1);
        setByteElement(term19875, 27, (byte) -1);
        setByteElement(term19875, 28, (byte) -1);
        setByteElement(term19875, 29, (byte) -1);
        setByteElement(term19875, 30, (byte) -1);
        setByteElement(term19875, 31, (byte) -1);
        setByteElement(term19875, 32, (byte) -1);
        setByteElement(term19875, 33, (byte) -1);
        setByteElement(term19875, 34, (byte) -1);
        setByteElement(term19875, 35, (byte) -1);
        setByteElement(term19875, 36, (byte) -1);
        setByteElement(term19875, 37, (byte) -1);
        setByteElement(term19875, 38, (byte) -1);
        setByteElement(term19875, 39, (byte) -1);
        setByteElement(term19875, 40, (byte) -1);
        setByteElement(term19875, 41, (byte) -1);
        setByteElement(term19875, 42, (byte) -1);
        setByteElement(term19875, 43, (byte) -1);
        setByteElement(term19875, 44, (byte) -1);
        setByteElement(term19875, 45, (byte) -1);
        setByteElement(term19875, 46, (byte) -1);
        setByteElement(term19875, 47, (byte) -1);
        setByteElement(term19875, 48, (byte) -1);
        setByteElement(term19875, 49, (byte) -1);
        setByteElement(term19875, 50, (byte) 26);
        setByteElement(term19875, 51, (byte) 27);
        setByteElement(term19875, 52, (byte) 28);
        setByteElement(term19875, 53, (byte) 29);
        setByteElement(term19875, 54, (byte) 30);
        setByteElement(term19875, 55, (byte) 31);
        setByteElement(term19875, 56, (byte) -1);
        setByteElement(term19875, 57, (byte) -1);
        setByteElement(term19875, 58, (byte) -1);
        setByteElement(term19875, 59, (byte) -1);
        setByteElement(term19875, 60, (byte) -1);
        setByteElement(term19875, 61, (byte) -1);
        setByteElement(term19875, 62, (byte) -1);
        setByteElement(term19875, 63, (byte) -1);
        setByteElement(term19875, 64, (byte) -1);
        setByteElement(term19875, 66, (byte) 1);
        setByteElement(term19875, 67, (byte) 2);
        setByteElement(term19875, 68, (byte) 3);
        setByteElement(term19875, 69, (byte) 4);
        setByteElement(term19875, 70, (byte) 5);
        setByteElement(term19875, 71, (byte) 6);
        setByteElement(term19875, 72, (byte) 7);
        setByteElement(term19875, 73, (byte) 8);
        setByteElement(term19875, 74, (byte) 9);
        setByteElement(term19875, 75, (byte) 10);
        setByteElement(term19875, 76, (byte) 11);
        setByteElement(term19875, 77, (byte) 12);
        setByteElement(term19875, 78, (byte) 13);
        setByteElement(term19875, 79, (byte) 14);
        setByteElement(term19875, 80, (byte) 15);
        setByteElement(term19875, 81, (byte) 16);
        setByteElement(term19875, 82, (byte) 17);
        setByteElement(term19875, 83, (byte) 18);
        setByteElement(term19875, 84, (byte) 19);
        setByteElement(term19875, 85, (byte) 20);
        setByteElement(term19875, 86, (byte) 21);
        setByteElement(term19875, 87, (byte) 22);
        setByteElement(term19875, 88, (byte) 23);
        setByteElement(term19875, 89, (byte) 24);
        setByteElement(term19875, 90, (byte) 25);
        setField(term19874, term19874.getClass(), "decodeTable", term19875);
        setIntField(term19874, term19874.getClass(), "encodeSize", 10);
        setByteElement(term19876, 0, (byte) 65);
        setByteElement(term19876, 1, (byte) 66);
        setByteElement(term19876, 2, (byte) 67);
        setByteElement(term19876, 3, (byte) 68);
        setByteElement(term19876, 4, (byte) 69);
        setByteElement(term19876, 5, (byte) 70);
        setByteElement(term19876, 6, (byte) 71);
        setByteElement(term19876, 7, (byte) 72);
        setByteElement(term19876, 8, (byte) 73);
        setByteElement(term19876, 9, (byte) 74);
        setByteElement(term19876, 10, (byte) 75);
        setByteElement(term19876, 11, (byte) 76);
        setByteElement(term19876, 12, (byte) 77);
        setByteElement(term19876, 13, (byte) 78);
        setByteElement(term19876, 14, (byte) 79);
        setByteElement(term19876, 15, (byte) 80);
        setByteElement(term19876, 16, (byte) 81);
        setByteElement(term19876, 17, (byte) 82);
        setByteElement(term19876, 18, (byte) 83);
        setByteElement(term19876, 19, (byte) 84);
        setByteElement(term19876, 20, (byte) 85);
        setByteElement(term19876, 21, (byte) 86);
        setByteElement(term19876, 22, (byte) 87);
        setByteElement(term19876, 23, (byte) 88);
        setByteElement(term19876, 24, (byte) 89);
        setByteElement(term19876, 25, (byte) 90);
        setByteElement(term19876, 26, (byte) 50);
        setByteElement(term19876, 27, (byte) 51);
        setByteElement(term19876, 28, (byte) 52);
        setByteElement(term19876, 29, (byte) 53);
        setByteElement(term19876, 30, (byte) 54);
        setByteElement(term19876, 31, (byte) 55);
        setField(term19874, term19874.getClass(), "encodeTable", term19876);
        setByteElement(term19877, 0, (byte) 13);
        setByteElement(term19877, 1, (byte) 10);
        setField(term19874, term19874.getClass(), "lineSeparator", term19877);
        setByteField(term19874, term19874.getClass(), "PAD", (byte) 61);
        setByteField(term19874, term19874.getClass(), "pad", (byte) 61);
        setIntField(term19874, term19874.getClass(), "unencodedBlockSize", 5);
        setIntField(term19874, term19874.getClass(), "encodedBlockSize", 8);
        setIntField(term19874, term19874.getClass(), "lineLength", 0);
        setIntField(term19874, term19874.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19874));
    }

};


