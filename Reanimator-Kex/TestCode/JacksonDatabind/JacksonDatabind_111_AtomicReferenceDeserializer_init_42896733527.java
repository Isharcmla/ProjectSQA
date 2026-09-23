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

public class AtomicReferenceDeserializer_init_42896733527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3856;
     Object term3863;
     Object term3865;

    public AtomicReferenceDeserializer_init_42896733527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3742 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        term3856 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        term3863 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer"));
        Object term3864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term3864, term3864.getClass(), "_ordinal", 0);
        setField(term3864, term3864.getClass(), "_actualType", null);
        setField(term3864, term3864.getClass(), "_superClass", null);
        setField(term3864, term3864.getClass(), "_superInterfaces", null);
        setField(term3864, term3864.getClass(), "_bindings", null);
        setField(term3864, term3864.getClass(), "_canonicalName", null);
        setField(term3864, term3864.getClass(), "_class", null);
        setIntField(term3864, term3864.getClass(), "_hash", 0);
        setField(term3864, term3864.getClass(), "_valueHandler", null);
        setField(term3864, term3864.getClass(), "_typeHandler", null);
        setBooleanField(term3864, term3864.getClass(), "_asStatic", false);
        setField(term3863, term3863.getClass(), "_fullType", term3864);
        setField(term3863, term3863.getClass(), "_valueInstantiator", null);
        setField(term3863, term3863.getClass(), "_valueTypeDeserializer", null);
        setField(term3863, term3863.getClass(), "_valueDeserializer", null);
        setField(term3863, term3863.getClass(), "_valueClass", null);
        term3865 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setIntField(term3865, term3865.getClass(), "_ordinal", 0);
        setField(term3865, term3865.getClass(), "_actualType", null);
        setField(term3865, term3865.getClass(), "_superClass", null);
        setField(term3865, term3865.getClass(), "_superInterfaces", null);
        setField(term3865, term3865.getClass(), "_bindings", null);
        setField(term3865, term3865.getClass(), "_canonicalName", null);
        setField(term3865, term3865.getClass(), "_class", null);
        setIntField(term3865, term3865.getClass(), "_hash", 0);
        setField(term3865, term3865.getClass(), "_valueHandler", null);
        setField(term3865, term3865.getClass(), "_typeHandler", null);
        setBooleanField(term3865, term3865.getClass(), "_asStatic", false);
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
        args[0] = term3856;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term3863));
        assertTrue(recursiveEquals(term3856, term3865));
    }

};


