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

public class SimpleType_init_53853430946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6319;
     Object term8013;
     Object term8036;

    public SimpleType_init_53853430946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6283 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term6283, term6283.getClass(), "_class", null);
        term6319 = Class.forName((String) "java.nio.file.LinkOption");
        Class<? extends Object> term8017 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase");
        term8013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term8014 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term8015 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8016 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term8013, term8013.getClass(), "_superClass", null);
        setField(term8013, term8013.getClass(), "_superInterfaces", null);
        setField(term8014, term8014.getClass(), "_names", term8015);
        setField(term8014, term8014.getClass(), "_types", term8016);
        setField(term8014, term8014.getClass(), "_unboundVariables", null);
        setIntField(term8014, term8014.getClass(), "_hashCode", 1);
        setField(term8013, term8013.getClass(), "_bindings", term8014);
        setField(term8013, term8013.getClass(), "_canonicalName", null);
        setField(term8013, term8013.getClass(), "_class", term8017);
        setIntField(term8013, term8013.getClass(), "_hash", -1003557006);
        setField(term8013, term8013.getClass(), "_valueHandler", null);
        setField(term8013, term8013.getClass(), "_typeHandler", null);
        setBooleanField(term8013, term8013.getClass(), "_asStatic", false);
        term8036 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase");
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
        args[0] = term6319;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8013));
        assertTrue(recursiveEquals(term6319, term8036));
    }

};


