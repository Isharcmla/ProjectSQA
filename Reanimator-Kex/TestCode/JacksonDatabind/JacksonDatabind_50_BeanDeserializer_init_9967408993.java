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

public class BeanDeserializer_init_9967408993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19362;
     Object term19477;
     Object term19479;

    public BeanDeserializer_init_9967408993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19250 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term19362 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term19458 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term19362, term19362.getClass(), "_beanType", term19458);
        term19477 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term19478 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term19477, term19477.getClass(), "_nullFromCreator", null);
        setField(term19477, term19477.getClass(), "_classAnnotations", null);
        setField(term19478, term19478.getClass(), "_componentType", null);
        setField(term19478, term19478.getClass(), "_emptyArray", null);
        setField(term19478, term19478.getClass(), "_superClass", null);
        setField(term19478, term19478.getClass(), "_superInterfaces", null);
        setField(term19478, term19478.getClass(), "_bindings", null);
        setField(term19478, term19478.getClass(), "_canonicalName", null);
        setField(term19478, term19478.getClass(), "_class", null);
        setIntField(term19478, term19478.getClass(), "_hash", 0);
        setField(term19478, term19478.getClass(), "_valueHandler", null);
        setField(term19478, term19478.getClass(), "_typeHandler", null);
        setBooleanField(term19478, term19478.getClass(), "_asStatic", false);
        setField(term19477, term19477.getClass(), "_beanType", term19478);
        setField(term19477, term19477.getClass(), "_serializationShape", null);
        setField(term19477, term19477.getClass(), "_valueInstantiator", null);
        setField(term19477, term19477.getClass(), "_delegateDeserializer", null);
        setField(term19477, term19477.getClass(), "_arrayDelegateDeserializer", null);
        setField(term19477, term19477.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term19477, term19477.getClass(), "_nonStandardCreation", false);
        setBooleanField(term19477, term19477.getClass(), "_vanillaProcessing", false);
        setField(term19477, term19477.getClass(), "_beanProperties", null);
        setField(term19477, term19477.getClass(), "_injectables", null);
        setField(term19477, term19477.getClass(), "_anySetter", null);
        setField(term19477, term19477.getClass(), "_ignorableProps", null);
        setBooleanField(term19477, term19477.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term19477, term19477.getClass(), "_needViewProcesing", false);
        setField(term19477, term19477.getClass(), "_backRefs", null);
        setField(term19477, term19477.getClass(), "_subDeserializers", null);
        setField(term19477, term19477.getClass(), "_unwrappedPropertyHandler", null);
        setField(term19477, term19477.getClass(), "_externalTypeIdHandler", null);
        setField(term19477, term19477.getClass(), "_objectIdReader", null);
        setField(term19477, term19477.getClass(), "_valueClass", null);
        term19479 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term19480 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term19479, term19479.getClass(), "_nullFromCreator", null);
        setField(term19479, term19479.getClass(), "_classAnnotations", null);
        setField(term19480, term19480.getClass(), "_componentType", null);
        setField(term19480, term19480.getClass(), "_emptyArray", null);
        setField(term19480, term19480.getClass(), "_superClass", null);
        setField(term19480, term19480.getClass(), "_superInterfaces", null);
        setField(term19480, term19480.getClass(), "_bindings", null);
        setField(term19480, term19480.getClass(), "_canonicalName", null);
        setField(term19480, term19480.getClass(), "_class", null);
        setIntField(term19480, term19480.getClass(), "_hash", 0);
        setField(term19480, term19480.getClass(), "_valueHandler", null);
        setField(term19480, term19480.getClass(), "_typeHandler", null);
        setBooleanField(term19480, term19480.getClass(), "_asStatic", false);
        setField(term19479, term19479.getClass(), "_beanType", term19480);
        setField(term19479, term19479.getClass(), "_serializationShape", null);
        setField(term19479, term19479.getClass(), "_valueInstantiator", null);
        setField(term19479, term19479.getClass(), "_delegateDeserializer", null);
        setField(term19479, term19479.getClass(), "_arrayDelegateDeserializer", null);
        setField(term19479, term19479.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term19479, term19479.getClass(), "_nonStandardCreation", false);
        setBooleanField(term19479, term19479.getClass(), "_vanillaProcessing", false);
        setField(term19479, term19479.getClass(), "_beanProperties", null);
        setField(term19479, term19479.getClass(), "_injectables", null);
        setField(term19479, term19479.getClass(), "_anySetter", null);
        setField(term19479, term19479.getClass(), "_ignorableProps", null);
        setBooleanField(term19479, term19479.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term19479, term19479.getClass(), "_needViewProcesing", false);
        setField(term19479, term19479.getClass(), "_backRefs", null);
        setField(term19479, term19479.getClass(), "_subDeserializers", null);
        setField(term19479, term19479.getClass(), "_unwrappedPropertyHandler", null);
        setField(term19479, term19479.getClass(), "_externalTypeIdHandler", null);
        setField(term19479, term19479.getClass(), "_objectIdReader", null);
        setField(term19479, term19479.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term19362;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term19477));
        assertTrue(recursiveEquals(term19362, term19479));
    }

};


