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

public class BeanDeserializer_init_1724735634183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103073;
     Object term103339;
     Object term103645;
     Object term103648;
     Object term103652;

    public BeanDeserializer_init_1724735634183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102735 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term102851 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term102947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term102735, term102735.getClass(), "_valueClass", null);
        setField(term102735, term102735.getClass(), "_classAnnotations", term102851);
        setField(term102735, term102735.getClass(), "_beanType", term102947);
        setField(term102735, term102735.getClass(), "_valueInstantiator", null);
        setField(term102735, term102735.getClass(), "_beanProperties", null);
        setField(term102735, term102735.getClass(), "_backRefs", null);
        setField(term102735, term102735.getClass(), "_ignorableProps", null);
        setBooleanField(term102735, term102735.getClass(), "_ignoreAllUnknown", false);
        setField(term102735, term102735.getClass(), "_anySetter", null);
        setField(term102735, term102735.getClass(), "_injectables", null);
        setField(term102735, term102735.getClass(), "_objectIdReader", null);
        setField(term102735, term102735.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term102735, term102735.getClass(), "_nonStandardCreation", false);
        term103073 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term103209 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term103073, term103073.getClass(), "_valueInstantiator", term103209);
        setField(term103073, term103073.getClass(), "_anySetter", null);
        setField(term103073, term103073.getClass(), "_injectables", null);
        setField(term103073, term103073.getClass(), "_objectIdReader", null);
        term103339 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term103457 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term103601 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term103339, term103339.getClass(), "_type", null);
        setField(term103457, term103457.getClass(), "_classAnnotations", null);
        setField(term103457, term103457.getClass(), "_annotationIntrospector", null);
        setField(term103339, term103339.getClass(), "_classInfo", term103457);
        setField(term103339, term103339.getClass(), "_annotationIntrospector", term103601);
        term103645 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term103646 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term103647 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term103646, term103646.getClass(), "_annotations", null);
        setField(term103645, term103645.getClass(), "_classAnnotations", term103646);
        setField(term103645, term103645.getClass(), "_beanType", null);
        setField(term103645, term103645.getClass(), "_serializationShape", null);
        setField(term103645, term103645.getClass(), "_valueInstantiator", term103647);
        setField(term103645, term103645.getClass(), "_delegateDeserializer", null);
        setField(term103645, term103645.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term103645, term103645.getClass(), "_nonStandardCreation", true);
        setBooleanField(term103645, term103645.getClass(), "_vanillaProcessing", false);
        setField(term103645, term103645.getClass(), "_beanProperties", null);
        setField(term103645, term103645.getClass(), "_injectables", null);
        setField(term103645, term103645.getClass(), "_anySetter", null);
        setField(term103645, term103645.getClass(), "_ignorableProps", null);
        setBooleanField(term103645, term103645.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term103645, term103645.getClass(), "_needViewProcesing", false);
        setField(term103645, term103645.getClass(), "_backRefs", null);
        setField(term103645, term103645.getClass(), "_subDeserializers", null);
        setField(term103645, term103645.getClass(), "_unwrappedPropertyHandler", null);
        setField(term103645, term103645.getClass(), "_externalTypeIdHandler", null);
        setField(term103645, term103645.getClass(), "_objectIdReader", null);
        setField(term103645, term103645.getClass(), "_valueClass", null);
        term103648 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term103649 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term103650 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term103651 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term103648, term103648.getClass(), "_propCollector", null);
        setField(term103648, term103648.getClass(), "_config", null);
        setField(term103648, term103648.getClass(), "_annotationIntrospector", term103649);
        setField(term103650, term103650.getClass(), "_class", null);
        setField(term103650, term103650.getClass(), "_superTypes", null);
        setField(term103650, term103650.getClass(), "_annotationIntrospector", null);
        setField(term103650, term103650.getClass(), "_mixInResolver", null);
        setField(term103650, term103650.getClass(), "_primaryMixIn", null);
        setField(term103651, term103651.getClass(), "_annotations", null);
        setField(term103650, term103650.getClass(), "_classAnnotations", term103651);
        setBooleanField(term103650, term103650.getClass(), "_creatorsResolved", false);
        setField(term103650, term103650.getClass(), "_defaultConstructor", null);
        setField(term103650, term103650.getClass(), "_constructors", null);
        setField(term103650, term103650.getClass(), "_creatorMethods", null);
        setField(term103650, term103650.getClass(), "_memberMethods", null);
        setField(term103650, term103650.getClass(), "_fields", null);
        setField(term103648, term103648.getClass(), "_classInfo", term103650);
        setField(term103648, term103648.getClass(), "_bindings", null);
        setField(term103648, term103648.getClass(), "_properties", null);
        setField(term103648, term103648.getClass(), "_objectIdInfo", null);
        setField(term103648, term103648.getClass(), "_type", null);
        term103652 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term103653 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term103652, term103652.getClass(), "_beanDesc", null);
        setBooleanField(term103652, term103652.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term103652, term103652.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term103652, term103652.getClass(), "_properties", null);
        setField(term103652, term103652.getClass(), "_injectables", null);
        setField(term103652, term103652.getClass(), "_backRefProperties", null);
        setField(term103652, term103652.getClass(), "_ignorableProps", null);
        setField(term103652, term103652.getClass(), "_valueInstantiator", term103653);
        setField(term103652, term103652.getClass(), "_objectIdReader", null);
        setField(term103652, term103652.getClass(), "_anySetter", null);
        setBooleanField(term103652, term103652.getClass(), "_ignoreAllUnknown", false);
        setField(term103652, term103652.getClass(), "_buildMethod", null);
        setField(term103652, term103652.getClass(), "_builderConfig", null);
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
        args[0] = term103073;
        args[1] = term103339;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term103645));
        assertTrue(recursiveEquals(term103073, term103648));
        assertTrue(recursiveEquals(term103339, term103652));
    }

};


