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

public class BeanDeserializer_init_47653167081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15451;
     Object term15680;
     Object term15682;

    public BeanDeserializer_init_47653167081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15339 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term15451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15557 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setBooleanField(term15451, term15451.getClass(), "_ignoreAllUnknown", false);
        setField(term15451, term15451.getClass(), "_beanType", term15557);
        term15680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15681 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15680, term15680.getClass(), "_nullFromCreator", null);
        setField(term15680, term15680.getClass(), "_currentlyTransforming", null);
        setField(term15681, term15681.getClass(), "_elementType", null);
        setField(term15681, term15681.getClass(), "_superClass", null);
        setField(term15681, term15681.getClass(), "_superInterfaces", null);
        setField(term15681, term15681.getClass(), "_bindings", null);
        setField(term15681, term15681.getClass(), "_canonicalName", null);
        setField(term15681, term15681.getClass(), "_class", null);
        setIntField(term15681, term15681.getClass(), "_hash", 0);
        setField(term15681, term15681.getClass(), "_valueHandler", null);
        setField(term15681, term15681.getClass(), "_typeHandler", null);
        setBooleanField(term15681, term15681.getClass(), "_asStatic", false);
        setField(term15680, term15680.getClass(), "_beanType", term15681);
        setField(term15680, term15680.getClass(), "_serializationShape", null);
        setField(term15680, term15680.getClass(), "_valueInstantiator", null);
        setField(term15680, term15680.getClass(), "_delegateDeserializer", null);
        setField(term15680, term15680.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15680, term15680.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15680, term15680.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15680, term15680.getClass(), "_vanillaProcessing", false);
        setField(term15680, term15680.getClass(), "_beanProperties", null);
        setField(term15680, term15680.getClass(), "_injectables", null);
        setField(term15680, term15680.getClass(), "_anySetter", null);
        setField(term15680, term15680.getClass(), "_ignorableProps", null);
        setBooleanField(term15680, term15680.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15680, term15680.getClass(), "_needViewProcesing", false);
        setField(term15680, term15680.getClass(), "_backRefs", null);
        setField(term15680, term15680.getClass(), "_subDeserializers", null);
        setField(term15680, term15680.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15680, term15680.getClass(), "_externalTypeIdHandler", null);
        setField(term15680, term15680.getClass(), "_objectIdReader", null);
        setField(term15680, term15680.getClass(), "_valueClass", null);
        term15682 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term15683 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term15682, term15682.getClass(), "_nullFromCreator", null);
        setField(term15682, term15682.getClass(), "_currentlyTransforming", null);
        setField(term15683, term15683.getClass(), "_elementType", null);
        setField(term15683, term15683.getClass(), "_superClass", null);
        setField(term15683, term15683.getClass(), "_superInterfaces", null);
        setField(term15683, term15683.getClass(), "_bindings", null);
        setField(term15683, term15683.getClass(), "_canonicalName", null);
        setField(term15683, term15683.getClass(), "_class", null);
        setIntField(term15683, term15683.getClass(), "_hash", 0);
        setField(term15683, term15683.getClass(), "_valueHandler", null);
        setField(term15683, term15683.getClass(), "_typeHandler", null);
        setBooleanField(term15683, term15683.getClass(), "_asStatic", false);
        setField(term15682, term15682.getClass(), "_beanType", term15683);
        setField(term15682, term15682.getClass(), "_serializationShape", null);
        setField(term15682, term15682.getClass(), "_valueInstantiator", null);
        setField(term15682, term15682.getClass(), "_delegateDeserializer", null);
        setField(term15682, term15682.getClass(), "_arrayDelegateDeserializer", null);
        setField(term15682, term15682.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term15682, term15682.getClass(), "_nonStandardCreation", false);
        setBooleanField(term15682, term15682.getClass(), "_vanillaProcessing", false);
        setField(term15682, term15682.getClass(), "_beanProperties", null);
        setField(term15682, term15682.getClass(), "_injectables", null);
        setField(term15682, term15682.getClass(), "_anySetter", null);
        setField(term15682, term15682.getClass(), "_ignorableProps", null);
        setBooleanField(term15682, term15682.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term15682, term15682.getClass(), "_needViewProcesing", false);
        setField(term15682, term15682.getClass(), "_backRefs", null);
        setField(term15682, term15682.getClass(), "_subDeserializers", null);
        setField(term15682, term15682.getClass(), "_unwrappedPropertyHandler", null);
        setField(term15682, term15682.getClass(), "_externalTypeIdHandler", null);
        setField(term15682, term15682.getClass(), "_objectIdReader", null);
        setField(term15682, term15682.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term15451;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15680));
        assertTrue(recursiveEquals(term15451, term15682));
    }

};


