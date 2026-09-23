package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class TypedScopeCreator_getPrototypePropertyOwner_120862705828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13339;
     Object term14970;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13339, term13339.getClass(), "type", 33);
        setField(term13339, term13339.getClass(), "first", term13409);
        term14970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14970, term14970.getClass(), "type", 33);
        setField(term14970, term14970.getClass(), "next", null);
        setIntField(term14971, term14971.getClass(), "type", 0);
        setField(term14971, term14971.getClass(), "next", null);
        setField(term14971, term14971.getClass(), "first", null);
        setField(term14971, term14971.getClass(), "last", null);
        setField(term14971, term14971.getClass(), "propListHead", null);
        setIntField(term14971, term14971.getClass(), "sourcePosition", 0);
        setField(term14971, term14971.getClass(), "jsType", null);
        setField(term14971, term14971.getClass(), "parent", null);
        setField(term14970, term14970.getClass(), "first", term14971);
        setField(term14970, term14970.getClass(), "last", null);
        setField(term14970, term14970.getClass(), "propListHead", null);
        setIntField(term14970, term14970.getClass(), "sourcePosition", 0);
        setField(term14970, term14970.getClass(), "jsType", null);
        setField(term14970, term14970.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13339;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term13339, term14970));
        assertTrue(recursiveEquals(retValue, null));
    }

};


