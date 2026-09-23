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

public class BeanSerializerBase_rename_1325899260264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101903;
     Object term102522;
     Object term103171;
     Object term103172;
     Object term103168;

    public BeanSerializerBase_rename_1325899260264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101903 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 97);
        term102522 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        term103171 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 97);
        term103172 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
        setField(term103172, term103172.getClass(), "val$prefix", null);
        term103168 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term101903;
        args[1] = term102522;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term101903, term103171));
        assertTrue(recursiveEquals(term102522, term103172));
        assertTrue(recursiveEquals(retValue, term103168));
    }

};


