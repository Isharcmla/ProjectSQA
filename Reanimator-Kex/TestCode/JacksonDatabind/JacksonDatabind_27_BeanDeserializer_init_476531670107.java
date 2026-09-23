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

public class BeanDeserializer_init_476531670107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29532;
     Object term29655;
     Object term29657;

    public BeanDeserializer_init_476531670107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29420 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term29532 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29636 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setBooleanField(term29532, term29532.getClass(), "_ignoreAllUnknown", false);
        setField(term29532, term29532.getClass(), "_beanType", term29636);
        term29655 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29656 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29655, term29655.getClass(), "_classAnnotations", null);
        setField(term29656, term29656.getClass(), "_referencedType", null);
        setField(term29656, term29656.getClass(), "_typeParametersFor", null);
        setField(term29656, term29656.getClass(), "_typeParameters", null);
        setField(term29656, term29656.getClass(), "_typeNames", null);
        setField(term29656, term29656.getClass(), "_canonicalName", null);
        setField(term29656, term29656.getClass(), "_class", null);
        setIntField(term29656, term29656.getClass(), "_hash", 0);
        setField(term29656, term29656.getClass(), "_valueHandler", null);
        setField(term29656, term29656.getClass(), "_typeHandler", null);
        setBooleanField(term29656, term29656.getClass(), "_asStatic", false);
        setField(term29655, term29655.getClass(), "_beanType", term29656);
        setField(term29655, term29655.getClass(), "_serializationShape", null);
        setField(term29655, term29655.getClass(), "_valueInstantiator", null);
        setField(term29655, term29655.getClass(), "_delegateDeserializer", null);
        setField(term29655, term29655.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term29655, term29655.getClass(), "_nonStandardCreation", false);
        setBooleanField(term29655, term29655.getClass(), "_vanillaProcessing", false);
        setField(term29655, term29655.getClass(), "_beanProperties", null);
        setField(term29655, term29655.getClass(), "_injectables", null);
        setField(term29655, term29655.getClass(), "_anySetter", null);
        setField(term29655, term29655.getClass(), "_ignorableProps", null);
        setBooleanField(term29655, term29655.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term29655, term29655.getClass(), "_needViewProcesing", false);
        setField(term29655, term29655.getClass(), "_backRefs", null);
        setField(term29655, term29655.getClass(), "_subDeserializers", null);
        setField(term29655, term29655.getClass(), "_unwrappedPropertyHandler", null);
        setField(term29655, term29655.getClass(), "_externalTypeIdHandler", null);
        setField(term29655, term29655.getClass(), "_objectIdReader", null);
        setField(term29655, term29655.getClass(), "_valueClass", null);
        term29657 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term29658 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term29657, term29657.getClass(), "_classAnnotations", null);
        setField(term29658, term29658.getClass(), "_referencedType", null);
        setField(term29658, term29658.getClass(), "_typeParametersFor", null);
        setField(term29658, term29658.getClass(), "_typeParameters", null);
        setField(term29658, term29658.getClass(), "_typeNames", null);
        setField(term29658, term29658.getClass(), "_canonicalName", null);
        setField(term29658, term29658.getClass(), "_class", null);
        setIntField(term29658, term29658.getClass(), "_hash", 0);
        setField(term29658, term29658.getClass(), "_valueHandler", null);
        setField(term29658, term29658.getClass(), "_typeHandler", null);
        setBooleanField(term29658, term29658.getClass(), "_asStatic", false);
        setField(term29657, term29657.getClass(), "_beanType", term29658);
        setField(term29657, term29657.getClass(), "_serializationShape", null);
        setField(term29657, term29657.getClass(), "_valueInstantiator", null);
        setField(term29657, term29657.getClass(), "_delegateDeserializer", null);
        setField(term29657, term29657.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term29657, term29657.getClass(), "_nonStandardCreation", false);
        setBooleanField(term29657, term29657.getClass(), "_vanillaProcessing", false);
        setField(term29657, term29657.getClass(), "_beanProperties", null);
        setField(term29657, term29657.getClass(), "_injectables", null);
        setField(term29657, term29657.getClass(), "_anySetter", null);
        setField(term29657, term29657.getClass(), "_ignorableProps", null);
        setBooleanField(term29657, term29657.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term29657, term29657.getClass(), "_needViewProcesing", false);
        setField(term29657, term29657.getClass(), "_backRefs", null);
        setField(term29657, term29657.getClass(), "_subDeserializers", null);
        setField(term29657, term29657.getClass(), "_unwrappedPropertyHandler", null);
        setField(term29657, term29657.getClass(), "_externalTypeIdHandler", null);
        setField(term29657, term29657.getClass(), "_objectIdReader", null);
        setField(term29657, term29657.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        Object[] args = new Object[1];
        args[0] = term29532;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term29655));
        assertTrue(recursiveEquals(term29532, term29657));
    }

};


