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

public class BeanDeserializer_init_1724735634199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122161;
     Object term122419;
     Object term122696;
     Object term122699;
     Object term122702;

    public BeanDeserializer_init_1724735634199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121781 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term121897 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term122035 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term121781, term121781.getClass(), "_valueClass", null);
        setField(term121781, term121781.getClass(), "_classAnnotations", term121897);
        setField(term121781, term121781.getClass(), "_beanType", null);
        setField(term121781, term121781.getClass(), "_valueInstantiator", term122035);
        setField(term121781, term121781.getClass(), "_beanProperties", null);
        setField(term121781, term121781.getClass(), "_backRefs", null);
        setField(term121781, term121781.getClass(), "_ignorableProps", null);
        setBooleanField(term121781, term121781.getClass(), "_ignoreAllUnknown", false);
        setField(term121781, term121781.getClass(), "_anySetter", null);
        setField(term121781, term121781.getClass(), "_injectables", null);
        setField(term121781, term121781.getClass(), "_objectIdReader", null);
        setField(term121781, term121781.getClass(), "_unwrappedPropertyHandler", null);
        term122161 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term122289 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term122161, term122161.getClass(), "_valueInstantiator", term122289);
        setField(term122161, term122161.getClass(), "_anySetter", null);
        setField(term122161, term122161.getClass(), "_injectables", null);
        setField(term122161, term122161.getClass(), "_objectIdReader", null);
        term122419 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term122537 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term122653 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term122419, term122419.getClass(), "_type", null);
        setField(term122537, term122537.getClass(), "_classAnnotations", term122653);
        setField(term122419, term122419.getClass(), "_classInfo", term122537);
        term122696 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term122697 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term122698 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term122697, term122697.getClass(), "_annotations", null);
        setField(term122696, term122696.getClass(), "_classAnnotations", term122697);
        setField(term122696, term122696.getClass(), "_beanType", null);
        setField(term122696, term122696.getClass(), "_serializationShape", null);
        setField(term122698, term122698.getClass(), "_valueTypeDesc", null);
        setField(term122698, term122698.getClass(), "_defaultCreator", null);
        setField(term122698, term122698.getClass(), "_withArgsCreator", null);
        setField(term122698, term122698.getClass(), "_constructorArguments", null);
        setField(term122698, term122698.getClass(), "_delegateType", null);
        setField(term122698, term122698.getClass(), "_delegateCreator", null);
        setField(term122698, term122698.getClass(), "_delegateArguments", null);
        setField(term122698, term122698.getClass(), "_fromStringCreator", null);
        setField(term122698, term122698.getClass(), "_fromIntCreator", null);
        setField(term122698, term122698.getClass(), "_fromLongCreator", null);
        setField(term122698, term122698.getClass(), "_fromDoubleCreator", null);
        setField(term122698, term122698.getClass(), "_fromBooleanCreator", null);
        setField(term122698, term122698.getClass(), "_incompleteParameter", null);
        setField(term122696, term122696.getClass(), "_valueInstantiator", term122698);
        setField(term122696, term122696.getClass(), "_delegateDeserializer", null);
        setField(term122696, term122696.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term122696, term122696.getClass(), "_nonStandardCreation", true);
        setBooleanField(term122696, term122696.getClass(), "_vanillaProcessing", false);
        setField(term122696, term122696.getClass(), "_beanProperties", null);
        setField(term122696, term122696.getClass(), "_injectables", null);
        setField(term122696, term122696.getClass(), "_anySetter", null);
        setField(term122696, term122696.getClass(), "_ignorableProps", null);
        setBooleanField(term122696, term122696.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term122696, term122696.getClass(), "_needViewProcesing", false);
        setField(term122696, term122696.getClass(), "_backRefs", null);
        setField(term122696, term122696.getClass(), "_subDeserializers", null);
        setField(term122696, term122696.getClass(), "_unwrappedPropertyHandler", null);
        setField(term122696, term122696.getClass(), "_externalTypeIdHandler", null);
        setField(term122696, term122696.getClass(), "_objectIdReader", null);
        setField(term122696, term122696.getClass(), "_valueClass", null);
        term122699 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term122700 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term122701 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term122699, term122699.getClass(), "_propCollector", null);
        setField(term122699, term122699.getClass(), "_config", null);
        setField(term122699, term122699.getClass(), "_annotationIntrospector", null);
        setField(term122700, term122700.getClass(), "_class", null);
        setField(term122700, term122700.getClass(), "_superTypes", null);
        setField(term122700, term122700.getClass(), "_annotationIntrospector", null);
        setField(term122700, term122700.getClass(), "_mixInResolver", null);
        setField(term122700, term122700.getClass(), "_primaryMixIn", null);
        setField(term122701, term122701.getClass(), "_annotations", null);
        setField(term122700, term122700.getClass(), "_classAnnotations", term122701);
        setBooleanField(term122700, term122700.getClass(), "_creatorsResolved", false);
        setField(term122700, term122700.getClass(), "_defaultConstructor", null);
        setField(term122700, term122700.getClass(), "_constructors", null);
        setField(term122700, term122700.getClass(), "_creatorMethods", null);
        setField(term122700, term122700.getClass(), "_memberMethods", null);
        setField(term122700, term122700.getClass(), "_fields", null);
        setField(term122699, term122699.getClass(), "_classInfo", term122700);
        setField(term122699, term122699.getClass(), "_bindings", null);
        setField(term122699, term122699.getClass(), "_properties", null);
        setField(term122699, term122699.getClass(), "_objectIdInfo", null);
        setField(term122699, term122699.getClass(), "_type", null);
        term122702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term122703 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term122702, term122702.getClass(), "_beanDesc", null);
        setBooleanField(term122702, term122702.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term122702, term122702.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term122702, term122702.getClass(), "_properties", null);
        setField(term122702, term122702.getClass(), "_injectables", null);
        setField(term122702, term122702.getClass(), "_backRefProperties", null);
        setField(term122702, term122702.getClass(), "_ignorableProps", null);
        setField(term122703, term122703.getClass(), "_valueTypeDesc", null);
        setField(term122703, term122703.getClass(), "_defaultCreator", null);
        setField(term122703, term122703.getClass(), "_withArgsCreator", null);
        setField(term122703, term122703.getClass(), "_constructorArguments", null);
        setField(term122703, term122703.getClass(), "_delegateType", null);
        setField(term122703, term122703.getClass(), "_delegateCreator", null);
        setField(term122703, term122703.getClass(), "_delegateArguments", null);
        setField(term122703, term122703.getClass(), "_fromStringCreator", null);
        setField(term122703, term122703.getClass(), "_fromIntCreator", null);
        setField(term122703, term122703.getClass(), "_fromLongCreator", null);
        setField(term122703, term122703.getClass(), "_fromDoubleCreator", null);
        setField(term122703, term122703.getClass(), "_fromBooleanCreator", null);
        setField(term122703, term122703.getClass(), "_incompleteParameter", null);
        setField(term122702, term122702.getClass(), "_valueInstantiator", term122703);
        setField(term122702, term122702.getClass(), "_objectIdReader", null);
        setField(term122702, term122702.getClass(), "_anySetter", null);
        setBooleanField(term122702, term122702.getClass(), "_ignoreAllUnknown", false);
        setField(term122702, term122702.getClass(), "_buildMethod", null);
        setField(term122702, term122702.getClass(), "_builderConfig", null);
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
        args[0] = term122161;
        args[1] = term122419;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term122696));
        assertTrue(recursiveEquals(term122161, term122699));
        assertTrue(recursiveEquals(term122419, term122702));
    }

};


