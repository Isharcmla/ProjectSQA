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

public class BeanSerializerBase_rename_1325899260485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251275;
     Object term251523;
     Object term251578;
     Object term251579;
     Object term251575;

    public BeanSerializerBase_rename_1325899260485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251275 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 23);
        term251523 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term251578 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 23);
        term251579 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term251575 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 23);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term251275;
        args[1] = term251523;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term251275, term251578));
        assertTrue(recursiveEquals(term251523, term251579));
        assertTrue(recursiveEquals(retValue, term251575));
    }

};


