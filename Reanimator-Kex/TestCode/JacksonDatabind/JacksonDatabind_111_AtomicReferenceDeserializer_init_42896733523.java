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

public class AtomicReferenceDeserializer_init_42896733523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3320;
     Object term3326;
     Object term3328;

    public AtomicReferenceDeserializer_init_42896733523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3214 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        term3320 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term3326 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term3327 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term3327, term3327.getClass(), "_elementType", null);
        setField(term3327, term3327.getClass(), "_superClass", null);
        setField(term3327, term3327.getClass(), "_superInterfaces", null);
        setField(term3327, term3327.getClass(), "_bindings", null);
        setField(term3327, term3327.getClass(), "_canonicalName", null);
        setField(term3327, term3327.getClass(), "_class", null);
        setIntField(term3327, term3327.getClass(), "_hash", 0);
        setField(term3327, term3327.getClass(), "_valueHandler", null);
        setField(term3327, term3327.getClass(), "_typeHandler", null);
        setBooleanField(term3327, term3327.getClass(), "_asStatic", false);
        setField(term3326, term3326.getClass(), "_fullType", term3327);
        setField(term3326, term3326.getClass(), "_valueInstantiator", null);
        setField(term3326, term3326.getClass(), "_valueTypeDeserializer", null);
        setField(term3326, term3326.getClass(), "_valueDeserializer", null);
        setField(term3326, term3326.getClass(), "_valueClass", null);
        term3328 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term3328, term3328.getClass(), "_elementType", null);
        setField(term3328, term3328.getClass(), "_superClass", null);
        setField(term3328, term3328.getClass(), "_superInterfaces", null);
        setField(term3328, term3328.getClass(), "_bindings", null);
        setField(term3328, term3328.getClass(), "_canonicalName", null);
        setField(term3328, term3328.getClass(), "_class", null);
        setIntField(term3328, term3328.getClass(), "_hash", 0);
        setField(term3328, term3328.getClass(), "_valueHandler", null);
        setField(term3328, term3328.getClass(), "_typeHandler", null);
        setBooleanField(term3328, term3328.getClass(), "_asStatic", false);
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
        args[0] = term3320;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3326));
        assertTrue(recursiveEquals(term3320, term3328));
    }

};


