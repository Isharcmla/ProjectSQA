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

public class Base32_init_1042801703470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985054;
     Object term1026300;
     Object term1026304;

    public Base32_init_1042801703470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term990904 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term985577 = (byte[]) newByteArray(0);
        setByteField(term990904, term990904.getClass(), "PAD", (byte) 0);
        setIntField(term990904, term990904.getClass(), "unencodedBlockSize", 0);
        setIntField(term990904, term990904.getClass(), "encodedBlockSize", 0);
        setIntField(term990904, term990904.getClass(), "lineLength", 0);
        setIntField(term990904, term990904.getClass(), "chunkSeparatorLength", 0);
        setByteField(term990904, term990904.getClass(), "pad", (byte) 0);
        setField(term990904, term990904.getClass(), "encodeTable", null);
        setField(term990904, term990904.getClass(), "decodeTable", term985577);
        setIntField(term990904, term990904.getClass(), "encodeSize", 0);
        setField(term990904, term990904.getClass(), "lineSeparator", null);
        setIntField(term990904, term990904.getClass(), "decodeSize", 0);
        term985054 = (byte[]) newByteArray(4);
        term1026300 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1026301 = (byte[]) newByteArray(88);
        byte[] term1026302 = (byte[]) newByteArray(32);
        byte[] term1026303 = (byte[]) newByteArray(4);
        setIntField(term1026300, term1026300.getClass(), "decodeSize", 11);
        setByteElement(term1026301, 0, (byte) -1);
        setByteElement(term1026301, 1, (byte) -1);
        setByteElement(term1026301, 2, (byte) -1);
        setByteElement(term1026301, 3, (byte) -1);
        setByteElement(term1026301, 4, (byte) -1);
        setByteElement(term1026301, 5, (byte) -1);
        setByteElement(term1026301, 6, (byte) -1);
        setByteElement(term1026301, 7, (byte) -1);
        setByteElement(term1026301, 8, (byte) -1);
        setByteElement(term1026301, 9, (byte) -1);
        setByteElement(term1026301, 10, (byte) -1);
        setByteElement(term1026301, 11, (byte) -1);
        setByteElement(term1026301, 12, (byte) -1);
        setByteElement(term1026301, 13, (byte) -1);
        setByteElement(term1026301, 14, (byte) -1);
        setByteElement(term1026301, 15, (byte) -1);
        setByteElement(term1026301, 16, (byte) -1);
        setByteElement(term1026301, 17, (byte) -1);
        setByteElement(term1026301, 18, (byte) -1);
        setByteElement(term1026301, 19, (byte) -1);
        setByteElement(term1026301, 20, (byte) -1);
        setByteElement(term1026301, 21, (byte) -1);
        setByteElement(term1026301, 22, (byte) -1);
        setByteElement(term1026301, 23, (byte) -1);
        setByteElement(term1026301, 24, (byte) -1);
        setByteElement(term1026301, 25, (byte) -1);
        setByteElement(term1026301, 26, (byte) -1);
        setByteElement(term1026301, 27, (byte) -1);
        setByteElement(term1026301, 28, (byte) -1);
        setByteElement(term1026301, 29, (byte) -1);
        setByteElement(term1026301, 30, (byte) -1);
        setByteElement(term1026301, 31, (byte) -1);
        setByteElement(term1026301, 32, (byte) -1);
        setByteElement(term1026301, 33, (byte) -1);
        setByteElement(term1026301, 34, (byte) -1);
        setByteElement(term1026301, 35, (byte) -1);
        setByteElement(term1026301, 36, (byte) -1);
        setByteElement(term1026301, 37, (byte) -1);
        setByteElement(term1026301, 38, (byte) -1);
        setByteElement(term1026301, 39, (byte) -1);
        setByteElement(term1026301, 40, (byte) -1);
        setByteElement(term1026301, 41, (byte) -1);
        setByteElement(term1026301, 42, (byte) -1);
        setByteElement(term1026301, 43, (byte) -1);
        setByteElement(term1026301, 44, (byte) -1);
        setByteElement(term1026301, 45, (byte) -1);
        setByteElement(term1026301, 46, (byte) -1);
        setByteElement(term1026301, 47, (byte) -1);
        setByteElement(term1026301, 49, (byte) 1);
        setByteElement(term1026301, 50, (byte) 2);
        setByteElement(term1026301, 51, (byte) 3);
        setByteElement(term1026301, 52, (byte) 4);
        setByteElement(term1026301, 53, (byte) 5);
        setByteElement(term1026301, 54, (byte) 6);
        setByteElement(term1026301, 55, (byte) 7);
        setByteElement(term1026301, 56, (byte) 8);
        setByteElement(term1026301, 57, (byte) 9);
        setByteElement(term1026301, 58, (byte) -1);
        setByteElement(term1026301, 59, (byte) -1);
        setByteElement(term1026301, 60, (byte) -1);
        setByteElement(term1026301, 61, (byte) -1);
        setByteElement(term1026301, 62, (byte) -1);
        setByteElement(term1026301, 63, (byte) -1);
        setByteElement(term1026301, 64, (byte) -1);
        setByteElement(term1026301, 65, (byte) 10);
        setByteElement(term1026301, 66, (byte) 11);
        setByteElement(term1026301, 67, (byte) 12);
        setByteElement(term1026301, 68, (byte) 13);
        setByteElement(term1026301, 69, (byte) 14);
        setByteElement(term1026301, 70, (byte) 15);
        setByteElement(term1026301, 71, (byte) 16);
        setByteElement(term1026301, 72, (byte) 17);
        setByteElement(term1026301, 73, (byte) 18);
        setByteElement(term1026301, 74, (byte) 19);
        setByteElement(term1026301, 75, (byte) 20);
        setByteElement(term1026301, 76, (byte) 21);
        setByteElement(term1026301, 77, (byte) 22);
        setByteElement(term1026301, 78, (byte) 23);
        setByteElement(term1026301, 79, (byte) 24);
        setByteElement(term1026301, 80, (byte) 25);
        setByteElement(term1026301, 81, (byte) 26);
        setByteElement(term1026301, 82, (byte) 27);
        setByteElement(term1026301, 83, (byte) 28);
        setByteElement(term1026301, 84, (byte) 29);
        setByteElement(term1026301, 85, (byte) 30);
        setByteElement(term1026301, 86, (byte) 31);
        setByteElement(term1026301, 87, (byte) 32);
        setField(term1026300, term1026300.getClass(), "decodeTable", term1026301);
        setIntField(term1026300, term1026300.getClass(), "encodeSize", 12);
        setByteElement(term1026302, 0, (byte) 48);
        setByteElement(term1026302, 1, (byte) 49);
        setByteElement(term1026302, 2, (byte) 50);
        setByteElement(term1026302, 3, (byte) 51);
        setByteElement(term1026302, 4, (byte) 52);
        setByteElement(term1026302, 5, (byte) 53);
        setByteElement(term1026302, 6, (byte) 54);
        setByteElement(term1026302, 7, (byte) 55);
        setByteElement(term1026302, 8, (byte) 56);
        setByteElement(term1026302, 9, (byte) 57);
        setByteElement(term1026302, 10, (byte) 65);
        setByteElement(term1026302, 11, (byte) 66);
        setByteElement(term1026302, 12, (byte) 67);
        setByteElement(term1026302, 13, (byte) 68);
        setByteElement(term1026302, 14, (byte) 69);
        setByteElement(term1026302, 15, (byte) 70);
        setByteElement(term1026302, 16, (byte) 71);
        setByteElement(term1026302, 17, (byte) 72);
        setByteElement(term1026302, 18, (byte) 73);
        setByteElement(term1026302, 19, (byte) 74);
        setByteElement(term1026302, 20, (byte) 75);
        setByteElement(term1026302, 21, (byte) 76);
        setByteElement(term1026302, 22, (byte) 77);
        setByteElement(term1026302, 23, (byte) 78);
        setByteElement(term1026302, 24, (byte) 79);
        setByteElement(term1026302, 25, (byte) 80);
        setByteElement(term1026302, 26, (byte) 81);
        setByteElement(term1026302, 27, (byte) 82);
        setByteElement(term1026302, 28, (byte) 83);
        setByteElement(term1026302, 29, (byte) 84);
        setByteElement(term1026302, 30, (byte) 85);
        setByteElement(term1026302, 31, (byte) 86);
        setField(term1026300, term1026300.getClass(), "encodeTable", term1026302);
        setField(term1026300, term1026300.getClass(), "lineSeparator", term1026303);
        setByteField(term1026300, term1026300.getClass(), "PAD", (byte) 61);
        setByteField(term1026300, term1026300.getClass(), "pad", (byte) 61);
        setIntField(term1026300, term1026300.getClass(), "unencodedBlockSize", 5);
        setIntField(term1026300, term1026300.getClass(), "encodedBlockSize", 8);
        setIntField(term1026300, term1026300.getClass(), "lineLength", 0);
        setIntField(term1026300, term1026300.getClass(), "chunkSeparatorLength", 4);
        term1026304 = (byte[]) newByteArray(4);
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
        args[1] = term985054;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1026300));
        assertTrue(recursiveEquals(term985054, term1026304));
    }

};


