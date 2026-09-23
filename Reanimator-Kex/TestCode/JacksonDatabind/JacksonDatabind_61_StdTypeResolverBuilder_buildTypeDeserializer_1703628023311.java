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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331613;
     Object term331891;
     Object term332557;
     Object term332561;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term332582 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term332581 = ((Class) term332582).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term332581).setAccessible(true);
        Object enum383 = ((Field) term332581).get((Object) null);
        term331613 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term331613, term331613.getClass(), "_appliesFor", enum383);
        Class<? extends Object> term331927 = Class.forName((String) "java.util.stream.ReduceOps$6ReducingSink");
        term331891 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term331891, term331891.getClass(), "_class", term331927);
        Class<? extends Object> term333044 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term333043 = ((Class) term333044).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term333043).setAccessible(true);
        Object enum384 = ((Field) term333043).get((Object) null);
        term332557 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term332557, term332557.getClass(), "_appliesFor", enum384);
        setField(term332557, term332557.getClass(), "_idType", null);
        setField(term332557, term332557.getClass(), "_includeAs", null);
        setField(term332557, term332557.getClass(), "_typeProperty", null);
        setBooleanField(term332557, term332557.getClass(), "_typeIdVisible", false);
        setField(term332557, term332557.getClass(), "_defaultImpl", null);
        setField(term332557, term332557.getClass(), "_customIdResolver", null);
        Class<? extends Object> term332562 = Class.forName((String) "com.fasterxml.jackson.databind.node.FloatNode");
        term332561 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term332561, term332561.getClass(), "_referencedType", null);
        setField(term332561, term332561.getClass(), "_superClass", null);
        setField(term332561, term332561.getClass(), "_superInterfaces", null);
        setField(term332561, term332561.getClass(), "_bindings", null);
        setField(term332561, term332561.getClass(), "_canonicalName", null);
        setField(term332561, term332561.getClass(), "_class", term332562);
        setIntField(term332561, term332561.getClass(), "_hash", 0);
        setField(term332561, term332561.getClass(), "_valueHandler", null);
        setField(term332561, term332561.getClass(), "_typeHandler", null);
        setBooleanField(term332561, term332561.getClass(), "_asStatic", false);
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
        args[1] = term331891;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term331613, args);
        assertTrue(recursiveEquals(term331613, term332557));
        assertTrue(recursiveEquals(term331891, null));
    }

};


