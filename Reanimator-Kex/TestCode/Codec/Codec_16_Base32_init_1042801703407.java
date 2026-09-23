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

public class Base32_init_1042801703407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817491;
     Object term842532;
     Object term842536;

    public Base32_init_1042801703407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term819275 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term818586 = (byte[]) newByteArray(0);
        setByteField(term819275, term819275.getClass(), "PAD", (byte) 0);
        setIntField(term819275, term819275.getClass(), "unencodedBlockSize", 0);
        setIntField(term819275, term819275.getClass(), "encodedBlockSize", 0);
        setIntField(term819275, term819275.getClass(), "lineLength", 0);
        setIntField(term819275, term819275.getClass(), "chunkSeparatorLength", 0);
        setByteField(term819275, term819275.getClass(), "pad", (byte) -128);
        setField(term819275, term819275.getClass(), "encodeTable", null);
        setField(term819275, term819275.getClass(), "decodeTable", term818586);
        term817491 = (byte[]) newByteArray(491);
        setByteElement(term817491, 2, (byte) 112);
        term842532 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term842533 = (byte[]) newByteArray(88);
        byte[] term842534 = (byte[]) newByteArray(32);
        byte[] term842535 = (byte[]) newByteArray(491);
        setIntField(term842532, term842532.getClass(), "decodeSize", 498);
        setByteElement(term842533, 0, (byte) -1);
        setByteElement(term842533, 1, (byte) -1);
        setByteElement(term842533, 2, (byte) -1);
        setByteElement(term842533, 3, (byte) -1);
        setByteElement(term842533, 4, (byte) -1);
        setByteElement(term842533, 5, (byte) -1);
        setByteElement(term842533, 6, (byte) -1);
        setByteElement(term842533, 7, (byte) -1);
        setByteElement(term842533, 8, (byte) -1);
        setByteElement(term842533, 9, (byte) -1);
        setByteElement(term842533, 10, (byte) -1);
        setByteElement(term842533, 11, (byte) -1);
        setByteElement(term842533, 12, (byte) -1);
        setByteElement(term842533, 13, (byte) -1);
        setByteElement(term842533, 14, (byte) -1);
        setByteElement(term842533, 15, (byte) -1);
        setByteElement(term842533, 16, (byte) -1);
        setByteElement(term842533, 17, (byte) -1);
        setByteElement(term842533, 18, (byte) -1);
        setByteElement(term842533, 19, (byte) -1);
        setByteElement(term842533, 20, (byte) -1);
        setByteElement(term842533, 21, (byte) -1);
        setByteElement(term842533, 22, (byte) -1);
        setByteElement(term842533, 23, (byte) -1);
        setByteElement(term842533, 24, (byte) -1);
        setByteElement(term842533, 25, (byte) -1);
        setByteElement(term842533, 26, (byte) -1);
        setByteElement(term842533, 27, (byte) -1);
        setByteElement(term842533, 28, (byte) -1);
        setByteElement(term842533, 29, (byte) -1);
        setByteElement(term842533, 30, (byte) -1);
        setByteElement(term842533, 31, (byte) -1);
        setByteElement(term842533, 32, (byte) -1);
        setByteElement(term842533, 33, (byte) -1);
        setByteElement(term842533, 34, (byte) -1);
        setByteElement(term842533, 35, (byte) -1);
        setByteElement(term842533, 36, (byte) -1);
        setByteElement(term842533, 37, (byte) -1);
        setByteElement(term842533, 38, (byte) -1);
        setByteElement(term842533, 39, (byte) -1);
        setByteElement(term842533, 40, (byte) -1);
        setByteElement(term842533, 41, (byte) -1);
        setByteElement(term842533, 42, (byte) -1);
        setByteElement(term842533, 43, (byte) -1);
        setByteElement(term842533, 44, (byte) -1);
        setByteElement(term842533, 45, (byte) -1);
        setByteElement(term842533, 46, (byte) -1);
        setByteElement(term842533, 47, (byte) -1);
        setByteElement(term842533, 49, (byte) 1);
        setByteElement(term842533, 50, (byte) 2);
        setByteElement(term842533, 51, (byte) 3);
        setByteElement(term842533, 52, (byte) 4);
        setByteElement(term842533, 53, (byte) 5);
        setByteElement(term842533, 54, (byte) 6);
        setByteElement(term842533, 55, (byte) 7);
        setByteElement(term842533, 56, (byte) 8);
        setByteElement(term842533, 57, (byte) 9);
        setByteElement(term842533, 58, (byte) -1);
        setByteElement(term842533, 59, (byte) -1);
        setByteElement(term842533, 60, (byte) -1);
        setByteElement(term842533, 61, (byte) -1);
        setByteElement(term842533, 62, (byte) -1);
        setByteElement(term842533, 63, (byte) -1);
        setByteElement(term842533, 64, (byte) -1);
        setByteElement(term842533, 65, (byte) 10);
        setByteElement(term842533, 66, (byte) 11);
        setByteElement(term842533, 67, (byte) 12);
        setByteElement(term842533, 68, (byte) 13);
        setByteElement(term842533, 69, (byte) 14);
        setByteElement(term842533, 70, (byte) 15);
        setByteElement(term842533, 71, (byte) 16);
        setByteElement(term842533, 72, (byte) 17);
        setByteElement(term842533, 73, (byte) 18);
        setByteElement(term842533, 74, (byte) 19);
        setByteElement(term842533, 75, (byte) 20);
        setByteElement(term842533, 76, (byte) 21);
        setByteElement(term842533, 77, (byte) 22);
        setByteElement(term842533, 78, (byte) 23);
        setByteElement(term842533, 79, (byte) 24);
        setByteElement(term842533, 80, (byte) 25);
        setByteElement(term842533, 81, (byte) 26);
        setByteElement(term842533, 82, (byte) 27);
        setByteElement(term842533, 83, (byte) 28);
        setByteElement(term842533, 84, (byte) 29);
        setByteElement(term842533, 85, (byte) 30);
        setByteElement(term842533, 86, (byte) 31);
        setByteElement(term842533, 87, (byte) 32);
        setField(term842532, term842532.getClass(), "decodeTable", term842533);
        setIntField(term842532, term842532.getClass(), "encodeSize", 499);
        setByteElement(term842534, 0, (byte) 48);
        setByteElement(term842534, 1, (byte) 49);
        setByteElement(term842534, 2, (byte) 50);
        setByteElement(term842534, 3, (byte) 51);
        setByteElement(term842534, 4, (byte) 52);
        setByteElement(term842534, 5, (byte) 53);
        setByteElement(term842534, 6, (byte) 54);
        setByteElement(term842534, 7, (byte) 55);
        setByteElement(term842534, 8, (byte) 56);
        setByteElement(term842534, 9, (byte) 57);
        setByteElement(term842534, 10, (byte) 65);
        setByteElement(term842534, 11, (byte) 66);
        setByteElement(term842534, 12, (byte) 67);
        setByteElement(term842534, 13, (byte) 68);
        setByteElement(term842534, 14, (byte) 69);
        setByteElement(term842534, 15, (byte) 70);
        setByteElement(term842534, 16, (byte) 71);
        setByteElement(term842534, 17, (byte) 72);
        setByteElement(term842534, 18, (byte) 73);
        setByteElement(term842534, 19, (byte) 74);
        setByteElement(term842534, 20, (byte) 75);
        setByteElement(term842534, 21, (byte) 76);
        setByteElement(term842534, 22, (byte) 77);
        setByteElement(term842534, 23, (byte) 78);
        setByteElement(term842534, 24, (byte) 79);
        setByteElement(term842534, 25, (byte) 80);
        setByteElement(term842534, 26, (byte) 81);
        setByteElement(term842534, 27, (byte) 82);
        setByteElement(term842534, 28, (byte) 83);
        setByteElement(term842534, 29, (byte) 84);
        setByteElement(term842534, 30, (byte) 85);
        setByteElement(term842534, 31, (byte) 86);
        setField(term842532, term842532.getClass(), "encodeTable", term842534);
        setByteElement(term842535, 2, (byte) 112);
        setField(term842532, term842532.getClass(), "lineSeparator", term842535);
        setByteField(term842532, term842532.getClass(), "PAD", (byte) 61);
        setByteField(term842532, term842532.getClass(), "pad", (byte) 61);
        setIntField(term842532, term842532.getClass(), "unencodedBlockSize", 5);
        setIntField(term842532, term842532.getClass(), "encodedBlockSize", 8);
        setIntField(term842532, term842532.getClass(), "lineLength", 0);
        setIntField(term842532, term842532.getClass(), "chunkSeparatorLength", 491);
        term842536 = (byte[]) newByteArray(491);
        setByteElement(term842536, 2, (byte) 112);
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
        args[1] = term817491;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term842532));
        assertTrue(recursiveEquals(term817491, term842536));
    }

};


