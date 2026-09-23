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

public class Base32_init_1042801703305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term569260;
     Object term573129;
     Object term573132;

    public Base32_init_1042801703305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term571951 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        term569260 = (byte[]) newByteArray(512);
        byte[] term570805 = (byte[]) newByteArray(0);
        setByteField(term571951, term571951.getClass(), "PAD", (byte) 0);
        setIntField(term571951, term571951.getClass(), "unencodedBlockSize", 0);
        setIntField(term571951, term571951.getClass(), "encodedBlockSize", 0);
        setIntField(term571951, term571951.getClass(), "lineLength", 0);
        setIntField(term571951, term571951.getClass(), "chunkSeparatorLength", 0);
        setByteField(term571951, term571951.getClass(), "pad", (byte) 0);
        setField(term571951, term571951.getClass(), "encodeTable", term569260);
        setField(term571951, term571951.getClass(), "decodeTable", term570805);
        setIntField(term571951, term571951.getClass(), "encodeSize", 0);
        setField(term571951, term571951.getClass(), "lineSeparator", term569260);
        setIntField(term571951, term571951.getClass(), "decodeSize", 0);
        term573129 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term573130 = (byte[]) newByteArray(91);
        byte[] term573131 = (byte[]) newByteArray(32);
        setIntField(term573129, term573129.getClass(), "decodeSize", 7);
        setByteElement(term573130, 0, (byte) -1);
        setByteElement(term573130, 1, (byte) -1);
        setByteElement(term573130, 2, (byte) -1);
        setByteElement(term573130, 3, (byte) -1);
        setByteElement(term573130, 4, (byte) -1);
        setByteElement(term573130, 5, (byte) -1);
        setByteElement(term573130, 6, (byte) -1);
        setByteElement(term573130, 7, (byte) -1);
        setByteElement(term573130, 8, (byte) -1);
        setByteElement(term573130, 9, (byte) -1);
        setByteElement(term573130, 10, (byte) -1);
        setByteElement(term573130, 11, (byte) -1);
        setByteElement(term573130, 12, (byte) -1);
        setByteElement(term573130, 13, (byte) -1);
        setByteElement(term573130, 14, (byte) -1);
        setByteElement(term573130, 15, (byte) -1);
        setByteElement(term573130, 16, (byte) -1);
        setByteElement(term573130, 17, (byte) -1);
        setByteElement(term573130, 18, (byte) -1);
        setByteElement(term573130, 19, (byte) -1);
        setByteElement(term573130, 20, (byte) -1);
        setByteElement(term573130, 21, (byte) -1);
        setByteElement(term573130, 22, (byte) -1);
        setByteElement(term573130, 23, (byte) -1);
        setByteElement(term573130, 24, (byte) -1);
        setByteElement(term573130, 25, (byte) -1);
        setByteElement(term573130, 26, (byte) -1);
        setByteElement(term573130, 27, (byte) -1);
        setByteElement(term573130, 28, (byte) -1);
        setByteElement(term573130, 29, (byte) -1);
        setByteElement(term573130, 30, (byte) -1);
        setByteElement(term573130, 31, (byte) -1);
        setByteElement(term573130, 32, (byte) -1);
        setByteElement(term573130, 33, (byte) -1);
        setByteElement(term573130, 34, (byte) -1);
        setByteElement(term573130, 35, (byte) -1);
        setByteElement(term573130, 36, (byte) -1);
        setByteElement(term573130, 37, (byte) -1);
        setByteElement(term573130, 38, (byte) -1);
        setByteElement(term573130, 39, (byte) -1);
        setByteElement(term573130, 40, (byte) -1);
        setByteElement(term573130, 41, (byte) -1);
        setByteElement(term573130, 42, (byte) -1);
        setByteElement(term573130, 43, (byte) -1);
        setByteElement(term573130, 44, (byte) -1);
        setByteElement(term573130, 45, (byte) -1);
        setByteElement(term573130, 46, (byte) -1);
        setByteElement(term573130, 47, (byte) -1);
        setByteElement(term573130, 48, (byte) -1);
        setByteElement(term573130, 49, (byte) -1);
        setByteElement(term573130, 50, (byte) 26);
        setByteElement(term573130, 51, (byte) 27);
        setByteElement(term573130, 52, (byte) 28);
        setByteElement(term573130, 53, (byte) 29);
        setByteElement(term573130, 54, (byte) 30);
        setByteElement(term573130, 55, (byte) 31);
        setByteElement(term573130, 56, (byte) -1);
        setByteElement(term573130, 57, (byte) -1);
        setByteElement(term573130, 58, (byte) -1);
        setByteElement(term573130, 59, (byte) -1);
        setByteElement(term573130, 60, (byte) -1);
        setByteElement(term573130, 61, (byte) -1);
        setByteElement(term573130, 62, (byte) -1);
        setByteElement(term573130, 63, (byte) -1);
        setByteElement(term573130, 64, (byte) -1);
        setByteElement(term573130, 66, (byte) 1);
        setByteElement(term573130, 67, (byte) 2);
        setByteElement(term573130, 68, (byte) 3);
        setByteElement(term573130, 69, (byte) 4);
        setByteElement(term573130, 70, (byte) 5);
        setByteElement(term573130, 71, (byte) 6);
        setByteElement(term573130, 72, (byte) 7);
        setByteElement(term573130, 73, (byte) 8);
        setByteElement(term573130, 74, (byte) 9);
        setByteElement(term573130, 75, (byte) 10);
        setByteElement(term573130, 76, (byte) 11);
        setByteElement(term573130, 77, (byte) 12);
        setByteElement(term573130, 78, (byte) 13);
        setByteElement(term573130, 79, (byte) 14);
        setByteElement(term573130, 80, (byte) 15);
        setByteElement(term573130, 81, (byte) 16);
        setByteElement(term573130, 82, (byte) 17);
        setByteElement(term573130, 83, (byte) 18);
        setByteElement(term573130, 84, (byte) 19);
        setByteElement(term573130, 85, (byte) 20);
        setByteElement(term573130, 86, (byte) 21);
        setByteElement(term573130, 87, (byte) 22);
        setByteElement(term573130, 88, (byte) 23);
        setByteElement(term573130, 89, (byte) 24);
        setByteElement(term573130, 90, (byte) 25);
        setField(term573129, term573129.getClass(), "decodeTable", term573130);
        setIntField(term573129, term573129.getClass(), "encodeSize", 8);
        setByteElement(term573131, 0, (byte) 65);
        setByteElement(term573131, 1, (byte) 66);
        setByteElement(term573131, 2, (byte) 67);
        setByteElement(term573131, 3, (byte) 68);
        setByteElement(term573131, 4, (byte) 69);
        setByteElement(term573131, 5, (byte) 70);
        setByteElement(term573131, 6, (byte) 71);
        setByteElement(term573131, 7, (byte) 72);
        setByteElement(term573131, 8, (byte) 73);
        setByteElement(term573131, 9, (byte) 74);
        setByteElement(term573131, 10, (byte) 75);
        setByteElement(term573131, 11, (byte) 76);
        setByteElement(term573131, 12, (byte) 77);
        setByteElement(term573131, 13, (byte) 78);
        setByteElement(term573131, 14, (byte) 79);
        setByteElement(term573131, 15, (byte) 80);
        setByteElement(term573131, 16, (byte) 81);
        setByteElement(term573131, 17, (byte) 82);
        setByteElement(term573131, 18, (byte) 83);
        setByteElement(term573131, 19, (byte) 84);
        setByteElement(term573131, 20, (byte) 85);
        setByteElement(term573131, 21, (byte) 86);
        setByteElement(term573131, 22, (byte) 87);
        setByteElement(term573131, 23, (byte) 88);
        setByteElement(term573131, 24, (byte) 89);
        setByteElement(term573131, 25, (byte) 90);
        setByteElement(term573131, 26, (byte) 50);
        setByteElement(term573131, 27, (byte) 51);
        setByteElement(term573131, 28, (byte) 52);
        setByteElement(term573131, 29, (byte) 53);
        setByteElement(term573131, 30, (byte) 54);
        setByteElement(term573131, 31, (byte) 55);
        setField(term573129, term573129.getClass(), "encodeTable", term573131);
        setField(term573129, term573129.getClass(), "lineSeparator", null);
        setByteField(term573129, term573129.getClass(), "PAD", (byte) 61);
        setByteField(term573129, term573129.getClass(), "pad", (byte) 61);
        setIntField(term573129, term573129.getClass(), "unencodedBlockSize", 5);
        setIntField(term573129, term573129.getClass(), "encodedBlockSize", 8);
        setIntField(term573129, term573129.getClass(), "lineLength", 0);
        setIntField(term573129, term573129.getClass(), "chunkSeparatorLength", 512);
        term573132 = (byte[]) newByteArray(512);
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
        args[1] = term569260;
        args[2] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term573129));
        assertTrue(recursiveEquals(term569260, term573132));
    }

};


