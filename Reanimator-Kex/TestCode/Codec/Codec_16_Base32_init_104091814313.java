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
import java.lang.Boolean;

public class Base32_init_104091814313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term1614;

    public Base32_init_104091814313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Boolean(false);
        term1614 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term1615 = (byte[]) newByteArray(91);
        byte[] term1616 = (byte[]) newByteArray(32);
        setIntField(term1614, term1614.getClass(), "decodeSize", 7);
        setByteElement(term1615, 0, (byte) -1);
        setByteElement(term1615, 1, (byte) -1);
        setByteElement(term1615, 2, (byte) -1);
        setByteElement(term1615, 3, (byte) -1);
        setByteElement(term1615, 4, (byte) -1);
        setByteElement(term1615, 5, (byte) -1);
        setByteElement(term1615, 6, (byte) -1);
        setByteElement(term1615, 7, (byte) -1);
        setByteElement(term1615, 8, (byte) -1);
        setByteElement(term1615, 9, (byte) -1);
        setByteElement(term1615, 10, (byte) -1);
        setByteElement(term1615, 11, (byte) -1);
        setByteElement(term1615, 12, (byte) -1);
        setByteElement(term1615, 13, (byte) -1);
        setByteElement(term1615, 14, (byte) -1);
        setByteElement(term1615, 15, (byte) -1);
        setByteElement(term1615, 16, (byte) -1);
        setByteElement(term1615, 17, (byte) -1);
        setByteElement(term1615, 18, (byte) -1);
        setByteElement(term1615, 19, (byte) -1);
        setByteElement(term1615, 20, (byte) -1);
        setByteElement(term1615, 21, (byte) -1);
        setByteElement(term1615, 22, (byte) -1);
        setByteElement(term1615, 23, (byte) -1);
        setByteElement(term1615, 24, (byte) -1);
        setByteElement(term1615, 25, (byte) -1);
        setByteElement(term1615, 26, (byte) -1);
        setByteElement(term1615, 27, (byte) -1);
        setByteElement(term1615, 28, (byte) -1);
        setByteElement(term1615, 29, (byte) -1);
        setByteElement(term1615, 30, (byte) -1);
        setByteElement(term1615, 31, (byte) -1);
        setByteElement(term1615, 32, (byte) -1);
        setByteElement(term1615, 33, (byte) -1);
        setByteElement(term1615, 34, (byte) -1);
        setByteElement(term1615, 35, (byte) -1);
        setByteElement(term1615, 36, (byte) -1);
        setByteElement(term1615, 37, (byte) -1);
        setByteElement(term1615, 38, (byte) -1);
        setByteElement(term1615, 39, (byte) -1);
        setByteElement(term1615, 40, (byte) -1);
        setByteElement(term1615, 41, (byte) -1);
        setByteElement(term1615, 42, (byte) -1);
        setByteElement(term1615, 43, (byte) -1);
        setByteElement(term1615, 44, (byte) -1);
        setByteElement(term1615, 45, (byte) -1);
        setByteElement(term1615, 46, (byte) -1);
        setByteElement(term1615, 47, (byte) -1);
        setByteElement(term1615, 48, (byte) -1);
        setByteElement(term1615, 49, (byte) -1);
        setByteElement(term1615, 50, (byte) 26);
        setByteElement(term1615, 51, (byte) 27);
        setByteElement(term1615, 52, (byte) 28);
        setByteElement(term1615, 53, (byte) 29);
        setByteElement(term1615, 54, (byte) 30);
        setByteElement(term1615, 55, (byte) 31);
        setByteElement(term1615, 56, (byte) -1);
        setByteElement(term1615, 57, (byte) -1);
        setByteElement(term1615, 58, (byte) -1);
        setByteElement(term1615, 59, (byte) -1);
        setByteElement(term1615, 60, (byte) -1);
        setByteElement(term1615, 61, (byte) -1);
        setByteElement(term1615, 62, (byte) -1);
        setByteElement(term1615, 63, (byte) -1);
        setByteElement(term1615, 64, (byte) -1);
        setByteElement(term1615, 66, (byte) 1);
        setByteElement(term1615, 67, (byte) 2);
        setByteElement(term1615, 68, (byte) 3);
        setByteElement(term1615, 69, (byte) 4);
        setByteElement(term1615, 70, (byte) 5);
        setByteElement(term1615, 71, (byte) 6);
        setByteElement(term1615, 72, (byte) 7);
        setByteElement(term1615, 73, (byte) 8);
        setByteElement(term1615, 74, (byte) 9);
        setByteElement(term1615, 75, (byte) 10);
        setByteElement(term1615, 76, (byte) 11);
        setByteElement(term1615, 77, (byte) 12);
        setByteElement(term1615, 78, (byte) 13);
        setByteElement(term1615, 79, (byte) 14);
        setByteElement(term1615, 80, (byte) 15);
        setByteElement(term1615, 81, (byte) 16);
        setByteElement(term1615, 82, (byte) 17);
        setByteElement(term1615, 83, (byte) 18);
        setByteElement(term1615, 84, (byte) 19);
        setByteElement(term1615, 85, (byte) 20);
        setByteElement(term1615, 86, (byte) 21);
        setByteElement(term1615, 87, (byte) 22);
        setByteElement(term1615, 88, (byte) 23);
        setByteElement(term1615, 89, (byte) 24);
        setByteElement(term1615, 90, (byte) 25);
        setField(term1614, term1614.getClass(), "decodeTable", term1615);
        setIntField(term1614, term1614.getClass(), "encodeSize", 8);
        setByteElement(term1616, 0, (byte) 65);
        setByteElement(term1616, 1, (byte) 66);
        setByteElement(term1616, 2, (byte) 67);
        setByteElement(term1616, 3, (byte) 68);
        setByteElement(term1616, 4, (byte) 69);
        setByteElement(term1616, 5, (byte) 70);
        setByteElement(term1616, 6, (byte) 71);
        setByteElement(term1616, 7, (byte) 72);
        setByteElement(term1616, 8, (byte) 73);
        setByteElement(term1616, 9, (byte) 74);
        setByteElement(term1616, 10, (byte) 75);
        setByteElement(term1616, 11, (byte) 76);
        setByteElement(term1616, 12, (byte) 77);
        setByteElement(term1616, 13, (byte) 78);
        setByteElement(term1616, 14, (byte) 79);
        setByteElement(term1616, 15, (byte) 80);
        setByteElement(term1616, 16, (byte) 81);
        setByteElement(term1616, 17, (byte) 82);
        setByteElement(term1616, 18, (byte) 83);
        setByteElement(term1616, 19, (byte) 84);
        setByteElement(term1616, 20, (byte) 85);
        setByteElement(term1616, 21, (byte) 86);
        setByteElement(term1616, 22, (byte) 87);
        setByteElement(term1616, 23, (byte) 88);
        setByteElement(term1616, 24, (byte) 89);
        setByteElement(term1616, 25, (byte) 90);
        setByteElement(term1616, 26, (byte) 50);
        setByteElement(term1616, 27, (byte) 51);
        setByteElement(term1616, 28, (byte) 52);
        setByteElement(term1616, 29, (byte) 53);
        setByteElement(term1616, 30, (byte) 54);
        setByteElement(term1616, 31, (byte) 55);
        setField(term1614, term1614.getClass(), "encodeTable", term1616);
        setField(term1614, term1614.getClass(), "lineSeparator", null);
        setByteField(term1614, term1614.getClass(), "PAD", (byte) 61);
        setByteField(term1614, term1614.getClass(), "pad", (byte) 61);
        setIntField(term1614, term1614.getClass(), "unencodedBlockSize", 5);
        setIntField(term1614, term1614.getClass(), "encodedBlockSize", 8);
        setIntField(term1614, term1614.getClass(), "lineLength", 0);
        setIntField(term1614, term1614.getClass(), "chunkSeparatorLength", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term3;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1614));
        assertTrue(recursiveEquals(term3, false));
    }

};


