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
import java.lang.IllegalArgumentException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Base64InputStream_init_79931988042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24588;
     Object term21996;

    public Base64InputStream_init_79931988042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24446 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term24516 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        setField(term24446, term24446.getClass(), "in", term24516);
        setField(term24446, term24446.getClass(), "singleByte", null);
        setBooleanField(term24446, term24446.getClass(), "doEncode", false);
        term24588 = newInstance(Class.forName("java.util.zip.DeflaterInputStream"));
        term21996 = (byte[]) newByteArray(495);
        setByteElement(term21996, 0, (byte) -128);
        setByteElement(term21996, 4, (byte) 112);
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
        args[0] = term24588;
        args[1] = true;
        args[2] = 1;
        args[3] = term21996;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


