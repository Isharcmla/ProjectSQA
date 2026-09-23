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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494921;
     Object term495183;
     Object term495704;
     Object term495708;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term495711 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term495710 = ((Class) term495711).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term495710).setAccessible(true);
        Object enum555 = ((Field) term495710).get((Object) null);
        term494921 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term494921, term494921.getClass(), "_appliesFor", enum555);
        term495183 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term495279 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term495183, term495183.getClass(), "_referencedType", term495279);
        Class<? extends Object> term496072 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term496071 = ((Class) term496072).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term496071).setAccessible(true);
        Object enum556 = ((Field) term496071).get((Object) null);
        term495704 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term495704, term495704.getClass(), "_appliesFor", enum556);
        setField(term495704, term495704.getClass(), "_idType", null);
        setField(term495704, term495704.getClass(), "_includeAs", null);
        setField(term495704, term495704.getClass(), "_typeProperty", null);
        setBooleanField(term495704, term495704.getClass(), "_typeIdVisible", false);
        setField(term495704, term495704.getClass(), "_defaultImpl", null);
        setField(term495704, term495704.getClass(), "_customIdResolver", null);
        term495708 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term495709 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term495709, term495709.getClass(), "_componentType", null);
        setField(term495709, term495709.getClass(), "_emptyArray", null);
        setField(term495709, term495709.getClass(), "_superClass", null);
        setField(term495709, term495709.getClass(), "_superInterfaces", null);
        setField(term495709, term495709.getClass(), "_bindings", null);
        setField(term495709, term495709.getClass(), "_canonicalName", null);
        setField(term495709, term495709.getClass(), "_class", null);
        setIntField(term495709, term495709.getClass(), "_hash", 0);
        setField(term495709, term495709.getClass(), "_valueHandler", null);
        setField(term495709, term495709.getClass(), "_typeHandler", null);
        setBooleanField(term495709, term495709.getClass(), "_asStatic", false);
        setField(term495708, term495708.getClass(), "_referencedType", term495709);
        setField(term495708, term495708.getClass(), "_anchorType", null);
        setField(term495708, term495708.getClass(), "_superClass", null);
        setField(term495708, term495708.getClass(), "_superInterfaces", null);
        setField(term495708, term495708.getClass(), "_bindings", null);
        setField(term495708, term495708.getClass(), "_canonicalName", null);
        setField(term495708, term495708.getClass(), "_class", null);
        setIntField(term495708, term495708.getClass(), "_hash", 0);
        setField(term495708, term495708.getClass(), "_valueHandler", null);
        setField(term495708, term495708.getClass(), "_typeHandler", null);
        setBooleanField(term495708, term495708.getClass(), "_asStatic", false);
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
        args[1] = term495183;
        args[2] = null;
        callMethod(klass, "buildTypeDeserializer", argTypes, term494921, args);
        assertTrue(recursiveEquals(term494921, term495704));
        assertTrue(recursiveEquals(term495183, null));
    }

};


