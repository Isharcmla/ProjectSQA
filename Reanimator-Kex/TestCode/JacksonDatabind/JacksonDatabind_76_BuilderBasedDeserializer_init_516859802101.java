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

public class BuilderBasedDeserializer_init_516859802101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25533;
     Object term25604;
     Object term25606;

    public BuilderBasedDeserializer_init_516859802101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25533 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term25585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term25533, term25533.getClass(), "_beanType", term25585);
        term25604 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term25605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term25604, term25604.getClass(), "_buildMethod", null);
        setField(term25604, term25604.getClass(), "_classAnnotations", null);
        setField(term25605, term25605.getClass(), "_referencedType", null);
        setField(term25605, term25605.getClass(), "_anchorType", null);
        setField(term25605, term25605.getClass(), "_superClass", null);
        setField(term25605, term25605.getClass(), "_superInterfaces", null);
        setField(term25605, term25605.getClass(), "_bindings", null);
        setField(term25605, term25605.getClass(), "_canonicalName", null);
        setField(term25605, term25605.getClass(), "_class", null);
        setIntField(term25605, term25605.getClass(), "_hash", 0);
        setField(term25605, term25605.getClass(), "_valueHandler", null);
        setField(term25605, term25605.getClass(), "_typeHandler", null);
        setBooleanField(term25605, term25605.getClass(), "_asStatic", false);
        setField(term25604, term25604.getClass(), "_beanType", term25605);
        setField(term25604, term25604.getClass(), "_serializationShape", null);
        setField(term25604, term25604.getClass(), "_valueInstantiator", null);
        setField(term25604, term25604.getClass(), "_delegateDeserializer", null);
        setField(term25604, term25604.getClass(), "_arrayDelegateDeserializer", null);
        setField(term25604, term25604.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term25604, term25604.getClass(), "_nonStandardCreation", false);
        setBooleanField(term25604, term25604.getClass(), "_vanillaProcessing", false);
        setField(term25604, term25604.getClass(), "_beanProperties", null);
        setField(term25604, term25604.getClass(), "_injectables", null);
        setField(term25604, term25604.getClass(), "_anySetter", null);
        setField(term25604, term25604.getClass(), "_ignorableProps", null);
        setBooleanField(term25604, term25604.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term25604, term25604.getClass(), "_needViewProcesing", false);
        setField(term25604, term25604.getClass(), "_backRefs", null);
        setField(term25604, term25604.getClass(), "_subDeserializers", null);
        setField(term25604, term25604.getClass(), "_unwrappedPropertyHandler", null);
        setField(term25604, term25604.getClass(), "_externalTypeIdHandler", null);
        setField(term25604, term25604.getClass(), "_objectIdReader", null);
        setField(term25604, term25604.getClass(), "_valueClass", null);
        term25606 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term25607 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term25606, term25606.getClass(), "_buildMethod", null);
        setField(term25606, term25606.getClass(), "_classAnnotations", null);
        setField(term25607, term25607.getClass(), "_referencedType", null);
        setField(term25607, term25607.getClass(), "_anchorType", null);
        setField(term25607, term25607.getClass(), "_superClass", null);
        setField(term25607, term25607.getClass(), "_superInterfaces", null);
        setField(term25607, term25607.getClass(), "_bindings", null);
        setField(term25607, term25607.getClass(), "_canonicalName", null);
        setField(term25607, term25607.getClass(), "_class", null);
        setIntField(term25607, term25607.getClass(), "_hash", 0);
        setField(term25607, term25607.getClass(), "_valueHandler", null);
        setField(term25607, term25607.getClass(), "_typeHandler", null);
        setBooleanField(term25607, term25607.getClass(), "_asStatic", false);
        setField(term25606, term25606.getClass(), "_beanType", term25607);
        setField(term25606, term25606.getClass(), "_serializationShape", null);
        setField(term25606, term25606.getClass(), "_valueInstantiator", null);
        setField(term25606, term25606.getClass(), "_delegateDeserializer", null);
        setField(term25606, term25606.getClass(), "_arrayDelegateDeserializer", null);
        setField(term25606, term25606.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term25606, term25606.getClass(), "_nonStandardCreation", false);
        setBooleanField(term25606, term25606.getClass(), "_vanillaProcessing", false);
        setField(term25606, term25606.getClass(), "_beanProperties", null);
        setField(term25606, term25606.getClass(), "_injectables", null);
        setField(term25606, term25606.getClass(), "_anySetter", null);
        setField(term25606, term25606.getClass(), "_ignorableProps", null);
        setBooleanField(term25606, term25606.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term25606, term25606.getClass(), "_needViewProcesing", false);
        setField(term25606, term25606.getClass(), "_backRefs", null);
        setField(term25606, term25606.getClass(), "_subDeserializers", null);
        setField(term25606, term25606.getClass(), "_unwrappedPropertyHandler", null);
        setField(term25606, term25606.getClass(), "_externalTypeIdHandler", null);
        setField(term25606, term25606.getClass(), "_objectIdReader", null);
        setField(term25606, term25606.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term25533;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term25604));
        assertTrue(recursiveEquals(term25533, term25606));
    }

};


