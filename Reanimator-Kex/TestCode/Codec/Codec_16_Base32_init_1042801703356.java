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

public class Base32_init_1042801703356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term682280;
     Object term726628;
     Object term726632;

    public Base32_init_1042801703356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term684294 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term683375 = (byte[]) newByteArray(0);
        setByteField(term684294, term684294.getClass(), "PAD", (byte) 0);
        setIntField(term684294, term684294.getClass(), "unencodedBlockSize", 0);
        setIntField(term684294, term684294.getClass(), "encodedBlockSize", 0);
        setIntField(term684294, term684294.getClass(), "lineLength", 0);
        setIntField(term684294, term684294.getClass(), "chunkSeparatorLength", 0);
        setByteField(term684294, term684294.getClass(), "pad", (byte) -128);
        setField(term684294, term684294.getClass(), "encodeTable", null);
        setField(term684294, term684294.getClass(), "decodeTable", term683375);
        term682280 = (byte[]) newByteArray(491);
        setByteElement(term682280, 3, (byte) 112);
        term726628 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term726629 = (byte[]) newByteArray(88);
        byte[] term726630 = (byte[]) newByteArray(32);
        byte[] term726631 = (byte[]) newByteArray(491);
        setIntField(term726628, term726628.getClass(), "decodeSize", 498);
        setByteElement(term726629, 0, (byte) -1);
        setByteElement(term726629, 1, (byte) -1);
        setByteElement(term726629, 2, (byte) -1);
        setByteElement(term726629, 3, (byte) -1);
        setByteElement(term726629, 4, (byte) -1);
        setByteElement(term726629, 5, (byte) -1);
        setByteElement(term726629, 6, (byte) -1);
        setByteElement(term726629, 7, (byte) -1);
        setByteElement(term726629, 8, (byte) -1);
        setByteElement(term726629, 9, (byte) -1);
        setByteElement(term726629, 10, (byte) -1);
        setByteElement(term726629, 11, (byte) -1);
        setByteElement(term726629, 12, (byte) -1);
        setByteElement(term726629, 13, (byte) -1);
        setByteElement(term726629, 14, (byte) -1);
        setByteElement(term726629, 15, (byte) -1);
        setByteElement(term726629, 16, (byte) -1);
        setByteElement(term726629, 17, (byte) -1);
        setByteElement(term726629, 18, (byte) -1);
        setByteElement(term726629, 19, (byte) -1);
        setByteElement(term726629, 20, (byte) -1);
        setByteElement(term726629, 21, (byte) -1);
        setByteElement(term726629, 22, (byte) -1);
        setByteElement(term726629, 23, (byte) -1);
        setByteElement(term726629, 24, (byte) -1);
        setByteElement(term726629, 25, (byte) -1);
        setByteElement(term726629, 26, (byte) -1);
        setByteElement(term726629, 27, (byte) -1);
        setByteElement(term726629, 28, (byte) -1);
        setByteElement(term726629, 29, (byte) -1);
        setByteElement(term726629, 30, (byte) -1);
        setByteElement(term726629, 31, (byte) -1);
        setByteElement(term726629, 32, (byte) -1);
        setByteElement(term726629, 33, (byte) -1);
        setByteElement(term726629, 34, (byte) -1);
        setByteElement(term726629, 35, (byte) -1);
        setByteElement(term726629, 36, (byte) -1);
        setByteElement(term726629, 37, (byte) -1);
        setByteElement(term726629, 38, (byte) -1);
        setByteElement(term726629, 39, (byte) -1);
        setByteElement(term726629, 40, (byte) -1);
        setByteElement(term726629, 41, (byte) -1);
        setByteElement(term726629, 42, (byte) -1);
        setByteElement(term726629, 43, (byte) -1);
        setByteElement(term726629, 44, (byte) -1);
        setByteElement(term726629, 45, (byte) -1);
        setByteElement(term726629, 46, (byte) -1);
        setByteElement(term726629, 47, (byte) -1);
        setByteElement(term726629, 49, (byte) 1);
        setByteElement(term726629, 50, (byte) 2);
        setByteElement(term726629, 51, (byte) 3);
        setByteElement(term726629, 52, (byte) 4);
        setByteElement(term726629, 53, (byte) 5);
        setByteElement(term726629, 54, (byte) 6);
        setByteElement(term726629, 55, (byte) 7);
        setByteElement(term726629, 56, (byte) 8);
        setByteElement(term726629, 57, (byte) 9);
        setByteElement(term726629, 58, (byte) -1);
        setByteElement(term726629, 59, (byte) -1);
        setByteElement(term726629, 60, (byte) -1);
        setByteElement(term726629, 61, (byte) -1);
        setByteElement(term726629, 62, (byte) -1);
        setByteElement(term726629, 63, (byte) -1);
        setByteElement(term726629, 64, (byte) -1);
        setByteElement(term726629, 65, (byte) 10);
        setByteElement(term726629, 66, (byte) 11);
        setByteElement(term726629, 67, (byte) 12);
        setByteElement(term726629, 68, (byte) 13);
        setByteElement(term726629, 69, (byte) 14);
        setByteElement(term726629, 70, (byte) 15);
        setByteElement(term726629, 71, (byte) 16);
        setByteElement(term726629, 72, (byte) 17);
        setByteElement(term726629, 73, (byte) 18);
        setByteElement(term726629, 74, (byte) 19);
        setByteElement(term726629, 75, (byte) 20);
        setByteElement(term726629, 76, (byte) 21);
        setByteElement(term726629, 77, (byte) 22);
        setByteElement(term726629, 78, (byte) 23);
        setByteElement(term726629, 79, (byte) 24);
        setByteElement(term726629, 80, (byte) 25);
        setByteElement(term726629, 81, (byte) 26);
        setByteElement(term726629, 82, (byte) 27);
        setByteElement(term726629, 83, (byte) 28);
        setByteElement(term726629, 84, (byte) 29);
        setByteElement(term726629, 85, (byte) 30);
        setByteElement(term726629, 86, (byte) 31);
        setByteElement(term726629, 87, (byte) 32);
        setField(term726628, term726628.getClass(), "decodeTable", term726629);
        setIntField(term726628, term726628.getClass(), "encodeSize", 499);
        setByteElement(term726630, 0, (byte) 48);
        setByteElement(term726630, 1, (byte) 49);
        setByteElement(term726630, 2, (byte) 50);
        setByteElement(term726630, 3, (byte) 51);
        setByteElement(term726630, 4, (byte) 52);
        setByteElement(term726630, 5, (byte) 53);
        setByteElement(term726630, 6, (byte) 54);
        setByteElement(term726630, 7, (byte) 55);
        setByteElement(term726630, 8, (byte) 56);
        setByteElement(term726630, 9, (byte) 57);
        setByteElement(term726630, 10, (byte) 65);
        setByteElement(term726630, 11, (byte) 66);
        setByteElement(term726630, 12, (byte) 67);
        setByteElement(term726630, 13, (byte) 68);
        setByteElement(term726630, 14, (byte) 69);
        setByteElement(term726630, 15, (byte) 70);
        setByteElement(term726630, 16, (byte) 71);
        setByteElement(term726630, 17, (byte) 72);
        setByteElement(term726630, 18, (byte) 73);
        setByteElement(term726630, 19, (byte) 74);
        setByteElement(term726630, 20, (byte) 75);
        setByteElement(term726630, 21, (byte) 76);
        setByteElement(term726630, 22, (byte) 77);
        setByteElement(term726630, 23, (byte) 78);
        setByteElement(term726630, 24, (byte) 79);
        setByteElement(term726630, 25, (byte) 80);
        setByteElement(term726630, 26, (byte) 81);
        setByteElement(term726630, 27, (byte) 82);
        setByteElement(term726630, 28, (byte) 83);
        setByteElement(term726630, 29, (byte) 84);
        setByteElement(term726630, 30, (byte) 85);
        setByteElement(term726630, 31, (byte) 86);
        setField(term726628, term726628.getClass(), "encodeTable", term726630);
        setByteElement(term726631, 3, (byte) 112);
        setField(term726628, term726628.getClass(), "lineSeparator", term726631);
        setByteField(term726628, term726628.getClass(), "PAD", (byte) 61);
        setByteField(term726628, term726628.getClass(), "pad", (byte) 61);
        setIntField(term726628, term726628.getClass(), "unencodedBlockSize", 5);
        setIntField(term726628, term726628.getClass(), "encodedBlockSize", 8);
        setIntField(term726628, term726628.getClass(), "lineLength", 0);
        setIntField(term726628, term726628.getClass(), "chunkSeparatorLength", 491);
        term726632 = (byte[]) newByteArray(491);
        setByteElement(term726632, 3, (byte) 112);
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
        args[1] = term682280;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term726628));
        assertTrue(recursiveEquals(term682280, term726632));
    }

};


