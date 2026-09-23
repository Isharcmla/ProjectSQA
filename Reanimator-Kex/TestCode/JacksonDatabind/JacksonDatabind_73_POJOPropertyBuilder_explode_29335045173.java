package com.fasterxml.jackson.databind.introspect;

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
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.introspect.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;

public class POJOPropertyBuilder_explode_29335045173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22196;
     Object term22381;
     Object term22375;

    public POJOPropertyBuilder_explode_29335045173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22196 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term22338 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term22196, term22196.getClass(), "_fields", null);
        setField(term22196, term22196.getClass(), "_getters", null);
        setField(term22196, term22196.getClass(), "_setters", null);
        setField(term22338, term22338.getClass(), "name", null);
        setBooleanField(term22338, term22338.getClass(), "isNameExplicit", true);
        setField(term22196, term22196.getClass(), "_ctorParameters", term22338);
        term22381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term22382 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term22381, term22381.getClass(), "_forSerialization", false);
        setField(term22381, term22381.getClass(), "_config", null);
        setField(term22381, term22381.getClass(), "_annotationIntrospector", null);
        setField(term22381, term22381.getClass(), "_name", null);
        setField(term22381, term22381.getClass(), "_internalName", null);
        setField(term22381, term22381.getClass(), "_fields", null);
        setField(term22382, term22382.getClass(), "value", null);
        setField(term22382, term22382.getClass(), "next", null);
        setField(term22382, term22382.getClass(), "name", null);
        setBooleanField(term22382, term22382.getClass(), "isNameExplicit", true);
        setBooleanField(term22382, term22382.getClass(), "isVisible", false);
        setBooleanField(term22382, term22382.getClass(), "isMarkedIgnored", false);
        setField(term22381, term22381.getClass(), "_ctorParameters", term22382);
        setField(term22381, term22381.getClass(), "_getters", null);
        setField(term22381, term22381.getClass(), "_setters", null);
        HashMap term22376 = new HashMap();
        term22375 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term22375, term22375.getClass(), "this$0", term22376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term22196, args);
        assertTrue(recursiveEquals(term22196, term22381));
        assertTrue(recursiveEquals(retValue, term22375));
    }

};


