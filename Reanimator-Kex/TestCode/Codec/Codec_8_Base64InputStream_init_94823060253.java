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

public class Base64InputStream_init_94823060253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664765;
     Object term678778;
     Object term678784;

    public Base64InputStream_init_94823060253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term664589 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term664709 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseProcessPipeInputStream"));
        setField(term664589, term664589.getClass(), "in", term664709);
        setField(term664589, term664589.getClass(), "singleByte", null);
        setBooleanField(term664589, term664589.getClass(), "doEncode", false);
        term664765 = newInstance(Class.forName("java.io.FilterInputStream"));
        term678778 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term678779 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term678780 = (byte[]) newByteArray(64);
        byte[] term678781 = (byte[]) newByteArray(2);
        byte[] term678782 = (byte[]) newByteArray(1);
        Object term678783 = newInstance(Class.forName("java.io.FilterInputStream"));
        setBooleanField(term678778, term678778.getClass(), "doEncode", false);
        setByteElement(term678780, 0, (byte) 65);
        setByteElement(term678780, 1, (byte) 66);
        setByteElement(term678780, 2, (byte) 67);
        setByteElement(term678780, 3, (byte) 68);
        setByteElement(term678780, 4, (byte) 69);
        setByteElement(term678780, 5, (byte) 70);
        setByteElement(term678780, 6, (byte) 71);
        setByteElement(term678780, 7, (byte) 72);
        setByteElement(term678780, 8, (byte) 73);
        setByteElement(term678780, 9, (byte) 74);
        setByteElement(term678780, 10, (byte) 75);
        setByteElement(term678780, 11, (byte) 76);
        setByteElement(term678780, 12, (byte) 77);
        setByteElement(term678780, 13, (byte) 78);
        setByteElement(term678780, 14, (byte) 79);
        setByteElement(term678780, 15, (byte) 80);
        setByteElement(term678780, 16, (byte) 81);
        setByteElement(term678780, 17, (byte) 82);
        setByteElement(term678780, 18, (byte) 83);
        setByteElement(term678780, 19, (byte) 84);
        setByteElement(term678780, 20, (byte) 85);
        setByteElement(term678780, 21, (byte) 86);
        setByteElement(term678780, 22, (byte) 87);
        setByteElement(term678780, 23, (byte) 88);
        setByteElement(term678780, 24, (byte) 89);
        setByteElement(term678780, 25, (byte) 90);
        setByteElement(term678780, 26, (byte) 97);
        setByteElement(term678780, 27, (byte) 98);
        setByteElement(term678780, 28, (byte) 99);
        setByteElement(term678780, 29, (byte) 100);
        setByteElement(term678780, 30, (byte) 101);
        setByteElement(term678780, 31, (byte) 102);
        setByteElement(term678780, 32, (byte) 103);
        setByteElement(term678780, 33, (byte) 104);
        setByteElement(term678780, 34, (byte) 105);
        setByteElement(term678780, 35, (byte) 106);
        setByteElement(term678780, 36, (byte) 107);
        setByteElement(term678780, 37, (byte) 108);
        setByteElement(term678780, 38, (byte) 109);
        setByteElement(term678780, 39, (byte) 110);
        setByteElement(term678780, 40, (byte) 111);
        setByteElement(term678780, 41, (byte) 112);
        setByteElement(term678780, 42, (byte) 113);
        setByteElement(term678780, 43, (byte) 114);
        setByteElement(term678780, 44, (byte) 115);
        setByteElement(term678780, 45, (byte) 116);
        setByteElement(term678780, 46, (byte) 117);
        setByteElement(term678780, 47, (byte) 118);
        setByteElement(term678780, 48, (byte) 119);
        setByteElement(term678780, 49, (byte) 120);
        setByteElement(term678780, 50, (byte) 121);
        setByteElement(term678780, 51, (byte) 122);
        setByteElement(term678780, 52, (byte) 48);
        setByteElement(term678780, 53, (byte) 49);
        setByteElement(term678780, 54, (byte) 50);
        setByteElement(term678780, 55, (byte) 51);
        setByteElement(term678780, 56, (byte) 52);
        setByteElement(term678780, 57, (byte) 53);
        setByteElement(term678780, 58, (byte) 54);
        setByteElement(term678780, 59, (byte) 55);
        setByteElement(term678780, 60, (byte) 56);
        setByteElement(term678780, 61, (byte) 57);
        setByteElement(term678780, 62, (byte) 43);
        setByteElement(term678780, 63, (byte) 47);
        setField(term678779, term678779.getClass(), "encodeTable", term678780);
        setIntField(term678779, term678779.getClass(), "lineLength", 76);
        setByteElement(term678781, 0, (byte) 13);
        setByteElement(term678781, 1, (byte) 10);
        setField(term678779, term678779.getClass(), "lineSeparator", term678781);
        setIntField(term678779, term678779.getClass(), "decodeSize", 5);
        setIntField(term678779, term678779.getClass(), "encodeSize", 6);
        setField(term678779, term678779.getClass(), "buffer", null);
        setIntField(term678779, term678779.getClass(), "pos", 0);
        setIntField(term678779, term678779.getClass(), "readPos", 0);
        setIntField(term678779, term678779.getClass(), "currentLinePos", 0);
        setIntField(term678779, term678779.getClass(), "modulus", 0);
        setBooleanField(term678779, term678779.getClass(), "eof", false);
        setIntField(term678779, term678779.getClass(), "x", 0);
        setField(term678778, term678778.getClass(), "base64", term678779);
        setField(term678778, term678778.getClass(), "singleByte", term678782);
        setField(term678783, term678783.getClass(), "in", null);
        setField(term678778, term678778.getClass(), "in", term678783);
        term678784 = newInstance(Class.forName("java.io.FilterInputStream"));
        setField(term678784, term678784.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term664765;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term678778));
        assertTrue(recursiveEquals(term664765, term678784));
    }

};


