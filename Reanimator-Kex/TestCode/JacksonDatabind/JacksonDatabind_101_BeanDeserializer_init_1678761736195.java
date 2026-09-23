package com.fasterxml.jackson.databind.deser;

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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;
import java.lang.String;
import java.util.HashMap;

public class BeanDeserializer_init_1678761736195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83311;

    public BeanDeserializer_init_1678761736195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term83670 = new HashSet();
        Object term83581 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term83525 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        Object term83646 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator"));
        setField(term83581, term83581.getClass(), "_valueClass", null);
        setField(term83581, term83581.getClass(), "_beanType", null);
        setField(term83581, term83581.getClass(), "_valueInstantiator", term83525);
        setField(term83581, term83581.getClass(), "_delegateDeserializer", term83581);
        setField(term83581, term83581.getClass(), "_propertyBasedCreator", term83646);
        setField(term83581, term83581.getClass(), "_backRefs", null);
        setField(term83581, term83581.getClass(), "_ignorableProps", term83670);
        Class<? extends Object> term83461 = Class.forName((String) "java.util.ArrayPrefixHelpers$IntCumulateTask");
        HashMap term83718 = new HashMap();
        term83311 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term83425 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term83425, term83425.getClass(), "_class", term83461);
        setField(term83311, term83311.getClass(), "_beanType", term83425);
        setField(term83311, term83311.getClass(), "_valueInstantiator", term83525);
        setField(term83311, term83311.getClass(), "_delegateDeserializer", term83581);
        setField(term83311, term83311.getClass(), "_propertyBasedCreator", term83646);
        setField(term83311, term83311.getClass(), "_backRefs", term83718);
        setField(term83311, term83311.getClass(), "_ignorableProps", null);
        setBooleanField(term83311, term83311.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term83311;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


