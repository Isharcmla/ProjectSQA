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

public class BasicBeanDescription_findPropertyFields_1404215125245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97615;
     Object term98695;
     Object term98688;

    public BasicBeanDescription_findPropertyFields_1404215125245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97795 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term97795, term97795.getClass(), "_fields", null);
        Object term97923 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term98065 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term98065, term98065.getClass(), "value", null);
        setField(term98065, term98065.getClass(), "next", null);
        setField(term97923, term97923.getClass(), "_fields", term98065);
        Object term98199 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term98199, term98199.getClass(), "_member", null);
        Object term98333 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        ArrayList term97667 = new ArrayList();
        ((ArrayList) term97667).add(term97795);
        ((ArrayList) term97667).add(term97923);
        ((ArrayList) term97667).add(term98199);
        ((ArrayList) term97667).add(term98333);
        term97615 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term97615, term97615.getClass(), "_properties", term97667);
        Object term98698 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term98698, term98698.getClass(), "_forSerialization", false);
        setField(term98698, term98698.getClass(), "_config", null);
        setField(term98698, term98698.getClass(), "_annotationIntrospector", null);
        setField(term98698, term98698.getClass(), "_name", null);
        setField(term98698, term98698.getClass(), "_internalName", null);
        setField(term98698, term98698.getClass(), "_fields", null);
        setField(term98698, term98698.getClass(), "_ctorParameters", null);
        setField(term98698, term98698.getClass(), "_getters", null);
        setField(term98698, term98698.getClass(), "_setters", null);
        setField(term98698, term98698.getClass(), "_metadata", null);
        setField(term98698, term98698.getClass(), "_referenceInfo", null);
        Object term98699 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term98700 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term98699, term98699.getClass(), "_forSerialization", false);
        setField(term98699, term98699.getClass(), "_config", null);
        setField(term98699, term98699.getClass(), "_annotationIntrospector", null);
        setField(term98699, term98699.getClass(), "_name", null);
        setField(term98699, term98699.getClass(), "_internalName", null);
        setField(term98700, term98700.getClass(), "value", null);
        setField(term98700, term98700.getClass(), "next", null);
        setField(term98700, term98700.getClass(), "name", null);
        setBooleanField(term98700, term98700.getClass(), "isNameExplicit", false);
        setBooleanField(term98700, term98700.getClass(), "isVisible", false);
        setBooleanField(term98700, term98700.getClass(), "isMarkedIgnored", false);
        setField(term98699, term98699.getClass(), "_fields", term98700);
        setField(term98699, term98699.getClass(), "_ctorParameters", null);
        setField(term98699, term98699.getClass(), "_getters", null);
        setField(term98699, term98699.getClass(), "_setters", null);
        setField(term98699, term98699.getClass(), "_metadata", null);
        setField(term98699, term98699.getClass(), "_referenceInfo", null);
        Object term98701 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term98701, term98701.getClass(), "_annotationIntrospector", null);
        setField(term98701, term98701.getClass(), "_member", null);
        setField(term98701, term98701.getClass(), "_metadata", null);
        setField(term98701, term98701.getClass(), "_fullName", null);
        setField(term98701, term98701.getClass(), "_inclusion", null);
        Object term98702 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term98702, term98702.getClass(), "_annotationIntrospector", null);
        setField(term98702, term98702.getClass(), "_member", null);
        setField(term98702, term98702.getClass(), "_metadata", null);
        setField(term98702, term98702.getClass(), "_fullName", null);
        setField(term98702, term98702.getClass(), "_inclusion", null);
        ArrayList term98696 = new ArrayList();
        ((ArrayList) term98696).add(term98698);
        ((ArrayList) term98696).add(term98699);
        ((ArrayList) term98696).add(term98701);
        ((ArrayList) term98696).add(term98702);
        term98695 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term98695, term98695.getClass(), "_propCollector", null);
        setField(term98695, term98695.getClass(), "_config", null);
        setField(term98695, term98695.getClass(), "_annotationIntrospector", null);
        setField(term98695, term98695.getClass(), "_classInfo", null);
        setField(term98695, term98695.getClass(), "_defaultViews", null);
        setBooleanField(term98695, term98695.getClass(), "_defaultViewsResolved", false);
        setField(term98695, term98695.getClass(), "_properties", term98696);
        setField(term98695, term98695.getClass(), "_objectIdInfo", null);
        setField(term98695, term98695.getClass(), "_type", null);
        term98688 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term97615, args);
        assertTrue(recursiveEquals(term97615, term98695));
        assertTrue(recursiveEquals(retValue, term98688));
    }

};


