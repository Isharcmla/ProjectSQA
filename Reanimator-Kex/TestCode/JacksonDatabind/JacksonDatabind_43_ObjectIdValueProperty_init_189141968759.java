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

public class ObjectIdValueProperty_init_189141968759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65660;
     Object term65890;
     Object term70360;
     Object term70366;
     Object term70370;

    public ObjectIdValueProperty_init_189141968759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65542 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setField(term65542, term65542.getClass(), "_metadata", null);
        setIntField(term65542, term65542.getClass(), "_propertyIndex", 0);
        term65660 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term65752 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term65752, term65752.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term65660, term65660.getClass(), "propertyName", term65752);
        setField(term65660, term65660.getClass(), "_idType", null);
        setField(term65660, term65660.getClass(), "_deserializer", null);
        term65890 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        term70360 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term70361 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term70362 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term70365 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term70361, term70361.getClass(), "_idType", null);
        setField(term70362, term70362.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term70362, term70362.getClass(), "_namespace", null);
        setField(term70362, term70362.getClass(), "_encodedSimple", null);
        setField(term70361, term70361.getClass(), "propertyName", term70362);
        setField(term70361, term70361.getClass(), "generator", null);
        setField(term70361, term70361.getClass(), "resolver", null);
        setField(term70361, term70361.getClass(), "_deserializer", null);
        setField(term70361, term70361.getClass(), "idProperty", null);
        setField(term70360, term70360.getClass(), "_objectIdReader", term70361);
        setField(term70360, term70360.getClass(), "_propName", term70362);
        setField(term70360, term70360.getClass(), "_type", null);
        setField(term70360, term70360.getClass(), "_wrapperName", null);
        setField(term70360, term70360.getClass(), "_contextAnnotations", null);
        setField(term70360, term70360.getClass(), "_valueDeserializer", null);
        setField(term70360, term70360.getClass(), "_valueTypeDeserializer", null);
        setField(term70360, term70360.getClass(), "_managedReferenceName", null);
        setField(term70360, term70360.getClass(), "_objectIdInfo", null);
        setField(term70360, term70360.getClass(), "_viewMatcher", null);
        setIntField(term70360, term70360.getClass(), "_propertyIndex", -1);
        setField(term70365, term70365.getClass(), "_required", null);
        setField(term70365, term70365.getClass(), "_description", null);
        setField(term70365, term70365.getClass(), "_index", null);
        setField(term70365, term70365.getClass(), "_defaultValue", null);
        setField(term70360, term70360.getClass(), "_metadata", term70365);
        setField(term70360, term70360.getClass(), "_format", null);
        term70366 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term70367 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term70366, term70366.getClass(), "_idType", null);
        setField(term70367, term70367.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term70367, term70367.getClass(), "_namespace", null);
        setField(term70367, term70367.getClass(), "_encodedSimple", null);
        setField(term70366, term70366.getClass(), "propertyName", term70367);
        setField(term70366, term70366.getClass(), "generator", null);
        setField(term70366, term70366.getClass(), "resolver", null);
        setField(term70366, term70366.getClass(), "_deserializer", null);
        setField(term70366, term70366.getClass(), "idProperty", null);
        term70370 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term70370, term70370.getClass(), "_required", null);
        setField(term70370, term70370.getClass(), "_description", null);
        setField(term70370, term70370.getClass(), "_index", null);
        setField(term70370, term70370.getClass(), "_defaultValue", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term65660;
        args[1] = term65890;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term70360));
        assertTrue(recursiveEquals(term65660, term70366));
        assertTrue(recursiveEquals(term65890, term70370));
    }

};


