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

public class StdTypeResolverBuilder_buildTypeDeserializer_1703628023361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388742;
     Object term389766;
     Object term389757;

    public StdTypeResolverBuilder_buildTypeDeserializer_1703628023361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term389777 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term389776 = ((Class) term389777).getDeclaredField((String) "NAME");
        ((Field) term389776).setAccessible(true);
        Object enum451 = ((Field) term389776).get((Object) null);
        Class<? extends Object> term390036 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term390035 = ((Class) term390036).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term390035).setAccessible(true);
        Object enum452 = ((Field) term390035).get((Object) null);
        term388742 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term389014 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term388742, term388742.getClass(), "_idType", enum451);
        setField(term388742, term388742.getClass(), "_customIdResolver", term389014);
        setField(term388742, term388742.getClass(), "_defaultImpl", null);
        setField(term388742, term388742.getClass(), "_includeAs", enum452);
        Class<? extends Object> term390325 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term390324 = ((Class) term390325).getDeclaredField((String) "NAME");
        ((Field) term390324).setAccessible(true);
        Object enum453 = ((Field) term390324).get((Object) null);
        Class<? extends Object> term390584 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term390583 = ((Class) term390584).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term390583).setAccessible(true);
        Object enum454 = ((Field) term390583).get((Object) null);
        term389766 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term389775 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term389766, term389766.getClass(), "_idType", enum453);
        setField(term389766, term389766.getClass(), "_includeAs", enum454);
        setField(term389766, term389766.getClass(), "_typeProperty", null);
        setBooleanField(term389766, term389766.getClass(), "_typeIdVisible", false);
        setField(term389766, term389766.getClass(), "_defaultImpl", null);
        setField(term389775, term389775.getClass(), "_config", null);
        setField(term389775, term389775.getClass(), "_typeToId", null);
        setField(term389775, term389775.getClass(), "_idToType", null);
        setField(term389775, term389775.getClass(), "_typeFactory", null);
        setField(term389775, term389775.getClass(), "_baseType", null);
        setField(term389766, term389766.getClass(), "_customIdResolver", term389775);
        term389757 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term389741 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        Object term389761 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term389741, term389741.getClass(), "_config", null);
        setField(term389741, term389741.getClass(), "_typeToId", null);
        setField(term389741, term389741.getClass(), "_idToType", null);
        setField(term389741, term389741.getClass(), "_typeFactory", null);
        setField(term389741, term389741.getClass(), "_baseType", null);
        setField(term389757, term389757.getClass(), "_idResolver", term389741);
        setField(term389757, term389757.getClass(), "_baseType", null);
        setField(term389757, term389757.getClass(), "_property", null);
        setField(term389757, term389757.getClass(), "_defaultImpl", null);
        setField(term389757, term389757.getClass(), "_typePropertyName", "");
        setBooleanField(term389757, term389757.getClass(), "_typeIdVisible", false);
        setField(term389761, term389761.getClass(), "table", null);
        setField(term389761, term389761.getClass(), "nextTable", null);
        setLongField(term389761, term389761.getClass(), "baseCount", 0L);
        setIntField(term389761, term389761.getClass(), "sizeCtl", 32);
        setIntField(term389761, term389761.getClass(), "transferIndex", 0);
        setIntField(term389761, term389761.getClass(), "cellsBusy", 0);
        setField(term389761, term389761.getClass(), "counterCells", null);
        setField(term389761, term389761.getClass(), "keySet", null);
        setField(term389761, term389761.getClass(), "values", null);
        setField(term389761, term389761.getClass(), "entrySet", null);
        setField(term389761, term389761.getClass(), "keySet", null);
        setField(term389761, term389761.getClass(), "values", null);
        setField(term389757, term389757.getClass(), "_deserializers", term389761);
        setField(term389757, term389757.getClass(), "_defaultImplDeserializer", null);
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
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term388742, args);
        assertTrue(recursiveEquals(term388742, term389766));
        assertTrue(recursiveEquals(retValue, term389757));
    }

};


