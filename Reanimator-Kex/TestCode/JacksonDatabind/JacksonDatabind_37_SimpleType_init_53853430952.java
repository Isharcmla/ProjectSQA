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

public class SimpleType_init_53853430952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10272;
     Object term11102;
     Object term11125;

    public SimpleType_init_53853430952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term10236, term10236.getClass(), "_class", null);
        term10272 = Class.forName((String) "java.util.stream.StreamSpliterators$AbstractWrappingSpliterator");
        Class<? extends Object> term11106 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        term11102 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term11103 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term11104 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11105 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term11102, term11102.getClass(), "_superClass", null);
        setField(term11102, term11102.getClass(), "_superInterfaces", null);
        setField(term11103, term11103.getClass(), "_names", term11104);
        setField(term11103, term11103.getClass(), "_types", term11105);
        setField(term11103, term11103.getClass(), "_unboundVariables", null);
        setIntField(term11103, term11103.getClass(), "_hashCode", 1);
        setField(term11102, term11102.getClass(), "_bindings", term11103);
        setField(term11102, term11102.getClass(), "_canonicalName", null);
        setField(term11102, term11102.getClass(), "_class", term11106);
        setIntField(term11102, term11102.getClass(), "_hash", -1248968969);
        setField(term11102, term11102.getClass(), "_valueHandler", null);
        setField(term11102, term11102.getClass(), "_typeHandler", null);
        setBooleanField(term11102, term11102.getClass(), "_asStatic", false);
        term11125 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        Object[] args = new Object[4];
        args[0] = term10272;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11102));
        assertTrue(recursiveEquals(term10272, term11125));
    }

};


