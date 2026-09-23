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

public class Base32_init_1042801703401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802417;
     Object term828160;
     Object term828164;

    public Base32_init_1042801703401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term811884 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term803433 = (byte[]) newByteArray(0);
        byte[] term810604 = (byte[]) newByteArray(0);
        setByteField(term811884, term811884.getClass(), "PAD", (byte) 0);
        setIntField(term811884, term811884.getClass(), "unencodedBlockSize", 0);
        setIntField(term811884, term811884.getClass(), "encodedBlockSize", 0);
        setIntField(term811884, term811884.getClass(), "lineLength", 0);
        setIntField(term811884, term811884.getClass(), "chunkSeparatorLength", 0);
        setByteField(term811884, term811884.getClass(), "pad", (byte) 0);
        setField(term811884, term811884.getClass(), "encodeTable", null);
        setField(term811884, term811884.getClass(), "decodeTable", term803433);
        setIntField(term811884, term811884.getClass(), "encodeSize", 0);
        setField(term811884, term811884.getClass(), "lineSeparator", term810604);
        setIntField(term811884, term811884.getClass(), "decodeSize", 0);
        term802417 = (byte[]) newByteArray(7);
        term828160 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term828161 = (byte[]) newByteArray(88);
        byte[] term828162 = (byte[]) newByteArray(32);
        byte[] term828163 = (byte[]) newByteArray(7);
        setIntField(term828160, term828160.getClass(), "decodeSize", 14);
        setByteElement(term828161, 0, (byte) -1);
        setByteElement(term828161, 1, (byte) -1);
        setByteElement(term828161, 2, (byte) -1);
        setByteElement(term828161, 3, (byte) -1);
        setByteElement(term828161, 4, (byte) -1);
        setByteElement(term828161, 5, (byte) -1);
        setByteElement(term828161, 6, (byte) -1);
        setByteElement(term828161, 7, (byte) -1);
        setByteElement(term828161, 8, (byte) -1);
        setByteElement(term828161, 9, (byte) -1);
        setByteElement(term828161, 10, (byte) -1);
        setByteElement(term828161, 11, (byte) -1);
        setByteElement(term828161, 12, (byte) -1);
        setByteElement(term828161, 13, (byte) -1);
        setByteElement(term828161, 14, (byte) -1);
        setByteElement(term828161, 15, (byte) -1);
        setByteElement(term828161, 16, (byte) -1);
        setByteElement(term828161, 17, (byte) -1);
        setByteElement(term828161, 18, (byte) -1);
        setByteElement(term828161, 19, (byte) -1);
        setByteElement(term828161, 20, (byte) -1);
        setByteElement(term828161, 21, (byte) -1);
        setByteElement(term828161, 22, (byte) -1);
        setByteElement(term828161, 23, (byte) -1);
        setByteElement(term828161, 24, (byte) -1);
        setByteElement(term828161, 25, (byte) -1);
        setByteElement(term828161, 26, (byte) -1);
        setByteElement(term828161, 27, (byte) -1);
        setByteElement(term828161, 28, (byte) -1);
        setByteElement(term828161, 29, (byte) -1);
        setByteElement(term828161, 30, (byte) -1);
        setByteElement(term828161, 31, (byte) -1);
        setByteElement(term828161, 32, (byte) -1);
        setByteElement(term828161, 33, (byte) -1);
        setByteElement(term828161, 34, (byte) -1);
        setByteElement(term828161, 35, (byte) -1);
        setByteElement(term828161, 36, (byte) -1);
        setByteElement(term828161, 37, (byte) -1);
        setByteElement(term828161, 38, (byte) -1);
        setByteElement(term828161, 39, (byte) -1);
        setByteElement(term828161, 40, (byte) -1);
        setByteElement(term828161, 41, (byte) -1);
        setByteElement(term828161, 42, (byte) -1);
        setByteElement(term828161, 43, (byte) -1);
        setByteElement(term828161, 44, (byte) -1);
        setByteElement(term828161, 45, (byte) -1);
        setByteElement(term828161, 46, (byte) -1);
        setByteElement(term828161, 47, (byte) -1);
        setByteElement(term828161, 49, (byte) 1);
        setByteElement(term828161, 50, (byte) 2);
        setByteElement(term828161, 51, (byte) 3);
        setByteElement(term828161, 52, (byte) 4);
        setByteElement(term828161, 53, (byte) 5);
        setByteElement(term828161, 54, (byte) 6);
        setByteElement(term828161, 55, (byte) 7);
        setByteElement(term828161, 56, (byte) 8);
        setByteElement(term828161, 57, (byte) 9);
        setByteElement(term828161, 58, (byte) -1);
        setByteElement(term828161, 59, (byte) -1);
        setByteElement(term828161, 60, (byte) -1);
        setByteElement(term828161, 61, (byte) -1);
        setByteElement(term828161, 62, (byte) -1);
        setByteElement(term828161, 63, (byte) -1);
        setByteElement(term828161, 64, (byte) -1);
        setByteElement(term828161, 65, (byte) 10);
        setByteElement(term828161, 66, (byte) 11);
        setByteElement(term828161, 67, (byte) 12);
        setByteElement(term828161, 68, (byte) 13);
        setByteElement(term828161, 69, (byte) 14);
        setByteElement(term828161, 70, (byte) 15);
        setByteElement(term828161, 71, (byte) 16);
        setByteElement(term828161, 72, (byte) 17);
        setByteElement(term828161, 73, (byte) 18);
        setByteElement(term828161, 74, (byte) 19);
        setByteElement(term828161, 75, (byte) 20);
        setByteElement(term828161, 76, (byte) 21);
        setByteElement(term828161, 77, (byte) 22);
        setByteElement(term828161, 78, (byte) 23);
        setByteElement(term828161, 79, (byte) 24);
        setByteElement(term828161, 80, (byte) 25);
        setByteElement(term828161, 81, (byte) 26);
        setByteElement(term828161, 82, (byte) 27);
        setByteElement(term828161, 83, (byte) 28);
        setByteElement(term828161, 84, (byte) 29);
        setByteElement(term828161, 85, (byte) 30);
        setByteElement(term828161, 86, (byte) 31);
        setByteElement(term828161, 87, (byte) 32);
        setField(term828160, term828160.getClass(), "decodeTable", term828161);
        setIntField(term828160, term828160.getClass(), "encodeSize", 15);
        setByteElement(term828162, 0, (byte) 48);
        setByteElement(term828162, 1, (byte) 49);
        setByteElement(term828162, 2, (byte) 50);
        setByteElement(term828162, 3, (byte) 51);
        setByteElement(term828162, 4, (byte) 52);
        setByteElement(term828162, 5, (byte) 53);
        setByteElement(term828162, 6, (byte) 54);
        setByteElement(term828162, 7, (byte) 55);
        setByteElement(term828162, 8, (byte) 56);
        setByteElement(term828162, 9, (byte) 57);
        setByteElement(term828162, 10, (byte) 65);
        setByteElement(term828162, 11, (byte) 66);
        setByteElement(term828162, 12, (byte) 67);
        setByteElement(term828162, 13, (byte) 68);
        setByteElement(term828162, 14, (byte) 69);
        setByteElement(term828162, 15, (byte) 70);
        setByteElement(term828162, 16, (byte) 71);
        setByteElement(term828162, 17, (byte) 72);
        setByteElement(term828162, 18, (byte) 73);
        setByteElement(term828162, 19, (byte) 74);
        setByteElement(term828162, 20, (byte) 75);
        setByteElement(term828162, 21, (byte) 76);
        setByteElement(term828162, 22, (byte) 77);
        setByteElement(term828162, 23, (byte) 78);
        setByteElement(term828162, 24, (byte) 79);
        setByteElement(term828162, 25, (byte) 80);
        setByteElement(term828162, 26, (byte) 81);
        setByteElement(term828162, 27, (byte) 82);
        setByteElement(term828162, 28, (byte) 83);
        setByteElement(term828162, 29, (byte) 84);
        setByteElement(term828162, 30, (byte) 85);
        setByteElement(term828162, 31, (byte) 86);
        setField(term828160, term828160.getClass(), "encodeTable", term828162);
        setField(term828160, term828160.getClass(), "lineSeparator", term828163);
        setByteField(term828160, term828160.getClass(), "PAD", (byte) 61);
        setByteField(term828160, term828160.getClass(), "pad", (byte) 61);
        setIntField(term828160, term828160.getClass(), "unencodedBlockSize", 5);
        setIntField(term828160, term828160.getClass(), "encodedBlockSize", 8);
        setIntField(term828160, term828160.getClass(), "lineLength", 0);
        setIntField(term828160, term828160.getClass(), "chunkSeparatorLength", 7);
        term828164 = (byte[]) newByteArray(7);
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
        args[1] = term802417;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term828160));
        assertTrue(recursiveEquals(term802417, term828164));
    }

};


