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

public class BuilderBasedDeserializer_init_1703058203155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57724;
     Object term57795;
     Object term57797;

    public BuilderBasedDeserializer_init_1703058203155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57724 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term57776 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term57724, term57724.getClass(), "_beanType", term57776);
        term57795 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term57796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term57795, term57795.getClass(), "_buildMethod", null);
        setField(term57795, term57795.getClass(), "_classAnnotations", null);
        setField(term57796, term57796.getClass(), "_referencedType", null);
        setField(term57796, term57796.getClass(), "_anchorType", null);
        setField(term57796, term57796.getClass(), "_superClass", null);
        setField(term57796, term57796.getClass(), "_superInterfaces", null);
        setField(term57796, term57796.getClass(), "_bindings", null);
        setField(term57796, term57796.getClass(), "_canonicalName", null);
        setField(term57796, term57796.getClass(), "_class", null);
        setIntField(term57796, term57796.getClass(), "_hash", 0);
        setField(term57796, term57796.getClass(), "_valueHandler", null);
        setField(term57796, term57796.getClass(), "_typeHandler", null);
        setBooleanField(term57796, term57796.getClass(), "_asStatic", false);
        setField(term57795, term57795.getClass(), "_beanType", term57796);
        setField(term57795, term57795.getClass(), "_serializationShape", null);
        setField(term57795, term57795.getClass(), "_valueInstantiator", null);
        setField(term57795, term57795.getClass(), "_delegateDeserializer", null);
        setField(term57795, term57795.getClass(), "_arrayDelegateDeserializer", null);
        setField(term57795, term57795.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term57795, term57795.getClass(), "_nonStandardCreation", false);
        setBooleanField(term57795, term57795.getClass(), "_vanillaProcessing", false);
        setField(term57795, term57795.getClass(), "_beanProperties", null);
        setField(term57795, term57795.getClass(), "_injectables", null);
        setField(term57795, term57795.getClass(), "_anySetter", null);
        setField(term57795, term57795.getClass(), "_ignorableProps", null);
        setBooleanField(term57795, term57795.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term57795, term57795.getClass(), "_needViewProcesing", false);
        setField(term57795, term57795.getClass(), "_backRefs", null);
        setField(term57795, term57795.getClass(), "_subDeserializers", null);
        setField(term57795, term57795.getClass(), "_unwrappedPropertyHandler", null);
        setField(term57795, term57795.getClass(), "_externalTypeIdHandler", null);
        setField(term57795, term57795.getClass(), "_objectIdReader", null);
        setField(term57795, term57795.getClass(), "_valueClass", null);
        term57797 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term57798 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term57797, term57797.getClass(), "_buildMethod", null);
        setField(term57797, term57797.getClass(), "_classAnnotations", null);
        setField(term57798, term57798.getClass(), "_referencedType", null);
        setField(term57798, term57798.getClass(), "_anchorType", null);
        setField(term57798, term57798.getClass(), "_superClass", null);
        setField(term57798, term57798.getClass(), "_superInterfaces", null);
        setField(term57798, term57798.getClass(), "_bindings", null);
        setField(term57798, term57798.getClass(), "_canonicalName", null);
        setField(term57798, term57798.getClass(), "_class", null);
        setIntField(term57798, term57798.getClass(), "_hash", 0);
        setField(term57798, term57798.getClass(), "_valueHandler", null);
        setField(term57798, term57798.getClass(), "_typeHandler", null);
        setBooleanField(term57798, term57798.getClass(), "_asStatic", false);
        setField(term57797, term57797.getClass(), "_beanType", term57798);
        setField(term57797, term57797.getClass(), "_serializationShape", null);
        setField(term57797, term57797.getClass(), "_valueInstantiator", null);
        setField(term57797, term57797.getClass(), "_delegateDeserializer", null);
        setField(term57797, term57797.getClass(), "_arrayDelegateDeserializer", null);
        setField(term57797, term57797.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term57797, term57797.getClass(), "_nonStandardCreation", false);
        setBooleanField(term57797, term57797.getClass(), "_vanillaProcessing", false);
        setField(term57797, term57797.getClass(), "_beanProperties", null);
        setField(term57797, term57797.getClass(), "_injectables", null);
        setField(term57797, term57797.getClass(), "_anySetter", null);
        setField(term57797, term57797.getClass(), "_ignorableProps", null);
        setBooleanField(term57797, term57797.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term57797, term57797.getClass(), "_needViewProcesing", false);
        setField(term57797, term57797.getClass(), "_backRefs", null);
        setField(term57797, term57797.getClass(), "_subDeserializers", null);
        setField(term57797, term57797.getClass(), "_unwrappedPropertyHandler", null);
        setField(term57797, term57797.getClass(), "_externalTypeIdHandler", null);
        setField(term57797, term57797.getClass(), "_objectIdReader", null);
        setField(term57797, term57797.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term57724;
        args[1] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term57795));
        assertTrue(recursiveEquals(term57724, term57797));
    }

};


