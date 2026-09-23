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

public class POJOPropertyBuilder_explode_488010408137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;
     Object term15479;

    public POJOPropertyBuilder_explode_488010408137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term60, term60.getClass(), "_forSerialization", false);
        setField(term60, term60.getClass(), "_config", null);
        setField(term60, term60.getClass(), "_annotationIntrospector", null);
        setField(term60, term60.getClass(), "_name", null);
        setField(term60, term60.getClass(), "_internalName", null);
        setField(term60, term60.getClass(), "_fields", null);
        setField(term60, term60.getClass(), "_ctorParameters", null);
        setField(term60, term60.getClass(), "_getters", null);
        setField(term60, term60.getClass(), "_setters", null);
        term15479 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term15479, term15479.getClass(), "_forSerialization", false);
        setField(term15479, term15479.getClass(), "_config", null);
        setField(term15479, term15479.getClass(), "_annotationIntrospector", null);
        setField(term15479, term15479.getClass(), "_name", null);
        setField(term15479, term15479.getClass(), "_internalName", null);
        setField(term15479, term15479.getClass(), "_fields", null);
        setField(term15479, term15479.getClass(), "_ctorParameters", null);
        setField(term15479, term15479.getClass(), "_getters", null);
        setField(term15479, term15479.getClass(), "_setters", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = Class.forName("java.util.Map");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "_explode", argTypes, term60, args);
        assertTrue(recursiveEquals(term60, term15479));
    }

};


