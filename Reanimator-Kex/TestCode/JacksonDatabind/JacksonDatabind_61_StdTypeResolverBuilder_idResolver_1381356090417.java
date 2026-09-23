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

public class StdTypeResolverBuilder_idResolver_1381356090417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456302;
     Object term456548;
     Object term456829;
     Object term456833;

    public StdTypeResolverBuilder_idResolver_1381356090417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term456835 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term456834 = ((Class) term456835).getDeclaredField((String) "NONE");
        ((Field) term456834).setAccessible(true);
        Object enum519 = ((Field) term456834).get((Object) null);
        term456302 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term456302, term456302.getClass(), "_customIdResolver", null);
        setField(term456302, term456302.getClass(), "_idType", enum519);
        term456548 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        Class<? extends Object> term457094 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonTypeInfo$Id");
        Field term457093 = ((Class) term457094).getDeclaredField((String) "NONE");
        ((Field) term457093).setAccessible(true);
        Object enum520 = ((Field) term457093).get((Object) null);
        term456829 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        setField(term456829, term456829.getClass(), "_idType", enum520);
        setField(term456829, term456829.getClass(), "_includeAs", null);
        setField(term456829, term456829.getClass(), "_typeProperty", null);
        setBooleanField(term456829, term456829.getClass(), "_typeIdVisible", false);
        setField(term456829, term456829.getClass(), "_defaultImpl", null);
        setField(term456829, term456829.getClass(), "_customIdResolver", null);
        term456833 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term456833, term456833.getClass(), "_filterProvider", null);
        setField(term456833, term456833.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term456833, term456833.getClass(), "_serFeatures", 0);
        setIntField(term456833, term456833.getClass(), "_generatorFeatures", 0);
        setIntField(term456833, term456833.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term456833, term456833.getClass(), "_formatWriteFeatures", 0);
        setIntField(term456833, term456833.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term456833, term456833.getClass(), "_serializationInclusion", null);
        setField(term456833, term456833.getClass(), "_mixIns", null);
        setField(term456833, term456833.getClass(), "_subtypeResolver", null);
        setField(term456833, term456833.getClass(), "_rootName", null);
        setField(term456833, term456833.getClass(), "_view", null);
        setField(term456833, term456833.getClass(), "_attributes", null);
        setField(term456833, term456833.getClass(), "_rootNames", null);
        setField(term456833, term456833.getClass(), "_configOverrides", null);
        setIntField(term456833, term456833.getClass(), "_mapperFeatures", 0);
        setField(term456833, term456833.getClass(), "_base", null);
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
        args[0] = term456548;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        args[4] = false;
        Object retValue = callMethod(klass, "idResolver", argTypes, term456302, args);
        assertTrue(recursiveEquals(term456302, term456829));
        assertTrue(recursiveEquals(term456548, term456833));
        assertTrue(recursiveEquals(retValue, null));
    }

};


