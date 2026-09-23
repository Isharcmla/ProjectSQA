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

public class BeanDeserializer_init_99674089117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26231;
     Object term26354;
     Object term26356;

    public BeanDeserializer_init_99674089117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26119 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term26231 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26335 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26231, term26231.getClass(), "_beanType", term26335);
        term26354 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26355 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26354, term26354.getClass(), "_nullFromCreator", null);
        setField(term26354, term26354.getClass(), "_currentlyTransforming", null);
        setField(term26355, term26355.getClass(), "_referencedType", null);
        setField(term26355, term26355.getClass(), "_anchorType", null);
        setField(term26355, term26355.getClass(), "_superClass", null);
        setField(term26355, term26355.getClass(), "_superInterfaces", null);
        setField(term26355, term26355.getClass(), "_bindings", null);
        setField(term26355, term26355.getClass(), "_canonicalName", null);
        setField(term26355, term26355.getClass(), "_class", null);
        setIntField(term26355, term26355.getClass(), "_hash", 0);
        setField(term26355, term26355.getClass(), "_valueHandler", null);
        setField(term26355, term26355.getClass(), "_typeHandler", null);
        setBooleanField(term26355, term26355.getClass(), "_asStatic", false);
        setField(term26354, term26354.getClass(), "_beanType", term26355);
        setField(term26354, term26354.getClass(), "_serializationShape", null);
        setField(term26354, term26354.getClass(), "_valueInstantiator", null);
        setField(term26354, term26354.getClass(), "_delegateDeserializer", null);
        setField(term26354, term26354.getClass(), "_arrayDelegateDeserializer", null);
        setField(term26354, term26354.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term26354, term26354.getClass(), "_nonStandardCreation", false);
        setBooleanField(term26354, term26354.getClass(), "_vanillaProcessing", false);
        setField(term26354, term26354.getClass(), "_beanProperties", null);
        setField(term26354, term26354.getClass(), "_injectables", null);
        setField(term26354, term26354.getClass(), "_anySetter", null);
        setField(term26354, term26354.getClass(), "_ignorableProps", null);
        setBooleanField(term26354, term26354.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term26354, term26354.getClass(), "_needViewProcesing", false);
        setField(term26354, term26354.getClass(), "_backRefs", null);
        setField(term26354, term26354.getClass(), "_subDeserializers", null);
        setField(term26354, term26354.getClass(), "_unwrappedPropertyHandler", null);
        setField(term26354, term26354.getClass(), "_externalTypeIdHandler", null);
        setField(term26354, term26354.getClass(), "_objectIdReader", null);
        setField(term26354, term26354.getClass(), "_valueClass", null);
        term26356 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term26357 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26356, term26356.getClass(), "_nullFromCreator", null);
        setField(term26356, term26356.getClass(), "_currentlyTransforming", null);
        setField(term26357, term26357.getClass(), "_referencedType", null);
        setField(term26357, term26357.getClass(), "_anchorType", null);
        setField(term26357, term26357.getClass(), "_superClass", null);
        setField(term26357, term26357.getClass(), "_superInterfaces", null);
        setField(term26357, term26357.getClass(), "_bindings", null);
        setField(term26357, term26357.getClass(), "_canonicalName", null);
        setField(term26357, term26357.getClass(), "_class", null);
        setIntField(term26357, term26357.getClass(), "_hash", 0);
        setField(term26357, term26357.getClass(), "_valueHandler", null);
        setField(term26357, term26357.getClass(), "_typeHandler", null);
        setBooleanField(term26357, term26357.getClass(), "_asStatic", false);
        setField(term26356, term26356.getClass(), "_beanType", term26357);
        setField(term26356, term26356.getClass(), "_serializationShape", null);
        setField(term26356, term26356.getClass(), "_valueInstantiator", null);
        setField(term26356, term26356.getClass(), "_delegateDeserializer", null);
        setField(term26356, term26356.getClass(), "_arrayDelegateDeserializer", null);
        setField(term26356, term26356.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term26356, term26356.getClass(), "_nonStandardCreation", false);
        setBooleanField(term26356, term26356.getClass(), "_vanillaProcessing", false);
        setField(term26356, term26356.getClass(), "_beanProperties", null);
        setField(term26356, term26356.getClass(), "_injectables", null);
        setField(term26356, term26356.getClass(), "_anySetter", null);
        setField(term26356, term26356.getClass(), "_ignorableProps", null);
        setBooleanField(term26356, term26356.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term26356, term26356.getClass(), "_needViewProcesing", false);
        setField(term26356, term26356.getClass(), "_backRefs", null);
        setField(term26356, term26356.getClass(), "_subDeserializers", null);
        setField(term26356, term26356.getClass(), "_unwrappedPropertyHandler", null);
        setField(term26356, term26356.getClass(), "_externalTypeIdHandler", null);
        setField(term26356, term26356.getClass(), "_objectIdReader", null);
        setField(term26356, term26356.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term26231;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26354));
        assertTrue(recursiveEquals(term26231, term26356));
    }

};


