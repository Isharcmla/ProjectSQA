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

public class StdTypeResolverBuilder_buildTypeDeserializer_170362802392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65579;
     Object term67640;
     Object term67631;

    public StdTypeResolverBuilder_buildTypeDeserializer_170362802392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67651 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term67650 = ((Class) term67651).getDeclaredField((String) "NAME");
        ((Field) term67650).setAccessible(true);
        Object enum102 = ((Field) term67650).get((Object) null);
        Class<? extends Object> term67910 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term67909 = ((Class) term67910).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term67909).setAccessible(true);
        Object enum103 = ((Field) term67909).get((Object) null);
        term65579 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term65867 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term65579, term65579.getClass(), "_idType", enum102);
        setField(term65579, term65579.getClass(), "_customIdResolver", term65867);
        setField(term65579, term65579.getClass(), "_defaultImpl", null);
        setField(term65579, term65579.getClass(), "_includeAs", enum103);
        Class<? extends Object> term68199 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term68198 = ((Class) term68199).getDeclaredField((String) "NAME");
        ((Field) term68198).setAccessible(true);
        Object enum104 = ((Field) term68198).get((Object) null);
        Class<? extends Object> term68458 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$As");
        Field term68457 = ((Class) term68458).getDeclaredField((String) "WRAPPER_OBJECT");
        ((Field) term68457).setAccessible(true);
        Object enum105 = ((Field) term68457).get((Object) null);
        term67640 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term67649 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        setField(term67640, term67640.getClass(), "_idType", enum104);
        setField(term67640, term67640.getClass(), "_includeAs", enum105);
        setField(term67640, term67640.getClass(), "_typeProperty", null);
        setBooleanField(term67640, term67640.getClass(), "_typeIdVisible", false);
        setField(term67640, term67640.getClass(), "_defaultImpl", null);
        setField(term67649, term67649.getClass(), "_basePackageName", null);
        setField(term67649, term67649.getClass(), "_basePackagePrefix", null);
        setField(term67649, term67649.getClass(), "_typeFactory", null);
        setField(term67649, term67649.getClass(), "_baseType", null);
        setField(term67640, term67640.getClass(), "_customIdResolver", term67649);
        term67631 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer"));
        Object term67615 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver"));
        Object term67635 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term67615, term67615.getClass(), "_basePackageName", null);
        setField(term67615, term67615.getClass(), "_basePackagePrefix", null);
        setField(term67615, term67615.getClass(), "_typeFactory", null);
        setField(term67615, term67615.getClass(), "_baseType", null);
        setField(term67631, term67631.getClass(), "_idResolver", term67615);
        setField(term67631, term67631.getClass(), "_baseType", null);
        setField(term67631, term67631.getClass(), "_property", null);
        setField(term67631, term67631.getClass(), "_defaultImpl", null);
        setField(term67631, term67631.getClass(), "_typePropertyName", "");
        setBooleanField(term67631, term67631.getClass(), "_typeIdVisible", false);
        setField(term67635, term67635.getClass(), "table", null);
        setField(term67635, term67635.getClass(), "nextTable", null);
        setLongField(term67635, term67635.getClass(), "baseCount", 0L);
        setIntField(term67635, term67635.getClass(), "sizeCtl", 32);
        setIntField(term67635, term67635.getClass(), "transferIndex", 0);
        setIntField(term67635, term67635.getClass(), "cellsBusy", 0);
        setField(term67635, term67635.getClass(), "counterCells", null);
        setField(term67635, term67635.getClass(), "keySet", null);
        setField(term67635, term67635.getClass(), "values", null);
        setField(term67635, term67635.getClass(), "entrySet", null);
        setField(term67635, term67635.getClass(), "keySet", null);
        setField(term67635, term67635.getClass(), "values", null);
        setField(term67631, term67631.getClass(), "_deserializers", term67635);
        setField(term67631, term67631.getClass(), "_defaultImplDeserializer", null);
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
        Object retValue = callMethod(klass, "buildTypeDeserializer", argTypes, term65579, args);
        assertTrue(recursiveEquals(term65579, term67640));
        assertTrue(recursiveEquals(retValue, term67631));
    }

};


