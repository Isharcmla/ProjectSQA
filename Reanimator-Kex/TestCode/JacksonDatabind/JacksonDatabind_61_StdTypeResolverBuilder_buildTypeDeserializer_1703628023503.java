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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582230;
     Object term582632;
     Object term584227;
     Object term584236;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term584246 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term584245 = ((Class) term584246).getDeclaredField((String) "NON_FINAL");
        ((Field) term584245).setAccessible(true);
        Object enum634 = ((Field) term584245).get((Object) null);
        Class<? extends Object> term584565 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term584564 = ((Class) term584565).getDeclaredField((String) "NAME");
        ((Field) term584564).setAccessible(true);
        Object enum635 = ((Field) term584564).get((Object) null);
        term582230 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term582230, term582230.getClass(), "_appliesFor", enum634);
        setField(term582230, term582230.getClass(), "_idType", enum635);
        setField(term582230, term582230.getClass(), "_customIdResolver", null);
        Class<? extends Object> term582760 = Class.forName((String) "java.util.Spliterators$DoubleArraySpliterator");
        term582632 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term582724 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term582724, term582724.getClass(), "_class", term582760);
        setField(term582632, term582632.getClass(), "_referencedType", term582724);
        Class<? extends Object> term584961 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term584960 = ((Class) term584961).getDeclaredField((String) "NON_FINAL");
        ((Field) term584960).setAccessible(true);
        Object enum636 = ((Field) term584960).get((Object) null);
        Class<? extends Object> term585280 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term585279 = ((Class) term585280).getDeclaredField((String) "NAME");
        ((Field) term585279).setAccessible(true);
        Object enum637 = ((Field) term585279).get((Object) null);
        term584227 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term584227, term584227.getClass(), "_appliesFor", enum636);
        setField(term584227, term584227.getClass(), "_idType", enum637);
        setField(term584227, term584227.getClass(), "_includeAs", null);
        setField(term584227, term584227.getClass(), "_typeProperty", null);
        setBooleanField(term584227, term584227.getClass(), "_typeIdVisible", false);
        setField(term584227, term584227.getClass(), "_defaultImpl", null);
        setField(term584227, term584227.getClass(), "_customIdResolver", null);
        Class<? extends Object> term584238 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer");
        term584236 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term584237 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term584237, term584237.getClass(), "_keyType", null);
        setField(term584237, term584237.getClass(), "_valueType", null);
        setField(term584237, term584237.getClass(), "_superClass", null);
        setField(term584237, term584237.getClass(), "_superInterfaces", null);
        setField(term584237, term584237.getClass(), "_bindings", null);
        setField(term584237, term584237.getClass(), "_canonicalName", null);
        setField(term584237, term584237.getClass(), "_class", term584238);
        setIntField(term584237, term584237.getClass(), "_hash", 0);
        setField(term584237, term584237.getClass(), "_valueHandler", null);
        setField(term584237, term584237.getClass(), "_typeHandler", null);
        setBooleanField(term584237, term584237.getClass(), "_asStatic", false);
        setField(term584236, term584236.getClass(), "_referencedType", term584237);
        setField(term584236, term584236.getClass(), "_anchorType", null);
        setField(term584236, term584236.getClass(), "_superClass", null);
        setField(term584236, term584236.getClass(), "_superInterfaces", null);
        setField(term584236, term584236.getClass(), "_bindings", null);
        setField(term584236, term584236.getClass(), "_canonicalName", null);
        setField(term584236, term584236.getClass(), "_class", null);
        setIntField(term584236, term584236.getClass(), "_hash", 0);
        setField(term584236, term584236.getClass(), "_valueHandler", null);
        setField(term584236, term584236.getClass(), "_typeHandler", null);
        setBooleanField(term584236, term584236.getClass(), "_asStatic", false);
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
        args[1] = term582632;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term582230, args);
        assertTrue(recursiveEquals(term582230, term584227));
        assertTrue(recursiveEquals(term582632, null));
    }

};


