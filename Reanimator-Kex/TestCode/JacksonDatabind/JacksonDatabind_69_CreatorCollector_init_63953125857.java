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

public class CreatorCollector_init_63953125857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10967;
     Object term11073;
     Object term11168;
     Object term11171;
     Object term11172;

    public CreatorCollector_init_63953125857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10772 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object[] term10484 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 0);
        term10967 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term10772, term10772.getClass(), "_creators", term10484);
        setIntField(term10772, term10772.getClass(), "_explicitCreators", 0);
        setBooleanField(term10772, term10772.getClass(), "_hasNonDefaultCreator", false);
        setField(term10772, term10772.getClass(), "_beanDesc", term10967);
        setBooleanField(term10772, term10772.getClass(), "_canFixAccess", false);
        term11073 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term11073, term11073.getClass(), "_mapperFeatures", -1);
        term11168 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term11169 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term11170 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term11169, term11169.getClass(), "_propCollector", null);
        setField(term11169, term11169.getClass(), "_config", null);
        setField(term11169, term11169.getClass(), "_annotationIntrospector", null);
        setField(term11169, term11169.getClass(), "_classInfo", null);
        setField(term11169, term11169.getClass(), "_bindings", null);
        setField(term11169, term11169.getClass(), "_properties", null);
        setField(term11169, term11169.getClass(), "_objectIdInfo", null);
        setField(term11169, term11169.getClass(), "_type", null);
        setField(term11168, term11168.getClass(), "_beanDesc", term11169);
        setBooleanField(term11168, term11168.getClass(), "_canFixAccess", true);
        setBooleanField(term11168, term11168.getClass(), "_forceAccess", true);
        setField(term11168, term11168.getClass(), "_creators", term11170);
        setIntField(term11168, term11168.getClass(), "_explicitCreators", 0);
        setBooleanField(term11168, term11168.getClass(), "_hasNonDefaultCreator", false);
        setField(term11168, term11168.getClass(), "_delegateArgs", null);
        setField(term11168, term11168.getClass(), "_arrayDelegateArgs", null);
        setField(term11168, term11168.getClass(), "_propertyBasedArgs", null);
        setField(term11168, term11168.getClass(), "_incompleteParameter", null);
        term11171 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term11171, term11171.getClass(), "_filterProvider", null);
        setField(term11171, term11171.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term11171, term11171.getClass(), "_serFeatures", 0);
        setIntField(term11171, term11171.getClass(), "_generatorFeatures", 0);
        setIntField(term11171, term11171.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term11171, term11171.getClass(), "_formatWriteFeatures", 0);
        setIntField(term11171, term11171.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term11171, term11171.getClass(), "_serializationInclusion", null);
        setField(term11171, term11171.getClass(), "_mixIns", null);
        setField(term11171, term11171.getClass(), "_subtypeResolver", null);
        setField(term11171, term11171.getClass(), "_rootName", null);
        setField(term11171, term11171.getClass(), "_view", null);
        setField(term11171, term11171.getClass(), "_attributes", null);
        setField(term11171, term11171.getClass(), "_rootNames", null);
        setIntField(term11171, term11171.getClass(), "_mapperFeatures", -1);
        setField(term11171, term11171.getClass(), "_base", null);
        term11172 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term11172, term11172.getClass(), "_propCollector", null);
        setField(term11172, term11172.getClass(), "_config", null);
        setField(term11172, term11172.getClass(), "_annotationIntrospector", null);
        setField(term11172, term11172.getClass(), "_classInfo", null);
        setField(term11172, term11172.getClass(), "_bindings", null);
        setField(term11172, term11172.getClass(), "_properties", null);
        setField(term11172, term11172.getClass(), "_objectIdInfo", null);
        setField(term11172, term11172.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term10967;
        args[1] = term11073;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11168));
        assertTrue(recursiveEquals(term10967, term11171));
        assertTrue(recursiveEquals(term11073, term11172));
    }

};


