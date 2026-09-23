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
import java.lang.Integer;
import java.lang.Boolean;

public class Base32_init_104280170317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term26;
     Object term31;

    public Base32_init_104280170317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = new Integer(1484323161);
        term26 = (byte[]) newByteArray(4);
        setByteElement(term26, 0, (byte) -54);
        setByteElement(term26, 1, (byte) -10);
        setByteElement(term26, 2, (byte) 79);
        setByteElement(term26, 3, (byte) -119);
        term31 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.Base32");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term24;
        args[1] = term26;
        args[2] = term31;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


