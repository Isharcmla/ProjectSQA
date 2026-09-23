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

public class BeanDeserializer_init_9967408976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13437;
     Object term14478;
     Object term14480;

    public BeanDeserializer_init_9967408976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term13437 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term13533 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term13437, term13437.getClass(), "_beanType", term13533);
        term14478 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14479 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term14478, term14478.getClass(), "_nullFromCreator", null);
        setField(term14478, term14478.getClass(), "_currentlyTransforming", null);
        setField(term14479, term14479.getClass(), "_componentType", null);
        setField(term14479, term14479.getClass(), "_emptyArray", null);
        setField(term14479, term14479.getClass(), "_superClass", null);
        setField(term14479, term14479.getClass(), "_superInterfaces", null);
        setField(term14479, term14479.getClass(), "_bindings", null);
        setField(term14479, term14479.getClass(), "_canonicalName", null);
        setField(term14479, term14479.getClass(), "_class", null);
        setIntField(term14479, term14479.getClass(), "_hash", 0);
        setField(term14479, term14479.getClass(), "_valueHandler", null);
        setField(term14479, term14479.getClass(), "_typeHandler", null);
        setBooleanField(term14479, term14479.getClass(), "_asStatic", false);
        setField(term14478, term14478.getClass(), "_beanType", term14479);
        setField(term14478, term14478.getClass(), "_serializationShape", null);
        setField(term14478, term14478.getClass(), "_valueInstantiator", null);
        setField(term14478, term14478.getClass(), "_delegateDeserializer", null);
        setField(term14478, term14478.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14478, term14478.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14478, term14478.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14478, term14478.getClass(), "_vanillaProcessing", false);
        setField(term14478, term14478.getClass(), "_beanProperties", null);
        setField(term14478, term14478.getClass(), "_injectables", null);
        setField(term14478, term14478.getClass(), "_anySetter", null);
        setField(term14478, term14478.getClass(), "_ignorableProps", null);
        setBooleanField(term14478, term14478.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14478, term14478.getClass(), "_needViewProcesing", false);
        setField(term14478, term14478.getClass(), "_backRefs", null);
        setField(term14478, term14478.getClass(), "_subDeserializers", null);
        setField(term14478, term14478.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14478, term14478.getClass(), "_externalTypeIdHandler", null);
        setField(term14478, term14478.getClass(), "_objectIdReader", null);
        setField(term14478, term14478.getClass(), "_valueClass", null);
        term14480 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14481 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term14480, term14480.getClass(), "_nullFromCreator", null);
        setField(term14480, term14480.getClass(), "_currentlyTransforming", null);
        setField(term14481, term14481.getClass(), "_componentType", null);
        setField(term14481, term14481.getClass(), "_emptyArray", null);
        setField(term14481, term14481.getClass(), "_superClass", null);
        setField(term14481, term14481.getClass(), "_superInterfaces", null);
        setField(term14481, term14481.getClass(), "_bindings", null);
        setField(term14481, term14481.getClass(), "_canonicalName", null);
        setField(term14481, term14481.getClass(), "_class", null);
        setIntField(term14481, term14481.getClass(), "_hash", 0);
        setField(term14481, term14481.getClass(), "_valueHandler", null);
        setField(term14481, term14481.getClass(), "_typeHandler", null);
        setBooleanField(term14481, term14481.getClass(), "_asStatic", false);
        setField(term14480, term14480.getClass(), "_beanType", term14481);
        setField(term14480, term14480.getClass(), "_serializationShape", null);
        setField(term14480, term14480.getClass(), "_valueInstantiator", null);
        setField(term14480, term14480.getClass(), "_delegateDeserializer", null);
        setField(term14480, term14480.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14480, term14480.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14480, term14480.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14480, term14480.getClass(), "_vanillaProcessing", false);
        setField(term14480, term14480.getClass(), "_beanProperties", null);
        setField(term14480, term14480.getClass(), "_injectables", null);
        setField(term14480, term14480.getClass(), "_anySetter", null);
        setField(term14480, term14480.getClass(), "_ignorableProps", null);
        setBooleanField(term14480, term14480.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14480, term14480.getClass(), "_needViewProcesing", false);
        setField(term14480, term14480.getClass(), "_backRefs", null);
        setField(term14480, term14480.getClass(), "_subDeserializers", null);
        setField(term14480, term14480.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14480, term14480.getClass(), "_externalTypeIdHandler", null);
        setField(term14480, term14480.getClass(), "_objectIdReader", null);
        setField(term14480, term14480.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term13437;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14478));
        assertTrue(recursiveEquals(term13437, term14480));
    }

};


