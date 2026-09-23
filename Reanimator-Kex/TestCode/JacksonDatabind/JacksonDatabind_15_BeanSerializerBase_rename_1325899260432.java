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

public class BeanSerializerBase_rename_1325899260432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222716;
     Object term223779;
     Object term225329;
     Object term225330;
     Object term225326;

    public BeanSerializerBase_rename_1325899260432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222716 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 200);
        term223779 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        term225329 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 200);
        term225330 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(term225330, term225330.getClass(), "_t1", null);
        setField(term225330, term225330.getClass(), "_t2", null);
        term225326 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term222716;
        args[1] = term223779;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term222716, term225329));
        assertTrue(recursiveEquals(term223779, term225330));
        assertTrue(recursiveEquals(retValue, term225326));
    }

};


