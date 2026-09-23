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

public class Base32_init_1042801703462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945043;
     Object term1010487;
     Object term1010491;

    public Base32_init_1042801703462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term951934 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term951934, term951934.getClass(), "PAD", (byte) 0);
        setIntField(term951934, term951934.getClass(), "unencodedBlockSize", 0);
        setIntField(term951934, term951934.getClass(), "encodedBlockSize", 0);
        setIntField(term951934, term951934.getClass(), "lineLength", 0);
        setIntField(term951934, term951934.getClass(), "chunkSeparatorLength", 0);
        setByteField(term951934, term951934.getClass(), "pad", (byte) -128);
        setField(term951934, term951934.getClass(), "encodeTable", null);
        setField(term951934, term951934.getClass(), "decodeTable", null);
        setIntField(term951934, term951934.getClass(), "encodeSize", 0);
        setField(term951934, term951934.getClass(), "lineSeparator", null);
        setIntField(term951934, term951934.getClass(), "decodeSize", 0);
        term945043 = (byte[]) newByteArray(5);
        term1010487 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1010488 = (byte[]) newByteArray(88);
        byte[] term1010489 = (byte[]) newByteArray(32);
        byte[] term1010490 = (byte[]) newByteArray(5);
        setIntField(term1010487, term1010487.getClass(), "decodeSize", 12);
        setByteElement(term1010488, 0, (byte) -1);
        setByteElement(term1010488, 1, (byte) -1);
        setByteElement(term1010488, 2, (byte) -1);
        setByteElement(term1010488, 3, (byte) -1);
        setByteElement(term1010488, 4, (byte) -1);
        setByteElement(term1010488, 5, (byte) -1);
        setByteElement(term1010488, 6, (byte) -1);
        setByteElement(term1010488, 7, (byte) -1);
        setByteElement(term1010488, 8, (byte) -1);
        setByteElement(term1010488, 9, (byte) -1);
        setByteElement(term1010488, 10, (byte) -1);
        setByteElement(term1010488, 11, (byte) -1);
        setByteElement(term1010488, 12, (byte) -1);
        setByteElement(term1010488, 13, (byte) -1);
        setByteElement(term1010488, 14, (byte) -1);
        setByteElement(term1010488, 15, (byte) -1);
        setByteElement(term1010488, 16, (byte) -1);
        setByteElement(term1010488, 17, (byte) -1);
        setByteElement(term1010488, 18, (byte) -1);
        setByteElement(term1010488, 19, (byte) -1);
        setByteElement(term1010488, 20, (byte) -1);
        setByteElement(term1010488, 21, (byte) -1);
        setByteElement(term1010488, 22, (byte) -1);
        setByteElement(term1010488, 23, (byte) -1);
        setByteElement(term1010488, 24, (byte) -1);
        setByteElement(term1010488, 25, (byte) -1);
        setByteElement(term1010488, 26, (byte) -1);
        setByteElement(term1010488, 27, (byte) -1);
        setByteElement(term1010488, 28, (byte) -1);
        setByteElement(term1010488, 29, (byte) -1);
        setByteElement(term1010488, 30, (byte) -1);
        setByteElement(term1010488, 31, (byte) -1);
        setByteElement(term1010488, 32, (byte) -1);
        setByteElement(term1010488, 33, (byte) -1);
        setByteElement(term1010488, 34, (byte) -1);
        setByteElement(term1010488, 35, (byte) -1);
        setByteElement(term1010488, 36, (byte) -1);
        setByteElement(term1010488, 37, (byte) -1);
        setByteElement(term1010488, 38, (byte) -1);
        setByteElement(term1010488, 39, (byte) -1);
        setByteElement(term1010488, 40, (byte) -1);
        setByteElement(term1010488, 41, (byte) -1);
        setByteElement(term1010488, 42, (byte) -1);
        setByteElement(term1010488, 43, (byte) -1);
        setByteElement(term1010488, 44, (byte) -1);
        setByteElement(term1010488, 45, (byte) -1);
        setByteElement(term1010488, 46, (byte) -1);
        setByteElement(term1010488, 47, (byte) -1);
        setByteElement(term1010488, 49, (byte) 1);
        setByteElement(term1010488, 50, (byte) 2);
        setByteElement(term1010488, 51, (byte) 3);
        setByteElement(term1010488, 52, (byte) 4);
        setByteElement(term1010488, 53, (byte) 5);
        setByteElement(term1010488, 54, (byte) 6);
        setByteElement(term1010488, 55, (byte) 7);
        setByteElement(term1010488, 56, (byte) 8);
        setByteElement(term1010488, 57, (byte) 9);
        setByteElement(term1010488, 58, (byte) -1);
        setByteElement(term1010488, 59, (byte) -1);
        setByteElement(term1010488, 60, (byte) -1);
        setByteElement(term1010488, 61, (byte) -1);
        setByteElement(term1010488, 62, (byte) -1);
        setByteElement(term1010488, 63, (byte) -1);
        setByteElement(term1010488, 64, (byte) -1);
        setByteElement(term1010488, 65, (byte) 10);
        setByteElement(term1010488, 66, (byte) 11);
        setByteElement(term1010488, 67, (byte) 12);
        setByteElement(term1010488, 68, (byte) 13);
        setByteElement(term1010488, 69, (byte) 14);
        setByteElement(term1010488, 70, (byte) 15);
        setByteElement(term1010488, 71, (byte) 16);
        setByteElement(term1010488, 72, (byte) 17);
        setByteElement(term1010488, 73, (byte) 18);
        setByteElement(term1010488, 74, (byte) 19);
        setByteElement(term1010488, 75, (byte) 20);
        setByteElement(term1010488, 76, (byte) 21);
        setByteElement(term1010488, 77, (byte) 22);
        setByteElement(term1010488, 78, (byte) 23);
        setByteElement(term1010488, 79, (byte) 24);
        setByteElement(term1010488, 80, (byte) 25);
        setByteElement(term1010488, 81, (byte) 26);
        setByteElement(term1010488, 82, (byte) 27);
        setByteElement(term1010488, 83, (byte) 28);
        setByteElement(term1010488, 84, (byte) 29);
        setByteElement(term1010488, 85, (byte) 30);
        setByteElement(term1010488, 86, (byte) 31);
        setByteElement(term1010488, 87, (byte) 32);
        setField(term1010487, term1010487.getClass(), "decodeTable", term1010488);
        setIntField(term1010487, term1010487.getClass(), "encodeSize", 13);
        setByteElement(term1010489, 0, (byte) 48);
        setByteElement(term1010489, 1, (byte) 49);
        setByteElement(term1010489, 2, (byte) 50);
        setByteElement(term1010489, 3, (byte) 51);
        setByteElement(term1010489, 4, (byte) 52);
        setByteElement(term1010489, 5, (byte) 53);
        setByteElement(term1010489, 6, (byte) 54);
        setByteElement(term1010489, 7, (byte) 55);
        setByteElement(term1010489, 8, (byte) 56);
        setByteElement(term1010489, 9, (byte) 57);
        setByteElement(term1010489, 10, (byte) 65);
        setByteElement(term1010489, 11, (byte) 66);
        setByteElement(term1010489, 12, (byte) 67);
        setByteElement(term1010489, 13, (byte) 68);
        setByteElement(term1010489, 14, (byte) 69);
        setByteElement(term1010489, 15, (byte) 70);
        setByteElement(term1010489, 16, (byte) 71);
        setByteElement(term1010489, 17, (byte) 72);
        setByteElement(term1010489, 18, (byte) 73);
        setByteElement(term1010489, 19, (byte) 74);
        setByteElement(term1010489, 20, (byte) 75);
        setByteElement(term1010489, 21, (byte) 76);
        setByteElement(term1010489, 22, (byte) 77);
        setByteElement(term1010489, 23, (byte) 78);
        setByteElement(term1010489, 24, (byte) 79);
        setByteElement(term1010489, 25, (byte) 80);
        setByteElement(term1010489, 26, (byte) 81);
        setByteElement(term1010489, 27, (byte) 82);
        setByteElement(term1010489, 28, (byte) 83);
        setByteElement(term1010489, 29, (byte) 84);
        setByteElement(term1010489, 30, (byte) 85);
        setByteElement(term1010489, 31, (byte) 86);
        setField(term1010487, term1010487.getClass(), "encodeTable", term1010489);
        setField(term1010487, term1010487.getClass(), "lineSeparator", term1010490);
        setByteField(term1010487, term1010487.getClass(), "PAD", (byte) 61);
        setByteField(term1010487, term1010487.getClass(), "pad", (byte) 61);
        setIntField(term1010487, term1010487.getClass(), "unencodedBlockSize", 5);
        setIntField(term1010487, term1010487.getClass(), "encodedBlockSize", 8);
        setIntField(term1010487, term1010487.getClass(), "lineLength", 0);
        setIntField(term1010487, term1010487.getClass(), "chunkSeparatorLength", 5);
        term1010491 = (byte[]) newByteArray(5);
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
        args[1] = term945043;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1010487));
        assertTrue(recursiveEquals(term945043, term1010491));
    }

};


