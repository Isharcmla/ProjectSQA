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

public class BeanDeserializer_init_132869728184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15922;
     Object term16400;
     Object term16402;

    public BeanDeserializer_init_132869728184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15810 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term15922 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16022 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term15922, term15922.getClass(), "_beanType", term16022);
        term16400 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16401 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term16400, term16400.getClass(), "_nullFromCreator", null);
        setField(term16400, term16400.getClass(), "_currentlyTransforming", null);
        setField(term16401, term16401.getClass(), "_keyType", null);
        setField(term16401, term16401.getClass(), "_valueType", null);
        setField(term16401, term16401.getClass(), "_superClass", null);
        setField(term16401, term16401.getClass(), "_superInterfaces", null);
        setField(term16401, term16401.getClass(), "_bindings", null);
        setField(term16401, term16401.getClass(), "_canonicalName", null);
        setField(term16401, term16401.getClass(), "_class", null);
        setIntField(term16401, term16401.getClass(), "_hash", 0);
        setField(term16401, term16401.getClass(), "_valueHandler", null);
        setField(term16401, term16401.getClass(), "_typeHandler", null);
        setBooleanField(term16401, term16401.getClass(), "_asStatic", false);
        setField(term16400, term16400.getClass(), "_beanType", term16401);
        setField(term16400, term16400.getClass(), "_serializationShape", null);
        setField(term16400, term16400.getClass(), "_valueInstantiator", null);
        setField(term16400, term16400.getClass(), "_delegateDeserializer", null);
        setField(term16400, term16400.getClass(), "_arrayDelegateDeserializer", null);
        setField(term16400, term16400.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term16400, term16400.getClass(), "_nonStandardCreation", false);
        setBooleanField(term16400, term16400.getClass(), "_vanillaProcessing", false);
        setField(term16400, term16400.getClass(), "_beanProperties", null);
        setField(term16400, term16400.getClass(), "_injectables", null);
        setField(term16400, term16400.getClass(), "_anySetter", null);
        setField(term16400, term16400.getClass(), "_ignorableProps", null);
        setBooleanField(term16400, term16400.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term16400, term16400.getClass(), "_needViewProcesing", false);
        setField(term16400, term16400.getClass(), "_backRefs", null);
        setField(term16400, term16400.getClass(), "_subDeserializers", null);
        setField(term16400, term16400.getClass(), "_unwrappedPropertyHandler", null);
        setField(term16400, term16400.getClass(), "_externalTypeIdHandler", null);
        setField(term16400, term16400.getClass(), "_objectIdReader", null);
        setField(term16400, term16400.getClass(), "_valueClass", null);
        term16402 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term16402, term16402.getClass(), "_nullFromCreator", null);
        setField(term16402, term16402.getClass(), "_currentlyTransforming", null);
        setField(term16403, term16403.getClass(), "_keyType", null);
        setField(term16403, term16403.getClass(), "_valueType", null);
        setField(term16403, term16403.getClass(), "_superClass", null);
        setField(term16403, term16403.getClass(), "_superInterfaces", null);
        setField(term16403, term16403.getClass(), "_bindings", null);
        setField(term16403, term16403.getClass(), "_canonicalName", null);
        setField(term16403, term16403.getClass(), "_class", null);
        setIntField(term16403, term16403.getClass(), "_hash", 0);
        setField(term16403, term16403.getClass(), "_valueHandler", null);
        setField(term16403, term16403.getClass(), "_typeHandler", null);
        setBooleanField(term16403, term16403.getClass(), "_asStatic", false);
        setField(term16402, term16402.getClass(), "_beanType", term16403);
        setField(term16402, term16402.getClass(), "_serializationShape", null);
        setField(term16402, term16402.getClass(), "_valueInstantiator", null);
        setField(term16402, term16402.getClass(), "_delegateDeserializer", null);
        setField(term16402, term16402.getClass(), "_arrayDelegateDeserializer", null);
        setField(term16402, term16402.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term16402, term16402.getClass(), "_nonStandardCreation", false);
        setBooleanField(term16402, term16402.getClass(), "_vanillaProcessing", false);
        setField(term16402, term16402.getClass(), "_beanProperties", null);
        setField(term16402, term16402.getClass(), "_injectables", null);
        setField(term16402, term16402.getClass(), "_anySetter", null);
        setField(term16402, term16402.getClass(), "_ignorableProps", null);
        setBooleanField(term16402, term16402.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term16402, term16402.getClass(), "_needViewProcesing", false);
        setField(term16402, term16402.getClass(), "_backRefs", null);
        setField(term16402, term16402.getClass(), "_subDeserializers", null);
        setField(term16402, term16402.getClass(), "_unwrappedPropertyHandler", null);
        setField(term16402, term16402.getClass(), "_externalTypeIdHandler", null);
        setField(term16402, term16402.getClass(), "_objectIdReader", null);
        setField(term16402, term16402.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term15922;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16400));
        assertTrue(recursiveEquals(term15922, term16402));
    }

};


