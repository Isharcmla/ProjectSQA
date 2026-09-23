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

public class BeanSerializerBase_rename_1325899260454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236059;
     Object term236913;
     Object term238149;
     Object term238150;
     Object term238146;

    public BeanSerializerBase_rename_1325899260454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236059 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 144);
        term236913 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        term238149 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 144);
        term238150 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        setField(term238150, term238150.getClass(), "val$suffix", null);
        term238146 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term236059;
        args[1] = term236913;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term236059, term238149));
        assertTrue(recursiveEquals(term236913, term238150));
        assertTrue(recursiveEquals(retValue, term238146));
    }

};


