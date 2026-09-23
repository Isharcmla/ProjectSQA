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

public class Base32_init_104280170391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81335;
     Object term93517;
     Object term93521;

    public Base32_init_104280170391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term92930 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term81844 = (byte[]) newByteArray(0);
        setByteField(term92930, term92930.getClass(), "PAD", (byte) 0);
        setIntField(term92930, term92930.getClass(), "unencodedBlockSize", 0);
        setIntField(term92930, term92930.getClass(), "encodedBlockSize", 0);
        setIntField(term92930, term92930.getClass(), "lineLength", 0);
        setIntField(term92930, term92930.getClass(), "chunkSeparatorLength", 0);
        setByteField(term92930, term92930.getClass(), "pad", (byte) -128);
        setField(term92930, term92930.getClass(), "encodeTable", null);
        setField(term92930, term92930.getClass(), "decodeTable", term81844);
        term81335 = (byte[]) newByteArray(11);
        term93517 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term93518 = (byte[]) newByteArray(88);
        byte[] term93519 = (byte[]) newByteArray(32);
        byte[] term93520 = (byte[]) newByteArray(11);
        setIntField(term93517, term93517.getClass(), "decodeSize", 18);
        setByteElement(term93518, 0, (byte) -1);
        setByteElement(term93518, 1, (byte) -1);
        setByteElement(term93518, 2, (byte) -1);
        setByteElement(term93518, 3, (byte) -1);
        setByteElement(term93518, 4, (byte) -1);
        setByteElement(term93518, 5, (byte) -1);
        setByteElement(term93518, 6, (byte) -1);
        setByteElement(term93518, 7, (byte) -1);
        setByteElement(term93518, 8, (byte) -1);
        setByteElement(term93518, 9, (byte) -1);
        setByteElement(term93518, 10, (byte) -1);
        setByteElement(term93518, 11, (byte) -1);
        setByteElement(term93518, 12, (byte) -1);
        setByteElement(term93518, 13, (byte) -1);
        setByteElement(term93518, 14, (byte) -1);
        setByteElement(term93518, 15, (byte) -1);
        setByteElement(term93518, 16, (byte) -1);
        setByteElement(term93518, 17, (byte) -1);
        setByteElement(term93518, 18, (byte) -1);
        setByteElement(term93518, 19, (byte) -1);
        setByteElement(term93518, 20, (byte) -1);
        setByteElement(term93518, 21, (byte) -1);
        setByteElement(term93518, 22, (byte) -1);
        setByteElement(term93518, 23, (byte) -1);
        setByteElement(term93518, 24, (byte) -1);
        setByteElement(term93518, 25, (byte) -1);
        setByteElement(term93518, 26, (byte) -1);
        setByteElement(term93518, 27, (byte) -1);
        setByteElement(term93518, 28, (byte) -1);
        setByteElement(term93518, 29, (byte) -1);
        setByteElement(term93518, 30, (byte) -1);
        setByteElement(term93518, 31, (byte) -1);
        setByteElement(term93518, 32, (byte) -1);
        setByteElement(term93518, 33, (byte) -1);
        setByteElement(term93518, 34, (byte) -1);
        setByteElement(term93518, 35, (byte) -1);
        setByteElement(term93518, 36, (byte) -1);
        setByteElement(term93518, 37, (byte) -1);
        setByteElement(term93518, 38, (byte) -1);
        setByteElement(term93518, 39, (byte) -1);
        setByteElement(term93518, 40, (byte) -1);
        setByteElement(term93518, 41, (byte) -1);
        setByteElement(term93518, 42, (byte) -1);
        setByteElement(term93518, 43, (byte) -1);
        setByteElement(term93518, 44, (byte) -1);
        setByteElement(term93518, 45, (byte) -1);
        setByteElement(term93518, 46, (byte) -1);
        setByteElement(term93518, 47, (byte) -1);
        setByteElement(term93518, 49, (byte) 1);
        setByteElement(term93518, 50, (byte) 2);
        setByteElement(term93518, 51, (byte) 3);
        setByteElement(term93518, 52, (byte) 4);
        setByteElement(term93518, 53, (byte) 5);
        setByteElement(term93518, 54, (byte) 6);
        setByteElement(term93518, 55, (byte) 7);
        setByteElement(term93518, 56, (byte) 8);
        setByteElement(term93518, 57, (byte) 9);
        setByteElement(term93518, 58, (byte) -1);
        setByteElement(term93518, 59, (byte) -1);
        setByteElement(term93518, 60, (byte) -1);
        setByteElement(term93518, 61, (byte) -1);
        setByteElement(term93518, 62, (byte) -1);
        setByteElement(term93518, 63, (byte) -1);
        setByteElement(term93518, 64, (byte) -1);
        setByteElement(term93518, 65, (byte) 10);
        setByteElement(term93518, 66, (byte) 11);
        setByteElement(term93518, 67, (byte) 12);
        setByteElement(term93518, 68, (byte) 13);
        setByteElement(term93518, 69, (byte) 14);
        setByteElement(term93518, 70, (byte) 15);
        setByteElement(term93518, 71, (byte) 16);
        setByteElement(term93518, 72, (byte) 17);
        setByteElement(term93518, 73, (byte) 18);
        setByteElement(term93518, 74, (byte) 19);
        setByteElement(term93518, 75, (byte) 20);
        setByteElement(term93518, 76, (byte) 21);
        setByteElement(term93518, 77, (byte) 22);
        setByteElement(term93518, 78, (byte) 23);
        setByteElement(term93518, 79, (byte) 24);
        setByteElement(term93518, 80, (byte) 25);
        setByteElement(term93518, 81, (byte) 26);
        setByteElement(term93518, 82, (byte) 27);
        setByteElement(term93518, 83, (byte) 28);
        setByteElement(term93518, 84, (byte) 29);
        setByteElement(term93518, 85, (byte) 30);
        setByteElement(term93518, 86, (byte) 31);
        setByteElement(term93518, 87, (byte) 32);
        setField(term93517, term93517.getClass(), "decodeTable", term93518);
        setIntField(term93517, term93517.getClass(), "encodeSize", 19);
        setByteElement(term93519, 0, (byte) 48);
        setByteElement(term93519, 1, (byte) 49);
        setByteElement(term93519, 2, (byte) 50);
        setByteElement(term93519, 3, (byte) 51);
        setByteElement(term93519, 4, (byte) 52);
        setByteElement(term93519, 5, (byte) 53);
        setByteElement(term93519, 6, (byte) 54);
        setByteElement(term93519, 7, (byte) 55);
        setByteElement(term93519, 8, (byte) 56);
        setByteElement(term93519, 9, (byte) 57);
        setByteElement(term93519, 10, (byte) 65);
        setByteElement(term93519, 11, (byte) 66);
        setByteElement(term93519, 12, (byte) 67);
        setByteElement(term93519, 13, (byte) 68);
        setByteElement(term93519, 14, (byte) 69);
        setByteElement(term93519, 15, (byte) 70);
        setByteElement(term93519, 16, (byte) 71);
        setByteElement(term93519, 17, (byte) 72);
        setByteElement(term93519, 18, (byte) 73);
        setByteElement(term93519, 19, (byte) 74);
        setByteElement(term93519, 20, (byte) 75);
        setByteElement(term93519, 21, (byte) 76);
        setByteElement(term93519, 22, (byte) 77);
        setByteElement(term93519, 23, (byte) 78);
        setByteElement(term93519, 24, (byte) 79);
        setByteElement(term93519, 25, (byte) 80);
        setByteElement(term93519, 26, (byte) 81);
        setByteElement(term93519, 27, (byte) 82);
        setByteElement(term93519, 28, (byte) 83);
        setByteElement(term93519, 29, (byte) 84);
        setByteElement(term93519, 30, (byte) 85);
        setByteElement(term93519, 31, (byte) 86);
        setField(term93517, term93517.getClass(), "encodeTable", term93519);
        setField(term93517, term93517.getClass(), "lineSeparator", term93520);
        setByteField(term93517, term93517.getClass(), "PAD", (byte) 61);
        setByteField(term93517, term93517.getClass(), "pad", (byte) 61);
        setIntField(term93517, term93517.getClass(), "unencodedBlockSize", 5);
        setIntField(term93517, term93517.getClass(), "encodedBlockSize", 8);
        setIntField(term93517, term93517.getClass(), "lineLength", 0);
        setIntField(term93517, term93517.getClass(), "chunkSeparatorLength", 11);
        term93521 = (byte[]) newByteArray(11);
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
        args[1] = term81335;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term93517));
        assertTrue(recursiveEquals(term81335, term93521));
    }

};


