package com.fasterxml.jackson.databind.jsontype.impl;

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
import static com.fasterxml.jackson.databind.jsontype.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.jsontype.impl.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term630871;
     Object term631133;
     Object term631654;
     Object term631658;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term631661 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term631660 = ((Class) term631661).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term631660).setAccessible(true);
        Object enum677 = ((Field) term631660).get((Object) null);
        term630871 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term630871, term630871.getClass(), "_appliesFor", enum677);
        term631133 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term631229 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term631133, term631133.getClass(), "_referencedType", term631229);
        Class<? extends Object> term632022 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term632021 = ((Class) term632022).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term632021).setAccessible(true);
        Object enum678 = ((Field) term632021).get((Object) null);
        term631654 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term631654, term631654.getClass(), "_appliesFor", enum678);
        setField(term631654, term631654.getClass(), "_idType", null);
        setField(term631654, term631654.getClass(), "_includeAs", null);
        setField(term631654, term631654.getClass(), "_typeProperty", null);
        setBooleanField(term631654, term631654.getClass(), "_typeIdVisible", false);
        setField(term631654, term631654.getClass(), "_defaultImpl", null);
        setField(term631654, term631654.getClass(), "_customIdResolver", null);
        term631658 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term631659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term631659, term631659.getClass(), "_componentType", null);
        setField(term631659, term631659.getClass(), "_emptyArray", null);
        setField(term631659, term631659.getClass(), "_superClass", null);
        setField(term631659, term631659.getClass(), "_superInterfaces", null);
        setField(term631659, term631659.getClass(), "_bindings", null);
        setField(term631659, term631659.getClass(), "_canonicalName", null);
        setField(term631659, term631659.getClass(), "_class", null);
        setIntField(term631659, term631659.getClass(), "_hash", 0);
        setField(term631659, term631659.getClass(), "_valueHandler", null);
        setField(term631659, term631659.getClass(), "_typeHandler", null);
        setBooleanField(term631659, term631659.getClass(), "_asStatic", false);
        setField(term631658, term631658.getClass(), "_referencedType", term631659);
        setField(term631658, term631658.getClass(), "_anchorType", null);
        setField(term631658, term631658.getClass(), "_superClass", null);
        setField(term631658, term631658.getClass(), "_superInterfaces", null);
        setField(term631658, term631658.getClass(), "_bindings", null);
        setField(term631658, term631658.getClass(), "_canonicalName", null);
        setField(term631658, term631658.getClass(), "_class", null);
        setIntField(term631658, term631658.getClass(), "_hash", 0);
        setField(term631658, term631658.getClass(), "_valueHandler", null);
        setField(term631658, term631658.getClass(), "_typeHandler", null);
        setBooleanField(term631658, term631658.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term631133;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term630871, args);
        assertTrue(recursiveEquals(term630871, term631654));
        assertTrue(recursiveEquals(term631133, null));
    }

};


