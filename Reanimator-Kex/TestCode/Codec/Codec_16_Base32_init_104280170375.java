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

public class Base32_init_104280170375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47513;
     Object term48026;
     Object term48030;

    public Base32_init_104280170375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47614 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term47614, term47614.getClass(), "PAD", (byte) 0);
        setIntField(term47614, term47614.getClass(), "unencodedBlockSize", 0);
        setIntField(term47614, term47614.getClass(), "encodedBlockSize", 0);
        term47513 = (byte[]) newByteArray(0);
        term48026 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term48027 = (byte[]) newByteArray(91);
        byte[] term48028 = (byte[]) newByteArray(32);
        byte[] term48029 = (byte[]) newByteArray(0);
        setIntField(term48026, term48026.getClass(), "decodeSize", 7);
        setByteElement(term48027, 0, (byte) -1);
        setByteElement(term48027, 1, (byte) -1);
        setByteElement(term48027, 2, (byte) -1);
        setByteElement(term48027, 3, (byte) -1);
        setByteElement(term48027, 4, (byte) -1);
        setByteElement(term48027, 5, (byte) -1);
        setByteElement(term48027, 6, (byte) -1);
        setByteElement(term48027, 7, (byte) -1);
        setByteElement(term48027, 8, (byte) -1);
        setByteElement(term48027, 9, (byte) -1);
        setByteElement(term48027, 10, (byte) -1);
        setByteElement(term48027, 11, (byte) -1);
        setByteElement(term48027, 12, (byte) -1);
        setByteElement(term48027, 13, (byte) -1);
        setByteElement(term48027, 14, (byte) -1);
        setByteElement(term48027, 15, (byte) -1);
        setByteElement(term48027, 16, (byte) -1);
        setByteElement(term48027, 17, (byte) -1);
        setByteElement(term48027, 18, (byte) -1);
        setByteElement(term48027, 19, (byte) -1);
        setByteElement(term48027, 20, (byte) -1);
        setByteElement(term48027, 21, (byte) -1);
        setByteElement(term48027, 22, (byte) -1);
        setByteElement(term48027, 23, (byte) -1);
        setByteElement(term48027, 24, (byte) -1);
        setByteElement(term48027, 25, (byte) -1);
        setByteElement(term48027, 26, (byte) -1);
        setByteElement(term48027, 27, (byte) -1);
        setByteElement(term48027, 28, (byte) -1);
        setByteElement(term48027, 29, (byte) -1);
        setByteElement(term48027, 30, (byte) -1);
        setByteElement(term48027, 31, (byte) -1);
        setByteElement(term48027, 32, (byte) -1);
        setByteElement(term48027, 33, (byte) -1);
        setByteElement(term48027, 34, (byte) -1);
        setByteElement(term48027, 35, (byte) -1);
        setByteElement(term48027, 36, (byte) -1);
        setByteElement(term48027, 37, (byte) -1);
        setByteElement(term48027, 38, (byte) -1);
        setByteElement(term48027, 39, (byte) -1);
        setByteElement(term48027, 40, (byte) -1);
        setByteElement(term48027, 41, (byte) -1);
        setByteElement(term48027, 42, (byte) -1);
        setByteElement(term48027, 43, (byte) -1);
        setByteElement(term48027, 44, (byte) -1);
        setByteElement(term48027, 45, (byte) -1);
        setByteElement(term48027, 46, (byte) -1);
        setByteElement(term48027, 47, (byte) -1);
        setByteElement(term48027, 48, (byte) -1);
        setByteElement(term48027, 49, (byte) -1);
        setByteElement(term48027, 50, (byte) 26);
        setByteElement(term48027, 51, (byte) 27);
        setByteElement(term48027, 52, (byte) 28);
        setByteElement(term48027, 53, (byte) 29);
        setByteElement(term48027, 54, (byte) 30);
        setByteElement(term48027, 55, (byte) 31);
        setByteElement(term48027, 56, (byte) -1);
        setByteElement(term48027, 57, (byte) -1);
        setByteElement(term48027, 58, (byte) -1);
        setByteElement(term48027, 59, (byte) -1);
        setByteElement(term48027, 60, (byte) -1);
        setByteElement(term48027, 61, (byte) -1);
        setByteElement(term48027, 62, (byte) -1);
        setByteElement(term48027, 63, (byte) -1);
        setByteElement(term48027, 64, (byte) -1);
        setByteElement(term48027, 66, (byte) 1);
        setByteElement(term48027, 67, (byte) 2);
        setByteElement(term48027, 68, (byte) 3);
        setByteElement(term48027, 69, (byte) 4);
        setByteElement(term48027, 70, (byte) 5);
        setByteElement(term48027, 71, (byte) 6);
        setByteElement(term48027, 72, (byte) 7);
        setByteElement(term48027, 73, (byte) 8);
        setByteElement(term48027, 74, (byte) 9);
        setByteElement(term48027, 75, (byte) 10);
        setByteElement(term48027, 76, (byte) 11);
        setByteElement(term48027, 77, (byte) 12);
        setByteElement(term48027, 78, (byte) 13);
        setByteElement(term48027, 79, (byte) 14);
        setByteElement(term48027, 80, (byte) 15);
        setByteElement(term48027, 81, (byte) 16);
        setByteElement(term48027, 82, (byte) 17);
        setByteElement(term48027, 83, (byte) 18);
        setByteElement(term48027, 84, (byte) 19);
        setByteElement(term48027, 85, (byte) 20);
        setByteElement(term48027, 86, (byte) 21);
        setByteElement(term48027, 87, (byte) 22);
        setByteElement(term48027, 88, (byte) 23);
        setByteElement(term48027, 89, (byte) 24);
        setByteElement(term48027, 90, (byte) 25);
        setField(term48026, term48026.getClass(), "decodeTable", term48027);
        setIntField(term48026, term48026.getClass(), "encodeSize", 8);
        setByteElement(term48028, 0, (byte) 65);
        setByteElement(term48028, 1, (byte) 66);
        setByteElement(term48028, 2, (byte) 67);
        setByteElement(term48028, 3, (byte) 68);
        setByteElement(term48028, 4, (byte) 69);
        setByteElement(term48028, 5, (byte) 70);
        setByteElement(term48028, 6, (byte) 71);
        setByteElement(term48028, 7, (byte) 72);
        setByteElement(term48028, 8, (byte) 73);
        setByteElement(term48028, 9, (byte) 74);
        setByteElement(term48028, 10, (byte) 75);
        setByteElement(term48028, 11, (byte) 76);
        setByteElement(term48028, 12, (byte) 77);
        setByteElement(term48028, 13, (byte) 78);
        setByteElement(term48028, 14, (byte) 79);
        setByteElement(term48028, 15, (byte) 80);
        setByteElement(term48028, 16, (byte) 81);
        setByteElement(term48028, 17, (byte) 82);
        setByteElement(term48028, 18, (byte) 83);
        setByteElement(term48028, 19, (byte) 84);
        setByteElement(term48028, 20, (byte) 85);
        setByteElement(term48028, 21, (byte) 86);
        setByteElement(term48028, 22, (byte) 87);
        setByteElement(term48028, 23, (byte) 88);
        setByteElement(term48028, 24, (byte) 89);
        setByteElement(term48028, 25, (byte) 90);
        setByteElement(term48028, 26, (byte) 50);
        setByteElement(term48028, 27, (byte) 51);
        setByteElement(term48028, 28, (byte) 52);
        setByteElement(term48028, 29, (byte) 53);
        setByteElement(term48028, 30, (byte) 54);
        setByteElement(term48028, 31, (byte) 55);
        setField(term48026, term48026.getClass(), "encodeTable", term48028);
        setField(term48026, term48026.getClass(), "lineSeparator", term48029);
        setByteField(term48026, term48026.getClass(), "PAD", (byte) 61);
        setByteField(term48026, term48026.getClass(), "pad", (byte) 61);
        setIntField(term48026, term48026.getClass(), "unencodedBlockSize", 5);
        setIntField(term48026, term48026.getClass(), "encodedBlockSize", 8);
        setIntField(term48026, term48026.getClass(), "lineLength", 0);
        setIntField(term48026, term48026.getClass(), "chunkSeparatorLength", 0);
        term48030 = (byte[]) newByteArray(0);
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
        args[1] = term47513;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term48026));
        assertTrue(recursiveEquals(term47513, term48030));
    }

};


