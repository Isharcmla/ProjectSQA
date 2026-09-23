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
import java.lang.Integer;

public class Base32_init_104091913515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;
     Object term2198;

    public Base32_init_104091913515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = new Integer(568599855);
        term2198 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term2199 = (byte[]) newByteArray(91);
        byte[] term2200 = (byte[]) newByteArray(32);
        byte[] term2201 = (byte[]) newByteArray(2);
        setIntField(term2198, term2198.getClass(), "decodeSize", 9);
        setByteElement(term2199, 0, (byte) -1);
        setByteElement(term2199, 1, (byte) -1);
        setByteElement(term2199, 2, (byte) -1);
        setByteElement(term2199, 3, (byte) -1);
        setByteElement(term2199, 4, (byte) -1);
        setByteElement(term2199, 5, (byte) -1);
        setByteElement(term2199, 6, (byte) -1);
        setByteElement(term2199, 7, (byte) -1);
        setByteElement(term2199, 8, (byte) -1);
        setByteElement(term2199, 9, (byte) -1);
        setByteElement(term2199, 10, (byte) -1);
        setByteElement(term2199, 11, (byte) -1);
        setByteElement(term2199, 12, (byte) -1);
        setByteElement(term2199, 13, (byte) -1);
        setByteElement(term2199, 14, (byte) -1);
        setByteElement(term2199, 15, (byte) -1);
        setByteElement(term2199, 16, (byte) -1);
        setByteElement(term2199, 17, (byte) -1);
        setByteElement(term2199, 18, (byte) -1);
        setByteElement(term2199, 19, (byte) -1);
        setByteElement(term2199, 20, (byte) -1);
        setByteElement(term2199, 21, (byte) -1);
        setByteElement(term2199, 22, (byte) -1);
        setByteElement(term2199, 23, (byte) -1);
        setByteElement(term2199, 24, (byte) -1);
        setByteElement(term2199, 25, (byte) -1);
        setByteElement(term2199, 26, (byte) -1);
        setByteElement(term2199, 27, (byte) -1);
        setByteElement(term2199, 28, (byte) -1);
        setByteElement(term2199, 29, (byte) -1);
        setByteElement(term2199, 30, (byte) -1);
        setByteElement(term2199, 31, (byte) -1);
        setByteElement(term2199, 32, (byte) -1);
        setByteElement(term2199, 33, (byte) -1);
        setByteElement(term2199, 34, (byte) -1);
        setByteElement(term2199, 35, (byte) -1);
        setByteElement(term2199, 36, (byte) -1);
        setByteElement(term2199, 37, (byte) -1);
        setByteElement(term2199, 38, (byte) -1);
        setByteElement(term2199, 39, (byte) -1);
        setByteElement(term2199, 40, (byte) -1);
        setByteElement(term2199, 41, (byte) -1);
        setByteElement(term2199, 42, (byte) -1);
        setByteElement(term2199, 43, (byte) -1);
        setByteElement(term2199, 44, (byte) -1);
        setByteElement(term2199, 45, (byte) -1);
        setByteElement(term2199, 46, (byte) -1);
        setByteElement(term2199, 47, (byte) -1);
        setByteElement(term2199, 48, (byte) -1);
        setByteElement(term2199, 49, (byte) -1);
        setByteElement(term2199, 50, (byte) 26);
        setByteElement(term2199, 51, (byte) 27);
        setByteElement(term2199, 52, (byte) 28);
        setByteElement(term2199, 53, (byte) 29);
        setByteElement(term2199, 54, (byte) 30);
        setByteElement(term2199, 55, (byte) 31);
        setByteElement(term2199, 56, (byte) -1);
        setByteElement(term2199, 57, (byte) -1);
        setByteElement(term2199, 58, (byte) -1);
        setByteElement(term2199, 59, (byte) -1);
        setByteElement(term2199, 60, (byte) -1);
        setByteElement(term2199, 61, (byte) -1);
        setByteElement(term2199, 62, (byte) -1);
        setByteElement(term2199, 63, (byte) -1);
        setByteElement(term2199, 64, (byte) -1);
        setByteElement(term2199, 66, (byte) 1);
        setByteElement(term2199, 67, (byte) 2);
        setByteElement(term2199, 68, (byte) 3);
        setByteElement(term2199, 69, (byte) 4);
        setByteElement(term2199, 70, (byte) 5);
        setByteElement(term2199, 71, (byte) 6);
        setByteElement(term2199, 72, (byte) 7);
        setByteElement(term2199, 73, (byte) 8);
        setByteElement(term2199, 74, (byte) 9);
        setByteElement(term2199, 75, (byte) 10);
        setByteElement(term2199, 76, (byte) 11);
        setByteElement(term2199, 77, (byte) 12);
        setByteElement(term2199, 78, (byte) 13);
        setByteElement(term2199, 79, (byte) 14);
        setByteElement(term2199, 80, (byte) 15);
        setByteElement(term2199, 81, (byte) 16);
        setByteElement(term2199, 82, (byte) 17);
        setByteElement(term2199, 83, (byte) 18);
        setByteElement(term2199, 84, (byte) 19);
        setByteElement(term2199, 85, (byte) 20);
        setByteElement(term2199, 86, (byte) 21);
        setByteElement(term2199, 87, (byte) 22);
        setByteElement(term2199, 88, (byte) 23);
        setByteElement(term2199, 89, (byte) 24);
        setByteElement(term2199, 90, (byte) 25);
        setField(term2198, term2198.getClass(), "decodeTable", term2199);
        setIntField(term2198, term2198.getClass(), "encodeSize", 10);
        setByteElement(term2200, 0, (byte) 65);
        setByteElement(term2200, 1, (byte) 66);
        setByteElement(term2200, 2, (byte) 67);
        setByteElement(term2200, 3, (byte) 68);
        setByteElement(term2200, 4, (byte) 69);
        setByteElement(term2200, 5, (byte) 70);
        setByteElement(term2200, 6, (byte) 71);
        setByteElement(term2200, 7, (byte) 72);
        setByteElement(term2200, 8, (byte) 73);
        setByteElement(term2200, 9, (byte) 74);
        setByteElement(term2200, 10, (byte) 75);
        setByteElement(term2200, 11, (byte) 76);
        setByteElement(term2200, 12, (byte) 77);
        setByteElement(term2200, 13, (byte) 78);
        setByteElement(term2200, 14, (byte) 79);
        setByteElement(term2200, 15, (byte) 80);
        setByteElement(term2200, 16, (byte) 81);
        setByteElement(term2200, 17, (byte) 82);
        setByteElement(term2200, 18, (byte) 83);
        setByteElement(term2200, 19, (byte) 84);
        setByteElement(term2200, 20, (byte) 85);
        setByteElement(term2200, 21, (byte) 86);
        setByteElement(term2200, 22, (byte) 87);
        setByteElement(term2200, 23, (byte) 88);
        setByteElement(term2200, 24, (byte) 89);
        setByteElement(term2200, 25, (byte) 90);
        setByteElement(term2200, 26, (byte) 50);
        setByteElement(term2200, 27, (byte) 51);
        setByteElement(term2200, 28, (byte) 52);
        setByteElement(term2200, 29, (byte) 53);
        setByteElement(term2200, 30, (byte) 54);
        setByteElement(term2200, 31, (byte) 55);
        setField(term2198, term2198.getClass(), "encodeTable", term2200);
        setByteElement(term2201, 0, (byte) 13);
        setByteElement(term2201, 1, (byte) 10);
        setField(term2198, term2198.getClass(), "lineSeparator", term2201);
        setByteField(term2198, term2198.getClass(), "PAD", (byte) 61);
        setByteField(term2198, term2198.getClass(), "pad", (byte) 61);
        setIntField(term2198, term2198.getClass(), "unencodedBlockSize", 5);
        setIntField(term2198, term2198.getClass(), "encodedBlockSize", 8);
        setIntField(term2198, term2198.getClass(), "lineLength", 568599848);
        setIntField(term2198, term2198.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2198));
        assertTrue(recursiveEquals(term9, 568599855));
    }

};


