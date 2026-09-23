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
import java.util.HashSet;

public class BuilderBasedDeserializer_init_2095947449197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97159;
     Object term97573;

    public BuilderBasedDeserializer_init_2095947449197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96915 = Class.forName((String) "java.util.stream.Nodes$DoubleFixedNodeBuilder");
        Object term96879 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term97031 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term96879, term96879.getClass(), "_valueClass", term96915);
        setField(term96879, term96879.getClass(), "_classAnnotations", term97031);
        setField(term96879, term96879.getClass(), "_beanType", null);
        setField(term96879, term96879.getClass(), "_valueInstantiator", null);
        setField(term96879, term96879.getClass(), "_delegateDeserializer", null);
        setField(term96879, term96879.getClass(), "_propertyBasedCreator", null);
        setField(term96879, term96879.getClass(), "_backRefs", null);
        setField(term96879, term96879.getClass(), "_ignorableProps", null);
        setBooleanField(term96879, term96879.getClass(), "_ignoreAllUnknown", false);
        setField(term96879, term96879.getClass(), "_anySetter", null);
        setField(term96879, term96879.getClass(), "_injectables", null);
        setField(term96879, term96879.getClass(), "_objectIdReader", null);
        setBooleanField(term96879, term96879.getClass(), "_nonStandardCreation", false);
        HashSet term97323 = new HashSet();
        term97159 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term97275 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object[] term96664 = (Object[]) newArray("com.fasterxml.jackson.databind.deser.impl.ValueInjector", 0);
        Object term97461 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term97159, term97159.getClass(), "_beanType", null);
        setField(term97159, term97159.getClass(), "_classAnnotations", term97275);
        setField(term97159, term97159.getClass(), "_valueInstantiator", null);
        setField(term97159, term97159.getClass(), "_delegateDeserializer", null);
        setField(term97159, term97159.getClass(), "_propertyBasedCreator", null);
        setField(term97159, term97159.getClass(), "_backRefs", null);
        setField(term97159, term97159.getClass(), "_ignorableProps", term97323);
        setField(term97159, term97159.getClass(), "_anySetter", null);
        setField(term97159, term97159.getClass(), "_injectables", term96664);
        setField(term97159, term97159.getClass(), "_objectIdReader", null);
        setBooleanField(term97159, term97159.getClass(), "_nonStandardCreation", false);
        setField(term97159, term97159.getClass(), "_unwrappedPropertyHandler", term97461);
        term97573 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term97159;
        args[1] = term97573;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


