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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635473;
     Object term635735;
     Object term636930;
     Object term636934;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term636947 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term636946 = ((Class) term636947).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term636946).setAccessible(true);
        Object enum683 = ((Field) term636946).get((Object) null);
        term635473 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term635473, term635473.getClass(), "_appliesFor", enum683);
        Class<? extends Object> term635877 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper");
        term635735 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term635841 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term635841, term635841.getClass(), "_class", term635877);
        setField(term635735, term635735.getClass(), "_referencedType", term635841);
        Class<? extends Object> term637439 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term637438 = ((Class) term637439).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term637438).setAccessible(true);
        Object enum684 = ((Field) term637438).get((Object) null);
        term636930 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term636930, term636930.getClass(), "_appliesFor", enum684);
        setField(term636930, term636930.getClass(), "_idType", null);
        setField(term636930, term636930.getClass(), "_includeAs", null);
        setField(term636930, term636930.getClass(), "_typeProperty", null);
        setBooleanField(term636930, term636930.getClass(), "_typeIdVisible", false);
        setField(term636930, term636930.getClass(), "_defaultImpl", null);
        setField(term636930, term636930.getClass(), "_customIdResolver", null);
        Class<? extends Object> term636936 = Class.forName((String) "com.fasterxml.jackson.databind.DeserializationConfig");
        term636934 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term636935 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term636935, term636935.getClass(), "_elementType", null);
        setField(term636935, term636935.getClass(), "_superClass", null);
        setField(term636935, term636935.getClass(), "_superInterfaces", null);
        setField(term636935, term636935.getClass(), "_bindings", null);
        setField(term636935, term636935.getClass(), "_canonicalName", null);
        setField(term636935, term636935.getClass(), "_class", term636936);
        setIntField(term636935, term636935.getClass(), "_hash", 0);
        setField(term636935, term636935.getClass(), "_valueHandler", null);
        setField(term636935, term636935.getClass(), "_typeHandler", null);
        setBooleanField(term636935, term636935.getClass(), "_asStatic", false);
        setField(term636934, term636934.getClass(), "_referencedType", term636935);
        setField(term636934, term636934.getClass(), "_anchorType", null);
        setField(term636934, term636934.getClass(), "_superClass", null);
        setField(term636934, term636934.getClass(), "_superInterfaces", null);
        setField(term636934, term636934.getClass(), "_bindings", null);
        setField(term636934, term636934.getClass(), "_canonicalName", null);
        setField(term636934, term636934.getClass(), "_class", null);
        setIntField(term636934, term636934.getClass(), "_hash", 0);
        setField(term636934, term636934.getClass(), "_valueHandler", null);
        setField(term636934, term636934.getClass(), "_typeHandler", null);
        setBooleanField(term636934, term636934.getClass(), "_asStatic", false);
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
        args[1] = term635735;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term635473, args);
        assertTrue(recursiveEquals(term635473, term636930));
        assertTrue(recursiveEquals(term635735, null));
    }

};


