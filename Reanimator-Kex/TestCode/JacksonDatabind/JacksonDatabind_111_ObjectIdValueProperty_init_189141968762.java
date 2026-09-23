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

public class ObjectIdValueProperty_init_189141968762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56815;
     Object term57045;
     Object term62529;
     Object term62535;
     Object term62539;

    public ObjectIdValueProperty_init_189141968762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56697 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term56697, term56697.getClass(), "_metadata", null);
        setIntField(term56697, term56697.getClass(), "_propertyIndex", 0);
        term56815 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term56907 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term56907, term56907.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term56815, term56815.getClass(), "propertyName", term56907);
        setField(term56815, term56815.getClass(), "_idType", null);
        setField(term56815, term56815.getClass(), "_deserializer", null);
        term57045 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term62529 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term62530 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term62531 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term62534 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term62530, term62530.getClass(), "_idType", null);
        setField(term62531, term62531.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term62531, term62531.getClass(), "_namespace", null);
        setField(term62531, term62531.getClass(), "_encodedSimple", null);
        setField(term62530, term62530.getClass(), "propertyName", term62531);
        setField(term62530, term62530.getClass(), "generator", null);
        setField(term62530, term62530.getClass(), "resolver", null);
        setField(term62530, term62530.getClass(), "_deserializer", null);
        setField(term62530, term62530.getClass(), "idProperty", null);
        setField(term62529, term62529.getClass(), "_objectIdReader", term62530);
        setField(term62529, term62529.getClass(), "_propName", term62531);
        setField(term62529, term62529.getClass(), "_type", null);
        setField(term62529, term62529.getClass(), "_wrapperName", null);
        setField(term62529, term62529.getClass(), "_contextAnnotations", null);
        setField(term62529, term62529.getClass(), "_valueDeserializer", null);
        setField(term62529, term62529.getClass(), "_valueTypeDeserializer", null);
        setField(term62529, term62529.getClass(), "_nullProvider", null);
        setField(term62529, term62529.getClass(), "_managedReferenceName", null);
        setField(term62529, term62529.getClass(), "_objectIdInfo", null);
        setField(term62529, term62529.getClass(), "_viewMatcher", null);
        setIntField(term62529, term62529.getClass(), "_propertyIndex", -1);
        setField(term62534, term62534.getClass(), "_required", null);
        setField(term62534, term62534.getClass(), "_description", null);
        setField(term62534, term62534.getClass(), "_index", null);
        setField(term62534, term62534.getClass(), "_defaultValue", null);
        setField(term62534, term62534.getClass(), "_mergeInfo", null);
        setField(term62534, term62534.getClass(), "_valueNulls", null);
        setField(term62534, term62534.getClass(), "_contentNulls", null);
        setField(term62529, term62529.getClass(), "_metadata", term62534);
        setField(term62529, term62529.getClass(), "_propertyFormat", null);
        setField(term62529, term62529.getClass(), "_aliases", null);
        term62535 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term62536 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term62535, term62535.getClass(), "_idType", null);
        setField(term62536, term62536.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term62536, term62536.getClass(), "_namespace", null);
        setField(term62536, term62536.getClass(), "_encodedSimple", null);
        setField(term62535, term62535.getClass(), "propertyName", term62536);
        setField(term62535, term62535.getClass(), "generator", null);
        setField(term62535, term62535.getClass(), "resolver", null);
        setField(term62535, term62535.getClass(), "_deserializer", null);
        setField(term62535, term62535.getClass(), "idProperty", null);
        term62539 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term62539, term62539.getClass(), "_required", null);
        setField(term62539, term62539.getClass(), "_description", null);
        setField(term62539, term62539.getClass(), "_index", null);
        setField(term62539, term62539.getClass(), "_defaultValue", null);
        setField(term62539, term62539.getClass(), "_mergeInfo", null);
        setField(term62539, term62539.getClass(), "_valueNulls", null);
        setField(term62539, term62539.getClass(), "_contentNulls", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term56815;
        args[1] = term57045;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62529));
        assertTrue(recursiveEquals(term56815, term62535));
        assertTrue(recursiveEquals(term57045, term62539));
    }

};


