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

public class BeanSerializerBase_rename_1325899260275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105669;
     Object term105958;
     Object term106029;
     Object term106030;
     Object term106026;

    public BeanSerializerBase_rename_1325899260275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105669 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 31);
        term105958 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term106029 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 31);
        term106030 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term106030, term106030.getClass(), "val$prefix", null);
        term106026 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term105669;
        args[1] = term105958;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term105669, term106029));
        assertTrue(recursiveEquals(term105958, term106030));
        assertTrue(recursiveEquals(retValue, term106026));
    }

};


