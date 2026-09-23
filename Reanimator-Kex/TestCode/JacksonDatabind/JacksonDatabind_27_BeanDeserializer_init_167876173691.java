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
import java.lang.String;

public class BeanDeserializer_init_167876173691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24438;
     Object term25813;
     Object term25824;

    public BeanDeserializer_init_167876173691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24326 = Class.forName((String) "java.util.stream.ForEachOps$ForEachOrderedTask");
        Object term24290 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term24290, term24290.getClass(), "_valueClass", term24326);
        setField(term24290, term24290.getClass(), "_classAnnotations", null);
        setField(term24290, term24290.getClass(), "_beanType", null);
        setField(term24290, term24290.getClass(), "_valueInstantiator", null);
        setField(term24290, term24290.getClass(), "_delegateDeserializer", null);
        setField(term24290, term24290.getClass(), "_propertyBasedCreator", null);
        setField(term24290, term24290.getClass(), "_backRefs", null);
        setField(term24290, term24290.getClass(), "_ignorableProps", null);
        Class<? extends Object> term24572 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ConstantPool");
        term24438 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term24536 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term24688 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term24800 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term24536, term24536.getClass(), "_class", term24572);
        setField(term24438, term24438.getClass(), "_beanType", term24536);
        setField(term24438, term24438.getClass(), "_classAnnotations", term24688);
        setField(term24438, term24438.getClass(), "_valueInstantiator", null);
        setField(term24438, term24438.getClass(), "_delegateDeserializer", term24800);
        setField(term24438, term24438.getClass(), "_propertyBasedCreator", null);
        setField(term24438, term24438.getClass(), "_backRefs", null);
        setField(term24438, term24438.getClass(), "_ignorableProps", null);
        setBooleanField(term24438, term24438.getClass(), "_ignoreAllUnknown", true);
        Class<? extends Object> term25816 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult");
        term25813 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term25814 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term25815 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term25823 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term25814, term25814.getClass(), "_annotations", null);
        setField(term25813, term25813.getClass(), "_classAnnotations", term25814);
        setField(term25815, term25815.getClass(), "_typeParametersFor", null);
        setField(term25815, term25815.getClass(), "_typeParameters", null);
        setField(term25815, term25815.getClass(), "_typeNames", null);
        setField(term25815, term25815.getClass(), "_canonicalName", null);
        setField(term25815, term25815.getClass(), "_class", term25816);
        setIntField(term25815, term25815.getClass(), "_hash", 0);
        setField(term25815, term25815.getClass(), "_valueHandler", null);
        setField(term25815, term25815.getClass(), "_typeHandler", null);
        setBooleanField(term25815, term25815.getClass(), "_asStatic", false);
        setField(term25813, term25813.getClass(), "_beanType", term25815);
        setField(term25813, term25813.getClass(), "_serializationShape", null);
        setField(term25813, term25813.getClass(), "_valueInstantiator", null);
        setField(term25823, term25823.getClass(), "_classAnnotations", null);
        setField(term25823, term25823.getClass(), "_beanType", null);
        setField(term25823, term25823.getClass(), "_serializationShape", null);
        setField(term25823, term25823.getClass(), "_valueInstantiator", null);
        setField(term25823, term25823.getClass(), "_delegateDeserializer", null);
        setField(term25823, term25823.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term25823, term25823.getClass(), "_nonStandardCreation", false);
        setBooleanField(term25823, term25823.getClass(), "_vanillaProcessing", false);
        setField(term25823, term25823.getClass(), "_beanProperties", null);
        setField(term25823, term25823.getClass(), "_injectables", null);
        setField(term25823, term25823.getClass(), "_anySetter", null);
        setField(term25823, term25823.getClass(), "_ignorableProps", null);
        setBooleanField(term25823, term25823.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term25823, term25823.getClass(), "_needViewProcesing", false);
        setField(term25823, term25823.getClass(), "_backRefs", null);
        setField(term25823, term25823.getClass(), "_subDeserializers", null);
        setField(term25823, term25823.getClass(), "_unwrappedPropertyHandler", null);
        setField(term25823, term25823.getClass(), "_externalTypeIdHandler", null);
        setField(term25823, term25823.getClass(), "_objectIdReader", null);
        setField(term25823, term25823.getClass(), "_valueClass", null);
        setField(term25813, term25813.getClass(), "_delegateDeserializer", term25823);
        setField(term25813, term25813.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term25813, term25813.getClass(), "_nonStandardCreation", false);
        setBooleanField(term25813, term25813.getClass(), "_vanillaProcessing", false);
        setField(term25813, term25813.getClass(), "_beanProperties", null);
        setField(term25813, term25813.getClass(), "_injectables", null);
        setField(term25813, term25813.getClass(), "_anySetter", null);
        setField(term25813, term25813.getClass(), "_ignorableProps", null);
        setBooleanField(term25813, term25813.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term25813, term25813.getClass(), "_needViewProcesing", false);
        setField(term25813, term25813.getClass(), "_backRefs", null);
        setField(term25813, term25813.getClass(), "_subDeserializers", null);
        setField(term25813, term25813.getClass(), "_unwrappedPropertyHandler", null);
        setField(term25813, term25813.getClass(), "_externalTypeIdHandler", null);
        setField(term25813, term25813.getClass(), "_objectIdReader", null);
        setField(term25813, term25813.getClass(), "_valueClass", term25816);
        Class<? extends Object> term25827 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult");
        term25824 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term25825 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term25826 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term25834 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term25825, term25825.getClass(), "_annotations", null);
        setField(term25824, term25824.getClass(), "_classAnnotations", term25825);
        setField(term25826, term25826.getClass(), "_typeParametersFor", null);
        setField(term25826, term25826.getClass(), "_typeParameters", null);
        setField(term25826, term25826.getClass(), "_typeNames", null);
        setField(term25826, term25826.getClass(), "_canonicalName", null);
        setField(term25826, term25826.getClass(), "_class", term25827);
        setIntField(term25826, term25826.getClass(), "_hash", 0);
        setField(term25826, term25826.getClass(), "_valueHandler", null);
        setField(term25826, term25826.getClass(), "_typeHandler", null);
        setBooleanField(term25826, term25826.getClass(), "_asStatic", false);
        setField(term25824, term25824.getClass(), "_beanType", term25826);
        setField(term25824, term25824.getClass(), "_serializationShape", null);
        setField(term25824, term25824.getClass(), "_valueInstantiator", null);
        setField(term25834, term25834.getClass(), "_classAnnotations", null);
        setField(term25834, term25834.getClass(), "_beanType", null);
        setField(term25834, term25834.getClass(), "_serializationShape", null);
        setField(term25834, term25834.getClass(), "_valueInstantiator", null);
        setField(term25834, term25834.getClass(), "_delegateDeserializer", null);
        setField(term25834, term25834.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term25834, term25834.getClass(), "_nonStandardCreation", false);
        setBooleanField(term25834, term25834.getClass(), "_vanillaProcessing", false);
        setField(term25834, term25834.getClass(), "_beanProperties", null);
        setField(term25834, term25834.getClass(), "_injectables", null);
        setField(term25834, term25834.getClass(), "_anySetter", null);
        setField(term25834, term25834.getClass(), "_ignorableProps", null);
        setBooleanField(term25834, term25834.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term25834, term25834.getClass(), "_needViewProcesing", false);
        setField(term25834, term25834.getClass(), "_backRefs", null);
        setField(term25834, term25834.getClass(), "_subDeserializers", null);
        setField(term25834, term25834.getClass(), "_unwrappedPropertyHandler", null);
        setField(term25834, term25834.getClass(), "_externalTypeIdHandler", null);
        setField(term25834, term25834.getClass(), "_objectIdReader", null);
        setField(term25834, term25834.getClass(), "_valueClass", null);
        setField(term25824, term25824.getClass(), "_delegateDeserializer", term25834);
        setField(term25824, term25824.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term25824, term25824.getClass(), "_nonStandardCreation", false);
        setBooleanField(term25824, term25824.getClass(), "_vanillaProcessing", false);
        setField(term25824, term25824.getClass(), "_beanProperties", null);
        setField(term25824, term25824.getClass(), "_injectables", null);
        setField(term25824, term25824.getClass(), "_anySetter", null);
        setField(term25824, term25824.getClass(), "_ignorableProps", null);
        setBooleanField(term25824, term25824.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term25824, term25824.getClass(), "_needViewProcesing", false);
        setField(term25824, term25824.getClass(), "_backRefs", null);
        setField(term25824, term25824.getClass(), "_subDeserializers", null);
        setField(term25824, term25824.getClass(), "_unwrappedPropertyHandler", null);
        setField(term25824, term25824.getClass(), "_externalTypeIdHandler", null);
        setField(term25824, term25824.getClass(), "_objectIdReader", null);
        setField(term25824, term25824.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term24438;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25813));
        assertTrue(recursiveEquals(term24438, term25824));
    }

};


