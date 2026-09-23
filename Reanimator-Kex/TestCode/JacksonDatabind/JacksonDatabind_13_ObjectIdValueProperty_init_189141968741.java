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

public class ObjectIdValueProperty_init_189141968741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8779;
     Object term8964;
     Object term8969;

    public ObjectIdValueProperty_init_189141968741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8661 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        setIntField(term8661, term8661.getClass(), "_propertyIndex", 0);
        term8779 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term8871 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term8871, term8871.getClass(), "_simpleName", "");
        setField(term8779, term8779.getClass(), "propertyName", term8871);
        setField(term8779, term8779.getClass(), "_idType", null);
        setField(term8779, term8779.getClass(), "_deserializer", null);
        term8964 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term8965 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term8966 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term8965, term8965.getClass(), "_idType", null);
        setField(term8966, term8966.getClass(), "_simpleName", "");
        setField(term8966, term8966.getClass(), "_namespace", null);
        setField(term8966, term8966.getClass(), "_encodedSimple", null);
        setField(term8965, term8965.getClass(), "propertyName", term8966);
        setField(term8965, term8965.getClass(), "generator", null);
        setField(term8965, term8965.getClass(), "resolver", null);
        setField(term8965, term8965.getClass(), "_deserializer", null);
        setField(term8965, term8965.getClass(), "idProperty", null);
        setField(term8964, term8964.getClass(), "_objectIdReader", term8965);
        setField(term8964, term8964.getClass(), "_propName", term8966);
        setField(term8964, term8964.getClass(), "_type", null);
        setField(term8964, term8964.getClass(), "_wrapperName", null);
        setField(term8964, term8964.getClass(), "_contextAnnotations", null);
        setField(term8964, term8964.getClass(), "_valueDeserializer", null);
        setField(term8964, term8964.getClass(), "_valueTypeDeserializer", null);
        setField(term8964, term8964.getClass(), "_nullProvider", null);
        setField(term8964, term8964.getClass(), "_metadata", null);
        setField(term8964, term8964.getClass(), "_managedReferenceName", null);
        setField(term8964, term8964.getClass(), "_objectIdInfo", null);
        setField(term8964, term8964.getClass(), "_viewMatcher", null);
        setIntField(term8964, term8964.getClass(), "_propertyIndex", -1);
        term8969 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader"));
        Object term8970 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term8969, term8969.getClass(), "_idType", null);
        setField(term8970, term8970.getClass(), "_simpleName", "");
        setField(term8970, term8970.getClass(), "_namespace", null);
        setField(term8970, term8970.getClass(), "_encodedSimple", null);
        setField(term8969, term8969.getClass(), "propertyName", term8970);
        setField(term8969, term8969.getClass(), "generator", null);
        setField(term8969, term8969.getClass(), "resolver", null);
        setField(term8969, term8969.getClass(), "_deserializer", null);
        setField(term8969, term8969.getClass(), "idProperty", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.PropertyMetadata");
        Object[] args = new Object[2];
        args[0] = term8779;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8964));
        assertTrue(recursiveEquals(term8779, term8969));
    }

};


