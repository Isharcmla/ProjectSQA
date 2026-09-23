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

public class AtomicReferenceDeserializer_init_42896733521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3051;
     Object term3057;
     Object term3059;

    public AtomicReferenceDeserializer_init_42896733521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2959 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        term3051 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term3057 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term3058 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term3058, term3058.getClass(), "_keyType", null);
        setField(term3058, term3058.getClass(), "_valueType", null);
        setField(term3058, term3058.getClass(), "_superClass", null);
        setField(term3058, term3058.getClass(), "_superInterfaces", null);
        setField(term3058, term3058.getClass(), "_bindings", null);
        setField(term3058, term3058.getClass(), "_canonicalName", null);
        setField(term3058, term3058.getClass(), "_class", null);
        setIntField(term3058, term3058.getClass(), "_hash", 0);
        setField(term3058, term3058.getClass(), "_valueHandler", null);
        setField(term3058, term3058.getClass(), "_typeHandler", null);
        setBooleanField(term3058, term3058.getClass(), "_asStatic", false);
        setField(term3057, term3057.getClass(), "_fullType", term3058);
        setField(term3057, term3057.getClass(), "_valueInstantiator", null);
        setField(term3057, term3057.getClass(), "_valueTypeDeserializer", null);
        setField(term3057, term3057.getClass(), "_valueDeserializer", null);
        setField(term3057, term3057.getClass(), "_valueClass", null);
        term3059 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term3059, term3059.getClass(), "_keyType", null);
        setField(term3059, term3059.getClass(), "_valueType", null);
        setField(term3059, term3059.getClass(), "_superClass", null);
        setField(term3059, term3059.getClass(), "_superInterfaces", null);
        setField(term3059, term3059.getClass(), "_bindings", null);
        setField(term3059, term3059.getClass(), "_canonicalName", null);
        setField(term3059, term3059.getClass(), "_class", null);
        setIntField(term3059, term3059.getClass(), "_hash", 0);
        setField(term3059, term3059.getClass(), "_valueHandler", null);
        setField(term3059, term3059.getClass(), "_typeHandler", null);
        setBooleanField(term3059, term3059.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.jsontype.TypeDeserializer");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[4];
        args[0] = term3051;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3057));
        assertTrue(recursiveEquals(term3051, term3059));
    }

};


