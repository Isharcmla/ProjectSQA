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

public class MapLikeType_upgradeFrom_122037128264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8485;
     Object term9190;
     Object term9181;

    public MapLikeType_upgradeFrom_122037128264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8485 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term9190 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term9190, term9190.getClass(), "_superClass", null);
        setField(term9190, term9190.getClass(), "_superInterfaces", null);
        setField(term9190, term9190.getClass(), "_bindings", null);
        setField(term9190, term9190.getClass(), "_canonicalName", null);
        setField(term9190, term9190.getClass(), "_class", null);
        setIntField(term9190, term9190.getClass(), "_hash", 0);
        setField(term9190, term9190.getClass(), "_valueHandler", null);
        setField(term9190, term9190.getClass(), "_typeHandler", null);
        setBooleanField(term9190, term9190.getClass(), "_asStatic", false);
        term9181 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term9181, term9181.getClass(), "_keyType", null);
        setField(term9181, term9181.getClass(), "_valueType", null);
        setField(term9181, term9181.getClass(), "_superClass", null);
        setField(term9181, term9181.getClass(), "_superInterfaces", null);
        setField(term9181, term9181.getClass(), "_bindings", null);
        setField(term9181, term9181.getClass(), "_canonicalName", null);
        setField(term9181, term9181.getClass(), "_class", null);
        setIntField(term9181, term9181.getClass(), "_hash", 0);
        setField(term9181, term9181.getClass(), "_valueHandler", null);
        setField(term9181, term9181.getClass(), "_typeHandler", null);
        setBooleanField(term9181, term9181.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.MapLikeType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[3];
        args[0] = term8485;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "upgradeFrom", argTypes, null, args);
        assertTrue(recursiveEquals(term8485, null));
        assertTrue(recursiveEquals(retValue, term9181));
    }

};


