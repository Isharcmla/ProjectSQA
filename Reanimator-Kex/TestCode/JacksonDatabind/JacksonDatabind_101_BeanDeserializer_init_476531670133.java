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

public class BeanDeserializer_init_476531670133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31941;
     Object term32052;
     Object term32054;

    public BeanDeserializer_init_476531670133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31829 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term31941 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32033 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setBooleanField(term31941, term31941.getClass(), "_ignoreAllUnknown", false);
        setField(term31941, term31941.getClass(), "_beanType", term32033);
        term32052 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32053 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term32052, term32052.getClass(), "_nullFromCreator", null);
        setField(term32052, term32052.getClass(), "_currentlyTransforming", null);
        setField(term32053, term32053.getClass(), "_keyType", null);
        setField(term32053, term32053.getClass(), "_valueType", null);
        setField(term32053, term32053.getClass(), "_superClass", null);
        setField(term32053, term32053.getClass(), "_superInterfaces", null);
        setField(term32053, term32053.getClass(), "_bindings", null);
        setField(term32053, term32053.getClass(), "_canonicalName", null);
        setField(term32053, term32053.getClass(), "_class", null);
        setIntField(term32053, term32053.getClass(), "_hash", 0);
        setField(term32053, term32053.getClass(), "_valueHandler", null);
        setField(term32053, term32053.getClass(), "_typeHandler", null);
        setBooleanField(term32053, term32053.getClass(), "_asStatic", false);
        setField(term32052, term32052.getClass(), "_beanType", term32053);
        setField(term32052, term32052.getClass(), "_serializationShape", null);
        setField(term32052, term32052.getClass(), "_valueInstantiator", null);
        setField(term32052, term32052.getClass(), "_delegateDeserializer", null);
        setField(term32052, term32052.getClass(), "_arrayDelegateDeserializer", null);
        setField(term32052, term32052.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term32052, term32052.getClass(), "_nonStandardCreation", false);
        setBooleanField(term32052, term32052.getClass(), "_vanillaProcessing", false);
        setField(term32052, term32052.getClass(), "_beanProperties", null);
        setField(term32052, term32052.getClass(), "_injectables", null);
        setField(term32052, term32052.getClass(), "_anySetter", null);
        setField(term32052, term32052.getClass(), "_ignorableProps", null);
        setBooleanField(term32052, term32052.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term32052, term32052.getClass(), "_needViewProcesing", false);
        setField(term32052, term32052.getClass(), "_backRefs", null);
        setField(term32052, term32052.getClass(), "_subDeserializers", null);
        setField(term32052, term32052.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32052, term32052.getClass(), "_externalTypeIdHandler", null);
        setField(term32052, term32052.getClass(), "_objectIdReader", null);
        setField(term32052, term32052.getClass(), "_valueClass", null);
        term32054 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32055 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term32054, term32054.getClass(), "_nullFromCreator", null);
        setField(term32054, term32054.getClass(), "_currentlyTransforming", null);
        setField(term32055, term32055.getClass(), "_keyType", null);
        setField(term32055, term32055.getClass(), "_valueType", null);
        setField(term32055, term32055.getClass(), "_superClass", null);
        setField(term32055, term32055.getClass(), "_superInterfaces", null);
        setField(term32055, term32055.getClass(), "_bindings", null);
        setField(term32055, term32055.getClass(), "_canonicalName", null);
        setField(term32055, term32055.getClass(), "_class", null);
        setIntField(term32055, term32055.getClass(), "_hash", 0);
        setField(term32055, term32055.getClass(), "_valueHandler", null);
        setField(term32055, term32055.getClass(), "_typeHandler", null);
        setBooleanField(term32055, term32055.getClass(), "_asStatic", false);
        setField(term32054, term32054.getClass(), "_beanType", term32055);
        setField(term32054, term32054.getClass(), "_serializationShape", null);
        setField(term32054, term32054.getClass(), "_valueInstantiator", null);
        setField(term32054, term32054.getClass(), "_delegateDeserializer", null);
        setField(term32054, term32054.getClass(), "_arrayDelegateDeserializer", null);
        setField(term32054, term32054.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term32054, term32054.getClass(), "_nonStandardCreation", false);
        setBooleanField(term32054, term32054.getClass(), "_vanillaProcessing", false);
        setField(term32054, term32054.getClass(), "_beanProperties", null);
        setField(term32054, term32054.getClass(), "_injectables", null);
        setField(term32054, term32054.getClass(), "_anySetter", null);
        setField(term32054, term32054.getClass(), "_ignorableProps", null);
        setBooleanField(term32054, term32054.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term32054, term32054.getClass(), "_needViewProcesing", false);
        setField(term32054, term32054.getClass(), "_backRefs", null);
        setField(term32054, term32054.getClass(), "_subDeserializers", null);
        setField(term32054, term32054.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32054, term32054.getClass(), "_externalTypeIdHandler", null);
        setField(term32054, term32054.getClass(), "_objectIdReader", null);
        setField(term32054, term32054.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term31941;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32052));
        assertTrue(recursiveEquals(term31941, term32054));
    }

};


