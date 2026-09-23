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

public class AtomicReferenceDeserializer_init_42896733519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2796;
     Object term2802;
     Object term2804;

    public AtomicReferenceDeserializer_init_42896733519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2690 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        term2796 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term2802 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term2803 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term2803, term2803.getClass(), "_elementType", null);
        setField(term2803, term2803.getClass(), "_superClass", null);
        setField(term2803, term2803.getClass(), "_superInterfaces", null);
        setField(term2803, term2803.getClass(), "_bindings", null);
        setField(term2803, term2803.getClass(), "_canonicalName", null);
        setField(term2803, term2803.getClass(), "_class", null);
        setIntField(term2803, term2803.getClass(), "_hash", 0);
        setField(term2803, term2803.getClass(), "_valueHandler", null);
        setField(term2803, term2803.getClass(), "_typeHandler", null);
        setBooleanField(term2803, term2803.getClass(), "_asStatic", false);
        setField(term2802, term2802.getClass(), "_fullType", term2803);
        setField(term2802, term2802.getClass(), "_valueInstantiator", null);
        setField(term2802, term2802.getClass(), "_valueTypeDeserializer", null);
        setField(term2802, term2802.getClass(), "_valueDeserializer", null);
        setField(term2802, term2802.getClass(), "_valueClass", null);
        term2804 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term2804, term2804.getClass(), "_elementType", null);
        setField(term2804, term2804.getClass(), "_superClass", null);
        setField(term2804, term2804.getClass(), "_superInterfaces", null);
        setField(term2804, term2804.getClass(), "_bindings", null);
        setField(term2804, term2804.getClass(), "_canonicalName", null);
        setField(term2804, term2804.getClass(), "_class", null);
        setIntField(term2804, term2804.getClass(), "_hash", 0);
        setField(term2804, term2804.getClass(), "_valueHandler", null);
        setField(term2804, term2804.getClass(), "_typeHandler", null);
        setBooleanField(term2804, term2804.getClass(), "_asStatic", false);
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
        args[0] = term2796;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2802));
        assertTrue(recursiveEquals(term2796, term2804));
    }

};


