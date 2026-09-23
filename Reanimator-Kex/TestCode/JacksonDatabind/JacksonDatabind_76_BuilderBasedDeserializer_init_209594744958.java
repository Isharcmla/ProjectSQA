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
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.EqualityUtils.*;

public class BuilderBasedDeserializer_init_209594744958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7483;
     Object term8559;
     Object term8560;

    public BuilderBasedDeserializer_init_209594744958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7483 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        term8559 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term8559, term8559.getClass(), "_buildMethod", null);
        setField(term8559, term8559.getClass(), "_classAnnotations", null);
        setField(term8559, term8559.getClass(), "_beanType", null);
        setField(term8559, term8559.getClass(), "_serializationShape", null);
        setField(term8559, term8559.getClass(), "_valueInstantiator", null);
        setField(term8559, term8559.getClass(), "_delegateDeserializer", null);
        setField(term8559, term8559.getClass(), "_arrayDelegateDeserializer", null);
        setField(term8559, term8559.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term8559, term8559.getClass(), "_nonStandardCreation", false);
        setBooleanField(term8559, term8559.getClass(), "_vanillaProcessing", false);
        setField(term8559, term8559.getClass(), "_beanProperties", null);
        setField(term8559, term8559.getClass(), "_injectables", null);
        setField(term8559, term8559.getClass(), "_anySetter", null);
        setField(term8559, term8559.getClass(), "_ignorableProps", null);
        setBooleanField(term8559, term8559.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term8559, term8559.getClass(), "_needViewProcesing", false);
        setField(term8559, term8559.getClass(), "_backRefs", null);
        setField(term8559, term8559.getClass(), "_subDeserializers", null);
        setField(term8559, term8559.getClass(), "_unwrappedPropertyHandler", null);
        setField(term8559, term8559.getClass(), "_externalTypeIdHandler", null);
        setField(term8559, term8559.getClass(), "_objectIdReader", null);
        setField(term8559, term8559.getClass(), "_valueClass", null);
        term8560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term8560, term8560.getClass(), "_buildMethod", null);
        setField(term8560, term8560.getClass(), "_classAnnotations", null);
        setField(term8560, term8560.getClass(), "_beanType", null);
        setField(term8560, term8560.getClass(), "_serializationShape", null);
        setField(term8560, term8560.getClass(), "_valueInstantiator", null);
        setField(term8560, term8560.getClass(), "_delegateDeserializer", null);
        setField(term8560, term8560.getClass(), "_arrayDelegateDeserializer", null);
        setField(term8560, term8560.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term8560, term8560.getClass(), "_nonStandardCreation", false);
        setBooleanField(term8560, term8560.getClass(), "_vanillaProcessing", false);
        setField(term8560, term8560.getClass(), "_beanProperties", null);
        setField(term8560, term8560.getClass(), "_injectables", null);
        setField(term8560, term8560.getClass(), "_anySetter", null);
        setField(term8560, term8560.getClass(), "_ignorableProps", null);
        setBooleanField(term8560, term8560.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term8560, term8560.getClass(), "_needViewProcesing", false);
        setField(term8560, term8560.getClass(), "_backRefs", null);
        setField(term8560, term8560.getClass(), "_subDeserializers", null);
        setField(term8560, term8560.getClass(), "_unwrappedPropertyHandler", null);
        setField(term8560, term8560.getClass(), "_externalTypeIdHandler", null);
        setField(term8560, term8560.getClass(), "_objectIdReader", null);
        setField(term8560, term8560.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term7483;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8559));
        assertTrue(recursiveEquals(term7483, term8560));
    }

};


