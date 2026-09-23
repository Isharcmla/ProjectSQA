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

public class Base32_init_1042801703109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120703;
     Object term121839;
     Object term121843;

    public Base32_init_1042801703109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121659 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term121250 = (byte[]) newByteArray(0);
        byte[] term121445 = (byte[]) newByteArray(0);
        setByteField(term121659, term121659.getClass(), "PAD", (byte) 0);
        setIntField(term121659, term121659.getClass(), "unencodedBlockSize", 0);
        setIntField(term121659, term121659.getClass(), "encodedBlockSize", 0);
        setIntField(term121659, term121659.getClass(), "lineLength", 0);
        setIntField(term121659, term121659.getClass(), "chunkSeparatorLength", 0);
        setByteField(term121659, term121659.getClass(), "pad", (byte) -128);
        setField(term121659, term121659.getClass(), "encodeTable", null);
        setField(term121659, term121659.getClass(), "decodeTable", term121250);
        setIntField(term121659, term121659.getClass(), "encodeSize", 0);
        setField(term121659, term121659.getClass(), "lineSeparator", term121445);
        setIntField(term121659, term121659.getClass(), "decodeSize", 0);
        term120703 = (byte[]) newByteArray(2);
        term121839 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term121840 = (byte[]) newByteArray(88);
        byte[] term121841 = (byte[]) newByteArray(32);
        byte[] term121842 = (byte[]) newByteArray(2);
        setIntField(term121839, term121839.getClass(), "decodeSize", 9);
        setByteElement(term121840, 0, (byte) -1);
        setByteElement(term121840, 1, (byte) -1);
        setByteElement(term121840, 2, (byte) -1);
        setByteElement(term121840, 3, (byte) -1);
        setByteElement(term121840, 4, (byte) -1);
        setByteElement(term121840, 5, (byte) -1);
        setByteElement(term121840, 6, (byte) -1);
        setByteElement(term121840, 7, (byte) -1);
        setByteElement(term121840, 8, (byte) -1);
        setByteElement(term121840, 9, (byte) -1);
        setByteElement(term121840, 10, (byte) -1);
        setByteElement(term121840, 11, (byte) -1);
        setByteElement(term121840, 12, (byte) -1);
        setByteElement(term121840, 13, (byte) -1);
        setByteElement(term121840, 14, (byte) -1);
        setByteElement(term121840, 15, (byte) -1);
        setByteElement(term121840, 16, (byte) -1);
        setByteElement(term121840, 17, (byte) -1);
        setByteElement(term121840, 18, (byte) -1);
        setByteElement(term121840, 19, (byte) -1);
        setByteElement(term121840, 20, (byte) -1);
        setByteElement(term121840, 21, (byte) -1);
        setByteElement(term121840, 22, (byte) -1);
        setByteElement(term121840, 23, (byte) -1);
        setByteElement(term121840, 24, (byte) -1);
        setByteElement(term121840, 25, (byte) -1);
        setByteElement(term121840, 26, (byte) -1);
        setByteElement(term121840, 27, (byte) -1);
        setByteElement(term121840, 28, (byte) -1);
        setByteElement(term121840, 29, (byte) -1);
        setByteElement(term121840, 30, (byte) -1);
        setByteElement(term121840, 31, (byte) -1);
        setByteElement(term121840, 32, (byte) -1);
        setByteElement(term121840, 33, (byte) -1);
        setByteElement(term121840, 34, (byte) -1);
        setByteElement(term121840, 35, (byte) -1);
        setByteElement(term121840, 36, (byte) -1);
        setByteElement(term121840, 37, (byte) -1);
        setByteElement(term121840, 38, (byte) -1);
        setByteElement(term121840, 39, (byte) -1);
        setByteElement(term121840, 40, (byte) -1);
        setByteElement(term121840, 41, (byte) -1);
        setByteElement(term121840, 42, (byte) -1);
        setByteElement(term121840, 43, (byte) -1);
        setByteElement(term121840, 44, (byte) -1);
        setByteElement(term121840, 45, (byte) -1);
        setByteElement(term121840, 46, (byte) -1);
        setByteElement(term121840, 47, (byte) -1);
        setByteElement(term121840, 49, (byte) 1);
        setByteElement(term121840, 50, (byte) 2);
        setByteElement(term121840, 51, (byte) 3);
        setByteElement(term121840, 52, (byte) 4);
        setByteElement(term121840, 53, (byte) 5);
        setByteElement(term121840, 54, (byte) 6);
        setByteElement(term121840, 55, (byte) 7);
        setByteElement(term121840, 56, (byte) 8);
        setByteElement(term121840, 57, (byte) 9);
        setByteElement(term121840, 58, (byte) -1);
        setByteElement(term121840, 59, (byte) -1);
        setByteElement(term121840, 60, (byte) -1);
        setByteElement(term121840, 61, (byte) -1);
        setByteElement(term121840, 62, (byte) -1);
        setByteElement(term121840, 63, (byte) -1);
        setByteElement(term121840, 64, (byte) -1);
        setByteElement(term121840, 65, (byte) 10);
        setByteElement(term121840, 66, (byte) 11);
        setByteElement(term121840, 67, (byte) 12);
        setByteElement(term121840, 68, (byte) 13);
        setByteElement(term121840, 69, (byte) 14);
        setByteElement(term121840, 70, (byte) 15);
        setByteElement(term121840, 71, (byte) 16);
        setByteElement(term121840, 72, (byte) 17);
        setByteElement(term121840, 73, (byte) 18);
        setByteElement(term121840, 74, (byte) 19);
        setByteElement(term121840, 75, (byte) 20);
        setByteElement(term121840, 76, (byte) 21);
        setByteElement(term121840, 77, (byte) 22);
        setByteElement(term121840, 78, (byte) 23);
        setByteElement(term121840, 79, (byte) 24);
        setByteElement(term121840, 80, (byte) 25);
        setByteElement(term121840, 81, (byte) 26);
        setByteElement(term121840, 82, (byte) 27);
        setByteElement(term121840, 83, (byte) 28);
        setByteElement(term121840, 84, (byte) 29);
        setByteElement(term121840, 85, (byte) 30);
        setByteElement(term121840, 86, (byte) 31);
        setByteElement(term121840, 87, (byte) 32);
        setField(term121839, term121839.getClass(), "decodeTable", term121840);
        setIntField(term121839, term121839.getClass(), "encodeSize", 10);
        setByteElement(term121841, 0, (byte) 48);
        setByteElement(term121841, 1, (byte) 49);
        setByteElement(term121841, 2, (byte) 50);
        setByteElement(term121841, 3, (byte) 51);
        setByteElement(term121841, 4, (byte) 52);
        setByteElement(term121841, 5, (byte) 53);
        setByteElement(term121841, 6, (byte) 54);
        setByteElement(term121841, 7, (byte) 55);
        setByteElement(term121841, 8, (byte) 56);
        setByteElement(term121841, 9, (byte) 57);
        setByteElement(term121841, 10, (byte) 65);
        setByteElement(term121841, 11, (byte) 66);
        setByteElement(term121841, 12, (byte) 67);
        setByteElement(term121841, 13, (byte) 68);
        setByteElement(term121841, 14, (byte) 69);
        setByteElement(term121841, 15, (byte) 70);
        setByteElement(term121841, 16, (byte) 71);
        setByteElement(term121841, 17, (byte) 72);
        setByteElement(term121841, 18, (byte) 73);
        setByteElement(term121841, 19, (byte) 74);
        setByteElement(term121841, 20, (byte) 75);
        setByteElement(term121841, 21, (byte) 76);
        setByteElement(term121841, 22, (byte) 77);
        setByteElement(term121841, 23, (byte) 78);
        setByteElement(term121841, 24, (byte) 79);
        setByteElement(term121841, 25, (byte) 80);
        setByteElement(term121841, 26, (byte) 81);
        setByteElement(term121841, 27, (byte) 82);
        setByteElement(term121841, 28, (byte) 83);
        setByteElement(term121841, 29, (byte) 84);
        setByteElement(term121841, 30, (byte) 85);
        setByteElement(term121841, 31, (byte) 86);
        setField(term121839, term121839.getClass(), "encodeTable", term121841);
        setField(term121839, term121839.getClass(), "lineSeparator", term121842);
        setByteField(term121839, term121839.getClass(), "PAD", (byte) 61);
        setByteField(term121839, term121839.getClass(), "pad", (byte) 61);
        setIntField(term121839, term121839.getClass(), "unencodedBlockSize", 5);
        setIntField(term121839, term121839.getClass(), "encodedBlockSize", 8);
        setIntField(term121839, term121839.getClass(), "lineLength", 0);
        setIntField(term121839, term121839.getClass(), "chunkSeparatorLength", 2);
        term121843 = (byte[]) newByteArray(2);
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
        args[1] = term120703;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term121839));
        assertTrue(recursiveEquals(term120703, term121843));
    }

};


