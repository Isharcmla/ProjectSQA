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

public class BeanDeserializer_init_476531670131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30756;
     Object term31694;
     Object term31696;

    public BeanDeserializer_init_476531670131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30644 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term30756 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term30876 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setBooleanField(term30756, term30756.getClass(), "_ignoreAllUnknown", false);
        setField(term30756, term30756.getClass(), "_beanType", term30876);
        term31694 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term31695 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term31694, term31694.getClass(), "_nullFromCreator", null);
        setField(term31694, term31694.getClass(), "_currentlyTransforming", null);
        setField(term31695, term31695.getClass(), "_referencedType", null);
        setField(term31695, term31695.getClass(), "_superClass", null);
        setField(term31695, term31695.getClass(), "_superInterfaces", null);
        setField(term31695, term31695.getClass(), "_bindings", null);
        setField(term31695, term31695.getClass(), "_canonicalName", null);
        setField(term31695, term31695.getClass(), "_class", null);
        setIntField(term31695, term31695.getClass(), "_hash", 0);
        setField(term31695, term31695.getClass(), "_valueHandler", null);
        setField(term31695, term31695.getClass(), "_typeHandler", null);
        setBooleanField(term31695, term31695.getClass(), "_asStatic", false);
        setField(term31694, term31694.getClass(), "_beanType", term31695);
        setField(term31694, term31694.getClass(), "_serializationShape", null);
        setField(term31694, term31694.getClass(), "_valueInstantiator", null);
        setField(term31694, term31694.getClass(), "_delegateDeserializer", null);
        setField(term31694, term31694.getClass(), "_arrayDelegateDeserializer", null);
        setField(term31694, term31694.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term31694, term31694.getClass(), "_nonStandardCreation", false);
        setBooleanField(term31694, term31694.getClass(), "_vanillaProcessing", false);
        setField(term31694, term31694.getClass(), "_beanProperties", null);
        setField(term31694, term31694.getClass(), "_injectables", null);
        setField(term31694, term31694.getClass(), "_anySetter", null);
        setField(term31694, term31694.getClass(), "_ignorableProps", null);
        setBooleanField(term31694, term31694.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term31694, term31694.getClass(), "_needViewProcesing", false);
        setField(term31694, term31694.getClass(), "_backRefs", null);
        setField(term31694, term31694.getClass(), "_subDeserializers", null);
        setField(term31694, term31694.getClass(), "_unwrappedPropertyHandler", null);
        setField(term31694, term31694.getClass(), "_externalTypeIdHandler", null);
        setField(term31694, term31694.getClass(), "_objectIdReader", null);
        setField(term31694, term31694.getClass(), "_valueClass", null);
        term31696 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term31697 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term31696, term31696.getClass(), "_nullFromCreator", null);
        setField(term31696, term31696.getClass(), "_currentlyTransforming", null);
        setField(term31697, term31697.getClass(), "_referencedType", null);
        setField(term31697, term31697.getClass(), "_superClass", null);
        setField(term31697, term31697.getClass(), "_superInterfaces", null);
        setField(term31697, term31697.getClass(), "_bindings", null);
        setField(term31697, term31697.getClass(), "_canonicalName", null);
        setField(term31697, term31697.getClass(), "_class", null);
        setIntField(term31697, term31697.getClass(), "_hash", 0);
        setField(term31697, term31697.getClass(), "_valueHandler", null);
        setField(term31697, term31697.getClass(), "_typeHandler", null);
        setBooleanField(term31697, term31697.getClass(), "_asStatic", false);
        setField(term31696, term31696.getClass(), "_beanType", term31697);
        setField(term31696, term31696.getClass(), "_serializationShape", null);
        setField(term31696, term31696.getClass(), "_valueInstantiator", null);
        setField(term31696, term31696.getClass(), "_delegateDeserializer", null);
        setField(term31696, term31696.getClass(), "_arrayDelegateDeserializer", null);
        setField(term31696, term31696.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term31696, term31696.getClass(), "_nonStandardCreation", false);
        setBooleanField(term31696, term31696.getClass(), "_vanillaProcessing", false);
        setField(term31696, term31696.getClass(), "_beanProperties", null);
        setField(term31696, term31696.getClass(), "_injectables", null);
        setField(term31696, term31696.getClass(), "_anySetter", null);
        setField(term31696, term31696.getClass(), "_ignorableProps", null);
        setBooleanField(term31696, term31696.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term31696, term31696.getClass(), "_needViewProcesing", false);
        setField(term31696, term31696.getClass(), "_backRefs", null);
        setField(term31696, term31696.getClass(), "_subDeserializers", null);
        setField(term31696, term31696.getClass(), "_unwrappedPropertyHandler", null);
        setField(term31696, term31696.getClass(), "_externalTypeIdHandler", null);
        setField(term31696, term31696.getClass(), "_objectIdReader", null);
        setField(term31696, term31696.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term30756;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31694));
        assertTrue(recursiveEquals(term30756, term31696));
    }

};


