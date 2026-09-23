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
import java.util.HashMap;

public class BuilderBasedDeserializer_init_2095947449145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46749;

    public BuilderBasedDeserializer_init_2095947449145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46621 = Class.forName((String) "java.util.stream.Nodes$ToArrayTask$OfInt");
        Object term46585 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        setField(term46585, term46585.getClass(), "_valueClass", term46621);
        setField(term46585, term46585.getClass(), "_classAnnotations", null);
        setField(term46585, term46585.getClass(), "_beanType", null);
        setField(term46585, term46585.getClass(), "_valueInstantiator", null);
        setField(term46585, term46585.getClass(), "_delegateDeserializer", null);
        setField(term46585, term46585.getClass(), "_propertyBasedCreator", null);
        setField(term46585, term46585.getClass(), "_backRefs", null);
        setField(term46585, term46585.getClass(), "_ignorableProps", null);
        Class<? extends Object> term46899 = Class.forName((String) "com.fasterxml.jackson.databind.util.NameTransformer$3");
        HashMap term47063 = new HashMap();
        term46749 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term46863 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term47015 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setField(term46863, term46863.getClass(), "_class", term46899);
        setField(term46749, term46749.getClass(), "_beanType", term46863);
        setField(term46749, term46749.getClass(), "_classAnnotations", term47015);
        setField(term46749, term46749.getClass(), "_valueInstantiator", null);
        setField(term46749, term46749.getClass(), "_delegateDeserializer", null);
        setField(term46749, term46749.getClass(), "_propertyBasedCreator", null);
        setField(term46749, term46749.getClass(), "_backRefs", term47063);
        setField(term46749, term46749.getClass(), "_ignorableProps", null);
        setBooleanField(term46749, term46749.getClass(), "_ignoreAllUnknown", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term46749;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


