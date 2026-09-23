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

public class BeanDeserializer_init_1724735634155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65998;
     Object term66266;
     Object term66683;
     Object term66686;
     Object term66690;

    public BeanDeserializer_init_1724735634155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65628 = Class.forName((String) "java.lang.ref.PhantomReference");
        Object term65592 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term65744 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term65872 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term65592, term65592.getClass(), "_valueClass", term65628);
        setField(term65592, term65592.getClass(), "_classAnnotations", term65744);
        setField(term65592, term65592.getClass(), "_beanType", null);
        setField(term65592, term65592.getClass(), "_valueInstantiator", term65872);
        setField(term65592, term65592.getClass(), "_beanProperties", null);
        setField(term65592, term65592.getClass(), "_backRefs", null);
        setField(term65592, term65592.getClass(), "_ignorableProps", null);
        setBooleanField(term65592, term65592.getClass(), "_ignoreAllUnknown", false);
        setField(term65592, term65592.getClass(), "_anySetter", null);
        setField(term65592, term65592.getClass(), "_injectables", null);
        setField(term65592, term65592.getClass(), "_objectIdReader", null);
        setField(term65592, term65592.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term65592, term65592.getClass(), "_nonStandardCreation", false);
        term65998 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term66136 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term65998, term65998.getClass(), "_valueInstantiator", term66136);
        setField(term65998, term65998.getClass(), "_anySetter", null);
        setField(term65998, term65998.getClass(), "_injectables", null);
        setField(term65998, term65998.getClass(), "_objectIdReader", null);
        term66266 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term66384 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term66528 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        setField(term66266, term66266.getClass(), "_type", null);
        setField(term66384, term66384.getClass(), "_classAnnotations", null);
        setField(term66384, term66384.getClass(), "_annotationIntrospector", null);
        setField(term66266, term66266.getClass(), "_classInfo", term66384);
        setField(term66266, term66266.getClass(), "_annotationIntrospector", term66528);
        term66683 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term66684 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term66685 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term66684, term66684.getClass(), "_annotations", null);
        setField(term66683, term66683.getClass(), "_classAnnotations", term66684);
        setField(term66683, term66683.getClass(), "_beanType", null);
        setField(term66683, term66683.getClass(), "_serializationShape", null);
        setIntField(term66685, term66685.getClass(), "_type", 0);
        setField(term66683, term66683.getClass(), "_valueInstantiator", term66685);
        setField(term66683, term66683.getClass(), "_delegateDeserializer", null);
        setField(term66683, term66683.getClass(), "_propertyBasedCreator", null);
        setBooleanField(term66683, term66683.getClass(), "_nonStandardCreation", false);
        setBooleanField(term66683, term66683.getClass(), "_vanillaProcessing", true);
        setField(term66683, term66683.getClass(), "_beanProperties", null);
        setField(term66683, term66683.getClass(), "_injectables", null);
        setField(term66683, term66683.getClass(), "_anySetter", null);
        setField(term66683, term66683.getClass(), "_ignorableProps", null);
        setBooleanField(term66683, term66683.getClass(), "_ignoreAllUnknown", true);
        setBooleanField(term66683, term66683.getClass(), "_needViewProcesing", false);
        setField(term66683, term66683.getClass(), "_backRefs", null);
        setField(term66683, term66683.getClass(), "_subDeserializers", null);
        setField(term66683, term66683.getClass(), "_unwrappedPropertyHandler", null);
        setField(term66683, term66683.getClass(), "_externalTypeIdHandler", null);
        setField(term66683, term66683.getClass(), "_objectIdReader", null);
        setField(term66683, term66683.getClass(), "_valueClass", null);
        term66686 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term66687 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector$1"));
        Object term66688 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term66689 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term66686, term66686.getClass(), "_propCollector", null);
        setField(term66686, term66686.getClass(), "_config", null);
        setField(term66686, term66686.getClass(), "_annotationIntrospector", term66687);
        setField(term66688, term66688.getClass(), "_class", null);
        setField(term66688, term66688.getClass(), "_superTypes", null);
        setField(term66688, term66688.getClass(), "_annotationIntrospector", null);
        setField(term66688, term66688.getClass(), "_mixInResolver", null);
        setField(term66688, term66688.getClass(), "_primaryMixIn", null);
        setField(term66689, term66689.getClass(), "_annotations", null);
        setField(term66688, term66688.getClass(), "_classAnnotations", term66689);
        setBooleanField(term66688, term66688.getClass(), "_creatorsResolved", false);
        setField(term66688, term66688.getClass(), "_defaultConstructor", null);
        setField(term66688, term66688.getClass(), "_constructors", null);
        setField(term66688, term66688.getClass(), "_creatorMethods", null);
        setField(term66688, term66688.getClass(), "_memberMethods", null);
        setField(term66688, term66688.getClass(), "_fields", null);
        setField(term66686, term66686.getClass(), "_classInfo", term66688);
        setField(term66686, term66686.getClass(), "_bindings", null);
        setField(term66686, term66686.getClass(), "_properties", null);
        setField(term66686, term66686.getClass(), "_objectIdInfo", null);
        setField(term66686, term66686.getClass(), "_type", null);
        term66690 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term66691 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term66690, term66690.getClass(), "_beanDesc", null);
        setBooleanField(term66690, term66690.getClass(), "_defaultViewInclusion", false);
        setBooleanField(term66690, term66690.getClass(), "_caseInsensitivePropertyComparison", false);
        setField(term66690, term66690.getClass(), "_properties", null);
        setField(term66690, term66690.getClass(), "_injectables", null);
        setField(term66690, term66690.getClass(), "_backRefProperties", null);
        setField(term66690, term66690.getClass(), "_ignorableProps", null);
        setIntField(term66691, term66691.getClass(), "_type", 0);
        setField(term66690, term66690.getClass(), "_valueInstantiator", term66691);
        setField(term66690, term66690.getClass(), "_objectIdReader", null);
        setField(term66690, term66690.getClass(), "_anySetter", null);
        setBooleanField(term66690, term66690.getClass(), "_ignoreAllUnknown", false);
        setField(term66690, term66690.getClass(), "_buildMethod", null);
        setField(term66690, term66690.getClass(), "_builderConfig", null);
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
        args[0] = term65998;
        args[1] = term66266;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = true;
        args[6] = false;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term66683));
        assertTrue(recursiveEquals(term65998, term66686));
        assertTrue(recursiveEquals(term66266, term66690));
    }

};


