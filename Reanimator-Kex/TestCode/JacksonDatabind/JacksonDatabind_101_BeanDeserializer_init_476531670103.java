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

public class BeanDeserializer_init_476531670103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21100;
     Object term21239;
     Object term21241;

    public BeanDeserializer_init_476531670103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20988 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term21100 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term21196 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setBooleanField(term21100, term21100.getClass(), "_ignoreAllUnknown", false);
        setField(term21100, term21100.getClass(), "_beanType", term21196);
        term21239 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term21240 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term21239, term21239.getClass(), "_nullFromCreator", null);
        setField(term21239, term21239.getClass(), "_currentlyTransforming", null);
        setField(term21240, term21240.getClass(), "_componentType", null);
        setField(term21240, term21240.getClass(), "_emptyArray", null);
        setField(term21240, term21240.getClass(), "_superClass", null);
        setField(term21240, term21240.getClass(), "_superInterfaces", null);
        setField(term21240, term21240.getClass(), "_bindings", null);
        setField(term21240, term21240.getClass(), "_canonicalName", null);
        setField(term21240, term21240.getClass(), "_class", null);
        setIntField(term21240, term21240.getClass(), "_hash", 0);
        setField(term21240, term21240.getClass(), "_valueHandler", null);
        setField(term21240, term21240.getClass(), "_typeHandler", null);
        setBooleanField(term21240, term21240.getClass(), "_asStatic", false);
        setField(term21239, term21239.getClass(), "_beanType", term21240);
        setField(term21239, term21239.getClass(), "_serializationShape", null);
        setField(term21239, term21239.getClass(), "_valueInstantiator", null);
        setField(term21239, term21239.getClass(), "_delegateDeserializer", null);
        setField(term21239, term21239.getClass(), "_arrayDelegateDeserializer", null);
        setField(term21239, term21239.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term21239, term21239.getClass(), "_nonStandardCreation", false);
        setBooleanField(term21239, term21239.getClass(), "_vanillaProcessing", false);
        setField(term21239, term21239.getClass(), "_beanProperties", null);
        setField(term21239, term21239.getClass(), "_injectables", null);
        setField(term21239, term21239.getClass(), "_anySetter", null);
        setField(term21239, term21239.getClass(), "_ignorableProps", null);
        setBooleanField(term21239, term21239.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term21239, term21239.getClass(), "_needViewProcesing", false);
        setField(term21239, term21239.getClass(), "_backRefs", null);
        setField(term21239, term21239.getClass(), "_subDeserializers", null);
        setField(term21239, term21239.getClass(), "_unwrappedPropertyHandler", null);
        setField(term21239, term21239.getClass(), "_externalTypeIdHandler", null);
        setField(term21239, term21239.getClass(), "_objectIdReader", null);
        setField(term21239, term21239.getClass(), "_valueClass", null);
        term21241 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term21242 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term21241, term21241.getClass(), "_nullFromCreator", null);
        setField(term21241, term21241.getClass(), "_currentlyTransforming", null);
        setField(term21242, term21242.getClass(), "_componentType", null);
        setField(term21242, term21242.getClass(), "_emptyArray", null);
        setField(term21242, term21242.getClass(), "_superClass", null);
        setField(term21242, term21242.getClass(), "_superInterfaces", null);
        setField(term21242, term21242.getClass(), "_bindings", null);
        setField(term21242, term21242.getClass(), "_canonicalName", null);
        setField(term21242, term21242.getClass(), "_class", null);
        setIntField(term21242, term21242.getClass(), "_hash", 0);
        setField(term21242, term21242.getClass(), "_valueHandler", null);
        setField(term21242, term21242.getClass(), "_typeHandler", null);
        setBooleanField(term21242, term21242.getClass(), "_asStatic", false);
        setField(term21241, term21241.getClass(), "_beanType", term21242);
        setField(term21241, term21241.getClass(), "_serializationShape", null);
        setField(term21241, term21241.getClass(), "_valueInstantiator", null);
        setField(term21241, term21241.getClass(), "_delegateDeserializer", null);
        setField(term21241, term21241.getClass(), "_arrayDelegateDeserializer", null);
        setField(term21241, term21241.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term21241, term21241.getClass(), "_nonStandardCreation", false);
        setBooleanField(term21241, term21241.getClass(), "_vanillaProcessing", false);
        setField(term21241, term21241.getClass(), "_beanProperties", null);
        setField(term21241, term21241.getClass(), "_injectables", null);
        setField(term21241, term21241.getClass(), "_anySetter", null);
        setField(term21241, term21241.getClass(), "_ignorableProps", null);
        setBooleanField(term21241, term21241.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term21241, term21241.getClass(), "_needViewProcesing", false);
        setField(term21241, term21241.getClass(), "_backRefs", null);
        setField(term21241, term21241.getClass(), "_subDeserializers", null);
        setField(term21241, term21241.getClass(), "_unwrappedPropertyHandler", null);
        setField(term21241, term21241.getClass(), "_externalTypeIdHandler", null);
        setField(term21241, term21241.getClass(), "_objectIdReader", null);
        setField(term21241, term21241.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term21100;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term21239));
        assertTrue(recursiveEquals(term21100, term21241));
    }

};


