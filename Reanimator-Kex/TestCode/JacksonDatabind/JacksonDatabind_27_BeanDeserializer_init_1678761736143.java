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

public class BeanDeserializer_init_1678761736143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53550;
     Object term53932;

    public BeanDeserializer_init_1678761736143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term53438 = Class.forName((String) "java.util.concurrent.ForkJoinPool$InnocuousForkJoinWorkerThreadFactory");
        Object term53402 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(term53402, term53402.getClass(), "_valueClass", term53438);
        setField(term53402, term53402.getClass(), "_classAnnotations", null);
        setField(term53402, term53402.getClass(), "_beanType", null);
        setField(term53402, term53402.getClass(), "_valueInstantiator", null);
        setField(term53402, term53402.getClass(), "_delegateDeserializer", null);
        setField(term53402, term53402.getClass(), "_propertyBasedCreator", null);
        setField(term53402, term53402.getClass(), "_backRefs", null);
        setField(term53402, term53402.getClass(), "_ignorableProps", null);
        Class<? extends Object> term53678 = Class.forName((String) "java.util.ImmutableCollections$Set12");
        term53550 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        Object term53642 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term53794 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term53642, term53642.getClass(), "_class", term53678);
        setField(term53550, term53550.getClass(), "_beanType", term53642);
        setField(term53550, term53550.getClass(), "_classAnnotations", term53794);
        setField(term53550, term53550.getClass(), "_valueInstantiator", null);
        setField(term53550, term53550.getClass(), "_delegateDeserializer", null);
        setField(term53550, term53550.getClass(), "_propertyBasedCreator", null);
        setField(term53550, term53550.getClass(), "_backRefs", null);
        setField(term53550, term53550.getClass(), "_ignorableProps", null);
        term53932 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$NopTransformer"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BeanDeserializerBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term53550;
        args[1] = term53932;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


