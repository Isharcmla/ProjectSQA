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

public class BeanSerializerBase_rename_1325899260450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233832;
     Object term234705;
     Object term235789;
     Object term235790;
     Object term235786;

    public BeanSerializerBase_rename_1325899260450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233832 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 148);
        term234705 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        term235789 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 148);
        term235790 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
        setField(term235790, term235790.getClass(), "val$prefix", null);
        term235786 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term233832;
        args[1] = term234705;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term233832, term235789));
        assertTrue(recursiveEquals(term234705, term235790));
        assertTrue(recursiveEquals(retValue, term235786));
    }

};


