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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590878;
     Object term591140;
     Object term592319;
     Object term592323;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term592333 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term592332 = ((Class) term592333).getDeclaredField((String) "NON_FINAL");
        ((Field) term592332).setAccessible(true);
        Object enum645 = ((Field) term592332).get((Object) null);
        term590878 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term590878, term590878.getClass(), "_appliesFor", enum645);
        Class<? extends Object> term591268 = Class.forName((String) "java.util.concurrent.SubmissionPublisher$BufferedSubscription");
        term591140 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term591232 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term591232, term591232.getClass(), "_class", term591268);
        setField(term591140, term591140.getClass(), "_referencedType", term591232);
        Class<? extends Object> term592837 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term592836 = ((Class) term592837).getDeclaredField((String) "NON_FINAL");
        ((Field) term592836).setAccessible(true);
        Object enum646 = ((Field) term592836).get((Object) null);
        term592319 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term592319, term592319.getClass(), "_appliesFor", enum646);
        setField(term592319, term592319.getClass(), "_idType", null);
        setField(term592319, term592319.getClass(), "_includeAs", null);
        setField(term592319, term592319.getClass(), "_typeProperty", null);
        setBooleanField(term592319, term592319.getClass(), "_typeIdVisible", false);
        setField(term592319, term592319.getClass(), "_defaultImpl", null);
        setField(term592319, term592319.getClass(), "_customIdResolver", null);
        Class<? extends Object> term592325 = Class.forName((String) "com.fasterxml.jackson.databind.node.ShortNode");
        term592323 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term592324 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term592324, term592324.getClass(), "_keyType", null);
        setField(term592324, term592324.getClass(), "_valueType", null);
        setField(term592324, term592324.getClass(), "_superClass", null);
        setField(term592324, term592324.getClass(), "_superInterfaces", null);
        setField(term592324, term592324.getClass(), "_bindings", null);
        setField(term592324, term592324.getClass(), "_canonicalName", null);
        setField(term592324, term592324.getClass(), "_class", term592325);
        setIntField(term592324, term592324.getClass(), "_hash", 0);
        setField(term592324, term592324.getClass(), "_valueHandler", null);
        setField(term592324, term592324.getClass(), "_typeHandler", null);
        setBooleanField(term592324, term592324.getClass(), "_asStatic", false);
        setField(term592323, term592323.getClass(), "_referencedType", term592324);
        setField(term592323, term592323.getClass(), "_anchorType", null);
        setField(term592323, term592323.getClass(), "_superClass", null);
        setField(term592323, term592323.getClass(), "_superInterfaces", null);
        setField(term592323, term592323.getClass(), "_bindings", null);
        setField(term592323, term592323.getClass(), "_canonicalName", null);
        setField(term592323, term592323.getClass(), "_class", null);
        setIntField(term592323, term592323.getClass(), "_hash", 0);
        setField(term592323, term592323.getClass(), "_valueHandler", null);
        setField(term592323, term592323.getClass(), "_typeHandler", null);
        setBooleanField(term592323, term592323.getClass(), "_asStatic", false);
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
        args[1] = term591140;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term590878, args);
        assertTrue(recursiveEquals(term590878, term592319));
        assertTrue(recursiveEquals(term591140, null));
    }

};


