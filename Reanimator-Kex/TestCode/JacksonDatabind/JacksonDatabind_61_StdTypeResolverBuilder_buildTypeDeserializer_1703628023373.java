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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402345;
     Object term402607;
     Object term403072;
     Object term403076;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term403079 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term403078 = ((Class) term403079).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term403078).setAccessible(true);
        Object enum467 = ((Field) term403078).get((Object) null);
        term402345 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term402345, term402345.getClass(), "_appliesFor", enum467);
        term402607 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term402699 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term402607, term402607.getClass(), "_referencedType", term402699);
        Class<? extends Object> term403419 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term403418 = ((Class) term403419).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term403418).setAccessible(true);
        Object enum468 = ((Field) term403418).get((Object) null);
        term403072 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term403072, term403072.getClass(), "_appliesFor", enum468);
        setField(term403072, term403072.getClass(), "_idType", null);
        setField(term403072, term403072.getClass(), "_includeAs", null);
        setField(term403072, term403072.getClass(), "_typeProperty", null);
        setBooleanField(term403072, term403072.getClass(), "_typeIdVisible", false);
        setField(term403072, term403072.getClass(), "_defaultImpl", null);
        setField(term403072, term403072.getClass(), "_customIdResolver", null);
        term403076 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term403077 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term403077, term403077.getClass(), "_keyType", null);
        setField(term403077, term403077.getClass(), "_valueType", null);
        setField(term403077, term403077.getClass(), "_superClass", null);
        setField(term403077, term403077.getClass(), "_superInterfaces", null);
        setField(term403077, term403077.getClass(), "_bindings", null);
        setField(term403077, term403077.getClass(), "_canonicalName", null);
        setField(term403077, term403077.getClass(), "_class", null);
        setIntField(term403077, term403077.getClass(), "_hash", 0);
        setField(term403077, term403077.getClass(), "_valueHandler", null);
        setField(term403077, term403077.getClass(), "_typeHandler", null);
        setBooleanField(term403077, term403077.getClass(), "_asStatic", false);
        setField(term403076, term403076.getClass(), "_referencedType", term403077);
        setField(term403076, term403076.getClass(), "_anchorType", null);
        setField(term403076, term403076.getClass(), "_superClass", null);
        setField(term403076, term403076.getClass(), "_superInterfaces", null);
        setField(term403076, term403076.getClass(), "_bindings", null);
        setField(term403076, term403076.getClass(), "_canonicalName", null);
        setField(term403076, term403076.getClass(), "_class", null);
        setIntField(term403076, term403076.getClass(), "_hash", 0);
        setField(term403076, term403076.getClass(), "_valueHandler", null);
        setField(term403076, term403076.getClass(), "_typeHandler", null);
        setBooleanField(term403076, term403076.getClass(), "_asStatic", false);
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
        args[1] = term402607;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term402345, args);
        assertTrue(recursiveEquals(term402345, term403072));
        assertTrue(recursiveEquals(term402607, null));
    }

};


