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

public class TypeFactory_rawClass_461407293137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16462;
     Object term18268;

    public TypeFactory_rawClass_461407293137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16462 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term18268 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term18268, term18268.getClass(), "_componentType", null);
        setField(term18268, term18268.getClass(), "_emptyArray", null);
        setField(term18268, term18268.getClass(), "_canonicalName", null);
        setField(term18268, term18268.getClass(), "_class", null);
        setIntField(term18268, term18268.getClass(), "_hash", 0);
        setField(term18268, term18268.getClass(), "_valueHandler", null);
        setField(term18268, term18268.getClass(), "_typeHandler", null);
        setBooleanField(term18268, term18268.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.TypeFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[1];
        args[0] = term16462;
        Object retValue = callMethod(klass, "rawClass", argTypes, null, args);
        assertTrue(recursiveEquals(term16462, term18268));
        assertTrue(recursiveEquals(retValue, null));
    }

};


