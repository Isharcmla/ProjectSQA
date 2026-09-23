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
import java.lang.Object;

public class TypedScopeCreator_createScope_265732215124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54728;
     Object term54900;
     Object term55206;

    public TypedScopeCreator_createScope_265732215124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54728 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term54808 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term54808, term54808.getClass(), "phaseOptimizer", null);
        setField(term54728, term54728.getClass(), "compiler", term54808);
        term54900 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term54992 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54900, term54900.getClass(), "type", 0);
        setIntField(term54992, term54992.getClass(), "type", 0);
        setField(term54992, term54992.getClass(), "parent", null);
        setField(term54900, term54900.getClass(), "parent", term54992);
        setField(term55062, term55062.getClass(), "next", term55132);
        setIntField(term55062, term55062.getClass(), "type", 39);
        setField(term55062, term55062.getClass(), "first", null);
        setField(term54900, term54900.getClass(), "first", term55062);
        term55206 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term55206, term55206.getClass(), "rootNode", null);
        setIntField(term55206, term55206.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term54900;
        args[1] = term55206;
        callMethod(klass, "createScope", argTypes, term54728, args);
    }

};


