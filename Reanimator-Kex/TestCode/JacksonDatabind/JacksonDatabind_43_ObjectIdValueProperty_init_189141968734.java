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

public class ObjectIdValueProperty_init_189141968734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6011;
     Object term7764;
     Object term7770;

    public ObjectIdValueProperty_init_189141968734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5893 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term5893, term5893.getClass(), "_metadata", null);
        setIntField(term5893, term5893.getClass(), "_propertyIndex", 0);
        term6011 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term6103 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term6103, term6103.getClass(), "_simpleName", "");
        setField(term6011, term6011.getClass(), "propertyName", term6103);
        setField(term6011, term6011.getClass(), "_idType", null);
        setField(term6011, term6011.getClass(), "_deserializer", null);
        term7764 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term7765 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term7766 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term7769 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term7765, term7765.getClass(), "_idType", null);
        setField(term7766, term7766.getClass(), "_simpleName", "");
        setField(term7766, term7766.getClass(), "_namespace", null);
        setField(term7766, term7766.getClass(), "_encodedSimple", null);
        setField(term7765, term7765.getClass(), "propertyName", term7766);
        setField(term7765, term7765.getClass(), "generator", null);
        setField(term7765, term7765.getClass(), "resolver", null);
        setField(term7765, term7765.getClass(), "_deserializer", null);
        setField(term7765, term7765.getClass(), "idProperty", null);
        setField(term7764, term7764.getClass(), "_objectIdReader", term7765);
        setField(term7764, term7764.getClass(), "_propName", term7766);
        setField(term7764, term7764.getClass(), "_type", null);
        setField(term7764, term7764.getClass(), "_wrapperName", null);
        setField(term7764, term7764.getClass(), "_contextAnnotations", null);
        setField(term7764, term7764.getClass(), "_valueDeserializer", null);
        setField(term7764, term7764.getClass(), "_valueTypeDeserializer", null);
        setField(term7764, term7764.getClass(), "_managedReferenceName", null);
        setField(term7764, term7764.getClass(), "_objectIdInfo", null);
        setField(term7764, term7764.getClass(), "_viewMatcher", null);
        setIntField(term7764, term7764.getClass(), "_propertyIndex", -1);
        setField(term7769, term7769.getClass(), "_required", null);
        setField(term7769, term7769.getClass(), "_description", null);
        setField(term7769, term7769.getClass(), "_index", null);
        setField(term7769, term7769.getClass(), "_defaultValue", null);
        setField(term7764, term7764.getClass(), "_metadata", term7769);
        setField(term7764, term7764.getClass(), "_format", null);
        term7770 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term7771 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term7770, term7770.getClass(), "_idType", null);
        setField(term7771, term7771.getClass(), "_simpleName", "");
        setField(term7771, term7771.getClass(), "_namespace", null);
        setField(term7771, term7771.getClass(), "_encodedSimple", null);
        setField(term7770, term7770.getClass(), "propertyName", term7771);
        setField(term7770, term7770.getClass(), "generator", null);
        setField(term7770, term7770.getClass(), "resolver", null);
        setField(term7770, term7770.getClass(), "_deserializer", null);
        setField(term7770, term7770.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term6011;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7764));
        assertTrue(recursiveEquals(term6011, term7770));
    }

};


