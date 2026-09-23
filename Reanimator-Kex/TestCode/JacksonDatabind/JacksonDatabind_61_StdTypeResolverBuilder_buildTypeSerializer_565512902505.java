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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586875;
     Object term587409;
     Object term588484;
     Object term588494;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term588504 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term588503 = ((Class) term588504).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term588503).setAccessible(true);
        Object enum640 = ((Field) term588503).get((Object) null);
        Class<? extends Object> term588844 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term588843 = ((Class) term588844).getDeclaredField((String) "CLASS");
        ((Field) term588843).setAccessible(true);
        Object enum641 = ((Field) term588843).get((Object) null);
        term586875 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term587305 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term586875, term586875.getClass(), "_appliesFor", enum640);
        setField(term586875, term586875.getClass(), "_idType", enum641);
        setField(term586875, term586875.getClass(), "_customIdResolver", term587305);
        Class<? extends Object> term587537 = Class.forName((String) "java.lang.invoke.ResolvedMethodName");
        term587409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term587501 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term587501, term587501.getClass(), "_class", term587537);
        setField(term587409, term587409.getClass(), "_referencedType", term587501);
        Class<? extends Object> term589213 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term589212 = ((Class) term589213).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term589212).setAccessible(true);
        Object enum642 = ((Field) term589212).get((Object) null);
        Class<? extends Object> term589553 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term589552 = ((Class) term589553).getDeclaredField((String) "CLASS");
        ((Field) term589552).setAccessible(true);
        Object enum643 = ((Field) term589552).get((Object) null);
        term588484 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        Object term588493 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term588484, term588484.getClass(), "_appliesFor", enum642);
        setField(term588484, term588484.getClass(), "_idType", enum643);
        setField(term588484, term588484.getClass(), "_includeAs", null);
        setField(term588484, term588484.getClass(), "_typeProperty", null);
        setBooleanField(term588484, term588484.getClass(), "_typeIdVisible", false);
        setField(term588484, term588484.getClass(), "_defaultImpl", null);
        setField(term588493, term588493.getClass(), "_config", null);
        setField(term588493, term588493.getClass(), "_typeToId", null);
        setField(term588493, term588493.getClass(), "_idToType", null);
        setField(term588493, term588493.getClass(), "_typeFactory", null);
        setField(term588493, term588493.getClass(), "_baseType", null);
        setField(term588484, term588484.getClass(), "_customIdResolver", term588493);
        Class<? extends Object> term588496 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer");
        term588494 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term588495 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term588495, term588495.getClass(), "_keyType", null);
        setField(term588495, term588495.getClass(), "_valueType", null);
        setField(term588495, term588495.getClass(), "_superClass", null);
        setField(term588495, term588495.getClass(), "_superInterfaces", null);
        setField(term588495, term588495.getClass(), "_bindings", null);
        setField(term588495, term588495.getClass(), "_canonicalName", null);
        setField(term588495, term588495.getClass(), "_class", term588496);
        setIntField(term588495, term588495.getClass(), "_hash", 0);
        setField(term588495, term588495.getClass(), "_valueHandler", null);
        setField(term588495, term588495.getClass(), "_typeHandler", null);
        setBooleanField(term588495, term588495.getClass(), "_asStatic", false);
        setField(term588494, term588494.getClass(), "_referencedType", term588495);
        setField(term588494, term588494.getClass(), "_anchorType", null);
        setField(term588494, term588494.getClass(), "_superClass", null);
        setField(term588494, term588494.getClass(), "_superInterfaces", null);
        setField(term588494, term588494.getClass(), "_bindings", null);
        setField(term588494, term588494.getClass(), "_canonicalName", null);
        setField(term588494, term588494.getClass(), "_class", null);
        setIntField(term588494, term588494.getClass(), "_hash", 0);
        setField(term588494, term588494.getClass(), "_valueHandler", null);
        setField(term588494, term588494.getClass(), "_typeHandler", null);
        setBooleanField(term588494, term588494.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term587409;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term586875, args);
        assertTrue(recursiveEquals(term586875, term588484));
        assertTrue(recursiveEquals(term587409, null));
    }

};


