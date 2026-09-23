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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashSet;

public class BeanDeserializer_init_1678761736112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32233;

    public BeanDeserializer_init_1678761736112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32025 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer");
        Object term31989 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32121 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term31989, term31989.getClass(), "_valueClass", term32025);
        setField(term31989, term31989.getClass(), "_classAnnotations", null);
        setField(term31989, term31989.getClass(), "_beanType", term32121);
        setField(term31989, term31989.getClass(), "_valueInstantiator", null);
        setField(term31989, term31989.getClass(), "_delegateDeserializer", null);
        setField(term31989, term31989.getClass(), "_propertyBasedCreator", null);
        setField(term31989, term31989.getClass(), "_backRefs", null);
        setField(term31989, term31989.getClass(), "_ignorableProps", null);
        Class<? extends Object> term32373 = Class.forName((String) "java.lang.ref.ReferenceQueue");
        HashSet term32665 = new HashSet();
        term32233 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term32337 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term32489 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term32617 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StdValueInstantiator"));
        setField(term32337, term32337.getClass(), "_class", term32373);
        setField(term32233, term32233.getClass(), "_beanType", term32337);
        setField(term32233, term32233.getClass(), "_classAnnotations", term32489);
        setField(term32233, term32233.getClass(), "_valueInstantiator", term32617);
        setField(term32233, term32233.getClass(), "_delegateDeserializer", null);
        setField(term32233, term32233.getClass(), "_propertyBasedCreator", null);
        setField(term32233, term32233.getClass(), "_backRefs", null);
        setField(term32233, term32233.getClass(), "_ignorableProps", term32665);
        setBooleanField(term32233, term32233.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term32233;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


