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

public class BeanDeserializer_init_1678761736177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86569;
     Object term86686;
     Object term86688;

    public BeanDeserializer_init_1678761736177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86457 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term86569 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term86665 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term86569, term86569.getClass(), "_beanType", term86665);
        term86686 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term86687 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term86686, term86686.getClass(), "_nullFromCreator", null);
        setField(term86686, term86686.getClass(), "_classAnnotations", null);
        setField(term86687, term86687.getClass(), "_componentType", null);
        setField(term86687, term86687.getClass(), "_emptyArray", null);
        setField(term86687, term86687.getClass(), "_superClass", null);
        setField(term86687, term86687.getClass(), "_superInterfaces", null);
        setField(term86687, term86687.getClass(), "_bindings", null);
        setField(term86687, term86687.getClass(), "_canonicalName", null);
        setField(term86687, term86687.getClass(), "_class", null);
        setIntField(term86687, term86687.getClass(), "_hash", 0);
        setField(term86687, term86687.getClass(), "_valueHandler", null);
        setField(term86687, term86687.getClass(), "_typeHandler", null);
        setBooleanField(term86687, term86687.getClass(), "_asStatic", false);
        setField(term86686, term86686.getClass(), "_beanType", term86687);
        setField(term86686, term86686.getClass(), "_serializationShape", null);
        setField(term86686, term86686.getClass(), "_valueInstantiator", null);
        setField(term86686, term86686.getClass(), "_delegateDeserializer", null);
        setField(term86686, term86686.getClass(), "_arrayDelegateDeserializer", null);
        setField(term86686, term86686.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term86686, term86686.getClass(), "_nonStandardCreation", false);
        setBooleanField(term86686, term86686.getClass(), "_vanillaProcessing", false);
        setField(term86686, term86686.getClass(), "_beanProperties", null);
        setField(term86686, term86686.getClass(), "_injectables", null);
        setField(term86686, term86686.getClass(), "_anySetter", null);
        setField(term86686, term86686.getClass(), "_ignorableProps", null);
        setBooleanField(term86686, term86686.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term86686, term86686.getClass(), "_needViewProcesing", false);
        setField(term86686, term86686.getClass(), "_backRefs", null);
        setField(term86686, term86686.getClass(), "_subDeserializers", null);
        setField(term86686, term86686.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86686, term86686.getClass(), "_externalTypeIdHandler", null);
        setField(term86686, term86686.getClass(), "_objectIdReader", null);
        setField(term86686, term86686.getClass(), "_valueClass", null);
        term86688 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term86689 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term86688, term86688.getClass(), "_nullFromCreator", null);
        setField(term86688, term86688.getClass(), "_classAnnotations", null);
        setField(term86689, term86689.getClass(), "_componentType", null);
        setField(term86689, term86689.getClass(), "_emptyArray", null);
        setField(term86689, term86689.getClass(), "_superClass", null);
        setField(term86689, term86689.getClass(), "_superInterfaces", null);
        setField(term86689, term86689.getClass(), "_bindings", null);
        setField(term86689, term86689.getClass(), "_canonicalName", null);
        setField(term86689, term86689.getClass(), "_class", null);
        setIntField(term86689, term86689.getClass(), "_hash", 0);
        setField(term86689, term86689.getClass(), "_valueHandler", null);
        setField(term86689, term86689.getClass(), "_typeHandler", null);
        setBooleanField(term86689, term86689.getClass(), "_asStatic", false);
        setField(term86688, term86688.getClass(), "_beanType", term86689);
        setField(term86688, term86688.getClass(), "_serializationShape", null);
        setField(term86688, term86688.getClass(), "_valueInstantiator", null);
        setField(term86688, term86688.getClass(), "_delegateDeserializer", null);
        setField(term86688, term86688.getClass(), "_arrayDelegateDeserializer", null);
        setField(term86688, term86688.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term86688, term86688.getClass(), "_nonStandardCreation", false);
        setBooleanField(term86688, term86688.getClass(), "_vanillaProcessing", false);
        setField(term86688, term86688.getClass(), "_beanProperties", null);
        setField(term86688, term86688.getClass(), "_injectables", null);
        setField(term86688, term86688.getClass(), "_anySetter", null);
        setField(term86688, term86688.getClass(), "_ignorableProps", null);
        setBooleanField(term86688, term86688.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term86688, term86688.getClass(), "_needViewProcesing", false);
        setField(term86688, term86688.getClass(), "_backRefs", null);
        setField(term86688, term86688.getClass(), "_subDeserializers", null);
        setField(term86688, term86688.getClass(), "_unwrappedPropertyHandler", null);
        setField(term86688, term86688.getClass(), "_externalTypeIdHandler", null);
        setField(term86688, term86688.getClass(), "_objectIdReader", null);
        setField(term86688, term86688.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term86569;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term86686));
        assertTrue(recursiveEquals(term86569, term86688));
    }

};


