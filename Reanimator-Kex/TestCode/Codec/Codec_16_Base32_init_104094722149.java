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

public class Base32_init_104094722149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27617;

    public Base32_init_104094722149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27440 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term27322 = (byte[]) newByteArray(0);
        byte[] term27324 = (byte[]) newByteArray(0);
        setByteField(term27440, term27440.getClass(), "PAD", (byte) 0);
        setIntField(term27440, term27440.getClass(), "unencodedBlockSize", 0);
        setIntField(term27440, term27440.getClass(), "encodedBlockSize", 0);
        setIntField(term27440, term27440.getClass(), "lineLength", 0);
        setIntField(term27440, term27440.getClass(), "chunkSeparatorLength", 0);
        setByteField(term27440, term27440.getClass(), "pad", (byte) 0);
        setField(term27440, term27440.getClass(), "encodeTable", term27322);
        setField(term27440, term27440.getClass(), "decodeTable", term27324);
        setIntField(term27440, term27440.getClass(), "encodeSize", 0);
        setField(term27440, term27440.getClass(), "lineSeparator", term27322);
        setIntField(term27440, term27440.getClass(), "decodeSize", 0);
        term27617 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term27618 = (byte[]) newByteArray(91);
        byte[] term27619 = (byte[]) newByteArray(32);
        setIntField(term27617, term27617.getClass(), "decodeSize", 7);
        setByteElement(term27618, 0, (byte) -1);
        setByteElement(term27618, 1, (byte) -1);
        setByteElement(term27618, 2, (byte) -1);
        setByteElement(term27618, 3, (byte) -1);
        setByteElement(term27618, 4, (byte) -1);
        setByteElement(term27618, 5, (byte) -1);
        setByteElement(term27618, 6, (byte) -1);
        setByteElement(term27618, 7, (byte) -1);
        setByteElement(term27618, 8, (byte) -1);
        setByteElement(term27618, 9, (byte) -1);
        setByteElement(term27618, 10, (byte) -1);
        setByteElement(term27618, 11, (byte) -1);
        setByteElement(term27618, 12, (byte) -1);
        setByteElement(term27618, 13, (byte) -1);
        setByteElement(term27618, 14, (byte) -1);
        setByteElement(term27618, 15, (byte) -1);
        setByteElement(term27618, 16, (byte) -1);
        setByteElement(term27618, 17, (byte) -1);
        setByteElement(term27618, 18, (byte) -1);
        setByteElement(term27618, 19, (byte) -1);
        setByteElement(term27618, 20, (byte) -1);
        setByteElement(term27618, 21, (byte) -1);
        setByteElement(term27618, 22, (byte) -1);
        setByteElement(term27618, 23, (byte) -1);
        setByteElement(term27618, 24, (byte) -1);
        setByteElement(term27618, 25, (byte) -1);
        setByteElement(term27618, 26, (byte) -1);
        setByteElement(term27618, 27, (byte) -1);
        setByteElement(term27618, 28, (byte) -1);
        setByteElement(term27618, 29, (byte) -1);
        setByteElement(term27618, 30, (byte) -1);
        setByteElement(term27618, 31, (byte) -1);
        setByteElement(term27618, 32, (byte) -1);
        setByteElement(term27618, 33, (byte) -1);
        setByteElement(term27618, 34, (byte) -1);
        setByteElement(term27618, 35, (byte) -1);
        setByteElement(term27618, 36, (byte) -1);
        setByteElement(term27618, 37, (byte) -1);
        setByteElement(term27618, 38, (byte) -1);
        setByteElement(term27618, 39, (byte) -1);
        setByteElement(term27618, 40, (byte) -1);
        setByteElement(term27618, 41, (byte) -1);
        setByteElement(term27618, 42, (byte) -1);
        setByteElement(term27618, 43, (byte) -1);
        setByteElement(term27618, 44, (byte) -1);
        setByteElement(term27618, 45, (byte) -1);
        setByteElement(term27618, 46, (byte) -1);
        setByteElement(term27618, 47, (byte) -1);
        setByteElement(term27618, 48, (byte) -1);
        setByteElement(term27618, 49, (byte) -1);
        setByteElement(term27618, 50, (byte) 26);
        setByteElement(term27618, 51, (byte) 27);
        setByteElement(term27618, 52, (byte) 28);
        setByteElement(term27618, 53, (byte) 29);
        setByteElement(term27618, 54, (byte) 30);
        setByteElement(term27618, 55, (byte) 31);
        setByteElement(term27618, 56, (byte) -1);
        setByteElement(term27618, 57, (byte) -1);
        setByteElement(term27618, 58, (byte) -1);
        setByteElement(term27618, 59, (byte) -1);
        setByteElement(term27618, 60, (byte) -1);
        setByteElement(term27618, 61, (byte) -1);
        setByteElement(term27618, 62, (byte) -1);
        setByteElement(term27618, 63, (byte) -1);
        setByteElement(term27618, 64, (byte) -1);
        setByteElement(term27618, 66, (byte) 1);
        setByteElement(term27618, 67, (byte) 2);
        setByteElement(term27618, 68, (byte) 3);
        setByteElement(term27618, 69, (byte) 4);
        setByteElement(term27618, 70, (byte) 5);
        setByteElement(term27618, 71, (byte) 6);
        setByteElement(term27618, 72, (byte) 7);
        setByteElement(term27618, 73, (byte) 8);
        setByteElement(term27618, 74, (byte) 9);
        setByteElement(term27618, 75, (byte) 10);
        setByteElement(term27618, 76, (byte) 11);
        setByteElement(term27618, 77, (byte) 12);
        setByteElement(term27618, 78, (byte) 13);
        setByteElement(term27618, 79, (byte) 14);
        setByteElement(term27618, 80, (byte) 15);
        setByteElement(term27618, 81, (byte) 16);
        setByteElement(term27618, 82, (byte) 17);
        setByteElement(term27618, 83, (byte) 18);
        setByteElement(term27618, 84, (byte) 19);
        setByteElement(term27618, 85, (byte) 20);
        setByteElement(term27618, 86, (byte) 21);
        setByteElement(term27618, 87, (byte) 22);
        setByteElement(term27618, 88, (byte) 23);
        setByteElement(term27618, 89, (byte) 24);
        setByteElement(term27618, 90, (byte) 25);
        setField(term27617, term27617.getClass(), "decodeTable", term27618);
        setIntField(term27617, term27617.getClass(), "encodeSize", 8);
        setByteElement(term27619, 0, (byte) 65);
        setByteElement(term27619, 1, (byte) 66);
        setByteElement(term27619, 2, (byte) 67);
        setByteElement(term27619, 3, (byte) 68);
        setByteElement(term27619, 4, (byte) 69);
        setByteElement(term27619, 5, (byte) 70);
        setByteElement(term27619, 6, (byte) 71);
        setByteElement(term27619, 7, (byte) 72);
        setByteElement(term27619, 8, (byte) 73);
        setByteElement(term27619, 9, (byte) 74);
        setByteElement(term27619, 10, (byte) 75);
        setByteElement(term27619, 11, (byte) 76);
        setByteElement(term27619, 12, (byte) 77);
        setByteElement(term27619, 13, (byte) 78);
        setByteElement(term27619, 14, (byte) 79);
        setByteElement(term27619, 15, (byte) 80);
        setByteElement(term27619, 16, (byte) 81);
        setByteElement(term27619, 17, (byte) 82);
        setByteElement(term27619, 18, (byte) 83);
        setByteElement(term27619, 19, (byte) 84);
        setByteElement(term27619, 20, (byte) 85);
        setByteElement(term27619, 21, (byte) 86);
        setByteElement(term27619, 22, (byte) 87);
        setByteElement(term27619, 23, (byte) 88);
        setByteElement(term27619, 24, (byte) 89);
        setByteElement(term27619, 25, (byte) 90);
        setByteElement(term27619, 26, (byte) 50);
        setByteElement(term27619, 27, (byte) 51);
        setByteElement(term27619, 28, (byte) 52);
        setByteElement(term27619, 29, (byte) 53);
        setByteElement(term27619, 30, (byte) 54);
        setByteElement(term27619, 31, (byte) 55);
        setField(term27617, term27617.getClass(), "encodeTable", term27619);
        setField(term27617, term27617.getClass(), "lineSeparator", null);
        setByteField(term27617, term27617.getClass(), "PAD", (byte) 61);
        setByteField(term27617, term27617.getClass(), "pad", (byte) 126);
        setIntField(term27617, term27617.getClass(), "unencodedBlockSize", 5);
        setIntField(term27617, term27617.getClass(), "encodedBlockSize", 8);
        setIntField(term27617, term27617.getClass(), "lineLength", 0);
        setIntField(term27617, term27617.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = false;
        args[1] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27617));
    }

};


