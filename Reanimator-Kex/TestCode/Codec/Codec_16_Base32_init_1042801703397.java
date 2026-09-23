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

public class Base32_init_1042801703397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790187;
     Object term824974;
     Object term824978;

    public Base32_init_1042801703397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term792303 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term792303, term792303.getClass(), "PAD", (byte) -128);
        setIntField(term792303, term792303.getClass(), "unencodedBlockSize", 0);
        setIntField(term792303, term792303.getClass(), "encodedBlockSize", 0);
        setIntField(term792303, term792303.getClass(), "lineLength", 0);
        setIntField(term792303, term792303.getClass(), "chunkSeparatorLength", 0);
        setByteField(term792303, term792303.getClass(), "pad", (byte) -128);
        setField(term792303, term792303.getClass(), "encodeTable", null);
        setField(term792303, term792303.getClass(), "decodeTable", null);
        term790187 = (byte[]) newByteArray(505);
        term824974 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term824975 = (byte[]) newByteArray(88);
        byte[] term824976 = (byte[]) newByteArray(32);
        byte[] term824977 = (byte[]) newByteArray(505);
        setIntField(term824974, term824974.getClass(), "decodeSize", 512);
        setByteElement(term824975, 0, (byte) -1);
        setByteElement(term824975, 1, (byte) -1);
        setByteElement(term824975, 2, (byte) -1);
        setByteElement(term824975, 3, (byte) -1);
        setByteElement(term824975, 4, (byte) -1);
        setByteElement(term824975, 5, (byte) -1);
        setByteElement(term824975, 6, (byte) -1);
        setByteElement(term824975, 7, (byte) -1);
        setByteElement(term824975, 8, (byte) -1);
        setByteElement(term824975, 9, (byte) -1);
        setByteElement(term824975, 10, (byte) -1);
        setByteElement(term824975, 11, (byte) -1);
        setByteElement(term824975, 12, (byte) -1);
        setByteElement(term824975, 13, (byte) -1);
        setByteElement(term824975, 14, (byte) -1);
        setByteElement(term824975, 15, (byte) -1);
        setByteElement(term824975, 16, (byte) -1);
        setByteElement(term824975, 17, (byte) -1);
        setByteElement(term824975, 18, (byte) -1);
        setByteElement(term824975, 19, (byte) -1);
        setByteElement(term824975, 20, (byte) -1);
        setByteElement(term824975, 21, (byte) -1);
        setByteElement(term824975, 22, (byte) -1);
        setByteElement(term824975, 23, (byte) -1);
        setByteElement(term824975, 24, (byte) -1);
        setByteElement(term824975, 25, (byte) -1);
        setByteElement(term824975, 26, (byte) -1);
        setByteElement(term824975, 27, (byte) -1);
        setByteElement(term824975, 28, (byte) -1);
        setByteElement(term824975, 29, (byte) -1);
        setByteElement(term824975, 30, (byte) -1);
        setByteElement(term824975, 31, (byte) -1);
        setByteElement(term824975, 32, (byte) -1);
        setByteElement(term824975, 33, (byte) -1);
        setByteElement(term824975, 34, (byte) -1);
        setByteElement(term824975, 35, (byte) -1);
        setByteElement(term824975, 36, (byte) -1);
        setByteElement(term824975, 37, (byte) -1);
        setByteElement(term824975, 38, (byte) -1);
        setByteElement(term824975, 39, (byte) -1);
        setByteElement(term824975, 40, (byte) -1);
        setByteElement(term824975, 41, (byte) -1);
        setByteElement(term824975, 42, (byte) -1);
        setByteElement(term824975, 43, (byte) -1);
        setByteElement(term824975, 44, (byte) -1);
        setByteElement(term824975, 45, (byte) -1);
        setByteElement(term824975, 46, (byte) -1);
        setByteElement(term824975, 47, (byte) -1);
        setByteElement(term824975, 49, (byte) 1);
        setByteElement(term824975, 50, (byte) 2);
        setByteElement(term824975, 51, (byte) 3);
        setByteElement(term824975, 52, (byte) 4);
        setByteElement(term824975, 53, (byte) 5);
        setByteElement(term824975, 54, (byte) 6);
        setByteElement(term824975, 55, (byte) 7);
        setByteElement(term824975, 56, (byte) 8);
        setByteElement(term824975, 57, (byte) 9);
        setByteElement(term824975, 58, (byte) -1);
        setByteElement(term824975, 59, (byte) -1);
        setByteElement(term824975, 60, (byte) -1);
        setByteElement(term824975, 61, (byte) -1);
        setByteElement(term824975, 62, (byte) -1);
        setByteElement(term824975, 63, (byte) -1);
        setByteElement(term824975, 64, (byte) -1);
        setByteElement(term824975, 65, (byte) 10);
        setByteElement(term824975, 66, (byte) 11);
        setByteElement(term824975, 67, (byte) 12);
        setByteElement(term824975, 68, (byte) 13);
        setByteElement(term824975, 69, (byte) 14);
        setByteElement(term824975, 70, (byte) 15);
        setByteElement(term824975, 71, (byte) 16);
        setByteElement(term824975, 72, (byte) 17);
        setByteElement(term824975, 73, (byte) 18);
        setByteElement(term824975, 74, (byte) 19);
        setByteElement(term824975, 75, (byte) 20);
        setByteElement(term824975, 76, (byte) 21);
        setByteElement(term824975, 77, (byte) 22);
        setByteElement(term824975, 78, (byte) 23);
        setByteElement(term824975, 79, (byte) 24);
        setByteElement(term824975, 80, (byte) 25);
        setByteElement(term824975, 81, (byte) 26);
        setByteElement(term824975, 82, (byte) 27);
        setByteElement(term824975, 83, (byte) 28);
        setByteElement(term824975, 84, (byte) 29);
        setByteElement(term824975, 85, (byte) 30);
        setByteElement(term824975, 86, (byte) 31);
        setByteElement(term824975, 87, (byte) 32);
        setField(term824974, term824974.getClass(), "decodeTable", term824975);
        setIntField(term824974, term824974.getClass(), "encodeSize", 513);
        setByteElement(term824976, 0, (byte) 48);
        setByteElement(term824976, 1, (byte) 49);
        setByteElement(term824976, 2, (byte) 50);
        setByteElement(term824976, 3, (byte) 51);
        setByteElement(term824976, 4, (byte) 52);
        setByteElement(term824976, 5, (byte) 53);
        setByteElement(term824976, 6, (byte) 54);
        setByteElement(term824976, 7, (byte) 55);
        setByteElement(term824976, 8, (byte) 56);
        setByteElement(term824976, 9, (byte) 57);
        setByteElement(term824976, 10, (byte) 65);
        setByteElement(term824976, 11, (byte) 66);
        setByteElement(term824976, 12, (byte) 67);
        setByteElement(term824976, 13, (byte) 68);
        setByteElement(term824976, 14, (byte) 69);
        setByteElement(term824976, 15, (byte) 70);
        setByteElement(term824976, 16, (byte) 71);
        setByteElement(term824976, 17, (byte) 72);
        setByteElement(term824976, 18, (byte) 73);
        setByteElement(term824976, 19, (byte) 74);
        setByteElement(term824976, 20, (byte) 75);
        setByteElement(term824976, 21, (byte) 76);
        setByteElement(term824976, 22, (byte) 77);
        setByteElement(term824976, 23, (byte) 78);
        setByteElement(term824976, 24, (byte) 79);
        setByteElement(term824976, 25, (byte) 80);
        setByteElement(term824976, 26, (byte) 81);
        setByteElement(term824976, 27, (byte) 82);
        setByteElement(term824976, 28, (byte) 83);
        setByteElement(term824976, 29, (byte) 84);
        setByteElement(term824976, 30, (byte) 85);
        setByteElement(term824976, 31, (byte) 86);
        setField(term824974, term824974.getClass(), "encodeTable", term824976);
        setField(term824974, term824974.getClass(), "lineSeparator", term824977);
        setByteField(term824974, term824974.getClass(), "PAD", (byte) 61);
        setByteField(term824974, term824974.getClass(), "pad", (byte) 61);
        setIntField(term824974, term824974.getClass(), "unencodedBlockSize", 5);
        setIntField(term824974, term824974.getClass(), "encodedBlockSize", 8);
        setIntField(term824974, term824974.getClass(), "lineLength", 0);
        setIntField(term824974, term824974.getClass(), "chunkSeparatorLength", 505);
        term824978 = (byte[]) newByteArray(505);
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
        args[1] = term790187;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term824974));
        assertTrue(recursiveEquals(term790187, term824978));
    }

};


