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

public class Base32_init_1042801703446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term932781;
     Object term941835;
     Object term941839;

    public Base32_init_1042801703446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term940715 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term940715, term940715.getClass(), "PAD", (byte) 0);
        setIntField(term940715, term940715.getClass(), "unencodedBlockSize", 0);
        setIntField(term940715, term940715.getClass(), "encodedBlockSize", 0);
        setIntField(term940715, term940715.getClass(), "lineLength", 0);
        setIntField(term940715, term940715.getClass(), "chunkSeparatorLength", 0);
        setByteField(term940715, term940715.getClass(), "pad", (byte) 0);
        setField(term940715, term940715.getClass(), "encodeTable", null);
        setField(term940715, term940715.getClass(), "decodeTable", null);
        setIntField(term940715, term940715.getClass(), "encodeSize", 0);
        setField(term940715, term940715.getClass(), "lineSeparator", null);
        setIntField(term940715, term940715.getClass(), "decodeSize", 0);
        term932781 = (byte[]) newByteArray(6);
        term941835 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term941836 = (byte[]) newByteArray(88);
        byte[] term941837 = (byte[]) newByteArray(32);
        byte[] term941838 = (byte[]) newByteArray(6);
        setIntField(term941835, term941835.getClass(), "decodeSize", 13);
        setByteElement(term941836, 0, (byte) -1);
        setByteElement(term941836, 1, (byte) -1);
        setByteElement(term941836, 2, (byte) -1);
        setByteElement(term941836, 3, (byte) -1);
        setByteElement(term941836, 4, (byte) -1);
        setByteElement(term941836, 5, (byte) -1);
        setByteElement(term941836, 6, (byte) -1);
        setByteElement(term941836, 7, (byte) -1);
        setByteElement(term941836, 8, (byte) -1);
        setByteElement(term941836, 9, (byte) -1);
        setByteElement(term941836, 10, (byte) -1);
        setByteElement(term941836, 11, (byte) -1);
        setByteElement(term941836, 12, (byte) -1);
        setByteElement(term941836, 13, (byte) -1);
        setByteElement(term941836, 14, (byte) -1);
        setByteElement(term941836, 15, (byte) -1);
        setByteElement(term941836, 16, (byte) -1);
        setByteElement(term941836, 17, (byte) -1);
        setByteElement(term941836, 18, (byte) -1);
        setByteElement(term941836, 19, (byte) -1);
        setByteElement(term941836, 20, (byte) -1);
        setByteElement(term941836, 21, (byte) -1);
        setByteElement(term941836, 22, (byte) -1);
        setByteElement(term941836, 23, (byte) -1);
        setByteElement(term941836, 24, (byte) -1);
        setByteElement(term941836, 25, (byte) -1);
        setByteElement(term941836, 26, (byte) -1);
        setByteElement(term941836, 27, (byte) -1);
        setByteElement(term941836, 28, (byte) -1);
        setByteElement(term941836, 29, (byte) -1);
        setByteElement(term941836, 30, (byte) -1);
        setByteElement(term941836, 31, (byte) -1);
        setByteElement(term941836, 32, (byte) -1);
        setByteElement(term941836, 33, (byte) -1);
        setByteElement(term941836, 34, (byte) -1);
        setByteElement(term941836, 35, (byte) -1);
        setByteElement(term941836, 36, (byte) -1);
        setByteElement(term941836, 37, (byte) -1);
        setByteElement(term941836, 38, (byte) -1);
        setByteElement(term941836, 39, (byte) -1);
        setByteElement(term941836, 40, (byte) -1);
        setByteElement(term941836, 41, (byte) -1);
        setByteElement(term941836, 42, (byte) -1);
        setByteElement(term941836, 43, (byte) -1);
        setByteElement(term941836, 44, (byte) -1);
        setByteElement(term941836, 45, (byte) -1);
        setByteElement(term941836, 46, (byte) -1);
        setByteElement(term941836, 47, (byte) -1);
        setByteElement(term941836, 49, (byte) 1);
        setByteElement(term941836, 50, (byte) 2);
        setByteElement(term941836, 51, (byte) 3);
        setByteElement(term941836, 52, (byte) 4);
        setByteElement(term941836, 53, (byte) 5);
        setByteElement(term941836, 54, (byte) 6);
        setByteElement(term941836, 55, (byte) 7);
        setByteElement(term941836, 56, (byte) 8);
        setByteElement(term941836, 57, (byte) 9);
        setByteElement(term941836, 58, (byte) -1);
        setByteElement(term941836, 59, (byte) -1);
        setByteElement(term941836, 60, (byte) -1);
        setByteElement(term941836, 61, (byte) -1);
        setByteElement(term941836, 62, (byte) -1);
        setByteElement(term941836, 63, (byte) -1);
        setByteElement(term941836, 64, (byte) -1);
        setByteElement(term941836, 65, (byte) 10);
        setByteElement(term941836, 66, (byte) 11);
        setByteElement(term941836, 67, (byte) 12);
        setByteElement(term941836, 68, (byte) 13);
        setByteElement(term941836, 69, (byte) 14);
        setByteElement(term941836, 70, (byte) 15);
        setByteElement(term941836, 71, (byte) 16);
        setByteElement(term941836, 72, (byte) 17);
        setByteElement(term941836, 73, (byte) 18);
        setByteElement(term941836, 74, (byte) 19);
        setByteElement(term941836, 75, (byte) 20);
        setByteElement(term941836, 76, (byte) 21);
        setByteElement(term941836, 77, (byte) 22);
        setByteElement(term941836, 78, (byte) 23);
        setByteElement(term941836, 79, (byte) 24);
        setByteElement(term941836, 80, (byte) 25);
        setByteElement(term941836, 81, (byte) 26);
        setByteElement(term941836, 82, (byte) 27);
        setByteElement(term941836, 83, (byte) 28);
        setByteElement(term941836, 84, (byte) 29);
        setByteElement(term941836, 85, (byte) 30);
        setByteElement(term941836, 86, (byte) 31);
        setByteElement(term941836, 87, (byte) 32);
        setField(term941835, term941835.getClass(), "decodeTable", term941836);
        setIntField(term941835, term941835.getClass(), "encodeSize", 14);
        setByteElement(term941837, 0, (byte) 48);
        setByteElement(term941837, 1, (byte) 49);
        setByteElement(term941837, 2, (byte) 50);
        setByteElement(term941837, 3, (byte) 51);
        setByteElement(term941837, 4, (byte) 52);
        setByteElement(term941837, 5, (byte) 53);
        setByteElement(term941837, 6, (byte) 54);
        setByteElement(term941837, 7, (byte) 55);
        setByteElement(term941837, 8, (byte) 56);
        setByteElement(term941837, 9, (byte) 57);
        setByteElement(term941837, 10, (byte) 65);
        setByteElement(term941837, 11, (byte) 66);
        setByteElement(term941837, 12, (byte) 67);
        setByteElement(term941837, 13, (byte) 68);
        setByteElement(term941837, 14, (byte) 69);
        setByteElement(term941837, 15, (byte) 70);
        setByteElement(term941837, 16, (byte) 71);
        setByteElement(term941837, 17, (byte) 72);
        setByteElement(term941837, 18, (byte) 73);
        setByteElement(term941837, 19, (byte) 74);
        setByteElement(term941837, 20, (byte) 75);
        setByteElement(term941837, 21, (byte) 76);
        setByteElement(term941837, 22, (byte) 77);
        setByteElement(term941837, 23, (byte) 78);
        setByteElement(term941837, 24, (byte) 79);
        setByteElement(term941837, 25, (byte) 80);
        setByteElement(term941837, 26, (byte) 81);
        setByteElement(term941837, 27, (byte) 82);
        setByteElement(term941837, 28, (byte) 83);
        setByteElement(term941837, 29, (byte) 84);
        setByteElement(term941837, 30, (byte) 85);
        setByteElement(term941837, 31, (byte) 86);
        setField(term941835, term941835.getClass(), "encodeTable", term941837);
        setField(term941835, term941835.getClass(), "lineSeparator", term941838);
        setByteField(term941835, term941835.getClass(), "PAD", (byte) 61);
        setByteField(term941835, term941835.getClass(), "pad", (byte) 61);
        setIntField(term941835, term941835.getClass(), "unencodedBlockSize", 5);
        setIntField(term941835, term941835.getClass(), "encodedBlockSize", 8);
        setIntField(term941835, term941835.getClass(), "lineLength", 0);
        setIntField(term941835, term941835.getClass(), "chunkSeparatorLength", 6);
        term941839 = (byte[]) newByteArray(6);
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
        args[1] = term932781;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term941835));
        assertTrue(recursiveEquals(term932781, term941839));
    }

};


