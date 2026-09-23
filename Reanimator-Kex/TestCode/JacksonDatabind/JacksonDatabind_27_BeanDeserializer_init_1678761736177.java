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

public class BeanDeserializer_init_1678761736177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90446;
     Object term90806;

    public BeanDeserializer_init_1678761736177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90334 = Class.forName((String) "com.fasterxml.jackson.databind.type.TypeBindings");
        Object term90298 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term90298, term90298.getClass(), "_valueClass", term90334);
        setField(term90298, term90298.getClass(), "_classAnnotations", null);
        setField(term90298, term90298.getClass(), "_beanType", null);
        setField(term90298, term90298.getClass(), "_valueInstantiator", null);
        setField(term90298, term90298.getClass(), "_delegateDeserializer", null);
        setField(term90298, term90298.getClass(), "_propertyBasedCreator", null);
        setField(term90298, term90298.getClass(), "_backRefs", null);
        setField(term90298, term90298.getClass(), "_ignorableProps", null);
        Class<? extends Object> term90578 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$DoubleBuilder");
        term90446 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term90542 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term90694 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term90542, term90542.getClass(), "_class", term90578);
        setField(term90446, term90446.getClass(), "_beanType", term90542);
        setField(term90446, term90446.getClass(), "_classAnnotations", term90694);
        setField(term90446, term90446.getClass(), "_valueInstantiator", null);
        setField(term90446, term90446.getClass(), "_delegateDeserializer", null);
        setField(term90446, term90446.getClass(), "_propertyBasedCreator", null);
        setField(term90446, term90446.getClass(), "_backRefs", null);
        setField(term90446, term90446.getClass(), "_ignorableProps", null);
        term90806 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$2"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term90446;
        args[1] = term90806;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


