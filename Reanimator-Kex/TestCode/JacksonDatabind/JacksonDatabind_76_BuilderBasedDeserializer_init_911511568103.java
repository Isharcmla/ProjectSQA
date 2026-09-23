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

public class BuilderBasedDeserializer_init_911511568103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25947;
     Object term26017;
     Object term26019;

    public BuilderBasedDeserializer_init_911511568103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25947 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term25999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term25947, term25947.getClass(), "_beanType", term25999);
        term26017 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term26018 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26017, term26017.getClass(), "_buildMethod", null);
        setField(term26017, term26017.getClass(), "_classAnnotations", null);
        setField(term26018, term26018.getClass(), "_referencedType", null);
        setField(term26018, term26018.getClass(), "_anchorType", null);
        setField(term26018, term26018.getClass(), "_superClass", null);
        setField(term26018, term26018.getClass(), "_superInterfaces", null);
        setField(term26018, term26018.getClass(), "_bindings", null);
        setField(term26018, term26018.getClass(), "_canonicalName", null);
        setField(term26018, term26018.getClass(), "_class", null);
        setIntField(term26018, term26018.getClass(), "_hash", 0);
        setField(term26018, term26018.getClass(), "_valueHandler", null);
        setField(term26018, term26018.getClass(), "_typeHandler", null);
        setBooleanField(term26018, term26018.getClass(), "_asStatic", false);
        setField(term26017, term26017.getClass(), "_beanType", term26018);
        setField(term26017, term26017.getClass(), "_serializationShape", null);
        setField(term26017, term26017.getClass(), "_valueInstantiator", null);
        setField(term26017, term26017.getClass(), "_delegateDeserializer", null);
        setField(term26017, term26017.getClass(), "_arrayDelegateDeserializer", null);
        setField(term26017, term26017.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term26017, term26017.getClass(), "_nonStandardCreation", false);
        setBooleanField(term26017, term26017.getClass(), "_vanillaProcessing", false);
        setField(term26017, term26017.getClass(), "_beanProperties", null);
        setField(term26017, term26017.getClass(), "_injectables", null);
        setField(term26017, term26017.getClass(), "_anySetter", null);
        setField(term26017, term26017.getClass(), "_ignorableProps", null);
        setBooleanField(term26017, term26017.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term26017, term26017.getClass(), "_needViewProcesing", false);
        setField(term26017, term26017.getClass(), "_backRefs", null);
        setField(term26017, term26017.getClass(), "_subDeserializers", null);
        setField(term26017, term26017.getClass(), "_unwrappedPropertyHandler", null);
        setField(term26017, term26017.getClass(), "_externalTypeIdHandler", null);
        setField(term26017, term26017.getClass(), "_objectIdReader", null);
        setField(term26017, term26017.getClass(), "_valueClass", null);
        term26019 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term26020 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term26019, term26019.getClass(), "_buildMethod", null);
        setField(term26019, term26019.getClass(), "_classAnnotations", null);
        setField(term26020, term26020.getClass(), "_referencedType", null);
        setField(term26020, term26020.getClass(), "_anchorType", null);
        setField(term26020, term26020.getClass(), "_superClass", null);
        setField(term26020, term26020.getClass(), "_superInterfaces", null);
        setField(term26020, term26020.getClass(), "_bindings", null);
        setField(term26020, term26020.getClass(), "_canonicalName", null);
        setField(term26020, term26020.getClass(), "_class", null);
        setIntField(term26020, term26020.getClass(), "_hash", 0);
        setField(term26020, term26020.getClass(), "_valueHandler", null);
        setField(term26020, term26020.getClass(), "_typeHandler", null);
        setBooleanField(term26020, term26020.getClass(), "_asStatic", false);
        setField(term26019, term26019.getClass(), "_beanType", term26020);
        setField(term26019, term26019.getClass(), "_serializationShape", null);
        setField(term26019, term26019.getClass(), "_valueInstantiator", null);
        setField(term26019, term26019.getClass(), "_delegateDeserializer", null);
        setField(term26019, term26019.getClass(), "_arrayDelegateDeserializer", null);
        setField(term26019, term26019.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term26019, term26019.getClass(), "_nonStandardCreation", false);
        setBooleanField(term26019, term26019.getClass(), "_vanillaProcessing", false);
        setField(term26019, term26019.getClass(), "_beanProperties", null);
        setField(term26019, term26019.getClass(), "_injectables", null);
        setField(term26019, term26019.getClass(), "_anySetter", null);
        setField(term26019, term26019.getClass(), "_ignorableProps", null);
        setBooleanField(term26019, term26019.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term26019, term26019.getClass(), "_needViewProcesing", false);
        setField(term26019, term26019.getClass(), "_backRefs", null);
        setField(term26019, term26019.getClass(), "_subDeserializers", null);
        setField(term26019, term26019.getClass(), "_unwrappedPropertyHandler", null);
        setField(term26019, term26019.getClass(), "_externalTypeIdHandler", null);
        setField(term26019, term26019.getClass(), "_objectIdReader", null);
        setField(term26019, term26019.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term25947;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term26017));
        assertTrue(recursiveEquals(term25947, term26019));
    }

};


