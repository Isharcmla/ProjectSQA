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
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class BasicBeanDescription_findPropertyFields_1404215125321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150944;
     Object term152534;
     Object term152527;

    public BasicBeanDescription_findPropertyFields_1404215125321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151124 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term151124, term151124.getClass(), "_fields", null);
        Object term151252 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term151252, term151252.getClass(), "_fields", null);
        Object term151380 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term151380, term151380.getClass(), "_fields", null);
        ArrayList term150996 = new ArrayList();
        ((ArrayList) term150996).add(term151124);
        ((ArrayList) term150996).add(term151252);
        ((ArrayList) term150996).add(term151380);
        term150944 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term150944, term150944.getClass(), "_properties", term150996);
        Object term152537 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term152537, term152537.getClass(), "_forSerialization", false);
        setField(term152537, term152537.getClass(), "_config", null);
        setField(term152537, term152537.getClass(), "_annotationIntrospector", null);
        setField(term152537, term152537.getClass(), "_name", null);
        setField(term152537, term152537.getClass(), "_internalName", null);
        setField(term152537, term152537.getClass(), "_fields", null);
        setField(term152537, term152537.getClass(), "_ctorParameters", null);
        setField(term152537, term152537.getClass(), "_getters", null);
        setField(term152537, term152537.getClass(), "_setters", null);
        setField(term152537, term152537.getClass(), "_metadata", null);
        setField(term152537, term152537.getClass(), "_referenceInfo", null);
        Object term152538 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term152538, term152538.getClass(), "_forSerialization", false);
        setField(term152538, term152538.getClass(), "_config", null);
        setField(term152538, term152538.getClass(), "_annotationIntrospector", null);
        setField(term152538, term152538.getClass(), "_name", null);
        setField(term152538, term152538.getClass(), "_internalName", null);
        setField(term152538, term152538.getClass(), "_fields", null);
        setField(term152538, term152538.getClass(), "_ctorParameters", null);
        setField(term152538, term152538.getClass(), "_getters", null);
        setField(term152538, term152538.getClass(), "_setters", null);
        setField(term152538, term152538.getClass(), "_metadata", null);
        setField(term152538, term152538.getClass(), "_referenceInfo", null);
        Object term152539 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term152539, term152539.getClass(), "_forSerialization", false);
        setField(term152539, term152539.getClass(), "_config", null);
        setField(term152539, term152539.getClass(), "_annotationIntrospector", null);
        setField(term152539, term152539.getClass(), "_name", null);
        setField(term152539, term152539.getClass(), "_internalName", null);
        setField(term152539, term152539.getClass(), "_fields", null);
        setField(term152539, term152539.getClass(), "_ctorParameters", null);
        setField(term152539, term152539.getClass(), "_getters", null);
        setField(term152539, term152539.getClass(), "_setters", null);
        setField(term152539, term152539.getClass(), "_metadata", null);
        setField(term152539, term152539.getClass(), "_referenceInfo", null);
        ArrayList term152535 = new ArrayList();
        ((ArrayList) term152535).add(term152537);
        ((ArrayList) term152535).add(term152538);
        ((ArrayList) term152535).add(term152539);
        term152534 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term152534, term152534.getClass(), "_propCollector", null);
        setField(term152534, term152534.getClass(), "_config", null);
        setField(term152534, term152534.getClass(), "_annotationIntrospector", null);
        setField(term152534, term152534.getClass(), "_classInfo", null);
        setField(term152534, term152534.getClass(), "_defaultViews", null);
        setBooleanField(term152534, term152534.getClass(), "_defaultViewsResolved", false);
        setField(term152534, term152534.getClass(), "_properties", term152535);
        setField(term152534, term152534.getClass(), "_objectIdInfo", null);
        setField(term152534, term152534.getClass(), "_type", null);
        term152527 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term150944, args);
        assertTrue(recursiveEquals(term150944, term152534));
        assertTrue(recursiveEquals(retValue, term152527));
    }

};


