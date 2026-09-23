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

public class BeanSerializerBase_rename_1325899260255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99943;
     Object term100302;
     Object term100401;
     Object term100402;
     Object term100398;

    public BeanSerializerBase_rename_1325899260255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99943 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 45);
        term100302 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term100401 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 45);
        term100402 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term100402, term100402.getClass(), "val$suffix", null);
        term100398 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 45);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term99943;
        args[1] = term100302;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term99943, term100401));
        assertTrue(recursiveEquals(term100302, term100402));
        assertTrue(recursiveEquals(retValue, term100398));
    }

};


