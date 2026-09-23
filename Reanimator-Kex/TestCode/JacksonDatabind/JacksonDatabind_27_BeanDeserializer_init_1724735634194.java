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

public class BeanDeserializer_init_1724735634194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112103;
     Object term112413;

    public BeanDeserializer_init_1724735634194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term111735 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term111839 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term111977 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.CreatorCollector$Vanilla"));
        setField(term111735, term111735.getClass(), "_valueClass", null);
        setField(term111735, term111735.getClass(), "_classAnnotations", null);
        setField(term111735, term111735.getClass(), "_beanType", term111839);
        setField(term111735, term111735.getClass(), "_valueInstantiator", term111977);
        setField(term111735, term111735.getClass(), "_beanProperties", null);
        setField(term111735, term111735.getClass(), "_backRefs", null);
        setField(term111735, term111735.getClass(), "_ignorableProps", null);
        setBooleanField(term111735, term111735.getClass(), "_ignoreAllUnknown", false);
        setField(term111735, term111735.getClass(), "_anySetter", null);
        setField(term111735, term111735.getClass(), "_injectables", null);
        setField(term111735, term111735.getClass(), "_objectIdReader", null);
        setField(term111735, term111735.getClass(), "_unwrappedPropertyHandler", null);
        setBooleanField(term111735, term111735.getClass(), "_nonStandardCreation", false);
        ArrayList term112283 = new ArrayList();
        term112103 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder"));
        Object term112231 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term112231, term112231.getClass(), "_delegateType", null);
        setField(term112231, term112231.getClass(), "_withArgsCreator", null);
        setField(term112231, term112231.getClass(), "_defaultCreator", null);
        setField(term112103, term112103.getClass(), "_valueInstantiator", term112231);
        setField(term112103, term112103.getClass(), "_anySetter", null);
        setField(term112103, term112103.getClass(), "_injectables", term112283);
        setField(term112103, term112103.getClass(), "_objectIdReader", null);
        term112413 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.BasicBeanDescription"));
        Object term112531 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotatedClass"));
        Object term112673 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair"));
        setField(term112413, term112413.getClass(), "_type", null);
        setField(term112531, term112531.getClass(), "_classAnnotations", null);
        setField(term112531, term112531.getClass(), "_annotationIntrospector", null);
        setField(term112413, term112413.getClass(), "_classInfo", term112531);
        setField(term112413, term112413.getClass(), "_annotationIntrospector", term112673);
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
        args[0] = term112103;
        args[1] = term112413;
        args[2] = null;
        args[3] = null;
        args[4] = null;
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


