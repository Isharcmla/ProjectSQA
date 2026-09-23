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

public class CreatorCollector_init_63953125853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8348;
     Object term8458;
     Object term8553;
     Object term8556;
     Object term8557;

    public CreatorCollector_init_63953125853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8088 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term8218 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term8088, term8088.getClass(), "_creators", null);
        setIntField(term8088, term8088.getClass(), "_explicitCreators", 0);
        setBooleanField(term8088, term8088.getClass(), "_hasNonDefaultCreator", false);
        setField(term8088, term8088.getClass(), "_beanDesc", term8218);
        term8348 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        term8458 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term8553 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term8554 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term8555 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term8554, term8554.getClass(), "_propCollector", null);
        setField(term8554, term8554.getClass(), "_config", null);
        setField(term8554, term8554.getClass(), "_annotationIntrospector", null);
        setField(term8554, term8554.getClass(), "_classInfo", null);
        setField(term8554, term8554.getClass(), "_bindings", null);
        setField(term8554, term8554.getClass(), "_properties", null);
        setField(term8554, term8554.getClass(), "_objectIdInfo", null);
        setField(term8554, term8554.getClass(), "_type", null);
        setField(term8553, term8553.getClass(), "_beanDesc", term8554);
        setBooleanField(term8553, term8553.getClass(), "_canFixAccess", false);
        setBooleanField(term8553, term8553.getClass(), "_forceAccess", false);
        setField(term8553, term8553.getClass(), "_creators", term8555);
        setIntField(term8553, term8553.getClass(), "_explicitCreators", 0);
        setBooleanField(term8553, term8553.getClass(), "_hasNonDefaultCreator", false);
        setField(term8553, term8553.getClass(), "_delegateArgs", null);
        setField(term8553, term8553.getClass(), "_arrayDelegateArgs", null);
        setField(term8553, term8553.getClass(), "_propertyBasedArgs", null);
        setField(term8553, term8553.getClass(), "_incompleteParameter", null);
        term8556 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term8556, term8556.getClass(), "_problemHandlers", null);
        setField(term8556, term8556.getClass(), "_nodeFactory", null);
        setIntField(term8556, term8556.getClass(), "_deserFeatures", 0);
        setIntField(term8556, term8556.getClass(), "_parserFeatures", 0);
        setIntField(term8556, term8556.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term8556, term8556.getClass(), "_formatReadFeatures", 0);
        setIntField(term8556, term8556.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term8556, term8556.getClass(), "_mixIns", null);
        setField(term8556, term8556.getClass(), "_subtypeResolver", null);
        setField(term8556, term8556.getClass(), "_rootName", null);
        setField(term8556, term8556.getClass(), "_view", null);
        setField(term8556, term8556.getClass(), "_attributes", null);
        setField(term8556, term8556.getClass(), "_rootNames", null);
        setIntField(term8556, term8556.getClass(), "_mapperFeatures", 0);
        setField(term8556, term8556.getClass(), "_base", null);
        term8557 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term8557, term8557.getClass(), "_propCollector", null);
        setField(term8557, term8557.getClass(), "_config", null);
        setField(term8557, term8557.getClass(), "_annotationIntrospector", null);
        setField(term8557, term8557.getClass(), "_classInfo", null);
        setField(term8557, term8557.getClass(), "_bindings", null);
        setField(term8557, term8557.getClass(), "_properties", null);
        setField(term8557, term8557.getClass(), "_objectIdInfo", null);
        setField(term8557, term8557.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term8348;
        args[1] = term8458;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8553));
        assertTrue(recursiveEquals(term8348, term8556));
        assertTrue(recursiveEquals(term8458, term8557));
    }

};


