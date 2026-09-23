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

public class BeanDeserializer_init_47653167073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12508;
     Object term12647;
     Object term12649;

    public BeanDeserializer_init_47653167073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12396 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term12508 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12600 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setBooleanField(term12508, term12508.getClass(), "_ignoreAllUnknown", false);
        setField(term12508, term12508.getClass(), "_beanType", term12600);
        term12647 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12648 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term12647, term12647.getClass(), "_classAnnotations", null);
        setField(term12648, term12648.getClass(), "_keyType", null);
        setField(term12648, term12648.getClass(), "_valueType", null);
        setField(term12648, term12648.getClass(), "_canonicalName", null);
        setField(term12648, term12648.getClass(), "_class", null);
        setIntField(term12648, term12648.getClass(), "_hash", 0);
        setField(term12648, term12648.getClass(), "_valueHandler", null);
        setField(term12648, term12648.getClass(), "_typeHandler", null);
        setBooleanField(term12648, term12648.getClass(), "_asStatic", false);
        setField(term12647, term12647.getClass(), "_beanType", term12648);
        setField(term12647, term12647.getClass(), "_serializationShape", null);
        setField(term12647, term12647.getClass(), "_valueInstantiator", null);
        setField(term12647, term12647.getClass(), "_delegateDeserializer", null);
        setField(term12647, term12647.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12647, term12647.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12647, term12647.getClass(), "_vanillaProcessing", false);
        setField(term12647, term12647.getClass(), "_beanProperties", null);
        setField(term12647, term12647.getClass(), "_injectables", null);
        setField(term12647, term12647.getClass(), "_anySetter", null);
        setField(term12647, term12647.getClass(), "_ignorableProps", null);
        setBooleanField(term12647, term12647.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12647, term12647.getClass(), "_needViewProcesing", false);
        setField(term12647, term12647.getClass(), "_backRefs", null);
        setField(term12647, term12647.getClass(), "_subDeserializers", null);
        setField(term12647, term12647.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12647, term12647.getClass(), "_externalTypeIdHandler", null);
        setField(term12647, term12647.getClass(), "_objectIdReader", null);
        setField(term12647, term12647.getClass(), "_valueClass", null);
        term12649 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12650 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term12649, term12649.getClass(), "_classAnnotations", null);
        setField(term12650, term12650.getClass(), "_keyType", null);
        setField(term12650, term12650.getClass(), "_valueType", null);
        setField(term12650, term12650.getClass(), "_canonicalName", null);
        setField(term12650, term12650.getClass(), "_class", null);
        setIntField(term12650, term12650.getClass(), "_hash", 0);
        setField(term12650, term12650.getClass(), "_valueHandler", null);
        setField(term12650, term12650.getClass(), "_typeHandler", null);
        setBooleanField(term12650, term12650.getClass(), "_asStatic", false);
        setField(term12649, term12649.getClass(), "_beanType", term12650);
        setField(term12649, term12649.getClass(), "_serializationShape", null);
        setField(term12649, term12649.getClass(), "_valueInstantiator", null);
        setField(term12649, term12649.getClass(), "_delegateDeserializer", null);
        setField(term12649, term12649.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12649, term12649.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12649, term12649.getClass(), "_vanillaProcessing", false);
        setField(term12649, term12649.getClass(), "_beanProperties", null);
        setField(term12649, term12649.getClass(), "_injectables", null);
        setField(term12649, term12649.getClass(), "_anySetter", null);
        setField(term12649, term12649.getClass(), "_ignorableProps", null);
        setBooleanField(term12649, term12649.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12649, term12649.getClass(), "_needViewProcesing", false);
        setField(term12649, term12649.getClass(), "_backRefs", null);
        setField(term12649, term12649.getClass(), "_subDeserializers", null);
        setField(term12649, term12649.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12649, term12649.getClass(), "_externalTypeIdHandler", null);
        setField(term12649, term12649.getClass(), "_objectIdReader", null);
        setField(term12649, term12649.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term12508;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12647));
        assertTrue(recursiveEquals(term12508, term12649));
    }

};


