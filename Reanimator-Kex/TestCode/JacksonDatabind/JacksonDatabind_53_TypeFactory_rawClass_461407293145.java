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

public class TypeFactory_rawClass_461407293145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17569;
     Object term18933;

    public TypeFactory_rawClass_461407293145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17569 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term18933 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term18933, term18933.getClass(), "_elementType", null);
        setField(term18933, term18933.getClass(), "_superClass", null);
        setField(term18933, term18933.getClass(), "_superInterfaces", null);
        setField(term18933, term18933.getClass(), "_bindings", null);
        setField(term18933, term18933.getClass(), "_canonicalName", null);
        setField(term18933, term18933.getClass(), "_class", null);
        setIntField(term18933, term18933.getClass(), "_hash", 0);
        setField(term18933, term18933.getClass(), "_valueHandler", null);
        setField(term18933, term18933.getClass(), "_typeHandler", null);
        setBooleanField(term18933, term18933.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term17569;
        Object retValue = callMethod(klass, "rawClass", argTypes, null, args);
        assertTrue(recursiveEquals(term17569, term18933));
        assertTrue(recursiveEquals(retValue, null));
    }

};


