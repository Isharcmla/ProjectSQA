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

public class BuilderBasedDeserializer_init_516859802175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76518;
     Object term76597;
     Object term76599;

    public BuilderBasedDeserializer_init_516859802175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76518 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term76578 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term76518, term76518.getClass(), "_beanType", term76578);
        term76597 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term76598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term76597, term76597.getClass(), "_buildMethod", null);
        setField(term76597, term76597.getClass(), "_classAnnotations", null);
        setField(term76598, term76598.getClass(), "_referencedType", null);
        setField(term76598, term76598.getClass(), "_superClass", null);
        setField(term76598, term76598.getClass(), "_superInterfaces", null);
        setField(term76598, term76598.getClass(), "_bindings", null);
        setField(term76598, term76598.getClass(), "_canonicalName", null);
        setField(term76598, term76598.getClass(), "_class", null);
        setIntField(term76598, term76598.getClass(), "_hash", 0);
        setField(term76598, term76598.getClass(), "_valueHandler", null);
        setField(term76598, term76598.getClass(), "_typeHandler", null);
        setBooleanField(term76598, term76598.getClass(), "_asStatic", false);
        setField(term76597, term76597.getClass(), "_beanType", term76598);
        setField(term76597, term76597.getClass(), "_serializationShape", null);
        setField(term76597, term76597.getClass(), "_valueInstantiator", null);
        setField(term76597, term76597.getClass(), "_delegateDeserializer", null);
        setField(term76597, term76597.getClass(), "_arrayDelegateDeserializer", null);
        setField(term76597, term76597.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term76597, term76597.getClass(), "_nonStandardCreation", false);
        setBooleanField(term76597, term76597.getClass(), "_vanillaProcessing", false);
        setField(term76597, term76597.getClass(), "_beanProperties", null);
        setField(term76597, term76597.getClass(), "_injectables", null);
        setField(term76597, term76597.getClass(), "_anySetter", null);
        setField(term76597, term76597.getClass(), "_ignorableProps", null);
        setBooleanField(term76597, term76597.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term76597, term76597.getClass(), "_needViewProcesing", false);
        setField(term76597, term76597.getClass(), "_backRefs", null);
        setField(term76597, term76597.getClass(), "_subDeserializers", null);
        setField(term76597, term76597.getClass(), "_unwrappedPropertyHandler", null);
        setField(term76597, term76597.getClass(), "_externalTypeIdHandler", null);
        setField(term76597, term76597.getClass(), "_objectIdReader", null);
        setField(term76597, term76597.getClass(), "_valueClass", null);
        term76599 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term76600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term76599, term76599.getClass(), "_buildMethod", null);
        setField(term76599, term76599.getClass(), "_classAnnotations", null);
        setField(term76600, term76600.getClass(), "_referencedType", null);
        setField(term76600, term76600.getClass(), "_superClass", null);
        setField(term76600, term76600.getClass(), "_superInterfaces", null);
        setField(term76600, term76600.getClass(), "_bindings", null);
        setField(term76600, term76600.getClass(), "_canonicalName", null);
        setField(term76600, term76600.getClass(), "_class", null);
        setIntField(term76600, term76600.getClass(), "_hash", 0);
        setField(term76600, term76600.getClass(), "_valueHandler", null);
        setField(term76600, term76600.getClass(), "_typeHandler", null);
        setBooleanField(term76600, term76600.getClass(), "_asStatic", false);
        setField(term76599, term76599.getClass(), "_beanType", term76600);
        setField(term76599, term76599.getClass(), "_serializationShape", null);
        setField(term76599, term76599.getClass(), "_valueInstantiator", null);
        setField(term76599, term76599.getClass(), "_delegateDeserializer", null);
        setField(term76599, term76599.getClass(), "_arrayDelegateDeserializer", null);
        setField(term76599, term76599.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term76599, term76599.getClass(), "_nonStandardCreation", false);
        setBooleanField(term76599, term76599.getClass(), "_vanillaProcessing", false);
        setField(term76599, term76599.getClass(), "_beanProperties", null);
        setField(term76599, term76599.getClass(), "_injectables", null);
        setField(term76599, term76599.getClass(), "_anySetter", null);
        setField(term76599, term76599.getClass(), "_ignorableProps", null);
        setBooleanField(term76599, term76599.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term76599, term76599.getClass(), "_needViewProcesing", false);
        setField(term76599, term76599.getClass(), "_backRefs", null);
        setField(term76599, term76599.getClass(), "_subDeserializers", null);
        setField(term76599, term76599.getClass(), "_unwrappedPropertyHandler", null);
        setField(term76599, term76599.getClass(), "_externalTypeIdHandler", null);
        setField(term76599, term76599.getClass(), "_objectIdReader", null);
        setField(term76599, term76599.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term76518;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term76597));
        assertTrue(recursiveEquals(term76518, term76599));
    }

};


