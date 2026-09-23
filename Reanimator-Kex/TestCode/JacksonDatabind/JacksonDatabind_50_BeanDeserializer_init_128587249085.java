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

public class BeanDeserializer_init_128587249085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14649;
     Object term14760;
     Object term14762;

    public BeanDeserializer_init_128587249085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14537 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term14649 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14741 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term14649, term14649.getClass(), "_beanType", term14741);
        term14760 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14761 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term14760, term14760.getClass(), "_nullFromCreator", null);
        setField(term14760, term14760.getClass(), "_classAnnotations", null);
        setField(term14761, term14761.getClass(), "_keyType", null);
        setField(term14761, term14761.getClass(), "_valueType", null);
        setField(term14761, term14761.getClass(), "_superClass", null);
        setField(term14761, term14761.getClass(), "_superInterfaces", null);
        setField(term14761, term14761.getClass(), "_bindings", null);
        setField(term14761, term14761.getClass(), "_canonicalName", null);
        setField(term14761, term14761.getClass(), "_class", null);
        setIntField(term14761, term14761.getClass(), "_hash", 0);
        setField(term14761, term14761.getClass(), "_valueHandler", null);
        setField(term14761, term14761.getClass(), "_typeHandler", null);
        setBooleanField(term14761, term14761.getClass(), "_asStatic", false);
        setField(term14760, term14760.getClass(), "_beanType", term14761);
        setField(term14760, term14760.getClass(), "_serializationShape", null);
        setField(term14760, term14760.getClass(), "_valueInstantiator", null);
        setField(term14760, term14760.getClass(), "_delegateDeserializer", null);
        setField(term14760, term14760.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14760, term14760.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14760, term14760.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14760, term14760.getClass(), "_vanillaProcessing", false);
        setField(term14760, term14760.getClass(), "_beanProperties", null);
        setField(term14760, term14760.getClass(), "_injectables", null);
        setField(term14760, term14760.getClass(), "_anySetter", null);
        setField(term14760, term14760.getClass(), "_ignorableProps", null);
        setBooleanField(term14760, term14760.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14760, term14760.getClass(), "_needViewProcesing", false);
        setField(term14760, term14760.getClass(), "_backRefs", null);
        setField(term14760, term14760.getClass(), "_subDeserializers", null);
        setField(term14760, term14760.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14760, term14760.getClass(), "_externalTypeIdHandler", null);
        setField(term14760, term14760.getClass(), "_objectIdReader", null);
        setField(term14760, term14760.getClass(), "_valueClass", null);
        term14762 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14763 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term14762, term14762.getClass(), "_nullFromCreator", null);
        setField(term14762, term14762.getClass(), "_classAnnotations", null);
        setField(term14763, term14763.getClass(), "_keyType", null);
        setField(term14763, term14763.getClass(), "_valueType", null);
        setField(term14763, term14763.getClass(), "_superClass", null);
        setField(term14763, term14763.getClass(), "_superInterfaces", null);
        setField(term14763, term14763.getClass(), "_bindings", null);
        setField(term14763, term14763.getClass(), "_canonicalName", null);
        setField(term14763, term14763.getClass(), "_class", null);
        setIntField(term14763, term14763.getClass(), "_hash", 0);
        setField(term14763, term14763.getClass(), "_valueHandler", null);
        setField(term14763, term14763.getClass(), "_typeHandler", null);
        setBooleanField(term14763, term14763.getClass(), "_asStatic", false);
        setField(term14762, term14762.getClass(), "_beanType", term14763);
        setField(term14762, term14762.getClass(), "_serializationShape", null);
        setField(term14762, term14762.getClass(), "_valueInstantiator", null);
        setField(term14762, term14762.getClass(), "_delegateDeserializer", null);
        setField(term14762, term14762.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14762, term14762.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14762, term14762.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14762, term14762.getClass(), "_vanillaProcessing", false);
        setField(term14762, term14762.getClass(), "_beanProperties", null);
        setField(term14762, term14762.getClass(), "_injectables", null);
        setField(term14762, term14762.getClass(), "_anySetter", null);
        setField(term14762, term14762.getClass(), "_ignorableProps", null);
        setBooleanField(term14762, term14762.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14762, term14762.getClass(), "_needViewProcesing", false);
        setField(term14762, term14762.getClass(), "_backRefs", null);
        setField(term14762, term14762.getClass(), "_subDeserializers", null);
        setField(term14762, term14762.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14762, term14762.getClass(), "_externalTypeIdHandler", null);
        setField(term14762, term14762.getClass(), "_objectIdReader", null);
        setField(term14762, term14762.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term14649;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14760));
        assertTrue(recursiveEquals(term14649, term14762));
    }

};


