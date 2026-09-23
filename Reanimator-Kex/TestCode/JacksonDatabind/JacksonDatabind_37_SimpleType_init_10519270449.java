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

public class SimpleType_init_10519270449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7765;
     Object term9848;
     Object term9849;

    public SimpleType_init_10519270449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7667 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term7765 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term9848 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term9848, term9848.getClass(), "_superClass", null);
        setField(term9848, term9848.getClass(), "_superInterfaces", null);
        setField(term9848, term9848.getClass(), "_bindings", null);
        setField(term9848, term9848.getClass(), "_canonicalName", null);
        setField(term9848, term9848.getClass(), "_class", null);
        setIntField(term9848, term9848.getClass(), "_hash", 0);
        setField(term9848, term9848.getClass(), "_valueHandler", null);
        setField(term9848, term9848.getClass(), "_typeHandler", null);
        setBooleanField(term9848, term9848.getClass(), "_asStatic", false);
        term9849 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        setField(term9849, term9849.getClass(), "_superClass", null);
        setField(term9849, term9849.getClass(), "_superInterfaces", null);
        setField(term9849, term9849.getClass(), "_bindings", null);
        setField(term9849, term9849.getClass(), "_canonicalName", null);
        setField(term9849, term9849.getClass(), "_class", null);
        setIntField(term9849, term9849.getClass(), "_hash", 0);
        setField(term9849, term9849.getClass(), "_valueHandler", null);
        setField(term9849, term9849.getClass(), "_typeHandler", null);
        setBooleanField(term9849, term9849.getClass(), "_asStatic", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.type.SimpleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.type.TypeBase");
        Object[] args = new Object[1];
        args[0] = term7765;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9848));
        assertTrue(recursiveEquals(term7765, term9849));
    }

};


