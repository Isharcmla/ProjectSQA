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

public class ScopedAliases_hotSwapScript_88341709164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91671;
     Object term91763;
     Object term92933;
     Object term92934;

    public ScopedAliases_hotSwapScript_88341709164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91671 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term91671, term91671.getClass(), "compiler", null);
        term91763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term91947 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92039 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term91763, term91763.getClass(), "type", 0);
        setField(term91763, term91763.getClass(), "parent", null);
        setField(term91947, term91947.getClass(), "next", null);
        setIntField(term91947, term91947.getClass(), "type", 0);
        setField(term91947, term91947.getClass(), "first", null);
        setField(term91855, term91855.getClass(), "next", term91947);
        setIntField(term91855, term91855.getClass(), "type", 0);
        setField(term92039, term92039.getClass(), "next", null);
        setIntField(term92039, term92039.getClass(), "type", 0);
        setField(term92039, term92039.getClass(), "first", null);
        setField(term91855, term91855.getClass(), "first", term92039);
        setField(term91763, term91763.getClass(), "first", term91855);
        term92933 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term92933, term92933.getClass(), "compiler", null);
        setField(term92933, term92933.getClass(), "preprocessorSymbolTable", null);
        setField(term92933, term92933.getClass(), "transformationHandler", null);
        term92934 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92935 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term92937 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term92934, term92934.getClass(), "number", 0.0);
        setIntField(term92934, term92934.getClass(), "type", 0);
        setField(term92934, term92934.getClass(), "next", null);
        setDoubleField(term92935, term92935.getClass(), "number", 0.0);
        setIntField(term92935, term92935.getClass(), "type", 0);
        setDoubleField(term92936, term92936.getClass(), "number", 0.0);
        setIntField(term92936, term92936.getClass(), "type", 0);
        setField(term92936, term92936.getClass(), "next", null);
        setField(term92936, term92936.getClass(), "first", null);
        setField(term92936, term92936.getClass(), "last", null);
        setField(term92936, term92936.getClass(), "propListHead", null);
        setIntField(term92936, term92936.getClass(), "sourcePosition", 0);
        setField(term92936, term92936.getClass(), "jsType", null);
        setField(term92936, term92936.getClass(), "parent", null);
        setField(term92935, term92935.getClass(), "next", term92936);
        setDoubleField(term92937, term92937.getClass(), "number", 0.0);
        setIntField(term92937, term92937.getClass(), "type", 0);
        setField(term92937, term92937.getClass(), "next", null);
        setField(term92937, term92937.getClass(), "first", null);
        setField(term92937, term92937.getClass(), "last", null);
        setField(term92937, term92937.getClass(), "propListHead", null);
        setIntField(term92937, term92937.getClass(), "sourcePosition", 0);
        setField(term92937, term92937.getClass(), "jsType", null);
        setField(term92937, term92937.getClass(), "parent", null);
        setField(term92935, term92935.getClass(), "first", term92937);
        setField(term92935, term92935.getClass(), "last", null);
        setField(term92935, term92935.getClass(), "propListHead", null);
        setIntField(term92935, term92935.getClass(), "sourcePosition", 0);
        setField(term92935, term92935.getClass(), "jsType", null);
        setField(term92935, term92935.getClass(), "parent", null);
        setField(term92934, term92934.getClass(), "first", term92935);
        setField(term92934, term92934.getClass(), "last", null);
        setField(term92934, term92934.getClass(), "propListHead", null);
        setIntField(term92934, term92934.getClass(), "sourcePosition", 0);
        setField(term92934, term92934.getClass(), "jsType", null);
        setField(term92934, term92934.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term91763;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term91671, args);
        assertTrue(recursiveEquals(term91671, term92933));
        assertTrue(recursiveEquals(term91763, term92934));
    }

};


