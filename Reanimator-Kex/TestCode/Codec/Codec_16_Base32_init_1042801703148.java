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

public class Base32_init_1042801703148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238593;
     Object term255838;
     Object term255842;

    public Base32_init_1042801703148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term248227 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term248227, term248227.getClass(), "PAD", (byte) -128);
        setIntField(term248227, term248227.getClass(), "unencodedBlockSize", 0);
        setIntField(term248227, term248227.getClass(), "encodedBlockSize", 0);
        setIntField(term248227, term248227.getClass(), "lineLength", 0);
        setIntField(term248227, term248227.getClass(), "chunkSeparatorLength", 0);
        setByteField(term248227, term248227.getClass(), "pad", (byte) -128);
        setField(term248227, term248227.getClass(), "encodeTable", null);
        setField(term248227, term248227.getClass(), "decodeTable", null);
        term238593 = (byte[]) newByteArray(9);
        term255838 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term255839 = (byte[]) newByteArray(88);
        byte[] term255840 = (byte[]) newByteArray(32);
        byte[] term255841 = (byte[]) newByteArray(9);
        setIntField(term255838, term255838.getClass(), "decodeSize", 16);
        setByteElement(term255839, 0, (byte) -1);
        setByteElement(term255839, 1, (byte) -1);
        setByteElement(term255839, 2, (byte) -1);
        setByteElement(term255839, 3, (byte) -1);
        setByteElement(term255839, 4, (byte) -1);
        setByteElement(term255839, 5, (byte) -1);
        setByteElement(term255839, 6, (byte) -1);
        setByteElement(term255839, 7, (byte) -1);
        setByteElement(term255839, 8, (byte) -1);
        setByteElement(term255839, 9, (byte) -1);
        setByteElement(term255839, 10, (byte) -1);
        setByteElement(term255839, 11, (byte) -1);
        setByteElement(term255839, 12, (byte) -1);
        setByteElement(term255839, 13, (byte) -1);
        setByteElement(term255839, 14, (byte) -1);
        setByteElement(term255839, 15, (byte) -1);
        setByteElement(term255839, 16, (byte) -1);
        setByteElement(term255839, 17, (byte) -1);
        setByteElement(term255839, 18, (byte) -1);
        setByteElement(term255839, 19, (byte) -1);
        setByteElement(term255839, 20, (byte) -1);
        setByteElement(term255839, 21, (byte) -1);
        setByteElement(term255839, 22, (byte) -1);
        setByteElement(term255839, 23, (byte) -1);
        setByteElement(term255839, 24, (byte) -1);
        setByteElement(term255839, 25, (byte) -1);
        setByteElement(term255839, 26, (byte) -1);
        setByteElement(term255839, 27, (byte) -1);
        setByteElement(term255839, 28, (byte) -1);
        setByteElement(term255839, 29, (byte) -1);
        setByteElement(term255839, 30, (byte) -1);
        setByteElement(term255839, 31, (byte) -1);
        setByteElement(term255839, 32, (byte) -1);
        setByteElement(term255839, 33, (byte) -1);
        setByteElement(term255839, 34, (byte) -1);
        setByteElement(term255839, 35, (byte) -1);
        setByteElement(term255839, 36, (byte) -1);
        setByteElement(term255839, 37, (byte) -1);
        setByteElement(term255839, 38, (byte) -1);
        setByteElement(term255839, 39, (byte) -1);
        setByteElement(term255839, 40, (byte) -1);
        setByteElement(term255839, 41, (byte) -1);
        setByteElement(term255839, 42, (byte) -1);
        setByteElement(term255839, 43, (byte) -1);
        setByteElement(term255839, 44, (byte) -1);
        setByteElement(term255839, 45, (byte) -1);
        setByteElement(term255839, 46, (byte) -1);
        setByteElement(term255839, 47, (byte) -1);
        setByteElement(term255839, 49, (byte) 1);
        setByteElement(term255839, 50, (byte) 2);
        setByteElement(term255839, 51, (byte) 3);
        setByteElement(term255839, 52, (byte) 4);
        setByteElement(term255839, 53, (byte) 5);
        setByteElement(term255839, 54, (byte) 6);
        setByteElement(term255839, 55, (byte) 7);
        setByteElement(term255839, 56, (byte) 8);
        setByteElement(term255839, 57, (byte) 9);
        setByteElement(term255839, 58, (byte) -1);
        setByteElement(term255839, 59, (byte) -1);
        setByteElement(term255839, 60, (byte) -1);
        setByteElement(term255839, 61, (byte) -1);
        setByteElement(term255839, 62, (byte) -1);
        setByteElement(term255839, 63, (byte) -1);
        setByteElement(term255839, 64, (byte) -1);
        setByteElement(term255839, 65, (byte) 10);
        setByteElement(term255839, 66, (byte) 11);
        setByteElement(term255839, 67, (byte) 12);
        setByteElement(term255839, 68, (byte) 13);
        setByteElement(term255839, 69, (byte) 14);
        setByteElement(term255839, 70, (byte) 15);
        setByteElement(term255839, 71, (byte) 16);
        setByteElement(term255839, 72, (byte) 17);
        setByteElement(term255839, 73, (byte) 18);
        setByteElement(term255839, 74, (byte) 19);
        setByteElement(term255839, 75, (byte) 20);
        setByteElement(term255839, 76, (byte) 21);
        setByteElement(term255839, 77, (byte) 22);
        setByteElement(term255839, 78, (byte) 23);
        setByteElement(term255839, 79, (byte) 24);
        setByteElement(term255839, 80, (byte) 25);
        setByteElement(term255839, 81, (byte) 26);
        setByteElement(term255839, 82, (byte) 27);
        setByteElement(term255839, 83, (byte) 28);
        setByteElement(term255839, 84, (byte) 29);
        setByteElement(term255839, 85, (byte) 30);
        setByteElement(term255839, 86, (byte) 31);
        setByteElement(term255839, 87, (byte) 32);
        setField(term255838, term255838.getClass(), "decodeTable", term255839);
        setIntField(term255838, term255838.getClass(), "encodeSize", 17);
        setByteElement(term255840, 0, (byte) 48);
        setByteElement(term255840, 1, (byte) 49);
        setByteElement(term255840, 2, (byte) 50);
        setByteElement(term255840, 3, (byte) 51);
        setByteElement(term255840, 4, (byte) 52);
        setByteElement(term255840, 5, (byte) 53);
        setByteElement(term255840, 6, (byte) 54);
        setByteElement(term255840, 7, (byte) 55);
        setByteElement(term255840, 8, (byte) 56);
        setByteElement(term255840, 9, (byte) 57);
        setByteElement(term255840, 10, (byte) 65);
        setByteElement(term255840, 11, (byte) 66);
        setByteElement(term255840, 12, (byte) 67);
        setByteElement(term255840, 13, (byte) 68);
        setByteElement(term255840, 14, (byte) 69);
        setByteElement(term255840, 15, (byte) 70);
        setByteElement(term255840, 16, (byte) 71);
        setByteElement(term255840, 17, (byte) 72);
        setByteElement(term255840, 18, (byte) 73);
        setByteElement(term255840, 19, (byte) 74);
        setByteElement(term255840, 20, (byte) 75);
        setByteElement(term255840, 21, (byte) 76);
        setByteElement(term255840, 22, (byte) 77);
        setByteElement(term255840, 23, (byte) 78);
        setByteElement(term255840, 24, (byte) 79);
        setByteElement(term255840, 25, (byte) 80);
        setByteElement(term255840, 26, (byte) 81);
        setByteElement(term255840, 27, (byte) 82);
        setByteElement(term255840, 28, (byte) 83);
        setByteElement(term255840, 29, (byte) 84);
        setByteElement(term255840, 30, (byte) 85);
        setByteElement(term255840, 31, (byte) 86);
        setField(term255838, term255838.getClass(), "encodeTable", term255840);
        setField(term255838, term255838.getClass(), "lineSeparator", term255841);
        setByteField(term255838, term255838.getClass(), "PAD", (byte) 61);
        setByteField(term255838, term255838.getClass(), "pad", (byte) 61);
        setIntField(term255838, term255838.getClass(), "unencodedBlockSize", 5);
        setIntField(term255838, term255838.getClass(), "encodedBlockSize", 8);
        setIntField(term255838, term255838.getClass(), "lineLength", 0);
        setIntField(term255838, term255838.getClass(), "chunkSeparatorLength", 9);
        term255842 = (byte[]) newByteArray(9);
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
        args[1] = term238593;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term255838));
        assertTrue(recursiveEquals(term238593, term255842));
    }

};


