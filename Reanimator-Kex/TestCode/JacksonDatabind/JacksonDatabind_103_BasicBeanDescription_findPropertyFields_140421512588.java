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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.introspect.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class BasicBeanDescription_findPropertyFields_140421512588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58;
     Object term60;

    public BasicBeanDescription_findPropertyFields_140421512588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term58, term58.getClass(), "_propCollector", null);
        setField(term58, term58.getClass(), "_config", null);
        setField(term58, term58.getClass(), "_annotationIntrospector", null);
        setField(term58, term58.getClass(), "_classInfo", null);
        setField(term58, term58.getClass(), "_defaultViews", null);
        setBooleanField(term58, term58.getClass(), "_defaultViewsResolved", false);
        setField(term58, term58.getClass(), "_properties", null);
        setField(term58, term58.getClass(), "_objectIdInfo", null);
        setField(term58, term58.getClass(), "_type", null);
        term60 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60;
        try {
            callMethod(klass, "_findPropertyFields", argTypes, term58, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


