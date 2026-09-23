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

public class Base32_init_104091913553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30767;

    public Base32_init_104091913553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30586 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term29466 = (byte[]) newByteArray(0);
        setByteField(term30586, term30586.getClass(), "PAD", (byte) 0);
        setIntField(term30586, term30586.getClass(), "unencodedBlockSize", 0);
        setIntField(term30586, term30586.getClass(), "encodedBlockSize", 0);
        setIntField(term30586, term30586.getClass(), "lineLength", 0);
        setIntField(term30586, term30586.getClass(), "chunkSeparatorLength", 0);
        setByteField(term30586, term30586.getClass(), "pad", (byte) -128);
        setField(term30586, term30586.getClass(), "encodeTable", null);
        setField(term30586, term30586.getClass(), "decodeTable", term29466);
        term30767 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term30768 = (byte[]) newByteArray(91);
        byte[] term30769 = (byte[]) newByteArray(32);
        byte[] term30770 = (byte[]) newByteArray(2);
        setIntField(term30767, term30767.getClass(), "decodeSize", 9);
        setByteElement(term30768, 0, (byte) -1);
        setByteElement(term30768, 1, (byte) -1);
        setByteElement(term30768, 2, (byte) -1);
        setByteElement(term30768, 3, (byte) -1);
        setByteElement(term30768, 4, (byte) -1);
        setByteElement(term30768, 5, (byte) -1);
        setByteElement(term30768, 6, (byte) -1);
        setByteElement(term30768, 7, (byte) -1);
        setByteElement(term30768, 8, (byte) -1);
        setByteElement(term30768, 9, (byte) -1);
        setByteElement(term30768, 10, (byte) -1);
        setByteElement(term30768, 11, (byte) -1);
        setByteElement(term30768, 12, (byte) -1);
        setByteElement(term30768, 13, (byte) -1);
        setByteElement(term30768, 14, (byte) -1);
        setByteElement(term30768, 15, (byte) -1);
        setByteElement(term30768, 16, (byte) -1);
        setByteElement(term30768, 17, (byte) -1);
        setByteElement(term30768, 18, (byte) -1);
        setByteElement(term30768, 19, (byte) -1);
        setByteElement(term30768, 20, (byte) -1);
        setByteElement(term30768, 21, (byte) -1);
        setByteElement(term30768, 22, (byte) -1);
        setByteElement(term30768, 23, (byte) -1);
        setByteElement(term30768, 24, (byte) -1);
        setByteElement(term30768, 25, (byte) -1);
        setByteElement(term30768, 26, (byte) -1);
        setByteElement(term30768, 27, (byte) -1);
        setByteElement(term30768, 28, (byte) -1);
        setByteElement(term30768, 29, (byte) -1);
        setByteElement(term30768, 30, (byte) -1);
        setByteElement(term30768, 31, (byte) -1);
        setByteElement(term30768, 32, (byte) -1);
        setByteElement(term30768, 33, (byte) -1);
        setByteElement(term30768, 34, (byte) -1);
        setByteElement(term30768, 35, (byte) -1);
        setByteElement(term30768, 36, (byte) -1);
        setByteElement(term30768, 37, (byte) -1);
        setByteElement(term30768, 38, (byte) -1);
        setByteElement(term30768, 39, (byte) -1);
        setByteElement(term30768, 40, (byte) -1);
        setByteElement(term30768, 41, (byte) -1);
        setByteElement(term30768, 42, (byte) -1);
        setByteElement(term30768, 43, (byte) -1);
        setByteElement(term30768, 44, (byte) -1);
        setByteElement(term30768, 45, (byte) -1);
        setByteElement(term30768, 46, (byte) -1);
        setByteElement(term30768, 47, (byte) -1);
        setByteElement(term30768, 48, (byte) -1);
        setByteElement(term30768, 49, (byte) -1);
        setByteElement(term30768, 50, (byte) 26);
        setByteElement(term30768, 51, (byte) 27);
        setByteElement(term30768, 52, (byte) 28);
        setByteElement(term30768, 53, (byte) 29);
        setByteElement(term30768, 54, (byte) 30);
        setByteElement(term30768, 55, (byte) 31);
        setByteElement(term30768, 56, (byte) -1);
        setByteElement(term30768, 57, (byte) -1);
        setByteElement(term30768, 58, (byte) -1);
        setByteElement(term30768, 59, (byte) -1);
        setByteElement(term30768, 60, (byte) -1);
        setByteElement(term30768, 61, (byte) -1);
        setByteElement(term30768, 62, (byte) -1);
        setByteElement(term30768, 63, (byte) -1);
        setByteElement(term30768, 64, (byte) -1);
        setByteElement(term30768, 66, (byte) 1);
        setByteElement(term30768, 67, (byte) 2);
        setByteElement(term30768, 68, (byte) 3);
        setByteElement(term30768, 69, (byte) 4);
        setByteElement(term30768, 70, (byte) 5);
        setByteElement(term30768, 71, (byte) 6);
        setByteElement(term30768, 72, (byte) 7);
        setByteElement(term30768, 73, (byte) 8);
        setByteElement(term30768, 74, (byte) 9);
        setByteElement(term30768, 75, (byte) 10);
        setByteElement(term30768, 76, (byte) 11);
        setByteElement(term30768, 77, (byte) 12);
        setByteElement(term30768, 78, (byte) 13);
        setByteElement(term30768, 79, (byte) 14);
        setByteElement(term30768, 80, (byte) 15);
        setByteElement(term30768, 81, (byte) 16);
        setByteElement(term30768, 82, (byte) 17);
        setByteElement(term30768, 83, (byte) 18);
        setByteElement(term30768, 84, (byte) 19);
        setByteElement(term30768, 85, (byte) 20);
        setByteElement(term30768, 86, (byte) 21);
        setByteElement(term30768, 87, (byte) 22);
        setByteElement(term30768, 88, (byte) 23);
        setByteElement(term30768, 89, (byte) 24);
        setByteElement(term30768, 90, (byte) 25);
        setField(term30767, term30767.getClass(), "decodeTable", term30768);
        setIntField(term30767, term30767.getClass(), "encodeSize", 10);
        setByteElement(term30769, 0, (byte) 65);
        setByteElement(term30769, 1, (byte) 66);
        setByteElement(term30769, 2, (byte) 67);
        setByteElement(term30769, 3, (byte) 68);
        setByteElement(term30769, 4, (byte) 69);
        setByteElement(term30769, 5, (byte) 70);
        setByteElement(term30769, 6, (byte) 71);
        setByteElement(term30769, 7, (byte) 72);
        setByteElement(term30769, 8, (byte) 73);
        setByteElement(term30769, 9, (byte) 74);
        setByteElement(term30769, 10, (byte) 75);
        setByteElement(term30769, 11, (byte) 76);
        setByteElement(term30769, 12, (byte) 77);
        setByteElement(term30769, 13, (byte) 78);
        setByteElement(term30769, 14, (byte) 79);
        setByteElement(term30769, 15, (byte) 80);
        setByteElement(term30769, 16, (byte) 81);
        setByteElement(term30769, 17, (byte) 82);
        setByteElement(term30769, 18, (byte) 83);
        setByteElement(term30769, 19, (byte) 84);
        setByteElement(term30769, 20, (byte) 85);
        setByteElement(term30769, 21, (byte) 86);
        setByteElement(term30769, 22, (byte) 87);
        setByteElement(term30769, 23, (byte) 88);
        setByteElement(term30769, 24, (byte) 89);
        setByteElement(term30769, 25, (byte) 90);
        setByteElement(term30769, 26, (byte) 50);
        setByteElement(term30769, 27, (byte) 51);
        setByteElement(term30769, 28, (byte) 52);
        setByteElement(term30769, 29, (byte) 53);
        setByteElement(term30769, 30, (byte) 54);
        setByteElement(term30769, 31, (byte) 55);
        setField(term30767, term30767.getClass(), "encodeTable", term30769);
        setByteElement(term30770, 0, (byte) 13);
        setByteElement(term30770, 1, (byte) 10);
        setField(term30767, term30767.getClass(), "lineSeparator", term30770);
        setByteField(term30767, term30767.getClass(), "PAD", (byte) 61);
        setByteField(term30767, term30767.getClass(), "pad", (byte) 61);
        setIntField(term30767, term30767.getClass(), "unencodedBlockSize", 5);
        setIntField(term30767, term30767.getClass(), "encodedBlockSize", 8);
        setIntField(term30767, term30767.getClass(), "lineLength", 0);
        setIntField(term30767, term30767.getClass(), "chunkSeparatorLength", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term30767));
    }

};


