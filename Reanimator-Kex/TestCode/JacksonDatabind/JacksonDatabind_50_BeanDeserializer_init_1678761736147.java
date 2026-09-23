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

public class BeanDeserializer_init_1678761736147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64231;
     Object term66083;
     Object term66085;

    public BeanDeserializer_init_1678761736147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64119 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term64231 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term64323 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term64231, term64231.getClass(), "_beanType", term64323);
        term66083 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term66084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term66083, term66083.getClass(), "_nullFromCreator", null);
        setField(term66083, term66083.getClass(), "_classAnnotations", null);
        setField(term66084, term66084.getClass(), "_keyType", null);
        setField(term66084, term66084.getClass(), "_valueType", null);
        setField(term66084, term66084.getClass(), "_superClass", null);
        setField(term66084, term66084.getClass(), "_superInterfaces", null);
        setField(term66084, term66084.getClass(), "_bindings", null);
        setField(term66084, term66084.getClass(), "_canonicalName", null);
        setField(term66084, term66084.getClass(), "_class", null);
        setIntField(term66084, term66084.getClass(), "_hash", 0);
        setField(term66084, term66084.getClass(), "_valueHandler", null);
        setField(term66084, term66084.getClass(), "_typeHandler", null);
        setBooleanField(term66084, term66084.getClass(), "_asStatic", false);
        setField(term66083, term66083.getClass(), "_beanType", term66084);
        setField(term66083, term66083.getClass(), "_serializationShape", null);
        setField(term66083, term66083.getClass(), "_valueInstantiator", null);
        setField(term66083, term66083.getClass(), "_delegateDeserializer", null);
        setField(term66083, term66083.getClass(), "_arrayDelegateDeserializer", null);
        setField(term66083, term66083.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term66083, term66083.getClass(), "_nonStandardCreation", false);
        setBooleanField(term66083, term66083.getClass(), "_vanillaProcessing", false);
        setField(term66083, term66083.getClass(), "_beanProperties", null);
        setField(term66083, term66083.getClass(), "_injectables", null);
        setField(term66083, term66083.getClass(), "_anySetter", null);
        setField(term66083, term66083.getClass(), "_ignorableProps", null);
        setBooleanField(term66083, term66083.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term66083, term66083.getClass(), "_needViewProcesing", false);
        setField(term66083, term66083.getClass(), "_backRefs", null);
        setField(term66083, term66083.getClass(), "_subDeserializers", null);
        setField(term66083, term66083.getClass(), "_unwrappedPropertyHandler", null);
        setField(term66083, term66083.getClass(), "_externalTypeIdHandler", null);
        setField(term66083, term66083.getClass(), "_objectIdReader", null);
        setField(term66083, term66083.getClass(), "_valueClass", null);
        term66085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term66086 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term66085, term66085.getClass(), "_nullFromCreator", null);
        setField(term66085, term66085.getClass(), "_classAnnotations", null);
        setField(term66086, term66086.getClass(), "_keyType", null);
        setField(term66086, term66086.getClass(), "_valueType", null);
        setField(term66086, term66086.getClass(), "_superClass", null);
        setField(term66086, term66086.getClass(), "_superInterfaces", null);
        setField(term66086, term66086.getClass(), "_bindings", null);
        setField(term66086, term66086.getClass(), "_canonicalName", null);
        setField(term66086, term66086.getClass(), "_class", null);
        setIntField(term66086, term66086.getClass(), "_hash", 0);
        setField(term66086, term66086.getClass(), "_valueHandler", null);
        setField(term66086, term66086.getClass(), "_typeHandler", null);
        setBooleanField(term66086, term66086.getClass(), "_asStatic", false);
        setField(term66085, term66085.getClass(), "_beanType", term66086);
        setField(term66085, term66085.getClass(), "_serializationShape", null);
        setField(term66085, term66085.getClass(), "_valueInstantiator", null);
        setField(term66085, term66085.getClass(), "_delegateDeserializer", null);
        setField(term66085, term66085.getClass(), "_arrayDelegateDeserializer", null);
        setField(term66085, term66085.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term66085, term66085.getClass(), "_nonStandardCreation", false);
        setBooleanField(term66085, term66085.getClass(), "_vanillaProcessing", false);
        setField(term66085, term66085.getClass(), "_beanProperties", null);
        setField(term66085, term66085.getClass(), "_injectables", null);
        setField(term66085, term66085.getClass(), "_anySetter", null);
        setField(term66085, term66085.getClass(), "_ignorableProps", null);
        setBooleanField(term66085, term66085.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term66085, term66085.getClass(), "_needViewProcesing", false);
        setField(term66085, term66085.getClass(), "_backRefs", null);
        setField(term66085, term66085.getClass(), "_subDeserializers", null);
        setField(term66085, term66085.getClass(), "_unwrappedPropertyHandler", null);
        setField(term66085, term66085.getClass(), "_externalTypeIdHandler", null);
        setField(term66085, term66085.getClass(), "_objectIdReader", null);
        setField(term66085, term66085.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term64231;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term66083));
        assertTrue(recursiveEquals(term64231, term66085));
    }

};


