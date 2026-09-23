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

public class StringCollectionDeserializer_init_183745375133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4766;
     Object term5886;
     Object term5888;

    public StringCollectionDeserializer_init_183745375133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4666 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        term4766 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term5886 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term5887 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term5886, term5886.getClass(), "_valueDeserializer", null);
        setField(term5886, term5886.getClass(), "_valueInstantiator", null);
        setField(term5886, term5886.getClass(), "_delegateDeserializer", null);
        setField(term5887, term5887.getClass(), "_keyType", null);
        setField(term5887, term5887.getClass(), "_valueType", null);
        setField(term5887, term5887.getClass(), "_superClass", null);
        setField(term5887, term5887.getClass(), "_superInterfaces", null);
        setField(term5887, term5887.getClass(), "_bindings", null);
        setField(term5887, term5887.getClass(), "_canonicalName", null);
        setField(term5887, term5887.getClass(), "_class", null);
        setIntField(term5887, term5887.getClass(), "_hash", 0);
        setField(term5887, term5887.getClass(), "_valueHandler", null);
        setField(term5887, term5887.getClass(), "_typeHandler", null);
        setBooleanField(term5887, term5887.getClass(), "_asStatic", false);
        setField(term5886, term5886.getClass(), "_containerType", term5887);
        setField(term5886, term5886.getClass(), "_nullProvider", null);
        setField(term5886, term5886.getClass(), "_unwrapSingle", null);
        setBooleanField(term5886, term5886.getClass(), "_skipNullValues", false);
        setField(term5886, term5886.getClass(), "_valueClass", null);
        term5888 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term5888, term5888.getClass(), "_keyType", null);
        setField(term5888, term5888.getClass(), "_valueType", null);
        setField(term5888, term5888.getClass(), "_superClass", null);
        setField(term5888, term5888.getClass(), "_superInterfaces", null);
        setField(term5888, term5888.getClass(), "_bindings", null);
        setField(term5888, term5888.getClass(), "_canonicalName", null);
        setField(term5888, term5888.getClass(), "_class", null);
        setIntField(term5888, term5888.getClass(), "_hash", 0);
        setField(term5888, term5888.getClass(), "_valueHandler", null);
        setField(term5888, term5888.getClass(), "_typeHandler", null);
        setBooleanField(term5888, term5888.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Object[] args = new Object[3];
        args[0] = term4766;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5886));
        assertTrue(recursiveEquals(term4766, term5888));
    }

};


