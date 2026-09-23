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

public class BeanDeserializer_init_1285872490105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29171;
     Object term29286;
     Object term29288;

    public BeanDeserializer_init_1285872490105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29059 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term29171 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29267 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term29171, term29171.getClass(), "_beanType", term29267);
        term29286 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29287 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term29286, term29286.getClass(), "_classAnnotations", null);
        setField(term29287, term29287.getClass(), "_componentType", null);
        setField(term29287, term29287.getClass(), "_emptyArray", null);
        setField(term29287, term29287.getClass(), "_canonicalName", null);
        setField(term29287, term29287.getClass(), "_class", null);
        setIntField(term29287, term29287.getClass(), "_hash", 0);
        setField(term29287, term29287.getClass(), "_valueHandler", null);
        setField(term29287, term29287.getClass(), "_typeHandler", null);
        setBooleanField(term29287, term29287.getClass(), "_asStatic", false);
        setField(term29286, term29286.getClass(), "_beanType", term29287);
        setField(term29286, term29286.getClass(), "_serializationShape", null);
        setField(term29286, term29286.getClass(), "_valueInstantiator", null);
        setField(term29286, term29286.getClass(), "_delegateDeserializer", null);
        setField(term29286, term29286.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term29286, term29286.getClass(), "_nonStandardCreation", false);
        setBooleanField(term29286, term29286.getClass(), "_vanillaProcessing", false);
        setField(term29286, term29286.getClass(), "_beanProperties", null);
        setField(term29286, term29286.getClass(), "_injectables", null);
        setField(term29286, term29286.getClass(), "_anySetter", null);
        setField(term29286, term29286.getClass(), "_ignorableProps", null);
        setBooleanField(term29286, term29286.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term29286, term29286.getClass(), "_needViewProcesing", false);
        setField(term29286, term29286.getClass(), "_backRefs", null);
        setField(term29286, term29286.getClass(), "_subDeserializers", null);
        setField(term29286, term29286.getClass(), "_unwrappedPropertyHandler", null);
        setField(term29286, term29286.getClass(), "_externalTypeIdHandler", null);
        setField(term29286, term29286.getClass(), "_objectIdReader", null);
        setField(term29286, term29286.getClass(), "_valueClass", null);
        term29288 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29289 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term29288, term29288.getClass(), "_classAnnotations", null);
        setField(term29289, term29289.getClass(), "_componentType", null);
        setField(term29289, term29289.getClass(), "_emptyArray", null);
        setField(term29289, term29289.getClass(), "_canonicalName", null);
        setField(term29289, term29289.getClass(), "_class", null);
        setIntField(term29289, term29289.getClass(), "_hash", 0);
        setField(term29289, term29289.getClass(), "_valueHandler", null);
        setField(term29289, term29289.getClass(), "_typeHandler", null);
        setBooleanField(term29289, term29289.getClass(), "_asStatic", false);
        setField(term29288, term29288.getClass(), "_beanType", term29289);
        setField(term29288, term29288.getClass(), "_serializationShape", null);
        setField(term29288, term29288.getClass(), "_valueInstantiator", null);
        setField(term29288, term29288.getClass(), "_delegateDeserializer", null);
        setField(term29288, term29288.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term29288, term29288.getClass(), "_nonStandardCreation", false);
        setBooleanField(term29288, term29288.getClass(), "_vanillaProcessing", false);
        setField(term29288, term29288.getClass(), "_beanProperties", null);
        setField(term29288, term29288.getClass(), "_injectables", null);
        setField(term29288, term29288.getClass(), "_anySetter", null);
        setField(term29288, term29288.getClass(), "_ignorableProps", null);
        setBooleanField(term29288, term29288.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term29288, term29288.getClass(), "_needViewProcesing", false);
        setField(term29288, term29288.getClass(), "_backRefs", null);
        setField(term29288, term29288.getClass(), "_subDeserializers", null);
        setField(term29288, term29288.getClass(), "_unwrappedPropertyHandler", null);
        setField(term29288, term29288.getClass(), "_externalTypeIdHandler", null);
        setField(term29288, term29288.getClass(), "_objectIdReader", null);
        setField(term29288, term29288.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term29171;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29286));
        assertTrue(recursiveEquals(term29171, term29288));
    }

};


