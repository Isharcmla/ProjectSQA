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

public class BasicBeanDescription_findPropertyFields_1404215125255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103381;
     Object term104523;
     Object term104516;

    public BasicBeanDescription_findPropertyFields_1404215125255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103561 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term103703 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term103703, term103703.getClass(), "value", null);
        setField(term103703, term103703.getClass(), "next", null);
        setField(term103561, term103561.getClass(), "_fields", term103703);
        Object term103831 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term103973 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term103973, term103973.getClass(), "value", null);
        setField(term103973, term103973.getClass(), "next", null);
        setField(term103831, term103831.getClass(), "_fields", term103973);
        Object term104101 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        ArrayList term103433 = new ArrayList();
        ((ArrayList) term103433).add(term103561);
        ((ArrayList) term103433).add(term103831);
        ((ArrayList) term103433).add(term104101);
        term103381 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term103381, term103381.getClass(), "_properties", term103433);
        Object term104526 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term104527 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term104526, term104526.getClass(), "_forSerialization", false);
        setField(term104526, term104526.getClass(), "_config", null);
        setField(term104526, term104526.getClass(), "_annotationIntrospector", null);
        setField(term104526, term104526.getClass(), "_name", null);
        setField(term104526, term104526.getClass(), "_internalName", null);
        setField(term104527, term104527.getClass(), "value", null);
        setField(term104527, term104527.getClass(), "next", null);
        setField(term104527, term104527.getClass(), "name", null);
        setBooleanField(term104527, term104527.getClass(), "isNameExplicit", false);
        setBooleanField(term104527, term104527.getClass(), "isVisible", false);
        setBooleanField(term104527, term104527.getClass(), "isMarkedIgnored", false);
        setField(term104526, term104526.getClass(), "_fields", term104527);
        setField(term104526, term104526.getClass(), "_ctorParameters", null);
        setField(term104526, term104526.getClass(), "_getters", null);
        setField(term104526, term104526.getClass(), "_setters", null);
        setField(term104526, term104526.getClass(), "_metadata", null);
        setField(term104526, term104526.getClass(), "_referenceInfo", null);
        Object term104528 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term104529 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term104528, term104528.getClass(), "_forSerialization", false);
        setField(term104528, term104528.getClass(), "_config", null);
        setField(term104528, term104528.getClass(), "_annotationIntrospector", null);
        setField(term104528, term104528.getClass(), "_name", null);
        setField(term104528, term104528.getClass(), "_internalName", null);
        setField(term104529, term104529.getClass(), "value", null);
        setField(term104529, term104529.getClass(), "next", null);
        setField(term104529, term104529.getClass(), "name", null);
        setBooleanField(term104529, term104529.getClass(), "isNameExplicit", false);
        setBooleanField(term104529, term104529.getClass(), "isVisible", false);
        setBooleanField(term104529, term104529.getClass(), "isMarkedIgnored", false);
        setField(term104528, term104528.getClass(), "_fields", term104529);
        setField(term104528, term104528.getClass(), "_ctorParameters", null);
        setField(term104528, term104528.getClass(), "_getters", null);
        setField(term104528, term104528.getClass(), "_setters", null);
        setField(term104528, term104528.getClass(), "_metadata", null);
        setField(term104528, term104528.getClass(), "_referenceInfo", null);
        Object term104530 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term104530, term104530.getClass(), "_forSerialization", false);
        setField(term104530, term104530.getClass(), "_config", null);
        setField(term104530, term104530.getClass(), "_annotationIntrospector", null);
        setField(term104530, term104530.getClass(), "_name", null);
        setField(term104530, term104530.getClass(), "_internalName", null);
        setField(term104530, term104530.getClass(), "_fields", null);
        setField(term104530, term104530.getClass(), "_ctorParameters", null);
        setField(term104530, term104530.getClass(), "_getters", null);
        setField(term104530, term104530.getClass(), "_setters", null);
        setField(term104530, term104530.getClass(), "_metadata", null);
        setField(term104530, term104530.getClass(), "_referenceInfo", null);
        ArrayList term104524 = new ArrayList();
        ((ArrayList) term104524).add(term104526);
        ((ArrayList) term104524).add(term104528);
        ((ArrayList) term104524).add(term104530);
        term104523 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term104523, term104523.getClass(), "_propCollector", null);
        setField(term104523, term104523.getClass(), "_config", null);
        setField(term104523, term104523.getClass(), "_annotationIntrospector", null);
        setField(term104523, term104523.getClass(), "_classInfo", null);
        setField(term104523, term104523.getClass(), "_defaultViews", null);
        setBooleanField(term104523, term104523.getClass(), "_defaultViewsResolved", false);
        setField(term104523, term104523.getClass(), "_properties", term104524);
        setField(term104523, term104523.getClass(), "_objectIdInfo", null);
        setField(term104523, term104523.getClass(), "_type", null);
        term104516 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term103381, args);
        assertTrue(recursiveEquals(term103381, term104523));
        assertTrue(recursiveEquals(retValue, term104516));
    }

};


