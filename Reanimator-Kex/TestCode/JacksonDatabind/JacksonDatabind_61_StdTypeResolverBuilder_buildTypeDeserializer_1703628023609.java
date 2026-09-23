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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740684;
     Object term740946;
     Object term741540;
     Object term741544;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term741548 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term741547 = ((Class) term741548).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term741547).setAccessible(true);
        Object enum782 = ((Field) term741547).get((Object) null);
        term740684 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term740684, term740684.getClass(), "_appliesFor", enum782);
        term740946 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term741050 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term741164 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term741050, term741050.getClass(), "_referencedType", term741164);
        setField(term740946, term740946.getClass(), "_referencedType", term741050);
        Class<? extends Object> term741888 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term741887 = ((Class) term741888).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term741887).setAccessible(true);
        Object enum783 = ((Field) term741887).get((Object) null);
        term741540 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term741540, term741540.getClass(), "_appliesFor", enum783);
        setField(term741540, term741540.getClass(), "_idType", null);
        setField(term741540, term741540.getClass(), "_includeAs", null);
        setField(term741540, term741540.getClass(), "_typeProperty", null);
        setBooleanField(term741540, term741540.getClass(), "_typeIdVisible", false);
        setField(term741540, term741540.getClass(), "_defaultImpl", null);
        setField(term741540, term741540.getClass(), "_customIdResolver", null);
        term741544 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term741545 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term741546 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term741546, term741546.getClass(), "_elementType", null);
        setField(term741546, term741546.getClass(), "_superClass", null);
        setField(term741546, term741546.getClass(), "_superInterfaces", null);
        setField(term741546, term741546.getClass(), "_bindings", null);
        setField(term741546, term741546.getClass(), "_canonicalName", null);
        setField(term741546, term741546.getClass(), "_class", null);
        setIntField(term741546, term741546.getClass(), "_hash", 0);
        setField(term741546, term741546.getClass(), "_valueHandler", null);
        setField(term741546, term741546.getClass(), "_typeHandler", null);
        setBooleanField(term741546, term741546.getClass(), "_asStatic", false);
        setField(term741545, term741545.getClass(), "_referencedType", term741546);
        setField(term741545, term741545.getClass(), "_anchorType", null);
        setField(term741545, term741545.getClass(), "_superClass", null);
        setField(term741545, term741545.getClass(), "_superInterfaces", null);
        setField(term741545, term741545.getClass(), "_bindings", null);
        setField(term741545, term741545.getClass(), "_canonicalName", null);
        setField(term741545, term741545.getClass(), "_class", null);
        setIntField(term741545, term741545.getClass(), "_hash", 0);
        setField(term741545, term741545.getClass(), "_valueHandler", null);
        setField(term741545, term741545.getClass(), "_typeHandler", null);
        setBooleanField(term741545, term741545.getClass(), "_asStatic", false);
        setField(term741544, term741544.getClass(), "_referencedType", term741545);
        setField(term741544, term741544.getClass(), "_anchorType", null);
        setField(term741544, term741544.getClass(), "_superClass", null);
        setField(term741544, term741544.getClass(), "_superInterfaces", null);
        setField(term741544, term741544.getClass(), "_bindings", null);
        setField(term741544, term741544.getClass(), "_canonicalName", null);
        setField(term741544, term741544.getClass(), "_class", null);
        setIntField(term741544, term741544.getClass(), "_hash", 0);
        setField(term741544, term741544.getClass(), "_valueHandler", null);
        setField(term741544, term741544.getClass(), "_typeHandler", null);
        setBooleanField(term741544, term741544.getClass(), "_asStatic", false);
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
        args[1] = term740946;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term740684, args);
        assertTrue(recursiveEquals(term740684, term741540));
        assertTrue(recursiveEquals(term740946, null));
    }

};


