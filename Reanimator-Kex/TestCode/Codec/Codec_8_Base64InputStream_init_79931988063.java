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

public class Base64InputStream_init_79931988063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751154;
     Object term748104;

    public Base64InputStream_init_79931988063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term751002 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term751056 = newInstance(Class.forName("java.io.PipedInputStream"));
        setField(term751002, term751002.getClass(), "in", term751056);
        setField(term751002, term751002.getClass(), "singleByte", null);
        setBooleanField(term751002, term751002.getClass(), "doEncode", false);
        term751154 = newInstance(Class.forName("java.lang.ProcessImpl$DeferredCloseInputStream"));
        term748104 = (byte[]) newByteArray(492);
        setByteElement(term748104, 0, (byte) -128);
        setByteElement(term748104, 6, (byte) 112);
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
        args[0] = term751154;
        args[1] = true;
        args[2] = 1;
        args[3] = term748104;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


