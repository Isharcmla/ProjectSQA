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
import java.lang.String;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class BuilderBasedDeserializer_init_1832622301167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68284;
     Object term68710;
     Object term69149;
     Object term69157;
     Object term69159;

    public BuilderBasedDeserializer_init_1832622301167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term68040 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonProperty$Access");
        Object term68004 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term68156 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term68004, term68004.getClass(), "_valueClass", term68040);
        setField(term68004, term68004.getClass(), "_classAnnotations", term68156);
        setField(term68004, term68004.getClass(), "_beanType", null);
        setField(term68004, term68004.getClass(), "_valueInstantiator", null);
        setField(term68004, term68004.getClass(), "_delegateDeserializer", null);
        setField(term68004, term68004.getClass(), "_propertyBasedCreator", null);
        setField(term68004, term68004.getClass(), "_backRefs", null);
        setField(term68004, term68004.getClass(), "_ignorableProps", null);
        setBooleanField(term68004, term68004.getClass(), "_ignoreAllUnknown", false);
        setField(term68004, term68004.getClass(), "_anySetter", null);
        setField(term68004, term68004.getClass(), "_injectables", null);
        setBooleanField(term68004, term68004.getClass(), "_nonStandardCreation", false);
        setField(term68004, term68004.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term68004, term68004.getClass(), "_needViewProcesing", false);
        setField(term68004, term68004.getClass(), "_serializationShape", null);
        setBooleanField(term68004, term68004.getClass(), "_vanillaProcessing", false);
        setField(term68004, term68004.getClass(), "_objectIdReader", null);
        Class<? extends Object> term69324 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term69323 = ((Class) term69324).getDeclaredField((String) "BOOLEAN");
        ((Field) term69323).setAccessible(true);
        Object enum7 = ((Field) term69323).get((Object) null);
        term68284 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term68400 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term68662 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term68284, term68284.getClass(), "_beanType", null);
        setField(term68284, term68284.getClass(), "_classAnnotations", term68400);
        setField(term68284, term68284.getClass(), "_valueInstantiator", null);
        setField(term68284, term68284.getClass(), "_delegateDeserializer", null);
        setField(term68284, term68284.getClass(), "_propertyBasedCreator", null);
        setField(term68284, term68284.getClass(), "_backRefs", null);
        setBooleanField(term68284, term68284.getClass(), "_ignoreAllUnknown", false);
        setField(term68284, term68284.getClass(), "_anySetter", null);
        setField(term68284, term68284.getClass(), "_injectables", null);
        setBooleanField(term68284, term68284.getClass(), "_nonStandardCreation", false);
        setField(term68284, term68284.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term68284, term68284.getClass(), "_needViewProcesing", false);
        setField(term68284, term68284.getClass(), "_serializationShape", enum7);
        setBooleanField(term68284, term68284.getClass(), "_vanillaProcessing", false);
        setField(term68284, term68284.getClass(), "_objectIdReader", null);
        setField(term68284, term68284.getClass(), "_beanProperties", term68662);
        term68710 = new HashSet();
        Class<? extends Object> term69597 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term69596 = ((Class) term69597).getDeclaredField((String) "BOOLEAN");
        ((Field) term69596).setAccessible(true);
        Object enum8 = ((Field) term69596).get((Object) null);
        HashMap term69156 = new HashMap();
        Set<Object> term69869 =  ((Map) term69156).keySet();
        HashSet term69155 = new HashSet((Collection<? extends Object>) term69869);
        term69149 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term69150 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term69154 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term69149, term69149.getClass(), "_buildMethod", null);
        setField(term69150, term69150.getClass(), "_annotations", null);
        setField(term69149, term69149.getClass(), "_classAnnotations", term69150);
        setField(term69149, term69149.getClass(), "_beanType", null);
        setField(term69149, term69149.getClass(), "_serializationShape", enum8);
        setField(term69149, term69149.getClass(), "_valueInstantiator", null);
        setField(term69149, term69149.getClass(), "_delegateDeserializer", null);
        setField(term69149, term69149.getClass(), "_arrayDelegateDeserializer", null);
        setField(term69149, term69149.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term69149, term69149.getClass(), "_nonStandardCreation", false);
        setBooleanField(term69149, term69149.getClass(), "_vanillaProcessing", false);
        setBooleanField(term69154, term69154.getClass(), "_caseInsensitive", false);
        setIntField(term69154, term69154.getClass(), "_hashMask", 0);
        setIntField(term69154, term69154.getClass(), "_size", 0);
        setIntField(term69154, term69154.getClass(), "_spillCount", 0);
        setField(term69154, term69154.getClass(), "_hashArea", null);
        setField(term69154, term69154.getClass(), "_propsInOrder", null);
        setField(term69149, term69149.getClass(), "_beanProperties", term69154);
        setField(term69149, term69149.getClass(), "_injectables", null);
        setField(term69149, term69149.getClass(), "_anySetter", null);
        setField(term69149, term69149.getClass(), "_ignorableProps", term69155);
        setBooleanField(term69149, term69149.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term69149, term69149.getClass(), "_needViewProcesing", false);
        setField(term69149, term69149.getClass(), "_backRefs", null);
        setField(term69149, term69149.getClass(), "_subDeserializers", null);
        setField(term69149, term69149.getClass(), "_unwrappedPropertyHandler", null);
        setField(term69149, term69149.getClass(), "_externalTypeIdHandler", null);
        setField(term69149, term69149.getClass(), "_objectIdReader", null);
        setField(term69149, term69149.getClass(), "_valueClass", null);
        HashMap term69158 = new HashMap();
        Set<Object> term69870 =  ((Map) term69158).keySet();
        term69157 = new HashSet((Collection<? extends Object>) term69870);
        Class<? extends Object> term69872 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonFormat$Shape");
        Field term69871 = ((Class) term69872).getDeclaredField((String) "BOOLEAN");
        ((Field) term69871).setAccessible(true);
        Object enum9 = ((Field) term69871).get((Object) null);
        term69159 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term69160 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term69164 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap"));
        setField(term69159, term69159.getClass(), "_buildMethod", null);
        setField(term69160, term69160.getClass(), "_annotations", null);
        setField(term69159, term69159.getClass(), "_classAnnotations", term69160);
        setField(term69159, term69159.getClass(), "_beanType", null);
        setField(term69159, term69159.getClass(), "_serializationShape", enum9);
        setField(term69159, term69159.getClass(), "_valueInstantiator", null);
        setField(term69159, term69159.getClass(), "_delegateDeserializer", null);
        setField(term69159, term69159.getClass(), "_arrayDelegateDeserializer", null);
        setField(term69159, term69159.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term69159, term69159.getClass(), "_nonStandardCreation", false);
        setBooleanField(term69159, term69159.getClass(), "_vanillaProcessing", false);
        setBooleanField(term69164, term69164.getClass(), "_caseInsensitive", false);
        setIntField(term69164, term69164.getClass(), "_hashMask", 0);
        setIntField(term69164, term69164.getClass(), "_size", 0);
        setIntField(term69164, term69164.getClass(), "_spillCount", 0);
        setField(term69164, term69164.getClass(), "_hashArea", null);
        setField(term69164, term69164.getClass(), "_propsInOrder", null);
        setField(term69159, term69159.getClass(), "_beanProperties", term69164);
        setField(term69159, term69159.getClass(), "_injectables", null);
        setField(term69159, term69159.getClass(), "_anySetter", null);
        setField(term69159, term69159.getClass(), "_ignorableProps", null);
        setBooleanField(term69159, term69159.getClass(), "_ignoreAllUnknown", false);
        setBooleanField(term69159, term69159.getClass(), "_needViewProcesing", false);
        setField(term69159, term69159.getClass(), "_backRefs", null);
        setField(term69159, term69159.getClass(), "_subDeserializers", null);
        setField(term69159, term69159.getClass(), "_unwrappedPropertyHandler", null);
        setField(term69159, term69159.getClass(), "_externalTypeIdHandler", null);
        setField(term69159, term69159.getClass(), "_objectIdReader", null);
        setField(term69159, term69159.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term68284;
        args[1] = term68710;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69149));
        assertTrue(recursiveEquals(term68284, term69157));
        assertTrue(recursiveEquals(term68710, term69159));
    }

};


