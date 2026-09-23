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

public class Base64InputStream_init_79931988049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243293;
     Object term35986;
     Object term663769;
     Object term663775;
     Object term663776;

    public Base64InputStream_init_79931988049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term243127 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term243195 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setField(term243127, term243127.getClass(), "in", term243195);
        setField(term243127, term243127.getClass(), "singleByte", null);
        setBooleanField(term243127, term243127.getClass(), "doEncode", false);
        term243293 = newInstance(Class.forName("java.io.ObjectInputStream$BlockDataInputStream"));
        term35986 = (byte[]) newByteArray(207);
        term663769 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term663770 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term663771 = (byte[]) newByteArray(64);
        byte[] term663772 = (byte[]) newByteArray(207);
        byte[] term663773 = (byte[]) newByteArray(1);
        Object term663774 = newInstance(Class.forName("java.io.ObjectInputStream$BlockDataInputStream"));
        setBooleanField(term663769, term663769.getClass(), "doEncode", true);
        setByteElement(term663771, 0, (byte) 65);
        setByteElement(term663771, 1, (byte) 66);
        setByteElement(term663771, 2, (byte) 67);
        setByteElement(term663771, 3, (byte) 68);
        setByteElement(term663771, 4, (byte) 69);
        setByteElement(term663771, 5, (byte) 70);
        setByteElement(term663771, 6, (byte) 71);
        setByteElement(term663771, 7, (byte) 72);
        setByteElement(term663771, 8, (byte) 73);
        setByteElement(term663771, 9, (byte) 74);
        setByteElement(term663771, 10, (byte) 75);
        setByteElement(term663771, 11, (byte) 76);
        setByteElement(term663771, 12, (byte) 77);
        setByteElement(term663771, 13, (byte) 78);
        setByteElement(term663771, 14, (byte) 79);
        setByteElement(term663771, 15, (byte) 80);
        setByteElement(term663771, 16, (byte) 81);
        setByteElement(term663771, 17, (byte) 82);
        setByteElement(term663771, 18, (byte) 83);
        setByteElement(term663771, 19, (byte) 84);
        setByteElement(term663771, 20, (byte) 85);
        setByteElement(term663771, 21, (byte) 86);
        setByteElement(term663771, 22, (byte) 87);
        setByteElement(term663771, 23, (byte) 88);
        setByteElement(term663771, 24, (byte) 89);
        setByteElement(term663771, 25, (byte) 90);
        setByteElement(term663771, 26, (byte) 97);
        setByteElement(term663771, 27, (byte) 98);
        setByteElement(term663771, 28, (byte) 99);
        setByteElement(term663771, 29, (byte) 100);
        setByteElement(term663771, 30, (byte) 101);
        setByteElement(term663771, 31, (byte) 102);
        setByteElement(term663771, 32, (byte) 103);
        setByteElement(term663771, 33, (byte) 104);
        setByteElement(term663771, 34, (byte) 105);
        setByteElement(term663771, 35, (byte) 106);
        setByteElement(term663771, 36, (byte) 107);
        setByteElement(term663771, 37, (byte) 108);
        setByteElement(term663771, 38, (byte) 109);
        setByteElement(term663771, 39, (byte) 110);
        setByteElement(term663771, 40, (byte) 111);
        setByteElement(term663771, 41, (byte) 112);
        setByteElement(term663771, 42, (byte) 113);
        setByteElement(term663771, 43, (byte) 114);
        setByteElement(term663771, 44, (byte) 115);
        setByteElement(term663771, 45, (byte) 116);
        setByteElement(term663771, 46, (byte) 117);
        setByteElement(term663771, 47, (byte) 118);
        setByteElement(term663771, 48, (byte) 119);
        setByteElement(term663771, 49, (byte) 120);
        setByteElement(term663771, 50, (byte) 121);
        setByteElement(term663771, 51, (byte) 122);
        setByteElement(term663771, 52, (byte) 48);
        setByteElement(term663771, 53, (byte) 49);
        setByteElement(term663771, 54, (byte) 50);
        setByteElement(term663771, 55, (byte) 51);
        setByteElement(term663771, 56, (byte) 52);
        setByteElement(term663771, 57, (byte) 53);
        setByteElement(term663771, 58, (byte) 54);
        setByteElement(term663771, 59, (byte) 55);
        setByteElement(term663771, 60, (byte) 56);
        setByteElement(term663771, 61, (byte) 57);
        setByteElement(term663771, 62, (byte) 43);
        setByteElement(term663771, 63, (byte) 47);
        setField(term663770, term663770.getClass(), "encodeTable", term663771);
        setIntField(term663770, term663770.getClass(), "lineLength", 0);
        setField(term663770, term663770.getClass(), "lineSeparator", term663772);
        setIntField(term663770, term663770.getClass(), "decodeSize", 3);
        setIntField(term663770, term663770.getClass(), "encodeSize", 4);
        setField(term663770, term663770.getClass(), "buffer", null);
        setIntField(term663770, term663770.getClass(), "pos", 0);
        setIntField(term663770, term663770.getClass(), "readPos", 0);
        setIntField(term663770, term663770.getClass(), "currentLinePos", 0);
        setIntField(term663770, term663770.getClass(), "modulus", 0);
        setBooleanField(term663770, term663770.getClass(), "eof", false);
        setIntField(term663770, term663770.getClass(), "x", 0);
        setField(term663769, term663769.getClass(), "base64", term663770);
        setField(term663769, term663769.getClass(), "singleByte", term663773);
        setField(term663774, term663774.getClass(), "buf", null);
        setField(term663774, term663774.getClass(), "hbuf", null);
        setField(term663774, term663774.getClass(), "cbuf", null);
        setBooleanField(term663774, term663774.getClass(), "blkmode", false);
        setIntField(term663774, term663774.getClass(), "pos", 0);
        setIntField(term663774, term663774.getClass(), "end", 0);
        setIntField(term663774, term663774.getClass(), "unread", 0);
        setField(term663774, term663774.getClass(), "in", null);
        setField(term663774, term663774.getClass(), "din", null);
        setField(term663774, term663774.getClass(), "this$0", null);
        setField(term663769, term663769.getClass(), "in", term663774);
        term663775 = (byte[]) newByteArray(207);
        term663776 = newInstance(Class.forName("java.io.ObjectInputStream$BlockDataInputStream"));
        setField(term663776, term663776.getClass(), "buf", null);
        setField(term663776, term663776.getClass(), "hbuf", null);
        setField(term663776, term663776.getClass(), "cbuf", null);
        setBooleanField(term663776, term663776.getClass(), "blkmode", false);
        setIntField(term663776, term663776.getClass(), "pos", 0);
        setIntField(term663776, term663776.getClass(), "end", 0);
        setIntField(term663776, term663776.getClass(), "unread", 0);
        setField(term663776, term663776.getClass(), "in", null);
        setField(term663776, term663776.getClass(), "din", null);
        setField(term663776, term663776.getClass(), "this$0", null);
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
        args[0] = term243293;
        args[1] = true;
        args[2] = 0;
        args[3] = term35986;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term663769));
        assertTrue(recursiveEquals(term243293, 0));
        assertTrue(recursiveEquals(term35986, true));
    }

};


