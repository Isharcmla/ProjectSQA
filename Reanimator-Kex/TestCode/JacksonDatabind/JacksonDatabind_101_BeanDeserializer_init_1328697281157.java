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

public class BeanDeserializer_init_1328697281157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39092;
     Object term39206;
     Object term39208;

    public BeanDeserializer_init_1328697281157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38980 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term39092 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term39188 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term39092, term39092.getClass(), "_beanType", term39188);
        term39206 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term39207 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term39206, term39206.getClass(), "_nullFromCreator", null);
        setField(term39206, term39206.getClass(), "_currentlyTransforming", null);
        setField(term39207, term39207.getClass(), "_componentType", null);
        setField(term39207, term39207.getClass(), "_emptyArray", null);
        setField(term39207, term39207.getClass(), "_superClass", null);
        setField(term39207, term39207.getClass(), "_superInterfaces", null);
        setField(term39207, term39207.getClass(), "_bindings", null);
        setField(term39207, term39207.getClass(), "_canonicalName", null);
        setField(term39207, term39207.getClass(), "_class", null);
        setIntField(term39207, term39207.getClass(), "_hash", 0);
        setField(term39207, term39207.getClass(), "_valueHandler", null);
        setField(term39207, term39207.getClass(), "_typeHandler", null);
        setBooleanField(term39207, term39207.getClass(), "_asStatic", false);
        setField(term39206, term39206.getClass(), "_beanType", term39207);
        setField(term39206, term39206.getClass(), "_serializationShape", null);
        setField(term39206, term39206.getClass(), "_valueInstantiator", null);
        setField(term39206, term39206.getClass(), "_delegateDeserializer", null);
        setField(term39206, term39206.getClass(), "_arrayDelegateDeserializer", null);
        setField(term39206, term39206.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term39206, term39206.getClass(), "_nonStandardCreation", false);
        setBooleanField(term39206, term39206.getClass(), "_vanillaProcessing", false);
        setField(term39206, term39206.getClass(), "_beanProperties", null);
        setField(term39206, term39206.getClass(), "_injectables", null);
        setField(term39206, term39206.getClass(), "_anySetter", null);
        setField(term39206, term39206.getClass(), "_ignorableProps", null);
        setBooleanField(term39206, term39206.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term39206, term39206.getClass(), "_needViewProcesing", false);
        setField(term39206, term39206.getClass(), "_backRefs", null);
        setField(term39206, term39206.getClass(), "_subDeserializers", null);
        setField(term39206, term39206.getClass(), "_unwrappedPropertyHandler", null);
        setField(term39206, term39206.getClass(), "_externalTypeIdHandler", null);
        setField(term39206, term39206.getClass(), "_objectIdReader", null);
        setField(term39206, term39206.getClass(), "_valueClass", null);
        term39208 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term39209 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term39208, term39208.getClass(), "_nullFromCreator", null);
        setField(term39208, term39208.getClass(), "_currentlyTransforming", null);
        setField(term39209, term39209.getClass(), "_componentType", null);
        setField(term39209, term39209.getClass(), "_emptyArray", null);
        setField(term39209, term39209.getClass(), "_superClass", null);
        setField(term39209, term39209.getClass(), "_superInterfaces", null);
        setField(term39209, term39209.getClass(), "_bindings", null);
        setField(term39209, term39209.getClass(), "_canonicalName", null);
        setField(term39209, term39209.getClass(), "_class", null);
        setIntField(term39209, term39209.getClass(), "_hash", 0);
        setField(term39209, term39209.getClass(), "_valueHandler", null);
        setField(term39209, term39209.getClass(), "_typeHandler", null);
        setBooleanField(term39209, term39209.getClass(), "_asStatic", false);
        setField(term39208, term39208.getClass(), "_beanType", term39209);
        setField(term39208, term39208.getClass(), "_serializationShape", null);
        setField(term39208, term39208.getClass(), "_valueInstantiator", null);
        setField(term39208, term39208.getClass(), "_delegateDeserializer", null);
        setField(term39208, term39208.getClass(), "_arrayDelegateDeserializer", null);
        setField(term39208, term39208.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term39208, term39208.getClass(), "_nonStandardCreation", false);
        setBooleanField(term39208, term39208.getClass(), "_vanillaProcessing", false);
        setField(term39208, term39208.getClass(), "_beanProperties", null);
        setField(term39208, term39208.getClass(), "_injectables", null);
        setField(term39208, term39208.getClass(), "_anySetter", null);
        setField(term39208, term39208.getClass(), "_ignorableProps", null);
        setBooleanField(term39208, term39208.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term39208, term39208.getClass(), "_needViewProcesing", false);
        setField(term39208, term39208.getClass(), "_backRefs", null);
        setField(term39208, term39208.getClass(), "_subDeserializers", null);
        setField(term39208, term39208.getClass(), "_unwrappedPropertyHandler", null);
        setField(term39208, term39208.getClass(), "_externalTypeIdHandler", null);
        setField(term39208, term39208.getClass(), "_objectIdReader", null);
        setField(term39208, term39208.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term39092;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39206));
        assertTrue(recursiveEquals(term39092, term39208));
    }

};


