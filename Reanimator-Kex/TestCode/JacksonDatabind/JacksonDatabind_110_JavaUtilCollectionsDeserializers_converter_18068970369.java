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

public class JavaUtilCollectionsDeserializers_converter_18068970369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28716;
     Object term28730;
     Object term28724;

    public JavaUtilCollectionsDeserializers_converter_18068970369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28716 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term28730 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28730, term28730.getClass(), "_referencedType", null);
        setField(term28730, term28730.getClass(), "_anchorType", null);
        setField(term28730, term28730.getClass(), "_superClass", null);
        setField(term28730, term28730.getClass(), "_superInterfaces", null);
        setField(term28730, term28730.getClass(), "_bindings", null);
        setField(term28730, term28730.getClass(), "_canonicalName", null);
        setField(term28730, term28730.getClass(), "_class", null);
        setIntField(term28730, term28730.getClass(), "_hash", 0);
        setField(term28730, term28730.getClass(), "_valueHandler", null);
        setField(term28730, term28730.getClass(), "_typeHandler", null);
        setBooleanField(term28730, term28730.getClass(), "_asStatic", false);
        term28724 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term28721 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28721, term28721.getClass(), "_referencedType", null);
        setField(term28721, term28721.getClass(), "_anchorType", null);
        setField(term28721, term28721.getClass(), "_superClass", null);
        setField(term28721, term28721.getClass(), "_superInterfaces", null);
        setField(term28721, term28721.getClass(), "_bindings", null);
        setField(term28721, term28721.getClass(), "_canonicalName", null);
        setField(term28721, term28721.getClass(), "_class", null);
        setIntField(term28721, term28721.getClass(), "_hash", 0);
        setField(term28721, term28721.getClass(), "_valueHandler", null);
        setField(term28721, term28721.getClass(), "_typeHandler", null);
        setBooleanField(term28721, term28721.getClass(), "_asStatic", false);
        setField(term28724, term28724.getClass(), "_inputType", term28721);
        setIntField(term28724, term28724.getClass(), "_kind", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term28716;
        args[2] = null;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term28716, null));
        assertTrue(recursiveEquals(retValue, term28724));
    }

};


