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

public class Base32_init_1099337581279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510037;
     Object term510817;
     Object term510820;

    public Base32_init_1099337581279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term510182 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term510037 = (byte[]) newByteArray(8);
        byte[] term510071 = (byte[]) newByteArray(0);
        setByteField(term510182, term510182.getClass(), "PAD", (byte) 0);
        setIntField(term510182, term510182.getClass(), "unencodedBlockSize", 0);
        setIntField(term510182, term510182.getClass(), "encodedBlockSize", 0);
        setIntField(term510182, term510182.getClass(), "lineLength", 0);
        setIntField(term510182, term510182.getClass(), "chunkSeparatorLength", 0);
        setByteField(term510182, term510182.getClass(), "pad", (byte) 0);
        setField(term510182, term510182.getClass(), "encodeTable", term510037);
        setField(term510182, term510182.getClass(), "decodeTable", term510037);
        setIntField(term510182, term510182.getClass(), "encodeSize", 0);
        setField(term510182, term510182.getClass(), "lineSeparator", term510071);
        setIntField(term510182, term510182.getClass(), "decodeSize", 0);
        term510817 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term510818 = (byte[]) newByteArray(88);
        byte[] term510819 = (byte[]) newByteArray(32);
        setIntField(term510817, term510817.getClass(), "decodeSize", 7);
        setByteElement(term510818, 0, (byte) -1);
        setByteElement(term510818, 1, (byte) -1);
        setByteElement(term510818, 2, (byte) -1);
        setByteElement(term510818, 3, (byte) -1);
        setByteElement(term510818, 4, (byte) -1);
        setByteElement(term510818, 5, (byte) -1);
        setByteElement(term510818, 6, (byte) -1);
        setByteElement(term510818, 7, (byte) -1);
        setByteElement(term510818, 8, (byte) -1);
        setByteElement(term510818, 9, (byte) -1);
        setByteElement(term510818, 10, (byte) -1);
        setByteElement(term510818, 11, (byte) -1);
        setByteElement(term510818, 12, (byte) -1);
        setByteElement(term510818, 13, (byte) -1);
        setByteElement(term510818, 14, (byte) -1);
        setByteElement(term510818, 15, (byte) -1);
        setByteElement(term510818, 16, (byte) -1);
        setByteElement(term510818, 17, (byte) -1);
        setByteElement(term510818, 18, (byte) -1);
        setByteElement(term510818, 19, (byte) -1);
        setByteElement(term510818, 20, (byte) -1);
        setByteElement(term510818, 21, (byte) -1);
        setByteElement(term510818, 22, (byte) -1);
        setByteElement(term510818, 23, (byte) -1);
        setByteElement(term510818, 24, (byte) -1);
        setByteElement(term510818, 25, (byte) -1);
        setByteElement(term510818, 26, (byte) -1);
        setByteElement(term510818, 27, (byte) -1);
        setByteElement(term510818, 28, (byte) -1);
        setByteElement(term510818, 29, (byte) -1);
        setByteElement(term510818, 30, (byte) -1);
        setByteElement(term510818, 31, (byte) -1);
        setByteElement(term510818, 32, (byte) -1);
        setByteElement(term510818, 33, (byte) -1);
        setByteElement(term510818, 34, (byte) -1);
        setByteElement(term510818, 35, (byte) -1);
        setByteElement(term510818, 36, (byte) -1);
        setByteElement(term510818, 37, (byte) -1);
        setByteElement(term510818, 38, (byte) -1);
        setByteElement(term510818, 39, (byte) -1);
        setByteElement(term510818, 40, (byte) -1);
        setByteElement(term510818, 41, (byte) -1);
        setByteElement(term510818, 42, (byte) -1);
        setByteElement(term510818, 43, (byte) -1);
        setByteElement(term510818, 44, (byte) -1);
        setByteElement(term510818, 45, (byte) -1);
        setByteElement(term510818, 46, (byte) -1);
        setByteElement(term510818, 47, (byte) -1);
        setByteElement(term510818, 49, (byte) 1);
        setByteElement(term510818, 50, (byte) 2);
        setByteElement(term510818, 51, (byte) 3);
        setByteElement(term510818, 52, (byte) 4);
        setByteElement(term510818, 53, (byte) 5);
        setByteElement(term510818, 54, (byte) 6);
        setByteElement(term510818, 55, (byte) 7);
        setByteElement(term510818, 56, (byte) 8);
        setByteElement(term510818, 57, (byte) 9);
        setByteElement(term510818, 58, (byte) -1);
        setByteElement(term510818, 59, (byte) -1);
        setByteElement(term510818, 60, (byte) -1);
        setByteElement(term510818, 61, (byte) -1);
        setByteElement(term510818, 62, (byte) -1);
        setByteElement(term510818, 63, (byte) -1);
        setByteElement(term510818, 64, (byte) -1);
        setByteElement(term510818, 65, (byte) 10);
        setByteElement(term510818, 66, (byte) 11);
        setByteElement(term510818, 67, (byte) 12);
        setByteElement(term510818, 68, (byte) 13);
        setByteElement(term510818, 69, (byte) 14);
        setByteElement(term510818, 70, (byte) 15);
        setByteElement(term510818, 71, (byte) 16);
        setByteElement(term510818, 72, (byte) 17);
        setByteElement(term510818, 73, (byte) 18);
        setByteElement(term510818, 74, (byte) 19);
        setByteElement(term510818, 75, (byte) 20);
        setByteElement(term510818, 76, (byte) 21);
        setByteElement(term510818, 77, (byte) 22);
        setByteElement(term510818, 78, (byte) 23);
        setByteElement(term510818, 79, (byte) 24);
        setByteElement(term510818, 80, (byte) 25);
        setByteElement(term510818, 81, (byte) 26);
        setByteElement(term510818, 82, (byte) 27);
        setByteElement(term510818, 83, (byte) 28);
        setByteElement(term510818, 84, (byte) 29);
        setByteElement(term510818, 85, (byte) 30);
        setByteElement(term510818, 86, (byte) 31);
        setByteElement(term510818, 87, (byte) 32);
        setField(term510817, term510817.getClass(), "decodeTable", term510818);
        setIntField(term510817, term510817.getClass(), "encodeSize", 8);
        setByteElement(term510819, 0, (byte) 48);
        setByteElement(term510819, 1, (byte) 49);
        setByteElement(term510819, 2, (byte) 50);
        setByteElement(term510819, 3, (byte) 51);
        setByteElement(term510819, 4, (byte) 52);
        setByteElement(term510819, 5, (byte) 53);
        setByteElement(term510819, 6, (byte) 54);
        setByteElement(term510819, 7, (byte) 55);
        setByteElement(term510819, 8, (byte) 56);
        setByteElement(term510819, 9, (byte) 57);
        setByteElement(term510819, 10, (byte) 65);
        setByteElement(term510819, 11, (byte) 66);
        setByteElement(term510819, 12, (byte) 67);
        setByteElement(term510819, 13, (byte) 68);
        setByteElement(term510819, 14, (byte) 69);
        setByteElement(term510819, 15, (byte) 70);
        setByteElement(term510819, 16, (byte) 71);
        setByteElement(term510819, 17, (byte) 72);
        setByteElement(term510819, 18, (byte) 73);
        setByteElement(term510819, 19, (byte) 74);
        setByteElement(term510819, 20, (byte) 75);
        setByteElement(term510819, 21, (byte) 76);
        setByteElement(term510819, 22, (byte) 77);
        setByteElement(term510819, 23, (byte) 78);
        setByteElement(term510819, 24, (byte) 79);
        setByteElement(term510819, 25, (byte) 80);
        setByteElement(term510819, 26, (byte) 81);
        setByteElement(term510819, 27, (byte) 82);
        setByteElement(term510819, 28, (byte) 83);
        setByteElement(term510819, 29, (byte) 84);
        setByteElement(term510819, 30, (byte) 85);
        setByteElement(term510819, 31, (byte) 86);
        setField(term510817, term510817.getClass(), "encodeTable", term510819);
        setField(term510817, term510817.getClass(), "lineSeparator", null);
        setByteField(term510817, term510817.getClass(), "PAD", (byte) 61);
        setByteField(term510817, term510817.getClass(), "pad", (byte) -128);
        setIntField(term510817, term510817.getClass(), "unencodedBlockSize", 5);
        setIntField(term510817, term510817.getClass(), "encodedBlockSize", 8);
        setIntField(term510817, term510817.getClass(), "lineLength", 0);
        setIntField(term510817, term510817.getClass(), "chunkSeparatorLength", 8);
        term510820 = (byte[]) newByteArray(8);
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
        args[1] = term510037;
        args[2] = true;
        args[3] = (byte) -128;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term510817));
        assertTrue(recursiveEquals(term510037, (byte) -128));
    }

};


