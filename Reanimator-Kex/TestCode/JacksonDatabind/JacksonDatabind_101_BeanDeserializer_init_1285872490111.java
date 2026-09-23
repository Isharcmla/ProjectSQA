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

public class BeanDeserializer_init_1285872490111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23325;
     Object term23471;
     Object term23473;

    public BeanDeserializer_init_1285872490111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23213 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term23325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23431 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term23325, term23325.getClass(), "_beanType", term23431);
        term23471 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23472 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term23471, term23471.getClass(), "_nullFromCreator", null);
        setField(term23471, term23471.getClass(), "_currentlyTransforming", null);
        setField(term23472, term23472.getClass(), "_elementType", null);
        setField(term23472, term23472.getClass(), "_superClass", null);
        setField(term23472, term23472.getClass(), "_superInterfaces", null);
        setField(term23472, term23472.getClass(), "_bindings", null);
        setField(term23472, term23472.getClass(), "_canonicalName", null);
        setField(term23472, term23472.getClass(), "_class", null);
        setIntField(term23472, term23472.getClass(), "_hash", 0);
        setField(term23472, term23472.getClass(), "_valueHandler", null);
        setField(term23472, term23472.getClass(), "_typeHandler", null);
        setBooleanField(term23472, term23472.getClass(), "_asStatic", false);
        setField(term23471, term23471.getClass(), "_beanType", term23472);
        setField(term23471, term23471.getClass(), "_serializationShape", null);
        setField(term23471, term23471.getClass(), "_valueInstantiator", null);
        setField(term23471, term23471.getClass(), "_delegateDeserializer", null);
        setField(term23471, term23471.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23471, term23471.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23471, term23471.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23471, term23471.getClass(), "_vanillaProcessing", false);
        setField(term23471, term23471.getClass(), "_beanProperties", null);
        setField(term23471, term23471.getClass(), "_injectables", null);
        setField(term23471, term23471.getClass(), "_anySetter", null);
        setField(term23471, term23471.getClass(), "_ignorableProps", null);
        setBooleanField(term23471, term23471.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23471, term23471.getClass(), "_needViewProcesing", false);
        setField(term23471, term23471.getClass(), "_backRefs", null);
        setField(term23471, term23471.getClass(), "_subDeserializers", null);
        setField(term23471, term23471.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23471, term23471.getClass(), "_externalTypeIdHandler", null);
        setField(term23471, term23471.getClass(), "_objectIdReader", null);
        setField(term23471, term23471.getClass(), "_valueClass", null);
        term23473 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23474 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term23473, term23473.getClass(), "_nullFromCreator", null);
        setField(term23473, term23473.getClass(), "_currentlyTransforming", null);
        setField(term23474, term23474.getClass(), "_elementType", null);
        setField(term23474, term23474.getClass(), "_superClass", null);
        setField(term23474, term23474.getClass(), "_superInterfaces", null);
        setField(term23474, term23474.getClass(), "_bindings", null);
        setField(term23474, term23474.getClass(), "_canonicalName", null);
        setField(term23474, term23474.getClass(), "_class", null);
        setIntField(term23474, term23474.getClass(), "_hash", 0);
        setField(term23474, term23474.getClass(), "_valueHandler", null);
        setField(term23474, term23474.getClass(), "_typeHandler", null);
        setBooleanField(term23474, term23474.getClass(), "_asStatic", false);
        setField(term23473, term23473.getClass(), "_beanType", term23474);
        setField(term23473, term23473.getClass(), "_serializationShape", null);
        setField(term23473, term23473.getClass(), "_valueInstantiator", null);
        setField(term23473, term23473.getClass(), "_delegateDeserializer", null);
        setField(term23473, term23473.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23473, term23473.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23473, term23473.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23473, term23473.getClass(), "_vanillaProcessing", false);
        setField(term23473, term23473.getClass(), "_beanProperties", null);
        setField(term23473, term23473.getClass(), "_injectables", null);
        setField(term23473, term23473.getClass(), "_anySetter", null);
        setField(term23473, term23473.getClass(), "_ignorableProps", null);
        setBooleanField(term23473, term23473.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23473, term23473.getClass(), "_needViewProcesing", false);
        setField(term23473, term23473.getClass(), "_backRefs", null);
        setField(term23473, term23473.getClass(), "_subDeserializers", null);
        setField(term23473, term23473.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23473, term23473.getClass(), "_externalTypeIdHandler", null);
        setField(term23473, term23473.getClass(), "_objectIdReader", null);
        setField(term23473, term23473.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23325;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23471));
        assertTrue(recursiveEquals(term23325, term23473));
    }

};


