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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512678;
     Object term512940;
     Object term514577;
     Object term514581;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term514584 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term514583 = ((Class) term514584).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term514583).setAccessible(true);
        Object enum573 = ((Field) term514583).get((Object) null);
        term512678 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term512678, term512678.getClass(), "_appliesFor", enum573);
        term512940 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term513036 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term512940, term512940.getClass(), "_referencedType", term513036);
        Class<? extends Object> term514945 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term514944 = ((Class) term514945).getDeclaredField((String) "NON_CONCRETE_AND_ARRAYS");
        ((Field) term514944).setAccessible(true);
        Object enum574 = ((Field) term514944).get((Object) null);
        term514577 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term514577, term514577.getClass(), "_appliesFor", enum574);
        setField(term514577, term514577.getClass(), "_idType", null);
        setField(term514577, term514577.getClass(), "_includeAs", null);
        setField(term514577, term514577.getClass(), "_typeProperty", null);
        setBooleanField(term514577, term514577.getClass(), "_typeIdVisible", false);
        setField(term514577, term514577.getClass(), "_defaultImpl", null);
        setField(term514577, term514577.getClass(), "_customIdResolver", null);
        term514581 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term514582 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term514582, term514582.getClass(), "_componentType", null);
        setField(term514582, term514582.getClass(), "_emptyArray", null);
        setField(term514582, term514582.getClass(), "_superClass", null);
        setField(term514582, term514582.getClass(), "_superInterfaces", null);
        setField(term514582, term514582.getClass(), "_bindings", null);
        setField(term514582, term514582.getClass(), "_canonicalName", null);
        setField(term514582, term514582.getClass(), "_class", null);
        setIntField(term514582, term514582.getClass(), "_hash", 0);
        setField(term514582, term514582.getClass(), "_valueHandler", null);
        setField(term514582, term514582.getClass(), "_typeHandler", null);
        setBooleanField(term514582, term514582.getClass(), "_asStatic", false);
        setField(term514581, term514581.getClass(), "_referencedType", term514582);
        setField(term514581, term514581.getClass(), "_anchorType", null);
        setField(term514581, term514581.getClass(), "_superClass", null);
        setField(term514581, term514581.getClass(), "_superInterfaces", null);
        setField(term514581, term514581.getClass(), "_bindings", null);
        setField(term514581, term514581.getClass(), "_canonicalName", null);
        setField(term514581, term514581.getClass(), "_class", null);
        setIntField(term514581, term514581.getClass(), "_hash", 0);
        setField(term514581, term514581.getClass(), "_valueHandler", null);
        setField(term514581, term514581.getClass(), "_typeHandler", null);
        setBooleanField(term514581, term514581.getClass(), "_asStatic", false);
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
        args[1] = term512940;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term512678, args);
        assertTrue(recursiveEquals(term512678, term514577));
        assertTrue(recursiveEquals(term512940, null));
    }

};


