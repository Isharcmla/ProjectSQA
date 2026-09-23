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

public class BeanDeserializer_init_99674089107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28894;
     Object term29017;
     Object term29019;

    public BeanDeserializer_init_99674089107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28782 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28894 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28998 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28894, term28894.getClass(), "_beanType", term28998);
        term29017 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29017, term29017.getClass(), "_nullFromCreator", null);
        setField(term29017, term29017.getClass(), "_classAnnotations", null);
        setField(term29018, term29018.getClass(), "_referencedType", null);
        setField(term29018, term29018.getClass(), "_anchorType", null);
        setField(term29018, term29018.getClass(), "_superClass", null);
        setField(term29018, term29018.getClass(), "_superInterfaces", null);
        setField(term29018, term29018.getClass(), "_bindings", null);
        setField(term29018, term29018.getClass(), "_canonicalName", null);
        setField(term29018, term29018.getClass(), "_class", null);
        setIntField(term29018, term29018.getClass(), "_hash", 0);
        setField(term29018, term29018.getClass(), "_valueHandler", null);
        setField(term29018, term29018.getClass(), "_typeHandler", null);
        setBooleanField(term29018, term29018.getClass(), "_asStatic", false);
        setField(term29017, term29017.getClass(), "_beanType", term29018);
        setField(term29017, term29017.getClass(), "_serializationShape", null);
        setField(term29017, term29017.getClass(), "_valueInstantiator", null);
        setField(term29017, term29017.getClass(), "_delegateDeserializer", null);
        setField(term29017, term29017.getClass(), "_arrayDelegateDeserializer", null);
        setField(term29017, term29017.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term29017, term29017.getClass(), "_nonStandardCreation", false);
        setBooleanField(term29017, term29017.getClass(), "_vanillaProcessing", false);
        setField(term29017, term29017.getClass(), "_beanProperties", null);
        setField(term29017, term29017.getClass(), "_injectables", null);
        setField(term29017, term29017.getClass(), "_anySetter", null);
        setField(term29017, term29017.getClass(), "_ignorableProps", null);
        setBooleanField(term29017, term29017.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term29017, term29017.getClass(), "_needViewProcesing", false);
        setField(term29017, term29017.getClass(), "_backRefs", null);
        setField(term29017, term29017.getClass(), "_subDeserializers", null);
        setField(term29017, term29017.getClass(), "_unwrappedPropertyHandler", null);
        setField(term29017, term29017.getClass(), "_externalTypeIdHandler", null);
        setField(term29017, term29017.getClass(), "_objectIdReader", null);
        setField(term29017, term29017.getClass(), "_valueClass", null);
        term29019 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29020 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29019, term29019.getClass(), "_nullFromCreator", null);
        setField(term29019, term29019.getClass(), "_classAnnotations", null);
        setField(term29020, term29020.getClass(), "_referencedType", null);
        setField(term29020, term29020.getClass(), "_anchorType", null);
        setField(term29020, term29020.getClass(), "_superClass", null);
        setField(term29020, term29020.getClass(), "_superInterfaces", null);
        setField(term29020, term29020.getClass(), "_bindings", null);
        setField(term29020, term29020.getClass(), "_canonicalName", null);
        setField(term29020, term29020.getClass(), "_class", null);
        setIntField(term29020, term29020.getClass(), "_hash", 0);
        setField(term29020, term29020.getClass(), "_valueHandler", null);
        setField(term29020, term29020.getClass(), "_typeHandler", null);
        setBooleanField(term29020, term29020.getClass(), "_asStatic", false);
        setField(term29019, term29019.getClass(), "_beanType", term29020);
        setField(term29019, term29019.getClass(), "_serializationShape", null);
        setField(term29019, term29019.getClass(), "_valueInstantiator", null);
        setField(term29019, term29019.getClass(), "_delegateDeserializer", null);
        setField(term29019, term29019.getClass(), "_arrayDelegateDeserializer", null);
        setField(term29019, term29019.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term29019, term29019.getClass(), "_nonStandardCreation", false);
        setBooleanField(term29019, term29019.getClass(), "_vanillaProcessing", false);
        setField(term29019, term29019.getClass(), "_beanProperties", null);
        setField(term29019, term29019.getClass(), "_injectables", null);
        setField(term29019, term29019.getClass(), "_anySetter", null);
        setField(term29019, term29019.getClass(), "_ignorableProps", null);
        setBooleanField(term29019, term29019.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term29019, term29019.getClass(), "_needViewProcesing", false);
        setField(term29019, term29019.getClass(), "_backRefs", null);
        setField(term29019, term29019.getClass(), "_subDeserializers", null);
        setField(term29019, term29019.getClass(), "_unwrappedPropertyHandler", null);
        setField(term29019, term29019.getClass(), "_externalTypeIdHandler", null);
        setField(term29019, term29019.getClass(), "_objectIdReader", null);
        setField(term29019, term29019.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term28894;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29017));
        assertTrue(recursiveEquals(term28894, term29019));
    }

};


