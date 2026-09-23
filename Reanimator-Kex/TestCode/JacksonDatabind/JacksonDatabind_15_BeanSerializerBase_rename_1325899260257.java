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

public class BeanSerializerBase_rename_1325899260257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99271;
     Object term99581;
     Object term99660;
     Object term99661;
     Object term99657;

    public BeanSerializerBase_rename_1325899260257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99271 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 35);
        term99581 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term99660 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 35);
        term99661 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term99661, term99661.getClass(), "val$prefix", null);
        term99657 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 35);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term99271;
        args[1] = term99581;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term99271, term99660));
        assertTrue(recursiveEquals(term99581, term99661));
        assertTrue(recursiveEquals(retValue, term99657));
    }

};


