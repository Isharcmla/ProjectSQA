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

public class Base64InputStream_init_79931988058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1489534;
     Object term1024154;
     Object term1560329;
     Object term1560335;
     Object term1560336;

    public Base64InputStream_init_79931988058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1489328 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1489448 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setField(term1489328, term1489328.getClass(), "in", term1489448);
        setField(term1489328, term1489328.getClass(), "singleByte", null);
        setBooleanField(term1489328, term1489328.getClass(), "doEncode", false);
        term1489534 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        term1024154 = (byte[]) newByteArray(467);
        setByteElement(term1024154, 0, (byte) -128);
        setByteElement(term1024154, 4, (byte) -128);
        term1560329 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1560330 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term1560331 = (byte[]) newByteArray(64);
        byte[] term1560332 = (byte[]) newByteArray(467);
        byte[] term1560333 = (byte[]) newByteArray(1);
        Object term1560334 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        setBooleanField(term1560329, term1560329.getClass(), "doEncode", true);
        setByteElement(term1560331, 0, (byte) 65);
        setByteElement(term1560331, 1, (byte) 66);
        setByteElement(term1560331, 2, (byte) 67);
        setByteElement(term1560331, 3, (byte) 68);
        setByteElement(term1560331, 4, (byte) 69);
        setByteElement(term1560331, 5, (byte) 70);
        setByteElement(term1560331, 6, (byte) 71);
        setByteElement(term1560331, 7, (byte) 72);
        setByteElement(term1560331, 8, (byte) 73);
        setByteElement(term1560331, 9, (byte) 74);
        setByteElement(term1560331, 10, (byte) 75);
        setByteElement(term1560331, 11, (byte) 76);
        setByteElement(term1560331, 12, (byte) 77);
        setByteElement(term1560331, 13, (byte) 78);
        setByteElement(term1560331, 14, (byte) 79);
        setByteElement(term1560331, 15, (byte) 80);
        setByteElement(term1560331, 16, (byte) 81);
        setByteElement(term1560331, 17, (byte) 82);
        setByteElement(term1560331, 18, (byte) 83);
        setByteElement(term1560331, 19, (byte) 84);
        setByteElement(term1560331, 20, (byte) 85);
        setByteElement(term1560331, 21, (byte) 86);
        setByteElement(term1560331, 22, (byte) 87);
        setByteElement(term1560331, 23, (byte) 88);
        setByteElement(term1560331, 24, (byte) 89);
        setByteElement(term1560331, 25, (byte) 90);
        setByteElement(term1560331, 26, (byte) 97);
        setByteElement(term1560331, 27, (byte) 98);
        setByteElement(term1560331, 28, (byte) 99);
        setByteElement(term1560331, 29, (byte) 100);
        setByteElement(term1560331, 30, (byte) 101);
        setByteElement(term1560331, 31, (byte) 102);
        setByteElement(term1560331, 32, (byte) 103);
        setByteElement(term1560331, 33, (byte) 104);
        setByteElement(term1560331, 34, (byte) 105);
        setByteElement(term1560331, 35, (byte) 106);
        setByteElement(term1560331, 36, (byte) 107);
        setByteElement(term1560331, 37, (byte) 108);
        setByteElement(term1560331, 38, (byte) 109);
        setByteElement(term1560331, 39, (byte) 110);
        setByteElement(term1560331, 40, (byte) 111);
        setByteElement(term1560331, 41, (byte) 112);
        setByteElement(term1560331, 42, (byte) 113);
        setByteElement(term1560331, 43, (byte) 114);
        setByteElement(term1560331, 44, (byte) 115);
        setByteElement(term1560331, 45, (byte) 116);
        setByteElement(term1560331, 46, (byte) 117);
        setByteElement(term1560331, 47, (byte) 118);
        setByteElement(term1560331, 48, (byte) 119);
        setByteElement(term1560331, 49, (byte) 120);
        setByteElement(term1560331, 50, (byte) 121);
        setByteElement(term1560331, 51, (byte) 122);
        setByteElement(term1560331, 52, (byte) 48);
        setByteElement(term1560331, 53, (byte) 49);
        setByteElement(term1560331, 54, (byte) 50);
        setByteElement(term1560331, 55, (byte) 51);
        setByteElement(term1560331, 56, (byte) 52);
        setByteElement(term1560331, 57, (byte) 53);
        setByteElement(term1560331, 58, (byte) 54);
        setByteElement(term1560331, 59, (byte) 55);
        setByteElement(term1560331, 60, (byte) 56);
        setByteElement(term1560331, 61, (byte) 57);
        setByteElement(term1560331, 62, (byte) 43);
        setByteElement(term1560331, 63, (byte) 47);
        setField(term1560330, term1560330.getClass(), "encodeTable", term1560331);
        setIntField(term1560330, term1560330.getClass(), "lineLength", 0);
        setByteElement(term1560332, 0, (byte) -128);
        setByteElement(term1560332, 4, (byte) -128);
        setField(term1560330, term1560330.getClass(), "lineSeparator", term1560332);
        setIntField(term1560330, term1560330.getClass(), "decodeSize", 470);
        setIntField(term1560330, term1560330.getClass(), "encodeSize", 471);
        setField(term1560330, term1560330.getClass(), "buffer", null);
        setIntField(term1560330, term1560330.getClass(), "pos", 0);
        setIntField(term1560330, term1560330.getClass(), "readPos", 0);
        setIntField(term1560330, term1560330.getClass(), "currentLinePos", 0);
        setIntField(term1560330, term1560330.getClass(), "modulus", 0);
        setBooleanField(term1560330, term1560330.getClass(), "eof", false);
        setIntField(term1560330, term1560330.getClass(), "x", 0);
        setField(term1560329, term1560329.getClass(), "base64", term1560330);
        setField(term1560329, term1560329.getClass(), "singleByte", term1560333);
        setField(term1560334, term1560334.getClass(), "is", null);
        setField(term1560334, term1560334.getClass(), "jv", null);
        setField(term1560334, term1560334.getClass(), "mev", null);
        setLongField(term1560334, term1560334.getClass(), "numLeft", 0L);
        setField(term1560329, term1560329.getClass(), "in", term1560334);
        term1560335 = (byte[]) newByteArray(467);
        setByteElement(term1560335, 0, (byte) -128);
        setByteElement(term1560335, 4, (byte) -128);
        term1560336 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        setField(term1560336, term1560336.getClass(), "is", null);
        setField(term1560336, term1560336.getClass(), "jv", null);
        setField(term1560336, term1560336.getClass(), "mev", null);
        setLongField(term1560336, term1560336.getClass(), "numLeft", 0L);
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
        args[0] = term1489534;
        args[1] = true;
        args[2] = 1;
        args[3] = term1024154;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1560329));
        assertTrue(recursiveEquals(term1489534, 1));
        assertTrue(recursiveEquals(term1024154, true));
    }

};


