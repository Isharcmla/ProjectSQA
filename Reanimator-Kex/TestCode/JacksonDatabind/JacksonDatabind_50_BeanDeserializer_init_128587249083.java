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

public class BeanDeserializer_init_128587249083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13769;
     Object term14403;
     Object term14405;

    public BeanDeserializer_init_128587249083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13657 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term13769 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term13861 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term13769, term13769.getClass(), "_beanType", term13861);
        term14403 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term14403, term14403.getClass(), "_nullFromCreator", null);
        setField(term14403, term14403.getClass(), "_classAnnotations", null);
        setField(term14404, term14404.getClass(), "_keyType", null);
        setField(term14404, term14404.getClass(), "_valueType", null);
        setField(term14404, term14404.getClass(), "_superClass", null);
        setField(term14404, term14404.getClass(), "_superInterfaces", null);
        setField(term14404, term14404.getClass(), "_bindings", null);
        setField(term14404, term14404.getClass(), "_canonicalName", null);
        setField(term14404, term14404.getClass(), "_class", null);
        setIntField(term14404, term14404.getClass(), "_hash", 0);
        setField(term14404, term14404.getClass(), "_valueHandler", null);
        setField(term14404, term14404.getClass(), "_typeHandler", null);
        setBooleanField(term14404, term14404.getClass(), "_asStatic", false);
        setField(term14403, term14403.getClass(), "_beanType", term14404);
        setField(term14403, term14403.getClass(), "_serializationShape", null);
        setField(term14403, term14403.getClass(), "_valueInstantiator", null);
        setField(term14403, term14403.getClass(), "_delegateDeserializer", null);
        setField(term14403, term14403.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14403, term14403.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14403, term14403.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14403, term14403.getClass(), "_vanillaProcessing", false);
        setField(term14403, term14403.getClass(), "_beanProperties", null);
        setField(term14403, term14403.getClass(), "_injectables", null);
        setField(term14403, term14403.getClass(), "_anySetter", null);
        setField(term14403, term14403.getClass(), "_ignorableProps", null);
        setBooleanField(term14403, term14403.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14403, term14403.getClass(), "_needViewProcesing", false);
        setField(term14403, term14403.getClass(), "_backRefs", null);
        setField(term14403, term14403.getClass(), "_subDeserializers", null);
        setField(term14403, term14403.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14403, term14403.getClass(), "_externalTypeIdHandler", null);
        setField(term14403, term14403.getClass(), "_objectIdReader", null);
        setField(term14403, term14403.getClass(), "_valueClass", null);
        term14405 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term14406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term14405, term14405.getClass(), "_nullFromCreator", null);
        setField(term14405, term14405.getClass(), "_classAnnotations", null);
        setField(term14406, term14406.getClass(), "_keyType", null);
        setField(term14406, term14406.getClass(), "_valueType", null);
        setField(term14406, term14406.getClass(), "_superClass", null);
        setField(term14406, term14406.getClass(), "_superInterfaces", null);
        setField(term14406, term14406.getClass(), "_bindings", null);
        setField(term14406, term14406.getClass(), "_canonicalName", null);
        setField(term14406, term14406.getClass(), "_class", null);
        setIntField(term14406, term14406.getClass(), "_hash", 0);
        setField(term14406, term14406.getClass(), "_valueHandler", null);
        setField(term14406, term14406.getClass(), "_typeHandler", null);
        setBooleanField(term14406, term14406.getClass(), "_asStatic", false);
        setField(term14405, term14405.getClass(), "_beanType", term14406);
        setField(term14405, term14405.getClass(), "_serializationShape", null);
        setField(term14405, term14405.getClass(), "_valueInstantiator", null);
        setField(term14405, term14405.getClass(), "_delegateDeserializer", null);
        setField(term14405, term14405.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14405, term14405.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14405, term14405.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14405, term14405.getClass(), "_vanillaProcessing", false);
        setField(term14405, term14405.getClass(), "_beanProperties", null);
        setField(term14405, term14405.getClass(), "_injectables", null);
        setField(term14405, term14405.getClass(), "_anySetter", null);
        setField(term14405, term14405.getClass(), "_ignorableProps", null);
        setBooleanField(term14405, term14405.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14405, term14405.getClass(), "_needViewProcesing", false);
        setField(term14405, term14405.getClass(), "_backRefs", null);
        setField(term14405, term14405.getClass(), "_subDeserializers", null);
        setField(term14405, term14405.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14405, term14405.getClass(), "_externalTypeIdHandler", null);
        setField(term14405, term14405.getClass(), "_objectIdReader", null);
        setField(term14405, term14405.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term13769;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14403));
        assertTrue(recursiveEquals(term13769, term14405));
    }

};


