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

public class BuilderBasedDeserializer_init_1703058203119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33804;
     Object term33935;
     Object term33937;

    public BuilderBasedDeserializer_init_1703058203119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33804 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33852 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33804, term33804.getClass(), "_beanType", term33852);
        term33935 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33936 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33935, term33935.getClass(), "_buildMethod", null);
        setField(term33935, term33935.getClass(), "_classAnnotations", null);
        setField(term33936, term33936.getClass(), "_componentType", null);
        setField(term33936, term33936.getClass(), "_emptyArray", null);
        setField(term33936, term33936.getClass(), "_superClass", null);
        setField(term33936, term33936.getClass(), "_superInterfaces", null);
        setField(term33936, term33936.getClass(), "_bindings", null);
        setField(term33936, term33936.getClass(), "_canonicalName", null);
        setField(term33936, term33936.getClass(), "_class", null);
        setIntField(term33936, term33936.getClass(), "_hash", 0);
        setField(term33936, term33936.getClass(), "_valueHandler", null);
        setField(term33936, term33936.getClass(), "_typeHandler", null);
        setBooleanField(term33936, term33936.getClass(), "_asStatic", false);
        setField(term33935, term33935.getClass(), "_beanType", term33936);
        setField(term33935, term33935.getClass(), "_serializationShape", null);
        setField(term33935, term33935.getClass(), "_valueInstantiator", null);
        setField(term33935, term33935.getClass(), "_delegateDeserializer", null);
        setField(term33935, term33935.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33935, term33935.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33935, term33935.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33935, term33935.getClass(), "_vanillaProcessing", false);
        setField(term33935, term33935.getClass(), "_beanProperties", null);
        setField(term33935, term33935.getClass(), "_injectables", null);
        setField(term33935, term33935.getClass(), "_anySetter", null);
        setField(term33935, term33935.getClass(), "_ignorableProps", null);
        setBooleanField(term33935, term33935.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33935, term33935.getClass(), "_needViewProcesing", false);
        setField(term33935, term33935.getClass(), "_backRefs", null);
        setField(term33935, term33935.getClass(), "_subDeserializers", null);
        setField(term33935, term33935.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33935, term33935.getClass(), "_externalTypeIdHandler", null);
        setField(term33935, term33935.getClass(), "_objectIdReader", null);
        setField(term33935, term33935.getClass(), "_valueClass", null);
        term33937 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33938 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33937, term33937.getClass(), "_buildMethod", null);
        setField(term33937, term33937.getClass(), "_classAnnotations", null);
        setField(term33938, term33938.getClass(), "_componentType", null);
        setField(term33938, term33938.getClass(), "_emptyArray", null);
        setField(term33938, term33938.getClass(), "_superClass", null);
        setField(term33938, term33938.getClass(), "_superInterfaces", null);
        setField(term33938, term33938.getClass(), "_bindings", null);
        setField(term33938, term33938.getClass(), "_canonicalName", null);
        setField(term33938, term33938.getClass(), "_class", null);
        setIntField(term33938, term33938.getClass(), "_hash", 0);
        setField(term33938, term33938.getClass(), "_valueHandler", null);
        setField(term33938, term33938.getClass(), "_typeHandler", null);
        setBooleanField(term33938, term33938.getClass(), "_asStatic", false);
        setField(term33937, term33937.getClass(), "_beanType", term33938);
        setField(term33937, term33937.getClass(), "_serializationShape", null);
        setField(term33937, term33937.getClass(), "_valueInstantiator", null);
        setField(term33937, term33937.getClass(), "_delegateDeserializer", null);
        setField(term33937, term33937.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33937, term33937.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33937, term33937.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33937, term33937.getClass(), "_vanillaProcessing", false);
        setField(term33937, term33937.getClass(), "_beanProperties", null);
        setField(term33937, term33937.getClass(), "_injectables", null);
        setField(term33937, term33937.getClass(), "_anySetter", null);
        setField(term33937, term33937.getClass(), "_ignorableProps", null);
        setBooleanField(term33937, term33937.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33937, term33937.getClass(), "_needViewProcesing", false);
        setField(term33937, term33937.getClass(), "_backRefs", null);
        setField(term33937, term33937.getClass(), "_subDeserializers", null);
        setField(term33937, term33937.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33937, term33937.getClass(), "_externalTypeIdHandler", null);
        setField(term33937, term33937.getClass(), "_objectIdReader", null);
        setField(term33937, term33937.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term33804;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33935));
        assertTrue(recursiveEquals(term33804, term33937));
    }

};


