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

public class Base32_init_1040918143233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436153;

    public Base32_init_1040918143233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term436003 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term435889 = (byte[]) newByteArray(0);
        byte[] term435890 = (byte[]) newByteArray(0);
        byte[] term435888 = (byte[]) newByteArray(0);
        setByteField(term436003, term436003.getClass(), "PAD", (byte) 0);
        setIntField(term436003, term436003.getClass(), "unencodedBlockSize", 0);
        setIntField(term436003, term436003.getClass(), "encodedBlockSize", 0);
        setIntField(term436003, term436003.getClass(), "lineLength", 0);
        setIntField(term436003, term436003.getClass(), "chunkSeparatorLength", 0);
        setByteField(term436003, term436003.getClass(), "pad", (byte) 0);
        setField(term436003, term436003.getClass(), "encodeTable", term435889);
        setField(term436003, term436003.getClass(), "decodeTable", term435890);
        setIntField(term436003, term436003.getClass(), "encodeSize", 0);
        setField(term436003, term436003.getClass(), "lineSeparator", term435888);
        setIntField(term436003, term436003.getClass(), "decodeSize", 0);
        term436153 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term436154 = (byte[]) newByteArray(88);
        byte[] term436155 = (byte[]) newByteArray(32);
        setIntField(term436153, term436153.getClass(), "decodeSize", 7);
        setByteElement(term436154, 0, (byte) -1);
        setByteElement(term436154, 1, (byte) -1);
        setByteElement(term436154, 2, (byte) -1);
        setByteElement(term436154, 3, (byte) -1);
        setByteElement(term436154, 4, (byte) -1);
        setByteElement(term436154, 5, (byte) -1);
        setByteElement(term436154, 6, (byte) -1);
        setByteElement(term436154, 7, (byte) -1);
        setByteElement(term436154, 8, (byte) -1);
        setByteElement(term436154, 9, (byte) -1);
        setByteElement(term436154, 10, (byte) -1);
        setByteElement(term436154, 11, (byte) -1);
        setByteElement(term436154, 12, (byte) -1);
        setByteElement(term436154, 13, (byte) -1);
        setByteElement(term436154, 14, (byte) -1);
        setByteElement(term436154, 15, (byte) -1);
        setByteElement(term436154, 16, (byte) -1);
        setByteElement(term436154, 17, (byte) -1);
        setByteElement(term436154, 18, (byte) -1);
        setByteElement(term436154, 19, (byte) -1);
        setByteElement(term436154, 20, (byte) -1);
        setByteElement(term436154, 21, (byte) -1);
        setByteElement(term436154, 22, (byte) -1);
        setByteElement(term436154, 23, (byte) -1);
        setByteElement(term436154, 24, (byte) -1);
        setByteElement(term436154, 25, (byte) -1);
        setByteElement(term436154, 26, (byte) -1);
        setByteElement(term436154, 27, (byte) -1);
        setByteElement(term436154, 28, (byte) -1);
        setByteElement(term436154, 29, (byte) -1);
        setByteElement(term436154, 30, (byte) -1);
        setByteElement(term436154, 31, (byte) -1);
        setByteElement(term436154, 32, (byte) -1);
        setByteElement(term436154, 33, (byte) -1);
        setByteElement(term436154, 34, (byte) -1);
        setByteElement(term436154, 35, (byte) -1);
        setByteElement(term436154, 36, (byte) -1);
        setByteElement(term436154, 37, (byte) -1);
        setByteElement(term436154, 38, (byte) -1);
        setByteElement(term436154, 39, (byte) -1);
        setByteElement(term436154, 40, (byte) -1);
        setByteElement(term436154, 41, (byte) -1);
        setByteElement(term436154, 42, (byte) -1);
        setByteElement(term436154, 43, (byte) -1);
        setByteElement(term436154, 44, (byte) -1);
        setByteElement(term436154, 45, (byte) -1);
        setByteElement(term436154, 46, (byte) -1);
        setByteElement(term436154, 47, (byte) -1);
        setByteElement(term436154, 49, (byte) 1);
        setByteElement(term436154, 50, (byte) 2);
        setByteElement(term436154, 51, (byte) 3);
        setByteElement(term436154, 52, (byte) 4);
        setByteElement(term436154, 53, (byte) 5);
        setByteElement(term436154, 54, (byte) 6);
        setByteElement(term436154, 55, (byte) 7);
        setByteElement(term436154, 56, (byte) 8);
        setByteElement(term436154, 57, (byte) 9);
        setByteElement(term436154, 58, (byte) -1);
        setByteElement(term436154, 59, (byte) -1);
        setByteElement(term436154, 60, (byte) -1);
        setByteElement(term436154, 61, (byte) -1);
        setByteElement(term436154, 62, (byte) -1);
        setByteElement(term436154, 63, (byte) -1);
        setByteElement(term436154, 64, (byte) -1);
        setByteElement(term436154, 65, (byte) 10);
        setByteElement(term436154, 66, (byte) 11);
        setByteElement(term436154, 67, (byte) 12);
        setByteElement(term436154, 68, (byte) 13);
        setByteElement(term436154, 69, (byte) 14);
        setByteElement(term436154, 70, (byte) 15);
        setByteElement(term436154, 71, (byte) 16);
        setByteElement(term436154, 72, (byte) 17);
        setByteElement(term436154, 73, (byte) 18);
        setByteElement(term436154, 74, (byte) 19);
        setByteElement(term436154, 75, (byte) 20);
        setByteElement(term436154, 76, (byte) 21);
        setByteElement(term436154, 77, (byte) 22);
        setByteElement(term436154, 78, (byte) 23);
        setByteElement(term436154, 79, (byte) 24);
        setByteElement(term436154, 80, (byte) 25);
        setByteElement(term436154, 81, (byte) 26);
        setByteElement(term436154, 82, (byte) 27);
        setByteElement(term436154, 83, (byte) 28);
        setByteElement(term436154, 84, (byte) 29);
        setByteElement(term436154, 85, (byte) 30);
        setByteElement(term436154, 86, (byte) 31);
        setByteElement(term436154, 87, (byte) 32);
        setField(term436153, term436153.getClass(), "decodeTable", term436154);
        setIntField(term436153, term436153.getClass(), "encodeSize", 8);
        setByteElement(term436155, 0, (byte) 48);
        setByteElement(term436155, 1, (byte) 49);
        setByteElement(term436155, 2, (byte) 50);
        setByteElement(term436155, 3, (byte) 51);
        setByteElement(term436155, 4, (byte) 52);
        setByteElement(term436155, 5, (byte) 53);
        setByteElement(term436155, 6, (byte) 54);
        setByteElement(term436155, 7, (byte) 55);
        setByteElement(term436155, 8, (byte) 56);
        setByteElement(term436155, 9, (byte) 57);
        setByteElement(term436155, 10, (byte) 65);
        setByteElement(term436155, 11, (byte) 66);
        setByteElement(term436155, 12, (byte) 67);
        setByteElement(term436155, 13, (byte) 68);
        setByteElement(term436155, 14, (byte) 69);
        setByteElement(term436155, 15, (byte) 70);
        setByteElement(term436155, 16, (byte) 71);
        setByteElement(term436155, 17, (byte) 72);
        setByteElement(term436155, 18, (byte) 73);
        setByteElement(term436155, 19, (byte) 74);
        setByteElement(term436155, 20, (byte) 75);
        setByteElement(term436155, 21, (byte) 76);
        setByteElement(term436155, 22, (byte) 77);
        setByteElement(term436155, 23, (byte) 78);
        setByteElement(term436155, 24, (byte) 79);
        setByteElement(term436155, 25, (byte) 80);
        setByteElement(term436155, 26, (byte) 81);
        setByteElement(term436155, 27, (byte) 82);
        setByteElement(term436155, 28, (byte) 83);
        setByteElement(term436155, 29, (byte) 84);
        setByteElement(term436155, 30, (byte) 85);
        setByteElement(term436155, 31, (byte) 86);
        setField(term436153, term436153.getClass(), "encodeTable", term436155);
        setField(term436153, term436153.getClass(), "lineSeparator", null);
        setByteField(term436153, term436153.getClass(), "PAD", (byte) 61);
        setByteField(term436153, term436153.getClass(), "pad", (byte) 61);
        setIntField(term436153, term436153.getClass(), "unencodedBlockSize", 5);
        setIntField(term436153, term436153.getClass(), "encodedBlockSize", 8);
        setIntField(term436153, term436153.getClass(), "lineLength", 0);
        setIntField(term436153, term436153.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term436153));
    }

};


