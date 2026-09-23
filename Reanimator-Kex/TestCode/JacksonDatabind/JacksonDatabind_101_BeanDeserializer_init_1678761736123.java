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
     Object term28081;
     Object term28206;
     Object term28208;

    public BeanDeserializer_init_1678761736123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28081 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28185 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28081, term28081.getClass(), "_beanType", term28185);
        term28206 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28207 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28206, term28206.getClass(), "_nullFromCreator", null);
        setField(term28206, term28206.getClass(), "_currentlyTransforming", null);
        setField(term28207, term28207.getClass(), "_referencedType", null);
        setField(term28207, term28207.getClass(), "_anchorType", null);
        setField(term28207, term28207.getClass(), "_superClass", null);
        setField(term28207, term28207.getClass(), "_superInterfaces", null);
        setField(term28207, term28207.getClass(), "_bindings", null);
        setField(term28207, term28207.getClass(), "_canonicalName", null);
        setField(term28207, term28207.getClass(), "_class", null);
        setIntField(term28207, term28207.getClass(), "_hash", 0);
        setField(term28207, term28207.getClass(), "_valueHandler", null);
        setField(term28207, term28207.getClass(), "_typeHandler", null);
        setBooleanField(term28207, term28207.getClass(), "_asStatic", false);
        setField(term28206, term28206.getClass(), "_beanType", term28207);
        setField(term28206, term28206.getClass(), "_serializationShape", null);
        setField(term28206, term28206.getClass(), "_valueInstantiator", null);
        setField(term28206, term28206.getClass(), "_delegateDeserializer", null);
        setField(term28206, term28206.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28206, term28206.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28206, term28206.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28206, term28206.getClass(), "_vanillaProcessing", false);
        setField(term28206, term28206.getClass(), "_beanProperties", null);
        setField(term28206, term28206.getClass(), "_injectables", null);
        setField(term28206, term28206.getClass(), "_anySetter", null);
        setField(term28206, term28206.getClass(), "_ignorableProps", null);
        setBooleanField(term28206, term28206.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28206, term28206.getClass(), "_needViewProcesing", false);
        setField(term28206, term28206.getClass(), "_backRefs", null);
        setField(term28206, term28206.getClass(), "_subDeserializers", null);
        setField(term28206, term28206.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28206, term28206.getClass(), "_externalTypeIdHandler", null);
        setField(term28206, term28206.getClass(), "_objectIdReader", null);
        setField(term28206, term28206.getClass(), "_valueClass", null);
        term28208 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28209 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28208, term28208.getClass(), "_nullFromCreator", null);
        setField(term28208, term28208.getClass(), "_currentlyTransforming", null);
        setField(term28209, term28209.getClass(), "_referencedType", null);
        setField(term28209, term28209.getClass(), "_anchorType", null);
        setField(term28209, term28209.getClass(), "_superClass", null);
        setField(term28209, term28209.getClass(), "_superInterfaces", null);
        setField(term28209, term28209.getClass(), "_bindings", null);
        setField(term28209, term28209.getClass(), "_canonicalName", null);
        setField(term28209, term28209.getClass(), "_class", null);
        setIntField(term28209, term28209.getClass(), "_hash", 0);
        setField(term28209, term28209.getClass(), "_valueHandler", null);
        setField(term28209, term28209.getClass(), "_typeHandler", null);
        setBooleanField(term28209, term28209.getClass(), "_asStatic", false);
        setField(term28208, term28208.getClass(), "_beanType", term28209);
        setField(term28208, term28208.getClass(), "_serializationShape", null);
        setField(term28208, term28208.getClass(), "_valueInstantiator", null);
        setField(term28208, term28208.getClass(), "_delegateDeserializer", null);
        setField(term28208, term28208.getClass(), "_arrayDelegateDeserializer", null);
        setField(term28208, term28208.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28208, term28208.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28208, term28208.getClass(), "_vanillaProcessing", false);
        setField(term28208, term28208.getClass(), "_beanProperties", null);
        setField(term28208, term28208.getClass(), "_injectables", null);
        setField(term28208, term28208.getClass(), "_anySetter", null);
        setField(term28208, term28208.getClass(), "_ignorableProps", null);
        setBooleanField(term28208, term28208.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28208, term28208.getClass(), "_needViewProcesing", false);
        setField(term28208, term28208.getClass(), "_backRefs", null);
        setField(term28208, term28208.getClass(), "_subDeserializers", null);
        setField(term28208, term28208.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28208, term28208.getClass(), "_externalTypeIdHandler", null);
        setField(term28208, term28208.getClass(), "_objectIdReader", null);
        setField(term28208, term28208.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term28081;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28206));
        assertTrue(recursiveEquals(term28081, term28208));
    }

};


