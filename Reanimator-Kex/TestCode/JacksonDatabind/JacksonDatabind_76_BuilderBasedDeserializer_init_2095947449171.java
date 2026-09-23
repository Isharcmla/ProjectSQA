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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BuilderBasedDeserializer_init_2095947449171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71976;
     Object term72308;

    public BuilderBasedDeserializer_init_2095947449171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term71848 = Class.forName((String) "java.util.concurrent.atomic.AtomicStampedReference");
        Object term71812 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term71812, term71812.getClass(), "_valueClass", term71848);
        setField(term71812, term71812.getClass(), "_classAnnotations", null);
        setField(term71812, term71812.getClass(), "_beanType", null);
        setField(term71812, term71812.getClass(), "_valueInstantiator", null);
        setField(term71812, term71812.getClass(), "_delegateDeserializer", null);
        setField(term71812, term71812.getClass(), "_propertyBasedCreator", null);
        setField(term71812, term71812.getClass(), "_backRefs", null);
        setField(term71812, term71812.getClass(), "_ignorableProps", null);
        term71976 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term72080 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term72196 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term72080, term72080.getClass(), "_class", null);
        setField(term71976, term71976.getClass(), "_beanType", term72080);
        setField(term71976, term71976.getClass(), "_classAnnotations", term72196);
        setField(term71976, term71976.getClass(), "_valueInstantiator", null);
        setField(term71976, term71976.getClass(), "_delegateDeserializer", null);
        setField(term71976, term71976.getClass(), "_propertyBasedCreator", null);
        setField(term71976, term71976.getClass(), "_backRefs", null);
        setField(term71976, term71976.getClass(), "_ignorableProps", null);
        term72308 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term71976;
        args[1] = term72308;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


