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

public class BuilderBasedDeserializer_init_2095947449219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127470;
     Object term127988;

    public BuilderBasedDeserializer_init_2095947449219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term127236 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term127342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term127236, term127236.getClass(), "_valueClass", null);
        setField(term127236, term127236.getClass(), "_classAnnotations", null);
        setField(term127236, term127236.getClass(), "_beanType", term127342);
        setField(term127236, term127236.getClass(), "_valueInstantiator", null);
        setField(term127236, term127236.getClass(), "_delegateDeserializer", null);
        setField(term127236, term127236.getClass(), "_propertyBasedCreator", null);
        setField(term127236, term127236.getClass(), "_backRefs", null);
        setField(term127236, term127236.getClass(), "_ignorableProps", null);
        setBooleanField(term127236, term127236.getClass(), "_ignoreAllUnknown", false);
        setField(term127236, term127236.getClass(), "_anySetter", null);
        setField(term127236, term127236.getClass(), "_injectables", null);
        setField(term127236, term127236.getClass(), "_objectIdReader", null);
        setBooleanField(term127236, term127236.getClass(), "_nonStandardCreation", false);
        Class<? extends Object> term127610 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer");
        term127470 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer"));
        Object term127574 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term127726 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term127864 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler"));
        setField(term127574, term127574.getClass(), "_class", term127610);
        setField(term127470, term127470.getClass(), "_beanType", term127574);
        setField(term127470, term127470.getClass(), "_classAnnotations", term127726);
        setField(term127470, term127470.getClass(), "_valueInstantiator", null);
        setField(term127470, term127470.getClass(), "_delegateDeserializer", null);
        setField(term127470, term127470.getClass(), "_propertyBasedCreator", null);
        setField(term127470, term127470.getClass(), "_backRefs", null);
        setField(term127470, term127470.getClass(), "_ignorableProps", null);
        setField(term127470, term127470.getClass(), "_anySetter", null);
        setField(term127470, term127470.getClass(), "_injectables", null);
        setField(term127470, term127470.getClass(), "_objectIdReader", null);
        setBooleanField(term127470, term127470.getClass(), "_nonStandardCreation", false);
        setField(term127470, term127470.getClass(), "_unwrappedPropertyHandler", term127864);
        term127988 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.NameTransformer$Chained"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.util.NameTransformer");
        Object[] args = new Object[2];
        args[0] = term127470;
        args[1] = term127988;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


