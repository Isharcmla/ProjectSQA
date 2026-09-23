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
import java.lang.Object;

public class BasicBeanDescription_forDeserialization_1621471498147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35493;
     Object term35649;
     Object term35644;

    public BasicBeanDescription_forDeserialization_1621471498147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35493 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term35637 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term35493, term35493.getClass(), "_type", null);
        setField(term35493, term35493.getClass(), "_classDef", null);
        setField(term35493, term35493.getClass(), "_config", null);
        setField(term35493, term35493.getClass(), "_annotationIntrospector", term35637);
        term35649 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term35650 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term35649, term35649.getClass(), "_config", null);
        setBooleanField(term35649, term35649.getClass(), "_forSerialization", false);
        setBooleanField(term35649, term35649.getClass(), "_stdBeanNaming", false);
        setField(term35649, term35649.getClass(), "_type", null);
        setField(term35649, term35649.getClass(), "_classDef", null);
        setField(term35649, term35649.getClass(), "_visibilityChecker", null);
        setField(term35649, term35649.getClass(), "_annotationIntrospector", term35650);
        setBooleanField(term35649, term35649.getClass(), "_useAnnotations", false);
        setField(term35649, term35649.getClass(), "_mutatorPrefix", null);
        setBooleanField(term35649, term35649.getClass(), "_collected", false);
        setField(term35649, term35649.getClass(), "_properties", null);
        setField(term35649, term35649.getClass(), "_creatorProperties", null);
        setField(term35649, term35649.getClass(), "_anyGetters", null);
        setField(term35649, term35649.getClass(), "_anySetters", null);
        setField(term35649, term35649.getClass(), "_anySetterField", null);
        setField(term35649, term35649.getClass(), "_jsonValueAccessors", null);
        setField(term35649, term35649.getClass(), "_ignoredPropertyNames", null);
        setField(term35649, term35649.getClass(), "_injectables", null);
        term35644 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term35638 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector"));
        Object term35641 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term35638, term35638.getClass(), "_config", null);
        setBooleanField(term35638, term35638.getClass(), "_forSerialization", false);
        setBooleanField(term35638, term35638.getClass(), "_stdBeanNaming", false);
        setField(term35638, term35638.getClass(), "_type", null);
        setField(term35638, term35638.getClass(), "_classDef", null);
        setField(term35638, term35638.getClass(), "_visibilityChecker", null);
        setField(term35638, term35638.getClass(), "_annotationIntrospector", term35641);
        setBooleanField(term35638, term35638.getClass(), "_useAnnotations", false);
        setField(term35638, term35638.getClass(), "_mutatorPrefix", null);
        setBooleanField(term35638, term35638.getClass(), "_collected", false);
        setField(term35638, term35638.getClass(), "_properties", null);
        setField(term35638, term35638.getClass(), "_creatorProperties", null);
        setField(term35638, term35638.getClass(), "_anyGetters", null);
        setField(term35638, term35638.getClass(), "_anySetters", null);
        setField(term35638, term35638.getClass(), "_anySetterField", null);
        setField(term35638, term35638.getClass(), "_jsonValueAccessors", null);
        setField(term35638, term35638.getClass(), "_ignoredPropertyNames", null);
        setField(term35638, term35638.getClass(), "_injectables", null);
        setField(term35644, term35644.getClass(), "_propCollector", term35638);
        setField(term35644, term35644.getClass(), "_config", null);
        setField(term35644, term35644.getClass(), "_annotationIntrospector", null);
        setField(term35644, term35644.getClass(), "_classInfo", null);
        setField(term35644, term35644.getClass(), "_defaultViews", null);
        setBooleanField(term35644, term35644.getClass(), "_defaultViewsResolved", false);
        setField(term35644, term35644.getClass(), "_properties", null);
        setField(term35644, term35644.getClass(), "_objectIdInfo", null);
        setField(term35644, term35644.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector");
        Object[] args = new Object[1];
        args[0] = term35493;
        Object retValue = callMethod(klass, "forDeserialization", argTypes, null, args);
        assertTrue(recursiveEquals(term35493, term35649));
        assertTrue(recursiveEquals(retValue, term35644));
    }

};


