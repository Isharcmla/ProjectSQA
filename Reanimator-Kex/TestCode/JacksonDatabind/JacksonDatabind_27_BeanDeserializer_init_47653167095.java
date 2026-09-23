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

public class BeanDeserializer_init_47653167095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27276;
     Object term27401;
     Object term27403;

    public BeanDeserializer_init_47653167095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term27276 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27382 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setBooleanField(term27276, term27276.getClass(), "_ignoreAllUnknown", false);
        setField(term27276, term27276.getClass(), "_beanType", term27382);
        term27401 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27402 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term27401, term27401.getClass(), "_classAnnotations", null);
        setField(term27402, term27402.getClass(), "_elementType", null);
        setField(term27402, term27402.getClass(), "_canonicalName", null);
        setField(term27402, term27402.getClass(), "_class", null);
        setIntField(term27402, term27402.getClass(), "_hash", 0);
        setField(term27402, term27402.getClass(), "_valueHandler", null);
        setField(term27402, term27402.getClass(), "_typeHandler", null);
        setBooleanField(term27402, term27402.getClass(), "_asStatic", false);
        setField(term27401, term27401.getClass(), "_beanType", term27402);
        setField(term27401, term27401.getClass(), "_serializationShape", null);
        setField(term27401, term27401.getClass(), "_valueInstantiator", null);
        setField(term27401, term27401.getClass(), "_delegateDeserializer", null);
        setField(term27401, term27401.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27401, term27401.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27401, term27401.getClass(), "_vanillaProcessing", false);
        setField(term27401, term27401.getClass(), "_beanProperties", null);
        setField(term27401, term27401.getClass(), "_injectables", null);
        setField(term27401, term27401.getClass(), "_anySetter", null);
        setField(term27401, term27401.getClass(), "_ignorableProps", null);
        setBooleanField(term27401, term27401.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27401, term27401.getClass(), "_needViewProcesing", false);
        setField(term27401, term27401.getClass(), "_backRefs", null);
        setField(term27401, term27401.getClass(), "_subDeserializers", null);
        setField(term27401, term27401.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27401, term27401.getClass(), "_externalTypeIdHandler", null);
        setField(term27401, term27401.getClass(), "_objectIdReader", null);
        setField(term27401, term27401.getClass(), "_valueClass", null);
        term27403 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term27404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term27403, term27403.getClass(), "_classAnnotations", null);
        setField(term27404, term27404.getClass(), "_elementType", null);
        setField(term27404, term27404.getClass(), "_canonicalName", null);
        setField(term27404, term27404.getClass(), "_class", null);
        setIntField(term27404, term27404.getClass(), "_hash", 0);
        setField(term27404, term27404.getClass(), "_valueHandler", null);
        setField(term27404, term27404.getClass(), "_typeHandler", null);
        setBooleanField(term27404, term27404.getClass(), "_asStatic", false);
        setField(term27403, term27403.getClass(), "_beanType", term27404);
        setField(term27403, term27403.getClass(), "_serializationShape", null);
        setField(term27403, term27403.getClass(), "_valueInstantiator", null);
        setField(term27403, term27403.getClass(), "_delegateDeserializer", null);
        setField(term27403, term27403.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27403, term27403.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27403, term27403.getClass(), "_vanillaProcessing", false);
        setField(term27403, term27403.getClass(), "_beanProperties", null);
        setField(term27403, term27403.getClass(), "_injectables", null);
        setField(term27403, term27403.getClass(), "_anySetter", null);
        setField(term27403, term27403.getClass(), "_ignorableProps", null);
        setBooleanField(term27403, term27403.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27403, term27403.getClass(), "_needViewProcesing", false);
        setField(term27403, term27403.getClass(), "_backRefs", null);
        setField(term27403, term27403.getClass(), "_subDeserializers", null);
        setField(term27403, term27403.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27403, term27403.getClass(), "_externalTypeIdHandler", null);
        setField(term27403, term27403.getClass(), "_objectIdReader", null);
        setField(term27403, term27403.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term27276;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27401));
        assertTrue(recursiveEquals(term27276, term27403));
    }

};


