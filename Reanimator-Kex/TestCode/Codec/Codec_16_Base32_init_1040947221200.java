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

public class Base32_init_1040947221200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381680;

    public Base32_init_1040947221200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term377814 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term375646 = (byte[]) newByteArray(512);
        setByteField(term377814, term377814.getClass(), "PAD", (byte) 0);
        setIntField(term377814, term377814.getClass(), "unencodedBlockSize", 0);
        setIntField(term377814, term377814.getClass(), "encodedBlockSize", 0);
        setIntField(term377814, term377814.getClass(), "lineLength", 0);
        setIntField(term377814, term377814.getClass(), "chunkSeparatorLength", 0);
        setByteField(term377814, term377814.getClass(), "pad", (byte) 0);
        setField(term377814, term377814.getClass(), "encodeTable", term375646);
        setField(term377814, term377814.getClass(), "decodeTable", term375646);
        setIntField(term377814, term377814.getClass(), "encodeSize", 0);
        setField(term377814, term377814.getClass(), "lineSeparator", term375646);
        setIntField(term377814, term377814.getClass(), "decodeSize", 0);
        term381680 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term381681 = (byte[]) newByteArray(88);
        byte[] term381682 = (byte[]) newByteArray(32);
        setIntField(term381680, term381680.getClass(), "decodeSize", 7);
        setByteElement(term381681, 0, (byte) -1);
        setByteElement(term381681, 1, (byte) -1);
        setByteElement(term381681, 2, (byte) -1);
        setByteElement(term381681, 3, (byte) -1);
        setByteElement(term381681, 4, (byte) -1);
        setByteElement(term381681, 5, (byte) -1);
        setByteElement(term381681, 6, (byte) -1);
        setByteElement(term381681, 7, (byte) -1);
        setByteElement(term381681, 8, (byte) -1);
        setByteElement(term381681, 9, (byte) -1);
        setByteElement(term381681, 10, (byte) -1);
        setByteElement(term381681, 11, (byte) -1);
        setByteElement(term381681, 12, (byte) -1);
        setByteElement(term381681, 13, (byte) -1);
        setByteElement(term381681, 14, (byte) -1);
        setByteElement(term381681, 15, (byte) -1);
        setByteElement(term381681, 16, (byte) -1);
        setByteElement(term381681, 17, (byte) -1);
        setByteElement(term381681, 18, (byte) -1);
        setByteElement(term381681, 19, (byte) -1);
        setByteElement(term381681, 20, (byte) -1);
        setByteElement(term381681, 21, (byte) -1);
        setByteElement(term381681, 22, (byte) -1);
        setByteElement(term381681, 23, (byte) -1);
        setByteElement(term381681, 24, (byte) -1);
        setByteElement(term381681, 25, (byte) -1);
        setByteElement(term381681, 26, (byte) -1);
        setByteElement(term381681, 27, (byte) -1);
        setByteElement(term381681, 28, (byte) -1);
        setByteElement(term381681, 29, (byte) -1);
        setByteElement(term381681, 30, (byte) -1);
        setByteElement(term381681, 31, (byte) -1);
        setByteElement(term381681, 32, (byte) -1);
        setByteElement(term381681, 33, (byte) -1);
        setByteElement(term381681, 34, (byte) -1);
        setByteElement(term381681, 35, (byte) -1);
        setByteElement(term381681, 36, (byte) -1);
        setByteElement(term381681, 37, (byte) -1);
        setByteElement(term381681, 38, (byte) -1);
        setByteElement(term381681, 39, (byte) -1);
        setByteElement(term381681, 40, (byte) -1);
        setByteElement(term381681, 41, (byte) -1);
        setByteElement(term381681, 42, (byte) -1);
        setByteElement(term381681, 43, (byte) -1);
        setByteElement(term381681, 44, (byte) -1);
        setByteElement(term381681, 45, (byte) -1);
        setByteElement(term381681, 46, (byte) -1);
        setByteElement(term381681, 47, (byte) -1);
        setByteElement(term381681, 49, (byte) 1);
        setByteElement(term381681, 50, (byte) 2);
        setByteElement(term381681, 51, (byte) 3);
        setByteElement(term381681, 52, (byte) 4);
        setByteElement(term381681, 53, (byte) 5);
        setByteElement(term381681, 54, (byte) 6);
        setByteElement(term381681, 55, (byte) 7);
        setByteElement(term381681, 56, (byte) 8);
        setByteElement(term381681, 57, (byte) 9);
        setByteElement(term381681, 58, (byte) -1);
        setByteElement(term381681, 59, (byte) -1);
        setByteElement(term381681, 60, (byte) -1);
        setByteElement(term381681, 61, (byte) -1);
        setByteElement(term381681, 62, (byte) -1);
        setByteElement(term381681, 63, (byte) -1);
        setByteElement(term381681, 64, (byte) -1);
        setByteElement(term381681, 65, (byte) 10);
        setByteElement(term381681, 66, (byte) 11);
        setByteElement(term381681, 67, (byte) 12);
        setByteElement(term381681, 68, (byte) 13);
        setByteElement(term381681, 69, (byte) 14);
        setByteElement(term381681, 70, (byte) 15);
        setByteElement(term381681, 71, (byte) 16);
        setByteElement(term381681, 72, (byte) 17);
        setByteElement(term381681, 73, (byte) 18);
        setByteElement(term381681, 74, (byte) 19);
        setByteElement(term381681, 75, (byte) 20);
        setByteElement(term381681, 76, (byte) 21);
        setByteElement(term381681, 77, (byte) 22);
        setByteElement(term381681, 78, (byte) 23);
        setByteElement(term381681, 79, (byte) 24);
        setByteElement(term381681, 80, (byte) 25);
        setByteElement(term381681, 81, (byte) 26);
        setByteElement(term381681, 82, (byte) 27);
        setByteElement(term381681, 83, (byte) 28);
        setByteElement(term381681, 84, (byte) 29);
        setByteElement(term381681, 85, (byte) 30);
        setByteElement(term381681, 86, (byte) 31);
        setByteElement(term381681, 87, (byte) 32);
        setField(term381680, term381680.getClass(), "decodeTable", term381681);
        setIntField(term381680, term381680.getClass(), "encodeSize", 8);
        setByteElement(term381682, 0, (byte) 48);
        setByteElement(term381682, 1, (byte) 49);
        setByteElement(term381682, 2, (byte) 50);
        setByteElement(term381682, 3, (byte) 51);
        setByteElement(term381682, 4, (byte) 52);
        setByteElement(term381682, 5, (byte) 53);
        setByteElement(term381682, 6, (byte) 54);
        setByteElement(term381682, 7, (byte) 55);
        setByteElement(term381682, 8, (byte) 56);
        setByteElement(term381682, 9, (byte) 57);
        setByteElement(term381682, 10, (byte) 65);
        setByteElement(term381682, 11, (byte) 66);
        setByteElement(term381682, 12, (byte) 67);
        setByteElement(term381682, 13, (byte) 68);
        setByteElement(term381682, 14, (byte) 69);
        setByteElement(term381682, 15, (byte) 70);
        setByteElement(term381682, 16, (byte) 71);
        setByteElement(term381682, 17, (byte) 72);
        setByteElement(term381682, 18, (byte) 73);
        setByteElement(term381682, 19, (byte) 74);
        setByteElement(term381682, 20, (byte) 75);
        setByteElement(term381682, 21, (byte) 76);
        setByteElement(term381682, 22, (byte) 77);
        setByteElement(term381682, 23, (byte) 78);
        setByteElement(term381682, 24, (byte) 79);
        setByteElement(term381682, 25, (byte) 80);
        setByteElement(term381682, 26, (byte) 81);
        setByteElement(term381682, 27, (byte) 82);
        setByteElement(term381682, 28, (byte) 83);
        setByteElement(term381682, 29, (byte) 84);
        setByteElement(term381682, 30, (byte) 85);
        setByteElement(term381682, 31, (byte) 86);
        setField(term381680, term381680.getClass(), "encodeTable", term381682);
        setField(term381680, term381680.getClass(), "lineSeparator", null);
        setByteField(term381680, term381680.getClass(), "PAD", (byte) 61);
        setByteField(term381680, term381680.getClass(), "pad", (byte) 126);
        setIntField(term381680, term381680.getClass(), "unencodedBlockSize", 5);
        setIntField(term381680, term381680.getClass(), "encodedBlockSize", 8);
        setIntField(term381680, term381680.getClass(), "lineLength", 0);
        setIntField(term381680, term381680.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = true;
        args[1] = (byte) 126;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term381680));
    }

};


