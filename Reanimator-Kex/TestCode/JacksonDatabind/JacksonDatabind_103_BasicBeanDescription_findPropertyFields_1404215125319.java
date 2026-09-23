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

public class BasicBeanDescription_findPropertyFields_1404215125319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148995;
     Object term151803;
     Object term151796;

    public BasicBeanDescription_findPropertyFields_1404215125319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term149175 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term149175, term149175.getClass(), "_fields", null);
        Object term149303 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term149303, term149303.getClass(), "_fields", null);
        Object term149437 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term149571 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(term149437, term149437.getClass(), "_member", term149571);
        Object term149705 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term149705, term149705.getClass(), "_member", null);
        ArrayList term149047 = new ArrayList();
        ((ArrayList) term149047).add(term149175);
        ((ArrayList) term149047).add(term149303);
        ((ArrayList) term149047).add(term149437);
        ((ArrayList) term149047).add(term149705);
        term148995 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term148995, term148995.getClass(), "_properties", term149047);
        Object term151806 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term151806, term151806.getClass(), "_forSerialization", false);
        setField(term151806, term151806.getClass(), "_config", null);
        setField(term151806, term151806.getClass(), "_annotationIntrospector", null);
        setField(term151806, term151806.getClass(), "_name", null);
        setField(term151806, term151806.getClass(), "_internalName", null);
        setField(term151806, term151806.getClass(), "_fields", null);
        setField(term151806, term151806.getClass(), "_ctorParameters", null);
        setField(term151806, term151806.getClass(), "_getters", null);
        setField(term151806, term151806.getClass(), "_setters", null);
        setField(term151806, term151806.getClass(), "_metadata", null);
        setField(term151806, term151806.getClass(), "_referenceInfo", null);
        Object term151807 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term151807, term151807.getClass(), "_forSerialization", false);
        setField(term151807, term151807.getClass(), "_config", null);
        setField(term151807, term151807.getClass(), "_annotationIntrospector", null);
        setField(term151807, term151807.getClass(), "_name", null);
        setField(term151807, term151807.getClass(), "_internalName", null);
        setField(term151807, term151807.getClass(), "_fields", null);
        setField(term151807, term151807.getClass(), "_ctorParameters", null);
        setField(term151807, term151807.getClass(), "_getters", null);
        setField(term151807, term151807.getClass(), "_setters", null);
        setField(term151807, term151807.getClass(), "_metadata", null);
        setField(term151807, term151807.getClass(), "_referenceInfo", null);
        Object term151808 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        Object term151809 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember"));
        setField(term151808, term151808.getClass(), "_annotationIntrospector", null);
        setField(term151809, term151809.getClass(), "_declaringClass", null);
        setField(term151809, term151809.getClass(), "_type", null);
        setField(term151809, term151809.getClass(), "_name", null);
        setField(term151809, term151809.getClass(), "_typeContext", null);
        setField(term151809, term151809.getClass(), "_annotations", null);
        setField(term151808, term151808.getClass(), "_member", term151809);
        setField(term151808, term151808.getClass(), "_metadata", null);
        setField(term151808, term151808.getClass(), "_fullName", null);
        setField(term151808, term151808.getClass(), "_inclusion", null);
        Object term151810 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term151810, term151810.getClass(), "_annotationIntrospector", null);
        setField(term151810, term151810.getClass(), "_member", null);
        setField(term151810, term151810.getClass(), "_metadata", null);
        setField(term151810, term151810.getClass(), "_fullName", null);
        setField(term151810, term151810.getClass(), "_inclusion", null);
        ArrayList term151804 = new ArrayList();
        ((ArrayList) term151804).add(term151806);
        ((ArrayList) term151804).add(term151807);
        ((ArrayList) term151804).add(term151808);
        ((ArrayList) term151804).add(term151810);
        term151803 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term151803, term151803.getClass(), "_propCollector", null);
        setField(term151803, term151803.getClass(), "_config", null);
        setField(term151803, term151803.getClass(), "_annotationIntrospector", null);
        setField(term151803, term151803.getClass(), "_classInfo", null);
        setField(term151803, term151803.getClass(), "_defaultViews", null);
        setBooleanField(term151803, term151803.getClass(), "_defaultViewsResolved", false);
        setField(term151803, term151803.getClass(), "_properties", term151804);
        setField(term151803, term151803.getClass(), "_objectIdInfo", null);
        setField(term151803, term151803.getClass(), "_type", null);
        term151796 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term148995, args);
        assertTrue(recursiveEquals(term148995, term151803));
        assertTrue(recursiveEquals(retValue, term151796));
    }

};


