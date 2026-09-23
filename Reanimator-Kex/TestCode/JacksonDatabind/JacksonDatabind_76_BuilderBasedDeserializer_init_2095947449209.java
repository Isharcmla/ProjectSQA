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

public class BuilderBasedDeserializer_init_2095947449209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112469;
     Object term112921;

    public BuilderBasedDeserializer_init_2095947449209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term112341 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.AnnotatedParameter");
        Object term112305 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term112305, term112305.getClass(), "_valueClass", term112341);
        setField(term112305, term112305.getClass(), "_classAnnotations", null);
        setField(term112305, term112305.getClass(), "_beanType", null);
        setField(term112305, term112305.getClass(), "_valueInstantiator", null);
        setField(term112305, term112305.getClass(), "_delegateDeserializer", null);
        setField(term112305, term112305.getClass(), "_propertyBasedCreator", null);
        setField(term112305, term112305.getClass(), "_backRefs", null);
        setField(term112305, term112305.getClass(), "_ignorableProps", null);
        setBooleanField(term112305, term112305.getClass(), "_ignoreAllUnknown", false);
        setField(term112305, term112305.getClass(), "_anySetter", null);
        setField(term112305, term112305.getClass(), "_injectables", null);
        setField(term112305, term112305.getClass(), "_objectIdReader", null);
        setBooleanField(term112305, term112305.getClass(), "_nonStandardCreation", false);
        term112469 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term112573 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term112689 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term112809 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term112573, term112573.getClass(), "_class", null);
        setField(term112469, term112469.getClass(), "_beanType", term112573);
        setField(term112469, term112469.getClass(), "_classAnnotations", term112689);
        setField(term112469, term112469.getClass(), "_valueInstantiator", null);
        setField(term112469, term112469.getClass(), "_delegateDeserializer", null);
        setField(term112469, term112469.getClass(), "_propertyBasedCreator", null);
        setField(term112469, term112469.getClass(), "_backRefs", null);
        setField(term112469, term112469.getClass(), "_ignorableProps", null);
        setField(term112469, term112469.getClass(), "_anySetter", null);
        setField(term112469, term112469.getClass(), "_injectables", null);
        setField(term112469, term112469.getClass(), "_objectIdReader", null);
        setBooleanField(term112469, term112469.getClass(), "_nonStandardCreation", false);
        setField(term112469, term112469.getClass(), "_unwrappedPropertyHandler", null);
        setField(term112469, term112469.getClass(), "_beanProperties", term112809);
        term112921 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term112469;
        args[1] = term112921;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


