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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254904;
     Object term255182;
     Object term256204;
     Object term256208;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term256229 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term256228 = ((Class) term256229).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term256228).setAccessible(true);
        Object enum314 = ((Field) term256228).get((Object) null);
        term254904 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term254904, term254904.getClass(), "_appliesFor", enum314);
        Class<? extends Object> term255218 = Class.forName((String) "java.nio.channels.AlreadyConnectedException");
        term255182 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term255182, term255182.getClass(), "_class", term255218);
        Class<? extends Object> term256721 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term256720 = ((Class) term256721).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term256720).setAccessible(true);
        Object enum315 = ((Field) term256720).get((Object) null);
        term256204 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term256204, term256204.getClass(), "_appliesFor", enum315);
        setField(term256204, term256204.getClass(), "_idType", null);
        setField(term256204, term256204.getClass(), "_includeAs", null);
        setField(term256204, term256204.getClass(), "_typeProperty", null);
        setBooleanField(term256204, term256204.getClass(), "_typeIdVisible", false);
        setField(term256204, term256204.getClass(), "_defaultImpl", null);
        setField(term256204, term256204.getClass(), "_customIdResolver", null);
        Class<? extends Object> term256209 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer");
        term256208 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term256208, term256208.getClass(), "_referencedType", null);
        setField(term256208, term256208.getClass(), "_superClass", null);
        setField(term256208, term256208.getClass(), "_superInterfaces", null);
        setField(term256208, term256208.getClass(), "_bindings", null);
        setField(term256208, term256208.getClass(), "_canonicalName", null);
        setField(term256208, term256208.getClass(), "_class", term256209);
        setIntField(term256208, term256208.getClass(), "_hash", 0);
        setField(term256208, term256208.getClass(), "_valueHandler", null);
        setField(term256208, term256208.getClass(), "_typeHandler", null);
        setBooleanField(term256208, term256208.getClass(), "_asStatic", false);
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
        args[1] = term255182;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term254904, args);
        assertTrue(recursiveEquals(term254904, term256204));
        assertTrue(recursiveEquals(term255182, null));
    }

};


