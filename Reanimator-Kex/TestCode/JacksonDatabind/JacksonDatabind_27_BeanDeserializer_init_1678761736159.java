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

public class BeanDeserializer_init_1678761736159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69256;
     Object term69381;
     Object term69383;

    public BeanDeserializer_init_1678761736159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69144 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term69256 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term69360 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term69256, term69256.getClass(), "_beanType", term69360);
        term69381 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term69382 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term69381, term69381.getClass(), "_classAnnotations", null);
        setField(term69382, term69382.getClass(), "_referencedType", null);
        setField(term69382, term69382.getClass(), "_typeParametersFor", null);
        setField(term69382, term69382.getClass(), "_typeParameters", null);
        setField(term69382, term69382.getClass(), "_typeNames", null);
        setField(term69382, term69382.getClass(), "_canonicalName", null);
        setField(term69382, term69382.getClass(), "_class", null);
        setIntField(term69382, term69382.getClass(), "_hash", 0);
        setField(term69382, term69382.getClass(), "_valueHandler", null);
        setField(term69382, term69382.getClass(), "_typeHandler", null);
        setBooleanField(term69382, term69382.getClass(), "_asStatic", false);
        setField(term69381, term69381.getClass(), "_beanType", term69382);
        setField(term69381, term69381.getClass(), "_serializationShape", null);
        setField(term69381, term69381.getClass(), "_valueInstantiator", null);
        setField(term69381, term69381.getClass(), "_delegateDeserializer", null);
        setField(term69381, term69381.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term69381, term69381.getClass(), "_nonStandardCreation", false);
        setBooleanField(term69381, term69381.getClass(), "_vanillaProcessing", false);
        setField(term69381, term69381.getClass(), "_beanProperties", null);
        setField(term69381, term69381.getClass(), "_injectables", null);
        setField(term69381, term69381.getClass(), "_anySetter", null);
        setField(term69381, term69381.getClass(), "_ignorableProps", null);
        setBooleanField(term69381, term69381.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term69381, term69381.getClass(), "_needViewProcesing", false);
        setField(term69381, term69381.getClass(), "_backRefs", null);
        setField(term69381, term69381.getClass(), "_subDeserializers", null);
        setField(term69381, term69381.getClass(), "_unwrappedPropertyHandler", null);
        setField(term69381, term69381.getClass(), "_externalTypeIdHandler", null);
        setField(term69381, term69381.getClass(), "_objectIdReader", null);
        setField(term69381, term69381.getClass(), "_valueClass", null);
        term69383 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term69384 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term69383, term69383.getClass(), "_classAnnotations", null);
        setField(term69384, term69384.getClass(), "_referencedType", null);
        setField(term69384, term69384.getClass(), "_typeParametersFor", null);
        setField(term69384, term69384.getClass(), "_typeParameters", null);
        setField(term69384, term69384.getClass(), "_typeNames", null);
        setField(term69384, term69384.getClass(), "_canonicalName", null);
        setField(term69384, term69384.getClass(), "_class", null);
        setIntField(term69384, term69384.getClass(), "_hash", 0);
        setField(term69384, term69384.getClass(), "_valueHandler", null);
        setField(term69384, term69384.getClass(), "_typeHandler", null);
        setBooleanField(term69384, term69384.getClass(), "_asStatic", false);
        setField(term69383, term69383.getClass(), "_beanType", term69384);
        setField(term69383, term69383.getClass(), "_serializationShape", null);
        setField(term69383, term69383.getClass(), "_valueInstantiator", null);
        setField(term69383, term69383.getClass(), "_delegateDeserializer", null);
        setField(term69383, term69383.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term69383, term69383.getClass(), "_nonStandardCreation", false);
        setBooleanField(term69383, term69383.getClass(), "_vanillaProcessing", false);
        setField(term69383, term69383.getClass(), "_beanProperties", null);
        setField(term69383, term69383.getClass(), "_injectables", null);
        setField(term69383, term69383.getClass(), "_anySetter", null);
        setField(term69383, term69383.getClass(), "_ignorableProps", null);
        setBooleanField(term69383, term69383.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term69383, term69383.getClass(), "_needViewProcesing", false);
        setField(term69383, term69383.getClass(), "_backRefs", null);
        setField(term69383, term69383.getClass(), "_subDeserializers", null);
        setField(term69383, term69383.getClass(), "_unwrappedPropertyHandler", null);
        setField(term69383, term69383.getClass(), "_externalTypeIdHandler", null);
        setField(term69383, term69383.getClass(), "_objectIdReader", null);
        setField(term69383, term69383.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term69256;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69381));
        assertTrue(recursiveEquals(term69256, term69383));
    }

};


