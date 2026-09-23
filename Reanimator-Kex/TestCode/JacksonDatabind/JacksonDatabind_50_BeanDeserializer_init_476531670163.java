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

public class BeanDeserializer_init_476531670163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78482;
     Object term78607;
     Object term78609;

    public BeanDeserializer_init_476531670163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78370 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term78482 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setBooleanField(term78482, term78482.getClass(), "_ignoreAllUnknown", false);
        setField(term78482, term78482.getClass(), "_beanType", term78588);
        term78607 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78608 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term78607, term78607.getClass(), "_nullFromCreator", null);
        setField(term78607, term78607.getClass(), "_classAnnotations", null);
        setField(term78608, term78608.getClass(), "_elementType", null);
        setField(term78608, term78608.getClass(), "_superClass", null);
        setField(term78608, term78608.getClass(), "_superInterfaces", null);
        setField(term78608, term78608.getClass(), "_bindings", null);
        setField(term78608, term78608.getClass(), "_canonicalName", null);
        setField(term78608, term78608.getClass(), "_class", null);
        setIntField(term78608, term78608.getClass(), "_hash", 0);
        setField(term78608, term78608.getClass(), "_valueHandler", null);
        setField(term78608, term78608.getClass(), "_typeHandler", null);
        setBooleanField(term78608, term78608.getClass(), "_asStatic", false);
        setField(term78607, term78607.getClass(), "_beanType", term78608);
        setField(term78607, term78607.getClass(), "_serializationShape", null);
        setField(term78607, term78607.getClass(), "_valueInstantiator", null);
        setField(term78607, term78607.getClass(), "_delegateDeserializer", null);
        setField(term78607, term78607.getClass(), "_arrayDelegateDeserializer", null);
        setField(term78607, term78607.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term78607, term78607.getClass(), "_nonStandardCreation", false);
        setBooleanField(term78607, term78607.getClass(), "_vanillaProcessing", false);
        setField(term78607, term78607.getClass(), "_beanProperties", null);
        setField(term78607, term78607.getClass(), "_injectables", null);
        setField(term78607, term78607.getClass(), "_anySetter", null);
        setField(term78607, term78607.getClass(), "_ignorableProps", null);
        setBooleanField(term78607, term78607.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term78607, term78607.getClass(), "_needViewProcesing", false);
        setField(term78607, term78607.getClass(), "_backRefs", null);
        setField(term78607, term78607.getClass(), "_subDeserializers", null);
        setField(term78607, term78607.getClass(), "_unwrappedPropertyHandler", null);
        setField(term78607, term78607.getClass(), "_externalTypeIdHandler", null);
        setField(term78607, term78607.getClass(), "_objectIdReader", null);
        setField(term78607, term78607.getClass(), "_valueClass", null);
        term78609 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term78610 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term78609, term78609.getClass(), "_nullFromCreator", null);
        setField(term78609, term78609.getClass(), "_classAnnotations", null);
        setField(term78610, term78610.getClass(), "_elementType", null);
        setField(term78610, term78610.getClass(), "_superClass", null);
        setField(term78610, term78610.getClass(), "_superInterfaces", null);
        setField(term78610, term78610.getClass(), "_bindings", null);
        setField(term78610, term78610.getClass(), "_canonicalName", null);
        setField(term78610, term78610.getClass(), "_class", null);
        setIntField(term78610, term78610.getClass(), "_hash", 0);
        setField(term78610, term78610.getClass(), "_valueHandler", null);
        setField(term78610, term78610.getClass(), "_typeHandler", null);
        setBooleanField(term78610, term78610.getClass(), "_asStatic", false);
        setField(term78609, term78609.getClass(), "_beanType", term78610);
        setField(term78609, term78609.getClass(), "_serializationShape", null);
        setField(term78609, term78609.getClass(), "_valueInstantiator", null);
        setField(term78609, term78609.getClass(), "_delegateDeserializer", null);
        setField(term78609, term78609.getClass(), "_arrayDelegateDeserializer", null);
        setField(term78609, term78609.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term78609, term78609.getClass(), "_nonStandardCreation", false);
        setBooleanField(term78609, term78609.getClass(), "_vanillaProcessing", false);
        setField(term78609, term78609.getClass(), "_beanProperties", null);
        setField(term78609, term78609.getClass(), "_injectables", null);
        setField(term78609, term78609.getClass(), "_anySetter", null);
        setField(term78609, term78609.getClass(), "_ignorableProps", null);
        setBooleanField(term78609, term78609.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term78609, term78609.getClass(), "_needViewProcesing", false);
        setField(term78609, term78609.getClass(), "_backRefs", null);
        setField(term78609, term78609.getClass(), "_subDeserializers", null);
        setField(term78609, term78609.getClass(), "_unwrappedPropertyHandler", null);
        setField(term78609, term78609.getClass(), "_externalTypeIdHandler", null);
        setField(term78609, term78609.getClass(), "_objectIdReader", null);
        setField(term78609, term78609.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term78482;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78607));
        assertTrue(recursiveEquals(term78482, term78609));
    }

};


