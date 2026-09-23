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

public class BuilderBasedDeserializer_init_1712035241193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93376;
     Object term93441;
     Object term93443;

    public BuilderBasedDeserializer_init_1712035241193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93376 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term93422 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setBooleanField(term93376, term93376.getClass(), "_ignoreAllUnknown", false);
        setField(term93376, term93376.getClass(), "_beanType", term93422);
        term93441 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term93442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term93441, term93441.getClass(), "_buildMethod", null);
        setField(term93441, term93441.getClass(), "_classAnnotations", null);
        setField(term93442, term93442.getClass(), "_keyType", null);
        setField(term93442, term93442.getClass(), "_valueType", null);
        setField(term93442, term93442.getClass(), "_superClass", null);
        setField(term93442, term93442.getClass(), "_superInterfaces", null);
        setField(term93442, term93442.getClass(), "_bindings", null);
        setField(term93442, term93442.getClass(), "_canonicalName", null);
        setField(term93442, term93442.getClass(), "_class", null);
        setIntField(term93442, term93442.getClass(), "_hash", 0);
        setField(term93442, term93442.getClass(), "_valueHandler", null);
        setField(term93442, term93442.getClass(), "_typeHandler", null);
        setBooleanField(term93442, term93442.getClass(), "_asStatic", false);
        setField(term93441, term93441.getClass(), "_beanType", term93442);
        setField(term93441, term93441.getClass(), "_serializationShape", null);
        setField(term93441, term93441.getClass(), "_valueInstantiator", null);
        setField(term93441, term93441.getClass(), "_delegateDeserializer", null);
        setField(term93441, term93441.getClass(), "_arrayDelegateDeserializer", null);
        setField(term93441, term93441.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term93441, term93441.getClass(), "_nonStandardCreation", false);
        setBooleanField(term93441, term93441.getClass(), "_vanillaProcessing", false);
        setField(term93441, term93441.getClass(), "_beanProperties", null);
        setField(term93441, term93441.getClass(), "_injectables", null);
        setField(term93441, term93441.getClass(), "_anySetter", null);
        setField(term93441, term93441.getClass(), "_ignorableProps", null);
        setBooleanField(term93441, term93441.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term93441, term93441.getClass(), "_needViewProcesing", false);
        setField(term93441, term93441.getClass(), "_backRefs", null);
        setField(term93441, term93441.getClass(), "_subDeserializers", null);
        setField(term93441, term93441.getClass(), "_unwrappedPropertyHandler", null);
        setField(term93441, term93441.getClass(), "_externalTypeIdHandler", null);
        setField(term93441, term93441.getClass(), "_objectIdReader", null);
        setField(term93441, term93441.getClass(), "_valueClass", null);
        term93443 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term93444 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term93443, term93443.getClass(), "_buildMethod", null);
        setField(term93443, term93443.getClass(), "_classAnnotations", null);
        setField(term93444, term93444.getClass(), "_keyType", null);
        setField(term93444, term93444.getClass(), "_valueType", null);
        setField(term93444, term93444.getClass(), "_superClass", null);
        setField(term93444, term93444.getClass(), "_superInterfaces", null);
        setField(term93444, term93444.getClass(), "_bindings", null);
        setField(term93444, term93444.getClass(), "_canonicalName", null);
        setField(term93444, term93444.getClass(), "_class", null);
        setIntField(term93444, term93444.getClass(), "_hash", 0);
        setField(term93444, term93444.getClass(), "_valueHandler", null);
        setField(term93444, term93444.getClass(), "_typeHandler", null);
        setBooleanField(term93444, term93444.getClass(), "_asStatic", false);
        setField(term93443, term93443.getClass(), "_beanType", term93444);
        setField(term93443, term93443.getClass(), "_serializationShape", null);
        setField(term93443, term93443.getClass(), "_valueInstantiator", null);
        setField(term93443, term93443.getClass(), "_delegateDeserializer", null);
        setField(term93443, term93443.getClass(), "_arrayDelegateDeserializer", null);
        setField(term93443, term93443.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term93443, term93443.getClass(), "_nonStandardCreation", false);
        setBooleanField(term93443, term93443.getClass(), "_vanillaProcessing", false);
        setField(term93443, term93443.getClass(), "_beanProperties", null);
        setField(term93443, term93443.getClass(), "_injectables", null);
        setField(term93443, term93443.getClass(), "_anySetter", null);
        setField(term93443, term93443.getClass(), "_ignorableProps", null);
        setBooleanField(term93443, term93443.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term93443, term93443.getClass(), "_needViewProcesing", false);
        setField(term93443, term93443.getClass(), "_backRefs", null);
        setField(term93443, term93443.getClass(), "_subDeserializers", null);
        setField(term93443, term93443.getClass(), "_unwrappedPropertyHandler", null);
        setField(term93443, term93443.getClass(), "_externalTypeIdHandler", null);
        setField(term93443, term93443.getClass(), "_objectIdReader", null);
        setField(term93443, term93443.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term93376;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term93441));
        assertTrue(recursiveEquals(term93376, term93443));
    }

};


