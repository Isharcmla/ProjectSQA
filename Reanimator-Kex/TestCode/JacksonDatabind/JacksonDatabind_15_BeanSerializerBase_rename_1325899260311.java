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

public class BeanSerializerBase_rename_1325899260311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132053;
     Object term133040;
     Object term133415;
     Object term133416;
     Object term133412;

    public BeanSerializerBase_rename_1325899260311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132053 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 183);
        term133040 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        term133415 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 183);
        term133416 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(term133416, term133416.getClass(), "_t1", null);
        setField(term133416, term133416.getClass(), "_t2", null);
        term133412 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term132053;
        args[1] = term133040;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term132053, term133415));
        assertTrue(recursiveEquals(term133040, term133416));
        assertTrue(recursiveEquals(retValue, term133412));
    }

};


