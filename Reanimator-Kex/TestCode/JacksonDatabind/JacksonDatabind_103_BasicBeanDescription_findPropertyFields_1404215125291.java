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

public class BasicBeanDescription_findPropertyFields_1404215125291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131693;
     Object term132042;
     Object term132035;

    public BasicBeanDescription_findPropertyFields_1404215125291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term131873 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setField(term131873, term131873.getClass(), "_fields", null);
        Object term132007 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term132007, term132007.getClass(), "_member", null);
        ArrayList term131745 = new ArrayList();
        ((ArrayList) term131745).add(term131873);
        ((ArrayList) term131745).add(term132007);
        term131693 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term131693, term131693.getClass(), "_properties", term131745);
        Object term132045 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        setBooleanField(term132045, term132045.getClass(), "_forSerialization", false);
        setField(term132045, term132045.getClass(), "_config", null);
        setField(term132045, term132045.getClass(), "_annotationIntrospector", null);
        setField(term132045, term132045.getClass(), "_name", null);
        setField(term132045, term132045.getClass(), "_internalName", null);
        setField(term132045, term132045.getClass(), "_fields", null);
        setField(term132045, term132045.getClass(), "_ctorParameters", null);
        setField(term132045, term132045.getClass(), "_getters", null);
        setField(term132045, term132045.getClass(), "_setters", null);
        setField(term132045, term132045.getClass(), "_metadata", null);
        setField(term132045, term132045.getClass(), "_referenceInfo", null);
        Object term132046 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition"));
        setField(term132046, term132046.getClass(), "_annotationIntrospector", null);
        setField(term132046, term132046.getClass(), "_member", null);
        setField(term132046, term132046.getClass(), "_metadata", null);
        setField(term132046, term132046.getClass(), "_fullName", null);
        setField(term132046, term132046.getClass(), "_inclusion", null);
        ArrayList term132043 = new ArrayList();
        ((ArrayList) term132043).add(term132045);
        ((ArrayList) term132043).add(term132046);
        term132042 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term132042, term132042.getClass(), "_propCollector", null);
        setField(term132042, term132042.getClass(), "_config", null);
        setField(term132042, term132042.getClass(), "_annotationIntrospector", null);
        setField(term132042, term132042.getClass(), "_classInfo", null);
        setField(term132042, term132042.getClass(), "_defaultViews", null);
        setBooleanField(term132042, term132042.getClass(), "_defaultViewsResolved", false);
        setField(term132042, term132042.getClass(), "_properties", term132043);
        setField(term132042, term132042.getClass(), "_objectIdInfo", null);
        setField(term132042, term132042.getClass(), "_type", null);
        term132035 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term131693, args);
        assertTrue(recursiveEquals(term131693, term132042));
        assertTrue(recursiveEquals(retValue, term132035));
    }

};


