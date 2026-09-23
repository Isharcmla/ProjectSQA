package com.fasterxml.jackson.databind.deser.std;

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
import static com.fasterxml.jackson.databind.deser.std.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.std.EqualityUtils.*;
import java.lang.Object;

public class StringCollectionDeserializer_init_190405741350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13461;
     Object term14633;
     Object term14635;

    public StringCollectionDeserializer_init_190405741350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13355 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        term13461 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term14633 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term14634 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term14633, term14633.getClass(), "_valueDeserializer", null);
        setField(term14633, term14633.getClass(), "_valueInstantiator", null);
        setField(term14633, term14633.getClass(), "_delegateDeserializer", null);
        setField(term14634, term14634.getClass(), "_elementType", null);
        setField(term14634, term14634.getClass(), "_superClass", null);
        setField(term14634, term14634.getClass(), "_superInterfaces", null);
        setField(term14634, term14634.getClass(), "_bindings", null);
        setField(term14634, term14634.getClass(), "_canonicalName", null);
        setField(term14634, term14634.getClass(), "_class", null);
        setIntField(term14634, term14634.getClass(), "_hash", 0);
        setField(term14634, term14634.getClass(), "_valueHandler", null);
        setField(term14634, term14634.getClass(), "_typeHandler", null);
        setBooleanField(term14634, term14634.getClass(), "_asStatic", false);
        setField(term14633, term14633.getClass(), "_containerType", term14634);
        setField(term14633, term14633.getClass(), "_nullProvider", null);
        setField(term14633, term14633.getClass(), "_unwrapSingle", null);
        setBooleanField(term14633, term14633.getClass(), "_skipNullValues", false);
        setField(term14633, term14633.getClass(), "_valueClass", null);
        term14635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term14635, term14635.getClass(), "_elementType", null);
        setField(term14635, term14635.getClass(), "_superClass", null);
        setField(term14635, term14635.getClass(), "_superInterfaces", null);
        setField(term14635, term14635.getClass(), "_bindings", null);
        setField(term14635, term14635.getClass(), "_canonicalName", null);
        setField(term14635, term14635.getClass(), "_class", null);
        setIntField(term14635, term14635.getClass(), "_hash", 0);
        setField(term14635, term14635.getClass(), "_valueHandler", null);
        setField(term14635, term14635.getClass(), "_typeHandler", null);
        setBooleanField(term14635, term14635.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        argTypes[5] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[6];
        args[0] = term13461;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14633));
        assertTrue(recursiveEquals(term13461, term14635));
    }

};


