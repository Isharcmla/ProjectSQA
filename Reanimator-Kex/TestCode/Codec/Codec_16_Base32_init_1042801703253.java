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

public class Base32_init_1042801703253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447481;
     Object term452478;
     Object term452482;

    public Base32_init_1042801703253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term452287 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term452287, term452287.getClass(), "PAD", (byte) -128);
        setIntField(term452287, term452287.getClass(), "unencodedBlockSize", 0);
        setIntField(term452287, term452287.getClass(), "encodedBlockSize", 0);
        setIntField(term452287, term452287.getClass(), "lineLength", 0);
        setIntField(term452287, term452287.getClass(), "chunkSeparatorLength", 0);
        setByteField(term452287, term452287.getClass(), "pad", (byte) -128);
        setField(term452287, term452287.getClass(), "encodeTable", null);
        setField(term452287, term452287.getClass(), "decodeTable", null);
        setIntField(term452287, term452287.getClass(), "encodeSize", 0);
        setField(term452287, term452287.getClass(), "lineSeparator", null);
        setIntField(term452287, term452287.getClass(), "decodeSize", 0);
        term447481 = (byte[]) newByteArray(3);
        term452478 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term452479 = (byte[]) newByteArray(88);
        byte[] term452480 = (byte[]) newByteArray(32);
        byte[] term452481 = (byte[]) newByteArray(3);
        setIntField(term452478, term452478.getClass(), "decodeSize", 10);
        setByteElement(term452479, 0, (byte) -1);
        setByteElement(term452479, 1, (byte) -1);
        setByteElement(term452479, 2, (byte) -1);
        setByteElement(term452479, 3, (byte) -1);
        setByteElement(term452479, 4, (byte) -1);
        setByteElement(term452479, 5, (byte) -1);
        setByteElement(term452479, 6, (byte) -1);
        setByteElement(term452479, 7, (byte) -1);
        setByteElement(term452479, 8, (byte) -1);
        setByteElement(term452479, 9, (byte) -1);
        setByteElement(term452479, 10, (byte) -1);
        setByteElement(term452479, 11, (byte) -1);
        setByteElement(term452479, 12, (byte) -1);
        setByteElement(term452479, 13, (byte) -1);
        setByteElement(term452479, 14, (byte) -1);
        setByteElement(term452479, 15, (byte) -1);
        setByteElement(term452479, 16, (byte) -1);
        setByteElement(term452479, 17, (byte) -1);
        setByteElement(term452479, 18, (byte) -1);
        setByteElement(term452479, 19, (byte) -1);
        setByteElement(term452479, 20, (byte) -1);
        setByteElement(term452479, 21, (byte) -1);
        setByteElement(term452479, 22, (byte) -1);
        setByteElement(term452479, 23, (byte) -1);
        setByteElement(term452479, 24, (byte) -1);
        setByteElement(term452479, 25, (byte) -1);
        setByteElement(term452479, 26, (byte) -1);
        setByteElement(term452479, 27, (byte) -1);
        setByteElement(term452479, 28, (byte) -1);
        setByteElement(term452479, 29, (byte) -1);
        setByteElement(term452479, 30, (byte) -1);
        setByteElement(term452479, 31, (byte) -1);
        setByteElement(term452479, 32, (byte) -1);
        setByteElement(term452479, 33, (byte) -1);
        setByteElement(term452479, 34, (byte) -1);
        setByteElement(term452479, 35, (byte) -1);
        setByteElement(term452479, 36, (byte) -1);
        setByteElement(term452479, 37, (byte) -1);
        setByteElement(term452479, 38, (byte) -1);
        setByteElement(term452479, 39, (byte) -1);
        setByteElement(term452479, 40, (byte) -1);
        setByteElement(term452479, 41, (byte) -1);
        setByteElement(term452479, 42, (byte) -1);
        setByteElement(term452479, 43, (byte) -1);
        setByteElement(term452479, 44, (byte) -1);
        setByteElement(term452479, 45, (byte) -1);
        setByteElement(term452479, 46, (byte) -1);
        setByteElement(term452479, 47, (byte) -1);
        setByteElement(term452479, 49, (byte) 1);
        setByteElement(term452479, 50, (byte) 2);
        setByteElement(term452479, 51, (byte) 3);
        setByteElement(term452479, 52, (byte) 4);
        setByteElement(term452479, 53, (byte) 5);
        setByteElement(term452479, 54, (byte) 6);
        setByteElement(term452479, 55, (byte) 7);
        setByteElement(term452479, 56, (byte) 8);
        setByteElement(term452479, 57, (byte) 9);
        setByteElement(term452479, 58, (byte) -1);
        setByteElement(term452479, 59, (byte) -1);
        setByteElement(term452479, 60, (byte) -1);
        setByteElement(term452479, 61, (byte) -1);
        setByteElement(term452479, 62, (byte) -1);
        setByteElement(term452479, 63, (byte) -1);
        setByteElement(term452479, 64, (byte) -1);
        setByteElement(term452479, 65, (byte) 10);
        setByteElement(term452479, 66, (byte) 11);
        setByteElement(term452479, 67, (byte) 12);
        setByteElement(term452479, 68, (byte) 13);
        setByteElement(term452479, 69, (byte) 14);
        setByteElement(term452479, 70, (byte) 15);
        setByteElement(term452479, 71, (byte) 16);
        setByteElement(term452479, 72, (byte) 17);
        setByteElement(term452479, 73, (byte) 18);
        setByteElement(term452479, 74, (byte) 19);
        setByteElement(term452479, 75, (byte) 20);
        setByteElement(term452479, 76, (byte) 21);
        setByteElement(term452479, 77, (byte) 22);
        setByteElement(term452479, 78, (byte) 23);
        setByteElement(term452479, 79, (byte) 24);
        setByteElement(term452479, 80, (byte) 25);
        setByteElement(term452479, 81, (byte) 26);
        setByteElement(term452479, 82, (byte) 27);
        setByteElement(term452479, 83, (byte) 28);
        setByteElement(term452479, 84, (byte) 29);
        setByteElement(term452479, 85, (byte) 30);
        setByteElement(term452479, 86, (byte) 31);
        setByteElement(term452479, 87, (byte) 32);
        setField(term452478, term452478.getClass(), "decodeTable", term452479);
        setIntField(term452478, term452478.getClass(), "encodeSize", 11);
        setByteElement(term452480, 0, (byte) 48);
        setByteElement(term452480, 1, (byte) 49);
        setByteElement(term452480, 2, (byte) 50);
        setByteElement(term452480, 3, (byte) 51);
        setByteElement(term452480, 4, (byte) 52);
        setByteElement(term452480, 5, (byte) 53);
        setByteElement(term452480, 6, (byte) 54);
        setByteElement(term452480, 7, (byte) 55);
        setByteElement(term452480, 8, (byte) 56);
        setByteElement(term452480, 9, (byte) 57);
        setByteElement(term452480, 10, (byte) 65);
        setByteElement(term452480, 11, (byte) 66);
        setByteElement(term452480, 12, (byte) 67);
        setByteElement(term452480, 13, (byte) 68);
        setByteElement(term452480, 14, (byte) 69);
        setByteElement(term452480, 15, (byte) 70);
        setByteElement(term452480, 16, (byte) 71);
        setByteElement(term452480, 17, (byte) 72);
        setByteElement(term452480, 18, (byte) 73);
        setByteElement(term452480, 19, (byte) 74);
        setByteElement(term452480, 20, (byte) 75);
        setByteElement(term452480, 21, (byte) 76);
        setByteElement(term452480, 22, (byte) 77);
        setByteElement(term452480, 23, (byte) 78);
        setByteElement(term452480, 24, (byte) 79);
        setByteElement(term452480, 25, (byte) 80);
        setByteElement(term452480, 26, (byte) 81);
        setByteElement(term452480, 27, (byte) 82);
        setByteElement(term452480, 28, (byte) 83);
        setByteElement(term452480, 29, (byte) 84);
        setByteElement(term452480, 30, (byte) 85);
        setByteElement(term452480, 31, (byte) 86);
        setField(term452478, term452478.getClass(), "encodeTable", term452480);
        setField(term452478, term452478.getClass(), "lineSeparator", term452481);
        setByteField(term452478, term452478.getClass(), "PAD", (byte) 61);
        setByteField(term452478, term452478.getClass(), "pad", (byte) 61);
        setIntField(term452478, term452478.getClass(), "unencodedBlockSize", 5);
        setIntField(term452478, term452478.getClass(), "encodedBlockSize", 8);
        setIntField(term452478, term452478.getClass(), "lineLength", 0);
        setIntField(term452478, term452478.getClass(), "chunkSeparatorLength", 3);
        term452482 = (byte[]) newByteArray(3);
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
        args[1] = term447481;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term452478));
        assertTrue(recursiveEquals(term447481, term452482));
    }

};


