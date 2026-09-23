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

public class CreatorCollector_init_63953125855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9622;
     Object term9728;
     Object term9823;
     Object term9826;
     Object term9827;

    public CreatorCollector_init_63953125855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9492 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object[] term9214 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 0);
        setField(term9492, term9492.getClass(), "_creators", term9214);
        setIntField(term9492, term9492.getClass(), "_explicitCreators", 0);
        setBooleanField(term9492, term9492.getClass(), "_hasNonDefaultCreator", false);
        setField(term9492, term9492.getClass(), "_beanDesc", null);
        term9622 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        term9728 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setIntField(term9728, term9728.getClass(), "_mapperFeatures", -1);
        term9823 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term9824 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term9825 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term9824, term9824.getClass(), "_propCollector", null);
        setField(term9824, term9824.getClass(), "_config", null);
        setField(term9824, term9824.getClass(), "_annotationIntrospector", null);
        setField(term9824, term9824.getClass(), "_classInfo", null);
        setField(term9824, term9824.getClass(), "_bindings", null);
        setField(term9824, term9824.getClass(), "_properties", null);
        setField(term9824, term9824.getClass(), "_objectIdInfo", null);
        setField(term9824, term9824.getClass(), "_type", null);
        setField(term9823, term9823.getClass(), "_beanDesc", term9824);
        setBooleanField(term9823, term9823.getClass(), "_canFixAccess", true);
        setBooleanField(term9823, term9823.getClass(), "_forceAccess", true);
        setField(term9823, term9823.getClass(), "_creators", term9825);
        setIntField(term9823, term9823.getClass(), "_explicitCreators", 0);
        setBooleanField(term9823, term9823.getClass(), "_hasNonDefaultCreator", false);
        setField(term9823, term9823.getClass(), "_delegateArgs", null);
        setField(term9823, term9823.getClass(), "_arrayDelegateArgs", null);
        setField(term9823, term9823.getClass(), "_propertyBasedArgs", null);
        setField(term9823, term9823.getClass(), "_incompleteParameter", null);
        term9826 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term9826, term9826.getClass(), "_filterProvider", null);
        setField(term9826, term9826.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term9826, term9826.getClass(), "_serFeatures", 0);
        setIntField(term9826, term9826.getClass(), "_generatorFeatures", 0);
        setIntField(term9826, term9826.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term9826, term9826.getClass(), "_formatWriteFeatures", 0);
        setIntField(term9826, term9826.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term9826, term9826.getClass(), "_serializationInclusion", null);
        setField(term9826, term9826.getClass(), "_mixIns", null);
        setField(term9826, term9826.getClass(), "_subtypeResolver", null);
        setField(term9826, term9826.getClass(), "_rootName", null);
        setField(term9826, term9826.getClass(), "_view", null);
        setField(term9826, term9826.getClass(), "_attributes", null);
        setField(term9826, term9826.getClass(), "_rootNames", null);
        setIntField(term9826, term9826.getClass(), "_mapperFeatures", -1);
        setField(term9826, term9826.getClass(), "_base", null);
        term9827 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term9827, term9827.getClass(), "_propCollector", null);
        setField(term9827, term9827.getClass(), "_config", null);
        setField(term9827, term9827.getClass(), "_annotationIntrospector", null);
        setField(term9827, term9827.getClass(), "_classInfo", null);
        setField(term9827, term9827.getClass(), "_bindings", null);
        setField(term9827, term9827.getClass(), "_properties", null);
        setField(term9827, term9827.getClass(), "_objectIdInfo", null);
        setField(term9827, term9827.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term9622;
        args[1] = term9728;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9823));
        assertTrue(recursiveEquals(term9622, term9826));
        assertTrue(recursiveEquals(term9728, term9827));
    }

};


