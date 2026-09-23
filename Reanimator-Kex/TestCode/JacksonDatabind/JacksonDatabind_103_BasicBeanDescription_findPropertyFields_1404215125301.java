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

public class BasicBeanDescription_findPropertyFields_1404215125301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138473;
     Object term139114;
     Object term139107;

    public BasicBeanDescription_findPropertyFields_1404215125301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term138653 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term138653, term138653.getClass(), "_fields", null);
        Object term138787 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term138787, term138787.getClass(), "_member", null);
        Object term138915 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term139057 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term139057, term139057.getClass(), "value", null);
        setField(term139057, term139057.getClass(), "next", null);
        setField(term138915, term138915.getClass(), "_fields", term139057);
        ArrayList term138525 = new ArrayList();
        ((ArrayList) term138525).add(term138653);
        ((ArrayList) term138525).add(term138787);
        ((ArrayList) term138525).add(term138915);
        term138473 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term138473, term138473.getClass(), "_properties", term138525);
        Object term139117 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term139117, term139117.getClass(), "_forSerialization", false);
        setField(term139117, term139117.getClass(), "_config", null);
        setField(term139117, term139117.getClass(), "_annotationIntrospector", null);
        setField(term139117, term139117.getClass(), "_name", null);
        setField(term139117, term139117.getClass(), "_internalName", null);
        setField(term139117, term139117.getClass(), "_fields", null);
        setField(term139117, term139117.getClass(), "_ctorParameters", null);
        setField(term139117, term139117.getClass(), "_getters", null);
        setField(term139117, term139117.getClass(), "_setters", null);
        setField(term139117, term139117.getClass(), "_metadata", null);
        setField(term139117, term139117.getClass(), "_referenceInfo", null);
        Object term139118 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term139118, term139118.getClass(), "_annotationIntrospector", null);
        setField(term139118, term139118.getClass(), "_member", null);
        setField(term139118, term139118.getClass(), "_metadata", null);
        setField(term139118, term139118.getClass(), "_fullName", null);
        setField(term139118, term139118.getClass(), "_inclusion", null);
        Object term139119 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term139120 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term139119, term139119.getClass(), "_forSerialization", false);
        setField(term139119, term139119.getClass(), "_config", null);
        setField(term139119, term139119.getClass(), "_annotationIntrospector", null);
        setField(term139119, term139119.getClass(), "_name", null);
        setField(term139119, term139119.getClass(), "_internalName", null);
        setField(term139120, term139120.getClass(), "value", null);
        setField(term139120, term139120.getClass(), "next", null);
        setField(term139120, term139120.getClass(), "name", null);
        setBooleanField(term139120, term139120.getClass(), "isNameExplicit", false);
        setBooleanField(term139120, term139120.getClass(), "isVisible", false);
        setBooleanField(term139120, term139120.getClass(), "isMarkedIgnored", false);
        setField(term139119, term139119.getClass(), "_fields", term139120);
        setField(term139119, term139119.getClass(), "_ctorParameters", null);
        setField(term139119, term139119.getClass(), "_getters", null);
        setField(term139119, term139119.getClass(), "_setters", null);
        setField(term139119, term139119.getClass(), "_metadata", null);
        setField(term139119, term139119.getClass(), "_referenceInfo", null);
        ArrayList term139115 = new ArrayList();
        ((ArrayList) term139115).add(term139117);
        ((ArrayList) term139115).add(term139118);
        ((ArrayList) term139115).add(term139119);
        term139114 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term139114, term139114.getClass(), "_propCollector", null);
        setField(term139114, term139114.getClass(), "_config", null);
        setField(term139114, term139114.getClass(), "_annotationIntrospector", null);
        setField(term139114, term139114.getClass(), "_classInfo", null);
        setField(term139114, term139114.getClass(), "_defaultViews", null);
        setBooleanField(term139114, term139114.getClass(), "_defaultViewsResolved", false);
        setField(term139114, term139114.getClass(), "_properties", term139115);
        setField(term139114, term139114.getClass(), "_objectIdInfo", null);
        setField(term139114, term139114.getClass(), "_type", null);
        term139107 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term138473, args);
        assertTrue(recursiveEquals(term138473, term139114));
        assertTrue(recursiveEquals(retValue, term139107));
    }

};


