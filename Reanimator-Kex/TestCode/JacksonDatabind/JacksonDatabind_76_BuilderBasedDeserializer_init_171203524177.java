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

public class BuilderBasedDeserializer_init_171203524177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14694;
     Object term14762;
     Object term14764;

    public BuilderBasedDeserializer_init_171203524177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14694 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term14743 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setBooleanField(term14694, term14694.getClass(), "_ignoreAllUnknown", false);
        setField(term14694, term14694.getClass(), "_beanType", term14743);
        term14762 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term14763 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term14762, term14762.getClass(), "_buildMethod", null);
        setField(term14762, term14762.getClass(), "_classAnnotations", null);
        setField(term14763, term14763.getClass(), "_superClass", null);
        setField(term14763, term14763.getClass(), "_superInterfaces", null);
        setField(term14763, term14763.getClass(), "_bindings", null);
        setField(term14763, term14763.getClass(), "_canonicalName", null);
        setField(term14763, term14763.getClass(), "_class", null);
        setIntField(term14763, term14763.getClass(), "_hash", 0);
        setField(term14763, term14763.getClass(), "_valueHandler", null);
        setField(term14763, term14763.getClass(), "_typeHandler", null);
        setBooleanField(term14763, term14763.getClass(), "_asStatic", false);
        setField(term14762, term14762.getClass(), "_beanType", term14763);
        setField(term14762, term14762.getClass(), "_serializationShape", null);
        setField(term14762, term14762.getClass(), "_valueInstantiator", null);
        setField(term14762, term14762.getClass(), "_delegateDeserializer", null);
        setField(term14762, term14762.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14762, term14762.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14762, term14762.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14762, term14762.getClass(), "_vanillaProcessing", false);
        setField(term14762, term14762.getClass(), "_beanProperties", null);
        setField(term14762, term14762.getClass(), "_injectables", null);
        setField(term14762, term14762.getClass(), "_anySetter", null);
        setField(term14762, term14762.getClass(), "_ignorableProps", null);
        setBooleanField(term14762, term14762.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14762, term14762.getClass(), "_needViewProcesing", false);
        setField(term14762, term14762.getClass(), "_backRefs", null);
        setField(term14762, term14762.getClass(), "_subDeserializers", null);
        setField(term14762, term14762.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14762, term14762.getClass(), "_externalTypeIdHandler", null);
        setField(term14762, term14762.getClass(), "_objectIdReader", null);
        setField(term14762, term14762.getClass(), "_valueClass", null);
        term14764 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term14765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term14764, term14764.getClass(), "_buildMethod", null);
        setField(term14764, term14764.getClass(), "_classAnnotations", null);
        setField(term14765, term14765.getClass(), "_superClass", null);
        setField(term14765, term14765.getClass(), "_superInterfaces", null);
        setField(term14765, term14765.getClass(), "_bindings", null);
        setField(term14765, term14765.getClass(), "_canonicalName", null);
        setField(term14765, term14765.getClass(), "_class", null);
        setIntField(term14765, term14765.getClass(), "_hash", 0);
        setField(term14765, term14765.getClass(), "_valueHandler", null);
        setField(term14765, term14765.getClass(), "_typeHandler", null);
        setBooleanField(term14765, term14765.getClass(), "_asStatic", false);
        setField(term14764, term14764.getClass(), "_beanType", term14765);
        setField(term14764, term14764.getClass(), "_serializationShape", null);
        setField(term14764, term14764.getClass(), "_valueInstantiator", null);
        setField(term14764, term14764.getClass(), "_delegateDeserializer", null);
        setField(term14764, term14764.getClass(), "_arrayDelegateDeserializer", null);
        setField(term14764, term14764.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term14764, term14764.getClass(), "_nonStandardCreation", false);
        setBooleanField(term14764, term14764.getClass(), "_vanillaProcessing", false);
        setField(term14764, term14764.getClass(), "_beanProperties", null);
        setField(term14764, term14764.getClass(), "_injectables", null);
        setField(term14764, term14764.getClass(), "_anySetter", null);
        setField(term14764, term14764.getClass(), "_ignorableProps", null);
        setBooleanField(term14764, term14764.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term14764, term14764.getClass(), "_needViewProcesing", false);
        setField(term14764, term14764.getClass(), "_backRefs", null);
        setField(term14764, term14764.getClass(), "_subDeserializers", null);
        setField(term14764, term14764.getClass(), "_unwrappedPropertyHandler", null);
        setField(term14764, term14764.getClass(), "_externalTypeIdHandler", null);
        setField(term14764, term14764.getClass(), "_objectIdReader", null);
        setField(term14764, term14764.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term14694;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14762));
        assertTrue(recursiveEquals(term14694, term14764));
    }

};


