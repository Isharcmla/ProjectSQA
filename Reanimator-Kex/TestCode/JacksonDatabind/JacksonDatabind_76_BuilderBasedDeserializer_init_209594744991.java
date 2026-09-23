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
import java.lang.String;

public class BuilderBasedDeserializer_init_209594744991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18680;
     Object term18908;

    public BuilderBasedDeserializer_init_209594744991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18436 = Class.forName((String) "java.util.EventObject");
        Object term18400 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term18552 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term18400, term18400.getClass(), "_valueClass", term18436);
        setField(term18400, term18400.getClass(), "_classAnnotations", term18552);
        setField(term18400, term18400.getClass(), "_beanType", null);
        setField(term18400, term18400.getClass(), "_valueInstantiator", null);
        setField(term18400, term18400.getClass(), "_delegateDeserializer", null);
        setField(term18400, term18400.getClass(), "_propertyBasedCreator", null);
        setField(term18400, term18400.getClass(), "_backRefs", null);
        setField(term18400, term18400.getClass(), "_ignorableProps", null);
        term18680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term18796 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term18680, term18680.getClass(), "_beanType", null);
        setField(term18680, term18680.getClass(), "_classAnnotations", term18796);
        setField(term18680, term18680.getClass(), "_valueInstantiator", null);
        setField(term18680, term18680.getClass(), "_delegateDeserializer", null);
        setField(term18680, term18680.getClass(), "_propertyBasedCreator", null);
        setField(term18680, term18680.getClass(), "_backRefs", null);
        setField(term18680, term18680.getClass(), "_ignorableProps", null);
        term18908 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term18680;
        args[1] = term18908;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


