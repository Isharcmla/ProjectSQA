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
import java.lang.String;

public class ReferenceType_construct_816666245104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31471;
     Object term31585;
     Object term31754;
     Object term31755;

    public ReferenceType_construct_816666245104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31471 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        term31585 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setIntField(term31585, term31585.getClass(), "_hash", 0);
        term31754 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        setField(term31754, term31754.getClass(), "_elementType", null);
        setField(term31754, term31754.getClass(), "_superClass", null);
        setField(term31754, term31754.getClass(), "_superInterfaces", null);
        setField(term31754, term31754.getClass(), "_bindings", null);
        setField(term31754, term31754.getClass(), "_canonicalName", null);
        setField(term31754, term31754.getClass(), "_class", null);
        setIntField(term31754, term31754.getClass(), "_hash", 0);
        setField(term31754, term31754.getClass(), "_valueHandler", null);
        setField(term31754, term31754.getClass(), "_typeHandler", null);
        setBooleanField(term31754, term31754.getClass(), "_asStatic", false);
        term31755 = Class.forName((String) "kex.sun.misc.FloatConsts");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.ReferenceType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.type.TypeBindings");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Array.newInstance(Class.forName("com.fasterxml.jackson.databind.JavaType"), 0).getClass();
        argTypes[4] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        Object[] args = new Object[5];
        args[0] = term31471;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term31585;
        callMethod(klass, "construct", argTypes, null, args);
        assertTrue(recursiveEquals(term31471, term31754));
        assertTrue(recursiveEquals(term31585, null));
    }

};


