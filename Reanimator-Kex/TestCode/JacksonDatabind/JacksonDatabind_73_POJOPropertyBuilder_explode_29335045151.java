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

public class POJOPropertyBuilder_explode_29335045151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17766;
     Object term17967;
     Object term17961;

    public POJOPropertyBuilder_explode_29335045151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17766 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term17908 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term17766, term17766.getClass(), "_fields", term17908);
        term17967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term17968 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term17967, term17967.getClass(), "_forSerialization", false);
        setField(term17967, term17967.getClass(), "_config", null);
        setField(term17967, term17967.getClass(), "_annotationIntrospector", null);
        setField(term17967, term17967.getClass(), "_name", null);
        setField(term17967, term17967.getClass(), "_internalName", null);
        setField(term17968, term17968.getClass(), "value", null);
        setField(term17968, term17968.getClass(), "next", null);
        setField(term17968, term17968.getClass(), "name", null);
        setBooleanField(term17968, term17968.getClass(), "isNameExplicit", false);
        setBooleanField(term17968, term17968.getClass(), "isVisible", false);
        setBooleanField(term17968, term17968.getClass(), "isMarkedIgnored", false);
        setField(term17967, term17967.getClass(), "_fields", term17968);
        setField(term17967, term17967.getClass(), "_ctorParameters", null);
        setField(term17967, term17967.getClass(), "_getters", null);
        setField(term17967, term17967.getClass(), "_setters", null);
        HashMap term17962 = new HashMap();
        term17961 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term17961, term17961.getClass(), "this$0", term17962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term17766, args);
        assertTrue(recursiveEquals(term17766, term17967));
        assertTrue(recursiveEquals(retValue, term17961));
    }

};


