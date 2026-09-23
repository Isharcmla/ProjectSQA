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

public class BeanDeserializer_init_1678761736139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33075;
     Object term33192;
     Object term33194;

    public BeanDeserializer_init_1678761736139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32963 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term33075 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33171 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33075, term33075.getClass(), "_beanType", term33171);
        term33192 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33193 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33192, term33192.getClass(), "_nullFromCreator", null);
        setField(term33192, term33192.getClass(), "_currentlyTransforming", null);
        setField(term33193, term33193.getClass(), "_componentType", null);
        setField(term33193, term33193.getClass(), "_emptyArray", null);
        setField(term33193, term33193.getClass(), "_superClass", null);
        setField(term33193, term33193.getClass(), "_superInterfaces", null);
        setField(term33193, term33193.getClass(), "_bindings", null);
        setField(term33193, term33193.getClass(), "_canonicalName", null);
        setField(term33193, term33193.getClass(), "_class", null);
        setIntField(term33193, term33193.getClass(), "_hash", 0);
        setField(term33193, term33193.getClass(), "_valueHandler", null);
        setField(term33193, term33193.getClass(), "_typeHandler", null);
        setBooleanField(term33193, term33193.getClass(), "_asStatic", false);
        setField(term33192, term33192.getClass(), "_beanType", term33193);
        setField(term33192, term33192.getClass(), "_serializationShape", null);
        setField(term33192, term33192.getClass(), "_valueInstantiator", null);
        setField(term33192, term33192.getClass(), "_delegateDeserializer", null);
        setField(term33192, term33192.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33192, term33192.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33192, term33192.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33192, term33192.getClass(), "_vanillaProcessing", false);
        setField(term33192, term33192.getClass(), "_beanProperties", null);
        setField(term33192, term33192.getClass(), "_injectables", null);
        setField(term33192, term33192.getClass(), "_anySetter", null);
        setField(term33192, term33192.getClass(), "_ignorableProps", null);
        setBooleanField(term33192, term33192.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33192, term33192.getClass(), "_needViewProcesing", false);
        setField(term33192, term33192.getClass(), "_backRefs", null);
        setField(term33192, term33192.getClass(), "_subDeserializers", null);
        setField(term33192, term33192.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33192, term33192.getClass(), "_externalTypeIdHandler", null);
        setField(term33192, term33192.getClass(), "_objectIdReader", null);
        setField(term33192, term33192.getClass(), "_valueClass", null);
        term33194 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33195 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term33194, term33194.getClass(), "_nullFromCreator", null);
        setField(term33194, term33194.getClass(), "_currentlyTransforming", null);
        setField(term33195, term33195.getClass(), "_componentType", null);
        setField(term33195, term33195.getClass(), "_emptyArray", null);
        setField(term33195, term33195.getClass(), "_superClass", null);
        setField(term33195, term33195.getClass(), "_superInterfaces", null);
        setField(term33195, term33195.getClass(), "_bindings", null);
        setField(term33195, term33195.getClass(), "_canonicalName", null);
        setField(term33195, term33195.getClass(), "_class", null);
        setIntField(term33195, term33195.getClass(), "_hash", 0);
        setField(term33195, term33195.getClass(), "_valueHandler", null);
        setField(term33195, term33195.getClass(), "_typeHandler", null);
        setBooleanField(term33195, term33195.getClass(), "_asStatic", false);
        setField(term33194, term33194.getClass(), "_beanType", term33195);
        setField(term33194, term33194.getClass(), "_serializationShape", null);
        setField(term33194, term33194.getClass(), "_valueInstantiator", null);
        setField(term33194, term33194.getClass(), "_delegateDeserializer", null);
        setField(term33194, term33194.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33194, term33194.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33194, term33194.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33194, term33194.getClass(), "_vanillaProcessing", false);
        setField(term33194, term33194.getClass(), "_beanProperties", null);
        setField(term33194, term33194.getClass(), "_injectables", null);
        setField(term33194, term33194.getClass(), "_anySetter", null);
        setField(term33194, term33194.getClass(), "_ignorableProps", null);
        setBooleanField(term33194, term33194.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33194, term33194.getClass(), "_needViewProcesing", false);
        setField(term33194, term33194.getClass(), "_backRefs", null);
        setField(term33194, term33194.getClass(), "_subDeserializers", null);
        setField(term33194, term33194.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33194, term33194.getClass(), "_externalTypeIdHandler", null);
        setField(term33194, term33194.getClass(), "_objectIdReader", null);
        setField(term33194, term33194.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term33075;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33192));
        assertTrue(recursiveEquals(term33075, term33194));
    }

};


