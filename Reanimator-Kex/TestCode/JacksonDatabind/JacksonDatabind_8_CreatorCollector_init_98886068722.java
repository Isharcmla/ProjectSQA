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
import java.lang.Boolean;
import java.lang.Object;

public class CreatorCollector_init_98886068722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term33;

    public CreatorCollector_init_98886068722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Boolean(false);
        term33 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector"));
        Object[] term34 = (Object[]) newArray("com.fasterxml.jackson.databind.introspect.AnnotatedWithParams", 8);
        setField(term33, term33.getClass(), "_beanDesc", null);
        setBooleanField(term33, term33.getClass(), "_canFixAccess", false);
        setField(term33, term33.getClass(), "_creators", term34);
        setIntField(term33, term33.getClass(), "_explicitCreators", 0);
        setBooleanField(term33, term33.getClass(), "_hasNonDefaultCreator", false);
        setField(term33, term33.getClass(), "_delegateArgs", null);
        setField(term33, term33.getClass(), "_propertyBasedArgs", null);
        setField(term33, term33.getClass(), "_incompleteParameter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33));
        assertTrue(recursiveEquals(term1, false));
    }

};


