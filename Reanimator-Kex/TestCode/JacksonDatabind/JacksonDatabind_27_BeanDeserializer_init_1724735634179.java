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

public class BeanDeserializer_init_1724735634179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94363;
     Object term94621;
     Object term95412;
     Object term95415;
     Object term95419;

    public BeanDeserializer_init_1724735634179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94015 = Class.forName((String) "java.util.stream.IntPipeline$2$1");
        Object term93979 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term94131 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term94237 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term93979, term93979.getClass(), "_valueClass", term94015);
        setField(term93979, term93979.getClass(), "_classAnnotations", term94131);
        setField(term93979, term93979.getClass(), "_beanType", term94237);
        setField(term93979, term93979.getClass(), "_valueInstantiator", null);
        setField(term93979, term93979.getClass(), "_beanProperties", null);
        setField(term93979, term93979.getClass(), "_backRefs", null);
        setField(term93979, term93979.getClass(), "_ignorableProps", null);
        setBooleanField(term93979, term93979.getClass(), "_ignoreAllUnknown", false);
        setField(term93979, term93979.getClass(), "_anySetter", null);
        setField(term93979, term93979.getClass(), "_injectables", null);
        setField(term93979, term93979.getClass(), "_objectIdReader", null);
        setField(term93979, term93979.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term93979, term93979.getClass(), "_nonStandardCreation", false);
        term94363 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term94491 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term94491, term94491.getClass(), "_delegateType", null);
        setField(term94491, term94491.getClass(), "_withArgsCreator", null);
        setField(term94491, term94491.getClass(), "_defaultCreator", null);
        setField(term94363, term94363.getClass(), "_valueInstantiator", term94491);
        setField(term94363, term94363.getClass(), "_anySetter", null);
        setField(term94363, term94363.getClass(), "_injectables", null);
        setField(term94363, term94363.getClass(), "_objectIdReader", null);
        term94621 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term94739 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term94887 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        setField(term94621, term94621.getClass(), "_type", null);
        setField(term94739, term94739.getClass(), "_classAnnotations", null);
        setField(term94739, term94739.getClass(), "_annotationIntrospector", null);
        setField(term94621, term94621.getClass(), "_classInfo", term94739);
        setField(term94621, term94621.getClass(), "_annotationIntrospector", term94887);
        term95412 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term95413 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term95414 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term95413, term95413.getClass(), "_annotations", null);
        setField(term95412, term95412.getClass(), "_classAnnotations", term95413);
        setField(term95412, term95412.getClass(), "_beanType", null);
        setField(term95412, term95412.getClass(), "_serializationShape", null);
        setField(term95414, term95414.getClass(), "_valueTypeDesc", null);
        setField(term95414, term95414.getClass(), "_defaultCreator", null);
        setField(term95414, term95414.getClass(), "_withArgsCreator", null);
        setField(term95414, term95414.getClass(), "_constructorArguments", null);
        setField(term95414, term95414.getClass(), "_delegateType", null);
        setField(term95414, term95414.getClass(), "_delegateCreator", null);
        setField(term95414, term95414.getClass(), "_delegateArguments", null);
        setField(term95414, term95414.getClass(), "_fromStringCreator", null);
        setField(term95414, term95414.getClass(), "_fromIntCreator", null);
        setField(term95414, term95414.getClass(), "_fromLongCreator", null);
        setField(term95414, term95414.getClass(), "_fromDoubleCreator", null);
        setField(term95414, term95414.getClass(), "_fromBooleanCreator", null);
        setField(term95414, term95414.getClass(), "_incompleteParameter", null);
        setField(term95412, term95412.getClass(), "_valueInstantiator", term95414);
        setField(term95412, term95412.getClass(), "_delegateDeserializer", null);
        setField(term95412, term95412.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term95412, term95412.getClass(), "_nonStandardCreation", true);
        setBooleanField(term95412, term95412.getClass(), "_vanillaProcessing", false);
        setField(term95412, term95412.getClass(), "_beanProperties", null);
        setField(term95412, term95412.getClass(), "_injectables", null);
        setField(term95412, term95412.getClass(), "_anySetter", null);
        setField(term95412, term95412.getClass(), "_ignorableProps", null);
        setBooleanField(term95412, term95412.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term95412, term95412.getClass(), "_needViewProcesing", false);
        setField(term95412, term95412.getClass(), "_backRefs", null);
        setField(term95412, term95412.getClass(), "_subDeserializers", null);
        setField(term95412, term95412.getClass(), "_unwrappedPropertyHandler", null);
        setField(term95412, term95412.getClass(), "_externalTypeIdHandler", null);
        setField(term95412, term95412.getClass(), "_objectIdReader", null);
        setField(term95412, term95412.getClass(), "_valueClass", null);
        term95415 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term95416 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector"));
        Object term95417 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term95418 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term95415, term95415.getClass(), "_propCollector", null);
        setField(term95415, term95415.getClass(), "_config", null);
        setField(term95415, term95415.getClass(), "_annotationIntrospector", term95416);
        setField(term95417, term95417.getClass(), "_class", null);
        setField(term95417, term95417.getClass(), "_superTypes", null);
        setField(term95417, term95417.getClass(), "_annotationIntrospector", null);
        setField(term95417, term95417.getClass(), "_mixInResolver", null);
        setField(term95417, term95417.getClass(), "_primaryMixIn", null);
        setField(term95418, term95418.getClass(), "_annotations", null);
        setField(term95417, term95417.getClass(), "_classAnnotations", term95418);
        setBooleanField(term95417, term95417.getClass(), "_creatorsResolved", false);
        setField(term95417, term95417.getClass(), "_defaultConstructor", null);
        setField(term95417, term95417.getClass(), "_constructors", null);
        setField(term95417, term95417.getClass(), "_creatorMethods", null);
        setField(term95417, term95417.getClass(), "_memberMethods", null);
        setField(term95417, term95417.getClass(), "_fields", null);
        setField(term95415, term95415.getClass(), "_classInfo", term95417);
        setField(term95415, term95415.getClass(), "_bindings", null);
        setField(term95415, term95415.getClass(), "_properties", null);
        setField(term95415, term95415.getClass(), "_objectIdInfo", null);
        setField(term95415, term95415.getClass(), "_type", null);
        term95419 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term95420 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term95419, term95419.getClass(), "_beanDesc", null);
        setBooleanField(term95419, term95419.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term95419, term95419.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term95419, term95419.getClass(), "_properties", null);
        setField(term95419, term95419.getClass(), "_injectables", null);
        setField(term95419, term95419.getClass(), "_backRefProperties", null);
        setField(term95419, term95419.getClass(), "_ignorableProps", null);
        setField(term95420, term95420.getClass(), "_valueTypeDesc", null);
        setField(term95420, term95420.getClass(), "_defaultCreator", null);
        setField(term95420, term95420.getClass(), "_withArgsCreator", null);
        setField(term95420, term95420.getClass(), "_constructorArguments", null);
        setField(term95420, term95420.getClass(), "_delegateType", null);
        setField(term95420, term95420.getClass(), "_delegateCreator", null);
        setField(term95420, term95420.getClass(), "_delegateArguments", null);
        setField(term95420, term95420.getClass(), "_fromStringCreator", null);
        setField(term95420, term95420.getClass(), "_fromIntCreator", null);
        setField(term95420, term95420.getClass(), "_fromLongCreator", null);
        setField(term95420, term95420.getClass(), "_fromDoubleCreator", null);
        setField(term95420, term95420.getClass(), "_fromBooleanCreator", null);
        setField(term95420, term95420.getClass(), "_incompleteParameter", null);
        setField(term95419, term95419.getClass(), "_valueInstantiator", term95420);
        setField(term95419, term95419.getClass(), "_objectIdReader", null);
        setField(term95419, term95419.getClass(), "_anySetter", null);
        setBooleanField(term95419, term95419.getClass(), "_ignoreAllUnknown", false);
        setField(term95419, term95419.getClass(), "_buildMethod", null);
        setField(term95419, term95419.getClass(), "_builderConfig", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.HashSet");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term94363;
        args[1] = term94621;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term95412));
        assertTrue(recursiveEquals(term94363, term95415));
        assertTrue(recursiveEquals(term94621, term95419));
    }

};


