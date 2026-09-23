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

public class Base64InputStream_read_30006789247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48979;
     Object term46845;
     Object term54382;
     Object term54384;

    public Base64InputStream_read_30006789247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48979 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term49061 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        byte[] term47849 = (byte[]) newByteArray(1000);
        setField(term49061, term49061.getClass(), "buffer", term47849);
        setField(term48979, term48979.getClass(), "base64", term49061);
        term46845 = (byte[]) newByteArray(1000);
        term54382 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term54383 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64"));
        setBooleanField(term54382, term54382.getClass(), "doEncode", false);
        setField(term54383, term54383.getClass(), "encodeTable", null);
        setIntField(term54383, term54383.getClass(), "lineLength", 0);
        setField(term54383, term54383.getClass(), "lineSeparator", null);
        setIntField(term54383, term54383.getClass(), "decodeSize", 0);
        setIntField(term54383, term54383.getClass(), "encodeSize", 0);
        setField(term54383, term54383.getClass(), "buffer", null);
        setIntField(term54383, term54383.getClass(), "pos", 0);
        setIntField(term54383, term54383.getClass(), "readPos", 0);
        setIntField(term54383, term54383.getClass(), "currentLinePos", 0);
        setIntField(term54383, term54383.getClass(), "modulus", 0);
        setBooleanField(term54383, term54383.getClass(), "eof", false);
        setIntField(term54383, term54383.getClass(), "x", 0);
        setField(term54382, term54382.getClass(), "base64", term54383);
        setField(term54382, term54382.getClass(), "singleByte", null);
        setField(term54382, term54382.getClass(), "in", null);
        term54384 = (byte[]) newByteArray(1000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base64InputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term46845;
        args[1] = 0;
        args[2] = 137;
        Object retValue = callMethod(klass, "read", argTypes, term48979, args);
        assertTrue(recursiveEquals(term48979, term54382));
        assertTrue(recursiveEquals(term46845, term54384));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


