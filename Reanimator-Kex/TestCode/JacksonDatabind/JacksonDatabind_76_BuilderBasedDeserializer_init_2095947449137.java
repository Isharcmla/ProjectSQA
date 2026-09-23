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

public class BuilderBasedDeserializer_init_2095947449137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41646;
     Object term41713;
     Object term41715;

    public BuilderBasedDeserializer_init_2095947449137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41646 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term41692 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41646, term41646.getClass(), "_beanType", term41692);
        term41713 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term41714 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41713, term41713.getClass(), "_buildMethod", null);
        setField(term41713, term41713.getClass(), "_classAnnotations", null);
        setField(term41714, term41714.getClass(), "_keyType", null);
        setField(term41714, term41714.getClass(), "_valueType", null);
        setField(term41714, term41714.getClass(), "_superClass", null);
        setField(term41714, term41714.getClass(), "_superInterfaces", null);
        setField(term41714, term41714.getClass(), "_bindings", null);
        setField(term41714, term41714.getClass(), "_canonicalName", null);
        setField(term41714, term41714.getClass(), "_class", null);
        setIntField(term41714, term41714.getClass(), "_hash", 0);
        setField(term41714, term41714.getClass(), "_valueHandler", null);
        setField(term41714, term41714.getClass(), "_typeHandler", null);
        setBooleanField(term41714, term41714.getClass(), "_asStatic", false);
        setField(term41713, term41713.getClass(), "_beanType", term41714);
        setField(term41713, term41713.getClass(), "_serializationShape", null);
        setField(term41713, term41713.getClass(), "_valueInstantiator", null);
        setField(term41713, term41713.getClass(), "_delegateDeserializer", null);
        setField(term41713, term41713.getClass(), "_arrayDelegateDeserializer", null);
        setField(term41713, term41713.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term41713, term41713.getClass(), "_nonStandardCreation", false);
        setBooleanField(term41713, term41713.getClass(), "_vanillaProcessing", false);
        setField(term41713, term41713.getClass(), "_beanProperties", null);
        setField(term41713, term41713.getClass(), "_injectables", null);
        setField(term41713, term41713.getClass(), "_anySetter", null);
        setField(term41713, term41713.getClass(), "_ignorableProps", null);
        setBooleanField(term41713, term41713.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term41713, term41713.getClass(), "_needViewProcesing", false);
        setField(term41713, term41713.getClass(), "_backRefs", null);
        setField(term41713, term41713.getClass(), "_subDeserializers", null);
        setField(term41713, term41713.getClass(), "_unwrappedPropertyHandler", null);
        setField(term41713, term41713.getClass(), "_externalTypeIdHandler", null);
        setField(term41713, term41713.getClass(), "_objectIdReader", null);
        setField(term41713, term41713.getClass(), "_valueClass", null);
        term41715 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term41716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term41715, term41715.getClass(), "_buildMethod", null);
        setField(term41715, term41715.getClass(), "_classAnnotations", null);
        setField(term41716, term41716.getClass(), "_keyType", null);
        setField(term41716, term41716.getClass(), "_valueType", null);
        setField(term41716, term41716.getClass(), "_superClass", null);
        setField(term41716, term41716.getClass(), "_superInterfaces", null);
        setField(term41716, term41716.getClass(), "_bindings", null);
        setField(term41716, term41716.getClass(), "_canonicalName", null);
        setField(term41716, term41716.getClass(), "_class", null);
        setIntField(term41716, term41716.getClass(), "_hash", 0);
        setField(term41716, term41716.getClass(), "_valueHandler", null);
        setField(term41716, term41716.getClass(), "_typeHandler", null);
        setBooleanField(term41716, term41716.getClass(), "_asStatic", false);
        setField(term41715, term41715.getClass(), "_beanType", term41716);
        setField(term41715, term41715.getClass(), "_serializationShape", null);
        setField(term41715, term41715.getClass(), "_valueInstantiator", null);
        setField(term41715, term41715.getClass(), "_delegateDeserializer", null);
        setField(term41715, term41715.getClass(), "_arrayDelegateDeserializer", null);
        setField(term41715, term41715.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term41715, term41715.getClass(), "_nonStandardCreation", false);
        setBooleanField(term41715, term41715.getClass(), "_vanillaProcessing", false);
        setField(term41715, term41715.getClass(), "_beanProperties", null);
        setField(term41715, term41715.getClass(), "_injectables", null);
        setField(term41715, term41715.getClass(), "_anySetter", null);
        setField(term41715, term41715.getClass(), "_ignorableProps", null);
        setBooleanField(term41715, term41715.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term41715, term41715.getClass(), "_needViewProcesing", false);
        setField(term41715, term41715.getClass(), "_backRefs", null);
        setField(term41715, term41715.getClass(), "_subDeserializers", null);
        setField(term41715, term41715.getClass(), "_unwrappedPropertyHandler", null);
        setField(term41715, term41715.getClass(), "_externalTypeIdHandler", null);
        setField(term41715, term41715.getClass(), "_objectIdReader", null);
        setField(term41715, term41715.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term41646;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41713));
        assertTrue(recursiveEquals(term41646, term41715));
    }

};


