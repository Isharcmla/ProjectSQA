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

public class TypedScopeCreator_createScope_265732215111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46009;
     Object term46101;
     Object term46267;

    public TypedScopeCreator_createScope_265732215111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46009 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term46009, term46009.getClass(), "compiler", null);
        term46101 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term46193 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term46101, term46101.getClass(), "type", 0);
        setIntField(term46193, term46193.getClass(), "type", 132);
        setField(term46101, term46101.getClass(), "parent", term46193);
        term46267 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term46337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46267, term46267.getClass(), "rootNode", term46337);
        setIntField(term46267, term46267.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term46101;
        args[1] = term46267;
        try {
            callMethod(klass, "createScope", argTypes, term46009, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


