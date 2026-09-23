package com.fasterxml.jackson.databind.ser.std;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BeanSerializerBase_rename_132589926081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22029;
     Object term22555;

    public BeanSerializerBase_rename_132589926081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22029 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 510);
        Object term22417 = newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"));
        setElement(term22029, 50, term22417);
        term22555 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term22029;
        args[1] = term22555;
        try {
            callMethod(klass, "rename", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


