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

public class BasicBeanDescription_findPropertyFields_1404215125313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147122;
     Object term147884;
     Object term147962;
     Object term147970;
     Object term147948;

    public BasicBeanDescription_findPropertyFields_1404215125313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term147302 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term147444 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term147444, term147444.getClass(), "value", null);
        setField(term147444, term147444.getClass(), "next", null);
        setField(term147302, term147302.getClass(), "_fields", term147444);
        Object term147572 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term147714 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term147832 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term147714, term147714.getClass(), "value", term147832);
        setField(term147714, term147714.getClass(), "next", null);
        setField(term147572, term147572.getClass(), "_fields", term147714);
        setField(term147572, term147572.getClass(), "_name", null);
        ArrayList term147174 = new ArrayList();
        ((ArrayList) term147174).add(term147302);
        ((ArrayList) term147174).add(term147572);
        term147122 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term147122, term147122.getClass(), "_properties", term147174);
        term147884 = new ArrayList();
        Object term147965 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term147966 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term147965, term147965.getClass(), "_forSerialization", false);
        setField(term147965, term147965.getClass(), "_config", null);
        setField(term147965, term147965.getClass(), "_annotationIntrospector", null);
        setField(term147965, term147965.getClass(), "_name", null);
        setField(term147965, term147965.getClass(), "_internalName", null);
        setField(term147966, term147966.getClass(), "value", null);
        setField(term147966, term147966.getClass(), "next", null);
        setField(term147966, term147966.getClass(), "name", null);
        setBooleanField(term147966, term147966.getClass(), "isNameExplicit", false);
        setBooleanField(term147966, term147966.getClass(), "isVisible", false);
        setBooleanField(term147966, term147966.getClass(), "isMarkedIgnored", false);
        setField(term147965, term147965.getClass(), "_fields", term147966);
        setField(term147965, term147965.getClass(), "_ctorParameters", null);
        setField(term147965, term147965.getClass(), "_getters", null);
        setField(term147965, term147965.getClass(), "_setters", null);
        setField(term147965, term147965.getClass(), "_metadata", null);
        setField(term147965, term147965.getClass(), "_referenceInfo", null);
        Object term147967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term147968 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term147969 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term147967, term147967.getClass(), "_forSerialization", false);
        setField(term147967, term147967.getClass(), "_config", null);
        setField(term147967, term147967.getClass(), "_annotationIntrospector", null);
        setField(term147967, term147967.getClass(), "_name", null);
        setField(term147967, term147967.getClass(), "_internalName", null);
        setField(term147969, term147969.getClass(), "_field", null);
        setField(term147969, term147969.getClass(), "_serialization", null);
        setField(term147969, term147969.getClass(), "_typeContext", null);
        setField(term147969, term147969.getClass(), "_annotations", null);
        setField(term147968, term147968.getClass(), "value", term147969);
        setField(term147968, term147968.getClass(), "next", null);
        setField(term147968, term147968.getClass(), "name", null);
        setBooleanField(term147968, term147968.getClass(), "isNameExplicit", false);
        setBooleanField(term147968, term147968.getClass(), "isVisible", false);
        setBooleanField(term147968, term147968.getClass(), "isMarkedIgnored", false);
        setField(term147967, term147967.getClass(), "_fields", term147968);
        setField(term147967, term147967.getClass(), "_ctorParameters", null);
        setField(term147967, term147967.getClass(), "_getters", null);
        setField(term147967, term147967.getClass(), "_setters", null);
        setField(term147967, term147967.getClass(), "_metadata", null);
        setField(term147967, term147967.getClass(), "_referenceInfo", null);
        ArrayList term147963 = new ArrayList();
        ((ArrayList) term147963).add(term147965);
        ((ArrayList) term147963).add(term147967);
        term147962 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term147962, term147962.getClass(), "_propCollector", null);
        setField(term147962, term147962.getClass(), "_config", null);
        setField(term147962, term147962.getClass(), "_annotationIntrospector", null);
        setField(term147962, term147962.getClass(), "_classInfo", null);
        setField(term147962, term147962.getClass(), "_defaultViews", null);
        setBooleanField(term147962, term147962.getClass(), "_defaultViewsResolved", false);
        setField(term147962, term147962.getClass(), "_properties", term147963);
        setField(term147962, term147962.getClass(), "_objectIdInfo", null);
        setField(term147962, term147962.getClass(), "_type", null);
        term147970 = new ArrayList();
        term147948 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Collection");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term147884;
        args[1] = false;
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term147122, args);
        assertTrue(recursiveEquals(term147122, term147962));
        assertTrue(recursiveEquals(term147884, term147970));
        assertTrue(recursiveEquals(retValue, term147948));
    }

};


