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
import java.lang.Object;

public class BuilderBasedDeserializer_init_1712035241109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27481;
     Object term27560;
     Object term27562;

    public BuilderBasedDeserializer_init_1712035241109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27481 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term27541 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setBooleanField(term27481, term27481.getClass(), "_ignoreAllUnknown", false);
        setField(term27481, term27481.getClass(), "_beanType", term27541);
        term27560 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term27561 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term27560, term27560.getClass(), "_buildMethod", null);
        setField(term27560, term27560.getClass(), "_classAnnotations", null);
        setField(term27561, term27561.getClass(), "_referencedType", null);
        setField(term27561, term27561.getClass(), "_superClass", null);
        setField(term27561, term27561.getClass(), "_superInterfaces", null);
        setField(term27561, term27561.getClass(), "_bindings", null);
        setField(term27561, term27561.getClass(), "_canonicalName", null);
        setField(term27561, term27561.getClass(), "_class", null);
        setIntField(term27561, term27561.getClass(), "_hash", 0);
        setField(term27561, term27561.getClass(), "_valueHandler", null);
        setField(term27561, term27561.getClass(), "_typeHandler", null);
        setBooleanField(term27561, term27561.getClass(), "_asStatic", false);
        setField(term27560, term27560.getClass(), "_beanType", term27561);
        setField(term27560, term27560.getClass(), "_serializationShape", null);
        setField(term27560, term27560.getClass(), "_valueInstantiator", null);
        setField(term27560, term27560.getClass(), "_delegateDeserializer", null);
        setField(term27560, term27560.getClass(), "_arrayDelegateDeserializer", null);
        setField(term27560, term27560.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27560, term27560.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27560, term27560.getClass(), "_vanillaProcessing", false);
        setField(term27560, term27560.getClass(), "_beanProperties", null);
        setField(term27560, term27560.getClass(), "_injectables", null);
        setField(term27560, term27560.getClass(), "_anySetter", null);
        setField(term27560, term27560.getClass(), "_ignorableProps", null);
        setBooleanField(term27560, term27560.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27560, term27560.getClass(), "_needViewProcesing", false);
        setField(term27560, term27560.getClass(), "_backRefs", null);
        setField(term27560, term27560.getClass(), "_subDeserializers", null);
        setField(term27560, term27560.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27560, term27560.getClass(), "_externalTypeIdHandler", null);
        setField(term27560, term27560.getClass(), "_objectIdReader", null);
        setField(term27560, term27560.getClass(), "_valueClass", null);
        term27562 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term27563 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term27562, term27562.getClass(), "_buildMethod", null);
        setField(term27562, term27562.getClass(), "_classAnnotations", null);
        setField(term27563, term27563.getClass(), "_referencedType", null);
        setField(term27563, term27563.getClass(), "_superClass", null);
        setField(term27563, term27563.getClass(), "_superInterfaces", null);
        setField(term27563, term27563.getClass(), "_bindings", null);
        setField(term27563, term27563.getClass(), "_canonicalName", null);
        setField(term27563, term27563.getClass(), "_class", null);
        setIntField(term27563, term27563.getClass(), "_hash", 0);
        setField(term27563, term27563.getClass(), "_valueHandler", null);
        setField(term27563, term27563.getClass(), "_typeHandler", null);
        setBooleanField(term27563, term27563.getClass(), "_asStatic", false);
        setField(term27562, term27562.getClass(), "_beanType", term27563);
        setField(term27562, term27562.getClass(), "_serializationShape", null);
        setField(term27562, term27562.getClass(), "_valueInstantiator", null);
        setField(term27562, term27562.getClass(), "_delegateDeserializer", null);
        setField(term27562, term27562.getClass(), "_arrayDelegateDeserializer", null);
        setField(term27562, term27562.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27562, term27562.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27562, term27562.getClass(), "_vanillaProcessing", false);
        setField(term27562, term27562.getClass(), "_beanProperties", null);
        setField(term27562, term27562.getClass(), "_injectables", null);
        setField(term27562, term27562.getClass(), "_anySetter", null);
        setField(term27562, term27562.getClass(), "_ignorableProps", null);
        setBooleanField(term27562, term27562.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27562, term27562.getClass(), "_needViewProcesing", false);
        setField(term27562, term27562.getClass(), "_backRefs", null);
        setField(term27562, term27562.getClass(), "_subDeserializers", null);
        setField(term27562, term27562.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27562, term27562.getClass(), "_externalTypeIdHandler", null);
        setField(term27562, term27562.getClass(), "_objectIdReader", null);
        setField(term27562, term27562.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term27481;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27560));
        assertTrue(recursiveEquals(term27481, term27562));
    }

};


