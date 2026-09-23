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

public class BeanSerializerBase_rename_1325899260451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234706;
     Object term235484;
     Object term236057;
     Object term236058;
     Object term236054;

    public BeanSerializerBase_rename_1325899260451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234706 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 129);
        term235484 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term236057 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 129);
        term236058 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term236054 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term234706;
        args[1] = term235484;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term234706, term236057));
        assertTrue(recursiveEquals(term235484, term236058));
        assertTrue(recursiveEquals(retValue, term236054));
    }

};


