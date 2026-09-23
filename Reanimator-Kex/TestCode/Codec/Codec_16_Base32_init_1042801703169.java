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

public class Base32_init_1042801703169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323193;
     Object term334056;
     Object term334060;

    public Base32_init_1042801703169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term333788 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term323701 = (byte[]) newByteArray(0);
        setByteField(term333788, term333788.getClass(), "PAD", (byte) 0);
        setIntField(term333788, term333788.getClass(), "unencodedBlockSize", 0);
        setIntField(term333788, term333788.getClass(), "encodedBlockSize", 0);
        setIntField(term333788, term333788.getClass(), "lineLength", 0);
        setIntField(term333788, term333788.getClass(), "chunkSeparatorLength", 0);
        setByteField(term333788, term333788.getClass(), "pad", (byte) -128);
        setField(term333788, term333788.getClass(), "encodeTable", null);
        setField(term333788, term333788.getClass(), "decodeTable", term323701);
        term323193 = (byte[]) newByteArray(10);
        term334056 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term334057 = (byte[]) newByteArray(88);
        byte[] term334058 = (byte[]) newByteArray(32);
        byte[] term334059 = (byte[]) newByteArray(10);
        setIntField(term334056, term334056.getClass(), "decodeSize", 17);
        setByteElement(term334057, 0, (byte) -1);
        setByteElement(term334057, 1, (byte) -1);
        setByteElement(term334057, 2, (byte) -1);
        setByteElement(term334057, 3, (byte) -1);
        setByteElement(term334057, 4, (byte) -1);
        setByteElement(term334057, 5, (byte) -1);
        setByteElement(term334057, 6, (byte) -1);
        setByteElement(term334057, 7, (byte) -1);
        setByteElement(term334057, 8, (byte) -1);
        setByteElement(term334057, 9, (byte) -1);
        setByteElement(term334057, 10, (byte) -1);
        setByteElement(term334057, 11, (byte) -1);
        setByteElement(term334057, 12, (byte) -1);
        setByteElement(term334057, 13, (byte) -1);
        setByteElement(term334057, 14, (byte) -1);
        setByteElement(term334057, 15, (byte) -1);
        setByteElement(term334057, 16, (byte) -1);
        setByteElement(term334057, 17, (byte) -1);
        setByteElement(term334057, 18, (byte) -1);
        setByteElement(term334057, 19, (byte) -1);
        setByteElement(term334057, 20, (byte) -1);
        setByteElement(term334057, 21, (byte) -1);
        setByteElement(term334057, 22, (byte) -1);
        setByteElement(term334057, 23, (byte) -1);
        setByteElement(term334057, 24, (byte) -1);
        setByteElement(term334057, 25, (byte) -1);
        setByteElement(term334057, 26, (byte) -1);
        setByteElement(term334057, 27, (byte) -1);
        setByteElement(term334057, 28, (byte) -1);
        setByteElement(term334057, 29, (byte) -1);
        setByteElement(term334057, 30, (byte) -1);
        setByteElement(term334057, 31, (byte) -1);
        setByteElement(term334057, 32, (byte) -1);
        setByteElement(term334057, 33, (byte) -1);
        setByteElement(term334057, 34, (byte) -1);
        setByteElement(term334057, 35, (byte) -1);
        setByteElement(term334057, 36, (byte) -1);
        setByteElement(term334057, 37, (byte) -1);
        setByteElement(term334057, 38, (byte) -1);
        setByteElement(term334057, 39, (byte) -1);
        setByteElement(term334057, 40, (byte) -1);
        setByteElement(term334057, 41, (byte) -1);
        setByteElement(term334057, 42, (byte) -1);
        setByteElement(term334057, 43, (byte) -1);
        setByteElement(term334057, 44, (byte) -1);
        setByteElement(term334057, 45, (byte) -1);
        setByteElement(term334057, 46, (byte) -1);
        setByteElement(term334057, 47, (byte) -1);
        setByteElement(term334057, 49, (byte) 1);
        setByteElement(term334057, 50, (byte) 2);
        setByteElement(term334057, 51, (byte) 3);
        setByteElement(term334057, 52, (byte) 4);
        setByteElement(term334057, 53, (byte) 5);
        setByteElement(term334057, 54, (byte) 6);
        setByteElement(term334057, 55, (byte) 7);
        setByteElement(term334057, 56, (byte) 8);
        setByteElement(term334057, 57, (byte) 9);
        setByteElement(term334057, 58, (byte) -1);
        setByteElement(term334057, 59, (byte) -1);
        setByteElement(term334057, 60, (byte) -1);
        setByteElement(term334057, 61, (byte) -1);
        setByteElement(term334057, 62, (byte) -1);
        setByteElement(term334057, 63, (byte) -1);
        setByteElement(term334057, 64, (byte) -1);
        setByteElement(term334057, 65, (byte) 10);
        setByteElement(term334057, 66, (byte) 11);
        setByteElement(term334057, 67, (byte) 12);
        setByteElement(term334057, 68, (byte) 13);
        setByteElement(term334057, 69, (byte) 14);
        setByteElement(term334057, 70, (byte) 15);
        setByteElement(term334057, 71, (byte) 16);
        setByteElement(term334057, 72, (byte) 17);
        setByteElement(term334057, 73, (byte) 18);
        setByteElement(term334057, 74, (byte) 19);
        setByteElement(term334057, 75, (byte) 20);
        setByteElement(term334057, 76, (byte) 21);
        setByteElement(term334057, 77, (byte) 22);
        setByteElement(term334057, 78, (byte) 23);
        setByteElement(term334057, 79, (byte) 24);
        setByteElement(term334057, 80, (byte) 25);
        setByteElement(term334057, 81, (byte) 26);
        setByteElement(term334057, 82, (byte) 27);
        setByteElement(term334057, 83, (byte) 28);
        setByteElement(term334057, 84, (byte) 29);
        setByteElement(term334057, 85, (byte) 30);
        setByteElement(term334057, 86, (byte) 31);
        setByteElement(term334057, 87, (byte) 32);
        setField(term334056, term334056.getClass(), "decodeTable", term334057);
        setIntField(term334056, term334056.getClass(), "encodeSize", 18);
        setByteElement(term334058, 0, (byte) 48);
        setByteElement(term334058, 1, (byte) 49);
        setByteElement(term334058, 2, (byte) 50);
        setByteElement(term334058, 3, (byte) 51);
        setByteElement(term334058, 4, (byte) 52);
        setByteElement(term334058, 5, (byte) 53);
        setByteElement(term334058, 6, (byte) 54);
        setByteElement(term334058, 7, (byte) 55);
        setByteElement(term334058, 8, (byte) 56);
        setByteElement(term334058, 9, (byte) 57);
        setByteElement(term334058, 10, (byte) 65);
        setByteElement(term334058, 11, (byte) 66);
        setByteElement(term334058, 12, (byte) 67);
        setByteElement(term334058, 13, (byte) 68);
        setByteElement(term334058, 14, (byte) 69);
        setByteElement(term334058, 15, (byte) 70);
        setByteElement(term334058, 16, (byte) 71);
        setByteElement(term334058, 17, (byte) 72);
        setByteElement(term334058, 18, (byte) 73);
        setByteElement(term334058, 19, (byte) 74);
        setByteElement(term334058, 20, (byte) 75);
        setByteElement(term334058, 21, (byte) 76);
        setByteElement(term334058, 22, (byte) 77);
        setByteElement(term334058, 23, (byte) 78);
        setByteElement(term334058, 24, (byte) 79);
        setByteElement(term334058, 25, (byte) 80);
        setByteElement(term334058, 26, (byte) 81);
        setByteElement(term334058, 27, (byte) 82);
        setByteElement(term334058, 28, (byte) 83);
        setByteElement(term334058, 29, (byte) 84);
        setByteElement(term334058, 30, (byte) 85);
        setByteElement(term334058, 31, (byte) 86);
        setField(term334056, term334056.getClass(), "encodeTable", term334058);
        setField(term334056, term334056.getClass(), "lineSeparator", term334059);
        setByteField(term334056, term334056.getClass(), "PAD", (byte) 61);
        setByteField(term334056, term334056.getClass(), "pad", (byte) 61);
        setIntField(term334056, term334056.getClass(), "unencodedBlockSize", 5);
        setIntField(term334056, term334056.getClass(), "encodedBlockSize", 8);
        setIntField(term334056, term334056.getClass(), "lineLength", 0);
        setIntField(term334056, term334056.getClass(), "chunkSeparatorLength", 10);
        term334060 = (byte[]) newByteArray(10);
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
        args[1] = term323193;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term334056));
        assertTrue(recursiveEquals(term323193, term334060));
    }

};


