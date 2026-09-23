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

public class BuilderBasedDeserializer_init_516859802118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32641;
     Object term33871;
     Object term33873;

    public BuilderBasedDeserializer_init_516859802118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32641 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term32694 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term32641, term32641.getClass(), "_beanType", term32694);
        term33871 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33872 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term33871, term33871.getClass(), "_buildMethod", null);
        setField(term33871, term33871.getClass(), "_classAnnotations", null);
        setField(term33872, term33872.getClass(), "_elementType", null);
        setField(term33872, term33872.getClass(), "_superClass", null);
        setField(term33872, term33872.getClass(), "_superInterfaces", null);
        setField(term33872, term33872.getClass(), "_bindings", null);
        setField(term33872, term33872.getClass(), "_canonicalName", null);
        setField(term33872, term33872.getClass(), "_class", null);
        setIntField(term33872, term33872.getClass(), "_hash", 0);
        setField(term33872, term33872.getClass(), "_valueHandler", null);
        setField(term33872, term33872.getClass(), "_typeHandler", null);
        setBooleanField(term33872, term33872.getClass(), "_asStatic", false);
        setField(term33871, term33871.getClass(), "_beanType", term33872);
        setField(term33871, term33871.getClass(), "_serializationShape", null);
        setField(term33871, term33871.getClass(), "_valueInstantiator", null);
        setField(term33871, term33871.getClass(), "_delegateDeserializer", null);
        setField(term33871, term33871.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33871, term33871.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33871, term33871.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33871, term33871.getClass(), "_vanillaProcessing", false);
        setField(term33871, term33871.getClass(), "_beanProperties", null);
        setField(term33871, term33871.getClass(), "_injectables", null);
        setField(term33871, term33871.getClass(), "_anySetter", null);
        setField(term33871, term33871.getClass(), "_ignorableProps", null);
        setBooleanField(term33871, term33871.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33871, term33871.getClass(), "_needViewProcesing", false);
        setField(term33871, term33871.getClass(), "_backRefs", null);
        setField(term33871, term33871.getClass(), "_subDeserializers", null);
        setField(term33871, term33871.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33871, term33871.getClass(), "_externalTypeIdHandler", null);
        setField(term33871, term33871.getClass(), "_objectIdReader", null);
        setField(term33871, term33871.getClass(), "_valueClass", null);
        term33873 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term33874 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term33873, term33873.getClass(), "_buildMethod", null);
        setField(term33873, term33873.getClass(), "_classAnnotations", null);
        setField(term33874, term33874.getClass(), "_elementType", null);
        setField(term33874, term33874.getClass(), "_superClass", null);
        setField(term33874, term33874.getClass(), "_superInterfaces", null);
        setField(term33874, term33874.getClass(), "_bindings", null);
        setField(term33874, term33874.getClass(), "_canonicalName", null);
        setField(term33874, term33874.getClass(), "_class", null);
        setIntField(term33874, term33874.getClass(), "_hash", 0);
        setField(term33874, term33874.getClass(), "_valueHandler", null);
        setField(term33874, term33874.getClass(), "_typeHandler", null);
        setBooleanField(term33874, term33874.getClass(), "_asStatic", false);
        setField(term33873, term33873.getClass(), "_beanType", term33874);
        setField(term33873, term33873.getClass(), "_serializationShape", null);
        setField(term33873, term33873.getClass(), "_valueInstantiator", null);
        setField(term33873, term33873.getClass(), "_delegateDeserializer", null);
        setField(term33873, term33873.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33873, term33873.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33873, term33873.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33873, term33873.getClass(), "_vanillaProcessing", false);
        setField(term33873, term33873.getClass(), "_beanProperties", null);
        setField(term33873, term33873.getClass(), "_injectables", null);
        setField(term33873, term33873.getClass(), "_anySetter", null);
        setField(term33873, term33873.getClass(), "_ignorableProps", null);
        setBooleanField(term33873, term33873.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33873, term33873.getClass(), "_needViewProcesing", false);
        setField(term33873, term33873.getClass(), "_backRefs", null);
        setField(term33873, term33873.getClass(), "_subDeserializers", null);
        setField(term33873, term33873.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33873, term33873.getClass(), "_externalTypeIdHandler", null);
        setField(term33873, term33873.getClass(), "_objectIdReader", null);
        setField(term33873, term33873.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term32641;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33871));
        assertTrue(recursiveEquals(term32641, term33873));
    }

};


