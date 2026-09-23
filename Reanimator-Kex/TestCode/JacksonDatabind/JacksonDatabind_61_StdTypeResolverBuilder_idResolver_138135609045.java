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
import java.lang.Object;

public class StdTypeResolverBuilder_idResolver_138135609045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16232;
     Object term16371;
     Object term16366;

    public StdTypeResolverBuilder_idResolver_138135609045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16232 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term16364 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term16232, term16232.getClass(), "_customIdResolver", term16364);
        term16371 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder"));
        Object term16372 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term16371, term16371.getClass(), "_idType", null);
        setField(term16371, term16371.getClass(), "_includeAs", null);
        setField(term16371, term16371.getClass(), "_typeProperty", null);
        setBooleanField(term16371, term16371.getClass(), "_typeIdVisible", false);
        setField(term16371, term16371.getClass(), "_defaultImpl", null);
        setField(term16372, term16372.getClass(), "_config", null);
        setField(term16372, term16372.getClass(), "_typeToId", null);
        setField(term16372, term16372.getClass(), "_idToType", null);
        setField(term16372, term16372.getClass(), "_typeFactory", null);
        setField(term16372, term16372.getClass(), "_baseType", null);
        setField(term16371, term16371.getClass(), "_customIdResolver", term16372);
        term16366 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.TypeNameIdResolver"));
        setField(term16366, term16366.getClass(), "_config", null);
        setField(term16366, term16366.getClass(), "_typeToId", null);
        setField(term16366, term16366.getClass(), "_idToType", null);
        setField(term16366, term16366.getClass(), "_typeFactory", null);
        setField(term16366, term16366.getClass(), "_baseType", null);
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
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        args[4] = false;
        Object retValue = callMethod(klass, "idResolver", argTypes, term16232, args);
        assertTrue(recursiveEquals(term16232, term16371));
        assertTrue(recursiveEquals(retValue, term16366));
    }

};


