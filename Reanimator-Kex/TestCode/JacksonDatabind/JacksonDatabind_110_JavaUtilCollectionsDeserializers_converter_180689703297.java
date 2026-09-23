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
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255052;
     Object term255208;
     Object term256513;
     Object term256558;
     Object term256510;

    public JavaUtilCollectionsDeserializers_converter_180689703297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255052 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term255172 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term255052, term255052.getClass(), "_class", null);
        setField(term255052, term255052.getClass(), "_superClass", term255172);
        term255208 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.MemberKey");
        term256513 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1");
        term256558 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term256559 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term256558, term256558.getClass(), "_keyType", null);
        setField(term256558, term256558.getClass(), "_valueType", null);
        setField(term256559, term256559.getClass(), "_referencedType", null);
        setField(term256559, term256559.getClass(), "_superClass", null);
        setField(term256559, term256559.getClass(), "_superInterfaces", null);
        setField(term256559, term256559.getClass(), "_bindings", null);
        setField(term256559, term256559.getClass(), "_canonicalName", null);
        setField(term256559, term256559.getClass(), "_class", null);
        setIntField(term256559, term256559.getClass(), "_hash", 0);
        setField(term256559, term256559.getClass(), "_valueHandler", null);
        setField(term256559, term256559.getClass(), "_typeHandler", null);
        setBooleanField(term256559, term256559.getClass(), "_asStatic", false);
        setField(term256558, term256558.getClass(), "_superClass", term256559);
        setField(term256558, term256558.getClass(), "_superInterfaces", null);
        setField(term256558, term256558.getClass(), "_bindings", null);
        setField(term256558, term256558.getClass(), "_canonicalName", null);
        setField(term256558, term256558.getClass(), "_class", null);
        setIntField(term256558, term256558.getClass(), "_hash", 0);
        setField(term256558, term256558.getClass(), "_valueHandler", null);
        setField(term256558, term256558.getClass(), "_typeHandler", null);
        setBooleanField(term256558, term256558.getClass(), "_asStatic", false);
        term256510 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term256510, term256510.getClass(), "_inputType", null);
        setIntField(term256510, term256510.getClass(), "_kind", 0);
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
        args[1] = term255052;
        args[2] = term255208;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term255052, term256558));
        assertTrue(recursiveEquals(term255208, 0));
        assertTrue(recursiveEquals(retValue, term256510));
    }

};


