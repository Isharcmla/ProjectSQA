package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class SimpleType_init_27531434152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10396;
     Object term11128;
     Object term11151;

    public SimpleType_init_27531434152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10360 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10360, term10360.getClass(), "_class", null);
        term10396 = Class.forName((String) "java.util.stream.IntPipeline$4$1");
        Class<? extends Object> term11132 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        term11128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term11129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term11130 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11131 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term11128, term11128.getClass(), "_superClass", null);
        setField(term11128, term11128.getClass(), "_superInterfaces", null);
        setField(term11129, term11129.getClass(), "_names", term11130);
        setField(term11129, term11129.getClass(), "_types", term11131);
        setField(term11129, term11129.getClass(), "_unboundVariables", null);
        setIntField(term11129, term11129.getClass(), "_hashCode", 1);
        setField(term11128, term11128.getClass(), "_bindings", term11129);
        setField(term11128, term11128.getClass(), "_canonicalName", null);
        setField(term11128, term11128.getClass(), "_class", term11132);
        setIntField(term11128, term11128.getClass(), "_hash", -1248968969);
        setField(term11128, term11128.getClass(), "_valueHandler", null);
        setField(term11128, term11128.getClass(), "_typeHandler", null);
        setBooleanField(term11128, term11128.getClass(), "_asStatic", false);
        term11151 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.Object");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = boolean.class;
        Object[] args = new Object[8];
        args[0] = term10396;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = 0;
        args[5] = null;
        args[6] = null;
        args[7] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11128));
        assertTrue(recursiveEquals(term10396, term11151));
    }

};


