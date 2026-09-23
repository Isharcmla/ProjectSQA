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

public class Base32_init_1040977973212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419843;
     Object term426400;
     Object term426403;

    public Base32_init_1040977973212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term422533 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term419843 = (byte[]) newByteArray(512);
        byte[] term421387 = (byte[]) newByteArray(0);
        setByteField(term422533, term422533.getClass(), "PAD", (byte) 0);
        setIntField(term422533, term422533.getClass(), "unencodedBlockSize", 0);
        setIntField(term422533, term422533.getClass(), "encodedBlockSize", 0);
        setIntField(term422533, term422533.getClass(), "lineLength", 0);
        setIntField(term422533, term422533.getClass(), "chunkSeparatorLength", 0);
        setByteField(term422533, term422533.getClass(), "pad", (byte) 0);
        setField(term422533, term422533.getClass(), "encodeTable", term419843);
        setField(term422533, term422533.getClass(), "decodeTable", term421387);
        setIntField(term422533, term422533.getClass(), "encodeSize", 0);
        setField(term422533, term422533.getClass(), "lineSeparator", term419843);
        setIntField(term422533, term422533.getClass(), "decodeSize", 0);
        term426400 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term426401 = (byte[]) newByteArray(91);
        byte[] term426402 = (byte[]) newByteArray(32);
        setIntField(term426400, term426400.getClass(), "decodeSize", 7);
        setByteElement(term426401, 0, (byte) -1);
        setByteElement(term426401, 1, (byte) -1);
        setByteElement(term426401, 2, (byte) -1);
        setByteElement(term426401, 3, (byte) -1);
        setByteElement(term426401, 4, (byte) -1);
        setByteElement(term426401, 5, (byte) -1);
        setByteElement(term426401, 6, (byte) -1);
        setByteElement(term426401, 7, (byte) -1);
        setByteElement(term426401, 8, (byte) -1);
        setByteElement(term426401, 9, (byte) -1);
        setByteElement(term426401, 10, (byte) -1);
        setByteElement(term426401, 11, (byte) -1);
        setByteElement(term426401, 12, (byte) -1);
        setByteElement(term426401, 13, (byte) -1);
        setByteElement(term426401, 14, (byte) -1);
        setByteElement(term426401, 15, (byte) -1);
        setByteElement(term426401, 16, (byte) -1);
        setByteElement(term426401, 17, (byte) -1);
        setByteElement(term426401, 18, (byte) -1);
        setByteElement(term426401, 19, (byte) -1);
        setByteElement(term426401, 20, (byte) -1);
        setByteElement(term426401, 21, (byte) -1);
        setByteElement(term426401, 22, (byte) -1);
        setByteElement(term426401, 23, (byte) -1);
        setByteElement(term426401, 24, (byte) -1);
        setByteElement(term426401, 25, (byte) -1);
        setByteElement(term426401, 26, (byte) -1);
        setByteElement(term426401, 27, (byte) -1);
        setByteElement(term426401, 28, (byte) -1);
        setByteElement(term426401, 29, (byte) -1);
        setByteElement(term426401, 30, (byte) -1);
        setByteElement(term426401, 31, (byte) -1);
        setByteElement(term426401, 32, (byte) -1);
        setByteElement(term426401, 33, (byte) -1);
        setByteElement(term426401, 34, (byte) -1);
        setByteElement(term426401, 35, (byte) -1);
        setByteElement(term426401, 36, (byte) -1);
        setByteElement(term426401, 37, (byte) -1);
        setByteElement(term426401, 38, (byte) -1);
        setByteElement(term426401, 39, (byte) -1);
        setByteElement(term426401, 40, (byte) -1);
        setByteElement(term426401, 41, (byte) -1);
        setByteElement(term426401, 42, (byte) -1);
        setByteElement(term426401, 43, (byte) -1);
        setByteElement(term426401, 44, (byte) -1);
        setByteElement(term426401, 45, (byte) -1);
        setByteElement(term426401, 46, (byte) -1);
        setByteElement(term426401, 47, (byte) -1);
        setByteElement(term426401, 48, (byte) -1);
        setByteElement(term426401, 49, (byte) -1);
        setByteElement(term426401, 50, (byte) 26);
        setByteElement(term426401, 51, (byte) 27);
        setByteElement(term426401, 52, (byte) 28);
        setByteElement(term426401, 53, (byte) 29);
        setByteElement(term426401, 54, (byte) 30);
        setByteElement(term426401, 55, (byte) 31);
        setByteElement(term426401, 56, (byte) -1);
        setByteElement(term426401, 57, (byte) -1);
        setByteElement(term426401, 58, (byte) -1);
        setByteElement(term426401, 59, (byte) -1);
        setByteElement(term426401, 60, (byte) -1);
        setByteElement(term426401, 61, (byte) -1);
        setByteElement(term426401, 62, (byte) -1);
        setByteElement(term426401, 63, (byte) -1);
        setByteElement(term426401, 64, (byte) -1);
        setByteElement(term426401, 66, (byte) 1);
        setByteElement(term426401, 67, (byte) 2);
        setByteElement(term426401, 68, (byte) 3);
        setByteElement(term426401, 69, (byte) 4);
        setByteElement(term426401, 70, (byte) 5);
        setByteElement(term426401, 71, (byte) 6);
        setByteElement(term426401, 72, (byte) 7);
        setByteElement(term426401, 73, (byte) 8);
        setByteElement(term426401, 74, (byte) 9);
        setByteElement(term426401, 75, (byte) 10);
        setByteElement(term426401, 76, (byte) 11);
        setByteElement(term426401, 77, (byte) 12);
        setByteElement(term426401, 78, (byte) 13);
        setByteElement(term426401, 79, (byte) 14);
        setByteElement(term426401, 80, (byte) 15);
        setByteElement(term426401, 81, (byte) 16);
        setByteElement(term426401, 82, (byte) 17);
        setByteElement(term426401, 83, (byte) 18);
        setByteElement(term426401, 84, (byte) 19);
        setByteElement(term426401, 85, (byte) 20);
        setByteElement(term426401, 86, (byte) 21);
        setByteElement(term426401, 87, (byte) 22);
        setByteElement(term426401, 88, (byte) 23);
        setByteElement(term426401, 89, (byte) 24);
        setByteElement(term426401, 90, (byte) 25);
        setField(term426400, term426400.getClass(), "decodeTable", term426401);
        setIntField(term426400, term426400.getClass(), "encodeSize", 8);
        setByteElement(term426402, 0, (byte) 65);
        setByteElement(term426402, 1, (byte) 66);
        setByteElement(term426402, 2, (byte) 67);
        setByteElement(term426402, 3, (byte) 68);
        setByteElement(term426402, 4, (byte) 69);
        setByteElement(term426402, 5, (byte) 70);
        setByteElement(term426402, 6, (byte) 71);
        setByteElement(term426402, 7, (byte) 72);
        setByteElement(term426402, 8, (byte) 73);
        setByteElement(term426402, 9, (byte) 74);
        setByteElement(term426402, 10, (byte) 75);
        setByteElement(term426402, 11, (byte) 76);
        setByteElement(term426402, 12, (byte) 77);
        setByteElement(term426402, 13, (byte) 78);
        setByteElement(term426402, 14, (byte) 79);
        setByteElement(term426402, 15, (byte) 80);
        setByteElement(term426402, 16, (byte) 81);
        setByteElement(term426402, 17, (byte) 82);
        setByteElement(term426402, 18, (byte) 83);
        setByteElement(term426402, 19, (byte) 84);
        setByteElement(term426402, 20, (byte) 85);
        setByteElement(term426402, 21, (byte) 86);
        setByteElement(term426402, 22, (byte) 87);
        setByteElement(term426402, 23, (byte) 88);
        setByteElement(term426402, 24, (byte) 89);
        setByteElement(term426402, 25, (byte) 90);
        setByteElement(term426402, 26, (byte) 50);
        setByteElement(term426402, 27, (byte) 51);
        setByteElement(term426402, 28, (byte) 52);
        setByteElement(term426402, 29, (byte) 53);
        setByteElement(term426402, 30, (byte) 54);
        setByteElement(term426402, 31, (byte) 55);
        setField(term426400, term426400.getClass(), "encodeTable", term426402);
        setField(term426400, term426400.getClass(), "lineSeparator", null);
        setByteField(term426400, term426400.getClass(), "PAD", (byte) 61);
        setByteField(term426400, term426400.getClass(), "pad", (byte) 61);
        setIntField(term426400, term426400.getClass(), "unencodedBlockSize", 5);
        setIntField(term426400, term426400.getClass(), "encodedBlockSize", 8);
        setIntField(term426400, term426400.getClass(), "lineLength", 0);
        setIntField(term426400, term426400.getClass(), "chunkSeparatorLength", 512);
        term426403 = (byte[]) newByteArray(512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = term419843;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term426400));
        assertTrue(recursiveEquals(term419843, term426403));
    }

};


