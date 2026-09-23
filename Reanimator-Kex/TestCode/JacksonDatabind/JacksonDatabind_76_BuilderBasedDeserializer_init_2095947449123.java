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

public class BuilderBasedDeserializer_init_2095947449123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34617;
     Object term34712;
     Object term34714;

    public BuilderBasedDeserializer_init_2095947449123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34617 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term34669 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term34617, term34617.getClass(), "_beanType", term34669);
        term34712 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term34713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term34712, term34712.getClass(), "_buildMethod", null);
        setField(term34712, term34712.getClass(), "_classAnnotations", null);
        setField(term34713, term34713.getClass(), "_referencedType", null);
        setField(term34713, term34713.getClass(), "_anchorType", null);
        setField(term34713, term34713.getClass(), "_superClass", null);
        setField(term34713, term34713.getClass(), "_superInterfaces", null);
        setField(term34713, term34713.getClass(), "_bindings", null);
        setField(term34713, term34713.getClass(), "_canonicalName", null);
        setField(term34713, term34713.getClass(), "_class", null);
        setIntField(term34713, term34713.getClass(), "_hash", 0);
        setField(term34713, term34713.getClass(), "_valueHandler", null);
        setField(term34713, term34713.getClass(), "_typeHandler", null);
        setBooleanField(term34713, term34713.getClass(), "_asStatic", false);
        setField(term34712, term34712.getClass(), "_beanType", term34713);
        setField(term34712, term34712.getClass(), "_serializationShape", null);
        setField(term34712, term34712.getClass(), "_valueInstantiator", null);
        setField(term34712, term34712.getClass(), "_delegateDeserializer", null);
        setField(term34712, term34712.getClass(), "_arrayDelegateDeserializer", null);
        setField(term34712, term34712.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term34712, term34712.getClass(), "_nonStandardCreation", false);
        setBooleanField(term34712, term34712.getClass(), "_vanillaProcessing", false);
        setField(term34712, term34712.getClass(), "_beanProperties", null);
        setField(term34712, term34712.getClass(), "_injectables", null);
        setField(term34712, term34712.getClass(), "_anySetter", null);
        setField(term34712, term34712.getClass(), "_ignorableProps", null);
        setBooleanField(term34712, term34712.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term34712, term34712.getClass(), "_needViewProcesing", false);
        setField(term34712, term34712.getClass(), "_backRefs", null);
        setField(term34712, term34712.getClass(), "_subDeserializers", null);
        setField(term34712, term34712.getClass(), "_unwrappedPropertyHandler", null);
        setField(term34712, term34712.getClass(), "_externalTypeIdHandler", null);
        setField(term34712, term34712.getClass(), "_objectIdReader", null);
        setField(term34712, term34712.getClass(), "_valueClass", null);
        term34714 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term34715 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term34714, term34714.getClass(), "_buildMethod", null);
        setField(term34714, term34714.getClass(), "_classAnnotations", null);
        setField(term34715, term34715.getClass(), "_referencedType", null);
        setField(term34715, term34715.getClass(), "_anchorType", null);
        setField(term34715, term34715.getClass(), "_superClass", null);
        setField(term34715, term34715.getClass(), "_superInterfaces", null);
        setField(term34715, term34715.getClass(), "_bindings", null);
        setField(term34715, term34715.getClass(), "_canonicalName", null);
        setField(term34715, term34715.getClass(), "_class", null);
        setIntField(term34715, term34715.getClass(), "_hash", 0);
        setField(term34715, term34715.getClass(), "_valueHandler", null);
        setField(term34715, term34715.getClass(), "_typeHandler", null);
        setBooleanField(term34715, term34715.getClass(), "_asStatic", false);
        setField(term34714, term34714.getClass(), "_beanType", term34715);
        setField(term34714, term34714.getClass(), "_serializationShape", null);
        setField(term34714, term34714.getClass(), "_valueInstantiator", null);
        setField(term34714, term34714.getClass(), "_delegateDeserializer", null);
        setField(term34714, term34714.getClass(), "_arrayDelegateDeserializer", null);
        setField(term34714, term34714.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term34714, term34714.getClass(), "_nonStandardCreation", false);
        setBooleanField(term34714, term34714.getClass(), "_vanillaProcessing", false);
        setField(term34714, term34714.getClass(), "_beanProperties", null);
        setField(term34714, term34714.getClass(), "_injectables", null);
        setField(term34714, term34714.getClass(), "_anySetter", null);
        setField(term34714, term34714.getClass(), "_ignorableProps", null);
        setBooleanField(term34714, term34714.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term34714, term34714.getClass(), "_needViewProcesing", false);
        setField(term34714, term34714.getClass(), "_backRefs", null);
        setField(term34714, term34714.getClass(), "_subDeserializers", null);
        setField(term34714, term34714.getClass(), "_unwrappedPropertyHandler", null);
        setField(term34714, term34714.getClass(), "_externalTypeIdHandler", null);
        setField(term34714, term34714.getClass(), "_objectIdReader", null);
        setField(term34714, term34714.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term34617;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term34712));
        assertTrue(recursiveEquals(term34617, term34714));
    }

};


