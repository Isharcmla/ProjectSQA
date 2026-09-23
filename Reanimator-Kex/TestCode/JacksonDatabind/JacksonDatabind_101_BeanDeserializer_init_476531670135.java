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

public class BeanDeserializer_init_476531670135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32298;
     Object term32421;
     Object term32423;

    public BeanDeserializer_init_476531670135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32186 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term32298 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32402 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setBooleanField(term32298, term32298.getClass(), "_ignoreAllUnknown", false);
        setField(term32298, term32298.getClass(), "_beanType", term32402);
        term32421 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32422 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term32421, term32421.getClass(), "_nullFromCreator", null);
        setField(term32421, term32421.getClass(), "_currentlyTransforming", null);
        setField(term32422, term32422.getClass(), "_referencedType", null);
        setField(term32422, term32422.getClass(), "_anchorType", null);
        setField(term32422, term32422.getClass(), "_superClass", null);
        setField(term32422, term32422.getClass(), "_superInterfaces", null);
        setField(term32422, term32422.getClass(), "_bindings", null);
        setField(term32422, term32422.getClass(), "_canonicalName", null);
        setField(term32422, term32422.getClass(), "_class", null);
        setIntField(term32422, term32422.getClass(), "_hash", 0);
        setField(term32422, term32422.getClass(), "_valueHandler", null);
        setField(term32422, term32422.getClass(), "_typeHandler", null);
        setBooleanField(term32422, term32422.getClass(), "_asStatic", false);
        setField(term32421, term32421.getClass(), "_beanType", term32422);
        setField(term32421, term32421.getClass(), "_serializationShape", null);
        setField(term32421, term32421.getClass(), "_valueInstantiator", null);
        setField(term32421, term32421.getClass(), "_delegateDeserializer", null);
        setField(term32421, term32421.getClass(), "_arrayDelegateDeserializer", null);
        setField(term32421, term32421.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term32421, term32421.getClass(), "_nonStandardCreation", false);
        setBooleanField(term32421, term32421.getClass(), "_vanillaProcessing", false);
        setField(term32421, term32421.getClass(), "_beanProperties", null);
        setField(term32421, term32421.getClass(), "_injectables", null);
        setField(term32421, term32421.getClass(), "_anySetter", null);
        setField(term32421, term32421.getClass(), "_ignorableProps", null);
        setBooleanField(term32421, term32421.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term32421, term32421.getClass(), "_needViewProcesing", false);
        setField(term32421, term32421.getClass(), "_backRefs", null);
        setField(term32421, term32421.getClass(), "_subDeserializers", null);
        setField(term32421, term32421.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32421, term32421.getClass(), "_externalTypeIdHandler", null);
        setField(term32421, term32421.getClass(), "_objectIdReader", null);
        setField(term32421, term32421.getClass(), "_valueClass", null);
        term32423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32424 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term32423, term32423.getClass(), "_nullFromCreator", null);
        setField(term32423, term32423.getClass(), "_currentlyTransforming", null);
        setField(term32424, term32424.getClass(), "_referencedType", null);
        setField(term32424, term32424.getClass(), "_anchorType", null);
        setField(term32424, term32424.getClass(), "_superClass", null);
        setField(term32424, term32424.getClass(), "_superInterfaces", null);
        setField(term32424, term32424.getClass(), "_bindings", null);
        setField(term32424, term32424.getClass(), "_canonicalName", null);
        setField(term32424, term32424.getClass(), "_class", null);
        setIntField(term32424, term32424.getClass(), "_hash", 0);
        setField(term32424, term32424.getClass(), "_valueHandler", null);
        setField(term32424, term32424.getClass(), "_typeHandler", null);
        setBooleanField(term32424, term32424.getClass(), "_asStatic", false);
        setField(term32423, term32423.getClass(), "_beanType", term32424);
        setField(term32423, term32423.getClass(), "_serializationShape", null);
        setField(term32423, term32423.getClass(), "_valueInstantiator", null);
        setField(term32423, term32423.getClass(), "_delegateDeserializer", null);
        setField(term32423, term32423.getClass(), "_arrayDelegateDeserializer", null);
        setField(term32423, term32423.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term32423, term32423.getClass(), "_nonStandardCreation", false);
        setBooleanField(term32423, term32423.getClass(), "_vanillaProcessing", false);
        setField(term32423, term32423.getClass(), "_beanProperties", null);
        setField(term32423, term32423.getClass(), "_injectables", null);
        setField(term32423, term32423.getClass(), "_anySetter", null);
        setField(term32423, term32423.getClass(), "_ignorableProps", null);
        setBooleanField(term32423, term32423.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term32423, term32423.getClass(), "_needViewProcesing", false);
        setField(term32423, term32423.getClass(), "_backRefs", null);
        setField(term32423, term32423.getClass(), "_subDeserializers", null);
        setField(term32423, term32423.getClass(), "_unwrappedPropertyHandler", null);
        setField(term32423, term32423.getClass(), "_externalTypeIdHandler", null);
        setField(term32423, term32423.getClass(), "_objectIdReader", null);
        setField(term32423, term32423.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term32298;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32421));
        assertTrue(recursiveEquals(term32298, term32423));
    }

};


