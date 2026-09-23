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
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class BeanDeserializer_init_1724735634167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80343;
     Object term80653;
     Object term80819;
     Object term80877;
     Object term80881;
     Object term80884;
     Object term80888;

    public BeanDeserializer_init_1724735634167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term80169 = new HashMap();
        HashSet term80217 = new HashSet();
        Object term80121 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term80121, term80121.getClass(), "_valueClass", null);
        setField(term80121, term80121.getClass(), "_classAnnotations", null);
        setField(term80121, term80121.getClass(), "_beanType", null);
        setField(term80121, term80121.getClass(), "_valueInstantiator", null);
        setField(term80121, term80121.getClass(), "_beanProperties", null);
        setField(term80121, term80121.getClass(), "_backRefs", term80169);
        setField(term80121, term80121.getClass(), "_ignorableProps", term80217);
        setBooleanField(term80121, term80121.getClass(), "_ignoreAllUnknown", false);
        setField(term80121, term80121.getClass(), "_anySetter", null);
        setField(term80121, term80121.getClass(), "_injectables", null);
        setField(term80121, term80121.getClass(), "_objectIdReader", null);
        setField(term80121, term80121.getClass(), "_unwrappedPropertyHandler", null);
        ArrayList term80523 = new ArrayList();
        term80343 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term80471 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term80343, term80343.getClass(), "_valueInstantiator", term80471);
        setField(term80343, term80343.getClass(), "_anySetter", null);
        setField(term80343, term80343.getClass(), "_injectables", term80523);
        setField(term80343, term80343.getClass(), "_objectIdReader", null);
        term80653 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term80771 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        setField(term80653, term80653.getClass(), "_type", null);
        setField(term80771, term80771.getClass(), "_classAnnotations", null);
        setField(term80771, term80771.getClass(), "_annotationIntrospector", null);
        setField(term80653, term80653.getClass(), "_classInfo", term80771);
        term80819 = new HashMap();
        HashMap term80880 = new HashMap();
        term80877 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term80878 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term80879 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term80878, term80878.getClass(), "_annotations", null);
        setField(term80877, term80877.getClass(), "_classAnnotations", term80878);
        setField(term80877, term80877.getClass(), "_beanType", null);
        setField(term80877, term80877.getClass(), "_serializationShape", null);
        setField(term80879, term80879.getClass(), "_valueTypeDesc", null);
        setField(term80879, term80879.getClass(), "_defaultCreator", null);
        setField(term80879, term80879.getClass(), "_withArgsCreator", null);
        setField(term80879, term80879.getClass(), "_constructorArguments", null);
        setField(term80879, term80879.getClass(), "_delegateType", null);
        setField(term80879, term80879.getClass(), "_delegateCreator", null);
        setField(term80879, term80879.getClass(), "_delegateArguments", null);
        setField(term80879, term80879.getClass(), "_fromStringCreator", null);
        setField(term80879, term80879.getClass(), "_fromIntCreator", null);
        setField(term80879, term80879.getClass(), "_fromLongCreator", null);
        setField(term80879, term80879.getClass(), "_fromDoubleCreator", null);
        setField(term80879, term80879.getClass(), "_fromBooleanCreator", null);
        setField(term80879, term80879.getClass(), "_incompleteParameter", null);
        setField(term80877, term80877.getClass(), "_valueInstantiator", term80879);
        setField(term80877, term80877.getClass(), "_delegateDeserializer", null);
        setField(term80877, term80877.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term80877, term80877.getClass(), "_nonStandardCreation", true);
        setBooleanField(term80877, term80877.getClass(), "_vanillaProcessing", false);
        setField(term80877, term80877.getClass(), "_beanProperties", null);
        setField(term80877, term80877.getClass(), "_injectables", null);
        setField(term80877, term80877.getClass(), "_anySetter", null);
        setField(term80877, term80877.getClass(), "_ignorableProps", null);
        setBooleanField(term80877, term80877.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term80877, term80877.getClass(), "_needViewProcesing", false);
        setField(term80877, term80877.getClass(), "_backRefs", term80880);
        setField(term80877, term80877.getClass(), "_subDeserializers", null);
        setField(term80877, term80877.getClass(), "_unwrappedPropertyHandler", null);
        setField(term80877, term80877.getClass(), "_externalTypeIdHandler", null);
        setField(term80877, term80877.getClass(), "_objectIdReader", null);
        setField(term80877, term80877.getClass(), "_valueClass", null);
        term80881 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term80882 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term80883 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term80881, term80881.getClass(), "_propCollector", null);
        setField(term80881, term80881.getClass(), "_config", null);
        setField(term80881, term80881.getClass(), "_annotationIntrospector", null);
        setField(term80882, term80882.getClass(), "_class", null);
        setField(term80882, term80882.getClass(), "_superTypes", null);
        setField(term80882, term80882.getClass(), "_annotationIntrospector", null);
        setField(term80882, term80882.getClass(), "_mixInResolver", null);
        setField(term80882, term80882.getClass(), "_primaryMixIn", null);
        setField(term80883, term80883.getClass(), "_annotations", null);
        setField(term80882, term80882.getClass(), "_classAnnotations", term80883);
        setBooleanField(term80882, term80882.getClass(), "_creatorsResolved", false);
        setField(term80882, term80882.getClass(), "_defaultConstructor", null);
        setField(term80882, term80882.getClass(), "_constructors", null);
        setField(term80882, term80882.getClass(), "_creatorMethods", null);
        setField(term80882, term80882.getClass(), "_memberMethods", null);
        setField(term80882, term80882.getClass(), "_fields", null);
        setField(term80881, term80881.getClass(), "_classInfo", term80882);
        setField(term80881, term80881.getClass(), "_bindings", null);
        setField(term80881, term80881.getClass(), "_properties", null);
        setField(term80881, term80881.getClass(), "_objectIdInfo", null);
        setField(term80881, term80881.getClass(), "_type", null);
        ArrayList term80885 = new ArrayList();
        term80884 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term80887 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term80884, term80884.getClass(), "_beanDesc", null);
        setBooleanField(term80884, term80884.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term80884, term80884.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term80884, term80884.getClass(), "_properties", null);
        setField(term80884, term80884.getClass(), "_injectables", term80885);
        setField(term80884, term80884.getClass(), "_backRefProperties", null);
        setField(term80884, term80884.getClass(), "_ignorableProps", null);
        setField(term80887, term80887.getClass(), "_valueTypeDesc", null);
        setField(term80887, term80887.getClass(), "_defaultCreator", null);
        setField(term80887, term80887.getClass(), "_withArgsCreator", null);
        setField(term80887, term80887.getClass(), "_constructorArguments", null);
        setField(term80887, term80887.getClass(), "_delegateType", null);
        setField(term80887, term80887.getClass(), "_delegateCreator", null);
        setField(term80887, term80887.getClass(), "_delegateArguments", null);
        setField(term80887, term80887.getClass(), "_fromStringCreator", null);
        setField(term80887, term80887.getClass(), "_fromIntCreator", null);
        setField(term80887, term80887.getClass(), "_fromLongCreator", null);
        setField(term80887, term80887.getClass(), "_fromDoubleCreator", null);
        setField(term80887, term80887.getClass(), "_fromBooleanCreator", null);
        setField(term80887, term80887.getClass(), "_incompleteParameter", null);
        setField(term80884, term80884.getClass(), "_valueInstantiator", term80887);
        setField(term80884, term80884.getClass(), "_objectIdReader", null);
        setField(term80884, term80884.getClass(), "_anySetter", null);
        setBooleanField(term80884, term80884.getClass(), "_ignoreAllUnknown", false);
        setField(term80884, term80884.getClass(), "_buildMethod", null);
        setField(term80884, term80884.getClass(), "_builderConfig", null);
        term80888 = new HashMap();
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
        args[0] = term80343;
        args[1] = term80653;
        args[2] = null;
        args[3] = term80819;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term80877));
        assertTrue(recursiveEquals(term80343, term80881));
        assertTrue(recursiveEquals(term80653, term80884));
        assertTrue(recursiveEquals(term80819, term80888));
    }

};


