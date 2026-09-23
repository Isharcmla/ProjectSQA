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

public class BeanDeserializer_init_1285872490137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32716;
     Object term32831;
     Object term32833;

    public BeanDeserializer_init_1285872490137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32604 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term32716 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32812 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term32716, term32716.getClass(), "_beanType", term32812);
        term32831 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32832 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term32831, term32831.getClass(), "_nullFromCreator", null);
        setField(term32831, term32831.getClass(), "_currentlyTransforming", null);
        setField(term32832, term32832.getClass(), "_componentType", null);
        setField(term32832, term32832.getClass(), "_emptyArray", null);
        setField(term32832, term32832.getClass(), "_superClass", null);
        setField(term32832, term32832.getClass(), "_superInterfaces", null);
        setField(term32832, term32832.getClass(), "_bindings", null);
        setField(term32832, term32832.getClass(), "_canonicalName", null);
        setField(term32832, term32832.getClass(), "_class", null);
        setIntField(term32832, term32832.getClass(), "_hash", 0);
        setField(term32832, term32832.getClass(), "_valueHandler", null);
        setField(term32832, term32832.getClass(), "_typeHandler", null);
        setBooleanField(term32832, term32832.getClass(), "_asStatic", false);
        setField(term32831, term32831.getClass(), "_beanType", term32832);
        setField(term32831, term32831.getClass(), "_serializationShape", null);
        setField(term32831, term32831.getClass(), "_valueInstantiator", null);
        setField(term32831, term32831.getClass(), "_delegateDeserializer", null);
        setField(term32831, term32831.getClass(), "_arrayDelegateDeserializer", null);
        setField(term32831, term32831.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term32831, term32831.getClass(), "_nonStandardCreation", false);
        setBooleanField(term32831, term32831.getClass(), "_vanillaProcessing", false);
        setField(term32831, term32831.getClass(), "_beanProperties", null);
        setField(term32831, term32831.getClass(), "_injectables", null);
        setField(term32831, term32831.getClass(), "_anySetter", null);
        setField(term32831, term32831.getClass(), "_ignorableProps", null);
        setBooleanField(term32831, term32831.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term32831, term32831.getClass(), "_needViewProcesing", false);
        setField(term32831, term32831.getClass(), "_backRefs", null);
        setField(term32831, term32831.getClass(), "_subDeserializers", null);
        setField(term32831, term32831.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32831, term32831.getClass(), "_externalTypeIdHandler", null);
        setField(term32831, term32831.getClass(), "_objectIdReader", null);
        setField(term32831, term32831.getClass(), "_valueClass", null);
        term32833 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32834 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term32833, term32833.getClass(), "_nullFromCreator", null);
        setField(term32833, term32833.getClass(), "_currentlyTransforming", null);
        setField(term32834, term32834.getClass(), "_componentType", null);
        setField(term32834, term32834.getClass(), "_emptyArray", null);
        setField(term32834, term32834.getClass(), "_superClass", null);
        setField(term32834, term32834.getClass(), "_superInterfaces", null);
        setField(term32834, term32834.getClass(), "_bindings", null);
        setField(term32834, term32834.getClass(), "_canonicalName", null);
        setField(term32834, term32834.getClass(), "_class", null);
        setIntField(term32834, term32834.getClass(), "_hash", 0);
        setField(term32834, term32834.getClass(), "_valueHandler", null);
        setField(term32834, term32834.getClass(), "_typeHandler", null);
        setBooleanField(term32834, term32834.getClass(), "_asStatic", false);
        setField(term32833, term32833.getClass(), "_beanType", term32834);
        setField(term32833, term32833.getClass(), "_serializationShape", null);
        setField(term32833, term32833.getClass(), "_valueInstantiator", null);
        setField(term32833, term32833.getClass(), "_delegateDeserializer", null);
        setField(term32833, term32833.getClass(), "_arrayDelegateDeserializer", null);
        setField(term32833, term32833.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term32833, term32833.getClass(), "_nonStandardCreation", false);
        setBooleanField(term32833, term32833.getClass(), "_vanillaProcessing", false);
        setField(term32833, term32833.getClass(), "_beanProperties", null);
        setField(term32833, term32833.getClass(), "_injectables", null);
        setField(term32833, term32833.getClass(), "_anySetter", null);
        setField(term32833, term32833.getClass(), "_ignorableProps", null);
        setBooleanField(term32833, term32833.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term32833, term32833.getClass(), "_needViewProcesing", false);
        setField(term32833, term32833.getClass(), "_backRefs", null);
        setField(term32833, term32833.getClass(), "_subDeserializers", null);
        setField(term32833, term32833.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32833, term32833.getClass(), "_externalTypeIdHandler", null);
        setField(term32833, term32833.getClass(), "_objectIdReader", null);
        setField(term32833, term32833.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term32716;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32831));
        assertTrue(recursiveEquals(term32716, term32833));
    }

};


