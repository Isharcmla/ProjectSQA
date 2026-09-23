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

public class Base32_init_104091721327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9171;

    public Base32_init_104091721327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8710 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term8596 = (byte[]) newByteArray(0);
        byte[] term8597 = (byte[]) newByteArray(0);
        byte[] term8595 = (byte[]) newByteArray(0);
        setByteField(term8710, term8710.getClass(), "PAD", (byte) 0);
        setIntField(term8710, term8710.getClass(), "unencodedBlockSize", 0);
        setIntField(term8710, term8710.getClass(), "encodedBlockSize", 0);
        setIntField(term8710, term8710.getClass(), "lineLength", 0);
        setIntField(term8710, term8710.getClass(), "chunkSeparatorLength", 0);
        setByteField(term8710, term8710.getClass(), "pad", (byte) 0);
        setField(term8710, term8710.getClass(), "encodeTable", term8596);
        setField(term8710, term8710.getClass(), "decodeTable", term8597);
        setIntField(term8710, term8710.getClass(), "encodeSize", 0);
        setField(term8710, term8710.getClass(), "lineSeparator", term8595);
        setIntField(term8710, term8710.getClass(), "decodeSize", 0);
        term9171 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term9172 = (byte[]) newByteArray(91);
        byte[] term9173 = (byte[]) newByteArray(32);
        setIntField(term9171, term9171.getClass(), "decodeSize", 7);
        setByteElement(term9172, 0, (byte) -1);
        setByteElement(term9172, 1, (byte) -1);
        setByteElement(term9172, 2, (byte) -1);
        setByteElement(term9172, 3, (byte) -1);
        setByteElement(term9172, 4, (byte) -1);
        setByteElement(term9172, 5, (byte) -1);
        setByteElement(term9172, 6, (byte) -1);
        setByteElement(term9172, 7, (byte) -1);
        setByteElement(term9172, 8, (byte) -1);
        setByteElement(term9172, 9, (byte) -1);
        setByteElement(term9172, 10, (byte) -1);
        setByteElement(term9172, 11, (byte) -1);
        setByteElement(term9172, 12, (byte) -1);
        setByteElement(term9172, 13, (byte) -1);
        setByteElement(term9172, 14, (byte) -1);
        setByteElement(term9172, 15, (byte) -1);
        setByteElement(term9172, 16, (byte) -1);
        setByteElement(term9172, 17, (byte) -1);
        setByteElement(term9172, 18, (byte) -1);
        setByteElement(term9172, 19, (byte) -1);
        setByteElement(term9172, 20, (byte) -1);
        setByteElement(term9172, 21, (byte) -1);
        setByteElement(term9172, 22, (byte) -1);
        setByteElement(term9172, 23, (byte) -1);
        setByteElement(term9172, 24, (byte) -1);
        setByteElement(term9172, 25, (byte) -1);
        setByteElement(term9172, 26, (byte) -1);
        setByteElement(term9172, 27, (byte) -1);
        setByteElement(term9172, 28, (byte) -1);
        setByteElement(term9172, 29, (byte) -1);
        setByteElement(term9172, 30, (byte) -1);
        setByteElement(term9172, 31, (byte) -1);
        setByteElement(term9172, 32, (byte) -1);
        setByteElement(term9172, 33, (byte) -1);
        setByteElement(term9172, 34, (byte) -1);
        setByteElement(term9172, 35, (byte) -1);
        setByteElement(term9172, 36, (byte) -1);
        setByteElement(term9172, 37, (byte) -1);
        setByteElement(term9172, 38, (byte) -1);
        setByteElement(term9172, 39, (byte) -1);
        setByteElement(term9172, 40, (byte) -1);
        setByteElement(term9172, 41, (byte) -1);
        setByteElement(term9172, 42, (byte) -1);
        setByteElement(term9172, 43, (byte) -1);
        setByteElement(term9172, 44, (byte) -1);
        setByteElement(term9172, 45, (byte) -1);
        setByteElement(term9172, 46, (byte) -1);
        setByteElement(term9172, 47, (byte) -1);
        setByteElement(term9172, 48, (byte) -1);
        setByteElement(term9172, 49, (byte) -1);
        setByteElement(term9172, 50, (byte) 26);
        setByteElement(term9172, 51, (byte) 27);
        setByteElement(term9172, 52, (byte) 28);
        setByteElement(term9172, 53, (byte) 29);
        setByteElement(term9172, 54, (byte) 30);
        setByteElement(term9172, 55, (byte) 31);
        setByteElement(term9172, 56, (byte) -1);
        setByteElement(term9172, 57, (byte) -1);
        setByteElement(term9172, 58, (byte) -1);
        setByteElement(term9172, 59, (byte) -1);
        setByteElement(term9172, 60, (byte) -1);
        setByteElement(term9172, 61, (byte) -1);
        setByteElement(term9172, 62, (byte) -1);
        setByteElement(term9172, 63, (byte) -1);
        setByteElement(term9172, 64, (byte) -1);
        setByteElement(term9172, 66, (byte) 1);
        setByteElement(term9172, 67, (byte) 2);
        setByteElement(term9172, 68, (byte) 3);
        setByteElement(term9172, 69, (byte) 4);
        setByteElement(term9172, 70, (byte) 5);
        setByteElement(term9172, 71, (byte) 6);
        setByteElement(term9172, 72, (byte) 7);
        setByteElement(term9172, 73, (byte) 8);
        setByteElement(term9172, 74, (byte) 9);
        setByteElement(term9172, 75, (byte) 10);
        setByteElement(term9172, 76, (byte) 11);
        setByteElement(term9172, 77, (byte) 12);
        setByteElement(term9172, 78, (byte) 13);
        setByteElement(term9172, 79, (byte) 14);
        setByteElement(term9172, 80, (byte) 15);
        setByteElement(term9172, 81, (byte) 16);
        setByteElement(term9172, 82, (byte) 17);
        setByteElement(term9172, 83, (byte) 18);
        setByteElement(term9172, 84, (byte) 19);
        setByteElement(term9172, 85, (byte) 20);
        setByteElement(term9172, 86, (byte) 21);
        setByteElement(term9172, 87, (byte) 22);
        setByteElement(term9172, 88, (byte) 23);
        setByteElement(term9172, 89, (byte) 24);
        setByteElement(term9172, 90, (byte) 25);
        setField(term9171, term9171.getClass(), "decodeTable", term9172);
        setIntField(term9171, term9171.getClass(), "encodeSize", 8);
        setByteElement(term9173, 0, (byte) 65);
        setByteElement(term9173, 1, (byte) 66);
        setByteElement(term9173, 2, (byte) 67);
        setByteElement(term9173, 3, (byte) 68);
        setByteElement(term9173, 4, (byte) 69);
        setByteElement(term9173, 5, (byte) 70);
        setByteElement(term9173, 6, (byte) 71);
        setByteElement(term9173, 7, (byte) 72);
        setByteElement(term9173, 8, (byte) 73);
        setByteElement(term9173, 9, (byte) 74);
        setByteElement(term9173, 10, (byte) 75);
        setByteElement(term9173, 11, (byte) 76);
        setByteElement(term9173, 12, (byte) 77);
        setByteElement(term9173, 13, (byte) 78);
        setByteElement(term9173, 14, (byte) 79);
        setByteElement(term9173, 15, (byte) 80);
        setByteElement(term9173, 16, (byte) 81);
        setByteElement(term9173, 17, (byte) 82);
        setByteElement(term9173, 18, (byte) 83);
        setByteElement(term9173, 19, (byte) 84);
        setByteElement(term9173, 20, (byte) 85);
        setByteElement(term9173, 21, (byte) 86);
        setByteElement(term9173, 22, (byte) 87);
        setByteElement(term9173, 23, (byte) 88);
        setByteElement(term9173, 24, (byte) 89);
        setByteElement(term9173, 25, (byte) 90);
        setByteElement(term9173, 26, (byte) 50);
        setByteElement(term9173, 27, (byte) 51);
        setByteElement(term9173, 28, (byte) 52);
        setByteElement(term9173, 29, (byte) 53);
        setByteElement(term9173, 30, (byte) 54);
        setByteElement(term9173, 31, (byte) 55);
        setField(term9171, term9171.getClass(), "encodeTable", term9173);
        setField(term9171, term9171.getClass(), "lineSeparator", null);
        setByteField(term9171, term9171.getClass(), "PAD", (byte) 61);
        setByteField(term9171, term9171.getClass(), "pad", (byte) 61);
        setIntField(term9171, term9171.getClass(), "unencodedBlockSize", 5);
        setIntField(term9171, term9171.getClass(), "encodedBlockSize", 8);
        setIntField(term9171, term9171.getClass(), "lineLength", 0);
        setIntField(term9171, term9171.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9171));
    }

};


