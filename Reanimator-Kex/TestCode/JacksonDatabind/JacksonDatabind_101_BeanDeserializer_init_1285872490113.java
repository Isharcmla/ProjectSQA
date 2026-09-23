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

public class BeanDeserializer_init_1285872490113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23716;
     Object term23839;
     Object term23841;

    public BeanDeserializer_init_1285872490113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23604 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term23716 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23820 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term23716, term23716.getClass(), "_beanType", term23820);
        term23839 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23840 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term23839, term23839.getClass(), "_nullFromCreator", null);
        setField(term23839, term23839.getClass(), "_currentlyTransforming", null);
        setField(term23840, term23840.getClass(), "_referencedType", null);
        setField(term23840, term23840.getClass(), "_anchorType", null);
        setField(term23840, term23840.getClass(), "_superClass", null);
        setField(term23840, term23840.getClass(), "_superInterfaces", null);
        setField(term23840, term23840.getClass(), "_bindings", null);
        setField(term23840, term23840.getClass(), "_canonicalName", null);
        setField(term23840, term23840.getClass(), "_class", null);
        setIntField(term23840, term23840.getClass(), "_hash", 0);
        setField(term23840, term23840.getClass(), "_valueHandler", null);
        setField(term23840, term23840.getClass(), "_typeHandler", null);
        setBooleanField(term23840, term23840.getClass(), "_asStatic", false);
        setField(term23839, term23839.getClass(), "_beanType", term23840);
        setField(term23839, term23839.getClass(), "_serializationShape", null);
        setField(term23839, term23839.getClass(), "_valueInstantiator", null);
        setField(term23839, term23839.getClass(), "_delegateDeserializer", null);
        setField(term23839, term23839.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23839, term23839.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23839, term23839.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23839, term23839.getClass(), "_vanillaProcessing", false);
        setField(term23839, term23839.getClass(), "_beanProperties", null);
        setField(term23839, term23839.getClass(), "_injectables", null);
        setField(term23839, term23839.getClass(), "_anySetter", null);
        setField(term23839, term23839.getClass(), "_ignorableProps", null);
        setBooleanField(term23839, term23839.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23839, term23839.getClass(), "_needViewProcesing", false);
        setField(term23839, term23839.getClass(), "_backRefs", null);
        setField(term23839, term23839.getClass(), "_subDeserializers", null);
        setField(term23839, term23839.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23839, term23839.getClass(), "_externalTypeIdHandler", null);
        setField(term23839, term23839.getClass(), "_objectIdReader", null);
        setField(term23839, term23839.getClass(), "_valueClass", null);
        term23841 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term23842 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term23841, term23841.getClass(), "_nullFromCreator", null);
        setField(term23841, term23841.getClass(), "_currentlyTransforming", null);
        setField(term23842, term23842.getClass(), "_referencedType", null);
        setField(term23842, term23842.getClass(), "_anchorType", null);
        setField(term23842, term23842.getClass(), "_superClass", null);
        setField(term23842, term23842.getClass(), "_superInterfaces", null);
        setField(term23842, term23842.getClass(), "_bindings", null);
        setField(term23842, term23842.getClass(), "_canonicalName", null);
        setField(term23842, term23842.getClass(), "_class", null);
        setIntField(term23842, term23842.getClass(), "_hash", 0);
        setField(term23842, term23842.getClass(), "_valueHandler", null);
        setField(term23842, term23842.getClass(), "_typeHandler", null);
        setBooleanField(term23842, term23842.getClass(), "_asStatic", false);
        setField(term23841, term23841.getClass(), "_beanType", term23842);
        setField(term23841, term23841.getClass(), "_serializationShape", null);
        setField(term23841, term23841.getClass(), "_valueInstantiator", null);
        setField(term23841, term23841.getClass(), "_delegateDeserializer", null);
        setField(term23841, term23841.getClass(), "_arrayDelegateDeserializer", null);
        setField(term23841, term23841.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term23841, term23841.getClass(), "_nonStandardCreation", false);
        setBooleanField(term23841, term23841.getClass(), "_vanillaProcessing", false);
        setField(term23841, term23841.getClass(), "_beanProperties", null);
        setField(term23841, term23841.getClass(), "_injectables", null);
        setField(term23841, term23841.getClass(), "_anySetter", null);
        setField(term23841, term23841.getClass(), "_ignorableProps", null);
        setBooleanField(term23841, term23841.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term23841, term23841.getClass(), "_needViewProcesing", false);
        setField(term23841, term23841.getClass(), "_backRefs", null);
        setField(term23841, term23841.getClass(), "_subDeserializers", null);
        setField(term23841, term23841.getClass(), "_unwrappedPropertyHandler", null);
        setField(term23841, term23841.getClass(), "_externalTypeIdHandler", null);
        setField(term23841, term23841.getClass(), "_objectIdReader", null);
        setField(term23841, term23841.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term23716;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term23839));
        assertTrue(recursiveEquals(term23716, term23841));
    }

};


