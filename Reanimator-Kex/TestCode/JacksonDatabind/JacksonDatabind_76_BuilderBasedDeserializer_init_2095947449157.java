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

public class BuilderBasedDeserializer_init_2095947449157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59325;
     Object term59557;

    public BuilderBasedDeserializer_init_2095947449157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59081 = Class.forName((String) "java.nio.CharBuffer");
        Object term59045 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term59197 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term59045, term59045.getClass(), "_valueClass", term59081);
        setField(term59045, term59045.getClass(), "_classAnnotations", term59197);
        setField(term59045, term59045.getClass(), "_beanType", null);
        setField(term59045, term59045.getClass(), "_valueInstantiator", null);
        setField(term59045, term59045.getClass(), "_delegateDeserializer", null);
        setField(term59045, term59045.getClass(), "_propertyBasedCreator", null);
        setField(term59045, term59045.getClass(), "_backRefs", null);
        setField(term59045, term59045.getClass(), "_ignorableProps", null);
        setBooleanField(term59045, term59045.getClass(), "_ignoreAllUnknown", false);
        setField(term59045, term59045.getClass(), "_anySetter", null);
        setField(term59045, term59045.getClass(), "_injectables", null);
        setField(term59045, term59045.getClass(), "_objectIdReader", null);
        setBooleanField(term59045, term59045.getClass(), "_nonStandardCreation", false);
        term59325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term59445 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term59325, term59325.getClass(), "_beanType", null);
        setField(term59325, term59325.getClass(), "_classAnnotations", null);
        setField(term59325, term59325.getClass(), "_valueInstantiator", null);
        setField(term59325, term59325.getClass(), "_delegateDeserializer", null);
        setField(term59325, term59325.getClass(), "_propertyBasedCreator", null);
        setField(term59325, term59325.getClass(), "_backRefs", null);
        setField(term59325, term59325.getClass(), "_ignorableProps", null);
        setField(term59325, term59325.getClass(), "_anySetter", null);
        setField(term59325, term59325.getClass(), "_injectables", null);
        setField(term59325, term59325.getClass(), "_objectIdReader", null);
        setBooleanField(term59325, term59325.getClass(), "_nonStandardCreation", false);
        setField(term59325, term59325.getClass(), "_unwrappedPropertyHandler", null);
        setField(term59325, term59325.getClass(), "_beanProperties", term59445);
        term59557 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term59325;
        args[1] = term59557;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


