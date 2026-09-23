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

public class Base32_init_1099337581240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439029;

    public Base32_init_1099337581240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term437736 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term439029 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term439030 = (byte[]) newByteArray(91);
        byte[] term439031 = (byte[]) newByteArray(32);
        setIntField(term439029, term439029.getClass(), "decodeSize", 7);
        setByteElement(term439030, 0, (byte) -1);
        setByteElement(term439030, 1, (byte) -1);
        setByteElement(term439030, 2, (byte) -1);
        setByteElement(term439030, 3, (byte) -1);
        setByteElement(term439030, 4, (byte) -1);
        setByteElement(term439030, 5, (byte) -1);
        setByteElement(term439030, 6, (byte) -1);
        setByteElement(term439030, 7, (byte) -1);
        setByteElement(term439030, 8, (byte) -1);
        setByteElement(term439030, 9, (byte) -1);
        setByteElement(term439030, 10, (byte) -1);
        setByteElement(term439030, 11, (byte) -1);
        setByteElement(term439030, 12, (byte) -1);
        setByteElement(term439030, 13, (byte) -1);
        setByteElement(term439030, 14, (byte) -1);
        setByteElement(term439030, 15, (byte) -1);
        setByteElement(term439030, 16, (byte) -1);
        setByteElement(term439030, 17, (byte) -1);
        setByteElement(term439030, 18, (byte) -1);
        setByteElement(term439030, 19, (byte) -1);
        setByteElement(term439030, 20, (byte) -1);
        setByteElement(term439030, 21, (byte) -1);
        setByteElement(term439030, 22, (byte) -1);
        setByteElement(term439030, 23, (byte) -1);
        setByteElement(term439030, 24, (byte) -1);
        setByteElement(term439030, 25, (byte) -1);
        setByteElement(term439030, 26, (byte) -1);
        setByteElement(term439030, 27, (byte) -1);
        setByteElement(term439030, 28, (byte) -1);
        setByteElement(term439030, 29, (byte) -1);
        setByteElement(term439030, 30, (byte) -1);
        setByteElement(term439030, 31, (byte) -1);
        setByteElement(term439030, 32, (byte) -1);
        setByteElement(term439030, 33, (byte) -1);
        setByteElement(term439030, 34, (byte) -1);
        setByteElement(term439030, 35, (byte) -1);
        setByteElement(term439030, 36, (byte) -1);
        setByteElement(term439030, 37, (byte) -1);
        setByteElement(term439030, 38, (byte) -1);
        setByteElement(term439030, 39, (byte) -1);
        setByteElement(term439030, 40, (byte) -1);
        setByteElement(term439030, 41, (byte) -1);
        setByteElement(term439030, 42, (byte) -1);
        setByteElement(term439030, 43, (byte) -1);
        setByteElement(term439030, 44, (byte) -1);
        setByteElement(term439030, 45, (byte) -1);
        setByteElement(term439030, 46, (byte) -1);
        setByteElement(term439030, 47, (byte) -1);
        setByteElement(term439030, 48, (byte) -1);
        setByteElement(term439030, 49, (byte) -1);
        setByteElement(term439030, 50, (byte) 26);
        setByteElement(term439030, 51, (byte) 27);
        setByteElement(term439030, 52, (byte) 28);
        setByteElement(term439030, 53, (byte) 29);
        setByteElement(term439030, 54, (byte) 30);
        setByteElement(term439030, 55, (byte) 31);
        setByteElement(term439030, 56, (byte) -1);
        setByteElement(term439030, 57, (byte) -1);
        setByteElement(term439030, 58, (byte) -1);
        setByteElement(term439030, 59, (byte) -1);
        setByteElement(term439030, 60, (byte) -1);
        setByteElement(term439030, 61, (byte) -1);
        setByteElement(term439030, 62, (byte) -1);
        setByteElement(term439030, 63, (byte) -1);
        setByteElement(term439030, 64, (byte) -1);
        setByteElement(term439030, 66, (byte) 1);
        setByteElement(term439030, 67, (byte) 2);
        setByteElement(term439030, 68, (byte) 3);
        setByteElement(term439030, 69, (byte) 4);
        setByteElement(term439030, 70, (byte) 5);
        setByteElement(term439030, 71, (byte) 6);
        setByteElement(term439030, 72, (byte) 7);
        setByteElement(term439030, 73, (byte) 8);
        setByteElement(term439030, 74, (byte) 9);
        setByteElement(term439030, 75, (byte) 10);
        setByteElement(term439030, 76, (byte) 11);
        setByteElement(term439030, 77, (byte) 12);
        setByteElement(term439030, 78, (byte) 13);
        setByteElement(term439030, 79, (byte) 14);
        setByteElement(term439030, 80, (byte) 15);
        setByteElement(term439030, 81, (byte) 16);
        setByteElement(term439030, 82, (byte) 17);
        setByteElement(term439030, 83, (byte) 18);
        setByteElement(term439030, 84, (byte) 19);
        setByteElement(term439030, 85, (byte) 20);
        setByteElement(term439030, 86, (byte) 21);
        setByteElement(term439030, 87, (byte) 22);
        setByteElement(term439030, 88, (byte) 23);
        setByteElement(term439030, 89, (byte) 24);
        setByteElement(term439030, 90, (byte) 25);
        setField(term439029, term439029.getClass(), "decodeTable", term439030);
        setIntField(term439029, term439029.getClass(), "encodeSize", 8);
        setByteElement(term439031, 0, (byte) 65);
        setByteElement(term439031, 1, (byte) 66);
        setByteElement(term439031, 2, (byte) 67);
        setByteElement(term439031, 3, (byte) 68);
        setByteElement(term439031, 4, (byte) 69);
        setByteElement(term439031, 5, (byte) 70);
        setByteElement(term439031, 6, (byte) 71);
        setByteElement(term439031, 7, (byte) 72);
        setByteElement(term439031, 8, (byte) 73);
        setByteElement(term439031, 9, (byte) 74);
        setByteElement(term439031, 10, (byte) 75);
        setByteElement(term439031, 11, (byte) 76);
        setByteElement(term439031, 12, (byte) 77);
        setByteElement(term439031, 13, (byte) 78);
        setByteElement(term439031, 14, (byte) 79);
        setByteElement(term439031, 15, (byte) 80);
        setByteElement(term439031, 16, (byte) 81);
        setByteElement(term439031, 17, (byte) 82);
        setByteElement(term439031, 18, (byte) 83);
        setByteElement(term439031, 19, (byte) 84);
        setByteElement(term439031, 20, (byte) 85);
        setByteElement(term439031, 21, (byte) 86);
        setByteElement(term439031, 22, (byte) 87);
        setByteElement(term439031, 23, (byte) 88);
        setByteElement(term439031, 24, (byte) 89);
        setByteElement(term439031, 25, (byte) 90);
        setByteElement(term439031, 26, (byte) 50);
        setByteElement(term439031, 27, (byte) 51);
        setByteElement(term439031, 28, (byte) 52);
        setByteElement(term439031, 29, (byte) 53);
        setByteElement(term439031, 30, (byte) 54);
        setByteElement(term439031, 31, (byte) 55);
        setField(term439029, term439029.getClass(), "encodeTable", term439031);
        setField(term439029, term439029.getClass(), "lineSeparator", null);
        setByteField(term439029, term439029.getClass(), "PAD", (byte) 61);
        setByteField(term439029, term439029.getClass(), "pad", (byte) 0);
        setIntField(term439029, term439029.getClass(), "unencodedBlockSize", 5);
        setIntField(term439029, term439029.getClass(), "encodedBlockSize", 8);
        setIntField(term439029, term439029.getClass(), "lineLength", 0);
        setIntField(term439029, term439029.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        argTypes[3] = byte.class;
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = null;
        args[2] = false;
        args[3] = (byte) 0;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term439029));
    }

};


