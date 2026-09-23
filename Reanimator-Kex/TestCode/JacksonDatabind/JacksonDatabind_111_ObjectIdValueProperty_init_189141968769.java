package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class ObjectIdValueProperty_init_189141968769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80643;
     Object term84726;
     Object term84732;

    public ObjectIdValueProperty_init_189141968769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80525 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term80525, term80525.getClass(), "_metadata", null);
        setIntField(term80525, term80525.getClass(), "_propertyIndex", 0);
        term80643 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term80735 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term80735, term80735.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term80643, term80643.getClass(), "propertyName", term80735);
        setField(term80643, term80643.getClass(), "_idType", null);
        setField(term80643, term80643.getClass(), "_deserializer", null);
        term84726 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term84727 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term84728 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term84731 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term84727, term84727.getClass(), "_idType", null);
        setField(term84728, term84728.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term84728, term84728.getClass(), "_namespace", null);
        setField(term84728, term84728.getClass(), "_encodedSimple", null);
        setField(term84727, term84727.getClass(), "propertyName", term84728);
        setField(term84727, term84727.getClass(), "generator", null);
        setField(term84727, term84727.getClass(), "resolver", null);
        setField(term84727, term84727.getClass(), "_deserializer", null);
        setField(term84727, term84727.getClass(), "idProperty", null);
        setField(term84726, term84726.getClass(), "_objectIdReader", term84727);
        setField(term84726, term84726.getClass(), "_propName", term84728);
        setField(term84726, term84726.getClass(), "_type", null);
        setField(term84726, term84726.getClass(), "_wrapperName", null);
        setField(term84726, term84726.getClass(), "_contextAnnotations", null);
        setField(term84726, term84726.getClass(), "_valueDeserializer", null);
        setField(term84726, term84726.getClass(), "_valueTypeDeserializer", null);
        setField(term84726, term84726.getClass(), "_nullProvider", null);
        setField(term84726, term84726.getClass(), "_managedReferenceName", null);
        setField(term84726, term84726.getClass(), "_objectIdInfo", null);
        setField(term84726, term84726.getClass(), "_viewMatcher", null);
        setIntField(term84726, term84726.getClass(), "_propertyIndex", -1);
        setField(term84731, term84731.getClass(), "_required", null);
        setField(term84731, term84731.getClass(), "_description", null);
        setField(term84731, term84731.getClass(), "_index", null);
        setField(term84731, term84731.getClass(), "_defaultValue", null);
        setField(term84731, term84731.getClass(), "_mergeInfo", null);
        setField(term84731, term84731.getClass(), "_valueNulls", null);
        setField(term84731, term84731.getClass(), "_contentNulls", null);
        setField(term84726, term84726.getClass(), "_metadata", term84731);
        setField(term84726, term84726.getClass(), "_propertyFormat", null);
        setField(term84726, term84726.getClass(), "_aliases", null);
        term84732 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term84733 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term84732, term84732.getClass(), "_idType", null);
        setField(term84733, term84733.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term84733, term84733.getClass(), "_namespace", null);
        setField(term84733, term84733.getClass(), "_encodedSimple", null);
        setField(term84732, term84732.getClass(), "propertyName", term84733);
        setField(term84732, term84732.getClass(), "generator", null);
        setField(term84732, term84732.getClass(), "resolver", null);
        setField(term84732, term84732.getClass(), "_deserializer", null);
        setField(term84732, term84732.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term80643;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term84726));
        assertTrue(recursiveEquals(term80643, term84732));
    }

};


