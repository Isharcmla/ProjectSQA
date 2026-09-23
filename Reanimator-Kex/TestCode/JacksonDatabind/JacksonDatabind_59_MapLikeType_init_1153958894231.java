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

public class MapLikeType_init_1153958894231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107146;
     Object term107252;
     Object term107358;
     Object term107884;
     Object term107909;
     Object term107910;
     Object term107911;

    public MapLikeType_init_1153958894231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term107110 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.TypeResolutionContext$Basic");
        Object term107074 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term107074, term107074.getClass(), "_class", term107110);
        term107146 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable");
        term107252 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term107252, term107252.getClass(), "_hash", 0);
        term107358 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setIntField(term107358, term107358.getClass(), "_hash", 0);
        Class<? extends Object> term107890 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer");
        term107884 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term107885 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term107886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term107887 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term107888 = (Object[]) newArray("java.lang.String", 0);
        Object[] term107889 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term107885, term107885.getClass(), "_elementType", null);
        setField(term107885, term107885.getClass(), "_superClass", null);
        setField(term107885, term107885.getClass(), "_superInterfaces", null);
        setField(term107885, term107885.getClass(), "_bindings", null);
        setField(term107885, term107885.getClass(), "_canonicalName", null);
        setField(term107885, term107885.getClass(), "_class", null);
        setIntField(term107885, term107885.getClass(), "_hash", 0);
        setField(term107885, term107885.getClass(), "_valueHandler", null);
        setField(term107885, term107885.getClass(), "_typeHandler", null);
        setBooleanField(term107885, term107885.getClass(), "_asStatic", false);
        setField(term107884, term107884.getClass(), "_keyType", term107885);
        setField(term107886, term107886.getClass(), "_elementType", null);
        setField(term107886, term107886.getClass(), "_superClass", null);
        setField(term107886, term107886.getClass(), "_superInterfaces", null);
        setField(term107886, term107886.getClass(), "_bindings", null);
        setField(term107886, term107886.getClass(), "_canonicalName", null);
        setField(term107886, term107886.getClass(), "_class", null);
        setIntField(term107886, term107886.getClass(), "_hash", 0);
        setField(term107886, term107886.getClass(), "_valueHandler", null);
        setField(term107886, term107886.getClass(), "_typeHandler", null);
        setBooleanField(term107886, term107886.getClass(), "_asStatic", false);
        setField(term107884, term107884.getClass(), "_valueType", term107886);
        setField(term107884, term107884.getClass(), "_superClass", null);
        setField(term107884, term107884.getClass(), "_superInterfaces", null);
        setField(term107887, term107887.getClass(), "_names", term107888);
        setField(term107887, term107887.getClass(), "_types", term107889);
        setField(term107887, term107887.getClass(), "_unboundVariables", null);
        setIntField(term107887, term107887.getClass(), "_hashCode", 1);
        setField(term107884, term107884.getClass(), "_bindings", term107887);
        setField(term107884, term107884.getClass(), "_canonicalName", null);
        setField(term107884, term107884.getClass(), "_class", term107890);
        setIntField(term107884, term107884.getClass(), "_hash", 1091243209);
        setField(term107884, term107884.getClass(), "_valueHandler", null);
        setField(term107884, term107884.getClass(), "_typeHandler", null);
        setBooleanField(term107884, term107884.getClass(), "_asStatic", false);
        term107909 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term107909, term107909.getClass(), "_elementType", null);
        setField(term107909, term107909.getClass(), "_superClass", null);
        setField(term107909, term107909.getClass(), "_superInterfaces", null);
        setField(term107909, term107909.getClass(), "_bindings", null);
        setField(term107909, term107909.getClass(), "_canonicalName", null);
        setField(term107909, term107909.getClass(), "_class", null);
        setIntField(term107909, term107909.getClass(), "_hash", 0);
        setField(term107909, term107909.getClass(), "_valueHandler", null);
        setField(term107909, term107909.getClass(), "_typeHandler", null);
        setBooleanField(term107909, term107909.getClass(), "_asStatic", false);
        term107910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term107910, term107910.getClass(), "_elementType", null);
        setField(term107910, term107910.getClass(), "_superClass", null);
        setField(term107910, term107910.getClass(), "_superInterfaces", null);
        setField(term107910, term107910.getClass(), "_bindings", null);
        setField(term107910, term107910.getClass(), "_canonicalName", null);
        setField(term107910, term107910.getClass(), "_class", null);
        setIntField(term107910, term107910.getClass(), "_hash", 0);
        setField(term107910, term107910.getClass(), "_valueHandler", null);
        setField(term107910, term107910.getClass(), "_typeHandler", null);
        setBooleanField(term107910, term107910.getClass(), "_asStatic", false);
        term107911 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[6] = Class.forName("java.lang.Object");
        argTypes[7] = Class.forName("java.lang.Object");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term107146;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term107252;
        args[5] = term107358;
        args[6] = null;
        args[7] = null;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term107884));
        assertTrue(recursiveEquals(term107146, term107909));
        assertTrue(recursiveEquals(term107252, null));
        assertTrue(recursiveEquals(term107358, false));
    }

};


