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

public class BeanDeserializer_init_9967408979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11939;
     Object term12486;
     Object term12488;

    public BeanDeserializer_init_9967408979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11827 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term11939 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12039 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term11939, term11939.getClass(), "_beanType", term12039);
        term12486 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12487 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term12486, term12486.getClass(), "_nullFromCreator", null);
        setField(term12486, term12486.getClass(), "_classAnnotations", null);
        setField(term12487, term12487.getClass(), "_keyType", null);
        setField(term12487, term12487.getClass(), "_valueType", null);
        setField(term12487, term12487.getClass(), "_superClass", null);
        setField(term12487, term12487.getClass(), "_superInterfaces", null);
        setField(term12487, term12487.getClass(), "_bindings", null);
        setField(term12487, term12487.getClass(), "_canonicalName", null);
        setField(term12487, term12487.getClass(), "_class", null);
        setIntField(term12487, term12487.getClass(), "_hash", 0);
        setField(term12487, term12487.getClass(), "_valueHandler", null);
        setField(term12487, term12487.getClass(), "_typeHandler", null);
        setBooleanField(term12487, term12487.getClass(), "_asStatic", false);
        setField(term12486, term12486.getClass(), "_beanType", term12487);
        setField(term12486, term12486.getClass(), "_serializationShape", null);
        setField(term12486, term12486.getClass(), "_valueInstantiator", null);
        setField(term12486, term12486.getClass(), "_delegateDeserializer", null);
        setField(term12486, term12486.getClass(), "_arrayDelegateDeserializer", null);
        setField(term12486, term12486.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12486, term12486.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12486, term12486.getClass(), "_vanillaProcessing", false);
        setField(term12486, term12486.getClass(), "_beanProperties", null);
        setField(term12486, term12486.getClass(), "_injectables", null);
        setField(term12486, term12486.getClass(), "_anySetter", null);
        setField(term12486, term12486.getClass(), "_ignorableProps", null);
        setBooleanField(term12486, term12486.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12486, term12486.getClass(), "_needViewProcesing", false);
        setField(term12486, term12486.getClass(), "_backRefs", null);
        setField(term12486, term12486.getClass(), "_subDeserializers", null);
        setField(term12486, term12486.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12486, term12486.getClass(), "_externalTypeIdHandler", null);
        setField(term12486, term12486.getClass(), "_objectIdReader", null);
        setField(term12486, term12486.getClass(), "_valueClass", null);
        term12488 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term12489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term12488, term12488.getClass(), "_nullFromCreator", null);
        setField(term12488, term12488.getClass(), "_classAnnotations", null);
        setField(term12489, term12489.getClass(), "_keyType", null);
        setField(term12489, term12489.getClass(), "_valueType", null);
        setField(term12489, term12489.getClass(), "_superClass", null);
        setField(term12489, term12489.getClass(), "_superInterfaces", null);
        setField(term12489, term12489.getClass(), "_bindings", null);
        setField(term12489, term12489.getClass(), "_canonicalName", null);
        setField(term12489, term12489.getClass(), "_class", null);
        setIntField(term12489, term12489.getClass(), "_hash", 0);
        setField(term12489, term12489.getClass(), "_valueHandler", null);
        setField(term12489, term12489.getClass(), "_typeHandler", null);
        setBooleanField(term12489, term12489.getClass(), "_asStatic", false);
        setField(term12488, term12488.getClass(), "_beanType", term12489);
        setField(term12488, term12488.getClass(), "_serializationShape", null);
        setField(term12488, term12488.getClass(), "_valueInstantiator", null);
        setField(term12488, term12488.getClass(), "_delegateDeserializer", null);
        setField(term12488, term12488.getClass(), "_arrayDelegateDeserializer", null);
        setField(term12488, term12488.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term12488, term12488.getClass(), "_nonStandardCreation", false);
        setBooleanField(term12488, term12488.getClass(), "_vanillaProcessing", false);
        setField(term12488, term12488.getClass(), "_beanProperties", null);
        setField(term12488, term12488.getClass(), "_injectables", null);
        setField(term12488, term12488.getClass(), "_anySetter", null);
        setField(term12488, term12488.getClass(), "_ignorableProps", null);
        setBooleanField(term12488, term12488.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term12488, term12488.getClass(), "_needViewProcesing", false);
        setField(term12488, term12488.getClass(), "_backRefs", null);
        setField(term12488, term12488.getClass(), "_subDeserializers", null);
        setField(term12488, term12488.getClass(), "_unwrappedPropertyHandler", null);
        setField(term12488, term12488.getClass(), "_externalTypeIdHandler", null);
        setField(term12488, term12488.getClass(), "_objectIdReader", null);
        setField(term12488, term12488.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        Object[] args = new Object[2];
        args[0] = term11939;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12486));
        assertTrue(recursiveEquals(term11939, term12488));
    }

};


