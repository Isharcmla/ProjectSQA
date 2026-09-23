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

public class Base32_init_1040918143223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434076;

    public Base32_init_1040918143223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term433918 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term432102 = (byte[]) newByteArray(8);
        setByteField(term433918, term433918.getClass(), "PAD", (byte) 0);
        setIntField(term433918, term433918.getClass(), "unencodedBlockSize", 0);
        setIntField(term433918, term433918.getClass(), "encodedBlockSize", 0);
        setIntField(term433918, term433918.getClass(), "lineLength", 0);
        setIntField(term433918, term433918.getClass(), "chunkSeparatorLength", 0);
        setByteField(term433918, term433918.getClass(), "pad", (byte) 0);
        setField(term433918, term433918.getClass(), "encodeTable", term432102);
        setField(term433918, term433918.getClass(), "decodeTable", term432102);
        setIntField(term433918, term433918.getClass(), "encodeSize", 0);
        setField(term433918, term433918.getClass(), "lineSeparator", term432102);
        setIntField(term433918, term433918.getClass(), "decodeSize", 0);
        term434076 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term434077 = (byte[]) newByteArray(88);
        byte[] term434078 = (byte[]) newByteArray(32);
        setIntField(term434076, term434076.getClass(), "decodeSize", 7);
        setByteElement(term434077, 0, (byte) -1);
        setByteElement(term434077, 1, (byte) -1);
        setByteElement(term434077, 2, (byte) -1);
        setByteElement(term434077, 3, (byte) -1);
        setByteElement(term434077, 4, (byte) -1);
        setByteElement(term434077, 5, (byte) -1);
        setByteElement(term434077, 6, (byte) -1);
        setByteElement(term434077, 7, (byte) -1);
        setByteElement(term434077, 8, (byte) -1);
        setByteElement(term434077, 9, (byte) -1);
        setByteElement(term434077, 10, (byte) -1);
        setByteElement(term434077, 11, (byte) -1);
        setByteElement(term434077, 12, (byte) -1);
        setByteElement(term434077, 13, (byte) -1);
        setByteElement(term434077, 14, (byte) -1);
        setByteElement(term434077, 15, (byte) -1);
        setByteElement(term434077, 16, (byte) -1);
        setByteElement(term434077, 17, (byte) -1);
        setByteElement(term434077, 18, (byte) -1);
        setByteElement(term434077, 19, (byte) -1);
        setByteElement(term434077, 20, (byte) -1);
        setByteElement(term434077, 21, (byte) -1);
        setByteElement(term434077, 22, (byte) -1);
        setByteElement(term434077, 23, (byte) -1);
        setByteElement(term434077, 24, (byte) -1);
        setByteElement(term434077, 25, (byte) -1);
        setByteElement(term434077, 26, (byte) -1);
        setByteElement(term434077, 27, (byte) -1);
        setByteElement(term434077, 28, (byte) -1);
        setByteElement(term434077, 29, (byte) -1);
        setByteElement(term434077, 30, (byte) -1);
        setByteElement(term434077, 31, (byte) -1);
        setByteElement(term434077, 32, (byte) -1);
        setByteElement(term434077, 33, (byte) -1);
        setByteElement(term434077, 34, (byte) -1);
        setByteElement(term434077, 35, (byte) -1);
        setByteElement(term434077, 36, (byte) -1);
        setByteElement(term434077, 37, (byte) -1);
        setByteElement(term434077, 38, (byte) -1);
        setByteElement(term434077, 39, (byte) -1);
        setByteElement(term434077, 40, (byte) -1);
        setByteElement(term434077, 41, (byte) -1);
        setByteElement(term434077, 42, (byte) -1);
        setByteElement(term434077, 43, (byte) -1);
        setByteElement(term434077, 44, (byte) -1);
        setByteElement(term434077, 45, (byte) -1);
        setByteElement(term434077, 46, (byte) -1);
        setByteElement(term434077, 47, (byte) -1);
        setByteElement(term434077, 49, (byte) 1);
        setByteElement(term434077, 50, (byte) 2);
        setByteElement(term434077, 51, (byte) 3);
        setByteElement(term434077, 52, (byte) 4);
        setByteElement(term434077, 53, (byte) 5);
        setByteElement(term434077, 54, (byte) 6);
        setByteElement(term434077, 55, (byte) 7);
        setByteElement(term434077, 56, (byte) 8);
        setByteElement(term434077, 57, (byte) 9);
        setByteElement(term434077, 58, (byte) -1);
        setByteElement(term434077, 59, (byte) -1);
        setByteElement(term434077, 60, (byte) -1);
        setByteElement(term434077, 61, (byte) -1);
        setByteElement(term434077, 62, (byte) -1);
        setByteElement(term434077, 63, (byte) -1);
        setByteElement(term434077, 64, (byte) -1);
        setByteElement(term434077, 65, (byte) 10);
        setByteElement(term434077, 66, (byte) 11);
        setByteElement(term434077, 67, (byte) 12);
        setByteElement(term434077, 68, (byte) 13);
        setByteElement(term434077, 69, (byte) 14);
        setByteElement(term434077, 70, (byte) 15);
        setByteElement(term434077, 71, (byte) 16);
        setByteElement(term434077, 72, (byte) 17);
        setByteElement(term434077, 73, (byte) 18);
        setByteElement(term434077, 74, (byte) 19);
        setByteElement(term434077, 75, (byte) 20);
        setByteElement(term434077, 76, (byte) 21);
        setByteElement(term434077, 77, (byte) 22);
        setByteElement(term434077, 78, (byte) 23);
        setByteElement(term434077, 79, (byte) 24);
        setByteElement(term434077, 80, (byte) 25);
        setByteElement(term434077, 81, (byte) 26);
        setByteElement(term434077, 82, (byte) 27);
        setByteElement(term434077, 83, (byte) 28);
        setByteElement(term434077, 84, (byte) 29);
        setByteElement(term434077, 85, (byte) 30);
        setByteElement(term434077, 86, (byte) 31);
        setByteElement(term434077, 87, (byte) 32);
        setField(term434076, term434076.getClass(), "decodeTable", term434077);
        setIntField(term434076, term434076.getClass(), "encodeSize", 8);
        setByteElement(term434078, 0, (byte) 48);
        setByteElement(term434078, 1, (byte) 49);
        setByteElement(term434078, 2, (byte) 50);
        setByteElement(term434078, 3, (byte) 51);
        setByteElement(term434078, 4, (byte) 52);
        setByteElement(term434078, 5, (byte) 53);
        setByteElement(term434078, 6, (byte) 54);
        setByteElement(term434078, 7, (byte) 55);
        setByteElement(term434078, 8, (byte) 56);
        setByteElement(term434078, 9, (byte) 57);
        setByteElement(term434078, 10, (byte) 65);
        setByteElement(term434078, 11, (byte) 66);
        setByteElement(term434078, 12, (byte) 67);
        setByteElement(term434078, 13, (byte) 68);
        setByteElement(term434078, 14, (byte) 69);
        setByteElement(term434078, 15, (byte) 70);
        setByteElement(term434078, 16, (byte) 71);
        setByteElement(term434078, 17, (byte) 72);
        setByteElement(term434078, 18, (byte) 73);
        setByteElement(term434078, 19, (byte) 74);
        setByteElement(term434078, 20, (byte) 75);
        setByteElement(term434078, 21, (byte) 76);
        setByteElement(term434078, 22, (byte) 77);
        setByteElement(term434078, 23, (byte) 78);
        setByteElement(term434078, 24, (byte) 79);
        setByteElement(term434078, 25, (byte) 80);
        setByteElement(term434078, 26, (byte) 81);
        setByteElement(term434078, 27, (byte) 82);
        setByteElement(term434078, 28, (byte) 83);
        setByteElement(term434078, 29, (byte) 84);
        setByteElement(term434078, 30, (byte) 85);
        setByteElement(term434078, 31, (byte) 86);
        setField(term434076, term434076.getClass(), "encodeTable", term434078);
        setField(term434076, term434076.getClass(), "lineSeparator", null);
        setByteField(term434076, term434076.getClass(), "PAD", (byte) 61);
        setByteField(term434076, term434076.getClass(), "pad", (byte) 61);
        setIntField(term434076, term434076.getClass(), "unencodedBlockSize", 5);
        setIntField(term434076, term434076.getClass(), "encodedBlockSize", 8);
        setIntField(term434076, term434076.getClass(), "lineLength", 0);
        setIntField(term434076, term434076.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term434076));
    }

};


