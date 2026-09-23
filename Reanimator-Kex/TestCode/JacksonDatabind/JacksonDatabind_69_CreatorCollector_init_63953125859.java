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

public class CreatorCollector_init_63953125859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12363;
     Object term12473;
     Object term12568;
     Object term12571;
     Object term12572;

    public CreatorCollector_init_63953125859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12233 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object[] term11955 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 0);
        setField(term12233, term12233.getClass(), "_creators", term11955);
        setIntField(term12233, term12233.getClass(), "_explicitCreators", 0);
        setBooleanField(term12233, term12233.getClass(), "_hasNonDefaultCreator", false);
        setField(term12233, term12233.getClass(), "_beanDesc", null);
        term12363 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        term12473 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term12473, term12473.getClass(), "_mapperFeatures", -1);
        term12568 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term12569 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term12570 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term12569, term12569.getClass(), "_propCollector", null);
        setField(term12569, term12569.getClass(), "_config", null);
        setField(term12569, term12569.getClass(), "_annotationIntrospector", null);
        setField(term12569, term12569.getClass(), "_classInfo", null);
        setField(term12569, term12569.getClass(), "_bindings", null);
        setField(term12569, term12569.getClass(), "_properties", null);
        setField(term12569, term12569.getClass(), "_objectIdInfo", null);
        setField(term12569, term12569.getClass(), "_type", null);
        setField(term12568, term12568.getClass(), "_beanDesc", term12569);
        setBooleanField(term12568, term12568.getClass(), "_canFixAccess", true);
        setBooleanField(term12568, term12568.getClass(), "_forceAccess", true);
        setField(term12568, term12568.getClass(), "_creators", term12570);
        setIntField(term12568, term12568.getClass(), "_explicitCreators", 0);
        setBooleanField(term12568, term12568.getClass(), "_hasNonDefaultCreator", false);
        setField(term12568, term12568.getClass(), "_delegateArgs", null);
        setField(term12568, term12568.getClass(), "_arrayDelegateArgs", null);
        setField(term12568, term12568.getClass(), "_propertyBasedArgs", null);
        setField(term12568, term12568.getClass(), "_incompleteParameter", null);
        term12571 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term12571, term12571.getClass(), "_problemHandlers", null);
        setField(term12571, term12571.getClass(), "_nodeFactory", null);
        setIntField(term12571, term12571.getClass(), "_deserFeatures", 0);
        setIntField(term12571, term12571.getClass(), "_parserFeatures", 0);
        setIntField(term12571, term12571.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term12571, term12571.getClass(), "_formatReadFeatures", 0);
        setIntField(term12571, term12571.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term12571, term12571.getClass(), "_mixIns", null);
        setField(term12571, term12571.getClass(), "_subtypeResolver", null);
        setField(term12571, term12571.getClass(), "_rootName", null);
        setField(term12571, term12571.getClass(), "_view", null);
        setField(term12571, term12571.getClass(), "_attributes", null);
        setField(term12571, term12571.getClass(), "_rootNames", null);
        setIntField(term12571, term12571.getClass(), "_mapperFeatures", -1);
        setField(term12571, term12571.getClass(), "_base", null);
        term12572 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term12572, term12572.getClass(), "_propCollector", null);
        setField(term12572, term12572.getClass(), "_config", null);
        setField(term12572, term12572.getClass(), "_annotationIntrospector", null);
        setField(term12572, term12572.getClass(), "_classInfo", null);
        setField(term12572, term12572.getClass(), "_bindings", null);
        setField(term12572, term12572.getClass(), "_properties", null);
        setField(term12572, term12572.getClass(), "_objectIdInfo", null);
        setField(term12572, term12572.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term12363;
        args[1] = term12473;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12568));
        assertTrue(recursiveEquals(term12363, term12571));
        assertTrue(recursiveEquals(term12473, term12572));
    }

};


