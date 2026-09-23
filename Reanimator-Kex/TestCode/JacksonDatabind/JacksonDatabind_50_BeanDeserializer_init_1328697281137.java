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

public class BeanDeserializer_init_1328697281137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52555;
     Object term52665;
     Object term52667;

    public BeanDeserializer_init_1328697281137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term52443 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term52555 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term52647 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term52555, term52555.getClass(), "_beanType", term52647);
        term52665 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term52666 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term52665, term52665.getClass(), "_nullFromCreator", null);
        setField(term52665, term52665.getClass(), "_classAnnotations", null);
        setField(term52666, term52666.getClass(), "_keyType", null);
        setField(term52666, term52666.getClass(), "_valueType", null);
        setField(term52666, term52666.getClass(), "_superClass", null);
        setField(term52666, term52666.getClass(), "_superInterfaces", null);
        setField(term52666, term52666.getClass(), "_bindings", null);
        setField(term52666, term52666.getClass(), "_canonicalName", null);
        setField(term52666, term52666.getClass(), "_class", null);
        setIntField(term52666, term52666.getClass(), "_hash", 0);
        setField(term52666, term52666.getClass(), "_valueHandler", null);
        setField(term52666, term52666.getClass(), "_typeHandler", null);
        setBooleanField(term52666, term52666.getClass(), "_asStatic", false);
        setField(term52665, term52665.getClass(), "_beanType", term52666);
        setField(term52665, term52665.getClass(), "_serializationShape", null);
        setField(term52665, term52665.getClass(), "_valueInstantiator", null);
        setField(term52665, term52665.getClass(), "_delegateDeserializer", null);
        setField(term52665, term52665.getClass(), "_arrayDelegateDeserializer", null);
        setField(term52665, term52665.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term52665, term52665.getClass(), "_nonStandardCreation", false);
        setBooleanField(term52665, term52665.getClass(), "_vanillaProcessing", false);
        setField(term52665, term52665.getClass(), "_beanProperties", null);
        setField(term52665, term52665.getClass(), "_injectables", null);
        setField(term52665, term52665.getClass(), "_anySetter", null);
        setField(term52665, term52665.getClass(), "_ignorableProps", null);
        setBooleanField(term52665, term52665.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term52665, term52665.getClass(), "_needViewProcesing", false);
        setField(term52665, term52665.getClass(), "_backRefs", null);
        setField(term52665, term52665.getClass(), "_subDeserializers", null);
        setField(term52665, term52665.getClass(), "_unwrappedPropertyHandler", null);
        setField(term52665, term52665.getClass(), "_externalTypeIdHandler", null);
        setField(term52665, term52665.getClass(), "_objectIdReader", null);
        setField(term52665, term52665.getClass(), "_valueClass", null);
        term52667 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term52668 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term52667, term52667.getClass(), "_nullFromCreator", null);
        setField(term52667, term52667.getClass(), "_classAnnotations", null);
        setField(term52668, term52668.getClass(), "_keyType", null);
        setField(term52668, term52668.getClass(), "_valueType", null);
        setField(term52668, term52668.getClass(), "_superClass", null);
        setField(term52668, term52668.getClass(), "_superInterfaces", null);
        setField(term52668, term52668.getClass(), "_bindings", null);
        setField(term52668, term52668.getClass(), "_canonicalName", null);
        setField(term52668, term52668.getClass(), "_class", null);
        setIntField(term52668, term52668.getClass(), "_hash", 0);
        setField(term52668, term52668.getClass(), "_valueHandler", null);
        setField(term52668, term52668.getClass(), "_typeHandler", null);
        setBooleanField(term52668, term52668.getClass(), "_asStatic", false);
        setField(term52667, term52667.getClass(), "_beanType", term52668);
        setField(term52667, term52667.getClass(), "_serializationShape", null);
        setField(term52667, term52667.getClass(), "_valueInstantiator", null);
        setField(term52667, term52667.getClass(), "_delegateDeserializer", null);
        setField(term52667, term52667.getClass(), "_arrayDelegateDeserializer", null);
        setField(term52667, term52667.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term52667, term52667.getClass(), "_nonStandardCreation", false);
        setBooleanField(term52667, term52667.getClass(), "_vanillaProcessing", false);
        setField(term52667, term52667.getClass(), "_beanProperties", null);
        setField(term52667, term52667.getClass(), "_injectables", null);
        setField(term52667, term52667.getClass(), "_anySetter", null);
        setField(term52667, term52667.getClass(), "_ignorableProps", null);
        setBooleanField(term52667, term52667.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term52667, term52667.getClass(), "_needViewProcesing", false);
        setField(term52667, term52667.getClass(), "_backRefs", null);
        setField(term52667, term52667.getClass(), "_subDeserializers", null);
        setField(term52667, term52667.getClass(), "_unwrappedPropertyHandler", null);
        setField(term52667, term52667.getClass(), "_externalTypeIdHandler", null);
        setField(term52667, term52667.getClass(), "_objectIdReader", null);
        setField(term52667, term52667.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term52555;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term52665));
        assertTrue(recursiveEquals(term52555, term52667));
    }

};


