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
import java.util.LinkedHashMap;

public class BasicBeanDescription_findPropertyFields_1404215125102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13343;
     Object term14125;
     Object term14118;

    public BasicBeanDescription_findPropertyFields_1404215125102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13395 = new ArrayList();
        term13343 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term13343, term13343.getClass(), "_properties", term13395);
        ArrayList term14126 = new ArrayList();
        term14125 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term14125, term14125.getClass(), "_propCollector", null);
        setField(term14125, term14125.getClass(), "_config", null);
        setField(term14125, term14125.getClass(), "_annotationIntrospector", null);
        setField(term14125, term14125.getClass(), "_classInfo", null);
        setField(term14125, term14125.getClass(), "_defaultViews", null);
        setBooleanField(term14125, term14125.getClass(), "_defaultViewsResolved", false);
        setField(term14125, term14125.getClass(), "_properties", term14126);
        setField(term14125, term14125.getClass(), "_objectIdInfo", null);
        setField(term14125, term14125.getClass(), "_type", null);
        term14118 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term13343, args);
        assertTrue(recursiveEquals(term13343, term14125));
        assertTrue(recursiveEquals(retValue, term14118));
    }

};


