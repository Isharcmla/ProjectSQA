package com.fasterxml.jackson.databind.type;

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
import static com.fasterxml.jackson.databind.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.type.EqualityUtils.*;
import java.lang.Object;

public class MapLikeType_init_181397313557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7460;
     Object term7467;
     Object term7468;

    public MapLikeType_init_181397313557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7360 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term7460 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term7467 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term7467, term7467.getClass(), "_keyType", null);
        setField(term7467, term7467.getClass(), "_valueType", null);
        setField(term7467, term7467.getClass(), "_superClass", null);
        setField(term7467, term7467.getClass(), "_superInterfaces", null);
        setField(term7467, term7467.getClass(), "_bindings", null);
        setField(term7467, term7467.getClass(), "_canonicalName", null);
        setField(term7467, term7467.getClass(), "_class", null);
        setIntField(term7467, term7467.getClass(), "_hash", 0);
        setField(term7467, term7467.getClass(), "_valueHandler", null);
        setField(term7467, term7467.getClass(), "_typeHandler", null);
        setBooleanField(term7467, term7467.getClass(), "_asStatic", false);
        term7468 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term7468, term7468.getClass(), "_keyType", null);
        setField(term7468, term7468.getClass(), "_valueType", null);
        setField(term7468, term7468.getClass(), "_superClass", null);
        setField(term7468, term7468.getClass(), "_superInterfaces", null);
        setField(term7468, term7468.getClass(), "_bindings", null);
        setField(term7468, term7468.getClass(), "_canonicalName", null);
        setField(term7468, term7468.getClass(), "_class", null);
        setIntField(term7468, term7468.getClass(), "_hash", 0);
        setField(term7468, term7468.getClass(), "_valueHandler", null);
        setField(term7468, term7468.getClass(), "_typeHandler", null);
        setBooleanField(term7468, term7468.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term7460;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7467));
        assertTrue(recursiveEquals(term7460, term7468));
    }

};


