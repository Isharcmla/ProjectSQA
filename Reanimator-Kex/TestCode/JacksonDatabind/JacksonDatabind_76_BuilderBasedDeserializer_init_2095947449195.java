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

public class BuilderBasedDeserializer_init_2095947449195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95046;
     Object term95304;

    public BuilderBasedDeserializer_init_2095947449195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term94782 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term94918 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term94782, term94782.getClass(), "_valueClass", null);
        setField(term94782, term94782.getClass(), "_classAnnotations", null);
        setField(term94782, term94782.getClass(), "_beanType", null);
        setField(term94782, term94782.getClass(), "_valueInstantiator", term94918);
        setField(term94782, term94782.getClass(), "_delegateDeserializer", null);
        setField(term94782, term94782.getClass(), "_propertyBasedCreator", null);
        setField(term94782, term94782.getClass(), "_backRefs", null);
        setField(term94782, term94782.getClass(), "_ignorableProps", null);
        setBooleanField(term94782, term94782.getClass(), "_ignoreAllUnknown", false);
        setField(term94782, term94782.getClass(), "_anySetter", null);
        setField(term94782, term94782.getClass(), "_injectables", null);
        setField(term94782, term94782.getClass(), "_objectIdReader", null);
        setBooleanField(term94782, term94782.getClass(), "_nonStandardCreation", false);
        term95046 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term95166 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term95046, term95046.getClass(), "_beanType", null);
        setField(term95046, term95046.getClass(), "_classAnnotations", null);
        setField(term95046, term95046.getClass(), "_valueInstantiator", null);
        setField(term95046, term95046.getClass(), "_delegateDeserializer", null);
        setField(term95046, term95046.getClass(), "_propertyBasedCreator", null);
        setField(term95046, term95046.getClass(), "_backRefs", null);
        setField(term95046, term95046.getClass(), "_ignorableProps", null);
        setField(term95046, term95046.getClass(), "_anySetter", null);
        setField(term95046, term95046.getClass(), "_injectables", null);
        setField(term95046, term95046.getClass(), "_objectIdReader", null);
        setBooleanField(term95046, term95046.getClass(), "_nonStandardCreation", false);
        setField(term95046, term95046.getClass(), "_unwrappedPropertyHandler", null);
        setField(term95046, term95046.getClass(), "_beanProperties", term95166);
        term95304 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term95046;
        args[1] = term95304;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


