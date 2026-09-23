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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;

public class BuilderBasedDeserializer_init_1465534056217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125021;
     Object term125331;
     Object term125603;

    public BuilderBasedDeserializer_init_1465534056217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term124779 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term124895 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term124779, term124779.getClass(), "_valueClass", null);
        setField(term124779, term124779.getClass(), "_classAnnotations", term124895);
        setField(term124779, term124779.getClass(), "_beanType", null);
        setField(term124779, term124779.getClass(), "_valueInstantiator", null);
        setField(term124779, term124779.getClass(), "_beanProperties", null);
        setField(term124779, term124779.getClass(), "_backRefs", null);
        setField(term124779, term124779.getClass(), "_ignorableProps", null);
        setBooleanField(term124779, term124779.getClass(), "_ignoreAllUnknown", false);
        setField(term124779, term124779.getClass(), "_anySetter", null);
        setField(term124779, term124779.getClass(), "_injectables", null);
        setField(term124779, term124779.getClass(), "_objectIdReader", null);
        setField(term124779, term124779.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term124779, term124779.getClass(), "_nonStandardCreation", false);
        ArrayList term125201 = new ArrayList();
        term125021 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term125149 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term125149, term125149.getClass(), "_delegateType", null);
        setField(term125149, term125149.getClass(), "_arrayDelegateType", null);
        setField(term125149, term125149.getClass(), "_withArgsCreator", null);
        setField(term125149, term125149.getClass(), "_defaultCreator", null);
        setField(term125021, term125021.getClass(), "_valueInstantiator", term125149);
        setField(term125021, term125021.getClass(), "_anySetter", null);
        setField(term125021, term125021.getClass(), "_injectables", term125201);
        setField(term125021, term125021.getClass(), "_objectIdReader", null);
        term125331 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term125449 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term125555 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term125331, term125331.getClass(), "_type", null);
        setField(term125449, term125449.getClass(), "_classAnnotations", null);
        setField(term125449, term125449.getClass(), "_class", null);
        setField(term125331, term125331.getClass(), "_classInfo", term125449);
        setField(term125331, term125331.getClass(), "_annotationIntrospector", null);
        setField(term125331, term125331.getClass(), "_config", term125555);
        term125603 = new HashSet();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap");
        argTypes[3] = Class.forName("java.util.Map");
        argTypes[4] = Class.forName("java.util.Set");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term125021;
        args[1] = term125331;
        args[2] = null;
        args[3] = null;
        args[4] = term125603;
        args[5] = true;
        args[6] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


