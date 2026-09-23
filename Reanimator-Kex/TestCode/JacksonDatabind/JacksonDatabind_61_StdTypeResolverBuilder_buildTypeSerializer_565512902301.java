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

public class StdTypeResolverBuilder_buildTypeSerializer_565512902301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319534;
     Object term319788;
     Object term320195;
     Object term320199;

    public StdTypeResolverBuilder_buildTypeSerializer_565512902301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term320201 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term320200 = ((Class) term320201).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term320200).setAccessible(true);
        Object enum372 = ((Field) term320200).get((Object) null);
        term319534 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term319534, term319534.getClass(), "_appliesFor", enum372);
        term319788 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Class<? extends Object> term320562 = Class.forName((String) "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping");
        Field term320561 = ((Class) term320562).getDeclaredField((String) "OBJECT_AND_NON_CONCRETE");
        ((Field) term320561).setAccessible(true);
        Object enum373 = ((Field) term320561).get((Object) null);
        term320195 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper$DefaultTypeResolverBuilder"));
        setField(term320195, term320195.getClass(), "_appliesFor", enum373);
        setField(term320195, term320195.getClass(), "_idType", null);
        setField(term320195, term320195.getClass(), "_includeAs", null);
        setField(term320195, term320195.getClass(), "_typeProperty", null);
        setBooleanField(term320195, term320195.getClass(), "_typeIdVisible", false);
        setField(term320195, term320195.getClass(), "_defaultImpl", null);
        setField(term320195, term320195.getClass(), "_customIdResolver", null);
        term320199 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term320199, term320199.getClass(), "_componentType", null);
        setField(term320199, term320199.getClass(), "_emptyArray", null);
        setField(term320199, term320199.getClass(), "_superClass", null);
        setField(term320199, term320199.getClass(), "_superInterfaces", null);
        setField(term320199, term320199.getClass(), "_bindings", null);
        setField(term320199, term320199.getClass(), "_canonicalName", null);
        setField(term320199, term320199.getClass(), "_class", null);
        setIntField(term320199, term320199.getClass(), "_hash", 0);
        setField(term320199, term320199.getClass(), "_valueHandler", null);
        setField(term320199, term320199.getClass(), "_typeHandler", null);
        setBooleanField(term320199, term320199.getClass(), "_asStatic", false);
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
        args[1] = term319788;
        args[2] = null;
        callMethod(klass, "buildTypeSerializer", argTypes, term319534, args);
        assertTrue(recursiveEquals(term319534, term320195));
        assertTrue(recursiveEquals(term319788, null));
    }

};


