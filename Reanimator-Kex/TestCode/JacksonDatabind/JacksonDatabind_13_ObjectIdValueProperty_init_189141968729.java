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

public class ObjectIdValueProperty_init_189141968729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4645;
     Object term4675;
     Object term4680;

    public ObjectIdValueProperty_init_189141968729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4527 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        term4645 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        term4675 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term4676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term4677 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term4676, term4676.getClass(), "_idType", null);
        setField(term4676, term4676.getClass(), "propertyName", null);
        setField(term4676, term4676.getClass(), "generator", null);
        setField(term4676, term4676.getClass(), "resolver", null);
        setField(term4676, term4676.getClass(), "_deserializer", null);
        setField(term4676, term4676.getClass(), "idProperty", null);
        setField(term4675, term4675.getClass(), "_objectIdReader", term4676);
        setField(term4677, term4677.getClass(), "_simpleName", "");
        setField(term4677, term4677.getClass(), "_namespace", null);
        setField(term4677, term4677.getClass(), "_encodedSimple", null);
        setField(term4675, term4675.getClass(), "_propName", term4677);
        setField(term4675, term4675.getClass(), "_type", null);
        setField(term4675, term4675.getClass(), "_wrapperName", null);
        setField(term4675, term4675.getClass(), "_contextAnnotations", null);
        setField(term4675, term4675.getClass(), "_valueDeserializer", null);
        setField(term4675, term4675.getClass(), "_valueTypeDeserializer", null);
        setField(term4675, term4675.getClass(), "_nullProvider", null);
        setField(term4675, term4675.getClass(), "_metadata", null);
        setField(term4675, term4675.getClass(), "_managedReferenceName", null);
        setField(term4675, term4675.getClass(), "_objectIdInfo", null);
        setField(term4675, term4675.getClass(), "_viewMatcher", null);
        setIntField(term4675, term4675.getClass(), "_propertyIndex", -1);
        term4680 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        setField(term4680, term4680.getClass(), "_idType", null);
        setField(term4680, term4680.getClass(), "propertyName", null);
        setField(term4680, term4680.getClass(), "generator", null);
        setField(term4680, term4680.getClass(), "resolver", null);
        setField(term4680, term4680.getClass(), "_deserializer", null);
        setField(term4680, term4680.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term4645;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4675));
        assertTrue(recursiveEquals(term4645, term4680));
    }

};


