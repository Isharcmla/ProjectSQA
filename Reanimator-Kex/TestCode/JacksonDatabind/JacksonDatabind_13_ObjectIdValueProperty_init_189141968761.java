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

public class ObjectIdValueProperty_init_189141968761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37977;
     Object term46612;
     Object term46617;

    public ObjectIdValueProperty_init_189141968761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37859 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term37859, term37859.getClass(), "_propertyIndex", 0);
        term37977 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term38069 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term38069, term38069.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term37977, term37977.getClass(), "propertyName", term38069);
        setField(term37977, term37977.getClass(), "_idType", null);
        setField(term37977, term37977.getClass(), "_deserializer", null);
        term46612 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term46613 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term46614 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term46613, term46613.getClass(), "_idType", null);
        setField(term46614, term46614.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term46614, term46614.getClass(), "_namespace", null);
        setField(term46614, term46614.getClass(), "_encodedSimple", null);
        setField(term46613, term46613.getClass(), "propertyName", term46614);
        setField(term46613, term46613.getClass(), "generator", null);
        setField(term46613, term46613.getClass(), "resolver", null);
        setField(term46613, term46613.getClass(), "_deserializer", null);
        setField(term46613, term46613.getClass(), "idProperty", null);
        setField(term46612, term46612.getClass(), "_objectIdReader", term46613);
        setField(term46612, term46612.getClass(), "_propName", term46614);
        setField(term46612, term46612.getClass(), "_type", null);
        setField(term46612, term46612.getClass(), "_wrapperName", null);
        setField(term46612, term46612.getClass(), "_contextAnnotations", null);
        setField(term46612, term46612.getClass(), "_valueDeserializer", null);
        setField(term46612, term46612.getClass(), "_valueTypeDeserializer", null);
        setField(term46612, term46612.getClass(), "_nullProvider", null);
        setField(term46612, term46612.getClass(), "_metadata", null);
        setField(term46612, term46612.getClass(), "_managedReferenceName", null);
        setField(term46612, term46612.getClass(), "_objectIdInfo", null);
        setField(term46612, term46612.getClass(), "_viewMatcher", null);
        setIntField(term46612, term46612.getClass(), "_propertyIndex", -1);
        term46617 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term46618 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term46617, term46617.getClass(), "_idType", null);
        setField(term46618, term46618.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term46618, term46618.getClass(), "_namespace", null);
        setField(term46618, term46618.getClass(), "_encodedSimple", null);
        setField(term46617, term46617.getClass(), "propertyName", term46618);
        setField(term46617, term46617.getClass(), "generator", null);
        setField(term46617, term46617.getClass(), "resolver", null);
        setField(term46617, term46617.getClass(), "_deserializer", null);
        setField(term46617, term46617.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term37977;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term46612));
        assertTrue(recursiveEquals(term37977, term46617));
    }

};


