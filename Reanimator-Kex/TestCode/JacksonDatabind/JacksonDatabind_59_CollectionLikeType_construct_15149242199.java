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

public class CollectionLikeType_construct_15149242199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24726;
     Object term24866;
     Object term24958;
     Object term25271;
     Object term25272;
     Object term25296;
     Object term25129;

    public CollectionLikeType_construct_15149242199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24726 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term24866 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        term24958 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setIntField(term24958, term24958.getClass(), "_hash", 0);
        term25271 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term25271, term25271.getClass(), "_keyType", null);
        setField(term25271, term25271.getClass(), "_valueType", null);
        setField(term25271, term25271.getClass(), "_superClass", null);
        setField(term25271, term25271.getClass(), "_superInterfaces", null);
        setField(term25271, term25271.getClass(), "_bindings", null);
        setField(term25271, term25271.getClass(), "_canonicalName", null);
        setField(term25271, term25271.getClass(), "_class", null);
        setIntField(term25271, term25271.getClass(), "_hash", 0);
        setField(term25271, term25271.getClass(), "_valueHandler", null);
        setField(term25271, term25271.getClass(), "_typeHandler", null);
        setBooleanField(term25271, term25271.getClass(), "_asStatic", false);
        term25272 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term25296 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term25296, term25296.getClass(), "_names", null);
        setField(term25296, term25296.getClass(), "_types", null);
        setField(term25296, term25296.getClass(), "_unboundVariables", null);
        setIntField(term25296, term25296.getClass(), "_hashCode", 0);
        Class<? extends Object> term25132 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        term25129 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term25126 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term25130 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.TypeBindings"));
        setField(term25126, term25126.getClass(), "_keyType", null);
        setField(term25126, term25126.getClass(), "_valueType", null);
        setField(term25126, term25126.getClass(), "_superClass", null);
        setField(term25126, term25126.getClass(), "_superInterfaces", null);
        setField(term25126, term25126.getClass(), "_bindings", null);
        setField(term25126, term25126.getClass(), "_canonicalName", null);
        setField(term25126, term25126.getClass(), "_class", null);
        setIntField(term25126, term25126.getClass(), "_hash", 0);
        setField(term25126, term25126.getClass(), "_valueHandler", null);
        setField(term25126, term25126.getClass(), "_typeHandler", null);
        setBooleanField(term25126, term25126.getClass(), "_asStatic", false);
        setField(term25129, term25129.getClass(), "_elementType", term25126);
        setField(term25129, term25129.getClass(), "_superClass", null);
        setField(term25129, term25129.getClass(), "_superInterfaces", null);
        setField(term25130, term25130.getClass(), "_names", null);
        setField(term25130, term25130.getClass(), "_types", null);
        setField(term25130, term25130.getClass(), "_unboundVariables", null);
        setIntField(term25130, term25130.getClass(), "_hashCode", 0);
        setField(term25129, term25129.getClass(), "_bindings", term25130);
        setField(term25129, term25129.getClass(), "_canonicalName", null);
        setField(term25129, term25129.getClass(), "_class", term25132);
        setIntField(term25129, term25129.getClass(), "_hash", 1340834877);
        setField(term25129, term25129.getClass(), "_valueHandler", null);
        setField(term25129, term25129.getClass(), "_typeHandler", null);
        setBooleanField(term25129, term25129.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term24726;
        args[1] = term24866;
        args[2] = null;
        args[3] = null;
        args[4] = term24958;
        Object retValue = callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term24726, term25271));
        assertTrue(recursiveEquals(term24866, term25272));
        assertTrue(recursiveEquals(term24958, null));
        assertTrue(recursiveEquals(retValue, term25129));
    }

};


