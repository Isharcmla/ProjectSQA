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

public class BasicBeanDescription_findPropertyFields_1404215125141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31810;
     Object term32156;
     Object term32149;

    public BasicBeanDescription_findPropertyFields_1404215125141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31990 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term31990, term31990.getClass(), "_fields", null);
        Object term32118 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        ArrayList term31862 = new ArrayList();
        ((ArrayList) term31862).add(term31990);
        ((ArrayList) term31862).add(term32118);
        term31810 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term31810, term31810.getClass(), "_properties", term31862);
        Object term32159 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term32159, term32159.getClass(), "_forSerialization", false);
        setField(term32159, term32159.getClass(), "_config", null);
        setField(term32159, term32159.getClass(), "_annotationIntrospector", null);
        setField(term32159, term32159.getClass(), "_name", null);
        setField(term32159, term32159.getClass(), "_internalName", null);
        setField(term32159, term32159.getClass(), "_fields", null);
        setField(term32159, term32159.getClass(), "_ctorParameters", null);
        setField(term32159, term32159.getClass(), "_getters", null);
        setField(term32159, term32159.getClass(), "_setters", null);
        setField(term32159, term32159.getClass(), "_metadata", null);
        setField(term32159, term32159.getClass(), "_referenceInfo", null);
        Object term32160 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term32160, term32160.getClass(), "_forSerialization", false);
        setField(term32160, term32160.getClass(), "_config", null);
        setField(term32160, term32160.getClass(), "_annotationIntrospector", null);
        setField(term32160, term32160.getClass(), "_name", null);
        setField(term32160, term32160.getClass(), "_internalName", null);
        setField(term32160, term32160.getClass(), "_fields", null);
        setField(term32160, term32160.getClass(), "_ctorParameters", null);
        setField(term32160, term32160.getClass(), "_getters", null);
        setField(term32160, term32160.getClass(), "_setters", null);
        setField(term32160, term32160.getClass(), "_metadata", null);
        setField(term32160, term32160.getClass(), "_referenceInfo", null);
        ArrayList term32157 = new ArrayList();
        ((ArrayList) term32157).add(term32159);
        ((ArrayList) term32157).add(term32160);
        term32156 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term32156, term32156.getClass(), "_propCollector", null);
        setField(term32156, term32156.getClass(), "_config", null);
        setField(term32156, term32156.getClass(), "_annotationIntrospector", null);
        setField(term32156, term32156.getClass(), "_classInfo", null);
        setField(term32156, term32156.getClass(), "_defaultViews", null);
        setBooleanField(term32156, term32156.getClass(), "_defaultViewsResolved", false);
        setField(term32156, term32156.getClass(), "_properties", term32157);
        setField(term32156, term32156.getClass(), "_objectIdInfo", null);
        setField(term32156, term32156.getClass(), "_type", null);
        term32149 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term31810, args);
        assertTrue(recursiveEquals(term31810, term32156));
        assertTrue(recursiveEquals(retValue, term32149));
    }

};


