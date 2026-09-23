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

public class BeanDeserializer_init_1328697281157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73779;
     Object term73903;
     Object term73905;

    public BeanDeserializer_init_1328697281157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73667 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term73779 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73885 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term73779, term73779.getClass(), "_beanType", term73885);
        term73903 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73904 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term73903, term73903.getClass(), "_nullFromCreator", null);
        setField(term73903, term73903.getClass(), "_classAnnotations", null);
        setField(term73904, term73904.getClass(), "_elementType", null);
        setField(term73904, term73904.getClass(), "_superClass", null);
        setField(term73904, term73904.getClass(), "_superInterfaces", null);
        setField(term73904, term73904.getClass(), "_bindings", null);
        setField(term73904, term73904.getClass(), "_canonicalName", null);
        setField(term73904, term73904.getClass(), "_class", null);
        setIntField(term73904, term73904.getClass(), "_hash", 0);
        setField(term73904, term73904.getClass(), "_valueHandler", null);
        setField(term73904, term73904.getClass(), "_typeHandler", null);
        setBooleanField(term73904, term73904.getClass(), "_asStatic", false);
        setField(term73903, term73903.getClass(), "_beanType", term73904);
        setField(term73903, term73903.getClass(), "_serializationShape", null);
        setField(term73903, term73903.getClass(), "_valueInstantiator", null);
        setField(term73903, term73903.getClass(), "_delegateDeserializer", null);
        setField(term73903, term73903.getClass(), "_arrayDelegateDeserializer", null);
        setField(term73903, term73903.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term73903, term73903.getClass(), "_nonStandardCreation", false);
        setBooleanField(term73903, term73903.getClass(), "_vanillaProcessing", false);
        setField(term73903, term73903.getClass(), "_beanProperties", null);
        setField(term73903, term73903.getClass(), "_injectables", null);
        setField(term73903, term73903.getClass(), "_anySetter", null);
        setField(term73903, term73903.getClass(), "_ignorableProps", null);
        setBooleanField(term73903, term73903.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term73903, term73903.getClass(), "_needViewProcesing", false);
        setField(term73903, term73903.getClass(), "_backRefs", null);
        setField(term73903, term73903.getClass(), "_subDeserializers", null);
        setField(term73903, term73903.getClass(), "_unwrappedPropertyHandler", null);
        setField(term73903, term73903.getClass(), "_externalTypeIdHandler", null);
        setField(term73903, term73903.getClass(), "_objectIdReader", null);
        setField(term73903, term73903.getClass(), "_valueClass", null);
        term73905 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term73906 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term73905, term73905.getClass(), "_nullFromCreator", null);
        setField(term73905, term73905.getClass(), "_classAnnotations", null);
        setField(term73906, term73906.getClass(), "_elementType", null);
        setField(term73906, term73906.getClass(), "_superClass", null);
        setField(term73906, term73906.getClass(), "_superInterfaces", null);
        setField(term73906, term73906.getClass(), "_bindings", null);
        setField(term73906, term73906.getClass(), "_canonicalName", null);
        setField(term73906, term73906.getClass(), "_class", null);
        setIntField(term73906, term73906.getClass(), "_hash", 0);
        setField(term73906, term73906.getClass(), "_valueHandler", null);
        setField(term73906, term73906.getClass(), "_typeHandler", null);
        setBooleanField(term73906, term73906.getClass(), "_asStatic", false);
        setField(term73905, term73905.getClass(), "_beanType", term73906);
        setField(term73905, term73905.getClass(), "_serializationShape", null);
        setField(term73905, term73905.getClass(), "_valueInstantiator", null);
        setField(term73905, term73905.getClass(), "_delegateDeserializer", null);
        setField(term73905, term73905.getClass(), "_arrayDelegateDeserializer", null);
        setField(term73905, term73905.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term73905, term73905.getClass(), "_nonStandardCreation", false);
        setBooleanField(term73905, term73905.getClass(), "_vanillaProcessing", false);
        setField(term73905, term73905.getClass(), "_beanProperties", null);
        setField(term73905, term73905.getClass(), "_injectables", null);
        setField(term73905, term73905.getClass(), "_anySetter", null);
        setField(term73905, term73905.getClass(), "_ignorableProps", null);
        setBooleanField(term73905, term73905.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term73905, term73905.getClass(), "_needViewProcesing", false);
        setField(term73905, term73905.getClass(), "_backRefs", null);
        setField(term73905, term73905.getClass(), "_subDeserializers", null);
        setField(term73905, term73905.getClass(), "_unwrappedPropertyHandler", null);
        setField(term73905, term73905.getClass(), "_externalTypeIdHandler", null);
        setField(term73905, term73905.getClass(), "_objectIdReader", null);
        setField(term73905, term73905.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term73779;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73903));
        assertTrue(recursiveEquals(term73779, term73905));
    }

};


