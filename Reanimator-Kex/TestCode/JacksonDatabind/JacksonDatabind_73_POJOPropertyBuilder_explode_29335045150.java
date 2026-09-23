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

public class POJOPropertyBuilder_explode_29335045150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17461;
     Object term17937;
     Object term17931;

    public POJOPropertyBuilder_explode_29335045150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17461 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term17603 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term17461, term17461.getClass(), "_fields", null);
        setField(term17461, term17461.getClass(), "_getters", null);
        setField(term17461, term17461.getClass(), "_setters", null);
        setField(term17461, term17461.getClass(), "_ctorParameters", term17603);
        term17937 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term17938 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term17937, term17937.getClass(), "_forSerialization", false);
        setField(term17937, term17937.getClass(), "_config", null);
        setField(term17937, term17937.getClass(), "_annotationIntrospector", null);
        setField(term17937, term17937.getClass(), "_name", null);
        setField(term17937, term17937.getClass(), "_internalName", null);
        setField(term17937, term17937.getClass(), "_fields", null);
        setField(term17938, term17938.getClass(), "value", null);
        setField(term17938, term17938.getClass(), "next", null);
        setField(term17938, term17938.getClass(), "name", null);
        setBooleanField(term17938, term17938.getClass(), "isNameExplicit", false);
        setBooleanField(term17938, term17938.getClass(), "isVisible", false);
        setBooleanField(term17938, term17938.getClass(), "isMarkedIgnored", false);
        setField(term17937, term17937.getClass(), "_ctorParameters", term17938);
        setField(term17937, term17937.getClass(), "_getters", null);
        setField(term17937, term17937.getClass(), "_setters", null);
        HashMap term17932 = new HashMap();
        term17931 = newInstance(Class.forName("java.util.HashMap$Values"));
        setField(term17931, term17931.getClass(), "this$0", term17932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "explode", argTypes, term17461, args);
        assertTrue(recursiveEquals(term17461, term17937));
        assertTrue(recursiveEquals(retValue, term17931));
    }

};


