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

public class Base32_init_1042801703221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430698;
     Object term431960;
     Object term431964;

    public Base32_init_1042801703221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term431769 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term431246 = (byte[]) newByteArray(0);
        byte[] term431537 = (byte[]) newByteArray(0);
        setByteField(term431769, term431769.getClass(), "PAD", (byte) 0);
        setIntField(term431769, term431769.getClass(), "unencodedBlockSize", 0);
        setIntField(term431769, term431769.getClass(), "encodedBlockSize", 0);
        setIntField(term431769, term431769.getClass(), "lineLength", 0);
        setIntField(term431769, term431769.getClass(), "chunkSeparatorLength", 0);
        setByteField(term431769, term431769.getClass(), "pad", (byte) -128);
        setField(term431769, term431769.getClass(), "encodeTable", null);
        setField(term431769, term431769.getClass(), "decodeTable", term431246);
        setIntField(term431769, term431769.getClass(), "encodeSize", 0);
        setField(term431769, term431769.getClass(), "lineSeparator", term431537);
        setIntField(term431769, term431769.getClass(), "decodeSize", 0);
        term430698 = (byte[]) newByteArray(3);
        term431960 = newInstance(Class.forName("org.apache.commons.codec.binary.Base32"));
        byte[] term431961 = (byte[]) newByteArray(88);
        byte[] term431962 = (byte[]) newByteArray(32);
        byte[] term431963 = (byte[]) newByteArray(3);
        setIntField(term431960, term431960.getClass(), "decodeSize", 10);
        setByteElement(term431961, 0, (byte) -1);
        setByteElement(term431961, 1, (byte) -1);
        setByteElement(term431961, 2, (byte) -1);
        setByteElement(term431961, 3, (byte) -1);
        setByteElement(term431961, 4, (byte) -1);
        setByteElement(term431961, 5, (byte) -1);
        setByteElement(term431961, 6, (byte) -1);
        setByteElement(term431961, 7, (byte) -1);
        setByteElement(term431961, 8, (byte) -1);
        setByteElement(term431961, 9, (byte) -1);
        setByteElement(term431961, 10, (byte) -1);
        setByteElement(term431961, 11, (byte) -1);
        setByteElement(term431961, 12, (byte) -1);
        setByteElement(term431961, 13, (byte) -1);
        setByteElement(term431961, 14, (byte) -1);
        setByteElement(term431961, 15, (byte) -1);
        setByteElement(term431961, 16, (byte) -1);
        setByteElement(term431961, 17, (byte) -1);
        setByteElement(term431961, 18, (byte) -1);
        setByteElement(term431961, 19, (byte) -1);
        setByteElement(term431961, 20, (byte) -1);
        setByteElement(term431961, 21, (byte) -1);
        setByteElement(term431961, 22, (byte) -1);
        setByteElement(term431961, 23, (byte) -1);
        setByteElement(term431961, 24, (byte) -1);
        setByteElement(term431961, 25, (byte) -1);
        setByteElement(term431961, 26, (byte) -1);
        setByteElement(term431961, 27, (byte) -1);
        setByteElement(term431961, 28, (byte) -1);
        setByteElement(term431961, 29, (byte) -1);
        setByteElement(term431961, 30, (byte) -1);
        setByteElement(term431961, 31, (byte) -1);
        setByteElement(term431961, 32, (byte) -1);
        setByteElement(term431961, 33, (byte) -1);
        setByteElement(term431961, 34, (byte) -1);
        setByteElement(term431961, 35, (byte) -1);
        setByteElement(term431961, 36, (byte) -1);
        setByteElement(term431961, 37, (byte) -1);
        setByteElement(term431961, 38, (byte) -1);
        setByteElement(term431961, 39, (byte) -1);
        setByteElement(term431961, 40, (byte) -1);
        setByteElement(term431961, 41, (byte) -1);
        setByteElement(term431961, 42, (byte) -1);
        setByteElement(term431961, 43, (byte) -1);
        setByteElement(term431961, 44, (byte) -1);
        setByteElement(term431961, 45, (byte) -1);
        setByteElement(term431961, 46, (byte) -1);
        setByteElement(term431961, 47, (byte) -1);
        setByteElement(term431961, 49, (byte) 1);
        setByteElement(term431961, 50, (byte) 2);
        setByteElement(term431961, 51, (byte) 3);
        setByteElement(term431961, 52, (byte) 4);
        setByteElement(term431961, 53, (byte) 5);
        setByteElement(term431961, 54, (byte) 6);
        setByteElement(term431961, 55, (byte) 7);
        setByteElement(term431961, 56, (byte) 8);
        setByteElement(term431961, 57, (byte) 9);
        setByteElement(term431961, 58, (byte) -1);
        setByteElement(term431961, 59, (byte) -1);
        setByteElement(term431961, 60, (byte) -1);
        setByteElement(term431961, 61, (byte) -1);
        setByteElement(term431961, 62, (byte) -1);
        setByteElement(term431961, 63, (byte) -1);
        setByteElement(term431961, 64, (byte) -1);
        setByteElement(term431961, 65, (byte) 10);
        setByteElement(term431961, 66, (byte) 11);
        setByteElement(term431961, 67, (byte) 12);
        setByteElement(term431961, 68, (byte) 13);
        setByteElement(term431961, 69, (byte) 14);
        setByteElement(term431961, 70, (byte) 15);
        setByteElement(term431961, 71, (byte) 16);
        setByteElement(term431961, 72, (byte) 17);
        setByteElement(term431961, 73, (byte) 18);
        setByteElement(term431961, 74, (byte) 19);
        setByteElement(term431961, 75, (byte) 20);
        setByteElement(term431961, 76, (byte) 21);
        setByteElement(term431961, 77, (byte) 22);
        setByteElement(term431961, 78, (byte) 23);
        setByteElement(term431961, 79, (byte) 24);
        setByteElement(term431961, 80, (byte) 25);
        setByteElement(term431961, 81, (byte) 26);
        setByteElement(term431961, 82, (byte) 27);
        setByteElement(term431961, 83, (byte) 28);
        setByteElement(term431961, 84, (byte) 29);
        setByteElement(term431961, 85, (byte) 30);
        setByteElement(term431961, 86, (byte) 31);
        setByteElement(term431961, 87, (byte) 32);
        setField(term431960, term431960.getClass(), "decodeTable", term431961);
        setIntField(term431960, term431960.getClass(), "encodeSize", 11);
        setByteElement(term431962, 0, (byte) 48);
        setByteElement(term431962, 1, (byte) 49);
        setByteElement(term431962, 2, (byte) 50);
        setByteElement(term431962, 3, (byte) 51);
        setByteElement(term431962, 4, (byte) 52);
        setByteElement(term431962, 5, (byte) 53);
        setByteElement(term431962, 6, (byte) 54);
        setByteElement(term431962, 7, (byte) 55);
        setByteElement(term431962, 8, (byte) 56);
        setByteElement(term431962, 9, (byte) 57);
        setByteElement(term431962, 10, (byte) 65);
        setByteElement(term431962, 11, (byte) 66);
        setByteElement(term431962, 12, (byte) 67);
        setByteElement(term431962, 13, (byte) 68);
        setByteElement(term431962, 14, (byte) 69);
        setByteElement(term431962, 15, (byte) 70);
        setByteElement(term431962, 16, (byte) 71);
        setByteElement(term431962, 17, (byte) 72);
        setByteElement(term431962, 18, (byte) 73);
        setByteElement(term431962, 19, (byte) 74);
        setByteElement(term431962, 20, (byte) 75);
        setByteElement(term431962, 21, (byte) 76);
        setByteElement(term431962, 22, (byte) 77);
        setByteElement(term431962, 23, (byte) 78);
        setByteElement(term431962, 24, (byte) 79);
        setByteElement(term431962, 25, (byte) 80);
        setByteElement(term431962, 26, (byte) 81);
        setByteElement(term431962, 27, (byte) 82);
        setByteElement(term431962, 28, (byte) 83);
        setByteElement(term431962, 29, (byte) 84);
        setByteElement(term431962, 30, (byte) 85);
        setByteElement(term431962, 31, (byte) 86);
        setField(term431960, term431960.getClass(), "encodeTable", term431962);
        setField(term431960, term431960.getClass(), "lineSeparator", term431963);
        setByteField(term431960, term431960.getClass(), "PAD", (byte) 61);
        setByteField(term431960, term431960.getClass(), "pad", (byte) 61);
        setIntField(term431960, term431960.getClass(), "unencodedBlockSize", 5);
        setIntField(term431960, term431960.getClass(), "encodedBlockSize", 8);
        setIntField(term431960, term431960.getClass(), "lineLength", 0);
        setIntField(term431960, term431960.getClass(), "chunkSeparatorLength", 3);
        term431964 = (byte[]) newByteArray(3);
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
        args[1] = term430698;
        args[2] = true;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term431960));
        assertTrue(recursiveEquals(term430698, term431964));
    }

};


