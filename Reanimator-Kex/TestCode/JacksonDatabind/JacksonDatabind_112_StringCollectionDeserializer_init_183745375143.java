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

public class StringCollectionDeserializer_init_183745375143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11225;
     Object term11234;
     Object term11236;

    public StringCollectionDeserializer_init_183745375143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11121 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        term11225 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term11234 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term11235 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term11234, term11234.getClass(), "_valueDeserializer", null);
        setField(term11234, term11234.getClass(), "_valueInstantiator", null);
        setField(term11234, term11234.getClass(), "_delegateDeserializer", null);
        setField(term11235, term11235.getClass(), "_referencedType", null);
        setField(term11235, term11235.getClass(), "_anchorType", null);
        setField(term11235, term11235.getClass(), "_superClass", null);
        setField(term11235, term11235.getClass(), "_superInterfaces", null);
        setField(term11235, term11235.getClass(), "_bindings", null);
        setField(term11235, term11235.getClass(), "_canonicalName", null);
        setField(term11235, term11235.getClass(), "_class", null);
        setIntField(term11235, term11235.getClass(), "_hash", 0);
        setField(term11235, term11235.getClass(), "_valueHandler", null);
        setField(term11235, term11235.getClass(), "_typeHandler", null);
        setBooleanField(term11235, term11235.getClass(), "_asStatic", false);
        setField(term11234, term11234.getClass(), "_containerType", term11235);
        setField(term11234, term11234.getClass(), "_nullProvider", null);
        setField(term11234, term11234.getClass(), "_unwrapSingle", null);
        setBooleanField(term11234, term11234.getClass(), "_skipNullValues", false);
        setField(term11234, term11234.getClass(), "_valueClass", null);
        term11236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term11236, term11236.getClass(), "_referencedType", null);
        setField(term11236, term11236.getClass(), "_anchorType", null);
        setField(term11236, term11236.getClass(), "_superClass", null);
        setField(term11236, term11236.getClass(), "_superInterfaces", null);
        setField(term11236, term11236.getClass(), "_bindings", null);
        setField(term11236, term11236.getClass(), "_canonicalName", null);
        setField(term11236, term11236.getClass(), "_class", null);
        setIntField(term11236, term11236.getClass(), "_hash", 0);
        setField(term11236, term11236.getClass(), "_valueHandler", null);
        setField(term11236, term11236.getClass(), "_typeHandler", null);
        setBooleanField(term11236, term11236.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.ValueInstantiator");
        Object[] args = new Object[3];
        args[0] = term11225;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term11234));
        assertTrue(recursiveEquals(term11225, term11236));
    }

};


