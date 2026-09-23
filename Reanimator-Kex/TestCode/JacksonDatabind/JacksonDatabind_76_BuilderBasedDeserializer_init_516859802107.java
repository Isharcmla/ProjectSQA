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

public class BuilderBasedDeserializer_init_516859802107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27079;
     Object term27150;
     Object term27152;

    public BuilderBasedDeserializer_init_516859802107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27079 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term27131 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27079, term27079.getClass(), "_beanType", term27131);
        term27150 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term27151 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27150, term27150.getClass(), "_buildMethod", null);
        setField(term27150, term27150.getClass(), "_classAnnotations", null);
        setField(term27151, term27151.getClass(), "_referencedType", null);
        setField(term27151, term27151.getClass(), "_anchorType", null);
        setField(term27151, term27151.getClass(), "_superClass", null);
        setField(term27151, term27151.getClass(), "_superInterfaces", null);
        setField(term27151, term27151.getClass(), "_bindings", null);
        setField(term27151, term27151.getClass(), "_canonicalName", null);
        setField(term27151, term27151.getClass(), "_class", null);
        setIntField(term27151, term27151.getClass(), "_hash", 0);
        setField(term27151, term27151.getClass(), "_valueHandler", null);
        setField(term27151, term27151.getClass(), "_typeHandler", null);
        setBooleanField(term27151, term27151.getClass(), "_asStatic", false);
        setField(term27150, term27150.getClass(), "_beanType", term27151);
        setField(term27150, term27150.getClass(), "_serializationShape", null);
        setField(term27150, term27150.getClass(), "_valueInstantiator", null);
        setField(term27150, term27150.getClass(), "_delegateDeserializer", null);
        setField(term27150, term27150.getClass(), "_arrayDelegateDeserializer", null);
        setField(term27150, term27150.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27150, term27150.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27150, term27150.getClass(), "_vanillaProcessing", false);
        setField(term27150, term27150.getClass(), "_beanProperties", null);
        setField(term27150, term27150.getClass(), "_injectables", null);
        setField(term27150, term27150.getClass(), "_anySetter", null);
        setField(term27150, term27150.getClass(), "_ignorableProps", null);
        setBooleanField(term27150, term27150.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27150, term27150.getClass(), "_needViewProcesing", false);
        setField(term27150, term27150.getClass(), "_backRefs", null);
        setField(term27150, term27150.getClass(), "_subDeserializers", null);
        setField(term27150, term27150.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27150, term27150.getClass(), "_externalTypeIdHandler", null);
        setField(term27150, term27150.getClass(), "_objectIdReader", null);
        setField(term27150, term27150.getClass(), "_valueClass", null);
        term27152 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term27153 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27152, term27152.getClass(), "_buildMethod", null);
        setField(term27152, term27152.getClass(), "_classAnnotations", null);
        setField(term27153, term27153.getClass(), "_referencedType", null);
        setField(term27153, term27153.getClass(), "_anchorType", null);
        setField(term27153, term27153.getClass(), "_superClass", null);
        setField(term27153, term27153.getClass(), "_superInterfaces", null);
        setField(term27153, term27153.getClass(), "_bindings", null);
        setField(term27153, term27153.getClass(), "_canonicalName", null);
        setField(term27153, term27153.getClass(), "_class", null);
        setIntField(term27153, term27153.getClass(), "_hash", 0);
        setField(term27153, term27153.getClass(), "_valueHandler", null);
        setField(term27153, term27153.getClass(), "_typeHandler", null);
        setBooleanField(term27153, term27153.getClass(), "_asStatic", false);
        setField(term27152, term27152.getClass(), "_beanType", term27153);
        setField(term27152, term27152.getClass(), "_serializationShape", null);
        setField(term27152, term27152.getClass(), "_valueInstantiator", null);
        setField(term27152, term27152.getClass(), "_delegateDeserializer", null);
        setField(term27152, term27152.getClass(), "_arrayDelegateDeserializer", null);
        setField(term27152, term27152.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term27152, term27152.getClass(), "_nonStandardCreation", false);
        setBooleanField(term27152, term27152.getClass(), "_vanillaProcessing", false);
        setField(term27152, term27152.getClass(), "_beanProperties", null);
        setField(term27152, term27152.getClass(), "_injectables", null);
        setField(term27152, term27152.getClass(), "_anySetter", null);
        setField(term27152, term27152.getClass(), "_ignorableProps", null);
        setBooleanField(term27152, term27152.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term27152, term27152.getClass(), "_needViewProcesing", false);
        setField(term27152, term27152.getClass(), "_backRefs", null);
        setField(term27152, term27152.getClass(), "_subDeserializers", null);
        setField(term27152, term27152.getClass(), "_unwrappedPropertyHandler", null);
        setField(term27152, term27152.getClass(), "_externalTypeIdHandler", null);
        setField(term27152, term27152.getClass(), "_objectIdReader", null);
        setField(term27152, term27152.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term27079;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term27150));
        assertTrue(recursiveEquals(term27079, term27152));
    }

};


