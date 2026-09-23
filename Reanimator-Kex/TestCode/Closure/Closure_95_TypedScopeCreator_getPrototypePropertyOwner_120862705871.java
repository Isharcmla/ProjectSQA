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

public class TypedScopeCreator_getPrototypePropertyOwner_120862705871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43059;
     Object term43146;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43059, term43059.getClass(), "type", 33);
        setField(term43059, term43059.getClass(), "first", term43129);
        term43146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term43146, term43146.getClass(), "type", 33);
        setField(term43146, term43146.getClass(), "next", null);
        setIntField(term43147, term43147.getClass(), "type", 0);
        setField(term43147, term43147.getClass(), "next", null);
        setField(term43147, term43147.getClass(), "first", null);
        setField(term43147, term43147.getClass(), "last", null);
        setField(term43147, term43147.getClass(), "propListHead", null);
        setIntField(term43147, term43147.getClass(), "sourcePosition", 0);
        setField(term43147, term43147.getClass(), "jsType", null);
        setField(term43147, term43147.getClass(), "parent", null);
        setField(term43146, term43146.getClass(), "first", term43147);
        setField(term43146, term43146.getClass(), "last", null);
        setField(term43146, term43146.getClass(), "propListHead", null);
        setIntField(term43146, term43146.getClass(), "sourcePosition", 0);
        setField(term43146, term43146.getClass(), "jsType", null);
        setField(term43146, term43146.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term43059;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term43059, term43146));
        assertTrue(recursiveEquals(retValue, null));
    }

};


