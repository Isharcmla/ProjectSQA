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

public class BeanDeserializer_init_1678761736123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35569;
     Object term36298;
     Object term36300;

    public BeanDeserializer_init_1678761736123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35457 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term35569 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term35661 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term35569, term35569.getClass(), "_beanType", term35661);
        term36298 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term36298, term36298.getClass(), "_classAnnotations", null);
        setField(term36299, term36299.getClass(), "_keyType", null);
        setField(term36299, term36299.getClass(), "_valueType", null);
        setField(term36299, term36299.getClass(), "_canonicalName", null);
        setField(term36299, term36299.getClass(), "_class", null);
        setIntField(term36299, term36299.getClass(), "_hash", 0);
        setField(term36299, term36299.getClass(), "_valueHandler", null);
        setField(term36299, term36299.getClass(), "_typeHandler", null);
        setBooleanField(term36299, term36299.getClass(), "_asStatic", false);
        setField(term36298, term36298.getClass(), "_beanType", term36299);
        setField(term36298, term36298.getClass(), "_serializationShape", null);
        setField(term36298, term36298.getClass(), "_valueInstantiator", null);
        setField(term36298, term36298.getClass(), "_delegateDeserializer", null);
        setField(term36298, term36298.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36298, term36298.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36298, term36298.getClass(), "_vanillaProcessing", false);
        setField(term36298, term36298.getClass(), "_beanProperties", null);
        setField(term36298, term36298.getClass(), "_injectables", null);
        setField(term36298, term36298.getClass(), "_anySetter", null);
        setField(term36298, term36298.getClass(), "_ignorableProps", null);
        setBooleanField(term36298, term36298.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36298, term36298.getClass(), "_needViewProcesing", false);
        setField(term36298, term36298.getClass(), "_backRefs", null);
        setField(term36298, term36298.getClass(), "_subDeserializers", null);
        setField(term36298, term36298.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36298, term36298.getClass(), "_externalTypeIdHandler", null);
        setField(term36298, term36298.getClass(), "_objectIdReader", null);
        setField(term36298, term36298.getClass(), "_valueClass", null);
        term36300 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36301 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term36300, term36300.getClass(), "_classAnnotations", null);
        setField(term36301, term36301.getClass(), "_keyType", null);
        setField(term36301, term36301.getClass(), "_valueType", null);
        setField(term36301, term36301.getClass(), "_canonicalName", null);
        setField(term36301, term36301.getClass(), "_class", null);
        setIntField(term36301, term36301.getClass(), "_hash", 0);
        setField(term36301, term36301.getClass(), "_valueHandler", null);
        setField(term36301, term36301.getClass(), "_typeHandler", null);
        setBooleanField(term36301, term36301.getClass(), "_asStatic", false);
        setField(term36300, term36300.getClass(), "_beanType", term36301);
        setField(term36300, term36300.getClass(), "_serializationShape", null);
        setField(term36300, term36300.getClass(), "_valueInstantiator", null);
        setField(term36300, term36300.getClass(), "_delegateDeserializer", null);
        setField(term36300, term36300.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36300, term36300.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36300, term36300.getClass(), "_vanillaProcessing", false);
        setField(term36300, term36300.getClass(), "_beanProperties", null);
        setField(term36300, term36300.getClass(), "_injectables", null);
        setField(term36300, term36300.getClass(), "_anySetter", null);
        setField(term36300, term36300.getClass(), "_ignorableProps", null);
        setBooleanField(term36300, term36300.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36300, term36300.getClass(), "_needViewProcesing", false);
        setField(term36300, term36300.getClass(), "_backRefs", null);
        setField(term36300, term36300.getClass(), "_subDeserializers", null);
        setField(term36300, term36300.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36300, term36300.getClass(), "_externalTypeIdHandler", null);
        setField(term36300, term36300.getClass(), "_objectIdReader", null);
        setField(term36300, term36300.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term35569;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36298));
        assertTrue(recursiveEquals(term35569, term36300));
    }

};


