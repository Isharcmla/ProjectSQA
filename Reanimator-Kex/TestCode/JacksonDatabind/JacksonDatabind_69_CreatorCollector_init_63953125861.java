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

public class CreatorCollector_init_63953125861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13712;
     Object term13822;
     Object term13917;
     Object term13920;
     Object term13921;

    public CreatorCollector_init_63953125861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13517 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object[] term13229 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 0);
        term13712 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term13517, term13517.getClass(), "_creators", term13229);
        setIntField(term13517, term13517.getClass(), "_explicitCreators", 0);
        setBooleanField(term13517, term13517.getClass(), "_hasNonDefaultCreator", false);
        setField(term13517, term13517.getClass(), "_beanDesc", term13712);
        setBooleanField(term13517, term13517.getClass(), "_canFixAccess", false);
        term13822 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setIntField(term13822, term13822.getClass(), "_mapperFeatures", -1);
        term13917 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object term13918 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object[] term13919 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 9);
        setField(term13918, term13918.getClass(), "_propCollector", null);
        setField(term13918, term13918.getClass(), "_config", null);
        setField(term13918, term13918.getClass(), "_annotationIntrospector", null);
        setField(term13918, term13918.getClass(), "_classInfo", null);
        setField(term13918, term13918.getClass(), "_bindings", null);
        setField(term13918, term13918.getClass(), "_properties", null);
        setField(term13918, term13918.getClass(), "_objectIdInfo", null);
        setField(term13918, term13918.getClass(), "_type", null);
        setField(term13917, term13917.getClass(), "_beanDesc", term13918);
        setBooleanField(term13917, term13917.getClass(), "_canFixAccess", true);
        setBooleanField(term13917, term13917.getClass(), "_forceAccess", true);
        setField(term13917, term13917.getClass(), "_creators", term13919);
        setIntField(term13917, term13917.getClass(), "_explicitCreators", 0);
        setBooleanField(term13917, term13917.getClass(), "_hasNonDefaultCreator", false);
        setField(term13917, term13917.getClass(), "_delegateArgs", null);
        setField(term13917, term13917.getClass(), "_arrayDelegateArgs", null);
        setField(term13917, term13917.getClass(), "_propertyBasedArgs", null);
        setField(term13917, term13917.getClass(), "_incompleteParameter", null);
        term13920 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term13920, term13920.getClass(), "_problemHandlers", null);
        setField(term13920, term13920.getClass(), "_nodeFactory", null);
        setIntField(term13920, term13920.getClass(), "_deserFeatures", 0);
        setIntField(term13920, term13920.getClass(), "_parserFeatures", 0);
        setIntField(term13920, term13920.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term13920, term13920.getClass(), "_formatReadFeatures", 0);
        setIntField(term13920, term13920.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term13920, term13920.getClass(), "_mixIns", null);
        setField(term13920, term13920.getClass(), "_subtypeResolver", null);
        setField(term13920, term13920.getClass(), "_rootName", null);
        setField(term13920, term13920.getClass(), "_view", null);
        setField(term13920, term13920.getClass(), "_attributes", null);
        setField(term13920, term13920.getClass(), "_rootNames", null);
        setIntField(term13920, term13920.getClass(), "_mapperFeatures", -1);
        setField(term13920, term13920.getClass(), "_base", null);
        term13921 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        setField(term13921, term13921.getClass(), "_propCollector", null);
        setField(term13921, term13921.getClass(), "_config", null);
        setField(term13921, term13921.getClass(), "_annotationIntrospector", null);
        setField(term13921, term13921.getClass(), "_classInfo", null);
        setField(term13921, term13921.getClass(), "_bindings", null);
        setField(term13921, term13921.getClass(), "_properties", null);
        setField(term13921, term13921.getClass(), "_objectIdInfo", null);
        setField(term13921, term13921.getClass(), "_type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        Object[] args = new Object[2];
        args[0] = term13712;
        args[1] = term13822;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13917));
        assertTrue(recursiveEquals(term13712, term13920));
        assertTrue(recursiveEquals(term13822, term13921));
    }

};


