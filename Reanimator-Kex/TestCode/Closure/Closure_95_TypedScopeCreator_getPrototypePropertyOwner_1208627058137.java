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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93732;
     Object term94722;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93732 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term94722 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term94722, term94722.getClass(), "str", null);
        setIntField(term94722, term94722.getClass(), "type", 0);
        setField(term94722, term94722.getClass(), "next", null);
        setField(term94722, term94722.getClass(), "first", null);
        setField(term94722, term94722.getClass(), "last", null);
        setField(term94722, term94722.getClass(), "propListHead", null);
        setIntField(term94722, term94722.getClass(), "sourcePosition", 0);
        setField(term94722, term94722.getClass(), "jsType", null);
        setField(term94722, term94722.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term93732;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term93732, term94722));
        assertTrue(recursiveEquals(retValue, null));
    }

};


