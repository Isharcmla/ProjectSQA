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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602878;
     Object term603140;
     Object term604193;
     Object term604197;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term604207 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term604206 = ((Class) term604207).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term604206).setAccessible(true);
        Object enum656 = ((Field) term604206).get((Object) null);
        term602878 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term602878, term602878.getClass(), "_appliesFor", enum656);
        Class<? extends Object> term603296 = Class.forName((String) "com.fasterxml.jackson.databind.util.RootNameLookup");
        term603140 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term603260 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term603260, term603260.getClass(), "_class", term603296);
        setField(term603140, term603140.getClass(), "_referencedType", term603260);
        Class<? extends Object> term604720 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term604719 = ((Class) term604720).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term604719).setAccessible(true);
        Object enum657 = ((Field) term604719).get((Object) null);
        term604193 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term604193, term604193.getClass(), "_appliesFor", enum657);
        setField(term604193, term604193.getClass(), "_idType", null);
        setField(term604193, term604193.getClass(), "_includeAs", null);
        setField(term604193, term604193.getClass(), "_typeProperty", null);
        setBooleanField(term604193, term604193.getClass(), "_typeIdVisible", false);
        setField(term604193, term604193.getClass(), "_defaultImpl", null);
        setField(term604193, term604193.getClass(), "_customIdResolver", null);
        Class<? extends Object> term604199 = Class.forName((String) "com.fasterxml.jackson.databind.node.BinaryNode");
        term604197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term604198 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term604198, term604198.getClass(), "_referencedType", null);
        setField(term604198, term604198.getClass(), "_superClass", null);
        setField(term604198, term604198.getClass(), "_superInterfaces", null);
        setField(term604198, term604198.getClass(), "_bindings", null);
        setField(term604198, term604198.getClass(), "_canonicalName", null);
        setField(term604198, term604198.getClass(), "_class", term604199);
        setIntField(term604198, term604198.getClass(), "_hash", 0);
        setField(term604198, term604198.getClass(), "_valueHandler", null);
        setField(term604198, term604198.getClass(), "_typeHandler", null);
        setBooleanField(term604198, term604198.getClass(), "_asStatic", false);
        setField(term604197, term604197.getClass(), "_referencedType", term604198);
        setField(term604197, term604197.getClass(), "_anchorType", null);
        setField(term604197, term604197.getClass(), "_superClass", null);
        setField(term604197, term604197.getClass(), "_superInterfaces", null);
        setField(term604197, term604197.getClass(), "_bindings", null);
        setField(term604197, term604197.getClass(), "_canonicalName", null);
        setField(term604197, term604197.getClass(), "_class", null);
        setIntField(term604197, term604197.getClass(), "_hash", 0);
        setField(term604197, term604197.getClass(), "_valueHandler", null);
        setField(term604197, term604197.getClass(), "_typeHandler", null);
        setBooleanField(term604197, term604197.getClass(), "_asStatic", false);
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
        args[1] = term603140;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term602878, args);
        assertTrue(recursiveEquals(term602878, term604193));
        assertTrue(recursiveEquals(term603140, null));
    }

};


