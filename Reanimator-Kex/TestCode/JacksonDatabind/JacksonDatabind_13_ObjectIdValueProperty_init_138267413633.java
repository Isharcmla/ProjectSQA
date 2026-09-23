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

public class ObjectIdValueProperty_init_138267413633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5192;
     Object term5330;
     Object term5878;
     Object term5880;
     Object term5882;

    public ObjectIdValueProperty_init_138267413633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5192 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term5238 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setIntField(term5192, term5192.getClass(), "_propertyIndex", 0);
        setField(term5192, term5192.getClass(), "_propName", term5238);
        term5330 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term5878 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term5879 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term5878, term5878.getClass(), "_objectIdReader", null);
        setField(term5879, term5879.getClass(), "_simpleName", null);
        setField(term5879, term5879.getClass(), "_namespace", null);
        setField(term5879, term5879.getClass(), "_encodedSimple", null);
        setField(term5878, term5878.getClass(), "_propName", term5879);
        setField(term5878, term5878.getClass(), "_type", null);
        setField(term5878, term5878.getClass(), "_wrapperName", null);
        setField(term5878, term5878.getClass(), "_contextAnnotations", null);
        setField(term5878, term5878.getClass(), "_valueDeserializer", null);
        setField(term5878, term5878.getClass(), "_valueTypeDeserializer", null);
        setField(term5878, term5878.getClass(), "_nullProvider", null);
        setField(term5878, term5878.getClass(), "_metadata", null);
        setField(term5878, term5878.getClass(), "_managedReferenceName", null);
        setField(term5878, term5878.getClass(), "_objectIdInfo", null);
        setField(term5878, term5878.getClass(), "_viewMatcher", null);
        setIntField(term5878, term5878.getClass(), "_propertyIndex", 0);
        term5880 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term5881 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term5880, term5880.getClass(), "_objectIdReader", null);
        setField(term5881, term5881.getClass(), "_simpleName", null);
        setField(term5881, term5881.getClass(), "_namespace", null);
        setField(term5881, term5881.getClass(), "_encodedSimple", null);
        setField(term5880, term5880.getClass(), "_propName", term5881);
        setField(term5880, term5880.getClass(), "_type", null);
        setField(term5880, term5880.getClass(), "_wrapperName", null);
        setField(term5880, term5880.getClass(), "_contextAnnotations", null);
        setField(term5880, term5880.getClass(), "_valueDeserializer", null);
        setField(term5880, term5880.getClass(), "_valueTypeDeserializer", null);
        setField(term5880, term5880.getClass(), "_nullProvider", null);
        setField(term5880, term5880.getClass(), "_metadata", null);
        setField(term5880, term5880.getClass(), "_managedReferenceName", null);
        setField(term5880, term5880.getClass(), "_objectIdInfo", null);
        setField(term5880, term5880.getClass(), "_viewMatcher", null);
        setIntField(term5880, term5880.getClass(), "_propertyIndex", 0);
        term5882 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term5882, term5882.getClass(), "_simpleName", null);
        setField(term5882, term5882.getClass(), "_namespace", null);
        setField(term5882, term5882.getClass(), "_encodedSimple", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyName");
        Object[] args = new Object[2];
        args[0] = term5192;
        args[1] = term5330;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5878));
        assertTrue(recursiveEquals(term5192, term5880));
        assertTrue(recursiveEquals(term5330, term5882));
    }

};


