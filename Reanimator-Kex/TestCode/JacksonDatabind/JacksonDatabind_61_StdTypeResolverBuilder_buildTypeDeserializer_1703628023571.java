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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term692343;
     Object term692605;
     Object term693498;
     Object term693502;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term693512 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term693511 = ((Class) term693512).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term693511).setAccessible(true);
        Object enum734 = ((Field) term693511).get((Object) null);
        term692343 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term692343, term692343.getClass(), "_appliesFor", enum734);
        Class<? extends Object> term692761 = Class.forName((String) "java.util.stream.ReduceOps$6ReducingSink");
        term692605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term692725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term692725, term692725.getClass(), "_class", term692761);
        setField(term692605, term692605.getClass(), "_referencedType", term692725);
        Class<? extends Object> term693974 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term693973 = ((Class) term693974).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term693973).setAccessible(true);
        Object enum735 = ((Field) term693973).get((Object) null);
        term693498 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term693498, term693498.getClass(), "_appliesFor", enum735);
        setField(term693498, term693498.getClass(), "_idType", null);
        setField(term693498, term693498.getClass(), "_includeAs", null);
        setField(term693498, term693498.getClass(), "_typeProperty", null);
        setBooleanField(term693498, term693498.getClass(), "_typeIdVisible", false);
        setField(term693498, term693498.getClass(), "_defaultImpl", null);
        setField(term693498, term693498.getClass(), "_customIdResolver", null);
        Class<? extends Object> term693504 = Class.forName((String) "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonNullFormatVisitor$Base");
        term693502 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term693503 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term693503, term693503.getClass(), "_referencedType", null);
        setField(term693503, term693503.getClass(), "_superClass", null);
        setField(term693503, term693503.getClass(), "_superInterfaces", null);
        setField(term693503, term693503.getClass(), "_bindings", null);
        setField(term693503, term693503.getClass(), "_canonicalName", null);
        setField(term693503, term693503.getClass(), "_class", term693504);
        setIntField(term693503, term693503.getClass(), "_hash", 0);
        setField(term693503, term693503.getClass(), "_valueHandler", null);
        setField(term693503, term693503.getClass(), "_typeHandler", null);
        setBooleanField(term693503, term693503.getClass(), "_asStatic", false);
        setField(term693502, term693502.getClass(), "_referencedType", term693503);
        setField(term693502, term693502.getClass(), "_anchorType", null);
        setField(term693502, term693502.getClass(), "_superClass", null);
        setField(term693502, term693502.getClass(), "_superInterfaces", null);
        setField(term693502, term693502.getClass(), "_bindings", null);
        setField(term693502, term693502.getClass(), "_canonicalName", null);
        setField(term693502, term693502.getClass(), "_class", null);
        setIntField(term693502, term693502.getClass(), "_hash", 0);
        setField(term693502, term693502.getClass(), "_valueHandler", null);
        setField(term693502, term693502.getClass(), "_typeHandler", null);
        setBooleanField(term693502, term693502.getClass(), "_asStatic", false);
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
        args[1] = term692605;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term692343, args);
        assertTrue(recursiveEquals(term692343, term693498));
        assertTrue(recursiveEquals(term692605, null));
    }

};


