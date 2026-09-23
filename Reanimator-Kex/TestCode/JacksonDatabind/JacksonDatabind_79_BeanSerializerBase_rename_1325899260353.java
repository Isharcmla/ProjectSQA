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

public class BeanSerializerBase_rename_1325899260353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143179;
     Object term144024;
     Object term144317;
     Object term144318;
     Object term144314;

    public BeanSerializerBase_rename_1325899260353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143179 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 142);
        term144024 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term144317 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 142);
        term144318 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term144318, term144318.getClass(), "val$suffix", null);
        term144314 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term143179;
        args[1] = term144024;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term143179, term144317));
        assertTrue(recursiveEquals(term144024, term144318));
        assertTrue(recursiveEquals(retValue, term144314));
    }

};


