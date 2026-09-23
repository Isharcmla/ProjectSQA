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

public class Base32_init_1042801703297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524103;
     Object term524362;
     Object term524365;

    public Base32_init_1042801703297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term524211 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term524211, term524211.getClass(), "PAD", (byte) 0);
        setIntField(term524211, term524211.getClass(), "unencodedBlockSize", 0);
        setIntField(term524211, term524211.getClass(), "encodedBlockSize", 0);
        setIntField(term524211, term524211.getClass(), "lineLength", 0);
        setIntField(term524211, term524211.getClass(), "chunkSeparatorLength", 0);
        setByteField(term524211, term524211.getClass(), "pad", (byte) 0);
        term524103 = (byte[]) newByteArray(0);
        term524362 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term524363 = (byte[]) newByteArray(88);
        byte[] term524364 = (byte[]) newByteArray(32);
        setIntField(term524362, term524362.getClass(), "decodeSize", 7);
        setByteElement(term524363, 0, (byte) -1);
        setByteElement(term524363, 1, (byte) -1);
        setByteElement(term524363, 2, (byte) -1);
        setByteElement(term524363, 3, (byte) -1);
        setByteElement(term524363, 4, (byte) -1);
        setByteElement(term524363, 5, (byte) -1);
        setByteElement(term524363, 6, (byte) -1);
        setByteElement(term524363, 7, (byte) -1);
        setByteElement(term524363, 8, (byte) -1);
        setByteElement(term524363, 9, (byte) -1);
        setByteElement(term524363, 10, (byte) -1);
        setByteElement(term524363, 11, (byte) -1);
        setByteElement(term524363, 12, (byte) -1);
        setByteElement(term524363, 13, (byte) -1);
        setByteElement(term524363, 14, (byte) -1);
        setByteElement(term524363, 15, (byte) -1);
        setByteElement(term524363, 16, (byte) -1);
        setByteElement(term524363, 17, (byte) -1);
        setByteElement(term524363, 18, (byte) -1);
        setByteElement(term524363, 19, (byte) -1);
        setByteElement(term524363, 20, (byte) -1);
        setByteElement(term524363, 21, (byte) -1);
        setByteElement(term524363, 22, (byte) -1);
        setByteElement(term524363, 23, (byte) -1);
        setByteElement(term524363, 24, (byte) -1);
        setByteElement(term524363, 25, (byte) -1);
        setByteElement(term524363, 26, (byte) -1);
        setByteElement(term524363, 27, (byte) -1);
        setByteElement(term524363, 28, (byte) -1);
        setByteElement(term524363, 29, (byte) -1);
        setByteElement(term524363, 30, (byte) -1);
        setByteElement(term524363, 31, (byte) -1);
        setByteElement(term524363, 32, (byte) -1);
        setByteElement(term524363, 33, (byte) -1);
        setByteElement(term524363, 34, (byte) -1);
        setByteElement(term524363, 35, (byte) -1);
        setByteElement(term524363, 36, (byte) -1);
        setByteElement(term524363, 37, (byte) -1);
        setByteElement(term524363, 38, (byte) -1);
        setByteElement(term524363, 39, (byte) -1);
        setByteElement(term524363, 40, (byte) -1);
        setByteElement(term524363, 41, (byte) -1);
        setByteElement(term524363, 42, (byte) -1);
        setByteElement(term524363, 43, (byte) -1);
        setByteElement(term524363, 44, (byte) -1);
        setByteElement(term524363, 45, (byte) -1);
        setByteElement(term524363, 46, (byte) -1);
        setByteElement(term524363, 47, (byte) -1);
        setByteElement(term524363, 49, (byte) 1);
        setByteElement(term524363, 50, (byte) 2);
        setByteElement(term524363, 51, (byte) 3);
        setByteElement(term524363, 52, (byte) 4);
        setByteElement(term524363, 53, (byte) 5);
        setByteElement(term524363, 54, (byte) 6);
        setByteElement(term524363, 55, (byte) 7);
        setByteElement(term524363, 56, (byte) 8);
        setByteElement(term524363, 57, (byte) 9);
        setByteElement(term524363, 58, (byte) -1);
        setByteElement(term524363, 59, (byte) -1);
        setByteElement(term524363, 60, (byte) -1);
        setByteElement(term524363, 61, (byte) -1);
        setByteElement(term524363, 62, (byte) -1);
        setByteElement(term524363, 63, (byte) -1);
        setByteElement(term524363, 64, (byte) -1);
        setByteElement(term524363, 65, (byte) 10);
        setByteElement(term524363, 66, (byte) 11);
        setByteElement(term524363, 67, (byte) 12);
        setByteElement(term524363, 68, (byte) 13);
        setByteElement(term524363, 69, (byte) 14);
        setByteElement(term524363, 70, (byte) 15);
        setByteElement(term524363, 71, (byte) 16);
        setByteElement(term524363, 72, (byte) 17);
        setByteElement(term524363, 73, (byte) 18);
        setByteElement(term524363, 74, (byte) 19);
        setByteElement(term524363, 75, (byte) 20);
        setByteElement(term524363, 76, (byte) 21);
        setByteElement(term524363, 77, (byte) 22);
        setByteElement(term524363, 78, (byte) 23);
        setByteElement(term524363, 79, (byte) 24);
        setByteElement(term524363, 80, (byte) 25);
        setByteElement(term524363, 81, (byte) 26);
        setByteElement(term524363, 82, (byte) 27);
        setByteElement(term524363, 83, (byte) 28);
        setByteElement(term524363, 84, (byte) 29);
        setByteElement(term524363, 85, (byte) 30);
        setByteElement(term524363, 86, (byte) 31);
        setByteElement(term524363, 87, (byte) 32);
        setField(term524362, term524362.getClass(), "decodeTable", term524363);
        setIntField(term524362, term524362.getClass(), "encodeSize", 8);
        setByteElement(term524364, 0, (byte) 48);
        setByteElement(term524364, 1, (byte) 49);
        setByteElement(term524364, 2, (byte) 50);
        setByteElement(term524364, 3, (byte) 51);
        setByteElement(term524364, 4, (byte) 52);
        setByteElement(term524364, 5, (byte) 53);
        setByteElement(term524364, 6, (byte) 54);
        setByteElement(term524364, 7, (byte) 55);
        setByteElement(term524364, 8, (byte) 56);
        setByteElement(term524364, 9, (byte) 57);
        setByteElement(term524364, 10, (byte) 65);
        setByteElement(term524364, 11, (byte) 66);
        setByteElement(term524364, 12, (byte) 67);
        setByteElement(term524364, 13, (byte) 68);
        setByteElement(term524364, 14, (byte) 69);
        setByteElement(term524364, 15, (byte) 70);
        setByteElement(term524364, 16, (byte) 71);
        setByteElement(term524364, 17, (byte) 72);
        setByteElement(term524364, 18, (byte) 73);
        setByteElement(term524364, 19, (byte) 74);
        setByteElement(term524364, 20, (byte) 75);
        setByteElement(term524364, 21, (byte) 76);
        setByteElement(term524364, 22, (byte) 77);
        setByteElement(term524364, 23, (byte) 78);
        setByteElement(term524364, 24, (byte) 79);
        setByteElement(term524364, 25, (byte) 80);
        setByteElement(term524364, 26, (byte) 81);
        setByteElement(term524364, 27, (byte) 82);
        setByteElement(term524364, 28, (byte) 83);
        setByteElement(term524364, 29, (byte) 84);
        setByteElement(term524364, 30, (byte) 85);
        setByteElement(term524364, 31, (byte) 86);
        setField(term524362, term524362.getClass(), "encodeTable", term524364);
        setField(term524362, term524362.getClass(), "lineSeparator", null);
        setByteField(term524362, term524362.getClass(), "PAD", (byte) 61);
        setByteField(term524362, term524362.getClass(), "pad", (byte) 61);
        setIntField(term524362, term524362.getClass(), "unencodedBlockSize", 5);
        setIntField(term524362, term524362.getClass(), "encodedBlockSize", 8);
        setIntField(term524362, term524362.getClass(), "lineLength", 0);
        setIntField(term524362, term524362.getClass(), "chunkSeparatorLength", 0);
        term524365 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term524103;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term524362));
        assertTrue(recursiveEquals(term524103, term524365));
    }

};


