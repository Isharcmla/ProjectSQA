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

public class BeanDeserializer_init_1724735634148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59446;
     Object term59704;
     Object term62171;
     Object term62174;
     Object term62177;

    public BeanDeserializer_init_1724735634148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59086 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer");
        Object term59050 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term59202 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term59320 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term59050, term59050.getClass(), "_valueClass", term59086);
        setField(term59050, term59050.getClass(), "_classAnnotations", term59202);
        setField(term59050, term59050.getClass(), "_beanType", null);
        setField(term59050, term59050.getClass(), "_valueInstantiator", null);
        setField(term59050, term59050.getClass(), "_beanProperties", null);
        setField(term59050, term59050.getClass(), "_backRefs", null);
        setField(term59050, term59050.getClass(), "_ignorableProps", null);
        setBooleanField(term59050, term59050.getClass(), "_ignoreAllUnknown", false);
        setField(term59050, term59050.getClass(), "_anySetter", null);
        setField(term59050, term59050.getClass(), "_injectables", null);
        setField(term59050, term59050.getClass(), "_objectIdReader", term59320);
        setField(term59050, term59050.getClass(), "_unwrappedPropertyHandler", null);
        term59446 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term59574 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term59446, term59446.getClass(), "_valueInstantiator", term59574);
        setField(term59446, term59446.getClass(), "_anySetter", null);
        setField(term59446, term59446.getClass(), "_injectables", null);
        setField(term59446, term59446.getClass(), "_objectIdReader", null);
        term59704 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term59822 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term59704, term59704.getClass(), "_type", null);
        setField(term59822, term59822.getClass(), "_classAnnotations", null);
        setField(term59822, term59822.getClass(), "_annotationIntrospector", null);
        setField(term59704, term59704.getClass(), "_classInfo", term59822);
        term62171 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term62172 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term62173 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term62172, term62172.getClass(), "_annotations", null);
        setField(term62171, term62171.getClass(), "_classAnnotations", term62172);
        setField(term62171, term62171.getClass(), "_beanType", null);
        setField(term62171, term62171.getClass(), "_serializationShape", null);
        setField(term62173, term62173.getClass(), "_valueTypeDesc", null);
        setField(term62173, term62173.getClass(), "_defaultCreator", null);
        setField(term62173, term62173.getClass(), "_withArgsCreator", null);
        setField(term62173, term62173.getClass(), "_constructorArguments", null);
        setField(term62173, term62173.getClass(), "_delegateType", null);
        setField(term62173, term62173.getClass(), "_delegateCreator", null);
        setField(term62173, term62173.getClass(), "_delegateArguments", null);
        setField(term62173, term62173.getClass(), "_fromStringCreator", null);
        setField(term62173, term62173.getClass(), "_fromIntCreator", null);
        setField(term62173, term62173.getClass(), "_fromLongCreator", null);
        setField(term62173, term62173.getClass(), "_fromDoubleCreator", null);
        setField(term62173, term62173.getClass(), "_fromBooleanCreator", null);
        setField(term62173, term62173.getClass(), "_incompleteParameter", null);
        setField(term62171, term62171.getClass(), "_valueInstantiator", term62173);
        setField(term62171, term62171.getClass(), "_delegateDeserializer", null);
        setField(term62171, term62171.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term62171, term62171.getClass(), "_nonStandardCreation", true);
        setBooleanField(term62171, term62171.getClass(), "_vanillaProcessing", false);
        setField(term62171, term62171.getClass(), "_beanProperties", null);
        setField(term62171, term62171.getClass(), "_injectables", null);
        setField(term62171, term62171.getClass(), "_anySetter", null);
        setField(term62171, term62171.getClass(), "_ignorableProps", null);
        setBooleanField(term62171, term62171.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term62171, term62171.getClass(), "_needViewProcesing", false);
        setField(term62171, term62171.getClass(), "_backRefs", null);
        setField(term62171, term62171.getClass(), "_subDeserializers", null);
        setField(term62171, term62171.getClass(), "_unwrappedPropertyHandler", null);
        setField(term62171, term62171.getClass(), "_externalTypeIdHandler", null);
        setField(term62171, term62171.getClass(), "_objectIdReader", null);
        setField(term62171, term62171.getClass(), "_valueClass", null);
        term62174 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term62175 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term62176 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term62174, term62174.getClass(), "_propCollector", null);
        setField(term62174, term62174.getClass(), "_config", null);
        setField(term62174, term62174.getClass(), "_annotationIntrospector", null);
        setField(term62175, term62175.getClass(), "_class", null);
        setField(term62175, term62175.getClass(), "_superTypes", null);
        setField(term62175, term62175.getClass(), "_annotationIntrospector", null);
        setField(term62175, term62175.getClass(), "_mixInResolver", null);
        setField(term62175, term62175.getClass(), "_primaryMixIn", null);
        setField(term62176, term62176.getClass(), "_annotations", null);
        setField(term62175, term62175.getClass(), "_classAnnotations", term62176);
        setBooleanField(term62175, term62175.getClass(), "_creatorsResolved", false);
        setField(term62175, term62175.getClass(), "_defaultConstructor", null);
        setField(term62175, term62175.getClass(), "_constructors", null);
        setField(term62175, term62175.getClass(), "_creatorMethods", null);
        setField(term62175, term62175.getClass(), "_memberMethods", null);
        setField(term62175, term62175.getClass(), "_fields", null);
        setField(term62174, term62174.getClass(), "_classInfo", term62175);
        setField(term62174, term62174.getClass(), "_bindings", null);
        setField(term62174, term62174.getClass(), "_properties", null);
        setField(term62174, term62174.getClass(), "_objectIdInfo", null);
        setField(term62174, term62174.getClass(), "_type", null);
        term62177 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term62178 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term62177, term62177.getClass(), "_beanDesc", null);
        setBooleanField(term62177, term62177.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term62177, term62177.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term62177, term62177.getClass(), "_properties", null);
        setField(term62177, term62177.getClass(), "_injectables", null);
        setField(term62177, term62177.getClass(), "_backRefProperties", null);
        setField(term62177, term62177.getClass(), "_ignorableProps", null);
        setField(term62178, term62178.getClass(), "_valueTypeDesc", null);
        setField(term62178, term62178.getClass(), "_defaultCreator", null);
        setField(term62178, term62178.getClass(), "_withArgsCreator", null);
        setField(term62178, term62178.getClass(), "_constructorArguments", null);
        setField(term62178, term62178.getClass(), "_delegateType", null);
        setField(term62178, term62178.getClass(), "_delegateCreator", null);
        setField(term62178, term62178.getClass(), "_delegateArguments", null);
        setField(term62178, term62178.getClass(), "_fromStringCreator", null);
        setField(term62178, term62178.getClass(), "_fromIntCreator", null);
        setField(term62178, term62178.getClass(), "_fromLongCreator", null);
        setField(term62178, term62178.getClass(), "_fromDoubleCreator", null);
        setField(term62178, term62178.getClass(), "_fromBooleanCreator", null);
        setField(term62178, term62178.getClass(), "_incompleteParameter", null);
        setField(term62177, term62177.getClass(), "_valueInstantiator", term62178);
        setField(term62177, term62177.getClass(), "_objectIdReader", null);
        setField(term62177, term62177.getClass(), "_anySetter", null);
        setBooleanField(term62177, term62177.getClass(), "_ignoreAllUnknown", false);
        setField(term62177, term62177.getClass(), "_buildMethod", null);
        setField(term62177, term62177.getClass(), "_builderConfig", null);
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
        args[0] = term59446;
        args[1] = term59704;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62171));
        assertTrue(recursiveEquals(term59446, term62174));
        assertTrue(recursiveEquals(term59704, term62177));
    }

};


