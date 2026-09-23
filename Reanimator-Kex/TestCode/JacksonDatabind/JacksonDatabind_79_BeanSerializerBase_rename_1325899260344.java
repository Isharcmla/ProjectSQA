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

public class BeanSerializerBase_rename_1325899260344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137960;
     Object term138144;
     Object term139009;
     Object term139010;
     Object term139006;

    public BeanSerializerBase_rename_1325899260344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137960 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 5);
        term138144 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        term139009 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 5);
        term139010 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
        term139006 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term137960;
        args[1] = term138144;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term137960, term139009));
        assertTrue(recursiveEquals(term138144, term139010));
        assertTrue(recursiveEquals(retValue, term139006));
    }

};


