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

public class BuilderBasedDeserializer_init_1703058203139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42083;
     Object term42162;
     Object term42164;

    public BuilderBasedDeserializer_init_1703058203139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42083 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term42143 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term42083, term42083.getClass(), "_beanType", term42143);
        term42162 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term42163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term42162, term42162.getClass(), "_buildMethod", null);
        setField(term42162, term42162.getClass(), "_classAnnotations", null);
        setField(term42163, term42163.getClass(), "_referencedType", null);
        setField(term42163, term42163.getClass(), "_superClass", null);
        setField(term42163, term42163.getClass(), "_superInterfaces", null);
        setField(term42163, term42163.getClass(), "_bindings", null);
        setField(term42163, term42163.getClass(), "_canonicalName", null);
        setField(term42163, term42163.getClass(), "_class", null);
        setIntField(term42163, term42163.getClass(), "_hash", 0);
        setField(term42163, term42163.getClass(), "_valueHandler", null);
        setField(term42163, term42163.getClass(), "_typeHandler", null);
        setBooleanField(term42163, term42163.getClass(), "_asStatic", false);
        setField(term42162, term42162.getClass(), "_beanType", term42163);
        setField(term42162, term42162.getClass(), "_serializationShape", null);
        setField(term42162, term42162.getClass(), "_valueInstantiator", null);
        setField(term42162, term42162.getClass(), "_delegateDeserializer", null);
        setField(term42162, term42162.getClass(), "_arrayDelegateDeserializer", null);
        setField(term42162, term42162.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term42162, term42162.getClass(), "_nonStandardCreation", false);
        setBooleanField(term42162, term42162.getClass(), "_vanillaProcessing", false);
        setField(term42162, term42162.getClass(), "_beanProperties", null);
        setField(term42162, term42162.getClass(), "_injectables", null);
        setField(term42162, term42162.getClass(), "_anySetter", null);
        setField(term42162, term42162.getClass(), "_ignorableProps", null);
        setBooleanField(term42162, term42162.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term42162, term42162.getClass(), "_needViewProcesing", false);
        setField(term42162, term42162.getClass(), "_backRefs", null);
        setField(term42162, term42162.getClass(), "_subDeserializers", null);
        setField(term42162, term42162.getClass(), "_unwrappedPropertyHandler", null);
        setField(term42162, term42162.getClass(), "_externalTypeIdHandler", null);
        setField(term42162, term42162.getClass(), "_objectIdReader", null);
        setField(term42162, term42162.getClass(), "_valueClass", null);
        term42164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term42165 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term42164, term42164.getClass(), "_buildMethod", null);
        setField(term42164, term42164.getClass(), "_classAnnotations", null);
        setField(term42165, term42165.getClass(), "_referencedType", null);
        setField(term42165, term42165.getClass(), "_superClass", null);
        setField(term42165, term42165.getClass(), "_superInterfaces", null);
        setField(term42165, term42165.getClass(), "_bindings", null);
        setField(term42165, term42165.getClass(), "_canonicalName", null);
        setField(term42165, term42165.getClass(), "_class", null);
        setIntField(term42165, term42165.getClass(), "_hash", 0);
        setField(term42165, term42165.getClass(), "_valueHandler", null);
        setField(term42165, term42165.getClass(), "_typeHandler", null);
        setBooleanField(term42165, term42165.getClass(), "_asStatic", false);
        setField(term42164, term42164.getClass(), "_beanType", term42165);
        setField(term42164, term42164.getClass(), "_serializationShape", null);
        setField(term42164, term42164.getClass(), "_valueInstantiator", null);
        setField(term42164, term42164.getClass(), "_delegateDeserializer", null);
        setField(term42164, term42164.getClass(), "_arrayDelegateDeserializer", null);
        setField(term42164, term42164.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term42164, term42164.getClass(), "_nonStandardCreation", false);
        setBooleanField(term42164, term42164.getClass(), "_vanillaProcessing", false);
        setField(term42164, term42164.getClass(), "_beanProperties", null);
        setField(term42164, term42164.getClass(), "_injectables", null);
        setField(term42164, term42164.getClass(), "_anySetter", null);
        setField(term42164, term42164.getClass(), "_ignorableProps", null);
        setBooleanField(term42164, term42164.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term42164, term42164.getClass(), "_needViewProcesing", false);
        setField(term42164, term42164.getClass(), "_backRefs", null);
        setField(term42164, term42164.getClass(), "_subDeserializers", null);
        setField(term42164, term42164.getClass(), "_unwrappedPropertyHandler", null);
        setField(term42164, term42164.getClass(), "_externalTypeIdHandler", null);
        setField(term42164, term42164.getClass(), "_objectIdReader", null);
        setField(term42164, term42164.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term42083;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term42162));
        assertTrue(recursiveEquals(term42083, term42164));
    }

};


