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

public class Base32_init_1042801703352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term667585;
     Object term716348;
     Object term716352;

    public Base32_init_1042801703352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term682265 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term668606 = (byte[]) newByteArray(0);
        setByteField(term682265, term682265.getClass(), "PAD", (byte) 0);
        setIntField(term682265, term682265.getClass(), "unencodedBlockSize", 0);
        setIntField(term682265, term682265.getClass(), "encodedBlockSize", 0);
        setIntField(term682265, term682265.getClass(), "lineLength", 0);
        setIntField(term682265, term682265.getClass(), "chunkSeparatorLength", 0);
        setByteField(term682265, term682265.getClass(), "pad", (byte) -128);
        setField(term682265, term682265.getClass(), "encodeTable", null);
        setField(term682265, term682265.getClass(), "decodeTable", term668606);
        setIntField(term682265, term682265.getClass(), "encodeSize", 0);
        setField(term682265, term682265.getClass(), "lineSeparator", null);
        setIntField(term682265, term682265.getClass(), "decodeSize", 0);
        term667585 = (byte[]) newByteArray(12);
        term716348 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term716349 = (byte[]) newByteArray(88);
        byte[] term716350 = (byte[]) newByteArray(32);
        byte[] term716351 = (byte[]) newByteArray(12);
        setIntField(term716348, term716348.getClass(), "decodeSize", 19);
        setByteElement(term716349, 0, (byte) -1);
        setByteElement(term716349, 1, (byte) -1);
        setByteElement(term716349, 2, (byte) -1);
        setByteElement(term716349, 3, (byte) -1);
        setByteElement(term716349, 4, (byte) -1);
        setByteElement(term716349, 5, (byte) -1);
        setByteElement(term716349, 6, (byte) -1);
        setByteElement(term716349, 7, (byte) -1);
        setByteElement(term716349, 8, (byte) -1);
        setByteElement(term716349, 9, (byte) -1);
        setByteElement(term716349, 10, (byte) -1);
        setByteElement(term716349, 11, (byte) -1);
        setByteElement(term716349, 12, (byte) -1);
        setByteElement(term716349, 13, (byte) -1);
        setByteElement(term716349, 14, (byte) -1);
        setByteElement(term716349, 15, (byte) -1);
        setByteElement(term716349, 16, (byte) -1);
        setByteElement(term716349, 17, (byte) -1);
        setByteElement(term716349, 18, (byte) -1);
        setByteElement(term716349, 19, (byte) -1);
        setByteElement(term716349, 20, (byte) -1);
        setByteElement(term716349, 21, (byte) -1);
        setByteElement(term716349, 22, (byte) -1);
        setByteElement(term716349, 23, (byte) -1);
        setByteElement(term716349, 24, (byte) -1);
        setByteElement(term716349, 25, (byte) -1);
        setByteElement(term716349, 26, (byte) -1);
        setByteElement(term716349, 27, (byte) -1);
        setByteElement(term716349, 28, (byte) -1);
        setByteElement(term716349, 29, (byte) -1);
        setByteElement(term716349, 30, (byte) -1);
        setByteElement(term716349, 31, (byte) -1);
        setByteElement(term716349, 32, (byte) -1);
        setByteElement(term716349, 33, (byte) -1);
        setByteElement(term716349, 34, (byte) -1);
        setByteElement(term716349, 35, (byte) -1);
        setByteElement(term716349, 36, (byte) -1);
        setByteElement(term716349, 37, (byte) -1);
        setByteElement(term716349, 38, (byte) -1);
        setByteElement(term716349, 39, (byte) -1);
        setByteElement(term716349, 40, (byte) -1);
        setByteElement(term716349, 41, (byte) -1);
        setByteElement(term716349, 42, (byte) -1);
        setByteElement(term716349, 43, (byte) -1);
        setByteElement(term716349, 44, (byte) -1);
        setByteElement(term716349, 45, (byte) -1);
        setByteElement(term716349, 46, (byte) -1);
        setByteElement(term716349, 47, (byte) -1);
        setByteElement(term716349, 49, (byte) 1);
        setByteElement(term716349, 50, (byte) 2);
        setByteElement(term716349, 51, (byte) 3);
        setByteElement(term716349, 52, (byte) 4);
        setByteElement(term716349, 53, (byte) 5);
        setByteElement(term716349, 54, (byte) 6);
        setByteElement(term716349, 55, (byte) 7);
        setByteElement(term716349, 56, (byte) 8);
        setByteElement(term716349, 57, (byte) 9);
        setByteElement(term716349, 58, (byte) -1);
        setByteElement(term716349, 59, (byte) -1);
        setByteElement(term716349, 60, (byte) -1);
        setByteElement(term716349, 61, (byte) -1);
        setByteElement(term716349, 62, (byte) -1);
        setByteElement(term716349, 63, (byte) -1);
        setByteElement(term716349, 64, (byte) -1);
        setByteElement(term716349, 65, (byte) 10);
        setByteElement(term716349, 66, (byte) 11);
        setByteElement(term716349, 67, (byte) 12);
        setByteElement(term716349, 68, (byte) 13);
        setByteElement(term716349, 69, (byte) 14);
        setByteElement(term716349, 70, (byte) 15);
        setByteElement(term716349, 71, (byte) 16);
        setByteElement(term716349, 72, (byte) 17);
        setByteElement(term716349, 73, (byte) 18);
        setByteElement(term716349, 74, (byte) 19);
        setByteElement(term716349, 75, (byte) 20);
        setByteElement(term716349, 76, (byte) 21);
        setByteElement(term716349, 77, (byte) 22);
        setByteElement(term716349, 78, (byte) 23);
        setByteElement(term716349, 79, (byte) 24);
        setByteElement(term716349, 80, (byte) 25);
        setByteElement(term716349, 81, (byte) 26);
        setByteElement(term716349, 82, (byte) 27);
        setByteElement(term716349, 83, (byte) 28);
        setByteElement(term716349, 84, (byte) 29);
        setByteElement(term716349, 85, (byte) 30);
        setByteElement(term716349, 86, (byte) 31);
        setByteElement(term716349, 87, (byte) 32);
        setField(term716348, term716348.getClass(), "decodeTable", term716349);
        setIntField(term716348, term716348.getClass(), "encodeSize", 20);
        setByteElement(term716350, 0, (byte) 48);
        setByteElement(term716350, 1, (byte) 49);
        setByteElement(term716350, 2, (byte) 50);
        setByteElement(term716350, 3, (byte) 51);
        setByteElement(term716350, 4, (byte) 52);
        setByteElement(term716350, 5, (byte) 53);
        setByteElement(term716350, 6, (byte) 54);
        setByteElement(term716350, 7, (byte) 55);
        setByteElement(term716350, 8, (byte) 56);
        setByteElement(term716350, 9, (byte) 57);
        setByteElement(term716350, 10, (byte) 65);
        setByteElement(term716350, 11, (byte) 66);
        setByteElement(term716350, 12, (byte) 67);
        setByteElement(term716350, 13, (byte) 68);
        setByteElement(term716350, 14, (byte) 69);
        setByteElement(term716350, 15, (byte) 70);
        setByteElement(term716350, 16, (byte) 71);
        setByteElement(term716350, 17, (byte) 72);
        setByteElement(term716350, 18, (byte) 73);
        setByteElement(term716350, 19, (byte) 74);
        setByteElement(term716350, 20, (byte) 75);
        setByteElement(term716350, 21, (byte) 76);
        setByteElement(term716350, 22, (byte) 77);
        setByteElement(term716350, 23, (byte) 78);
        setByteElement(term716350, 24, (byte) 79);
        setByteElement(term716350, 25, (byte) 80);
        setByteElement(term716350, 26, (byte) 81);
        setByteElement(term716350, 27, (byte) 82);
        setByteElement(term716350, 28, (byte) 83);
        setByteElement(term716350, 29, (byte) 84);
        setByteElement(term716350, 30, (byte) 85);
        setByteElement(term716350, 31, (byte) 86);
        setField(term716348, term716348.getClass(), "encodeTable", term716350);
        setField(term716348, term716348.getClass(), "lineSeparator", term716351);
        setByteField(term716348, term716348.getClass(), "PAD", (byte) 61);
        setByteField(term716348, term716348.getClass(), "pad", (byte) 61);
        setIntField(term716348, term716348.getClass(), "unencodedBlockSize", 5);
        setIntField(term716348, term716348.getClass(), "encodedBlockSize", 8);
        setIntField(term716348, term716348.getClass(), "lineLength", 0);
        setIntField(term716348, term716348.getClass(), "chunkSeparatorLength", 12);
        term716352 = (byte[]) newByteArray(12);
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
        args[1] = term667585;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term716348));
        assertTrue(recursiveEquals(term667585, term716352));
    }

};


