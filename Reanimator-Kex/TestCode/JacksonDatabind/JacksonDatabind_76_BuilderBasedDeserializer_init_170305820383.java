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

public class BuilderBasedDeserializer_init_170305820383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15894;
     Object term15966;
     Object term15968;

    public BuilderBasedDeserializer_init_170305820383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15894 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term15947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15894, term15894.getClass(), "_beanType", term15947);
        term15966 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term15967 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15966, term15966.getClass(), "_buildMethod", null);
        setField(term15966, term15966.getClass(), "_classAnnotations", null);
        setField(term15967, term15967.getClass(), "_elementType", null);
        setField(term15967, term15967.getClass(), "_superClass", null);
        setField(term15967, term15967.getClass(), "_superInterfaces", null);
        setField(term15967, term15967.getClass(), "_bindings", null);
        setField(term15967, term15967.getClass(), "_canonicalName", null);
        setField(term15967, term15967.getClass(), "_class", null);
        setIntField(term15967, term15967.getClass(), "_hash", 0);
        setField(term15967, term15967.getClass(), "_valueHandler", null);
        setField(term15967, term15967.getClass(), "_typeHandler", null);
        setBooleanField(term15967, term15967.getClass(), "_asStatic", false);
        setField(term15966, term15966.getClass(), "_beanType", term15967);
        setField(term15966, term15966.getClass(), "_serializationShape", null);
        setField(term15966, term15966.getClass(), "_valueInstantiator", null);
        setField(term15966, term15966.getClass(), "_delegateDeserializer", null);
        setField(term15966, term15966.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15966, term15966.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15966, term15966.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15966, term15966.getClass(), "_vanillaProcessing", false);
        setField(term15966, term15966.getClass(), "_beanProperties", null);
        setField(term15966, term15966.getClass(), "_injectables", null);
        setField(term15966, term15966.getClass(), "_anySetter", null);
        setField(term15966, term15966.getClass(), "_ignorableProps", null);
        setBooleanField(term15966, term15966.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15966, term15966.getClass(), "_needViewProcesing", false);
        setField(term15966, term15966.getClass(), "_backRefs", null);
        setField(term15966, term15966.getClass(), "_subDeserializers", null);
        setField(term15966, term15966.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15966, term15966.getClass(), "_externalTypeIdHandler", null);
        setField(term15966, term15966.getClass(), "_objectIdReader", null);
        setField(term15966, term15966.getClass(), "_valueClass", null);
        term15968 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term15969 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15968, term15968.getClass(), "_buildMethod", null);
        setField(term15968, term15968.getClass(), "_classAnnotations", null);
        setField(term15969, term15969.getClass(), "_elementType", null);
        setField(term15969, term15969.getClass(), "_superClass", null);
        setField(term15969, term15969.getClass(), "_superInterfaces", null);
        setField(term15969, term15969.getClass(), "_bindings", null);
        setField(term15969, term15969.getClass(), "_canonicalName", null);
        setField(term15969, term15969.getClass(), "_class", null);
        setIntField(term15969, term15969.getClass(), "_hash", 0);
        setField(term15969, term15969.getClass(), "_valueHandler", null);
        setField(term15969, term15969.getClass(), "_typeHandler", null);
        setBooleanField(term15969, term15969.getClass(), "_asStatic", false);
        setField(term15968, term15968.getClass(), "_beanType", term15969);
        setField(term15968, term15968.getClass(), "_serializationShape", null);
        setField(term15968, term15968.getClass(), "_valueInstantiator", null);
        setField(term15968, term15968.getClass(), "_delegateDeserializer", null);
        setField(term15968, term15968.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15968, term15968.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15968, term15968.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15968, term15968.getClass(), "_vanillaProcessing", false);
        setField(term15968, term15968.getClass(), "_beanProperties", null);
        setField(term15968, term15968.getClass(), "_injectables", null);
        setField(term15968, term15968.getClass(), "_anySetter", null);
        setField(term15968, term15968.getClass(), "_ignorableProps", null);
        setBooleanField(term15968, term15968.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15968, term15968.getClass(), "_needViewProcesing", false);
        setField(term15968, term15968.getClass(), "_backRefs", null);
        setField(term15968, term15968.getClass(), "_subDeserializers", null);
        setField(term15968, term15968.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15968, term15968.getClass(), "_externalTypeIdHandler", null);
        setField(term15968, term15968.getClass(), "_objectIdReader", null);
        setField(term15968, term15968.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term15894;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15966));
        assertTrue(recursiveEquals(term15894, term15968));
    }

};


