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

public class Base32_init_1042801703100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98081;
     Object term113466;
     Object term113470;

    public Base32_init_1042801703100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term112760 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term99102 = (byte[]) newByteArray(0);
        setByteField(term112760, term112760.getClass(), "PAD", (byte) 0);
        setIntField(term112760, term112760.getClass(), "unencodedBlockSize", 0);
        setIntField(term112760, term112760.getClass(), "encodedBlockSize", 0);
        setIntField(term112760, term112760.getClass(), "lineLength", 0);
        setIntField(term112760, term112760.getClass(), "chunkSeparatorLength", 0);
        setByteField(term112760, term112760.getClass(), "pad", (byte) 0);
        setField(term112760, term112760.getClass(), "encodeTable", null);
        setField(term112760, term112760.getClass(), "decodeTable", term99102);
        setIntField(term112760, term112760.getClass(), "encodeSize", 0);
        setField(term112760, term112760.getClass(), "lineSeparator", null);
        setIntField(term112760, term112760.getClass(), "decodeSize", 0);
        term98081 = (byte[]) newByteArray(12);
        term113466 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term113467 = (byte[]) newByteArray(88);
        byte[] term113468 = (byte[]) newByteArray(32);
        byte[] term113469 = (byte[]) newByteArray(12);
        setIntField(term113466, term113466.getClass(), "decodeSize", 19);
        setByteElement(term113467, 0, (byte) -1);
        setByteElement(term113467, 1, (byte) -1);
        setByteElement(term113467, 2, (byte) -1);
        setByteElement(term113467, 3, (byte) -1);
        setByteElement(term113467, 4, (byte) -1);
        setByteElement(term113467, 5, (byte) -1);
        setByteElement(term113467, 6, (byte) -1);
        setByteElement(term113467, 7, (byte) -1);
        setByteElement(term113467, 8, (byte) -1);
        setByteElement(term113467, 9, (byte) -1);
        setByteElement(term113467, 10, (byte) -1);
        setByteElement(term113467, 11, (byte) -1);
        setByteElement(term113467, 12, (byte) -1);
        setByteElement(term113467, 13, (byte) -1);
        setByteElement(term113467, 14, (byte) -1);
        setByteElement(term113467, 15, (byte) -1);
        setByteElement(term113467, 16, (byte) -1);
        setByteElement(term113467, 17, (byte) -1);
        setByteElement(term113467, 18, (byte) -1);
        setByteElement(term113467, 19, (byte) -1);
        setByteElement(term113467, 20, (byte) -1);
        setByteElement(term113467, 21, (byte) -1);
        setByteElement(term113467, 22, (byte) -1);
        setByteElement(term113467, 23, (byte) -1);
        setByteElement(term113467, 24, (byte) -1);
        setByteElement(term113467, 25, (byte) -1);
        setByteElement(term113467, 26, (byte) -1);
        setByteElement(term113467, 27, (byte) -1);
        setByteElement(term113467, 28, (byte) -1);
        setByteElement(term113467, 29, (byte) -1);
        setByteElement(term113467, 30, (byte) -1);
        setByteElement(term113467, 31, (byte) -1);
        setByteElement(term113467, 32, (byte) -1);
        setByteElement(term113467, 33, (byte) -1);
        setByteElement(term113467, 34, (byte) -1);
        setByteElement(term113467, 35, (byte) -1);
        setByteElement(term113467, 36, (byte) -1);
        setByteElement(term113467, 37, (byte) -1);
        setByteElement(term113467, 38, (byte) -1);
        setByteElement(term113467, 39, (byte) -1);
        setByteElement(term113467, 40, (byte) -1);
        setByteElement(term113467, 41, (byte) -1);
        setByteElement(term113467, 42, (byte) -1);
        setByteElement(term113467, 43, (byte) -1);
        setByteElement(term113467, 44, (byte) -1);
        setByteElement(term113467, 45, (byte) -1);
        setByteElement(term113467, 46, (byte) -1);
        setByteElement(term113467, 47, (byte) -1);
        setByteElement(term113467, 49, (byte) 1);
        setByteElement(term113467, 50, (byte) 2);
        setByteElement(term113467, 51, (byte) 3);
        setByteElement(term113467, 52, (byte) 4);
        setByteElement(term113467, 53, (byte) 5);
        setByteElement(term113467, 54, (byte) 6);
        setByteElement(term113467, 55, (byte) 7);
        setByteElement(term113467, 56, (byte) 8);
        setByteElement(term113467, 57, (byte) 9);
        setByteElement(term113467, 58, (byte) -1);
        setByteElement(term113467, 59, (byte) -1);
        setByteElement(term113467, 60, (byte) -1);
        setByteElement(term113467, 61, (byte) -1);
        setByteElement(term113467, 62, (byte) -1);
        setByteElement(term113467, 63, (byte) -1);
        setByteElement(term113467, 64, (byte) -1);
        setByteElement(term113467, 65, (byte) 10);
        setByteElement(term113467, 66, (byte) 11);
        setByteElement(term113467, 67, (byte) 12);
        setByteElement(term113467, 68, (byte) 13);
        setByteElement(term113467, 69, (byte) 14);
        setByteElement(term113467, 70, (byte) 15);
        setByteElement(term113467, 71, (byte) 16);
        setByteElement(term113467, 72, (byte) 17);
        setByteElement(term113467, 73, (byte) 18);
        setByteElement(term113467, 74, (byte) 19);
        setByteElement(term113467, 75, (byte) 20);
        setByteElement(term113467, 76, (byte) 21);
        setByteElement(term113467, 77, (byte) 22);
        setByteElement(term113467, 78, (byte) 23);
        setByteElement(term113467, 79, (byte) 24);
        setByteElement(term113467, 80, (byte) 25);
        setByteElement(term113467, 81, (byte) 26);
        setByteElement(term113467, 82, (byte) 27);
        setByteElement(term113467, 83, (byte) 28);
        setByteElement(term113467, 84, (byte) 29);
        setByteElement(term113467, 85, (byte) 30);
        setByteElement(term113467, 86, (byte) 31);
        setByteElement(term113467, 87, (byte) 32);
        setField(term113466, term113466.getClass(), "decodeTable", term113467);
        setIntField(term113466, term113466.getClass(), "encodeSize", 20);
        setByteElement(term113468, 0, (byte) 48);
        setByteElement(term113468, 1, (byte) 49);
        setByteElement(term113468, 2, (byte) 50);
        setByteElement(term113468, 3, (byte) 51);
        setByteElement(term113468, 4, (byte) 52);
        setByteElement(term113468, 5, (byte) 53);
        setByteElement(term113468, 6, (byte) 54);
        setByteElement(term113468, 7, (byte) 55);
        setByteElement(term113468, 8, (byte) 56);
        setByteElement(term113468, 9, (byte) 57);
        setByteElement(term113468, 10, (byte) 65);
        setByteElement(term113468, 11, (byte) 66);
        setByteElement(term113468, 12, (byte) 67);
        setByteElement(term113468, 13, (byte) 68);
        setByteElement(term113468, 14, (byte) 69);
        setByteElement(term113468, 15, (byte) 70);
        setByteElement(term113468, 16, (byte) 71);
        setByteElement(term113468, 17, (byte) 72);
        setByteElement(term113468, 18, (byte) 73);
        setByteElement(term113468, 19, (byte) 74);
        setByteElement(term113468, 20, (byte) 75);
        setByteElement(term113468, 21, (byte) 76);
        setByteElement(term113468, 22, (byte) 77);
        setByteElement(term113468, 23, (byte) 78);
        setByteElement(term113468, 24, (byte) 79);
        setByteElement(term113468, 25, (byte) 80);
        setByteElement(term113468, 26, (byte) 81);
        setByteElement(term113468, 27, (byte) 82);
        setByteElement(term113468, 28, (byte) 83);
        setByteElement(term113468, 29, (byte) 84);
        setByteElement(term113468, 30, (byte) 85);
        setByteElement(term113468, 31, (byte) 86);
        setField(term113466, term113466.getClass(), "encodeTable", term113468);
        setField(term113466, term113466.getClass(), "lineSeparator", term113469);
        setByteField(term113466, term113466.getClass(), "PAD", (byte) 61);
        setByteField(term113466, term113466.getClass(), "pad", (byte) 61);
        setIntField(term113466, term113466.getClass(), "unencodedBlockSize", 5);
        setIntField(term113466, term113466.getClass(), "encodedBlockSize", 8);
        setIntField(term113466, term113466.getClass(), "lineLength", 0);
        setIntField(term113466, term113466.getClass(), "chunkSeparatorLength", 12);
        term113470 = (byte[]) newByteArray(12);
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
        args[1] = term98081;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term113466));
        assertTrue(recursiveEquals(term98081, term113470));
    }

};


