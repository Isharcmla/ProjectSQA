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

public class BeanSerializerBase_rename_1325899260458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238483;
     Object term239097;
     Object term239980;
     Object term239981;
     Object term239977;

    public BeanSerializerBase_rename_1325899260458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238483 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 96);
        term239097 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term239980 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 96);
        term239981 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term239977 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 96);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term238483;
        args[1] = term239097;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term238483, term239980));
        assertTrue(recursiveEquals(term239097, term239981));
        assertTrue(recursiveEquals(retValue, term239977));
    }

};


