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
import static com.fasterxml.jackson.databind.ser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.ser.std.EqualityUtils.*;
import java.lang.Object;

public class BeanSerializerBase_rename_1325899260556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303439;
     Object term303678;
     Object term304429;
     Object term304430;
     Object term304426;

    public BeanSerializerBase_rename_1325899260556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303439 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 21);
        term303678 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        term304429 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 21);
        term304430 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        setField(term304430, term304430.getClass(), "val$suffix", null);
        term304426 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term303439;
        args[1] = term303678;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term303439, term304429));
        assertTrue(recursiveEquals(term303678, term304430));
        assertTrue(recursiveEquals(retValue, term304426));
    }

};


