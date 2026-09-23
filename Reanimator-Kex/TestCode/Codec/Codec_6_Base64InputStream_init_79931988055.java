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
import java.lang.Object;

public class Base64InputStream_init_79931988055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538639;
     Object term1490006;

    public Base64InputStream_init_79931988055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1538535 = newInstance(Class.forName("org.apache.commons.codec.binary.Base64InputStream"));
        Object term1538591 = newInstance(Class.forName("java.io.ObjectInputStream"));
        setField(term1538535, term1538535.getClass(), "in", term1538591);
        setField(term1538535, term1538535.getClass(), "singleByte", null);
        setBooleanField(term1538535, term1538535.getClass(), "doEncode", false);
        term1538639 = newInstance(Class.forName("java.io.InputStream$1"));
        term1490006 = (byte[]) newByteArray(511);
        setByteElement(term1490006, 0, (byte) -128);
        setByteElement(term1490006, 4, (byte) -128);
        setByteElement(term1490006, 206, (byte) 112);
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
        args[0] = term1538639;
        args[1] = true;
        args[2] = 1;
        args[3] = term1490006;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


