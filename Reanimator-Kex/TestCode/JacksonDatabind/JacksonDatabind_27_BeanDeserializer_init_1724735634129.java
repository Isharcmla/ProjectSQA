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

public class BeanDeserializer_init_1724735634129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40654;
     Object term40922;
     Object term41088;
     Object term41091;
     Object term41094;

    public BeanDeserializer_init_1724735634129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40274 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term40390 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term40528 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term40274, term40274.getClass(), "_valueClass", null);
        setField(term40274, term40274.getClass(), "_classAnnotations", term40390);
        setField(term40274, term40274.getClass(), "_beanType", null);
        setField(term40274, term40274.getClass(), "_valueInstantiator", term40528);
        setField(term40274, term40274.getClass(), "_beanProperties", null);
        setField(term40274, term40274.getClass(), "_backRefs", null);
        setField(term40274, term40274.getClass(), "_ignorableProps", null);
        setBooleanField(term40274, term40274.getClass(), "_ignoreAllUnknown", false);
        setField(term40274, term40274.getClass(), "_anySetter", null);
        setField(term40274, term40274.getClass(), "_injectables", null);
        setField(term40274, term40274.getClass(), "_objectIdReader", null);
        setField(term40274, term40274.getClass(), "_unwrappedPropertyHandler", null);
        term40654 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term40792 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term40654, term40654.getClass(), "_valueInstantiator", term40792);
        setField(term40654, term40654.getClass(), "_anySetter", null);
        setField(term40654, term40654.getClass(), "_injectables", null);
        setField(term40654, term40654.getClass(), "_objectIdReader", null);
        term40922 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term41040 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term40922, term40922.getClass(), "_type", null);
        setField(term41040, term41040.getClass(), "_classAnnotations", null);
        setField(term41040, term41040.getClass(), "_annotationIntrospector", null);
        setField(term40922, term40922.getClass(), "_classInfo", term41040);
        term41088 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term41089 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term41090 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term41089, term41089.getClass(), "_annotations", null);
        setField(term41088, term41088.getClass(), "_classAnnotations", term41089);
        setField(term41088, term41088.getClass(), "_beanType", null);
        setField(term41088, term41088.getClass(), "_serializationShape", null);
        setIntField(term41090, term41090.getClass(), "_type", 0);
        setField(term41088, term41088.getClass(), "_valueInstantiator", term41090);
        setField(term41088, term41088.getClass(), "_delegateDeserializer", null);
        setField(term41088, term41088.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term41088, term41088.getClass(), "_nonStandardCreation", false);
        setBooleanField(term41088, term41088.getClass(), "_vanillaProcessing", true);
        setField(term41088, term41088.getClass(), "_beanProperties", null);
        setField(term41088, term41088.getClass(), "_injectables", null);
        setField(term41088, term41088.getClass(), "_anySetter", null);
        setField(term41088, term41088.getClass(), "_ignorableProps", null);
        setBooleanField(term41088, term41088.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term41088, term41088.getClass(), "_needViewProcesing", false);
        setField(term41088, term41088.getClass(), "_backRefs", null);
        setField(term41088, term41088.getClass(), "_subDeserializers", null);
        setField(term41088, term41088.getClass(), "_unwrappedPropertyHandler", null);
        setField(term41088, term41088.getClass(), "_externalTypeIdHandler", null);
        setField(term41088, term41088.getClass(), "_objectIdReader", null);
        setField(term41088, term41088.getClass(), "_valueClass", null);
        term41091 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term41092 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term41093 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term41091, term41091.getClass(), "_propCollector", null);
        setField(term41091, term41091.getClass(), "_config", null);
        setField(term41091, term41091.getClass(), "_annotationIntrospector", null);
        setField(term41092, term41092.getClass(), "_class", null);
        setField(term41092, term41092.getClass(), "_superTypes", null);
        setField(term41092, term41092.getClass(), "_annotationIntrospector", null);
        setField(term41092, term41092.getClass(), "_mixInResolver", null);
        setField(term41092, term41092.getClass(), "_primaryMixIn", null);
        setField(term41093, term41093.getClass(), "_annotations", null);
        setField(term41092, term41092.getClass(), "_classAnnotations", term41093);
        setBooleanField(term41092, term41092.getClass(), "_creatorsResolved", false);
        setField(term41092, term41092.getClass(), "_defaultConstructor", null);
        setField(term41092, term41092.getClass(), "_constructors", null);
        setField(term41092, term41092.getClass(), "_creatorMethods", null);
        setField(term41092, term41092.getClass(), "_memberMethods", null);
        setField(term41092, term41092.getClass(), "_fields", null);
        setField(term41091, term41091.getClass(), "_classInfo", term41092);
        setField(term41091, term41091.getClass(), "_bindings", null);
        setField(term41091, term41091.getClass(), "_properties", null);
        setField(term41091, term41091.getClass(), "_objectIdInfo", null);
        setField(term41091, term41091.getClass(), "_type", null);
        term41094 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term41095 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term41094, term41094.getClass(), "_beanDesc", null);
        setBooleanField(term41094, term41094.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term41094, term41094.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term41094, term41094.getClass(), "_properties", null);
        setField(term41094, term41094.getClass(), "_injectables", null);
        setField(term41094, term41094.getClass(), "_backRefProperties", null);
        setField(term41094, term41094.getClass(), "_ignorableProps", null);
        setIntField(term41095, term41095.getClass(), "_type", 0);
        setField(term41094, term41094.getClass(), "_valueInstantiator", term41095);
        setField(term41094, term41094.getClass(), "_objectIdReader", null);
        setField(term41094, term41094.getClass(), "_anySetter", null);
        setBooleanField(term41094, term41094.getClass(), "_ignoreAllUnknown", false);
        setField(term41094, term41094.getClass(), "_buildMethod", null);
        setField(term41094, term41094.getClass(), "_builderConfig", null);
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
        args[0] = term40654;
        args[1] = term40922;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term41088));
        assertTrue(recursiveEquals(term40654, term41091));
        assertTrue(recursiveEquals(term40922, term41094));
    }

};


