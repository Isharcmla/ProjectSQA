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

public class Base32_init_1040917213410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term850232;

    public Base32_init_1040917213410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term846311 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term844650 = (byte[]) newByteArray(0);
        setByteField(term846311, term846311.getClass(), "PAD", (byte) 0);
        setIntField(term846311, term846311.getClass(), "unencodedBlockSize", 0);
        setIntField(term846311, term846311.getClass(), "encodedBlockSize", 0);
        setIntField(term846311, term846311.getClass(), "lineLength", 0);
        setIntField(term846311, term846311.getClass(), "chunkSeparatorLength", 0);
        setByteField(term846311, term846311.getClass(), "pad", (byte) 0);
        setField(term846311, term846311.getClass(), "encodeTable", term844650);
        setField(term846311, term846311.getClass(), "decodeTable", term844650);
        setIntField(term846311, term846311.getClass(), "encodeSize", 0);
        setField(term846311, term846311.getClass(), "lineSeparator", term844650);
        setIntField(term846311, term846311.getClass(), "decodeSize", 0);
        term850232 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term850233 = (byte[]) newByteArray(91);
        byte[] term850234 = (byte[]) newByteArray(32);
        setIntField(term850232, term850232.getClass(), "decodeSize", 7);
        setByteElement(term850233, 0, (byte) -1);
        setByteElement(term850233, 1, (byte) -1);
        setByteElement(term850233, 2, (byte) -1);
        setByteElement(term850233, 3, (byte) -1);
        setByteElement(term850233, 4, (byte) -1);
        setByteElement(term850233, 5, (byte) -1);
        setByteElement(term850233, 6, (byte) -1);
        setByteElement(term850233, 7, (byte) -1);
        setByteElement(term850233, 8, (byte) -1);
        setByteElement(term850233, 9, (byte) -1);
        setByteElement(term850233, 10, (byte) -1);
        setByteElement(term850233, 11, (byte) -1);
        setByteElement(term850233, 12, (byte) -1);
        setByteElement(term850233, 13, (byte) -1);
        setByteElement(term850233, 14, (byte) -1);
        setByteElement(term850233, 15, (byte) -1);
        setByteElement(term850233, 16, (byte) -1);
        setByteElement(term850233, 17, (byte) -1);
        setByteElement(term850233, 18, (byte) -1);
        setByteElement(term850233, 19, (byte) -1);
        setByteElement(term850233, 20, (byte) -1);
        setByteElement(term850233, 21, (byte) -1);
        setByteElement(term850233, 22, (byte) -1);
        setByteElement(term850233, 23, (byte) -1);
        setByteElement(term850233, 24, (byte) -1);
        setByteElement(term850233, 25, (byte) -1);
        setByteElement(term850233, 26, (byte) -1);
        setByteElement(term850233, 27, (byte) -1);
        setByteElement(term850233, 28, (byte) -1);
        setByteElement(term850233, 29, (byte) -1);
        setByteElement(term850233, 30, (byte) -1);
        setByteElement(term850233, 31, (byte) -1);
        setByteElement(term850233, 32, (byte) -1);
        setByteElement(term850233, 33, (byte) -1);
        setByteElement(term850233, 34, (byte) -1);
        setByteElement(term850233, 35, (byte) -1);
        setByteElement(term850233, 36, (byte) -1);
        setByteElement(term850233, 37, (byte) -1);
        setByteElement(term850233, 38, (byte) -1);
        setByteElement(term850233, 39, (byte) -1);
        setByteElement(term850233, 40, (byte) -1);
        setByteElement(term850233, 41, (byte) -1);
        setByteElement(term850233, 42, (byte) -1);
        setByteElement(term850233, 43, (byte) -1);
        setByteElement(term850233, 44, (byte) -1);
        setByteElement(term850233, 45, (byte) -1);
        setByteElement(term850233, 46, (byte) -1);
        setByteElement(term850233, 47, (byte) -1);
        setByteElement(term850233, 48, (byte) -1);
        setByteElement(term850233, 49, (byte) -1);
        setByteElement(term850233, 50, (byte) 26);
        setByteElement(term850233, 51, (byte) 27);
        setByteElement(term850233, 52, (byte) 28);
        setByteElement(term850233, 53, (byte) 29);
        setByteElement(term850233, 54, (byte) 30);
        setByteElement(term850233, 55, (byte) 31);
        setByteElement(term850233, 56, (byte) -1);
        setByteElement(term850233, 57, (byte) -1);
        setByteElement(term850233, 58, (byte) -1);
        setByteElement(term850233, 59, (byte) -1);
        setByteElement(term850233, 60, (byte) -1);
        setByteElement(term850233, 61, (byte) -1);
        setByteElement(term850233, 62, (byte) -1);
        setByteElement(term850233, 63, (byte) -1);
        setByteElement(term850233, 64, (byte) -1);
        setByteElement(term850233, 66, (byte) 1);
        setByteElement(term850233, 67, (byte) 2);
        setByteElement(term850233, 68, (byte) 3);
        setByteElement(term850233, 69, (byte) 4);
        setByteElement(term850233, 70, (byte) 5);
        setByteElement(term850233, 71, (byte) 6);
        setByteElement(term850233, 72, (byte) 7);
        setByteElement(term850233, 73, (byte) 8);
        setByteElement(term850233, 74, (byte) 9);
        setByteElement(term850233, 75, (byte) 10);
        setByteElement(term850233, 76, (byte) 11);
        setByteElement(term850233, 77, (byte) 12);
        setByteElement(term850233, 78, (byte) 13);
        setByteElement(term850233, 79, (byte) 14);
        setByteElement(term850233, 80, (byte) 15);
        setByteElement(term850233, 81, (byte) 16);
        setByteElement(term850233, 82, (byte) 17);
        setByteElement(term850233, 83, (byte) 18);
        setByteElement(term850233, 84, (byte) 19);
        setByteElement(term850233, 85, (byte) 20);
        setByteElement(term850233, 86, (byte) 21);
        setByteElement(term850233, 87, (byte) 22);
        setByteElement(term850233, 88, (byte) 23);
        setByteElement(term850233, 89, (byte) 24);
        setByteElement(term850233, 90, (byte) 25);
        setField(term850232, term850232.getClass(), "decodeTable", term850233);
        setIntField(term850232, term850232.getClass(), "encodeSize", 8);
        setByteElement(term850234, 0, (byte) 65);
        setByteElement(term850234, 1, (byte) 66);
        setByteElement(term850234, 2, (byte) 67);
        setByteElement(term850234, 3, (byte) 68);
        setByteElement(term850234, 4, (byte) 69);
        setByteElement(term850234, 5, (byte) 70);
        setByteElement(term850234, 6, (byte) 71);
        setByteElement(term850234, 7, (byte) 72);
        setByteElement(term850234, 8, (byte) 73);
        setByteElement(term850234, 9, (byte) 74);
        setByteElement(term850234, 10, (byte) 75);
        setByteElement(term850234, 11, (byte) 76);
        setByteElement(term850234, 12, (byte) 77);
        setByteElement(term850234, 13, (byte) 78);
        setByteElement(term850234, 14, (byte) 79);
        setByteElement(term850234, 15, (byte) 80);
        setByteElement(term850234, 16, (byte) 81);
        setByteElement(term850234, 17, (byte) 82);
        setByteElement(term850234, 18, (byte) 83);
        setByteElement(term850234, 19, (byte) 84);
        setByteElement(term850234, 20, (byte) 85);
        setByteElement(term850234, 21, (byte) 86);
        setByteElement(term850234, 22, (byte) 87);
        setByteElement(term850234, 23, (byte) 88);
        setByteElement(term850234, 24, (byte) 89);
        setByteElement(term850234, 25, (byte) 90);
        setByteElement(term850234, 26, (byte) 50);
        setByteElement(term850234, 27, (byte) 51);
        setByteElement(term850234, 28, (byte) 52);
        setByteElement(term850234, 29, (byte) 53);
        setByteElement(term850234, 30, (byte) 54);
        setByteElement(term850234, 31, (byte) 55);
        setField(term850232, term850232.getClass(), "encodeTable", term850234);
        setField(term850232, term850232.getClass(), "lineSeparator", null);
        setByteField(term850232, term850232.getClass(), "PAD", (byte) 61);
        setByteField(term850232, term850232.getClass(), "pad", (byte) 61);
        setIntField(term850232, term850232.getClass(), "unencodedBlockSize", 5);
        setIntField(term850232, term850232.getClass(), "encodedBlockSize", 8);
        setIntField(term850232, term850232.getClass(), "lineLength", 0);
        setIntField(term850232, term850232.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term850232));
    }

};


