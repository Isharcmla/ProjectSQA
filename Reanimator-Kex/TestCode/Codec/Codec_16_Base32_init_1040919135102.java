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

public class Base32_init_1040919135102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113912;

    public Base32_init_1040919135102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113188 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term113188, term113188.getClass(), "PAD", (byte) 0);
        setIntField(term113188, term113188.getClass(), "unencodedBlockSize", 0);
        setIntField(term113188, term113188.getClass(), "encodedBlockSize", 0);
        term113912 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term113913 = (byte[]) newByteArray(91);
        byte[] term113914 = (byte[]) newByteArray(32);
        byte[] term113915 = (byte[]) newByteArray(2);
        setIntField(term113912, term113912.getClass(), "decodeSize", 9);
        setByteElement(term113913, 0, (byte) -1);
        setByteElement(term113913, 1, (byte) -1);
        setByteElement(term113913, 2, (byte) -1);
        setByteElement(term113913, 3, (byte) -1);
        setByteElement(term113913, 4, (byte) -1);
        setByteElement(term113913, 5, (byte) -1);
        setByteElement(term113913, 6, (byte) -1);
        setByteElement(term113913, 7, (byte) -1);
        setByteElement(term113913, 8, (byte) -1);
        setByteElement(term113913, 9, (byte) -1);
        setByteElement(term113913, 10, (byte) -1);
        setByteElement(term113913, 11, (byte) -1);
        setByteElement(term113913, 12, (byte) -1);
        setByteElement(term113913, 13, (byte) -1);
        setByteElement(term113913, 14, (byte) -1);
        setByteElement(term113913, 15, (byte) -1);
        setByteElement(term113913, 16, (byte) -1);
        setByteElement(term113913, 17, (byte) -1);
        setByteElement(term113913, 18, (byte) -1);
        setByteElement(term113913, 19, (byte) -1);
        setByteElement(term113913, 20, (byte) -1);
        setByteElement(term113913, 21, (byte) -1);
        setByteElement(term113913, 22, (byte) -1);
        setByteElement(term113913, 23, (byte) -1);
        setByteElement(term113913, 24, (byte) -1);
        setByteElement(term113913, 25, (byte) -1);
        setByteElement(term113913, 26, (byte) -1);
        setByteElement(term113913, 27, (byte) -1);
        setByteElement(term113913, 28, (byte) -1);
        setByteElement(term113913, 29, (byte) -1);
        setByteElement(term113913, 30, (byte) -1);
        setByteElement(term113913, 31, (byte) -1);
        setByteElement(term113913, 32, (byte) -1);
        setByteElement(term113913, 33, (byte) -1);
        setByteElement(term113913, 34, (byte) -1);
        setByteElement(term113913, 35, (byte) -1);
        setByteElement(term113913, 36, (byte) -1);
        setByteElement(term113913, 37, (byte) -1);
        setByteElement(term113913, 38, (byte) -1);
        setByteElement(term113913, 39, (byte) -1);
        setByteElement(term113913, 40, (byte) -1);
        setByteElement(term113913, 41, (byte) -1);
        setByteElement(term113913, 42, (byte) -1);
        setByteElement(term113913, 43, (byte) -1);
        setByteElement(term113913, 44, (byte) -1);
        setByteElement(term113913, 45, (byte) -1);
        setByteElement(term113913, 46, (byte) -1);
        setByteElement(term113913, 47, (byte) -1);
        setByteElement(term113913, 48, (byte) -1);
        setByteElement(term113913, 49, (byte) -1);
        setByteElement(term113913, 50, (byte) 26);
        setByteElement(term113913, 51, (byte) 27);
        setByteElement(term113913, 52, (byte) 28);
        setByteElement(term113913, 53, (byte) 29);
        setByteElement(term113913, 54, (byte) 30);
        setByteElement(term113913, 55, (byte) 31);
        setByteElement(term113913, 56, (byte) -1);
        setByteElement(term113913, 57, (byte) -1);
        setByteElement(term113913, 58, (byte) -1);
        setByteElement(term113913, 59, (byte) -1);
        setByteElement(term113913, 60, (byte) -1);
        setByteElement(term113913, 61, (byte) -1);
        setByteElement(term113913, 62, (byte) -1);
        setByteElement(term113913, 63, (byte) -1);
        setByteElement(term113913, 64, (byte) -1);
        setByteElement(term113913, 66, (byte) 1);
        setByteElement(term113913, 67, (byte) 2);
        setByteElement(term113913, 68, (byte) 3);
        setByteElement(term113913, 69, (byte) 4);
        setByteElement(term113913, 70, (byte) 5);
        setByteElement(term113913, 71, (byte) 6);
        setByteElement(term113913, 72, (byte) 7);
        setByteElement(term113913, 73, (byte) 8);
        setByteElement(term113913, 74, (byte) 9);
        setByteElement(term113913, 75, (byte) 10);
        setByteElement(term113913, 76, (byte) 11);
        setByteElement(term113913, 77, (byte) 12);
        setByteElement(term113913, 78, (byte) 13);
        setByteElement(term113913, 79, (byte) 14);
        setByteElement(term113913, 80, (byte) 15);
        setByteElement(term113913, 81, (byte) 16);
        setByteElement(term113913, 82, (byte) 17);
        setByteElement(term113913, 83, (byte) 18);
        setByteElement(term113913, 84, (byte) 19);
        setByteElement(term113913, 85, (byte) 20);
        setByteElement(term113913, 86, (byte) 21);
        setByteElement(term113913, 87, (byte) 22);
        setByteElement(term113913, 88, (byte) 23);
        setByteElement(term113913, 89, (byte) 24);
        setByteElement(term113913, 90, (byte) 25);
        setField(term113912, term113912.getClass(), "decodeTable", term113913);
        setIntField(term113912, term113912.getClass(), "encodeSize", 10);
        setByteElement(term113914, 0, (byte) 65);
        setByteElement(term113914, 1, (byte) 66);
        setByteElement(term113914, 2, (byte) 67);
        setByteElement(term113914, 3, (byte) 68);
        setByteElement(term113914, 4, (byte) 69);
        setByteElement(term113914, 5, (byte) 70);
        setByteElement(term113914, 6, (byte) 71);
        setByteElement(term113914, 7, (byte) 72);
        setByteElement(term113914, 8, (byte) 73);
        setByteElement(term113914, 9, (byte) 74);
        setByteElement(term113914, 10, (byte) 75);
        setByteElement(term113914, 11, (byte) 76);
        setByteElement(term113914, 12, (byte) 77);
        setByteElement(term113914, 13, (byte) 78);
        setByteElement(term113914, 14, (byte) 79);
        setByteElement(term113914, 15, (byte) 80);
        setByteElement(term113914, 16, (byte) 81);
        setByteElement(term113914, 17, (byte) 82);
        setByteElement(term113914, 18, (byte) 83);
        setByteElement(term113914, 19, (byte) 84);
        setByteElement(term113914, 20, (byte) 85);
        setByteElement(term113914, 21, (byte) 86);
        setByteElement(term113914, 22, (byte) 87);
        setByteElement(term113914, 23, (byte) 88);
        setByteElement(term113914, 24, (byte) 89);
        setByteElement(term113914, 25, (byte) 90);
        setByteElement(term113914, 26, (byte) 50);
        setByteElement(term113914, 27, (byte) 51);
        setByteElement(term113914, 28, (byte) 52);
        setByteElement(term113914, 29, (byte) 53);
        setByteElement(term113914, 30, (byte) 54);
        setByteElement(term113914, 31, (byte) 55);
        setField(term113912, term113912.getClass(), "encodeTable", term113914);
        setByteElement(term113915, 0, (byte) 13);
        setByteElement(term113915, 1, (byte) 10);
        setField(term113912, term113912.getClass(), "lineSeparator", term113915);
        setByteField(term113912, term113912.getClass(), "PAD", (byte) 61);
        setByteField(term113912, term113912.getClass(), "pad", (byte) 61);
        setIntField(term113912, term113912.getClass(), "unencodedBlockSize", 5);
        setIntField(term113912, term113912.getClass(), "encodedBlockSize", 8);
        setIntField(term113912, term113912.getClass(), "lineLength", 0);
        setIntField(term113912, term113912.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term113912));
    }

};


