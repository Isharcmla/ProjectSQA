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

public class Base32_init_1042801703189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370058;

    public Base32_init_1042801703189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369626 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term370058 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term370059 = (byte[]) newByteArray(91);
        byte[] term370060 = (byte[]) newByteArray(32);
        setIntField(term370058, term370058.getClass(), "decodeSize", 7);
        setByteElement(term370059, 0, (byte) -1);
        setByteElement(term370059, 1, (byte) -1);
        setByteElement(term370059, 2, (byte) -1);
        setByteElement(term370059, 3, (byte) -1);
        setByteElement(term370059, 4, (byte) -1);
        setByteElement(term370059, 5, (byte) -1);
        setByteElement(term370059, 6, (byte) -1);
        setByteElement(term370059, 7, (byte) -1);
        setByteElement(term370059, 8, (byte) -1);
        setByteElement(term370059, 9, (byte) -1);
        setByteElement(term370059, 10, (byte) -1);
        setByteElement(term370059, 11, (byte) -1);
        setByteElement(term370059, 12, (byte) -1);
        setByteElement(term370059, 13, (byte) -1);
        setByteElement(term370059, 14, (byte) -1);
        setByteElement(term370059, 15, (byte) -1);
        setByteElement(term370059, 16, (byte) -1);
        setByteElement(term370059, 17, (byte) -1);
        setByteElement(term370059, 18, (byte) -1);
        setByteElement(term370059, 19, (byte) -1);
        setByteElement(term370059, 20, (byte) -1);
        setByteElement(term370059, 21, (byte) -1);
        setByteElement(term370059, 22, (byte) -1);
        setByteElement(term370059, 23, (byte) -1);
        setByteElement(term370059, 24, (byte) -1);
        setByteElement(term370059, 25, (byte) -1);
        setByteElement(term370059, 26, (byte) -1);
        setByteElement(term370059, 27, (byte) -1);
        setByteElement(term370059, 28, (byte) -1);
        setByteElement(term370059, 29, (byte) -1);
        setByteElement(term370059, 30, (byte) -1);
        setByteElement(term370059, 31, (byte) -1);
        setByteElement(term370059, 32, (byte) -1);
        setByteElement(term370059, 33, (byte) -1);
        setByteElement(term370059, 34, (byte) -1);
        setByteElement(term370059, 35, (byte) -1);
        setByteElement(term370059, 36, (byte) -1);
        setByteElement(term370059, 37, (byte) -1);
        setByteElement(term370059, 38, (byte) -1);
        setByteElement(term370059, 39, (byte) -1);
        setByteElement(term370059, 40, (byte) -1);
        setByteElement(term370059, 41, (byte) -1);
        setByteElement(term370059, 42, (byte) -1);
        setByteElement(term370059, 43, (byte) -1);
        setByteElement(term370059, 44, (byte) -1);
        setByteElement(term370059, 45, (byte) -1);
        setByteElement(term370059, 46, (byte) -1);
        setByteElement(term370059, 47, (byte) -1);
        setByteElement(term370059, 48, (byte) -1);
        setByteElement(term370059, 49, (byte) -1);
        setByteElement(term370059, 50, (byte) 26);
        setByteElement(term370059, 51, (byte) 27);
        setByteElement(term370059, 52, (byte) 28);
        setByteElement(term370059, 53, (byte) 29);
        setByteElement(term370059, 54, (byte) 30);
        setByteElement(term370059, 55, (byte) 31);
        setByteElement(term370059, 56, (byte) -1);
        setByteElement(term370059, 57, (byte) -1);
        setByteElement(term370059, 58, (byte) -1);
        setByteElement(term370059, 59, (byte) -1);
        setByteElement(term370059, 60, (byte) -1);
        setByteElement(term370059, 61, (byte) -1);
        setByteElement(term370059, 62, (byte) -1);
        setByteElement(term370059, 63, (byte) -1);
        setByteElement(term370059, 64, (byte) -1);
        setByteElement(term370059, 66, (byte) 1);
        setByteElement(term370059, 67, (byte) 2);
        setByteElement(term370059, 68, (byte) 3);
        setByteElement(term370059, 69, (byte) 4);
        setByteElement(term370059, 70, (byte) 5);
        setByteElement(term370059, 71, (byte) 6);
        setByteElement(term370059, 72, (byte) 7);
        setByteElement(term370059, 73, (byte) 8);
        setByteElement(term370059, 74, (byte) 9);
        setByteElement(term370059, 75, (byte) 10);
        setByteElement(term370059, 76, (byte) 11);
        setByteElement(term370059, 77, (byte) 12);
        setByteElement(term370059, 78, (byte) 13);
        setByteElement(term370059, 79, (byte) 14);
        setByteElement(term370059, 80, (byte) 15);
        setByteElement(term370059, 81, (byte) 16);
        setByteElement(term370059, 82, (byte) 17);
        setByteElement(term370059, 83, (byte) 18);
        setByteElement(term370059, 84, (byte) 19);
        setByteElement(term370059, 85, (byte) 20);
        setByteElement(term370059, 86, (byte) 21);
        setByteElement(term370059, 87, (byte) 22);
        setByteElement(term370059, 88, (byte) 23);
        setByteElement(term370059, 89, (byte) 24);
        setByteElement(term370059, 90, (byte) 25);
        setField(term370058, term370058.getClass(), "decodeTable", term370059);
        setIntField(term370058, term370058.getClass(), "encodeSize", 8);
        setByteElement(term370060, 0, (byte) 65);
        setByteElement(term370060, 1, (byte) 66);
        setByteElement(term370060, 2, (byte) 67);
        setByteElement(term370060, 3, (byte) 68);
        setByteElement(term370060, 4, (byte) 69);
        setByteElement(term370060, 5, (byte) 70);
        setByteElement(term370060, 6, (byte) 71);
        setByteElement(term370060, 7, (byte) 72);
        setByteElement(term370060, 8, (byte) 73);
        setByteElement(term370060, 9, (byte) 74);
        setByteElement(term370060, 10, (byte) 75);
        setByteElement(term370060, 11, (byte) 76);
        setByteElement(term370060, 12, (byte) 77);
        setByteElement(term370060, 13, (byte) 78);
        setByteElement(term370060, 14, (byte) 79);
        setByteElement(term370060, 15, (byte) 80);
        setByteElement(term370060, 16, (byte) 81);
        setByteElement(term370060, 17, (byte) 82);
        setByteElement(term370060, 18, (byte) 83);
        setByteElement(term370060, 19, (byte) 84);
        setByteElement(term370060, 20, (byte) 85);
        setByteElement(term370060, 21, (byte) 86);
        setByteElement(term370060, 22, (byte) 87);
        setByteElement(term370060, 23, (byte) 88);
        setByteElement(term370060, 24, (byte) 89);
        setByteElement(term370060, 25, (byte) 90);
        setByteElement(term370060, 26, (byte) 50);
        setByteElement(term370060, 27, (byte) 51);
        setByteElement(term370060, 28, (byte) 52);
        setByteElement(term370060, 29, (byte) 53);
        setByteElement(term370060, 30, (byte) 54);
        setByteElement(term370060, 31, (byte) 55);
        setField(term370058, term370058.getClass(), "encodeTable", term370060);
        setField(term370058, term370058.getClass(), "lineSeparator", null);
        setByteField(term370058, term370058.getClass(), "PAD", (byte) 61);
        setByteField(term370058, term370058.getClass(), "pad", (byte) 61);
        setIntField(term370058, term370058.getClass(), "unencodedBlockSize", 5);
        setIntField(term370058, term370058.getClass(), "encodedBlockSize", 8);
        setIntField(term370058, term370058.getClass(), "lineLength", 0);
        setIntField(term370058, term370058.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = null;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term370058));
    }

};


