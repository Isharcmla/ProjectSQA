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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446977;
     Object term447239;
     Object term448059;
     Object term448063;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term448073 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term448072 = ((Class) term448073).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term448072).setAccessible(true);
        Object enum511 = ((Field) term448072).get((Object) null);
        term446977 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term446977, term446977.getClass(), "_appliesFor", enum511);
        Class<? extends Object> term447367 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        term447239 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term447331 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term447331, term447331.getClass(), "_class", term447367);
        setField(term447239, term447239.getClass(), "_referencedType", term447331);
        Class<? extends Object> term448571 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term448570 = ((Class) term448571).getDeclaredField((String) "JAVA_LANG_OBJECT");
        ((Field) term448570).setAccessible(true);
        Object enum512 = ((Field) term448570).get((Object) null);
        term448059 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term448059, term448059.getClass(), "_appliesFor", enum512);
        setField(term448059, term448059.getClass(), "_idType", null);
        setField(term448059, term448059.getClass(), "_includeAs", null);
        setField(term448059, term448059.getClass(), "_typeProperty", null);
        setBooleanField(term448059, term448059.getClass(), "_typeIdVisible", false);
        setField(term448059, term448059.getClass(), "_defaultImpl", null);
        setField(term448059, term448059.getClass(), "_customIdResolver", null);
        Class<? extends Object> term448065 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator");
        term448063 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term448064 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term448064, term448064.getClass(), "_keyType", null);
        setField(term448064, term448064.getClass(), "_valueType", null);
        setField(term448064, term448064.getClass(), "_superClass", null);
        setField(term448064, term448064.getClass(), "_superInterfaces", null);
        setField(term448064, term448064.getClass(), "_bindings", null);
        setField(term448064, term448064.getClass(), "_canonicalName", null);
        setField(term448064, term448064.getClass(), "_class", term448065);
        setIntField(term448064, term448064.getClass(), "_hash", 0);
        setField(term448064, term448064.getClass(), "_valueHandler", null);
        setField(term448064, term448064.getClass(), "_typeHandler", null);
        setBooleanField(term448064, term448064.getClass(), "_asStatic", false);
        setField(term448063, term448063.getClass(), "_referencedType", term448064);
        setField(term448063, term448063.getClass(), "_anchorType", null);
        setField(term448063, term448063.getClass(), "_superClass", null);
        setField(term448063, term448063.getClass(), "_superInterfaces", null);
        setField(term448063, term448063.getClass(), "_bindings", null);
        setField(term448063, term448063.getClass(), "_canonicalName", null);
        setField(term448063, term448063.getClass(), "_class", null);
        setIntField(term448063, term448063.getClass(), "_hash", 0);
        setField(term448063, term448063.getClass(), "_valueHandler", null);
        setField(term448063, term448063.getClass(), "_typeHandler", null);
        setBooleanField(term448063, term448063.getClass(), "_asStatic", false);
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
        args[1] = term447239;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term446977, args);
        assertTrue(recursiveEquals(term446977, term448059));
        assertTrue(recursiveEquals(term447239, null));
    }

};


