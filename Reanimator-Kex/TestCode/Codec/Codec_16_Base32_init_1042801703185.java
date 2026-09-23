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

public class Base32_init_1042801703185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367865;
     Object term369275;
     Object term369279;

    public Base32_init_1042801703185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term368707 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term368411 = (byte[]) newByteArray(0);
        setByteField(term368707, term368707.getClass(), "PAD", (byte) -128);
        setIntField(term368707, term368707.getClass(), "unencodedBlockSize", 0);
        setIntField(term368707, term368707.getClass(), "encodedBlockSize", 0);
        setIntField(term368707, term368707.getClass(), "lineLength", 0);
        setIntField(term368707, term368707.getClass(), "chunkSeparatorLength", 0);
        setByteField(term368707, term368707.getClass(), "pad", (byte) 0);
        setField(term368707, term368707.getClass(), "encodeTable", null);
        setField(term368707, term368707.getClass(), "decodeTable", term368411);
        setIntField(term368707, term368707.getClass(), "encodeSize", 0);
        setField(term368707, term368707.getClass(), "lineSeparator", null);
        setIntField(term368707, term368707.getClass(), "decodeSize", 0);
        term367865 = (byte[]) newByteArray(1);
        term369275 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term369276 = (byte[]) newByteArray(88);
        byte[] term369277 = (byte[]) newByteArray(32);
        byte[] term369278 = (byte[]) newByteArray(1);
        setIntField(term369275, term369275.getClass(), "decodeSize", 8);
        setByteElement(term369276, 0, (byte) -1);
        setByteElement(term369276, 1, (byte) -1);
        setByteElement(term369276, 2, (byte) -1);
        setByteElement(term369276, 3, (byte) -1);
        setByteElement(term369276, 4, (byte) -1);
        setByteElement(term369276, 5, (byte) -1);
        setByteElement(term369276, 6, (byte) -1);
        setByteElement(term369276, 7, (byte) -1);
        setByteElement(term369276, 8, (byte) -1);
        setByteElement(term369276, 9, (byte) -1);
        setByteElement(term369276, 10, (byte) -1);
        setByteElement(term369276, 11, (byte) -1);
        setByteElement(term369276, 12, (byte) -1);
        setByteElement(term369276, 13, (byte) -1);
        setByteElement(term369276, 14, (byte) -1);
        setByteElement(term369276, 15, (byte) -1);
        setByteElement(term369276, 16, (byte) -1);
        setByteElement(term369276, 17, (byte) -1);
        setByteElement(term369276, 18, (byte) -1);
        setByteElement(term369276, 19, (byte) -1);
        setByteElement(term369276, 20, (byte) -1);
        setByteElement(term369276, 21, (byte) -1);
        setByteElement(term369276, 22, (byte) -1);
        setByteElement(term369276, 23, (byte) -1);
        setByteElement(term369276, 24, (byte) -1);
        setByteElement(term369276, 25, (byte) -1);
        setByteElement(term369276, 26, (byte) -1);
        setByteElement(term369276, 27, (byte) -1);
        setByteElement(term369276, 28, (byte) -1);
        setByteElement(term369276, 29, (byte) -1);
        setByteElement(term369276, 30, (byte) -1);
        setByteElement(term369276, 31, (byte) -1);
        setByteElement(term369276, 32, (byte) -1);
        setByteElement(term369276, 33, (byte) -1);
        setByteElement(term369276, 34, (byte) -1);
        setByteElement(term369276, 35, (byte) -1);
        setByteElement(term369276, 36, (byte) -1);
        setByteElement(term369276, 37, (byte) -1);
        setByteElement(term369276, 38, (byte) -1);
        setByteElement(term369276, 39, (byte) -1);
        setByteElement(term369276, 40, (byte) -1);
        setByteElement(term369276, 41, (byte) -1);
        setByteElement(term369276, 42, (byte) -1);
        setByteElement(term369276, 43, (byte) -1);
        setByteElement(term369276, 44, (byte) -1);
        setByteElement(term369276, 45, (byte) -1);
        setByteElement(term369276, 46, (byte) -1);
        setByteElement(term369276, 47, (byte) -1);
        setByteElement(term369276, 49, (byte) 1);
        setByteElement(term369276, 50, (byte) 2);
        setByteElement(term369276, 51, (byte) 3);
        setByteElement(term369276, 52, (byte) 4);
        setByteElement(term369276, 53, (byte) 5);
        setByteElement(term369276, 54, (byte) 6);
        setByteElement(term369276, 55, (byte) 7);
        setByteElement(term369276, 56, (byte) 8);
        setByteElement(term369276, 57, (byte) 9);
        setByteElement(term369276, 58, (byte) -1);
        setByteElement(term369276, 59, (byte) -1);
        setByteElement(term369276, 60, (byte) -1);
        setByteElement(term369276, 61, (byte) -1);
        setByteElement(term369276, 62, (byte) -1);
        setByteElement(term369276, 63, (byte) -1);
        setByteElement(term369276, 64, (byte) -1);
        setByteElement(term369276, 65, (byte) 10);
        setByteElement(term369276, 66, (byte) 11);
        setByteElement(term369276, 67, (byte) 12);
        setByteElement(term369276, 68, (byte) 13);
        setByteElement(term369276, 69, (byte) 14);
        setByteElement(term369276, 70, (byte) 15);
        setByteElement(term369276, 71, (byte) 16);
        setByteElement(term369276, 72, (byte) 17);
        setByteElement(term369276, 73, (byte) 18);
        setByteElement(term369276, 74, (byte) 19);
        setByteElement(term369276, 75, (byte) 20);
        setByteElement(term369276, 76, (byte) 21);
        setByteElement(term369276, 77, (byte) 22);
        setByteElement(term369276, 78, (byte) 23);
        setByteElement(term369276, 79, (byte) 24);
        setByteElement(term369276, 80, (byte) 25);
        setByteElement(term369276, 81, (byte) 26);
        setByteElement(term369276, 82, (byte) 27);
        setByteElement(term369276, 83, (byte) 28);
        setByteElement(term369276, 84, (byte) 29);
        setByteElement(term369276, 85, (byte) 30);
        setByteElement(term369276, 86, (byte) 31);
        setByteElement(term369276, 87, (byte) 32);
        setField(term369275, term369275.getClass(), "decodeTable", term369276);
        setIntField(term369275, term369275.getClass(), "encodeSize", 9);
        setByteElement(term369277, 0, (byte) 48);
        setByteElement(term369277, 1, (byte) 49);
        setByteElement(term369277, 2, (byte) 50);
        setByteElement(term369277, 3, (byte) 51);
        setByteElement(term369277, 4, (byte) 52);
        setByteElement(term369277, 5, (byte) 53);
        setByteElement(term369277, 6, (byte) 54);
        setByteElement(term369277, 7, (byte) 55);
        setByteElement(term369277, 8, (byte) 56);
        setByteElement(term369277, 9, (byte) 57);
        setByteElement(term369277, 10, (byte) 65);
        setByteElement(term369277, 11, (byte) 66);
        setByteElement(term369277, 12, (byte) 67);
        setByteElement(term369277, 13, (byte) 68);
        setByteElement(term369277, 14, (byte) 69);
        setByteElement(term369277, 15, (byte) 70);
        setByteElement(term369277, 16, (byte) 71);
        setByteElement(term369277, 17, (byte) 72);
        setByteElement(term369277, 18, (byte) 73);
        setByteElement(term369277, 19, (byte) 74);
        setByteElement(term369277, 20, (byte) 75);
        setByteElement(term369277, 21, (byte) 76);
        setByteElement(term369277, 22, (byte) 77);
        setByteElement(term369277, 23, (byte) 78);
        setByteElement(term369277, 24, (byte) 79);
        setByteElement(term369277, 25, (byte) 80);
        setByteElement(term369277, 26, (byte) 81);
        setByteElement(term369277, 27, (byte) 82);
        setByteElement(term369277, 28, (byte) 83);
        setByteElement(term369277, 29, (byte) 84);
        setByteElement(term369277, 30, (byte) 85);
        setByteElement(term369277, 31, (byte) 86);
        setField(term369275, term369275.getClass(), "encodeTable", term369277);
        setField(term369275, term369275.getClass(), "lineSeparator", term369278);
        setByteField(term369275, term369275.getClass(), "PAD", (byte) 61);
        setByteField(term369275, term369275.getClass(), "pad", (byte) 61);
        setIntField(term369275, term369275.getClass(), "unencodedBlockSize", 5);
        setIntField(term369275, term369275.getClass(), "encodedBlockSize", 8);
        setIntField(term369275, term369275.getClass(), "lineLength", 0);
        setIntField(term369275, term369275.getClass(), "chunkSeparatorLength", 1);
        term369279 = (byte[]) newByteArray(1);
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
        args[1] = term367865;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term369275));
        assertTrue(recursiveEquals(term367865, term369279));
    }

};


