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

public class BeanSerializerBase_rename_132589926032 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3226;
     Object term3353;
     Object term3583;
     Object term3584;
     Object term3580;

    public BeanSerializerBase_rename_132589926032() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3226 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 105);
        term3353 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        term3583 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 105);
        term3584 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$4"));
        setField(term3584, term3584.getClass(), "val$suffix", null);
        term3580 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term3226;
        args[1] = term3353;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term3226, term3583));
        assertTrue(recursiveEquals(term3353, term3584));
        assertTrue(recursiveEquals(retValue, term3580));
    }

};


