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

public class BeanDeserializer_init_1678761736119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33777;
     Object term33890;
     Object term33892;

    public BeanDeserializer_init_1678761736119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33665 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term33777 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term33777, term33777.getClass(), "_beanType", term33869);
        term33890 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33891 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term33890, term33890.getClass(), "_classAnnotations", null);
        setField(term33891, term33891.getClass(), "_keyType", null);
        setField(term33891, term33891.getClass(), "_valueType", null);
        setField(term33891, term33891.getClass(), "_canonicalName", null);
        setField(term33891, term33891.getClass(), "_class", null);
        setIntField(term33891, term33891.getClass(), "_hash", 0);
        setField(term33891, term33891.getClass(), "_valueHandler", null);
        setField(term33891, term33891.getClass(), "_typeHandler", null);
        setBooleanField(term33891, term33891.getClass(), "_asStatic", false);
        setField(term33890, term33890.getClass(), "_beanType", term33891);
        setField(term33890, term33890.getClass(), "_serializationShape", null);
        setField(term33890, term33890.getClass(), "_valueInstantiator", null);
        setField(term33890, term33890.getClass(), "_delegateDeserializer", null);
        setField(term33890, term33890.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33890, term33890.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33890, term33890.getClass(), "_vanillaProcessing", false);
        setField(term33890, term33890.getClass(), "_beanProperties", null);
        setField(term33890, term33890.getClass(), "_injectables", null);
        setField(term33890, term33890.getClass(), "_anySetter", null);
        setField(term33890, term33890.getClass(), "_ignorableProps", null);
        setBooleanField(term33890, term33890.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33890, term33890.getClass(), "_needViewProcesing", false);
        setField(term33890, term33890.getClass(), "_backRefs", null);
        setField(term33890, term33890.getClass(), "_subDeserializers", null);
        setField(term33890, term33890.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33890, term33890.getClass(), "_externalTypeIdHandler", null);
        setField(term33890, term33890.getClass(), "_objectIdReader", null);
        setField(term33890, term33890.getClass(), "_valueClass", null);
        term33892 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33893 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term33892, term33892.getClass(), "_classAnnotations", null);
        setField(term33893, term33893.getClass(), "_keyType", null);
        setField(term33893, term33893.getClass(), "_valueType", null);
        setField(term33893, term33893.getClass(), "_canonicalName", null);
        setField(term33893, term33893.getClass(), "_class", null);
        setIntField(term33893, term33893.getClass(), "_hash", 0);
        setField(term33893, term33893.getClass(), "_valueHandler", null);
        setField(term33893, term33893.getClass(), "_typeHandler", null);
        setBooleanField(term33893, term33893.getClass(), "_asStatic", false);
        setField(term33892, term33892.getClass(), "_beanType", term33893);
        setField(term33892, term33892.getClass(), "_serializationShape", null);
        setField(term33892, term33892.getClass(), "_valueInstantiator", null);
        setField(term33892, term33892.getClass(), "_delegateDeserializer", null);
        setField(term33892, term33892.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33892, term33892.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33892, term33892.getClass(), "_vanillaProcessing", false);
        setField(term33892, term33892.getClass(), "_beanProperties", null);
        setField(term33892, term33892.getClass(), "_injectables", null);
        setField(term33892, term33892.getClass(), "_anySetter", null);
        setField(term33892, term33892.getClass(), "_ignorableProps", null);
        setBooleanField(term33892, term33892.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33892, term33892.getClass(), "_needViewProcesing", false);
        setField(term33892, term33892.getClass(), "_backRefs", null);
        setField(term33892, term33892.getClass(), "_subDeserializers", null);
        setField(term33892, term33892.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33892, term33892.getClass(), "_externalTypeIdHandler", null);
        setField(term33892, term33892.getClass(), "_objectIdReader", null);
        setField(term33892, term33892.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term33777;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33890));
        assertTrue(recursiveEquals(term33777, term33892));
    }

};


