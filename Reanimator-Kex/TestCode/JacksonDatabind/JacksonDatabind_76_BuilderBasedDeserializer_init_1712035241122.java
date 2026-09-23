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

public class BuilderBasedDeserializer_init_1712035241122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34253;
     Object term34688;
     Object term34690;

    public BuilderBasedDeserializer_init_1712035241122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term34306 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setBooleanField(term34253, term34253.getClass(), "_ignoreAllUnknown", false);
        setField(term34253, term34253.getClass(), "_beanType", term34306);
        term34688 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term34689 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term34688, term34688.getClass(), "_buildMethod", null);
        setField(term34688, term34688.getClass(), "_classAnnotations", null);
        setField(term34689, term34689.getClass(), "_elementType", null);
        setField(term34689, term34689.getClass(), "_superClass", null);
        setField(term34689, term34689.getClass(), "_superInterfaces", null);
        setField(term34689, term34689.getClass(), "_bindings", null);
        setField(term34689, term34689.getClass(), "_canonicalName", null);
        setField(term34689, term34689.getClass(), "_class", null);
        setIntField(term34689, term34689.getClass(), "_hash", 0);
        setField(term34689, term34689.getClass(), "_valueHandler", null);
        setField(term34689, term34689.getClass(), "_typeHandler", null);
        setBooleanField(term34689, term34689.getClass(), "_asStatic", false);
        setField(term34688, term34688.getClass(), "_beanType", term34689);
        setField(term34688, term34688.getClass(), "_serializationShape", null);
        setField(term34688, term34688.getClass(), "_valueInstantiator", null);
        setField(term34688, term34688.getClass(), "_delegateDeserializer", null);
        setField(term34688, term34688.getClass(), "_arrayDelegateDeserializer", null);
        setField(term34688, term34688.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term34688, term34688.getClass(), "_nonStandardCreation", false);
        setBooleanField(term34688, term34688.getClass(), "_vanillaProcessing", false);
        setField(term34688, term34688.getClass(), "_beanProperties", null);
        setField(term34688, term34688.getClass(), "_injectables", null);
        setField(term34688, term34688.getClass(), "_anySetter", null);
        setField(term34688, term34688.getClass(), "_ignorableProps", null);
        setBooleanField(term34688, term34688.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term34688, term34688.getClass(), "_needViewProcesing", false);
        setField(term34688, term34688.getClass(), "_backRefs", null);
        setField(term34688, term34688.getClass(), "_subDeserializers", null);
        setField(term34688, term34688.getClass(), "_unwrappedPropertyHandler", null);
        setField(term34688, term34688.getClass(), "_externalTypeIdHandler", null);
        setField(term34688, term34688.getClass(), "_objectIdReader", null);
        setField(term34688, term34688.getClass(), "_valueClass", null);
        term34690 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term34691 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term34690, term34690.getClass(), "_buildMethod", null);
        setField(term34690, term34690.getClass(), "_classAnnotations", null);
        setField(term34691, term34691.getClass(), "_elementType", null);
        setField(term34691, term34691.getClass(), "_superClass", null);
        setField(term34691, term34691.getClass(), "_superInterfaces", null);
        setField(term34691, term34691.getClass(), "_bindings", null);
        setField(term34691, term34691.getClass(), "_canonicalName", null);
        setField(term34691, term34691.getClass(), "_class", null);
        setIntField(term34691, term34691.getClass(), "_hash", 0);
        setField(term34691, term34691.getClass(), "_valueHandler", null);
        setField(term34691, term34691.getClass(), "_typeHandler", null);
        setBooleanField(term34691, term34691.getClass(), "_asStatic", false);
        setField(term34690, term34690.getClass(), "_beanType", term34691);
        setField(term34690, term34690.getClass(), "_serializationShape", null);
        setField(term34690, term34690.getClass(), "_valueInstantiator", null);
        setField(term34690, term34690.getClass(), "_delegateDeserializer", null);
        setField(term34690, term34690.getClass(), "_arrayDelegateDeserializer", null);
        setField(term34690, term34690.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term34690, term34690.getClass(), "_nonStandardCreation", false);
        setBooleanField(term34690, term34690.getClass(), "_vanillaProcessing", false);
        setField(term34690, term34690.getClass(), "_beanProperties", null);
        setField(term34690, term34690.getClass(), "_injectables", null);
        setField(term34690, term34690.getClass(), "_anySetter", null);
        setField(term34690, term34690.getClass(), "_ignorableProps", null);
        setBooleanField(term34690, term34690.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term34690, term34690.getClass(), "_needViewProcesing", false);
        setField(term34690, term34690.getClass(), "_backRefs", null);
        setField(term34690, term34690.getClass(), "_subDeserializers", null);
        setField(term34690, term34690.getClass(), "_unwrappedPropertyHandler", null);
        setField(term34690, term34690.getClass(), "_externalTypeIdHandler", null);
        setField(term34690, term34690.getClass(), "_objectIdReader", null);
        setField(term34690, term34690.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Object[] args = new Object[1];
        args[0] = term34253;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34688));
        assertTrue(recursiveEquals(term34253, term34690));
    }

};


