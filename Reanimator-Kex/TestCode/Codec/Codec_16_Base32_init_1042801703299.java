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

public class Base32_init_1042801703299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524488;
     Object term527871;
     Object term527875;

    public Base32_init_1042801703299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term527702 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term525498 = (byte[]) newByteArray(0);
        setByteField(term527702, term527702.getClass(), "PAD", (byte) 0);
        setIntField(term527702, term527702.getClass(), "unencodedBlockSize", 0);
        setIntField(term527702, term527702.getClass(), "encodedBlockSize", 0);
        setIntField(term527702, term527702.getClass(), "lineLength", 0);
        setIntField(term527702, term527702.getClass(), "chunkSeparatorLength", 0);
        setByteField(term527702, term527702.getClass(), "pad", (byte) -128);
        setField(term527702, term527702.getClass(), "encodeTable", null);
        setField(term527702, term527702.getClass(), "decodeTable", term525498);
        setIntField(term527702, term527702.getClass(), "encodeSize", 0);
        setField(term527702, term527702.getClass(), "lineSeparator", null);
        setIntField(term527702, term527702.getClass(), "decodeSize", 0);
        term524488 = (byte[]) newByteArray(1);
        term527871 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term527872 = (byte[]) newByteArray(88);
        byte[] term527873 = (byte[]) newByteArray(32);
        byte[] term527874 = (byte[]) newByteArray(1);
        setIntField(term527871, term527871.getClass(), "decodeSize", 8);
        setByteElement(term527872, 0, (byte) -1);
        setByteElement(term527872, 1, (byte) -1);
        setByteElement(term527872, 2, (byte) -1);
        setByteElement(term527872, 3, (byte) -1);
        setByteElement(term527872, 4, (byte) -1);
        setByteElement(term527872, 5, (byte) -1);
        setByteElement(term527872, 6, (byte) -1);
        setByteElement(term527872, 7, (byte) -1);
        setByteElement(term527872, 8, (byte) -1);
        setByteElement(term527872, 9, (byte) -1);
        setByteElement(term527872, 10, (byte) -1);
        setByteElement(term527872, 11, (byte) -1);
        setByteElement(term527872, 12, (byte) -1);
        setByteElement(term527872, 13, (byte) -1);
        setByteElement(term527872, 14, (byte) -1);
        setByteElement(term527872, 15, (byte) -1);
        setByteElement(term527872, 16, (byte) -1);
        setByteElement(term527872, 17, (byte) -1);
        setByteElement(term527872, 18, (byte) -1);
        setByteElement(term527872, 19, (byte) -1);
        setByteElement(term527872, 20, (byte) -1);
        setByteElement(term527872, 21, (byte) -1);
        setByteElement(term527872, 22, (byte) -1);
        setByteElement(term527872, 23, (byte) -1);
        setByteElement(term527872, 24, (byte) -1);
        setByteElement(term527872, 25, (byte) -1);
        setByteElement(term527872, 26, (byte) -1);
        setByteElement(term527872, 27, (byte) -1);
        setByteElement(term527872, 28, (byte) -1);
        setByteElement(term527872, 29, (byte) -1);
        setByteElement(term527872, 30, (byte) -1);
        setByteElement(term527872, 31, (byte) -1);
        setByteElement(term527872, 32, (byte) -1);
        setByteElement(term527872, 33, (byte) -1);
        setByteElement(term527872, 34, (byte) -1);
        setByteElement(term527872, 35, (byte) -1);
        setByteElement(term527872, 36, (byte) -1);
        setByteElement(term527872, 37, (byte) -1);
        setByteElement(term527872, 38, (byte) -1);
        setByteElement(term527872, 39, (byte) -1);
        setByteElement(term527872, 40, (byte) -1);
        setByteElement(term527872, 41, (byte) -1);
        setByteElement(term527872, 42, (byte) -1);
        setByteElement(term527872, 43, (byte) -1);
        setByteElement(term527872, 44, (byte) -1);
        setByteElement(term527872, 45, (byte) -1);
        setByteElement(term527872, 46, (byte) -1);
        setByteElement(term527872, 47, (byte) -1);
        setByteElement(term527872, 49, (byte) 1);
        setByteElement(term527872, 50, (byte) 2);
        setByteElement(term527872, 51, (byte) 3);
        setByteElement(term527872, 52, (byte) 4);
        setByteElement(term527872, 53, (byte) 5);
        setByteElement(term527872, 54, (byte) 6);
        setByteElement(term527872, 55, (byte) 7);
        setByteElement(term527872, 56, (byte) 8);
        setByteElement(term527872, 57, (byte) 9);
        setByteElement(term527872, 58, (byte) -1);
        setByteElement(term527872, 59, (byte) -1);
        setByteElement(term527872, 60, (byte) -1);
        setByteElement(term527872, 61, (byte) -1);
        setByteElement(term527872, 62, (byte) -1);
        setByteElement(term527872, 63, (byte) -1);
        setByteElement(term527872, 64, (byte) -1);
        setByteElement(term527872, 65, (byte) 10);
        setByteElement(term527872, 66, (byte) 11);
        setByteElement(term527872, 67, (byte) 12);
        setByteElement(term527872, 68, (byte) 13);
        setByteElement(term527872, 69, (byte) 14);
        setByteElement(term527872, 70, (byte) 15);
        setByteElement(term527872, 71, (byte) 16);
        setByteElement(term527872, 72, (byte) 17);
        setByteElement(term527872, 73, (byte) 18);
        setByteElement(term527872, 74, (byte) 19);
        setByteElement(term527872, 75, (byte) 20);
        setByteElement(term527872, 76, (byte) 21);
        setByteElement(term527872, 77, (byte) 22);
        setByteElement(term527872, 78, (byte) 23);
        setByteElement(term527872, 79, (byte) 24);
        setByteElement(term527872, 80, (byte) 25);
        setByteElement(term527872, 81, (byte) 26);
        setByteElement(term527872, 82, (byte) 27);
        setByteElement(term527872, 83, (byte) 28);
        setByteElement(term527872, 84, (byte) 29);
        setByteElement(term527872, 85, (byte) 30);
        setByteElement(term527872, 86, (byte) 31);
        setByteElement(term527872, 87, (byte) 32);
        setField(term527871, term527871.getClass(), "decodeTable", term527872);
        setIntField(term527871, term527871.getClass(), "encodeSize", 9);
        setByteElement(term527873, 0, (byte) 48);
        setByteElement(term527873, 1, (byte) 49);
        setByteElement(term527873, 2, (byte) 50);
        setByteElement(term527873, 3, (byte) 51);
        setByteElement(term527873, 4, (byte) 52);
        setByteElement(term527873, 5, (byte) 53);
        setByteElement(term527873, 6, (byte) 54);
        setByteElement(term527873, 7, (byte) 55);
        setByteElement(term527873, 8, (byte) 56);
        setByteElement(term527873, 9, (byte) 57);
        setByteElement(term527873, 10, (byte) 65);
        setByteElement(term527873, 11, (byte) 66);
        setByteElement(term527873, 12, (byte) 67);
        setByteElement(term527873, 13, (byte) 68);
        setByteElement(term527873, 14, (byte) 69);
        setByteElement(term527873, 15, (byte) 70);
        setByteElement(term527873, 16, (byte) 71);
        setByteElement(term527873, 17, (byte) 72);
        setByteElement(term527873, 18, (byte) 73);
        setByteElement(term527873, 19, (byte) 74);
        setByteElement(term527873, 20, (byte) 75);
        setByteElement(term527873, 21, (byte) 76);
        setByteElement(term527873, 22, (byte) 77);
        setByteElement(term527873, 23, (byte) 78);
        setByteElement(term527873, 24, (byte) 79);
        setByteElement(term527873, 25, (byte) 80);
        setByteElement(term527873, 26, (byte) 81);
        setByteElement(term527873, 27, (byte) 82);
        setByteElement(term527873, 28, (byte) 83);
        setByteElement(term527873, 29, (byte) 84);
        setByteElement(term527873, 30, (byte) 85);
        setByteElement(term527873, 31, (byte) 86);
        setField(term527871, term527871.getClass(), "encodeTable", term527873);
        setField(term527871, term527871.getClass(), "lineSeparator", term527874);
        setByteField(term527871, term527871.getClass(), "PAD", (byte) 61);
        setByteField(term527871, term527871.getClass(), "pad", (byte) 61);
        setIntField(term527871, term527871.getClass(), "unencodedBlockSize", 5);
        setIntField(term527871, term527871.getClass(), "encodedBlockSize", 8);
        setIntField(term527871, term527871.getClass(), "lineLength", 0);
        setIntField(term527871, term527871.getClass(), "chunkSeparatorLength", 1);
        term527875 = (byte[]) newByteArray(1);
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
        args[1] = term524488;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term527871));
        assertTrue(recursiveEquals(term524488, term527875));
    }

};


