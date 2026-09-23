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

public class Base32_init_104097797331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10437;
     Object term10698;
     Object term10702;

    public Base32_init_104097797331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10537 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term10537, term10537.getClass(), "PAD", (byte) 0);
        setIntField(term10537, term10537.getClass(), "unencodedBlockSize", 0);
        setIntField(term10537, term10537.getClass(), "encodedBlockSize", 0);
        term10437 = (byte[]) newByteArray(0);
        term10698 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term10699 = (byte[]) newByteArray(91);
        byte[] term10700 = (byte[]) newByteArray(32);
        byte[] term10701 = (byte[]) newByteArray(0);
        setIntField(term10698, term10698.getClass(), "decodeSize", 7);
        setByteElement(term10699, 0, (byte) -1);
        setByteElement(term10699, 1, (byte) -1);
        setByteElement(term10699, 2, (byte) -1);
        setByteElement(term10699, 3, (byte) -1);
        setByteElement(term10699, 4, (byte) -1);
        setByteElement(term10699, 5, (byte) -1);
        setByteElement(term10699, 6, (byte) -1);
        setByteElement(term10699, 7, (byte) -1);
        setByteElement(term10699, 8, (byte) -1);
        setByteElement(term10699, 9, (byte) -1);
        setByteElement(term10699, 10, (byte) -1);
        setByteElement(term10699, 11, (byte) -1);
        setByteElement(term10699, 12, (byte) -1);
        setByteElement(term10699, 13, (byte) -1);
        setByteElement(term10699, 14, (byte) -1);
        setByteElement(term10699, 15, (byte) -1);
        setByteElement(term10699, 16, (byte) -1);
        setByteElement(term10699, 17, (byte) -1);
        setByteElement(term10699, 18, (byte) -1);
        setByteElement(term10699, 19, (byte) -1);
        setByteElement(term10699, 20, (byte) -1);
        setByteElement(term10699, 21, (byte) -1);
        setByteElement(term10699, 22, (byte) -1);
        setByteElement(term10699, 23, (byte) -1);
        setByteElement(term10699, 24, (byte) -1);
        setByteElement(term10699, 25, (byte) -1);
        setByteElement(term10699, 26, (byte) -1);
        setByteElement(term10699, 27, (byte) -1);
        setByteElement(term10699, 28, (byte) -1);
        setByteElement(term10699, 29, (byte) -1);
        setByteElement(term10699, 30, (byte) -1);
        setByteElement(term10699, 31, (byte) -1);
        setByteElement(term10699, 32, (byte) -1);
        setByteElement(term10699, 33, (byte) -1);
        setByteElement(term10699, 34, (byte) -1);
        setByteElement(term10699, 35, (byte) -1);
        setByteElement(term10699, 36, (byte) -1);
        setByteElement(term10699, 37, (byte) -1);
        setByteElement(term10699, 38, (byte) -1);
        setByteElement(term10699, 39, (byte) -1);
        setByteElement(term10699, 40, (byte) -1);
        setByteElement(term10699, 41, (byte) -1);
        setByteElement(term10699, 42, (byte) -1);
        setByteElement(term10699, 43, (byte) -1);
        setByteElement(term10699, 44, (byte) -1);
        setByteElement(term10699, 45, (byte) -1);
        setByteElement(term10699, 46, (byte) -1);
        setByteElement(term10699, 47, (byte) -1);
        setByteElement(term10699, 48, (byte) -1);
        setByteElement(term10699, 49, (byte) -1);
        setByteElement(term10699, 50, (byte) 26);
        setByteElement(term10699, 51, (byte) 27);
        setByteElement(term10699, 52, (byte) 28);
        setByteElement(term10699, 53, (byte) 29);
        setByteElement(term10699, 54, (byte) 30);
        setByteElement(term10699, 55, (byte) 31);
        setByteElement(term10699, 56, (byte) -1);
        setByteElement(term10699, 57, (byte) -1);
        setByteElement(term10699, 58, (byte) -1);
        setByteElement(term10699, 59, (byte) -1);
        setByteElement(term10699, 60, (byte) -1);
        setByteElement(term10699, 61, (byte) -1);
        setByteElement(term10699, 62, (byte) -1);
        setByteElement(term10699, 63, (byte) -1);
        setByteElement(term10699, 64, (byte) -1);
        setByteElement(term10699, 66, (byte) 1);
        setByteElement(term10699, 67, (byte) 2);
        setByteElement(term10699, 68, (byte) 3);
        setByteElement(term10699, 69, (byte) 4);
        setByteElement(term10699, 70, (byte) 5);
        setByteElement(term10699, 71, (byte) 6);
        setByteElement(term10699, 72, (byte) 7);
        setByteElement(term10699, 73, (byte) 8);
        setByteElement(term10699, 74, (byte) 9);
        setByteElement(term10699, 75, (byte) 10);
        setByteElement(term10699, 76, (byte) 11);
        setByteElement(term10699, 77, (byte) 12);
        setByteElement(term10699, 78, (byte) 13);
        setByteElement(term10699, 79, (byte) 14);
        setByteElement(term10699, 80, (byte) 15);
        setByteElement(term10699, 81, (byte) 16);
        setByteElement(term10699, 82, (byte) 17);
        setByteElement(term10699, 83, (byte) 18);
        setByteElement(term10699, 84, (byte) 19);
        setByteElement(term10699, 85, (byte) 20);
        setByteElement(term10699, 86, (byte) 21);
        setByteElement(term10699, 87, (byte) 22);
        setByteElement(term10699, 88, (byte) 23);
        setByteElement(term10699, 89, (byte) 24);
        setByteElement(term10699, 90, (byte) 25);
        setField(term10698, term10698.getClass(), "decodeTable", term10699);
        setIntField(term10698, term10698.getClass(), "encodeSize", 8);
        setByteElement(term10700, 0, (byte) 65);
        setByteElement(term10700, 1, (byte) 66);
        setByteElement(term10700, 2, (byte) 67);
        setByteElement(term10700, 3, (byte) 68);
        setByteElement(term10700, 4, (byte) 69);
        setByteElement(term10700, 5, (byte) 70);
        setByteElement(term10700, 6, (byte) 71);
        setByteElement(term10700, 7, (byte) 72);
        setByteElement(term10700, 8, (byte) 73);
        setByteElement(term10700, 9, (byte) 74);
        setByteElement(term10700, 10, (byte) 75);
        setByteElement(term10700, 11, (byte) 76);
        setByteElement(term10700, 12, (byte) 77);
        setByteElement(term10700, 13, (byte) 78);
        setByteElement(term10700, 14, (byte) 79);
        setByteElement(term10700, 15, (byte) 80);
        setByteElement(term10700, 16, (byte) 81);
        setByteElement(term10700, 17, (byte) 82);
        setByteElement(term10700, 18, (byte) 83);
        setByteElement(term10700, 19, (byte) 84);
        setByteElement(term10700, 20, (byte) 85);
        setByteElement(term10700, 21, (byte) 86);
        setByteElement(term10700, 22, (byte) 87);
        setByteElement(term10700, 23, (byte) 88);
        setByteElement(term10700, 24, (byte) 89);
        setByteElement(term10700, 25, (byte) 90);
        setByteElement(term10700, 26, (byte) 50);
        setByteElement(term10700, 27, (byte) 51);
        setByteElement(term10700, 28, (byte) 52);
        setByteElement(term10700, 29, (byte) 53);
        setByteElement(term10700, 30, (byte) 54);
        setByteElement(term10700, 31, (byte) 55);
        setField(term10698, term10698.getClass(), "encodeTable", term10700);
        setField(term10698, term10698.getClass(), "lineSeparator", term10701);
        setByteField(term10698, term10698.getClass(), "PAD", (byte) 61);
        setByteField(term10698, term10698.getClass(), "pad", (byte) 61);
        setIntField(term10698, term10698.getClass(), "unencodedBlockSize", 5);
        setIntField(term10698, term10698.getClass(), "encodedBlockSize", 8);
        setIntField(term10698, term10698.getClass(), "lineLength", 0);
        setIntField(term10698, term10698.getClass(), "chunkSeparatorLength", 0);
        term10702 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 1;
        args[1] = term10437;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term10698));
        assertTrue(recursiveEquals(term10437, term10702));
    }

};


