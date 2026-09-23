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

public class BuilderBasedDeserializer_init_516859802215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121427;
     Object term121925;

    public BuilderBasedDeserializer_init_516859802215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121299 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term121299, term121299.getClass(), "_valueClass", null);
        setField(term121299, term121299.getClass(), "_classAnnotations", null);
        setField(term121299, term121299.getClass(), "_beanType", null);
        setField(term121299, term121299.getClass(), "_valueInstantiator", null);
        setField(term121299, term121299.getClass(), "_delegateDeserializer", null);
        setField(term121299, term121299.getClass(), "_propertyBasedCreator", null);
        setField(term121299, term121299.getClass(), "_backRefs", null);
        setField(term121299, term121299.getClass(), "_ignorableProps", null);
        setBooleanField(term121299, term121299.getClass(), "_ignoreAllUnknown", false);
        setField(term121299, term121299.getClass(), "_anySetter", null);
        setField(term121299, term121299.getClass(), "_injectables", null);
        setBooleanField(term121299, term121299.getClass(), "_nonStandardCreation", false);
        setField(term121299, term121299.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term121299, term121299.getClass(), "_needViewProcesing", false);
        setField(term121299, term121299.getClass(), "_serializationShape", null);
        setField(term121299, term121299.getClass(), "_objectIdReader", null);
        Class<? extends Object> term122667 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term122666 = ((Class) term122667).getDeclaredField((String) "OBJECT");
        ((Field) term122666).setAccessible(true);
        Object enum19 = ((Field) term122666).get((Object) null);
        term121427 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term121547 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term121665 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.SettableAnyProperty"));
        setField(term121547, term121547.getClass(), "_class", null);
        setField(term121427, term121427.getClass(), "_beanType", term121547);
        setField(term121427, term121427.getClass(), "_classAnnotations", null);
        setField(term121427, term121427.getClass(), "_valueInstantiator", null);
        setField(term121427, term121427.getClass(), "_delegateDeserializer", null);
        setField(term121427, term121427.getClass(), "_propertyBasedCreator", null);
        setField(term121427, term121427.getClass(), "_backRefs", null);
        setField(term121427, term121427.getClass(), "_ignorableProps", null);
        setBooleanField(term121427, term121427.getClass(), "_ignoreAllUnknown", false);
        setField(term121427, term121427.getClass(), "_anySetter", term121665);
        setField(term121427, term121427.getClass(), "_injectables", null);
        setBooleanField(term121427, term121427.getClass(), "_nonStandardCreation", false);
        setField(term121427, term121427.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term121427, term121427.getClass(), "_needViewProcesing", false);
        setField(term121427, term121427.getClass(), "_serializationShape", enum19);
        term121925 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term122017 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term121925, term121925.getClass(), "propertyName", term122017);
        setField(term121925, term121925.getClass(), "_idType", null);
        setField(term121925, term121925.getClass(), "_deserializer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term121427;
        args[1] = term121925;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


