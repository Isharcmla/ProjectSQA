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

public class Base64InputStream_init_79931988071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310787;
     Object term1063523;
     Object term1317696;
     Object term1317702;
     Object term1317703;

    public Base64InputStream_init_79931988071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1310663 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1310719 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term1310663, term1310663.getClass(), "in", term1310719);
        setField(term1310663, term1310663.getClass(), "singleByte", null);
        setBooleanField(term1310663, term1310663.getClass(), "doEncode", false);
        term1310787 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        term1063523 = (byte[]) newByteArray(247);
        term1317696 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1317697 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1317698 = (byte[]) newByteArray(64);
        byte[] term1317699 = (byte[]) newByteArray(247);
        byte[] term1317700 = (byte[]) newByteArray(1);
        Object term1317701 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setBooleanField(term1317696, term1317696.getClass(), "doEncode", true);
        setByteElement(term1317698, 0, (byte) 65);
        setByteElement(term1317698, 1, (byte) 66);
        setByteElement(term1317698, 2, (byte) 67);
        setByteElement(term1317698, 3, (byte) 68);
        setByteElement(term1317698, 4, (byte) 69);
        setByteElement(term1317698, 5, (byte) 70);
        setByteElement(term1317698, 6, (byte) 71);
        setByteElement(term1317698, 7, (byte) 72);
        setByteElement(term1317698, 8, (byte) 73);
        setByteElement(term1317698, 9, (byte) 74);
        setByteElement(term1317698, 10, (byte) 75);
        setByteElement(term1317698, 11, (byte) 76);
        setByteElement(term1317698, 12, (byte) 77);
        setByteElement(term1317698, 13, (byte) 78);
        setByteElement(term1317698, 14, (byte) 79);
        setByteElement(term1317698, 15, (byte) 80);
        setByteElement(term1317698, 16, (byte) 81);
        setByteElement(term1317698, 17, (byte) 82);
        setByteElement(term1317698, 18, (byte) 83);
        setByteElement(term1317698, 19, (byte) 84);
        setByteElement(term1317698, 20, (byte) 85);
        setByteElement(term1317698, 21, (byte) 86);
        setByteElement(term1317698, 22, (byte) 87);
        setByteElement(term1317698, 23, (byte) 88);
        setByteElement(term1317698, 24, (byte) 89);
        setByteElement(term1317698, 25, (byte) 90);
        setByteElement(term1317698, 26, (byte) 97);
        setByteElement(term1317698, 27, (byte) 98);
        setByteElement(term1317698, 28, (byte) 99);
        setByteElement(term1317698, 29, (byte) 100);
        setByteElement(term1317698, 30, (byte) 101);
        setByteElement(term1317698, 31, (byte) 102);
        setByteElement(term1317698, 32, (byte) 103);
        setByteElement(term1317698, 33, (byte) 104);
        setByteElement(term1317698, 34, (byte) 105);
        setByteElement(term1317698, 35, (byte) 106);
        setByteElement(term1317698, 36, (byte) 107);
        setByteElement(term1317698, 37, (byte) 108);
        setByteElement(term1317698, 38, (byte) 109);
        setByteElement(term1317698, 39, (byte) 110);
        setByteElement(term1317698, 40, (byte) 111);
        setByteElement(term1317698, 41, (byte) 112);
        setByteElement(term1317698, 42, (byte) 113);
        setByteElement(term1317698, 43, (byte) 114);
        setByteElement(term1317698, 44, (byte) 115);
        setByteElement(term1317698, 45, (byte) 116);
        setByteElement(term1317698, 46, (byte) 117);
        setByteElement(term1317698, 47, (byte) 118);
        setByteElement(term1317698, 48, (byte) 119);
        setByteElement(term1317698, 49, (byte) 120);
        setByteElement(term1317698, 50, (byte) 121);
        setByteElement(term1317698, 51, (byte) 122);
        setByteElement(term1317698, 52, (byte) 48);
        setByteElement(term1317698, 53, (byte) 49);
        setByteElement(term1317698, 54, (byte) 50);
        setByteElement(term1317698, 55, (byte) 51);
        setByteElement(term1317698, 56, (byte) 52);
        setByteElement(term1317698, 57, (byte) 53);
        setByteElement(term1317698, 58, (byte) 54);
        setByteElement(term1317698, 59, (byte) 55);
        setByteElement(term1317698, 60, (byte) 56);
        setByteElement(term1317698, 61, (byte) 57);
        setByteElement(term1317698, 62, (byte) 43);
        setByteElement(term1317698, 63, (byte) 47);
        setField(term1317697, term1317697.getClass(), "encodeTable", term1317698);
        setIntField(term1317697, term1317697.getClass(), "lineLength", 0);
        setField(term1317697, term1317697.getClass(), "lineSeparator", term1317699);
        setIntField(term1317697, term1317697.getClass(), "decodeSize", 3);
        setIntField(term1317697, term1317697.getClass(), "encodeSize", 4);
        setField(term1317697, term1317697.getClass(), "buffer", null);
        setIntField(term1317697, term1317697.getClass(), "pos", 0);
        setIntField(term1317697, term1317697.getClass(), "readPos", 0);
        setIntField(term1317697, term1317697.getClass(), "currentLinePos", 0);
        setIntField(term1317697, term1317697.getClass(), "modulus", 0);
        setBooleanField(term1317697, term1317697.getClass(), "eof", false);
        setIntField(term1317697, term1317697.getClass(), "x", 0);
        setField(term1317696, term1317696.getClass(), "base64", term1317697);
        setField(term1317696, term1317696.getClass(), "singleByte", term1317700);
        setField(term1317701, term1317701.getClass(), "this$0", null);
        setField(term1317701, term1317701.getClass(), "in", null);
        setField(term1317696, term1317696.getClass(), "in", term1317701);
        term1317702 = (byte[]) newByteArray(247);
        term1317703 = newInstance(Class.forName("java.util.zip.GZIPInputStream$1"));
        setField(term1317703, term1317703.getClass(), "this$0", null);
        setField(term1317703, term1317703.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1310787;
        args[1] = true;
        args[2] = 0;
        args[3] = term1063523;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1317696));
        assertTrue(recursiveEquals(term1310787, 0));
        assertTrue(recursiveEquals(term1063523, true));
    }

};


