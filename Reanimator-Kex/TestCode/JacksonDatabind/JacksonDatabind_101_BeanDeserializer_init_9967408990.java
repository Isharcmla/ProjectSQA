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

public class BeanDeserializer_init_9967408990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17391;
     Object term17884;
     Object term17886;

    public BeanDeserializer_init_9967408990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17279 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term17391 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17511 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term17391, term17391.getClass(), "_beanType", term17511);
        term17884 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17885 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term17884, term17884.getClass(), "_nullFromCreator", null);
        setField(term17884, term17884.getClass(), "_currentlyTransforming", null);
        setField(term17885, term17885.getClass(), "_referencedType", null);
        setField(term17885, term17885.getClass(), "_superClass", null);
        setField(term17885, term17885.getClass(), "_superInterfaces", null);
        setField(term17885, term17885.getClass(), "_bindings", null);
        setField(term17885, term17885.getClass(), "_canonicalName", null);
        setField(term17885, term17885.getClass(), "_class", null);
        setIntField(term17885, term17885.getClass(), "_hash", 0);
        setField(term17885, term17885.getClass(), "_valueHandler", null);
        setField(term17885, term17885.getClass(), "_typeHandler", null);
        setBooleanField(term17885, term17885.getClass(), "_asStatic", false);
        setField(term17884, term17884.getClass(), "_beanType", term17885);
        setField(term17884, term17884.getClass(), "_serializationShape", null);
        setField(term17884, term17884.getClass(), "_valueInstantiator", null);
        setField(term17884, term17884.getClass(), "_delegateDeserializer", null);
        setField(term17884, term17884.getClass(), "_arrayDelegateDeserializer", null);
        setField(term17884, term17884.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17884, term17884.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17884, term17884.getClass(), "_vanillaProcessing", false);
        setField(term17884, term17884.getClass(), "_beanProperties", null);
        setField(term17884, term17884.getClass(), "_injectables", null);
        setField(term17884, term17884.getClass(), "_anySetter", null);
        setField(term17884, term17884.getClass(), "_ignorableProps", null);
        setBooleanField(term17884, term17884.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17884, term17884.getClass(), "_needViewProcesing", false);
        setField(term17884, term17884.getClass(), "_backRefs", null);
        setField(term17884, term17884.getClass(), "_subDeserializers", null);
        setField(term17884, term17884.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17884, term17884.getClass(), "_externalTypeIdHandler", null);
        setField(term17884, term17884.getClass(), "_objectIdReader", null);
        setField(term17884, term17884.getClass(), "_valueClass", null);
        term17886 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term17887 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term17886, term17886.getClass(), "_nullFromCreator", null);
        setField(term17886, term17886.getClass(), "_currentlyTransforming", null);
        setField(term17887, term17887.getClass(), "_referencedType", null);
        setField(term17887, term17887.getClass(), "_superClass", null);
        setField(term17887, term17887.getClass(), "_superInterfaces", null);
        setField(term17887, term17887.getClass(), "_bindings", null);
        setField(term17887, term17887.getClass(), "_canonicalName", null);
        setField(term17887, term17887.getClass(), "_class", null);
        setIntField(term17887, term17887.getClass(), "_hash", 0);
        setField(term17887, term17887.getClass(), "_valueHandler", null);
        setField(term17887, term17887.getClass(), "_typeHandler", null);
        setBooleanField(term17887, term17887.getClass(), "_asStatic", false);
        setField(term17886, term17886.getClass(), "_beanType", term17887);
        setField(term17886, term17886.getClass(), "_serializationShape", null);
        setField(term17886, term17886.getClass(), "_valueInstantiator", null);
        setField(term17886, term17886.getClass(), "_delegateDeserializer", null);
        setField(term17886, term17886.getClass(), "_arrayDelegateDeserializer", null);
        setField(term17886, term17886.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term17886, term17886.getClass(), "_nonStandardCreation", false);
        setBooleanField(term17886, term17886.getClass(), "_vanillaProcessing", false);
        setField(term17886, term17886.getClass(), "_beanProperties", null);
        setField(term17886, term17886.getClass(), "_injectables", null);
        setField(term17886, term17886.getClass(), "_anySetter", null);
        setField(term17886, term17886.getClass(), "_ignorableProps", null);
        setBooleanField(term17886, term17886.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term17886, term17886.getClass(), "_needViewProcesing", false);
        setField(term17886, term17886.getClass(), "_backRefs", null);
        setField(term17886, term17886.getClass(), "_subDeserializers", null);
        setField(term17886, term17886.getClass(), "_unwrappedPropertyHandler", null);
        setField(term17886, term17886.getClass(), "_externalTypeIdHandler", null);
        setField(term17886, term17886.getClass(), "_objectIdReader", null);
        setField(term17886, term17886.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term17391;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17884));
        assertTrue(recursiveEquals(term17391, term17886));
    }

};


