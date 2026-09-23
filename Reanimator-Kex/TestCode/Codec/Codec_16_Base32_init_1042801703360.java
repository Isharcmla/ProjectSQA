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

public class Base32_init_1042801703360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term688138;
     Object term736373;
     Object term736377;

    public Base32_init_1042801703360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term690248 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term688637 = (byte[]) newByteArray(0);
        byte[] term689128 = (byte[]) newByteArray(0);
        setByteField(term690248, term690248.getClass(), "PAD", (byte) 0);
        setIntField(term690248, term690248.getClass(), "unencodedBlockSize", 0);
        setIntField(term690248, term690248.getClass(), "encodedBlockSize", 0);
        setIntField(term690248, term690248.getClass(), "lineLength", 0);
        setIntField(term690248, term690248.getClass(), "chunkSeparatorLength", 0);
        setByteField(term690248, term690248.getClass(), "pad", (byte) -128);
        setField(term690248, term690248.getClass(), "encodeTable", term688637);
        setField(term690248, term690248.getClass(), "decodeTable", term689128);
        term688138 = (byte[]) newByteArray(491);
        setByteElement(term688138, 1, (byte) -128);
        term736373 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term736374 = (byte[]) newByteArray(88);
        byte[] term736375 = (byte[]) newByteArray(32);
        byte[] term736376 = (byte[]) newByteArray(491);
        setIntField(term736373, term736373.getClass(), "decodeSize", 498);
        setByteElement(term736374, 0, (byte) -1);
        setByteElement(term736374, 1, (byte) -1);
        setByteElement(term736374, 2, (byte) -1);
        setByteElement(term736374, 3, (byte) -1);
        setByteElement(term736374, 4, (byte) -1);
        setByteElement(term736374, 5, (byte) -1);
        setByteElement(term736374, 6, (byte) -1);
        setByteElement(term736374, 7, (byte) -1);
        setByteElement(term736374, 8, (byte) -1);
        setByteElement(term736374, 9, (byte) -1);
        setByteElement(term736374, 10, (byte) -1);
        setByteElement(term736374, 11, (byte) -1);
        setByteElement(term736374, 12, (byte) -1);
        setByteElement(term736374, 13, (byte) -1);
        setByteElement(term736374, 14, (byte) -1);
        setByteElement(term736374, 15, (byte) -1);
        setByteElement(term736374, 16, (byte) -1);
        setByteElement(term736374, 17, (byte) -1);
        setByteElement(term736374, 18, (byte) -1);
        setByteElement(term736374, 19, (byte) -1);
        setByteElement(term736374, 20, (byte) -1);
        setByteElement(term736374, 21, (byte) -1);
        setByteElement(term736374, 22, (byte) -1);
        setByteElement(term736374, 23, (byte) -1);
        setByteElement(term736374, 24, (byte) -1);
        setByteElement(term736374, 25, (byte) -1);
        setByteElement(term736374, 26, (byte) -1);
        setByteElement(term736374, 27, (byte) -1);
        setByteElement(term736374, 28, (byte) -1);
        setByteElement(term736374, 29, (byte) -1);
        setByteElement(term736374, 30, (byte) -1);
        setByteElement(term736374, 31, (byte) -1);
        setByteElement(term736374, 32, (byte) -1);
        setByteElement(term736374, 33, (byte) -1);
        setByteElement(term736374, 34, (byte) -1);
        setByteElement(term736374, 35, (byte) -1);
        setByteElement(term736374, 36, (byte) -1);
        setByteElement(term736374, 37, (byte) -1);
        setByteElement(term736374, 38, (byte) -1);
        setByteElement(term736374, 39, (byte) -1);
        setByteElement(term736374, 40, (byte) -1);
        setByteElement(term736374, 41, (byte) -1);
        setByteElement(term736374, 42, (byte) -1);
        setByteElement(term736374, 43, (byte) -1);
        setByteElement(term736374, 44, (byte) -1);
        setByteElement(term736374, 45, (byte) -1);
        setByteElement(term736374, 46, (byte) -1);
        setByteElement(term736374, 47, (byte) -1);
        setByteElement(term736374, 49, (byte) 1);
        setByteElement(term736374, 50, (byte) 2);
        setByteElement(term736374, 51, (byte) 3);
        setByteElement(term736374, 52, (byte) 4);
        setByteElement(term736374, 53, (byte) 5);
        setByteElement(term736374, 54, (byte) 6);
        setByteElement(term736374, 55, (byte) 7);
        setByteElement(term736374, 56, (byte) 8);
        setByteElement(term736374, 57, (byte) 9);
        setByteElement(term736374, 58, (byte) -1);
        setByteElement(term736374, 59, (byte) -1);
        setByteElement(term736374, 60, (byte) -1);
        setByteElement(term736374, 61, (byte) -1);
        setByteElement(term736374, 62, (byte) -1);
        setByteElement(term736374, 63, (byte) -1);
        setByteElement(term736374, 64, (byte) -1);
        setByteElement(term736374, 65, (byte) 10);
        setByteElement(term736374, 66, (byte) 11);
        setByteElement(term736374, 67, (byte) 12);
        setByteElement(term736374, 68, (byte) 13);
        setByteElement(term736374, 69, (byte) 14);
        setByteElement(term736374, 70, (byte) 15);
        setByteElement(term736374, 71, (byte) 16);
        setByteElement(term736374, 72, (byte) 17);
        setByteElement(term736374, 73, (byte) 18);
        setByteElement(term736374, 74, (byte) 19);
        setByteElement(term736374, 75, (byte) 20);
        setByteElement(term736374, 76, (byte) 21);
        setByteElement(term736374, 77, (byte) 22);
        setByteElement(term736374, 78, (byte) 23);
        setByteElement(term736374, 79, (byte) 24);
        setByteElement(term736374, 80, (byte) 25);
        setByteElement(term736374, 81, (byte) 26);
        setByteElement(term736374, 82, (byte) 27);
        setByteElement(term736374, 83, (byte) 28);
        setByteElement(term736374, 84, (byte) 29);
        setByteElement(term736374, 85, (byte) 30);
        setByteElement(term736374, 86, (byte) 31);
        setByteElement(term736374, 87, (byte) 32);
        setField(term736373, term736373.getClass(), "decodeTable", term736374);
        setIntField(term736373, term736373.getClass(), "encodeSize", 499);
        setByteElement(term736375, 0, (byte) 48);
        setByteElement(term736375, 1, (byte) 49);
        setByteElement(term736375, 2, (byte) 50);
        setByteElement(term736375, 3, (byte) 51);
        setByteElement(term736375, 4, (byte) 52);
        setByteElement(term736375, 5, (byte) 53);
        setByteElement(term736375, 6, (byte) 54);
        setByteElement(term736375, 7, (byte) 55);
        setByteElement(term736375, 8, (byte) 56);
        setByteElement(term736375, 9, (byte) 57);
        setByteElement(term736375, 10, (byte) 65);
        setByteElement(term736375, 11, (byte) 66);
        setByteElement(term736375, 12, (byte) 67);
        setByteElement(term736375, 13, (byte) 68);
        setByteElement(term736375, 14, (byte) 69);
        setByteElement(term736375, 15, (byte) 70);
        setByteElement(term736375, 16, (byte) 71);
        setByteElement(term736375, 17, (byte) 72);
        setByteElement(term736375, 18, (byte) 73);
        setByteElement(term736375, 19, (byte) 74);
        setByteElement(term736375, 20, (byte) 75);
        setByteElement(term736375, 21, (byte) 76);
        setByteElement(term736375, 22, (byte) 77);
        setByteElement(term736375, 23, (byte) 78);
        setByteElement(term736375, 24, (byte) 79);
        setByteElement(term736375, 25, (byte) 80);
        setByteElement(term736375, 26, (byte) 81);
        setByteElement(term736375, 27, (byte) 82);
        setByteElement(term736375, 28, (byte) 83);
        setByteElement(term736375, 29, (byte) 84);
        setByteElement(term736375, 30, (byte) 85);
        setByteElement(term736375, 31, (byte) 86);
        setField(term736373, term736373.getClass(), "encodeTable", term736375);
        setByteElement(term736376, 1, (byte) -128);
        setField(term736373, term736373.getClass(), "lineSeparator", term736376);
        setByteField(term736373, term736373.getClass(), "PAD", (byte) 61);
        setByteField(term736373, term736373.getClass(), "pad", (byte) 61);
        setIntField(term736373, term736373.getClass(), "unencodedBlockSize", 5);
        setIntField(term736373, term736373.getClass(), "encodedBlockSize", 8);
        setIntField(term736373, term736373.getClass(), "lineLength", 0);
        setIntField(term736373, term736373.getClass(), "chunkSeparatorLength", 491);
        term736377 = (byte[]) newByteArray(491);
        setByteElement(term736377, 1, (byte) -128);
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
        args[1] = term688138;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term736373));
        assertTrue(recursiveEquals(term688138, term736377));
    }

};


