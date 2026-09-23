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

public class BeanDeserializer_init_476531670103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28803;
     Object term28926;
     Object term28928;

    public BeanDeserializer_init_476531670103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28691 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term28803 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setBooleanField(term28803, term28803.getClass(), "_ignoreAllUnknown", false);
        setField(term28803, term28803.getClass(), "_beanType", term28907);
        term28926 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28927 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28926, term28926.getClass(), "_classAnnotations", null);
        setField(term28927, term28927.getClass(), "_referencedType", null);
        setField(term28927, term28927.getClass(), "_typeParametersFor", null);
        setField(term28927, term28927.getClass(), "_typeParameters", null);
        setField(term28927, term28927.getClass(), "_typeNames", null);
        setField(term28927, term28927.getClass(), "_canonicalName", null);
        setField(term28927, term28927.getClass(), "_class", null);
        setIntField(term28927, term28927.getClass(), "_hash", 0);
        setField(term28927, term28927.getClass(), "_valueHandler", null);
        setField(term28927, term28927.getClass(), "_typeHandler", null);
        setBooleanField(term28927, term28927.getClass(), "_asStatic", false);
        setField(term28926, term28926.getClass(), "_beanType", term28927);
        setField(term28926, term28926.getClass(), "_serializationShape", null);
        setField(term28926, term28926.getClass(), "_valueInstantiator", null);
        setField(term28926, term28926.getClass(), "_delegateDeserializer", null);
        setField(term28926, term28926.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28926, term28926.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28926, term28926.getClass(), "_vanillaProcessing", false);
        setField(term28926, term28926.getClass(), "_beanProperties", null);
        setField(term28926, term28926.getClass(), "_injectables", null);
        setField(term28926, term28926.getClass(), "_anySetter", null);
        setField(term28926, term28926.getClass(), "_ignorableProps", null);
        setBooleanField(term28926, term28926.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28926, term28926.getClass(), "_needViewProcesing", false);
        setField(term28926, term28926.getClass(), "_backRefs", null);
        setField(term28926, term28926.getClass(), "_subDeserializers", null);
        setField(term28926, term28926.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28926, term28926.getClass(), "_externalTypeIdHandler", null);
        setField(term28926, term28926.getClass(), "_objectIdReader", null);
        setField(term28926, term28926.getClass(), "_valueClass", null);
        term28928 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term28929 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28928, term28928.getClass(), "_classAnnotations", null);
        setField(term28929, term28929.getClass(), "_referencedType", null);
        setField(term28929, term28929.getClass(), "_typeParametersFor", null);
        setField(term28929, term28929.getClass(), "_typeParameters", null);
        setField(term28929, term28929.getClass(), "_typeNames", null);
        setField(term28929, term28929.getClass(), "_canonicalName", null);
        setField(term28929, term28929.getClass(), "_class", null);
        setIntField(term28929, term28929.getClass(), "_hash", 0);
        setField(term28929, term28929.getClass(), "_valueHandler", null);
        setField(term28929, term28929.getClass(), "_typeHandler", null);
        setBooleanField(term28929, term28929.getClass(), "_asStatic", false);
        setField(term28928, term28928.getClass(), "_beanType", term28929);
        setField(term28928, term28928.getClass(), "_serializationShape", null);
        setField(term28928, term28928.getClass(), "_valueInstantiator", null);
        setField(term28928, term28928.getClass(), "_delegateDeserializer", null);
        setField(term28928, term28928.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term28928, term28928.getClass(), "_nonStandardCreation", false);
        setBooleanField(term28928, term28928.getClass(), "_vanillaProcessing", false);
        setField(term28928, term28928.getClass(), "_beanProperties", null);
        setField(term28928, term28928.getClass(), "_injectables", null);
        setField(term28928, term28928.getClass(), "_anySetter", null);
        setField(term28928, term28928.getClass(), "_ignorableProps", null);
        setBooleanField(term28928, term28928.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term28928, term28928.getClass(), "_needViewProcesing", false);
        setField(term28928, term28928.getClass(), "_backRefs", null);
        setField(term28928, term28928.getClass(), "_subDeserializers", null);
        setField(term28928, term28928.getClass(), "_unwrappedPropertyHandler", null);
        setField(term28928, term28928.getClass(), "_externalTypeIdHandler", null);
        setField(term28928, term28928.getClass(), "_objectIdReader", null);
        setField(term28928, term28928.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term28803;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28926));
        assertTrue(recursiveEquals(term28803, term28928));
    }

};


