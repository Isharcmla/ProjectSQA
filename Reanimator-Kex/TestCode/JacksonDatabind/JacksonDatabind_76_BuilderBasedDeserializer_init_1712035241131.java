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

public class BuilderBasedDeserializer_init_1712035241131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36449;
     Object term36516;
     Object term36518;

    public BuilderBasedDeserializer_init_1712035241131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36449 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term36497 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setBooleanField(term36449, term36449.getClass(), "_ignoreAllUnknown", false);
        setField(term36449, term36449.getClass(), "_beanType", term36497);
        term36516 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term36517 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term36516, term36516.getClass(), "_buildMethod", null);
        setField(term36516, term36516.getClass(), "_classAnnotations", null);
        setField(term36517, term36517.getClass(), "_componentType", null);
        setField(term36517, term36517.getClass(), "_emptyArray", null);
        setField(term36517, term36517.getClass(), "_superClass", null);
        setField(term36517, term36517.getClass(), "_superInterfaces", null);
        setField(term36517, term36517.getClass(), "_bindings", null);
        setField(term36517, term36517.getClass(), "_canonicalName", null);
        setField(term36517, term36517.getClass(), "_class", null);
        setIntField(term36517, term36517.getClass(), "_hash", 0);
        setField(term36517, term36517.getClass(), "_valueHandler", null);
        setField(term36517, term36517.getClass(), "_typeHandler", null);
        setBooleanField(term36517, term36517.getClass(), "_asStatic", false);
        setField(term36516, term36516.getClass(), "_beanType", term36517);
        setField(term36516, term36516.getClass(), "_serializationShape", null);
        setField(term36516, term36516.getClass(), "_valueInstantiator", null);
        setField(term36516, term36516.getClass(), "_delegateDeserializer", null);
        setField(term36516, term36516.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36516, term36516.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36516, term36516.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36516, term36516.getClass(), "_vanillaProcessing", false);
        setField(term36516, term36516.getClass(), "_beanProperties", null);
        setField(term36516, term36516.getClass(), "_injectables", null);
        setField(term36516, term36516.getClass(), "_anySetter", null);
        setField(term36516, term36516.getClass(), "_ignorableProps", null);
        setBooleanField(term36516, term36516.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36516, term36516.getClass(), "_needViewProcesing", false);
        setField(term36516, term36516.getClass(), "_backRefs", null);
        setField(term36516, term36516.getClass(), "_subDeserializers", null);
        setField(term36516, term36516.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36516, term36516.getClass(), "_externalTypeIdHandler", null);
        setField(term36516, term36516.getClass(), "_objectIdReader", null);
        setField(term36516, term36516.getClass(), "_valueClass", null);
        term36518 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term36519 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term36518, term36518.getClass(), "_buildMethod", null);
        setField(term36518, term36518.getClass(), "_classAnnotations", null);
        setField(term36519, term36519.getClass(), "_componentType", null);
        setField(term36519, term36519.getClass(), "_emptyArray", null);
        setField(term36519, term36519.getClass(), "_superClass", null);
        setField(term36519, term36519.getClass(), "_superInterfaces", null);
        setField(term36519, term36519.getClass(), "_bindings", null);
        setField(term36519, term36519.getClass(), "_canonicalName", null);
        setField(term36519, term36519.getClass(), "_class", null);
        setIntField(term36519, term36519.getClass(), "_hash", 0);
        setField(term36519, term36519.getClass(), "_valueHandler", null);
        setField(term36519, term36519.getClass(), "_typeHandler", null);
        setBooleanField(term36519, term36519.getClass(), "_asStatic", false);
        setField(term36518, term36518.getClass(), "_beanType", term36519);
        setField(term36518, term36518.getClass(), "_serializationShape", null);
        setField(term36518, term36518.getClass(), "_valueInstantiator", null);
        setField(term36518, term36518.getClass(), "_delegateDeserializer", null);
        setField(term36518, term36518.getClass(), "_arrayDelegateDeserializer", null);
        setField(term36518, term36518.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term36518, term36518.getClass(), "_nonStandardCreation", false);
        setBooleanField(term36518, term36518.getClass(), "_vanillaProcessing", false);
        setField(term36518, term36518.getClass(), "_beanProperties", null);
        setField(term36518, term36518.getClass(), "_injectables", null);
        setField(term36518, term36518.getClass(), "_anySetter", null);
        setField(term36518, term36518.getClass(), "_ignorableProps", null);
        setBooleanField(term36518, term36518.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term36518, term36518.getClass(), "_needViewProcesing", false);
        setField(term36518, term36518.getClass(), "_backRefs", null);
        setField(term36518, term36518.getClass(), "_subDeserializers", null);
        setField(term36518, term36518.getClass(), "_unwrappedPropertyHandler", null);
        setField(term36518, term36518.getClass(), "_externalTypeIdHandler", null);
        setField(term36518, term36518.getClass(), "_objectIdReader", null);
        setField(term36518, term36518.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term36449;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term36516));
        assertTrue(recursiveEquals(term36449, term36518));
    }

};


