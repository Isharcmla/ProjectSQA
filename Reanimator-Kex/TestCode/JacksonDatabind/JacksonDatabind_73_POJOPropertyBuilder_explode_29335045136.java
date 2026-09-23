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
import java.util.HashMap;

public class POJOPropertyBuilder_explode_29335045136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term15475;
     Object term15469;

    public POJOPropertyBuilder_explode_29335045136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term58, term58.getClass(), "_forSerialization", false);
        setField(term58, term58.getClass(), "_config", null);
        setField(term58, term58.getClass(), "_annotationIntrospector", null);
        setField(term58, term58.getClass(), "_name", null);
        setField(term58, term58.getClass(), "_internalName", null);
        setField(term58, term58.getClass(), "_fields", null);
        setField(term58, term58.getClass(), "_ctorParameters", null);
        setField(term58, term58.getClass(), "_getters", null);
        setField(term58, term58.getClass(), "_setters", null);
        term15475 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term15475, term15475.getClass(), "_forSerialization", false);
        setField(term15475, term15475.getClass(), "_config", null);
        setField(term15475, term15475.getClass(), "_annotationIntrospector", null);
        setField(term15475, term15475.getClass(), "_name", null);
        setField(term15475, term15475.getClass(), "_internalName", null);
        setField(term15475, term15475.getClass(), "_fields", null);
        setField(term15475, term15475.getClass(), "_ctorParameters", null);
        setField(term15475, term15475.getClass(), "_getters", null);
        setField(term15475, term15475.getClass(), "_setters", null);
        HashMap term15470 = new HashMap();
        term15469 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term15469, term15469.getClass(), "this$0", term15470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term58, args);
        assertTrue(recursiveEquals(term58, term15475));
        assertTrue(recursiveEquals(retValue, term15469));
    }

};


