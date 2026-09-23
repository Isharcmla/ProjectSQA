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

public class BeanDeserializer_init_128587249086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16262;
     Object term16781;
     Object term16783;

    public BeanDeserializer_init_128587249086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16150 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term16262 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16382 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term16262, term16262.getClass(), "_beanType", term16382);
        term16781 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16782 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term16781, term16781.getClass(), "_nullFromCreator", null);
        setField(term16781, term16781.getClass(), "_currentlyTransforming", null);
        setField(term16782, term16782.getClass(), "_referencedType", null);
        setField(term16782, term16782.getClass(), "_superClass", null);
        setField(term16782, term16782.getClass(), "_superInterfaces", null);
        setField(term16782, term16782.getClass(), "_bindings", null);
        setField(term16782, term16782.getClass(), "_canonicalName", null);
        setField(term16782, term16782.getClass(), "_class", null);
        setIntField(term16782, term16782.getClass(), "_hash", 0);
        setField(term16782, term16782.getClass(), "_valueHandler", null);
        setField(term16782, term16782.getClass(), "_typeHandler", null);
        setBooleanField(term16782, term16782.getClass(), "_asStatic", false);
        setField(term16781, term16781.getClass(), "_beanType", term16782);
        setField(term16781, term16781.getClass(), "_serializationShape", null);
        setField(term16781, term16781.getClass(), "_valueInstantiator", null);
        setField(term16781, term16781.getClass(), "_delegateDeserializer", null);
        setField(term16781, term16781.getClass(), "_arrayDelegateDeserializer", null);
        setField(term16781, term16781.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term16781, term16781.getClass(), "_nonStandardCreation", false);
        setBooleanField(term16781, term16781.getClass(), "_vanillaProcessing", false);
        setField(term16781, term16781.getClass(), "_beanProperties", null);
        setField(term16781, term16781.getClass(), "_injectables", null);
        setField(term16781, term16781.getClass(), "_anySetter", null);
        setField(term16781, term16781.getClass(), "_ignorableProps", null);
        setBooleanField(term16781, term16781.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term16781, term16781.getClass(), "_needViewProcesing", false);
        setField(term16781, term16781.getClass(), "_backRefs", null);
        setField(term16781, term16781.getClass(), "_subDeserializers", null);
        setField(term16781, term16781.getClass(), "_unwrappedPropertyHandler", null);
        setField(term16781, term16781.getClass(), "_externalTypeIdHandler", null);
        setField(term16781, term16781.getClass(), "_objectIdReader", null);
        setField(term16781, term16781.getClass(), "_valueClass", null);
        term16783 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term16784 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term16783, term16783.getClass(), "_nullFromCreator", null);
        setField(term16783, term16783.getClass(), "_currentlyTransforming", null);
        setField(term16784, term16784.getClass(), "_referencedType", null);
        setField(term16784, term16784.getClass(), "_superClass", null);
        setField(term16784, term16784.getClass(), "_superInterfaces", null);
        setField(term16784, term16784.getClass(), "_bindings", null);
        setField(term16784, term16784.getClass(), "_canonicalName", null);
        setField(term16784, term16784.getClass(), "_class", null);
        setIntField(term16784, term16784.getClass(), "_hash", 0);
        setField(term16784, term16784.getClass(), "_valueHandler", null);
        setField(term16784, term16784.getClass(), "_typeHandler", null);
        setBooleanField(term16784, term16784.getClass(), "_asStatic", false);
        setField(term16783, term16783.getClass(), "_beanType", term16784);
        setField(term16783, term16783.getClass(), "_serializationShape", null);
        setField(term16783, term16783.getClass(), "_valueInstantiator", null);
        setField(term16783, term16783.getClass(), "_delegateDeserializer", null);
        setField(term16783, term16783.getClass(), "_arrayDelegateDeserializer", null);
        setField(term16783, term16783.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term16783, term16783.getClass(), "_nonStandardCreation", false);
        setBooleanField(term16783, term16783.getClass(), "_vanillaProcessing", false);
        setField(term16783, term16783.getClass(), "_beanProperties", null);
        setField(term16783, term16783.getClass(), "_injectables", null);
        setField(term16783, term16783.getClass(), "_anySetter", null);
        setField(term16783, term16783.getClass(), "_ignorableProps", null);
        setBooleanField(term16783, term16783.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term16783, term16783.getClass(), "_needViewProcesing", false);
        setField(term16783, term16783.getClass(), "_backRefs", null);
        setField(term16783, term16783.getClass(), "_subDeserializers", null);
        setField(term16783, term16783.getClass(), "_unwrappedPropertyHandler", null);
        setField(term16783, term16783.getClass(), "_externalTypeIdHandler", null);
        setField(term16783, term16783.getClass(), "_objectIdReader", null);
        setField(term16783, term16783.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term16262;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16781));
        assertTrue(recursiveEquals(term16262, term16783));
    }

};


