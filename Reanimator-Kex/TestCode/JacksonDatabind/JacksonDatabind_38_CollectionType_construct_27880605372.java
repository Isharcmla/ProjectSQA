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
import java.lang.String;
import java.lang.Object;

public class CollectionType_construct_27880605372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21959;
     Object term22057;
     Object term23084;
     Object term23085;
     Object term22919;

    public CollectionType_construct_27880605372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21959 = Class.forName((String) "com.fasterxml.jackson.core.util.JsonParserSequence");
        term22057 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setIntField(term22057, term22057.getClass(), "_hash", 0);
        term23084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term23084, term23084.getClass(), "_superClass", null);
        setField(term23084, term23084.getClass(), "_superInterfaces", null);
        setField(term23084, term23084.getClass(), "_bindings", null);
        setField(term23084, term23084.getClass(), "_canonicalName", null);
        setField(term23084, term23084.getClass(), "_class", null);
        setIntField(term23084, term23084.getClass(), "_hash", 0);
        setField(term23084, term23084.getClass(), "_valueHandler", null);
        setField(term23084, term23084.getClass(), "_typeHandler", null);
        setBooleanField(term23084, term23084.getClass(), "_asStatic", false);
        term23085 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer");
        Class<? extends Object> term22924 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer");
        term22919 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term22916 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term22920 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        Object[] term22921 = (Object[]) newArray("java.lang.String", 0);
        Object[] term22922 = (Object[]) newArray("com.fasterxml.jackson.databind.JavaType", 0);
        setField(term22916, term22916.getClass(), "_superClass", null);
        setField(term22916, term22916.getClass(), "_superInterfaces", null);
        setField(term22916, term22916.getClass(), "_bindings", null);
        setField(term22916, term22916.getClass(), "_canonicalName", null);
        setField(term22916, term22916.getClass(), "_class", null);
        setIntField(term22916, term22916.getClass(), "_hash", 0);
        setField(term22916, term22916.getClass(), "_valueHandler", null);
        setField(term22916, term22916.getClass(), "_typeHandler", null);
        setBooleanField(term22916, term22916.getClass(), "_asStatic", false);
        setField(term22919, term22919.getClass(), "_elementType", term22916);
        setField(term22919, term22919.getClass(), "_superClass", null);
        setField(term22919, term22919.getClass(), "_superInterfaces", null);
        setField(term22920, term22920.getClass(), "_names", term22921);
        setField(term22920, term22920.getClass(), "_types", term22922);
        setField(term22920, term22920.getClass(), "_unboundVariables", null);
        setIntField(term22920, term22920.getClass(), "_hashCode", 1);
        setField(term22919, term22919.getClass(), "_bindings", term22920);
        setField(term22919, term22919.getClass(), "_canonicalName", null);
        setField(term22919, term22919.getClass(), "_class", term22924);
        setIntField(term22919, term22919.getClass(), "_hash", -1726520205);
        setField(term22919, term22919.getClass(), "_valueHandler", null);
        setField(term22919, term22919.getClass(), "_typeHandler", null);
        setBooleanField(term22919, term22919.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term21959;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term22057;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term21959, term23084));
        assertTrue(recursiveEquals(term22057, null));
        assertTrue(recursiveEquals(retValue, term22919));
    }

};


