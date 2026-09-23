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

public class Base32_init_104091839144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22449;

    public Base32_init_104091839144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20122 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term20011 = (byte[]) newByteArray(0);
        setByteField(term20122, term20122.getClass(), "PAD", (byte) 0);
        setIntField(term20122, term20122.getClass(), "unencodedBlockSize", 0);
        setIntField(term20122, term20122.getClass(), "encodedBlockSize", 0);
        setIntField(term20122, term20122.getClass(), "lineLength", 0);
        setIntField(term20122, term20122.getClass(), "chunkSeparatorLength", 0);
        setByteField(term20122, term20122.getClass(), "pad", (byte) 0);
        setField(term20122, term20122.getClass(), "encodeTable", term20011);
        setField(term20122, term20122.getClass(), "decodeTable", term20011);
        setIntField(term20122, term20122.getClass(), "encodeSize", 0);
        setField(term20122, term20122.getClass(), "lineSeparator", term20011);
        setIntField(term20122, term20122.getClass(), "decodeSize", 0);
        term22449 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term22450 = (byte[]) newByteArray(91);
        byte[] term22451 = (byte[]) newByteArray(32);
        setIntField(term22449, term22449.getClass(), "decodeSize", 7);
        setByteElement(term22450, 0, (byte) -1);
        setByteElement(term22450, 1, (byte) -1);
        setByteElement(term22450, 2, (byte) -1);
        setByteElement(term22450, 3, (byte) -1);
        setByteElement(term22450, 4, (byte) -1);
        setByteElement(term22450, 5, (byte) -1);
        setByteElement(term22450, 6, (byte) -1);
        setByteElement(term22450, 7, (byte) -1);
        setByteElement(term22450, 8, (byte) -1);
        setByteElement(term22450, 9, (byte) -1);
        setByteElement(term22450, 10, (byte) -1);
        setByteElement(term22450, 11, (byte) -1);
        setByteElement(term22450, 12, (byte) -1);
        setByteElement(term22450, 13, (byte) -1);
        setByteElement(term22450, 14, (byte) -1);
        setByteElement(term22450, 15, (byte) -1);
        setByteElement(term22450, 16, (byte) -1);
        setByteElement(term22450, 17, (byte) -1);
        setByteElement(term22450, 18, (byte) -1);
        setByteElement(term22450, 19, (byte) -1);
        setByteElement(term22450, 20, (byte) -1);
        setByteElement(term22450, 21, (byte) -1);
        setByteElement(term22450, 22, (byte) -1);
        setByteElement(term22450, 23, (byte) -1);
        setByteElement(term22450, 24, (byte) -1);
        setByteElement(term22450, 25, (byte) -1);
        setByteElement(term22450, 26, (byte) -1);
        setByteElement(term22450, 27, (byte) -1);
        setByteElement(term22450, 28, (byte) -1);
        setByteElement(term22450, 29, (byte) -1);
        setByteElement(term22450, 30, (byte) -1);
        setByteElement(term22450, 31, (byte) -1);
        setByteElement(term22450, 32, (byte) -1);
        setByteElement(term22450, 33, (byte) -1);
        setByteElement(term22450, 34, (byte) -1);
        setByteElement(term22450, 35, (byte) -1);
        setByteElement(term22450, 36, (byte) -1);
        setByteElement(term22450, 37, (byte) -1);
        setByteElement(term22450, 38, (byte) -1);
        setByteElement(term22450, 39, (byte) -1);
        setByteElement(term22450, 40, (byte) -1);
        setByteElement(term22450, 41, (byte) -1);
        setByteElement(term22450, 42, (byte) -1);
        setByteElement(term22450, 43, (byte) -1);
        setByteElement(term22450, 44, (byte) -1);
        setByteElement(term22450, 45, (byte) -1);
        setByteElement(term22450, 46, (byte) -1);
        setByteElement(term22450, 47, (byte) -1);
        setByteElement(term22450, 48, (byte) -1);
        setByteElement(term22450, 49, (byte) -1);
        setByteElement(term22450, 50, (byte) 26);
        setByteElement(term22450, 51, (byte) 27);
        setByteElement(term22450, 52, (byte) 28);
        setByteElement(term22450, 53, (byte) 29);
        setByteElement(term22450, 54, (byte) 30);
        setByteElement(term22450, 55, (byte) 31);
        setByteElement(term22450, 56, (byte) -1);
        setByteElement(term22450, 57, (byte) -1);
        setByteElement(term22450, 58, (byte) -1);
        setByteElement(term22450, 59, (byte) -1);
        setByteElement(term22450, 60, (byte) -1);
        setByteElement(term22450, 61, (byte) -1);
        setByteElement(term22450, 62, (byte) -1);
        setByteElement(term22450, 63, (byte) -1);
        setByteElement(term22450, 64, (byte) -1);
        setByteElement(term22450, 66, (byte) 1);
        setByteElement(term22450, 67, (byte) 2);
        setByteElement(term22450, 68, (byte) 3);
        setByteElement(term22450, 69, (byte) 4);
        setByteElement(term22450, 70, (byte) 5);
        setByteElement(term22450, 71, (byte) 6);
        setByteElement(term22450, 72, (byte) 7);
        setByteElement(term22450, 73, (byte) 8);
        setByteElement(term22450, 74, (byte) 9);
        setByteElement(term22450, 75, (byte) 10);
        setByteElement(term22450, 76, (byte) 11);
        setByteElement(term22450, 77, (byte) 12);
        setByteElement(term22450, 78, (byte) 13);
        setByteElement(term22450, 79, (byte) 14);
        setByteElement(term22450, 80, (byte) 15);
        setByteElement(term22450, 81, (byte) 16);
        setByteElement(term22450, 82, (byte) 17);
        setByteElement(term22450, 83, (byte) 18);
        setByteElement(term22450, 84, (byte) 19);
        setByteElement(term22450, 85, (byte) 20);
        setByteElement(term22450, 86, (byte) 21);
        setByteElement(term22450, 87, (byte) 22);
        setByteElement(term22450, 88, (byte) 23);
        setByteElement(term22450, 89, (byte) 24);
        setByteElement(term22450, 90, (byte) 25);
        setField(term22449, term22449.getClass(), "decodeTable", term22450);
        setIntField(term22449, term22449.getClass(), "encodeSize", 8);
        setByteElement(term22451, 0, (byte) 65);
        setByteElement(term22451, 1, (byte) 66);
        setByteElement(term22451, 2, (byte) 67);
        setByteElement(term22451, 3, (byte) 68);
        setByteElement(term22451, 4, (byte) 69);
        setByteElement(term22451, 5, (byte) 70);
        setByteElement(term22451, 6, (byte) 71);
        setByteElement(term22451, 7, (byte) 72);
        setByteElement(term22451, 8, (byte) 73);
        setByteElement(term22451, 9, (byte) 74);
        setByteElement(term22451, 10, (byte) 75);
        setByteElement(term22451, 11, (byte) 76);
        setByteElement(term22451, 12, (byte) 77);
        setByteElement(term22451, 13, (byte) 78);
        setByteElement(term22451, 14, (byte) 79);
        setByteElement(term22451, 15, (byte) 80);
        setByteElement(term22451, 16, (byte) 81);
        setByteElement(term22451, 17, (byte) 82);
        setByteElement(term22451, 18, (byte) 83);
        setByteElement(term22451, 19, (byte) 84);
        setByteElement(term22451, 20, (byte) 85);
        setByteElement(term22451, 21, (byte) 86);
        setByteElement(term22451, 22, (byte) 87);
        setByteElement(term22451, 23, (byte) 88);
        setByteElement(term22451, 24, (byte) 89);
        setByteElement(term22451, 25, (byte) 90);
        setByteElement(term22451, 26, (byte) 50);
        setByteElement(term22451, 27, (byte) 51);
        setByteElement(term22451, 28, (byte) 52);
        setByteElement(term22451, 29, (byte) 53);
        setByteElement(term22451, 30, (byte) 54);
        setByteElement(term22451, 31, (byte) 55);
        setField(term22449, term22449.getClass(), "encodeTable", term22451);
        setField(term22449, term22449.getClass(), "lineSeparator", null);
        setByteField(term22449, term22449.getClass(), "PAD", (byte) 61);
        setByteField(term22449, term22449.getClass(), "pad", (byte) -128);
        setIntField(term22449, term22449.getClass(), "unencodedBlockSize", 5);
        setIntField(term22449, term22449.getClass(), "encodedBlockSize", 8);
        setIntField(term22449, term22449.getClass(), "lineLength", 0);
        setIntField(term22449, term22449.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) -128;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22449));
    }

};


