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

public class BasicBeanDescription_findPropertyFields_1404215125203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72584;
     Object term72958;
     Object term72951;

    public BasicBeanDescription_findPropertyFields_1404215125203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term72764 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term72906 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term72906, term72906.getClass(), "value", null);
        setField(term72906, term72906.getClass(), "next", null);
        setField(term72764, term72764.getClass(), "_fields", term72906);
        ArrayList term72636 = new ArrayList();
        ((ArrayList) term72636).add(term72764);
        ((ArrayList) term72636).add(term72764);
        term72584 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term72584, term72584.getClass(), "_properties", term72636);
        Object term72961 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term72962 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term72961, term72961.getClass(), "_forSerialization", false);
        setField(term72961, term72961.getClass(), "_config", null);
        setField(term72961, term72961.getClass(), "_annotationIntrospector", null);
        setField(term72961, term72961.getClass(), "_name", null);
        setField(term72961, term72961.getClass(), "_internalName", null);
        setField(term72962, term72962.getClass(), "value", null);
        setField(term72962, term72962.getClass(), "next", null);
        setField(term72962, term72962.getClass(), "name", null);
        setBooleanField(term72962, term72962.getClass(), "isNameExplicit", false);
        setBooleanField(term72962, term72962.getClass(), "isVisible", false);
        setBooleanField(term72962, term72962.getClass(), "isMarkedIgnored", false);
        setField(term72961, term72961.getClass(), "_fields", term72962);
        setField(term72961, term72961.getClass(), "_ctorParameters", null);
        setField(term72961, term72961.getClass(), "_getters", null);
        setField(term72961, term72961.getClass(), "_setters", null);
        setField(term72961, term72961.getClass(), "_metadata", null);
        setField(term72961, term72961.getClass(), "_referenceInfo", null);
        ArrayList term72959 = new ArrayList();
        ((ArrayList) term72959).add(term72961);
        ((ArrayList) term72959).add(term72961);
        term72958 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term72958, term72958.getClass(), "_propCollector", null);
        setField(term72958, term72958.getClass(), "_config", null);
        setField(term72958, term72958.getClass(), "_annotationIntrospector", null);
        setField(term72958, term72958.getClass(), "_classInfo", null);
        setField(term72958, term72958.getClass(), "_defaultViews", null);
        setBooleanField(term72958, term72958.getClass(), "_defaultViewsResolved", false);
        setField(term72958, term72958.getClass(), "_properties", term72959);
        setField(term72958, term72958.getClass(), "_objectIdInfo", null);
        setField(term72958, term72958.getClass(), "_type", null);
        term72951 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term72584, args);
        assertTrue(recursiveEquals(term72584, term72958));
        assertTrue(recursiveEquals(retValue, term72951));
    }

};


