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

public class AtomicReferenceDeserializer_init_42896733517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2527;
     Object term2533;
     Object term2535;

    public AtomicReferenceDeserializer_init_42896733517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        term2527 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term2533 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term2534 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term2534, term2534.getClass(), "_referencedType", null);
        setField(term2534, term2534.getClass(), "_anchorType", null);
        setField(term2534, term2534.getClass(), "_superClass", null);
        setField(term2534, term2534.getClass(), "_superInterfaces", null);
        setField(term2534, term2534.getClass(), "_bindings", null);
        setField(term2534, term2534.getClass(), "_canonicalName", null);
        setField(term2534, term2534.getClass(), "_class", null);
        setIntField(term2534, term2534.getClass(), "_hash", 0);
        setField(term2534, term2534.getClass(), "_valueHandler", null);
        setField(term2534, term2534.getClass(), "_typeHandler", null);
        setBooleanField(term2534, term2534.getClass(), "_asStatic", false);
        setField(term2533, term2533.getClass(), "_fullType", term2534);
        setField(term2533, term2533.getClass(), "_valueInstantiator", null);
        setField(term2533, term2533.getClass(), "_valueTypeDeserializer", null);
        setField(term2533, term2533.getClass(), "_valueDeserializer", null);
        setField(term2533, term2533.getClass(), "_valueClass", null);
        term2535 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term2535, term2535.getClass(), "_referencedType", null);
        setField(term2535, term2535.getClass(), "_anchorType", null);
        setField(term2535, term2535.getClass(), "_superClass", null);
        setField(term2535, term2535.getClass(), "_superInterfaces", null);
        setField(term2535, term2535.getClass(), "_bindings", null);
        setField(term2535, term2535.getClass(), "_canonicalName", null);
        setField(term2535, term2535.getClass(), "_class", null);
        setIntField(term2535, term2535.getClass(), "_hash", 0);
        setField(term2535, term2535.getClass(), "_valueHandler", null);
        setField(term2535, term2535.getClass(), "_typeHandler", null);
        setBooleanField(term2535, term2535.getClass(), "_asStatic", false);
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
        args[0] = term2527;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term2533));
        assertTrue(recursiveEquals(term2527, term2535));
    }

};


