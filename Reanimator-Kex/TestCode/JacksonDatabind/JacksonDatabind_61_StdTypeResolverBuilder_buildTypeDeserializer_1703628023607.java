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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737811;
     Object term738073;
     Object term738890;
     Object term738894;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term738904 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term738903 = ((Class) term738904).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term738903).setAccessible(true);
        Object enum779 = ((Field) term738903).get((Object) null);
        term737811 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term737811, term737811.getClass(), "_appliesFor", enum779);
        Class<? extends Object> term738201 = Class.forName((String) "java.util.concurrent.CancellationException");
        term738073 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term738165 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term738165, term738165.getClass(), "_class", term738201);
        setField(term738073, term738073.getClass(), "_referencedType", term738165);
        Class<? extends Object> term739372 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term739371 = ((Class) term739372).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term739371).setAccessible(true);
        Object enum780 = ((Field) term739371).get((Object) null);
        term738890 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term738890, term738890.getClass(), "_appliesFor", enum780);
        setField(term738890, term738890.getClass(), "_idType", null);
        setField(term738890, term738890.getClass(), "_includeAs", null);
        setField(term738890, term738890.getClass(), "_typeProperty", null);
        setBooleanField(term738890, term738890.getClass(), "_typeIdVisible", false);
        setField(term738890, term738890.getClass(), "_defaultImpl", null);
        setField(term738890, term738890.getClass(), "_customIdResolver", null);
        Class<? extends Object> term738896 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler");
        term738894 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term738895 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term738895, term738895.getClass(), "_keyType", null);
        setField(term738895, term738895.getClass(), "_valueType", null);
        setField(term738895, term738895.getClass(), "_superClass", null);
        setField(term738895, term738895.getClass(), "_superInterfaces", null);
        setField(term738895, term738895.getClass(), "_bindings", null);
        setField(term738895, term738895.getClass(), "_canonicalName", null);
        setField(term738895, term738895.getClass(), "_class", term738896);
        setIntField(term738895, term738895.getClass(), "_hash", 0);
        setField(term738895, term738895.getClass(), "_valueHandler", null);
        setField(term738895, term738895.getClass(), "_typeHandler", null);
        setBooleanField(term738895, term738895.getClass(), "_asStatic", false);
        setField(term738894, term738894.getClass(), "_referencedType", term738895);
        setField(term738894, term738894.getClass(), "_anchorType", null);
        setField(term738894, term738894.getClass(), "_superClass", null);
        setField(term738894, term738894.getClass(), "_superInterfaces", null);
        setField(term738894, term738894.getClass(), "_bindings", null);
        setField(term738894, term738894.getClass(), "_canonicalName", null);
        setField(term738894, term738894.getClass(), "_class", null);
        setIntField(term738894, term738894.getClass(), "_hash", 0);
        setField(term738894, term738894.getClass(), "_valueHandler", null);
        setField(term738894, term738894.getClass(), "_typeHandler", null);
        setBooleanField(term738894, term738894.getClass(), "_asStatic", false);
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
        args[1] = term738073;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term737811, args);
        assertTrue(recursiveEquals(term737811, term738890));
        assertTrue(recursiveEquals(term738073, null));
    }

};


