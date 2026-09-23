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

public class BuilderBasedDeserializer_init_516859802129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35979;
     Object term36044;
     Object term36046;

    public BuilderBasedDeserializer_init_516859802129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35979 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term36025 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35979, term35979.getClass(), "_beanType", term36025);
        term36044 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term36045 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term36044, term36044.getClass(), "_buildMethod", null);
        setField(term36044, term36044.getClass(), "_classAnnotations", null);
        setField(term36045, term36045.getClass(), "_keyType", null);
        setField(term36045, term36045.getClass(), "_valueType", null);
        setField(term36045, term36045.getClass(), "_superClass", null);
        setField(term36045, term36045.getClass(), "_superInterfaces", null);
        setField(term36045, term36045.getClass(), "_bindings", null);
        setField(term36045, term36045.getClass(), "_canonicalName", null);
        setField(term36045, term36045.getClass(), "_class", null);
        setIntField(term36045, term36045.getClass(), "_hash", 0);
        setField(term36045, term36045.getClass(), "_valueHandler", null);
        setField(term36045, term36045.getClass(), "_typeHandler", null);
        setBooleanField(term36045, term36045.getClass(), "_asStatic", false);
        setField(term36044, term36044.getClass(), "_beanType", term36045);
        setField(term36044, term36044.getClass(), "_serializationShape", null);
        setField(term36044, term36044.getClass(), "_valueInstantiator", null);
        setField(term36044, term36044.getClass(), "_delegateDeserializer", null);
        setField(term36044, term36044.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36044, term36044.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36044, term36044.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36044, term36044.getClass(), "_vanillaProcessing", false);
        setField(term36044, term36044.getClass(), "_beanProperties", null);
        setField(term36044, term36044.getClass(), "_injectables", null);
        setField(term36044, term36044.getClass(), "_anySetter", null);
        setField(term36044, term36044.getClass(), "_ignorableProps", null);
        setBooleanField(term36044, term36044.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36044, term36044.getClass(), "_needViewProcesing", false);
        setField(term36044, term36044.getClass(), "_backRefs", null);
        setField(term36044, term36044.getClass(), "_subDeserializers", null);
        setField(term36044, term36044.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36044, term36044.getClass(), "_externalTypeIdHandler", null);
        setField(term36044, term36044.getClass(), "_objectIdReader", null);
        setField(term36044, term36044.getClass(), "_valueClass", null);
        term36046 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term36047 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term36046, term36046.getClass(), "_buildMethod", null);
        setField(term36046, term36046.getClass(), "_classAnnotations", null);
        setField(term36047, term36047.getClass(), "_keyType", null);
        setField(term36047, term36047.getClass(), "_valueType", null);
        setField(term36047, term36047.getClass(), "_superClass", null);
        setField(term36047, term36047.getClass(), "_superInterfaces", null);
        setField(term36047, term36047.getClass(), "_bindings", null);
        setField(term36047, term36047.getClass(), "_canonicalName", null);
        setField(term36047, term36047.getClass(), "_class", null);
        setIntField(term36047, term36047.getClass(), "_hash", 0);
        setField(term36047, term36047.getClass(), "_valueHandler", null);
        setField(term36047, term36047.getClass(), "_typeHandler", null);
        setBooleanField(term36047, term36047.getClass(), "_asStatic", false);
        setField(term36046, term36046.getClass(), "_beanType", term36047);
        setField(term36046, term36046.getClass(), "_serializationShape", null);
        setField(term36046, term36046.getClass(), "_valueInstantiator", null);
        setField(term36046, term36046.getClass(), "_delegateDeserializer", null);
        setField(term36046, term36046.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36046, term36046.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36046, term36046.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36046, term36046.getClass(), "_vanillaProcessing", false);
        setField(term36046, term36046.getClass(), "_beanProperties", null);
        setField(term36046, term36046.getClass(), "_injectables", null);
        setField(term36046, term36046.getClass(), "_anySetter", null);
        setField(term36046, term36046.getClass(), "_ignorableProps", null);
        setBooleanField(term36046, term36046.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36046, term36046.getClass(), "_needViewProcesing", false);
        setField(term36046, term36046.getClass(), "_backRefs", null);
        setField(term36046, term36046.getClass(), "_subDeserializers", null);
        setField(term36046, term36046.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36046, term36046.getClass(), "_externalTypeIdHandler", null);
        setField(term36046, term36046.getClass(), "_objectIdReader", null);
        setField(term36046, term36046.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term35979;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36044));
        assertTrue(recursiveEquals(term35979, term36046));
    }

};


