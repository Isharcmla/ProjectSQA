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

public class BeanDeserializer_init_1328697281143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33818;
     Object term33940;
     Object term33942;

    public BeanDeserializer_init_1328697281143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33706 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        term33818 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33922 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term33818, term33818.getClass(), "_beanType", term33922);
        term33940 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33941 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term33940, term33940.getClass(), "_nullFromCreator", null);
        setField(term33940, term33940.getClass(), "_currentlyTransforming", null);
        setField(term33941, term33941.getClass(), "_referencedType", null);
        setField(term33941, term33941.getClass(), "_anchorType", null);
        setField(term33941, term33941.getClass(), "_superClass", null);
        setField(term33941, term33941.getClass(), "_superInterfaces", null);
        setField(term33941, term33941.getClass(), "_bindings", null);
        setField(term33941, term33941.getClass(), "_canonicalName", null);
        setField(term33941, term33941.getClass(), "_class", null);
        setIntField(term33941, term33941.getClass(), "_hash", 0);
        setField(term33941, term33941.getClass(), "_valueHandler", null);
        setField(term33941, term33941.getClass(), "_typeHandler", null);
        setBooleanField(term33941, term33941.getClass(), "_asStatic", false);
        setField(term33940, term33940.getClass(), "_beanType", term33941);
        setField(term33940, term33940.getClass(), "_serializationShape", null);
        setField(term33940, term33940.getClass(), "_valueInstantiator", null);
        setField(term33940, term33940.getClass(), "_delegateDeserializer", null);
        setField(term33940, term33940.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33940, term33940.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33940, term33940.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33940, term33940.getClass(), "_vanillaProcessing", false);
        setField(term33940, term33940.getClass(), "_beanProperties", null);
        setField(term33940, term33940.getClass(), "_injectables", null);
        setField(term33940, term33940.getClass(), "_anySetter", null);
        setField(term33940, term33940.getClass(), "_ignorableProps", null);
        setBooleanField(term33940, term33940.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33940, term33940.getClass(), "_needViewProcesing", false);
        setField(term33940, term33940.getClass(), "_backRefs", null);
        setField(term33940, term33940.getClass(), "_subDeserializers", null);
        setField(term33940, term33940.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33940, term33940.getClass(), "_externalTypeIdHandler", null);
        setField(term33940, term33940.getClass(), "_objectIdReader", null);
        setField(term33940, term33940.getClass(), "_valueClass", null);
        term33942 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term33943 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term33942, term33942.getClass(), "_nullFromCreator", null);
        setField(term33942, term33942.getClass(), "_currentlyTransforming", null);
        setField(term33943, term33943.getClass(), "_referencedType", null);
        setField(term33943, term33943.getClass(), "_anchorType", null);
        setField(term33943, term33943.getClass(), "_superClass", null);
        setField(term33943, term33943.getClass(), "_superInterfaces", null);
        setField(term33943, term33943.getClass(), "_bindings", null);
        setField(term33943, term33943.getClass(), "_canonicalName", null);
        setField(term33943, term33943.getClass(), "_class", null);
        setIntField(term33943, term33943.getClass(), "_hash", 0);
        setField(term33943, term33943.getClass(), "_valueHandler", null);
        setField(term33943, term33943.getClass(), "_typeHandler", null);
        setBooleanField(term33943, term33943.getClass(), "_asStatic", false);
        setField(term33942, term33942.getClass(), "_beanType", term33943);
        setField(term33942, term33942.getClass(), "_serializationShape", null);
        setField(term33942, term33942.getClass(), "_valueInstantiator", null);
        setField(term33942, term33942.getClass(), "_delegateDeserializer", null);
        setField(term33942, term33942.getClass(), "_arrayDelegateDeserializer", null);
        setField(term33942, term33942.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term33942, term33942.getClass(), "_nonStandardCreation", false);
        setBooleanField(term33942, term33942.getClass(), "_vanillaProcessing", false);
        setField(term33942, term33942.getClass(), "_beanProperties", null);
        setField(term33942, term33942.getClass(), "_injectables", null);
        setField(term33942, term33942.getClass(), "_anySetter", null);
        setField(term33942, term33942.getClass(), "_ignorableProps", null);
        setBooleanField(term33942, term33942.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term33942, term33942.getClass(), "_needViewProcesing", false);
        setField(term33942, term33942.getClass(), "_backRefs", null);
        setField(term33942, term33942.getClass(), "_subDeserializers", null);
        setField(term33942, term33942.getClass(), "_unwrappedPropertyHandler", null);
        setField(term33942, term33942.getClass(), "_externalTypeIdHandler", null);
        setField(term33942, term33942.getClass(), "_objectIdReader", null);
        setField(term33942, term33942.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        Object[] args = new Object[2];
        args[0] = term33818;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term33940));
        assertTrue(recursiveEquals(term33818, term33942));
    }

};


