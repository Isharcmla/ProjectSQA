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

public class BasicBeanDescription_findPropertyFields_1404215125249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99988;
     Object term101065;
     Object term101055;

    public BasicBeanDescription_findPropertyFields_1404215125249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100168 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term100310 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setField(term100310, term100310.getClass(), "value", null);
        setField(term100310, term100310.getClass(), "next", null);
        setField(term100168, term100168.getClass(), "_fields", term100310);
        Object term100438 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term100580 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term100698 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setField(term100580, term100580.getClass(), "value", term100698);
        setField(term100438, term100438.getClass(), "_fields", term100580);
        ArrayList term100040 = new ArrayList();
        ((ArrayList) term100040).add(term100168);
        ((ArrayList) term100040).add(term100438);
        term99988 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term99988, term99988.getClass(), "_properties", term100040);
        Object term101068 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term101069 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        setBooleanField(term101068, term101068.getClass(), "_forSerialization", false);
        setField(term101068, term101068.getClass(), "_config", null);
        setField(term101068, term101068.getClass(), "_annotationIntrospector", null);
        setField(term101068, term101068.getClass(), "_name", null);
        setField(term101068, term101068.getClass(), "_internalName", null);
        setField(term101069, term101069.getClass(), "value", null);
        setField(term101069, term101069.getClass(), "next", null);
        setField(term101069, term101069.getClass(), "name", null);
        setBooleanField(term101069, term101069.getClass(), "isNameExplicit", false);
        setBooleanField(term101069, term101069.getClass(), "isVisible", false);
        setBooleanField(term101069, term101069.getClass(), "isMarkedIgnored", false);
        setField(term101068, term101068.getClass(), "_fields", term101069);
        setField(term101068, term101068.getClass(), "_ctorParameters", null);
        setField(term101068, term101068.getClass(), "_getters", null);
        setField(term101068, term101068.getClass(), "_setters", null);
        setField(term101068, term101068.getClass(), "_metadata", null);
        setField(term101068, term101068.getClass(), "_referenceInfo", null);
        Object term101070 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder"));
        Object term101071 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked"));
        Object term101072 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedField"));
        setBooleanField(term101070, term101070.getClass(), "_forSerialization", false);
        setField(term101070, term101070.getClass(), "_config", null);
        setField(term101070, term101070.getClass(), "_annotationIntrospector", null);
        setField(term101070, term101070.getClass(), "_name", null);
        setField(term101070, term101070.getClass(), "_internalName", null);
        setField(term101072, term101072.getClass(), "_field", null);
        setField(term101072, term101072.getClass(), "_serialization", null);
        setField(term101072, term101072.getClass(), "_typeContext", null);
        setField(term101072, term101072.getClass(), "_annotations", null);
        setField(term101071, term101071.getClass(), "value", term101072);
        setField(term101071, term101071.getClass(), "next", null);
        setField(term101071, term101071.getClass(), "name", null);
        setBooleanField(term101071, term101071.getClass(), "isNameExplicit", false);
        setBooleanField(term101071, term101071.getClass(), "isVisible", false);
        setBooleanField(term101071, term101071.getClass(), "isMarkedIgnored", false);
        setField(term101070, term101070.getClass(), "_fields", term101071);
        setField(term101070, term101070.getClass(), "_ctorParameters", null);
        setField(term101070, term101070.getClass(), "_getters", null);
        setField(term101070, term101070.getClass(), "_setters", null);
        setField(term101070, term101070.getClass(), "_metadata", null);
        setField(term101070, term101070.getClass(), "_referenceInfo", null);
        ArrayList term101066 = new ArrayList();
        ((ArrayList) term101066).add(term101068);
        ((ArrayList) term101066).add(term101070);
        term101065 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term101065, term101065.getClass(), "_propCollector", null);
        setField(term101065, term101065.getClass(), "_config", null);
        setField(term101065, term101065.getClass(), "_annotationIntrospector", null);
        setField(term101065, term101065.getClass(), "_classInfo", null);
        setField(term101065, term101065.getClass(), "_defaultViews", null);
        setBooleanField(term101065, term101065.getClass(), "_defaultViewsResolved", false);
        setField(term101065, term101065.getClass(), "_properties", term101066);
        setField(term101065, term101065.getClass(), "_objectIdInfo", null);
        setField(term101065, term101065.getClass(), "_type", null);
        term101055 = new LinkedHashMap();
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
        Object retValue = callMethod(klass, "_findPropertyFields", argTypes, term99988, args);
        assertTrue(recursiveEquals(term99988, term101065));
        assertTrue(recursiveEquals(retValue, term101055));
    }

};


