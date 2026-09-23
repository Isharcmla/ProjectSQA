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

public class JavaUtilCollectionsDeserializers_converter_180689703394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379619;
     Object term379983;
     Object term380454;
     Object term380499;
     Object term380451;

    public JavaUtilCollectionsDeserializers_converter_180689703394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379619 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term379723 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term379843 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term379947 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term379619, term379619.getClass(), "_class", null);
        setField(term379723, term379723.getClass(), "_class", null);
        setField(term379843, term379843.getClass(), "_class", null);
        setField(term379843, term379843.getClass(), "_superClass", term379947);
        setField(term379723, term379723.getClass(), "_superClass", term379843);
        setField(term379619, term379619.getClass(), "_superClass", term379723);
        term379983 = Class.forName((String) "com.fasterxml.jackson.databind.jsontype.impl.TypeSerializerBase");
        term380454 = Class.forName((String) "com.fasterxml.jackson.core.util.ThreadLocalBufferManager");
        term380499 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term380500 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term380501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term380502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term380499, term380499.getClass(), "_referencedType", null);
        setField(term380499, term380499.getClass(), "_anchorType", null);
        setField(term380500, term380500.getClass(), "_referencedType", null);
        setField(term380500, term380500.getClass(), "_anchorType", null);
        setField(term380501, term380501.getClass(), "_referencedType", null);
        setField(term380502, term380502.getClass(), "_referencedType", null);
        setField(term380502, term380502.getClass(), "_anchorType", null);
        setField(term380502, term380502.getClass(), "_superClass", null);
        setField(term380502, term380502.getClass(), "_superInterfaces", null);
        setField(term380502, term380502.getClass(), "_bindings", null);
        setField(term380502, term380502.getClass(), "_canonicalName", null);
        setField(term380502, term380502.getClass(), "_class", null);
        setIntField(term380502, term380502.getClass(), "_hash", 0);
        setField(term380502, term380502.getClass(), "_valueHandler", null);
        setField(term380502, term380502.getClass(), "_typeHandler", null);
        setBooleanField(term380502, term380502.getClass(), "_asStatic", false);
        setField(term380501, term380501.getClass(), "_superClass", term380502);
        setField(term380501, term380501.getClass(), "_superInterfaces", null);
        setField(term380501, term380501.getClass(), "_bindings", null);
        setField(term380501, term380501.getClass(), "_canonicalName", null);
        setField(term380501, term380501.getClass(), "_class", null);
        setIntField(term380501, term380501.getClass(), "_hash", 0);
        setField(term380501, term380501.getClass(), "_valueHandler", null);
        setField(term380501, term380501.getClass(), "_typeHandler", null);
        setBooleanField(term380501, term380501.getClass(), "_asStatic", false);
        setField(term380500, term380500.getClass(), "_superClass", term380501);
        setField(term380500, term380500.getClass(), "_superInterfaces", null);
        setField(term380500, term380500.getClass(), "_bindings", null);
        setField(term380500, term380500.getClass(), "_canonicalName", null);
        setField(term380500, term380500.getClass(), "_class", null);
        setIntField(term380500, term380500.getClass(), "_hash", 0);
        setField(term380500, term380500.getClass(), "_valueHandler", null);
        setField(term380500, term380500.getClass(), "_typeHandler", null);
        setBooleanField(term380500, term380500.getClass(), "_asStatic", false);
        setField(term380499, term380499.getClass(), "_superClass", term380500);
        setField(term380499, term380499.getClass(), "_superInterfaces", null);
        setField(term380499, term380499.getClass(), "_bindings", null);
        setField(term380499, term380499.getClass(), "_canonicalName", null);
        setField(term380499, term380499.getClass(), "_class", null);
        setIntField(term380499, term380499.getClass(), "_hash", 0);
        setField(term380499, term380499.getClass(), "_valueHandler", null);
        setField(term380499, term380499.getClass(), "_typeHandler", null);
        setBooleanField(term380499, term380499.getClass(), "_asStatic", false);
        term380451 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term380451, term380451.getClass(), "_inputType", null);
        setIntField(term380451, term380451.getClass(), "_kind", 0);
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
        args[1] = term379619;
        args[2] = term379983;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term379619, term380499));
        assertTrue(recursiveEquals(term379983, 0));
        assertTrue(recursiveEquals(retValue, term380451));
    }

};


