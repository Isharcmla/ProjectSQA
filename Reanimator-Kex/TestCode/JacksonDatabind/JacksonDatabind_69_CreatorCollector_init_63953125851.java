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

public class CreatorCollector_init_63953125851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7739;
     Object term7845;
     Object term7940;
     Object term7943;
     Object term7944;

    public CreatorCollector_init_63953125851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7609 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        setField(term7609, term7609.getClass(), "_creators", null);
        setIntField(term7609, term7609.getClass(), "_explicitCreators", 0);
        setBooleanField(term7609, term7609.getClass(), "_hasNonDefaultCreator", false);
        setField(term7609, term7609.getClass(), "_beanDesc", null);
        setBooleanField(term7609, term7609.getClass(), "_canFixAccess", false);
        term7739 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        term7845 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term7845, term7845.getClass(), "_mapperFeatures", -1);
        term7940 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term7941 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term7942 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term7941, term7941.getClass(), "_propCollector", null);
        setField(term7941, term7941.getClass(), "_config", null);
        setField(term7941, term7941.getClass(), "_annotationIntrospector", null);
        setField(term7941, term7941.getClass(), "_classInfo", null);
        setField(term7941, term7941.getClass(), "_bindings", null);
        setField(term7941, term7941.getClass(), "_properties", null);
        setField(term7941, term7941.getClass(), "_objectIdInfo", null);
        setField(term7941, term7941.getClass(), "_type", null);
        setField(term7940, term7940.getClass(), "_beanDesc", term7941);
        setBooleanField(term7940, term7940.getClass(), "_canFixAccess", true);
        setBooleanField(term7940, term7940.getClass(), "_forceAccess", true);
        setField(term7940, term7940.getClass(), "_creators", term7942);
        setIntField(term7940, term7940.getClass(), "_explicitCreators", 0);
        setBooleanField(term7940, term7940.getClass(), "_hasNonDefaultCreator", false);
        setField(term7940, term7940.getClass(), "_delegateArgs", null);
        setField(term7940, term7940.getClass(), "_arrayDelegateArgs", null);
        setField(term7940, term7940.getClass(), "_propertyBasedArgs", null);
        setField(term7940, term7940.getClass(), "_incompleteParameter", null);
        term7943 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term7943, term7943.getClass(), "_filterProvider", null);
        setField(term7943, term7943.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term7943, term7943.getClass(), "_serFeatures", 0);
        setIntField(term7943, term7943.getClass(), "_generatorFeatures", 0);
        setIntField(term7943, term7943.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term7943, term7943.getClass(), "_formatWriteFeatures", 0);
        setIntField(term7943, term7943.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term7943, term7943.getClass(), "_serializationInclusion", null);
        setField(term7943, term7943.getClass(), "_mixIns", null);
        setField(term7943, term7943.getClass(), "_subtypeResolver", null);
        setField(term7943, term7943.getClass(), "_rootName", null);
        setField(term7943, term7943.getClass(), "_view", null);
        setField(term7943, term7943.getClass(), "_attributes", null);
        setField(term7943, term7943.getClass(), "_rootNames", null);
        setIntField(term7943, term7943.getClass(), "_mapperFeatures", -1);
        setField(term7943, term7943.getClass(), "_base", null);
        term7944 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term7944, term7944.getClass(), "_propCollector", null);
        setField(term7944, term7944.getClass(), "_config", null);
        setField(term7944, term7944.getClass(), "_annotationIntrospector", null);
        setField(term7944, term7944.getClass(), "_classInfo", null);
        setField(term7944, term7944.getClass(), "_bindings", null);
        setField(term7944, term7944.getClass(), "_properties", null);
        setField(term7944, term7944.getClass(), "_objectIdInfo", null);
        setField(term7944, term7944.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term7739;
        args[1] = term7845;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7940));
        assertTrue(recursiveEquals(term7739, term7943));
        assertTrue(recursiveEquals(term7845, term7944));
    }

};


