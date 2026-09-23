package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeSerializer_565512902153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129907;
     Object term130161;
     Object term130568;
     Object term130572;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130574 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term130573 = ((Class) term130574).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term130573).setAccessible(true);
        Object enum197 = ((Field) term130573).get((Object) null);
        term129907 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term129907, term129907.getClass(), "_appliesFor", enum197);
        term130161 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Class<? extends Object> term130935 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term130934 = ((Class) term130935).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term130934).setAccessible(true);
        Object enum198 = ((Field) term130934).get((Object) null);
        term130568 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term130568, term130568.getClass(), "_appliesFor", enum198);
        setField(term130568, term130568.getClass(), "_idType", null);
        setField(term130568, term130568.getClass(), "_includeAs", null);
        setField(term130568, term130568.getClass(), "_typeProperty", null);
        setBooleanField(term130568, term130568.getClass(), "_typeIdVisible", false);
        setField(term130568, term130568.getClass(), "_defaultImpl", null);
        setField(term130568, term130568.getClass(), "_customIdResolver", null);
        term130572 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term130572, term130572.getClass(), "_componentType", null);
        setField(term130572, term130572.getClass(), "_emptyArray", null);
        setField(term130572, term130572.getClass(), "_superClass", null);
        setField(term130572, term130572.getClass(), "_superInterfaces", null);
        setField(term130572, term130572.getClass(), "_bindings", null);
        setField(term130572, term130572.getClass(), "_canonicalName", null);
        setField(term130572, term130572.getClass(), "_class", null);
        setIntField(term130572, term130572.getClass(), "_hash", 0);
        setField(term130572, term130572.getClass(), "_valueHandler", null);
        setField(term130572, term130572.getClass(), "_typeHandler", null);
        setBooleanField(term130572, term130572.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term130161;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term129907, args);
        assertTrue(recursiveEquals(term129907, term130568));
        assertTrue(recursiveEquals(term130161, null));
    }

};


