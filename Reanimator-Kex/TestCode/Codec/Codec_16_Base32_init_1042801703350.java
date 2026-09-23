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

public class Base32_init_1042801703350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650852;
     Object term714049;
     Object term714053;

    public Base32_init_1042801703350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term654477 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term651951 = (byte[]) newByteArray(0);
        setByteField(term654477, term654477.getClass(), "PAD", (byte) 0);
        setIntField(term654477, term654477.getClass(), "unencodedBlockSize", 0);
        setIntField(term654477, term654477.getClass(), "encodedBlockSize", 0);
        setIntField(term654477, term654477.getClass(), "lineLength", 0);
        setIntField(term654477, term654477.getClass(), "chunkSeparatorLength", 0);
        setByteField(term654477, term654477.getClass(), "pad", (byte) -128);
        setField(term654477, term654477.getClass(), "encodeTable", null);
        setField(term654477, term654477.getClass(), "decodeTable", term651951);
        term650852 = (byte[]) newByteArray(495);
        setByteElement(term650852, 10, (byte) 112);
        term714049 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term714050 = (byte[]) newByteArray(88);
        byte[] term714051 = (byte[]) newByteArray(32);
        byte[] term714052 = (byte[]) newByteArray(495);
        setIntField(term714049, term714049.getClass(), "decodeSize", 502);
        setByteElement(term714050, 0, (byte) -1);
        setByteElement(term714050, 1, (byte) -1);
        setByteElement(term714050, 2, (byte) -1);
        setByteElement(term714050, 3, (byte) -1);
        setByteElement(term714050, 4, (byte) -1);
        setByteElement(term714050, 5, (byte) -1);
        setByteElement(term714050, 6, (byte) -1);
        setByteElement(term714050, 7, (byte) -1);
        setByteElement(term714050, 8, (byte) -1);
        setByteElement(term714050, 9, (byte) -1);
        setByteElement(term714050, 10, (byte) -1);
        setByteElement(term714050, 11, (byte) -1);
        setByteElement(term714050, 12, (byte) -1);
        setByteElement(term714050, 13, (byte) -1);
        setByteElement(term714050, 14, (byte) -1);
        setByteElement(term714050, 15, (byte) -1);
        setByteElement(term714050, 16, (byte) -1);
        setByteElement(term714050, 17, (byte) -1);
        setByteElement(term714050, 18, (byte) -1);
        setByteElement(term714050, 19, (byte) -1);
        setByteElement(term714050, 20, (byte) -1);
        setByteElement(term714050, 21, (byte) -1);
        setByteElement(term714050, 22, (byte) -1);
        setByteElement(term714050, 23, (byte) -1);
        setByteElement(term714050, 24, (byte) -1);
        setByteElement(term714050, 25, (byte) -1);
        setByteElement(term714050, 26, (byte) -1);
        setByteElement(term714050, 27, (byte) -1);
        setByteElement(term714050, 28, (byte) -1);
        setByteElement(term714050, 29, (byte) -1);
        setByteElement(term714050, 30, (byte) -1);
        setByteElement(term714050, 31, (byte) -1);
        setByteElement(term714050, 32, (byte) -1);
        setByteElement(term714050, 33, (byte) -1);
        setByteElement(term714050, 34, (byte) -1);
        setByteElement(term714050, 35, (byte) -1);
        setByteElement(term714050, 36, (byte) -1);
        setByteElement(term714050, 37, (byte) -1);
        setByteElement(term714050, 38, (byte) -1);
        setByteElement(term714050, 39, (byte) -1);
        setByteElement(term714050, 40, (byte) -1);
        setByteElement(term714050, 41, (byte) -1);
        setByteElement(term714050, 42, (byte) -1);
        setByteElement(term714050, 43, (byte) -1);
        setByteElement(term714050, 44, (byte) -1);
        setByteElement(term714050, 45, (byte) -1);
        setByteElement(term714050, 46, (byte) -1);
        setByteElement(term714050, 47, (byte) -1);
        setByteElement(term714050, 49, (byte) 1);
        setByteElement(term714050, 50, (byte) 2);
        setByteElement(term714050, 51, (byte) 3);
        setByteElement(term714050, 52, (byte) 4);
        setByteElement(term714050, 53, (byte) 5);
        setByteElement(term714050, 54, (byte) 6);
        setByteElement(term714050, 55, (byte) 7);
        setByteElement(term714050, 56, (byte) 8);
        setByteElement(term714050, 57, (byte) 9);
        setByteElement(term714050, 58, (byte) -1);
        setByteElement(term714050, 59, (byte) -1);
        setByteElement(term714050, 60, (byte) -1);
        setByteElement(term714050, 61, (byte) -1);
        setByteElement(term714050, 62, (byte) -1);
        setByteElement(term714050, 63, (byte) -1);
        setByteElement(term714050, 64, (byte) -1);
        setByteElement(term714050, 65, (byte) 10);
        setByteElement(term714050, 66, (byte) 11);
        setByteElement(term714050, 67, (byte) 12);
        setByteElement(term714050, 68, (byte) 13);
        setByteElement(term714050, 69, (byte) 14);
        setByteElement(term714050, 70, (byte) 15);
        setByteElement(term714050, 71, (byte) 16);
        setByteElement(term714050, 72, (byte) 17);
        setByteElement(term714050, 73, (byte) 18);
        setByteElement(term714050, 74, (byte) 19);
        setByteElement(term714050, 75, (byte) 20);
        setByteElement(term714050, 76, (byte) 21);
        setByteElement(term714050, 77, (byte) 22);
        setByteElement(term714050, 78, (byte) 23);
        setByteElement(term714050, 79, (byte) 24);
        setByteElement(term714050, 80, (byte) 25);
        setByteElement(term714050, 81, (byte) 26);
        setByteElement(term714050, 82, (byte) 27);
        setByteElement(term714050, 83, (byte) 28);
        setByteElement(term714050, 84, (byte) 29);
        setByteElement(term714050, 85, (byte) 30);
        setByteElement(term714050, 86, (byte) 31);
        setByteElement(term714050, 87, (byte) 32);
        setField(term714049, term714049.getClass(), "decodeTable", term714050);
        setIntField(term714049, term714049.getClass(), "encodeSize", 503);
        setByteElement(term714051, 0, (byte) 48);
        setByteElement(term714051, 1, (byte) 49);
        setByteElement(term714051, 2, (byte) 50);
        setByteElement(term714051, 3, (byte) 51);
        setByteElement(term714051, 4, (byte) 52);
        setByteElement(term714051, 5, (byte) 53);
        setByteElement(term714051, 6, (byte) 54);
        setByteElement(term714051, 7, (byte) 55);
        setByteElement(term714051, 8, (byte) 56);
        setByteElement(term714051, 9, (byte) 57);
        setByteElement(term714051, 10, (byte) 65);
        setByteElement(term714051, 11, (byte) 66);
        setByteElement(term714051, 12, (byte) 67);
        setByteElement(term714051, 13, (byte) 68);
        setByteElement(term714051, 14, (byte) 69);
        setByteElement(term714051, 15, (byte) 70);
        setByteElement(term714051, 16, (byte) 71);
        setByteElement(term714051, 17, (byte) 72);
        setByteElement(term714051, 18, (byte) 73);
        setByteElement(term714051, 19, (byte) 74);
        setByteElement(term714051, 20, (byte) 75);
        setByteElement(term714051, 21, (byte) 76);
        setByteElement(term714051, 22, (byte) 77);
        setByteElement(term714051, 23, (byte) 78);
        setByteElement(term714051, 24, (byte) 79);
        setByteElement(term714051, 25, (byte) 80);
        setByteElement(term714051, 26, (byte) 81);
        setByteElement(term714051, 27, (byte) 82);
        setByteElement(term714051, 28, (byte) 83);
        setByteElement(term714051, 29, (byte) 84);
        setByteElement(term714051, 30, (byte) 85);
        setByteElement(term714051, 31, (byte) 86);
        setField(term714049, term714049.getClass(), "encodeTable", term714051);
        setByteElement(term714052, 10, (byte) 112);
        setField(term714049, term714049.getClass(), "lineSeparator", term714052);
        setByteField(term714049, term714049.getClass(), "PAD", (byte) 61);
        setByteField(term714049, term714049.getClass(), "pad", (byte) 61);
        setIntField(term714049, term714049.getClass(), "unencodedBlockSize", 5);
        setIntField(term714049, term714049.getClass(), "encodedBlockSize", 8);
        setIntField(term714049, term714049.getClass(), "lineLength", 0);
        setIntField(term714049, term714049.getClass(), "chunkSeparatorLength", 495);
        term714053 = (byte[]) newByteArray(495);
        setByteElement(term714053, 10, (byte) 112);
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
        args[1] = term650852;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term714049));
        assertTrue(recursiveEquals(term650852, term714053));
    }

};


