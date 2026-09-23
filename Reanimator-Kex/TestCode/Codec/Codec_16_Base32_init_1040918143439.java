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

public class Base32_init_1040918143439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931656;

    public Base32_init_1040918143439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term914303 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term912642 = (byte[]) newByteArray(0);
        setByteField(term914303, term914303.getClass(), "PAD", (byte) 0);
        setIntField(term914303, term914303.getClass(), "unencodedBlockSize", 0);
        setIntField(term914303, term914303.getClass(), "encodedBlockSize", 0);
        setIntField(term914303, term914303.getClass(), "lineLength", 0);
        setIntField(term914303, term914303.getClass(), "chunkSeparatorLength", 0);
        setByteField(term914303, term914303.getClass(), "pad", (byte) 0);
        setField(term914303, term914303.getClass(), "encodeTable", term912642);
        setField(term914303, term914303.getClass(), "decodeTable", term912642);
        setIntField(term914303, term914303.getClass(), "encodeSize", 0);
        setField(term914303, term914303.getClass(), "lineSeparator", term912642);
        setIntField(term914303, term914303.getClass(), "decodeSize", 0);
        term931656 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term931657 = (byte[]) newByteArray(88);
        byte[] term931658 = (byte[]) newByteArray(32);
        setIntField(term931656, term931656.getClass(), "decodeSize", 7);
        setByteElement(term931657, 0, (byte) -1);
        setByteElement(term931657, 1, (byte) -1);
        setByteElement(term931657, 2, (byte) -1);
        setByteElement(term931657, 3, (byte) -1);
        setByteElement(term931657, 4, (byte) -1);
        setByteElement(term931657, 5, (byte) -1);
        setByteElement(term931657, 6, (byte) -1);
        setByteElement(term931657, 7, (byte) -1);
        setByteElement(term931657, 8, (byte) -1);
        setByteElement(term931657, 9, (byte) -1);
        setByteElement(term931657, 10, (byte) -1);
        setByteElement(term931657, 11, (byte) -1);
        setByteElement(term931657, 12, (byte) -1);
        setByteElement(term931657, 13, (byte) -1);
        setByteElement(term931657, 14, (byte) -1);
        setByteElement(term931657, 15, (byte) -1);
        setByteElement(term931657, 16, (byte) -1);
        setByteElement(term931657, 17, (byte) -1);
        setByteElement(term931657, 18, (byte) -1);
        setByteElement(term931657, 19, (byte) -1);
        setByteElement(term931657, 20, (byte) -1);
        setByteElement(term931657, 21, (byte) -1);
        setByteElement(term931657, 22, (byte) -1);
        setByteElement(term931657, 23, (byte) -1);
        setByteElement(term931657, 24, (byte) -1);
        setByteElement(term931657, 25, (byte) -1);
        setByteElement(term931657, 26, (byte) -1);
        setByteElement(term931657, 27, (byte) -1);
        setByteElement(term931657, 28, (byte) -1);
        setByteElement(term931657, 29, (byte) -1);
        setByteElement(term931657, 30, (byte) -1);
        setByteElement(term931657, 31, (byte) -1);
        setByteElement(term931657, 32, (byte) -1);
        setByteElement(term931657, 33, (byte) -1);
        setByteElement(term931657, 34, (byte) -1);
        setByteElement(term931657, 35, (byte) -1);
        setByteElement(term931657, 36, (byte) -1);
        setByteElement(term931657, 37, (byte) -1);
        setByteElement(term931657, 38, (byte) -1);
        setByteElement(term931657, 39, (byte) -1);
        setByteElement(term931657, 40, (byte) -1);
        setByteElement(term931657, 41, (byte) -1);
        setByteElement(term931657, 42, (byte) -1);
        setByteElement(term931657, 43, (byte) -1);
        setByteElement(term931657, 44, (byte) -1);
        setByteElement(term931657, 45, (byte) -1);
        setByteElement(term931657, 46, (byte) -1);
        setByteElement(term931657, 47, (byte) -1);
        setByteElement(term931657, 49, (byte) 1);
        setByteElement(term931657, 50, (byte) 2);
        setByteElement(term931657, 51, (byte) 3);
        setByteElement(term931657, 52, (byte) 4);
        setByteElement(term931657, 53, (byte) 5);
        setByteElement(term931657, 54, (byte) 6);
        setByteElement(term931657, 55, (byte) 7);
        setByteElement(term931657, 56, (byte) 8);
        setByteElement(term931657, 57, (byte) 9);
        setByteElement(term931657, 58, (byte) -1);
        setByteElement(term931657, 59, (byte) -1);
        setByteElement(term931657, 60, (byte) -1);
        setByteElement(term931657, 61, (byte) -1);
        setByteElement(term931657, 62, (byte) -1);
        setByteElement(term931657, 63, (byte) -1);
        setByteElement(term931657, 64, (byte) -1);
        setByteElement(term931657, 65, (byte) 10);
        setByteElement(term931657, 66, (byte) 11);
        setByteElement(term931657, 67, (byte) 12);
        setByteElement(term931657, 68, (byte) 13);
        setByteElement(term931657, 69, (byte) 14);
        setByteElement(term931657, 70, (byte) 15);
        setByteElement(term931657, 71, (byte) 16);
        setByteElement(term931657, 72, (byte) 17);
        setByteElement(term931657, 73, (byte) 18);
        setByteElement(term931657, 74, (byte) 19);
        setByteElement(term931657, 75, (byte) 20);
        setByteElement(term931657, 76, (byte) 21);
        setByteElement(term931657, 77, (byte) 22);
        setByteElement(term931657, 78, (byte) 23);
        setByteElement(term931657, 79, (byte) 24);
        setByteElement(term931657, 80, (byte) 25);
        setByteElement(term931657, 81, (byte) 26);
        setByteElement(term931657, 82, (byte) 27);
        setByteElement(term931657, 83, (byte) 28);
        setByteElement(term931657, 84, (byte) 29);
        setByteElement(term931657, 85, (byte) 30);
        setByteElement(term931657, 86, (byte) 31);
        setByteElement(term931657, 87, (byte) 32);
        setField(term931656, term931656.getClass(), "decodeTable", term931657);
        setIntField(term931656, term931656.getClass(), "encodeSize", 8);
        setByteElement(term931658, 0, (byte) 48);
        setByteElement(term931658, 1, (byte) 49);
        setByteElement(term931658, 2, (byte) 50);
        setByteElement(term931658, 3, (byte) 51);
        setByteElement(term931658, 4, (byte) 52);
        setByteElement(term931658, 5, (byte) 53);
        setByteElement(term931658, 6, (byte) 54);
        setByteElement(term931658, 7, (byte) 55);
        setByteElement(term931658, 8, (byte) 56);
        setByteElement(term931658, 9, (byte) 57);
        setByteElement(term931658, 10, (byte) 65);
        setByteElement(term931658, 11, (byte) 66);
        setByteElement(term931658, 12, (byte) 67);
        setByteElement(term931658, 13, (byte) 68);
        setByteElement(term931658, 14, (byte) 69);
        setByteElement(term931658, 15, (byte) 70);
        setByteElement(term931658, 16, (byte) 71);
        setByteElement(term931658, 17, (byte) 72);
        setByteElement(term931658, 18, (byte) 73);
        setByteElement(term931658, 19, (byte) 74);
        setByteElement(term931658, 20, (byte) 75);
        setByteElement(term931658, 21, (byte) 76);
        setByteElement(term931658, 22, (byte) 77);
        setByteElement(term931658, 23, (byte) 78);
        setByteElement(term931658, 24, (byte) 79);
        setByteElement(term931658, 25, (byte) 80);
        setByteElement(term931658, 26, (byte) 81);
        setByteElement(term931658, 27, (byte) 82);
        setByteElement(term931658, 28, (byte) 83);
        setByteElement(term931658, 29, (byte) 84);
        setByteElement(term931658, 30, (byte) 85);
        setByteElement(term931658, 31, (byte) 86);
        setField(term931656, term931656.getClass(), "encodeTable", term931658);
        setField(term931656, term931656.getClass(), "lineSeparator", null);
        setByteField(term931656, term931656.getClass(), "PAD", (byte) 61);
        setByteField(term931656, term931656.getClass(), "pad", (byte) 61);
        setIntField(term931656, term931656.getClass(), "unencodedBlockSize", 5);
        setIntField(term931656, term931656.getClass(), "encodedBlockSize", 8);
        setIntField(term931656, term931656.getClass(), "lineLength", 0);
        setIntField(term931656, term931656.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term931656));
    }

};


