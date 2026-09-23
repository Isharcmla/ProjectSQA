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
import java.lang.String;
import java.util.HashSet;

public class BuilderBasedDeserializer_init_2095947449133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37610;
     Object term38048;

    public BuilderBasedDeserializer_init_2095947449133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37482 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term37482, term37482.getClass(), "_valueClass", null);
        setField(term37482, term37482.getClass(), "_classAnnotations", null);
        setField(term37482, term37482.getClass(), "_beanType", null);
        setField(term37482, term37482.getClass(), "_valueInstantiator", null);
        setField(term37482, term37482.getClass(), "_delegateDeserializer", null);
        setField(term37482, term37482.getClass(), "_propertyBasedCreator", null);
        setField(term37482, term37482.getClass(), "_backRefs", null);
        setField(term37482, term37482.getClass(), "_ignorableProps", null);
        Class<? extends Object> term37760 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeySet");
        HashSet term37924 = new HashSet();
        term37610 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term37724 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term37876 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term37724, term37724.getClass(), "_class", term37760);
        setField(term37610, term37610.getClass(), "_beanType", term37724);
        setField(term37610, term37610.getClass(), "_classAnnotations", term37876);
        setField(term37610, term37610.getClass(), "_valueInstantiator", null);
        setField(term37610, term37610.getClass(), "_delegateDeserializer", null);
        setField(term37610, term37610.getClass(), "_propertyBasedCreator", null);
        setField(term37610, term37610.getClass(), "_backRefs", null);
        setField(term37610, term37610.getClass(), "_ignorableProps", term37924);
        term38048 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term37610;
        args[1] = term38048;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


