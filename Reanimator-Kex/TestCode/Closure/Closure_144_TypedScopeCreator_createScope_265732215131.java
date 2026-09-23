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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65598;
     Object term65690;
     Object term65948;

    public TypedScopeCreator_createScope_265732215131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65598 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term65598, term65598.getClass(), "compiler", null);
        term65690 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65874 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term65690, term65690.getClass(), "jsType", null);
        setIntField(term65690, term65690.getClass(), "type", 0);
        setField(term65782, term65782.getClass(), "next", term65874);
        setIntField(term65782, term65782.getClass(), "type", 120);
        setField(term65690, term65690.getClass(), "first", term65782);
        term65948 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term66062 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term65948, term65948.getClass(), "rootNode", null);
        setField(term65948, term65948.getClass(), "thisType", term66062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term65690;
        args[1] = term65948;
        try {
            callMethod(klass, "createScope", argTypes, term65598, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


