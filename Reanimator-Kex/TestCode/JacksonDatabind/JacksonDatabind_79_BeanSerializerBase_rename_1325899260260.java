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

public class BeanSerializerBase_rename_1325899260260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100572;
     Object term100973;
     Object term101699;
     Object term101700;
     Object term101696;

    public BeanSerializerBase_rename_1325899260260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100572 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 51);
        term100973 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        term101699 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 51);
        term101700 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
        setField(term101700, term101700.getClass(), "_t1", null);
        setField(term101700, term101700.getClass(), "_t2", null);
        term101696 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 51);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term100572;
        args[1] = term100973;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term100572, term101699));
        assertTrue(recursiveEquals(term100973, term101700));
        assertTrue(recursiveEquals(retValue, term101696));
    }

};


