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

public class BeanDeserializer_init_99674089105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28451;
     Object term28562;
     Object term28564;

    public BeanDeserializer_init_99674089105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28339 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term28451, term28451.getClass(), "_beanType", term28543);
        term28562 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28563 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term28562, term28562.getClass(), "_nullFromCreator", null);
        setField(term28562, term28562.getClass(), "_classAnnotations", null);
        setField(term28563, term28563.getClass(), "_keyType", null);
        setField(term28563, term28563.getClass(), "_valueType", null);
        setField(term28563, term28563.getClass(), "_superClass", null);
        setField(term28563, term28563.getClass(), "_superInterfaces", null);
        setField(term28563, term28563.getClass(), "_bindings", null);
        setField(term28563, term28563.getClass(), "_canonicalName", null);
        setField(term28563, term28563.getClass(), "_class", null);
        setIntField(term28563, term28563.getClass(), "_hash", 0);
        setField(term28563, term28563.getClass(), "_valueHandler", null);
        setField(term28563, term28563.getClass(), "_typeHandler", null);
        setBooleanField(term28563, term28563.getClass(), "_asStatic", false);
        setField(term28562, term28562.getClass(), "_beanType", term28563);
        setField(term28562, term28562.getClass(), "_serializationShape", null);
        setField(term28562, term28562.getClass(), "_valueInstantiator", null);
        setField(term28562, term28562.getClass(), "_delegateDeserializer", null);
        setField(term28562, term28562.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28562, term28562.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28562, term28562.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28562, term28562.getClass(), "_vanillaProcessing", false);
        setField(term28562, term28562.getClass(), "_beanProperties", null);
        setField(term28562, term28562.getClass(), "_injectables", null);
        setField(term28562, term28562.getClass(), "_anySetter", null);
        setField(term28562, term28562.getClass(), "_ignorableProps", null);
        setBooleanField(term28562, term28562.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28562, term28562.getClass(), "_needViewProcesing", false);
        setField(term28562, term28562.getClass(), "_backRefs", null);
        setField(term28562, term28562.getClass(), "_subDeserializers", null);
        setField(term28562, term28562.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28562, term28562.getClass(), "_externalTypeIdHandler", null);
        setField(term28562, term28562.getClass(), "_objectIdReader", null);
        setField(term28562, term28562.getClass(), "_valueClass", null);
        term28564 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28565 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term28564, term28564.getClass(), "_nullFromCreator", null);
        setField(term28564, term28564.getClass(), "_classAnnotations", null);
        setField(term28565, term28565.getClass(), "_keyType", null);
        setField(term28565, term28565.getClass(), "_valueType", null);
        setField(term28565, term28565.getClass(), "_superClass", null);
        setField(term28565, term28565.getClass(), "_superInterfaces", null);
        setField(term28565, term28565.getClass(), "_bindings", null);
        setField(term28565, term28565.getClass(), "_canonicalName", null);
        setField(term28565, term28565.getClass(), "_class", null);
        setIntField(term28565, term28565.getClass(), "_hash", 0);
        setField(term28565, term28565.getClass(), "_valueHandler", null);
        setField(term28565, term28565.getClass(), "_typeHandler", null);
        setBooleanField(term28565, term28565.getClass(), "_asStatic", false);
        setField(term28564, term28564.getClass(), "_beanType", term28565);
        setField(term28564, term28564.getClass(), "_serializationShape", null);
        setField(term28564, term28564.getClass(), "_valueInstantiator", null);
        setField(term28564, term28564.getClass(), "_delegateDeserializer", null);
        setField(term28564, term28564.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28564, term28564.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28564, term28564.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28564, term28564.getClass(), "_vanillaProcessing", false);
        setField(term28564, term28564.getClass(), "_beanProperties", null);
        setField(term28564, term28564.getClass(), "_injectables", null);
        setField(term28564, term28564.getClass(), "_anySetter", null);
        setField(term28564, term28564.getClass(), "_ignorableProps", null);
        setBooleanField(term28564, term28564.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28564, term28564.getClass(), "_needViewProcesing", false);
        setField(term28564, term28564.getClass(), "_backRefs", null);
        setField(term28564, term28564.getClass(), "_subDeserializers", null);
        setField(term28564, term28564.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28564, term28564.getClass(), "_externalTypeIdHandler", null);
        setField(term28564, term28564.getClass(), "_objectIdReader", null);
        setField(term28564, term28564.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term28451;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28562));
        assertTrue(recursiveEquals(term28451, term28564));
    }

};


