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

public class Base32_init_1042801703464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term954638;
     Object term1012022;
     Object term1012026;

    public Base32_init_1042801703464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term961529 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        setByteField(term961529, term961529.getClass(), "PAD", (byte) 0);
        setIntField(term961529, term961529.getClass(), "unencodedBlockSize", 0);
        setIntField(term961529, term961529.getClass(), "encodedBlockSize", 0);
        setIntField(term961529, term961529.getClass(), "lineLength", 0);
        setIntField(term961529, term961529.getClass(), "chunkSeparatorLength", 0);
        setByteField(term961529, term961529.getClass(), "pad", (byte) -128);
        setField(term961529, term961529.getClass(), "encodeTable", null);
        setField(term961529, term961529.getClass(), "decodeTable", null);
        setIntField(term961529, term961529.getClass(), "encodeSize", 0);
        setField(term961529, term961529.getClass(), "lineSeparator", null);
        setIntField(term961529, term961529.getClass(), "decodeSize", 0);
        term954638 = (byte[]) newByteArray(5);
        term1012022 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1012023 = (byte[]) newByteArray(88);
        byte[] term1012024 = (byte[]) newByteArray(32);
        byte[] term1012025 = (byte[]) newByteArray(5);
        setIntField(term1012022, term1012022.getClass(), "decodeSize", 12);
        setByteElement(term1012023, 0, (byte) -1);
        setByteElement(term1012023, 1, (byte) -1);
        setByteElement(term1012023, 2, (byte) -1);
        setByteElement(term1012023, 3, (byte) -1);
        setByteElement(term1012023, 4, (byte) -1);
        setByteElement(term1012023, 5, (byte) -1);
        setByteElement(term1012023, 6, (byte) -1);
        setByteElement(term1012023, 7, (byte) -1);
        setByteElement(term1012023, 8, (byte) -1);
        setByteElement(term1012023, 9, (byte) -1);
        setByteElement(term1012023, 10, (byte) -1);
        setByteElement(term1012023, 11, (byte) -1);
        setByteElement(term1012023, 12, (byte) -1);
        setByteElement(term1012023, 13, (byte) -1);
        setByteElement(term1012023, 14, (byte) -1);
        setByteElement(term1012023, 15, (byte) -1);
        setByteElement(term1012023, 16, (byte) -1);
        setByteElement(term1012023, 17, (byte) -1);
        setByteElement(term1012023, 18, (byte) -1);
        setByteElement(term1012023, 19, (byte) -1);
        setByteElement(term1012023, 20, (byte) -1);
        setByteElement(term1012023, 21, (byte) -1);
        setByteElement(term1012023, 22, (byte) -1);
        setByteElement(term1012023, 23, (byte) -1);
        setByteElement(term1012023, 24, (byte) -1);
        setByteElement(term1012023, 25, (byte) -1);
        setByteElement(term1012023, 26, (byte) -1);
        setByteElement(term1012023, 27, (byte) -1);
        setByteElement(term1012023, 28, (byte) -1);
        setByteElement(term1012023, 29, (byte) -1);
        setByteElement(term1012023, 30, (byte) -1);
        setByteElement(term1012023, 31, (byte) -1);
        setByteElement(term1012023, 32, (byte) -1);
        setByteElement(term1012023, 33, (byte) -1);
        setByteElement(term1012023, 34, (byte) -1);
        setByteElement(term1012023, 35, (byte) -1);
        setByteElement(term1012023, 36, (byte) -1);
        setByteElement(term1012023, 37, (byte) -1);
        setByteElement(term1012023, 38, (byte) -1);
        setByteElement(term1012023, 39, (byte) -1);
        setByteElement(term1012023, 40, (byte) -1);
        setByteElement(term1012023, 41, (byte) -1);
        setByteElement(term1012023, 42, (byte) -1);
        setByteElement(term1012023, 43, (byte) -1);
        setByteElement(term1012023, 44, (byte) -1);
        setByteElement(term1012023, 45, (byte) -1);
        setByteElement(term1012023, 46, (byte) -1);
        setByteElement(term1012023, 47, (byte) -1);
        setByteElement(term1012023, 49, (byte) 1);
        setByteElement(term1012023, 50, (byte) 2);
        setByteElement(term1012023, 51, (byte) 3);
        setByteElement(term1012023, 52, (byte) 4);
        setByteElement(term1012023, 53, (byte) 5);
        setByteElement(term1012023, 54, (byte) 6);
        setByteElement(term1012023, 55, (byte) 7);
        setByteElement(term1012023, 56, (byte) 8);
        setByteElement(term1012023, 57, (byte) 9);
        setByteElement(term1012023, 58, (byte) -1);
        setByteElement(term1012023, 59, (byte) -1);
        setByteElement(term1012023, 60, (byte) -1);
        setByteElement(term1012023, 61, (byte) -1);
        setByteElement(term1012023, 62, (byte) -1);
        setByteElement(term1012023, 63, (byte) -1);
        setByteElement(term1012023, 64, (byte) -1);
        setByteElement(term1012023, 65, (byte) 10);
        setByteElement(term1012023, 66, (byte) 11);
        setByteElement(term1012023, 67, (byte) 12);
        setByteElement(term1012023, 68, (byte) 13);
        setByteElement(term1012023, 69, (byte) 14);
        setByteElement(term1012023, 70, (byte) 15);
        setByteElement(term1012023, 71, (byte) 16);
        setByteElement(term1012023, 72, (byte) 17);
        setByteElement(term1012023, 73, (byte) 18);
        setByteElement(term1012023, 74, (byte) 19);
        setByteElement(term1012023, 75, (byte) 20);
        setByteElement(term1012023, 76, (byte) 21);
        setByteElement(term1012023, 77, (byte) 22);
        setByteElement(term1012023, 78, (byte) 23);
        setByteElement(term1012023, 79, (byte) 24);
        setByteElement(term1012023, 80, (byte) 25);
        setByteElement(term1012023, 81, (byte) 26);
        setByteElement(term1012023, 82, (byte) 27);
        setByteElement(term1012023, 83, (byte) 28);
        setByteElement(term1012023, 84, (byte) 29);
        setByteElement(term1012023, 85, (byte) 30);
        setByteElement(term1012023, 86, (byte) 31);
        setByteElement(term1012023, 87, (byte) 32);
        setField(term1012022, term1012022.getClass(), "decodeTable", term1012023);
        setIntField(term1012022, term1012022.getClass(), "encodeSize", 13);
        setByteElement(term1012024, 0, (byte) 48);
        setByteElement(term1012024, 1, (byte) 49);
        setByteElement(term1012024, 2, (byte) 50);
        setByteElement(term1012024, 3, (byte) 51);
        setByteElement(term1012024, 4, (byte) 52);
        setByteElement(term1012024, 5, (byte) 53);
        setByteElement(term1012024, 6, (byte) 54);
        setByteElement(term1012024, 7, (byte) 55);
        setByteElement(term1012024, 8, (byte) 56);
        setByteElement(term1012024, 9, (byte) 57);
        setByteElement(term1012024, 10, (byte) 65);
        setByteElement(term1012024, 11, (byte) 66);
        setByteElement(term1012024, 12, (byte) 67);
        setByteElement(term1012024, 13, (byte) 68);
        setByteElement(term1012024, 14, (byte) 69);
        setByteElement(term1012024, 15, (byte) 70);
        setByteElement(term1012024, 16, (byte) 71);
        setByteElement(term1012024, 17, (byte) 72);
        setByteElement(term1012024, 18, (byte) 73);
        setByteElement(term1012024, 19, (byte) 74);
        setByteElement(term1012024, 20, (byte) 75);
        setByteElement(term1012024, 21, (byte) 76);
        setByteElement(term1012024, 22, (byte) 77);
        setByteElement(term1012024, 23, (byte) 78);
        setByteElement(term1012024, 24, (byte) 79);
        setByteElement(term1012024, 25, (byte) 80);
        setByteElement(term1012024, 26, (byte) 81);
        setByteElement(term1012024, 27, (byte) 82);
        setByteElement(term1012024, 28, (byte) 83);
        setByteElement(term1012024, 29, (byte) 84);
        setByteElement(term1012024, 30, (byte) 85);
        setByteElement(term1012024, 31, (byte) 86);
        setField(term1012022, term1012022.getClass(), "encodeTable", term1012024);
        setField(term1012022, term1012022.getClass(), "lineSeparator", term1012025);
        setByteField(term1012022, term1012022.getClass(), "PAD", (byte) 61);
        setByteField(term1012022, term1012022.getClass(), "pad", (byte) 61);
        setIntField(term1012022, term1012022.getClass(), "unencodedBlockSize", 5);
        setIntField(term1012022, term1012022.getClass(), "encodedBlockSize", 8);
        setIntField(term1012022, term1012022.getClass(), "lineLength", 0);
        setIntField(term1012022, term1012022.getClass(), "chunkSeparatorLength", 5);
        term1012026 = (byte[]) newByteArray(5);
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
        args[1] = term954638;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1012022));
        assertTrue(recursiveEquals(term954638, term1012026));
    }

};


