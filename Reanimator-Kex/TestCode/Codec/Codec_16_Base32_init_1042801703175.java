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

public class Base32_init_1042801703175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345202;
     Object term347827;
     Object term347831;

    public Base32_init_1042801703175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term346879 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term345721 = (byte[]) newByteArray(0);
        byte[] term345724 = (byte[]) newByteArray(0);
        setByteField(term346879, term346879.getClass(), "PAD", (byte) 0);
        setIntField(term346879, term346879.getClass(), "unencodedBlockSize", 0);
        setIntField(term346879, term346879.getClass(), "encodedBlockSize", 0);
        setIntField(term346879, term346879.getClass(), "lineLength", 0);
        setIntField(term346879, term346879.getClass(), "chunkSeparatorLength", 0);
        setByteField(term346879, term346879.getClass(), "pad", (byte) 0);
        setField(term346879, term346879.getClass(), "encodeTable", null);
        setField(term346879, term346879.getClass(), "decodeTable", term345721);
        setIntField(term346879, term346879.getClass(), "encodeSize", 0);
        setField(term346879, term346879.getClass(), "lineSeparator", term345724);
        setIntField(term346879, term346879.getClass(), "decodeSize", 0);
        term345202 = (byte[]) newByteArray(0);
        term347827 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term347828 = (byte[]) newByteArray(88);
        byte[] term347829 = (byte[]) newByteArray(32);
        byte[] term347830 = (byte[]) newByteArray(0);
        setIntField(term347827, term347827.getClass(), "decodeSize", 7);
        setByteElement(term347828, 0, (byte) -1);
        setByteElement(term347828, 1, (byte) -1);
        setByteElement(term347828, 2, (byte) -1);
        setByteElement(term347828, 3, (byte) -1);
        setByteElement(term347828, 4, (byte) -1);
        setByteElement(term347828, 5, (byte) -1);
        setByteElement(term347828, 6, (byte) -1);
        setByteElement(term347828, 7, (byte) -1);
        setByteElement(term347828, 8, (byte) -1);
        setByteElement(term347828, 9, (byte) -1);
        setByteElement(term347828, 10, (byte) -1);
        setByteElement(term347828, 11, (byte) -1);
        setByteElement(term347828, 12, (byte) -1);
        setByteElement(term347828, 13, (byte) -1);
        setByteElement(term347828, 14, (byte) -1);
        setByteElement(term347828, 15, (byte) -1);
        setByteElement(term347828, 16, (byte) -1);
        setByteElement(term347828, 17, (byte) -1);
        setByteElement(term347828, 18, (byte) -1);
        setByteElement(term347828, 19, (byte) -1);
        setByteElement(term347828, 20, (byte) -1);
        setByteElement(term347828, 21, (byte) -1);
        setByteElement(term347828, 22, (byte) -1);
        setByteElement(term347828, 23, (byte) -1);
        setByteElement(term347828, 24, (byte) -1);
        setByteElement(term347828, 25, (byte) -1);
        setByteElement(term347828, 26, (byte) -1);
        setByteElement(term347828, 27, (byte) -1);
        setByteElement(term347828, 28, (byte) -1);
        setByteElement(term347828, 29, (byte) -1);
        setByteElement(term347828, 30, (byte) -1);
        setByteElement(term347828, 31, (byte) -1);
        setByteElement(term347828, 32, (byte) -1);
        setByteElement(term347828, 33, (byte) -1);
        setByteElement(term347828, 34, (byte) -1);
        setByteElement(term347828, 35, (byte) -1);
        setByteElement(term347828, 36, (byte) -1);
        setByteElement(term347828, 37, (byte) -1);
        setByteElement(term347828, 38, (byte) -1);
        setByteElement(term347828, 39, (byte) -1);
        setByteElement(term347828, 40, (byte) -1);
        setByteElement(term347828, 41, (byte) -1);
        setByteElement(term347828, 42, (byte) -1);
        setByteElement(term347828, 43, (byte) -1);
        setByteElement(term347828, 44, (byte) -1);
        setByteElement(term347828, 45, (byte) -1);
        setByteElement(term347828, 46, (byte) -1);
        setByteElement(term347828, 47, (byte) -1);
        setByteElement(term347828, 49, (byte) 1);
        setByteElement(term347828, 50, (byte) 2);
        setByteElement(term347828, 51, (byte) 3);
        setByteElement(term347828, 52, (byte) 4);
        setByteElement(term347828, 53, (byte) 5);
        setByteElement(term347828, 54, (byte) 6);
        setByteElement(term347828, 55, (byte) 7);
        setByteElement(term347828, 56, (byte) 8);
        setByteElement(term347828, 57, (byte) 9);
        setByteElement(term347828, 58, (byte) -1);
        setByteElement(term347828, 59, (byte) -1);
        setByteElement(term347828, 60, (byte) -1);
        setByteElement(term347828, 61, (byte) -1);
        setByteElement(term347828, 62, (byte) -1);
        setByteElement(term347828, 63, (byte) -1);
        setByteElement(term347828, 64, (byte) -1);
        setByteElement(term347828, 65, (byte) 10);
        setByteElement(term347828, 66, (byte) 11);
        setByteElement(term347828, 67, (byte) 12);
        setByteElement(term347828, 68, (byte) 13);
        setByteElement(term347828, 69, (byte) 14);
        setByteElement(term347828, 70, (byte) 15);
        setByteElement(term347828, 71, (byte) 16);
        setByteElement(term347828, 72, (byte) 17);
        setByteElement(term347828, 73, (byte) 18);
        setByteElement(term347828, 74, (byte) 19);
        setByteElement(term347828, 75, (byte) 20);
        setByteElement(term347828, 76, (byte) 21);
        setByteElement(term347828, 77, (byte) 22);
        setByteElement(term347828, 78, (byte) 23);
        setByteElement(term347828, 79, (byte) 24);
        setByteElement(term347828, 80, (byte) 25);
        setByteElement(term347828, 81, (byte) 26);
        setByteElement(term347828, 82, (byte) 27);
        setByteElement(term347828, 83, (byte) 28);
        setByteElement(term347828, 84, (byte) 29);
        setByteElement(term347828, 85, (byte) 30);
        setByteElement(term347828, 86, (byte) 31);
        setByteElement(term347828, 87, (byte) 32);
        setField(term347827, term347827.getClass(), "decodeTable", term347828);
        setIntField(term347827, term347827.getClass(), "encodeSize", 8);
        setByteElement(term347829, 0, (byte) 48);
        setByteElement(term347829, 1, (byte) 49);
        setByteElement(term347829, 2, (byte) 50);
        setByteElement(term347829, 3, (byte) 51);
        setByteElement(term347829, 4, (byte) 52);
        setByteElement(term347829, 5, (byte) 53);
        setByteElement(term347829, 6, (byte) 54);
        setByteElement(term347829, 7, (byte) 55);
        setByteElement(term347829, 8, (byte) 56);
        setByteElement(term347829, 9, (byte) 57);
        setByteElement(term347829, 10, (byte) 65);
        setByteElement(term347829, 11, (byte) 66);
        setByteElement(term347829, 12, (byte) 67);
        setByteElement(term347829, 13, (byte) 68);
        setByteElement(term347829, 14, (byte) 69);
        setByteElement(term347829, 15, (byte) 70);
        setByteElement(term347829, 16, (byte) 71);
        setByteElement(term347829, 17, (byte) 72);
        setByteElement(term347829, 18, (byte) 73);
        setByteElement(term347829, 19, (byte) 74);
        setByteElement(term347829, 20, (byte) 75);
        setByteElement(term347829, 21, (byte) 76);
        setByteElement(term347829, 22, (byte) 77);
        setByteElement(term347829, 23, (byte) 78);
        setByteElement(term347829, 24, (byte) 79);
        setByteElement(term347829, 25, (byte) 80);
        setByteElement(term347829, 26, (byte) 81);
        setByteElement(term347829, 27, (byte) 82);
        setByteElement(term347829, 28, (byte) 83);
        setByteElement(term347829, 29, (byte) 84);
        setByteElement(term347829, 30, (byte) 85);
        setByteElement(term347829, 31, (byte) 86);
        setField(term347827, term347827.getClass(), "encodeTable", term347829);
        setField(term347827, term347827.getClass(), "lineSeparator", term347830);
        setByteField(term347827, term347827.getClass(), "PAD", (byte) 61);
        setByteField(term347827, term347827.getClass(), "pad", (byte) 61);
        setIntField(term347827, term347827.getClass(), "unencodedBlockSize", 5);
        setIntField(term347827, term347827.getClass(), "encodedBlockSize", 8);
        setIntField(term347827, term347827.getClass(), "lineLength", 0);
        setIntField(term347827, term347827.getClass(), "chunkSeparatorLength", 0);
        term347831 = (byte[]) newByteArray(0);
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
        args[1] = term345202;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term347827));
        assertTrue(recursiveEquals(term345202, term347831));
    }

};


