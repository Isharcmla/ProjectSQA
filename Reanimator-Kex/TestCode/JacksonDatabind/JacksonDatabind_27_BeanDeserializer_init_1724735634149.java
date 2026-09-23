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

public class BeanDeserializer_init_1724735634149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61743;
     Object term62009;
     Object term62494;
     Object term62497;
     Object term62500;

    public BeanDeserializer_init_1724735634149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term61501 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term61617 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term61501, term61501.getClass(), "_valueClass", null);
        setField(term61501, term61501.getClass(), "_classAnnotations", term61617);
        setField(term61501, term61501.getClass(), "_beanType", null);
        setField(term61501, term61501.getClass(), "_valueInstantiator", null);
        setField(term61501, term61501.getClass(), "_beanProperties", null);
        setField(term61501, term61501.getClass(), "_backRefs", null);
        setField(term61501, term61501.getClass(), "_ignorableProps", null);
        setBooleanField(term61501, term61501.getClass(), "_ignoreAllUnknown", false);
        setField(term61501, term61501.getClass(), "_anySetter", null);
        setField(term61501, term61501.getClass(), "_injectables", null);
        setField(term61501, term61501.getClass(), "_objectIdReader", null);
        setField(term61501, term61501.getClass(), "_unwrappedPropertyHandler", null);
        term61743 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term61879 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term61743, term61743.getClass(), "_valueInstantiator", term61879);
        setField(term61743, term61743.getClass(), "_anySetter", null);
        setField(term61743, term61743.getClass(), "_injectables", null);
        setField(term61743, term61743.getClass(), "_objectIdReader", null);
        term62009 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term62127 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term62009, term62009.getClass(), "_type", null);
        setField(term62127, term62127.getClass(), "_classAnnotations", null);
        setField(term62127, term62127.getClass(), "_annotationIntrospector", null);
        setField(term62009, term62009.getClass(), "_classInfo", term62127);
        term62494 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term62495 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term62496 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term62495, term62495.getClass(), "_annotations", null);
        setField(term62494, term62494.getClass(), "_classAnnotations", term62495);
        setField(term62494, term62494.getClass(), "_beanType", null);
        setField(term62494, term62494.getClass(), "_serializationShape", null);
        setField(term62494, term62494.getClass(), "_valueInstantiator", term62496);
        setField(term62494, term62494.getClass(), "_delegateDeserializer", null);
        setField(term62494, term62494.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term62494, term62494.getClass(), "_nonStandardCreation", true);
        setBooleanField(term62494, term62494.getClass(), "_vanillaProcessing", false);
        setField(term62494, term62494.getClass(), "_beanProperties", null);
        setField(term62494, term62494.getClass(), "_injectables", null);
        setField(term62494, term62494.getClass(), "_anySetter", null);
        setField(term62494, term62494.getClass(), "_ignorableProps", null);
        setBooleanField(term62494, term62494.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term62494, term62494.getClass(), "_needViewProcesing", false);
        setField(term62494, term62494.getClass(), "_backRefs", null);
        setField(term62494, term62494.getClass(), "_subDeserializers", null);
        setField(term62494, term62494.getClass(), "_unwrappedPropertyHandler", null);
        setField(term62494, term62494.getClass(), "_externalTypeIdHandler", null);
        setField(term62494, term62494.getClass(), "_objectIdReader", null);
        setField(term62494, term62494.getClass(), "_valueClass", null);
        term62497 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term62498 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term62499 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term62497, term62497.getClass(), "_propCollector", null);
        setField(term62497, term62497.getClass(), "_config", null);
        setField(term62497, term62497.getClass(), "_annotationIntrospector", null);
        setField(term62498, term62498.getClass(), "_class", null);
        setField(term62498, term62498.getClass(), "_superTypes", null);
        setField(term62498, term62498.getClass(), "_annotationIntrospector", null);
        setField(term62498, term62498.getClass(), "_mixInResolver", null);
        setField(term62498, term62498.getClass(), "_primaryMixIn", null);
        setField(term62499, term62499.getClass(), "_annotations", null);
        setField(term62498, term62498.getClass(), "_classAnnotations", term62499);
        setBooleanField(term62498, term62498.getClass(), "_creatorsResolved", false);
        setField(term62498, term62498.getClass(), "_defaultConstructor", null);
        setField(term62498, term62498.getClass(), "_constructors", null);
        setField(term62498, term62498.getClass(), "_creatorMethods", null);
        setField(term62498, term62498.getClass(), "_memberMethods", null);
        setField(term62498, term62498.getClass(), "_fields", null);
        setField(term62497, term62497.getClass(), "_classInfo", term62498);
        setField(term62497, term62497.getClass(), "_bindings", null);
        setField(term62497, term62497.getClass(), "_properties", null);
        setField(term62497, term62497.getClass(), "_objectIdInfo", null);
        setField(term62497, term62497.getClass(), "_type", null);
        term62500 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term62501 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator"));
        setField(term62500, term62500.getClass(), "_beanDesc", null);
        setBooleanField(term62500, term62500.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term62500, term62500.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term62500, term62500.getClass(), "_properties", null);
        setField(term62500, term62500.getClass(), "_injectables", null);
        setField(term62500, term62500.getClass(), "_backRefProperties", null);
        setField(term62500, term62500.getClass(), "_ignorableProps", null);
        setField(term62500, term62500.getClass(), "_valueInstantiator", term62501);
        setField(term62500, term62500.getClass(), "_objectIdReader", null);
        setField(term62500, term62500.getClass(), "_anySetter", null);
        setBooleanField(term62500, term62500.getClass(), "_ignoreAllUnknown", false);
        setField(term62500, term62500.getClass(), "_buildMethod", null);
        setField(term62500, term62500.getClass(), "_builderConfig", null);
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
        args[0] = term61743;
        args[1] = term62009;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62494));
        assertTrue(recursiveEquals(term61743, term62497));
        assertTrue(recursiveEquals(term62009, term62500));
    }

};


