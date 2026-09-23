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

public class BeanSerializerBase_rename_1325899260545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296896;
     Object term297829;
     Object term298636;
     Object term298637;
     Object term298633;

    public BeanSerializerBase_rename_1325899260545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296896 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 160);
        term297829 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term298636 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 160);
        term298637 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$1"));
        term298633 = (Object[]) newArray("com.fasterxml.jackson.databind.ser.BeanPropertyWriter", 160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ser.std.BeanSerializerBase");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.ser.BeanPropertyWriter"), 0).getClass();
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term296896;
        args[1] = term297829;
        Object retValue = callMethod(klass, "rename", argTypes, null, args);
        assertTrue(recursiveEquals(term296896, term298636));
        assertTrue(recursiveEquals(term297829, term298637));
        assertTrue(recursiveEquals(retValue, term298633));
    }

};


