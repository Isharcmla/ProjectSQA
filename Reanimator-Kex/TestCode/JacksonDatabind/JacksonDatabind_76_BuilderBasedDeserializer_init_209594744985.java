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

public class BuilderBasedDeserializer_init_209594744985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16325;
     Object term16403;
     Object term16405;

    public BuilderBasedDeserializer_init_209594744985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term16382 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term16325, term16325.getClass(), "_beanType", term16382);
        term16403 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term16404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term16403, term16403.getClass(), "_buildMethod", null);
        setField(term16403, term16403.getClass(), "_classAnnotations", null);
        setField(term16404, term16404.getClass(), "_elementType", null);
        setField(term16404, term16404.getClass(), "_superClass", null);
        setField(term16404, term16404.getClass(), "_superInterfaces", null);
        setField(term16404, term16404.getClass(), "_bindings", null);
        setField(term16404, term16404.getClass(), "_canonicalName", null);
        setField(term16404, term16404.getClass(), "_class", null);
        setIntField(term16404, term16404.getClass(), "_hash", 0);
        setField(term16404, term16404.getClass(), "_valueHandler", null);
        setField(term16404, term16404.getClass(), "_typeHandler", null);
        setBooleanField(term16404, term16404.getClass(), "_asStatic", false);
        setField(term16403, term16403.getClass(), "_beanType", term16404);
        setField(term16403, term16403.getClass(), "_serializationShape", null);
        setField(term16403, term16403.getClass(), "_valueInstantiator", null);
        setField(term16403, term16403.getClass(), "_delegateDeserializer", null);
        setField(term16403, term16403.getClass(), "_arrayDelegateDeserializer", null);
        setField(term16403, term16403.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term16403, term16403.getClass(), "_nonStandardCreation", false);
        setBooleanField(term16403, term16403.getClass(), "_vanillaProcessing", false);
        setField(term16403, term16403.getClass(), "_beanProperties", null);
        setField(term16403, term16403.getClass(), "_injectables", null);
        setField(term16403, term16403.getClass(), "_anySetter", null);
        setField(term16403, term16403.getClass(), "_ignorableProps", null);
        setBooleanField(term16403, term16403.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term16403, term16403.getClass(), "_needViewProcesing", false);
        setField(term16403, term16403.getClass(), "_backRefs", null);
        setField(term16403, term16403.getClass(), "_subDeserializers", null);
        setField(term16403, term16403.getClass(), "_unwrappedPropertyHandler", null);
        setField(term16403, term16403.getClass(), "_externalTypeIdHandler", null);
        setField(term16403, term16403.getClass(), "_objectIdReader", null);
        setField(term16403, term16403.getClass(), "_valueClass", null);
        term16405 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term16406 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term16405, term16405.getClass(), "_buildMethod", null);
        setField(term16405, term16405.getClass(), "_classAnnotations", null);
        setField(term16406, term16406.getClass(), "_elementType", null);
        setField(term16406, term16406.getClass(), "_superClass", null);
        setField(term16406, term16406.getClass(), "_superInterfaces", null);
        setField(term16406, term16406.getClass(), "_bindings", null);
        setField(term16406, term16406.getClass(), "_canonicalName", null);
        setField(term16406, term16406.getClass(), "_class", null);
        setIntField(term16406, term16406.getClass(), "_hash", 0);
        setField(term16406, term16406.getClass(), "_valueHandler", null);
        setField(term16406, term16406.getClass(), "_typeHandler", null);
        setBooleanField(term16406, term16406.getClass(), "_asStatic", false);
        setField(term16405, term16405.getClass(), "_beanType", term16406);
        setField(term16405, term16405.getClass(), "_serializationShape", null);
        setField(term16405, term16405.getClass(), "_valueInstantiator", null);
        setField(term16405, term16405.getClass(), "_delegateDeserializer", null);
        setField(term16405, term16405.getClass(), "_arrayDelegateDeserializer", null);
        setField(term16405, term16405.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term16405, term16405.getClass(), "_nonStandardCreation", false);
        setBooleanField(term16405, term16405.getClass(), "_vanillaProcessing", false);
        setField(term16405, term16405.getClass(), "_beanProperties", null);
        setField(term16405, term16405.getClass(), "_injectables", null);
        setField(term16405, term16405.getClass(), "_anySetter", null);
        setField(term16405, term16405.getClass(), "_ignorableProps", null);
        setBooleanField(term16405, term16405.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term16405, term16405.getClass(), "_needViewProcesing", false);
        setField(term16405, term16405.getClass(), "_backRefs", null);
        setField(term16405, term16405.getClass(), "_subDeserializers", null);
        setField(term16405, term16405.getClass(), "_unwrappedPropertyHandler", null);
        setField(term16405, term16405.getClass(), "_externalTypeIdHandler", null);
        setField(term16405, term16405.getClass(), "_objectIdReader", null);
        setField(term16405, term16405.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term16325;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16403));
        assertTrue(recursiveEquals(term16325, term16405));
    }

};


