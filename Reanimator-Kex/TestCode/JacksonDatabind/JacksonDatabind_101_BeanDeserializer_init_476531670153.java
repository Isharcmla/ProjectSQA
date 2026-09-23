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

public class BeanDeserializer_init_476531670153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36408;
     Object term36531;
     Object term36533;

    public BeanDeserializer_init_476531670153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36296 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term36408 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36512 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setBooleanField(term36408, term36408.getClass(), "_ignoreAllUnknown", false);
        setField(term36408, term36408.getClass(), "_beanType", term36512);
        term36531 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36532 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term36531, term36531.getClass(), "_nullFromCreator", null);
        setField(term36531, term36531.getClass(), "_currentlyTransforming", null);
        setField(term36532, term36532.getClass(), "_referencedType", null);
        setField(term36532, term36532.getClass(), "_anchorType", null);
        setField(term36532, term36532.getClass(), "_superClass", null);
        setField(term36532, term36532.getClass(), "_superInterfaces", null);
        setField(term36532, term36532.getClass(), "_bindings", null);
        setField(term36532, term36532.getClass(), "_canonicalName", null);
        setField(term36532, term36532.getClass(), "_class", null);
        setIntField(term36532, term36532.getClass(), "_hash", 0);
        setField(term36532, term36532.getClass(), "_valueHandler", null);
        setField(term36532, term36532.getClass(), "_typeHandler", null);
        setBooleanField(term36532, term36532.getClass(), "_asStatic", false);
        setField(term36531, term36531.getClass(), "_beanType", term36532);
        setField(term36531, term36531.getClass(), "_serializationShape", null);
        setField(term36531, term36531.getClass(), "_valueInstantiator", null);
        setField(term36531, term36531.getClass(), "_delegateDeserializer", null);
        setField(term36531, term36531.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36531, term36531.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36531, term36531.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36531, term36531.getClass(), "_vanillaProcessing", false);
        setField(term36531, term36531.getClass(), "_beanProperties", null);
        setField(term36531, term36531.getClass(), "_injectables", null);
        setField(term36531, term36531.getClass(), "_anySetter", null);
        setField(term36531, term36531.getClass(), "_ignorableProps", null);
        setBooleanField(term36531, term36531.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36531, term36531.getClass(), "_needViewProcesing", false);
        setField(term36531, term36531.getClass(), "_backRefs", null);
        setField(term36531, term36531.getClass(), "_subDeserializers", null);
        setField(term36531, term36531.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36531, term36531.getClass(), "_externalTypeIdHandler", null);
        setField(term36531, term36531.getClass(), "_objectIdReader", null);
        setField(term36531, term36531.getClass(), "_valueClass", null);
        term36533 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term36534 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term36533, term36533.getClass(), "_nullFromCreator", null);
        setField(term36533, term36533.getClass(), "_currentlyTransforming", null);
        setField(term36534, term36534.getClass(), "_referencedType", null);
        setField(term36534, term36534.getClass(), "_anchorType", null);
        setField(term36534, term36534.getClass(), "_superClass", null);
        setField(term36534, term36534.getClass(), "_superInterfaces", null);
        setField(term36534, term36534.getClass(), "_bindings", null);
        setField(term36534, term36534.getClass(), "_canonicalName", null);
        setField(term36534, term36534.getClass(), "_class", null);
        setIntField(term36534, term36534.getClass(), "_hash", 0);
        setField(term36534, term36534.getClass(), "_valueHandler", null);
        setField(term36534, term36534.getClass(), "_typeHandler", null);
        setBooleanField(term36534, term36534.getClass(), "_asStatic", false);
        setField(term36533, term36533.getClass(), "_beanType", term36534);
        setField(term36533, term36533.getClass(), "_serializationShape", null);
        setField(term36533, term36533.getClass(), "_valueInstantiator", null);
        setField(term36533, term36533.getClass(), "_delegateDeserializer", null);
        setField(term36533, term36533.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36533, term36533.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36533, term36533.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36533, term36533.getClass(), "_vanillaProcessing", false);
        setField(term36533, term36533.getClass(), "_beanProperties", null);
        setField(term36533, term36533.getClass(), "_injectables", null);
        setField(term36533, term36533.getClass(), "_anySetter", null);
        setField(term36533, term36533.getClass(), "_ignorableProps", null);
        setBooleanField(term36533, term36533.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36533, term36533.getClass(), "_needViewProcesing", false);
        setField(term36533, term36533.getClass(), "_backRefs", null);
        setField(term36533, term36533.getClass(), "_subDeserializers", null);
        setField(term36533, term36533.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36533, term36533.getClass(), "_externalTypeIdHandler", null);
        setField(term36533, term36533.getClass(), "_objectIdReader", null);
        setField(term36533, term36533.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term36408;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36531));
        assertTrue(recursiveEquals(term36408, term36533));
    }

};


