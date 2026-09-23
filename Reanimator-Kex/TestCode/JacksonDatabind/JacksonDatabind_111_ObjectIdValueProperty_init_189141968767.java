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

public class ObjectIdValueProperty_init_189141968767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74756;
     Object term78838;
     Object term78844;

    public ObjectIdValueProperty_init_189141968767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74638 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term74638, term74638.getClass(), "_metadata", null);
        setIntField(term74638, term74638.getClass(), "_propertyIndex", 0);
        term74756 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term74848 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term74848, term74848.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term74756, term74756.getClass(), "propertyName", term74848);
        setField(term74756, term74756.getClass(), "_idType", null);
        setField(term74756, term74756.getClass(), "_deserializer", null);
        term78838 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term78839 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term78840 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term78843 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term78839, term78839.getClass(), "_idType", null);
        setField(term78840, term78840.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term78840, term78840.getClass(), "_namespace", null);
        setField(term78840, term78840.getClass(), "_encodedSimple", null);
        setField(term78839, term78839.getClass(), "propertyName", term78840);
        setField(term78839, term78839.getClass(), "generator", null);
        setField(term78839, term78839.getClass(), "resolver", null);
        setField(term78839, term78839.getClass(), "_deserializer", null);
        setField(term78839, term78839.getClass(), "idProperty", null);
        setField(term78838, term78838.getClass(), "_objectIdReader", term78839);
        setField(term78838, term78838.getClass(), "_propName", term78840);
        setField(term78838, term78838.getClass(), "_type", null);
        setField(term78838, term78838.getClass(), "_wrapperName", null);
        setField(term78838, term78838.getClass(), "_contextAnnotations", null);
        setField(term78838, term78838.getClass(), "_valueDeserializer", null);
        setField(term78838, term78838.getClass(), "_valueTypeDeserializer", null);
        setField(term78838, term78838.getClass(), "_nullProvider", null);
        setField(term78838, term78838.getClass(), "_managedReferenceName", null);
        setField(term78838, term78838.getClass(), "_objectIdInfo", null);
        setField(term78838, term78838.getClass(), "_viewMatcher", null);
        setIntField(term78838, term78838.getClass(), "_propertyIndex", -1);
        setField(term78843, term78843.getClass(), "_required", null);
        setField(term78843, term78843.getClass(), "_description", null);
        setField(term78843, term78843.getClass(), "_index", null);
        setField(term78843, term78843.getClass(), "_defaultValue", null);
        setField(term78843, term78843.getClass(), "_mergeInfo", null);
        setField(term78843, term78843.getClass(), "_valueNulls", null);
        setField(term78843, term78843.getClass(), "_contentNulls", null);
        setField(term78838, term78838.getClass(), "_metadata", term78843);
        setField(term78838, term78838.getClass(), "_propertyFormat", null);
        setField(term78838, term78838.getClass(), "_aliases", null);
        term78844 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term78845 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term78844, term78844.getClass(), "_idType", null);
        setField(term78845, term78845.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term78845, term78845.getClass(), "_namespace", null);
        setField(term78845, term78845.getClass(), "_encodedSimple", null);
        setField(term78844, term78844.getClass(), "propertyName", term78845);
        setField(term78844, term78844.getClass(), "generator", null);
        setField(term78844, term78844.getClass(), "resolver", null);
        setField(term78844, term78844.getClass(), "_deserializer", null);
        setField(term78844, term78844.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term74756;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term78838));
        assertTrue(recursiveEquals(term74756, term78844));
    }

};


