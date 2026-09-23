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

public class Base32_init_1042801703207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384340;
     Object term419365;
     Object term419369;

    public Base32_init_1042801703207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term385603 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term384340 = (byte[]) newByteArray(9);
        setByteField(term385603, term385603.getClass(), "PAD", (byte) 0);
        setIntField(term385603, term385603.getClass(), "unencodedBlockSize", 0);
        setIntField(term385603, term385603.getClass(), "encodedBlockSize", 0);
        setIntField(term385603, term385603.getClass(), "lineLength", 0);
        setIntField(term385603, term385603.getClass(), "chunkSeparatorLength", 0);
        setByteField(term385603, term385603.getClass(), "pad", (byte) -128);
        setField(term385603, term385603.getClass(), "encodeTable", null);
        setField(term385603, term385603.getClass(), "decodeTable", null);
        setIntField(term385603, term385603.getClass(), "encodeSize", 0);
        setField(term385603, term385603.getClass(), "lineSeparator", term384340);
        setIntField(term385603, term385603.getClass(), "decodeSize", 0);
        term419365 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term419366 = (byte[]) newByteArray(88);
        byte[] term419367 = (byte[]) newByteArray(32);
        byte[] term419368 = (byte[]) newByteArray(9);
        setIntField(term419365, term419365.getClass(), "decodeSize", 16);
        setByteElement(term419366, 0, (byte) -1);
        setByteElement(term419366, 1, (byte) -1);
        setByteElement(term419366, 2, (byte) -1);
        setByteElement(term419366, 3, (byte) -1);
        setByteElement(term419366, 4, (byte) -1);
        setByteElement(term419366, 5, (byte) -1);
        setByteElement(term419366, 6, (byte) -1);
        setByteElement(term419366, 7, (byte) -1);
        setByteElement(term419366, 8, (byte) -1);
        setByteElement(term419366, 9, (byte) -1);
        setByteElement(term419366, 10, (byte) -1);
        setByteElement(term419366, 11, (byte) -1);
        setByteElement(term419366, 12, (byte) -1);
        setByteElement(term419366, 13, (byte) -1);
        setByteElement(term419366, 14, (byte) -1);
        setByteElement(term419366, 15, (byte) -1);
        setByteElement(term419366, 16, (byte) -1);
        setByteElement(term419366, 17, (byte) -1);
        setByteElement(term419366, 18, (byte) -1);
        setByteElement(term419366, 19, (byte) -1);
        setByteElement(term419366, 20, (byte) -1);
        setByteElement(term419366, 21, (byte) -1);
        setByteElement(term419366, 22, (byte) -1);
        setByteElement(term419366, 23, (byte) -1);
        setByteElement(term419366, 24, (byte) -1);
        setByteElement(term419366, 25, (byte) -1);
        setByteElement(term419366, 26, (byte) -1);
        setByteElement(term419366, 27, (byte) -1);
        setByteElement(term419366, 28, (byte) -1);
        setByteElement(term419366, 29, (byte) -1);
        setByteElement(term419366, 30, (byte) -1);
        setByteElement(term419366, 31, (byte) -1);
        setByteElement(term419366, 32, (byte) -1);
        setByteElement(term419366, 33, (byte) -1);
        setByteElement(term419366, 34, (byte) -1);
        setByteElement(term419366, 35, (byte) -1);
        setByteElement(term419366, 36, (byte) -1);
        setByteElement(term419366, 37, (byte) -1);
        setByteElement(term419366, 38, (byte) -1);
        setByteElement(term419366, 39, (byte) -1);
        setByteElement(term419366, 40, (byte) -1);
        setByteElement(term419366, 41, (byte) -1);
        setByteElement(term419366, 42, (byte) -1);
        setByteElement(term419366, 43, (byte) -1);
        setByteElement(term419366, 44, (byte) -1);
        setByteElement(term419366, 45, (byte) -1);
        setByteElement(term419366, 46, (byte) -1);
        setByteElement(term419366, 47, (byte) -1);
        setByteElement(term419366, 49, (byte) 1);
        setByteElement(term419366, 50, (byte) 2);
        setByteElement(term419366, 51, (byte) 3);
        setByteElement(term419366, 52, (byte) 4);
        setByteElement(term419366, 53, (byte) 5);
        setByteElement(term419366, 54, (byte) 6);
        setByteElement(term419366, 55, (byte) 7);
        setByteElement(term419366, 56, (byte) 8);
        setByteElement(term419366, 57, (byte) 9);
        setByteElement(term419366, 58, (byte) -1);
        setByteElement(term419366, 59, (byte) -1);
        setByteElement(term419366, 60, (byte) -1);
        setByteElement(term419366, 61, (byte) -1);
        setByteElement(term419366, 62, (byte) -1);
        setByteElement(term419366, 63, (byte) -1);
        setByteElement(term419366, 64, (byte) -1);
        setByteElement(term419366, 65, (byte) 10);
        setByteElement(term419366, 66, (byte) 11);
        setByteElement(term419366, 67, (byte) 12);
        setByteElement(term419366, 68, (byte) 13);
        setByteElement(term419366, 69, (byte) 14);
        setByteElement(term419366, 70, (byte) 15);
        setByteElement(term419366, 71, (byte) 16);
        setByteElement(term419366, 72, (byte) 17);
        setByteElement(term419366, 73, (byte) 18);
        setByteElement(term419366, 74, (byte) 19);
        setByteElement(term419366, 75, (byte) 20);
        setByteElement(term419366, 76, (byte) 21);
        setByteElement(term419366, 77, (byte) 22);
        setByteElement(term419366, 78, (byte) 23);
        setByteElement(term419366, 79, (byte) 24);
        setByteElement(term419366, 80, (byte) 25);
        setByteElement(term419366, 81, (byte) 26);
        setByteElement(term419366, 82, (byte) 27);
        setByteElement(term419366, 83, (byte) 28);
        setByteElement(term419366, 84, (byte) 29);
        setByteElement(term419366, 85, (byte) 30);
        setByteElement(term419366, 86, (byte) 31);
        setByteElement(term419366, 87, (byte) 32);
        setField(term419365, term419365.getClass(), "decodeTable", term419366);
        setIntField(term419365, term419365.getClass(), "encodeSize", 17);
        setByteElement(term419367, 0, (byte) 48);
        setByteElement(term419367, 1, (byte) 49);
        setByteElement(term419367, 2, (byte) 50);
        setByteElement(term419367, 3, (byte) 51);
        setByteElement(term419367, 4, (byte) 52);
        setByteElement(term419367, 5, (byte) 53);
        setByteElement(term419367, 6, (byte) 54);
        setByteElement(term419367, 7, (byte) 55);
        setByteElement(term419367, 8, (byte) 56);
        setByteElement(term419367, 9, (byte) 57);
        setByteElement(term419367, 10, (byte) 65);
        setByteElement(term419367, 11, (byte) 66);
        setByteElement(term419367, 12, (byte) 67);
        setByteElement(term419367, 13, (byte) 68);
        setByteElement(term419367, 14, (byte) 69);
        setByteElement(term419367, 15, (byte) 70);
        setByteElement(term419367, 16, (byte) 71);
        setByteElement(term419367, 17, (byte) 72);
        setByteElement(term419367, 18, (byte) 73);
        setByteElement(term419367, 19, (byte) 74);
        setByteElement(term419367, 20, (byte) 75);
        setByteElement(term419367, 21, (byte) 76);
        setByteElement(term419367, 22, (byte) 77);
        setByteElement(term419367, 23, (byte) 78);
        setByteElement(term419367, 24, (byte) 79);
        setByteElement(term419367, 25, (byte) 80);
        setByteElement(term419367, 26, (byte) 81);
        setByteElement(term419367, 27, (byte) 82);
        setByteElement(term419367, 28, (byte) 83);
        setByteElement(term419367, 29, (byte) 84);
        setByteElement(term419367, 30, (byte) 85);
        setByteElement(term419367, 31, (byte) 86);
        setField(term419365, term419365.getClass(), "encodeTable", term419367);
        setField(term419365, term419365.getClass(), "lineSeparator", term419368);
        setByteField(term419365, term419365.getClass(), "PAD", (byte) 61);
        setByteField(term419365, term419365.getClass(), "pad", (byte) 61);
        setIntField(term419365, term419365.getClass(), "unencodedBlockSize", 5);
        setIntField(term419365, term419365.getClass(), "encodedBlockSize", 8);
        setIntField(term419365, term419365.getClass(), "lineLength", 0);
        setIntField(term419365, term419365.getClass(), "chunkSeparatorLength", 9);
        term419369 = (byte[]) newByteArray(9);
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
        args[1] = term384340;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term419365));
        assertTrue(recursiveEquals(term384340, term419369));
    }

};


