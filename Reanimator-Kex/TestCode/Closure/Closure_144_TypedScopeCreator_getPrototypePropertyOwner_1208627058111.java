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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53478;
     Object term53485;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53478 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term53485 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term53485, term53485.getClass(), "number", 0.0);
        setIntField(term53485, term53485.getClass(), "type", 0);
        setField(term53485, term53485.getClass(), "next", null);
        setField(term53485, term53485.getClass(), "first", null);
        setField(term53485, term53485.getClass(), "last", null);
        setField(term53485, term53485.getClass(), "propListHead", null);
        setIntField(term53485, term53485.getClass(), "sourcePosition", 0);
        setField(term53485, term53485.getClass(), "jsType", null);
        setField(term53485, term53485.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53478;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term53478, term53485));
        assertTrue(recursiveEquals(retValue, null));
    }

};


