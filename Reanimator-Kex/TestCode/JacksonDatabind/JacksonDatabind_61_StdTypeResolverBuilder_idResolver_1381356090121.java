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

public class StdTypeResolverBuilder_idResolver_1381356090121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95813;
     Object term96059;
     Object term96380;
     Object term96384;

    public StdTypeResolverBuilder_idResolver_1381356090121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term96386 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term96385 = ((Class) term96386).getDeclaredField((String) "NONE");
        ((Field) term96385).setAccessible(true);
        Object enum151 = ((Field) term96385).get((Object) null);
        term95813 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term95813, term95813.getClass(), "_customIdResolver", null);
        setField(term95813, term95813.getClass(), "_idType", enum151);
        term96059 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Class<? extends Object> term96645 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term96644 = ((Class) term96645).getDeclaredField((String) "NONE");
        ((Field) term96644).setAccessible(true);
        Object enum152 = ((Field) term96644).get((Object) null);
        term96380 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term96380, term96380.getClass(), "_idType", enum152);
        setField(term96380, term96380.getClass(), "_includeAs", null);
        setField(term96380, term96380.getClass(), "_typeProperty", null);
        setBooleanField(term96380, term96380.getClass(), "_typeIdVisible", false);
        setField(term96380, term96380.getClass(), "_defaultImpl", null);
        setField(term96380, term96380.getClass(), "_customIdResolver", null);
        term96384 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term96384, term96384.getClass(), "_filterProvider", null);
        setField(term96384, term96384.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term96384, term96384.getClass(), "_serFeatures", 0);
        setIntField(term96384, term96384.getClass(), "_generatorFeatures", 0);
        setIntField(term96384, term96384.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term96384, term96384.getClass(), "_formatWriteFeatures", 0);
        setIntField(term96384, term96384.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term96384, term96384.getClass(), "_serializationInclusion", null);
        setField(term96384, term96384.getClass(), "_mixIns", null);
        setField(term96384, term96384.getClass(), "_subtypeResolver", null);
        setField(term96384, term96384.getClass(), "_rootName", null);
        setField(term96384, term96384.getClass(), "_view", null);
        setField(term96384, term96384.getClass(), "_attributes", null);
        setField(term96384, term96384.getClass(), "_rootNames", null);
        setField(term96384, term96384.getClass(), "_configOverrides", null);
        setIntField(term96384, term96384.getClass(), "_mapperFeatures", 0);
        setField(term96384, term96384.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.MapperConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.util.Collection");
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = term96059;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        args[4] = false;
        Object retValue = callMethod(klass, "idResolver", argTypes, term95813, args);
        assertTrue(recursiveEquals(term95813, term96380));
        assertTrue(recursiveEquals(term96059, term96384));
        assertTrue(recursiveEquals(retValue, null));
    }

};


