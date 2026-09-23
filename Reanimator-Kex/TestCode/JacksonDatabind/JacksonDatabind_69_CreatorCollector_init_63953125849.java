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

public class CreatorCollector_init_63953125849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6439;
     Object term6545;
     Object term6640;
     Object term6643;
     Object term6644;

    public CreatorCollector_init_63953125849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6179 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object[] term6042 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 0);
        Object term6309 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term6179, term6179.getClass(), "_creators", term6042);
        setIntField(term6179, term6179.getClass(), "_explicitCreators", 0);
        setBooleanField(term6179, term6179.getClass(), "_hasNonDefaultCreator", false);
        setField(term6179, term6179.getClass(), "_beanDesc", term6309);
        term6439 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        term6545 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term6640 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term6641 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term6642 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term6641, term6641.getClass(), "_propCollector", null);
        setField(term6641, term6641.getClass(), "_config", null);
        setField(term6641, term6641.getClass(), "_annotationIntrospector", null);
        setField(term6641, term6641.getClass(), "_classInfo", null);
        setField(term6641, term6641.getClass(), "_bindings", null);
        setField(term6641, term6641.getClass(), "_properties", null);
        setField(term6641, term6641.getClass(), "_objectIdInfo", null);
        setField(term6641, term6641.getClass(), "_type", null);
        setField(term6640, term6640.getClass(), "_beanDesc", term6641);
        setBooleanField(term6640, term6640.getClass(), "_canFixAccess", false);
        setBooleanField(term6640, term6640.getClass(), "_forceAccess", false);
        setField(term6640, term6640.getClass(), "_creators", term6642);
        setIntField(term6640, term6640.getClass(), "_explicitCreators", 0);
        setBooleanField(term6640, term6640.getClass(), "_hasNonDefaultCreator", false);
        setField(term6640, term6640.getClass(), "_delegateArgs", null);
        setField(term6640, term6640.getClass(), "_arrayDelegateArgs", null);
        setField(term6640, term6640.getClass(), "_propertyBasedArgs", null);
        setField(term6640, term6640.getClass(), "_incompleteParameter", null);
        term6643 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term6643, term6643.getClass(), "_filterProvider", null);
        setField(term6643, term6643.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term6643, term6643.getClass(), "_serFeatures", 0);
        setIntField(term6643, term6643.getClass(), "_generatorFeatures", 0);
        setIntField(term6643, term6643.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term6643, term6643.getClass(), "_formatWriteFeatures", 0);
        setIntField(term6643, term6643.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term6643, term6643.getClass(), "_serializationInclusion", null);
        setField(term6643, term6643.getClass(), "_mixIns", null);
        setField(term6643, term6643.getClass(), "_subtypeResolver", null);
        setField(term6643, term6643.getClass(), "_rootName", null);
        setField(term6643, term6643.getClass(), "_view", null);
        setField(term6643, term6643.getClass(), "_attributes", null);
        setField(term6643, term6643.getClass(), "_rootNames", null);
        setIntField(term6643, term6643.getClass(), "_mapperFeatures", 0);
        setField(term6643, term6643.getClass(), "_base", null);
        term6644 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term6644, term6644.getClass(), "_propCollector", null);
        setField(term6644, term6644.getClass(), "_config", null);
        setField(term6644, term6644.getClass(), "_annotationIntrospector", null);
        setField(term6644, term6644.getClass(), "_classInfo", null);
        setField(term6644, term6644.getClass(), "_bindings", null);
        setField(term6644, term6644.getClass(), "_properties", null);
        setField(term6644, term6644.getClass(), "_objectIdInfo", null);
        setField(term6644, term6644.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term6439;
        args[1] = term6545;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6640));
        assertTrue(recursiveEquals(term6439, term6643));
        assertTrue(recursiveEquals(term6545, term6644));
    }

};


