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

public class Base32_init_104091721311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1059;

    public Base32_init_104091721311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1059 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1060 = (byte[]) newByteArray(91);
        byte[] term1061 = (byte[]) newByteArray(32);
        setIntField(term1059, term1059.getClass(), "decodeSize", 7);
        setByteElement(term1060, 0, (byte) -1);
        setByteElement(term1060, 1, (byte) -1);
        setByteElement(term1060, 2, (byte) -1);
        setByteElement(term1060, 3, (byte) -1);
        setByteElement(term1060, 4, (byte) -1);
        setByteElement(term1060, 5, (byte) -1);
        setByteElement(term1060, 6, (byte) -1);
        setByteElement(term1060, 7, (byte) -1);
        setByteElement(term1060, 8, (byte) -1);
        setByteElement(term1060, 9, (byte) -1);
        setByteElement(term1060, 10, (byte) -1);
        setByteElement(term1060, 11, (byte) -1);
        setByteElement(term1060, 12, (byte) -1);
        setByteElement(term1060, 13, (byte) -1);
        setByteElement(term1060, 14, (byte) -1);
        setByteElement(term1060, 15, (byte) -1);
        setByteElement(term1060, 16, (byte) -1);
        setByteElement(term1060, 17, (byte) -1);
        setByteElement(term1060, 18, (byte) -1);
        setByteElement(term1060, 19, (byte) -1);
        setByteElement(term1060, 20, (byte) -1);
        setByteElement(term1060, 21, (byte) -1);
        setByteElement(term1060, 22, (byte) -1);
        setByteElement(term1060, 23, (byte) -1);
        setByteElement(term1060, 24, (byte) -1);
        setByteElement(term1060, 25, (byte) -1);
        setByteElement(term1060, 26, (byte) -1);
        setByteElement(term1060, 27, (byte) -1);
        setByteElement(term1060, 28, (byte) -1);
        setByteElement(term1060, 29, (byte) -1);
        setByteElement(term1060, 30, (byte) -1);
        setByteElement(term1060, 31, (byte) -1);
        setByteElement(term1060, 32, (byte) -1);
        setByteElement(term1060, 33, (byte) -1);
        setByteElement(term1060, 34, (byte) -1);
        setByteElement(term1060, 35, (byte) -1);
        setByteElement(term1060, 36, (byte) -1);
        setByteElement(term1060, 37, (byte) -1);
        setByteElement(term1060, 38, (byte) -1);
        setByteElement(term1060, 39, (byte) -1);
        setByteElement(term1060, 40, (byte) -1);
        setByteElement(term1060, 41, (byte) -1);
        setByteElement(term1060, 42, (byte) -1);
        setByteElement(term1060, 43, (byte) -1);
        setByteElement(term1060, 44, (byte) -1);
        setByteElement(term1060, 45, (byte) -1);
        setByteElement(term1060, 46, (byte) -1);
        setByteElement(term1060, 47, (byte) -1);
        setByteElement(term1060, 48, (byte) -1);
        setByteElement(term1060, 49, (byte) -1);
        setByteElement(term1060, 50, (byte) 26);
        setByteElement(term1060, 51, (byte) 27);
        setByteElement(term1060, 52, (byte) 28);
        setByteElement(term1060, 53, (byte) 29);
        setByteElement(term1060, 54, (byte) 30);
        setByteElement(term1060, 55, (byte) 31);
        setByteElement(term1060, 56, (byte) -1);
        setByteElement(term1060, 57, (byte) -1);
        setByteElement(term1060, 58, (byte) -1);
        setByteElement(term1060, 59, (byte) -1);
        setByteElement(term1060, 60, (byte) -1);
        setByteElement(term1060, 61, (byte) -1);
        setByteElement(term1060, 62, (byte) -1);
        setByteElement(term1060, 63, (byte) -1);
        setByteElement(term1060, 64, (byte) -1);
        setByteElement(term1060, 66, (byte) 1);
        setByteElement(term1060, 67, (byte) 2);
        setByteElement(term1060, 68, (byte) 3);
        setByteElement(term1060, 69, (byte) 4);
        setByteElement(term1060, 70, (byte) 5);
        setByteElement(term1060, 71, (byte) 6);
        setByteElement(term1060, 72, (byte) 7);
        setByteElement(term1060, 73, (byte) 8);
        setByteElement(term1060, 74, (byte) 9);
        setByteElement(term1060, 75, (byte) 10);
        setByteElement(term1060, 76, (byte) 11);
        setByteElement(term1060, 77, (byte) 12);
        setByteElement(term1060, 78, (byte) 13);
        setByteElement(term1060, 79, (byte) 14);
        setByteElement(term1060, 80, (byte) 15);
        setByteElement(term1060, 81, (byte) 16);
        setByteElement(term1060, 82, (byte) 17);
        setByteElement(term1060, 83, (byte) 18);
        setByteElement(term1060, 84, (byte) 19);
        setByteElement(term1060, 85, (byte) 20);
        setByteElement(term1060, 86, (byte) 21);
        setByteElement(term1060, 87, (byte) 22);
        setByteElement(term1060, 88, (byte) 23);
        setByteElement(term1060, 89, (byte) 24);
        setByteElement(term1060, 90, (byte) 25);
        setField(term1059, term1059.getClass(), "decodeTable", term1060);
        setIntField(term1059, term1059.getClass(), "encodeSize", 8);
        setByteElement(term1061, 0, (byte) 65);
        setByteElement(term1061, 1, (byte) 66);
        setByteElement(term1061, 2, (byte) 67);
        setByteElement(term1061, 3, (byte) 68);
        setByteElement(term1061, 4, (byte) 69);
        setByteElement(term1061, 5, (byte) 70);
        setByteElement(term1061, 6, (byte) 71);
        setByteElement(term1061, 7, (byte) 72);
        setByteElement(term1061, 8, (byte) 73);
        setByteElement(term1061, 9, (byte) 74);
        setByteElement(term1061, 10, (byte) 75);
        setByteElement(term1061, 11, (byte) 76);
        setByteElement(term1061, 12, (byte) 77);
        setByteElement(term1061, 13, (byte) 78);
        setByteElement(term1061, 14, (byte) 79);
        setByteElement(term1061, 15, (byte) 80);
        setByteElement(term1061, 16, (byte) 81);
        setByteElement(term1061, 17, (byte) 82);
        setByteElement(term1061, 18, (byte) 83);
        setByteElement(term1061, 19, (byte) 84);
        setByteElement(term1061, 20, (byte) 85);
        setByteElement(term1061, 21, (byte) 86);
        setByteElement(term1061, 22, (byte) 87);
        setByteElement(term1061, 23, (byte) 88);
        setByteElement(term1061, 24, (byte) 89);
        setByteElement(term1061, 25, (byte) 90);
        setByteElement(term1061, 26, (byte) 50);
        setByteElement(term1061, 27, (byte) 51);
        setByteElement(term1061, 28, (byte) 52);
        setByteElement(term1061, 29, (byte) 53);
        setByteElement(term1061, 30, (byte) 54);
        setByteElement(term1061, 31, (byte) 55);
        setField(term1059, term1059.getClass(), "encodeTable", term1061);
        setField(term1059, term1059.getClass(), "lineSeparator", null);
        setByteField(term1059, term1059.getClass(), "PAD", (byte) 61);
        setByteField(term1059, term1059.getClass(), "pad", (byte) 61);
        setIntField(term1059, term1059.getClass(), "unencodedBlockSize", 5);
        setIntField(term1059, term1059.getClass(), "encodedBlockSize", 8);
        setIntField(term1059, term1059.getClass(), "lineLength", 0);
        setIntField(term1059, term1059.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1059));
    }

};


