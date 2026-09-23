package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class CreatorCollector_init_63953125863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15079;
     Object term15189;
     Object term15284;
     Object term15287;
     Object term15288;

    public CreatorCollector_init_63953125863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14949 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(term14949, term14949.getClass(), "_creators", null);
        setIntField(term14949, term14949.getClass(), "_explicitCreators", 0);
        setBooleanField(term14949, term14949.getClass(), "_hasNonDefaultCreator", false);
        setField(term14949, term14949.getClass(), "_beanDesc", null);
        setBooleanField(term14949, term14949.getClass(), "_canFixAccess", false);
        term15079 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        term15189 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term15189, term15189.getClass(), "_mapperFeatures", -1);
        term15284 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term15285 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term15286 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term15285, term15285.getClass(), "_propCollector", null);
        setField(term15285, term15285.getClass(), "_config", null);
        setField(term15285, term15285.getClass(), "_annotationIntrospector", null);
        setField(term15285, term15285.getClass(), "_classInfo", null);
        setField(term15285, term15285.getClass(), "_bindings", null);
        setField(term15285, term15285.getClass(), "_properties", null);
        setField(term15285, term15285.getClass(), "_objectIdInfo", null);
        setField(term15285, term15285.getClass(), "_type", null);
        setField(term15284, term15284.getClass(), "_beanDesc", term15285);
        setBooleanField(term15284, term15284.getClass(), "_canFixAccess", true);
        setBooleanField(term15284, term15284.getClass(), "_forceAccess", true);
        setField(term15284, term15284.getClass(), "_creators", term15286);
        setIntField(term15284, term15284.getClass(), "_explicitCreators", 0);
        setBooleanField(term15284, term15284.getClass(), "_hasNonDefaultCreator", false);
        setField(term15284, term15284.getClass(), "_delegateArgs", null);
        setField(term15284, term15284.getClass(), "_arrayDelegateArgs", null);
        setField(term15284, term15284.getClass(), "_propertyBasedArgs", null);
        setField(term15284, term15284.getClass(), "_incompleteParameter", null);
        term15287 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term15287, term15287.getClass(), "_problemHandlers", null);
        setField(term15287, term15287.getClass(), "_nodeFactory", null);
        setIntField(term15287, term15287.getClass(), "_deserFeatures", 0);
        setIntField(term15287, term15287.getClass(), "_parserFeatures", 0);
        setIntField(term15287, term15287.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term15287, term15287.getClass(), "_formatReadFeatures", 0);
        setIntField(term15287, term15287.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term15287, term15287.getClass(), "_mixIns", null);
        setField(term15287, term15287.getClass(), "_subtypeResolver", null);
        setField(term15287, term15287.getClass(), "_rootName", null);
        setField(term15287, term15287.getClass(), "_view", null);
        setField(term15287, term15287.getClass(), "_attributes", null);
        setField(term15287, term15287.getClass(), "_rootNames", null);
        setIntField(term15287, term15287.getClass(), "_mapperFeatures", -1);
        setField(term15287, term15287.getClass(), "_base", null);
        term15288 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term15288, term15288.getClass(), "_propCollector", null);
        setField(term15288, term15288.getClass(), "_config", null);
        setField(term15288, term15288.getClass(), "_annotationIntrospector", null);
        setField(term15288, term15288.getClass(), "_classInfo", null);
        setField(term15288, term15288.getClass(), "_bindings", null);
        setField(term15288, term15288.getClass(), "_properties", null);
        setField(term15288, term15288.getClass(), "_objectIdInfo", null);
        setField(term15288, term15288.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term15079;
        args[1] = term15189;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15284));
        assertTrue(recursiveEquals(term15079, term15287));
        assertTrue(recursiveEquals(term15189, term15288));
    }

};


