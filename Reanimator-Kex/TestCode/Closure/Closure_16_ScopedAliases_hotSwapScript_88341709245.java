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

public class ScopedAliases_hotSwapScript_88341709245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154460;
     Object term154552;
     Object term155676;
     Object term155677;

    public ScopedAliases_hotSwapScript_88341709245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154460 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term154460, term154460.getClass(), "compiler", null);
        term154552 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154644 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154806 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term154898 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term154552, term154552.getClass(), "type", 0);
        setField(term154552, term154552.getClass(), "parent", null);
        setField(term154714, term154714.getClass(), "next", null);
        setIntField(term154714, term154714.getClass(), "type", 37);
        setField(term154806, term154806.getClass(), "next", null);
        setIntField(term154806, term154806.getClass(), "type", 0);
        setField(term154806, term154806.getClass(), "first", null);
        setField(term154714, term154714.getClass(), "first", term154806);
        setField(term154644, term154644.getClass(), "next", term154714);
        setIntField(term154644, term154644.getClass(), "type", 0);
        setField(term154898, term154898.getClass(), "next", null);
        setIntField(term154898, term154898.getClass(), "type", 0);
        setField(term154898, term154898.getClass(), "first", null);
        setField(term154644, term154644.getClass(), "first", term154898);
        setField(term154552, term154552.getClass(), "first", term154644);
        term155676 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term155676, term155676.getClass(), "compiler", null);
        setField(term155676, term155676.getClass(), "preprocessorSymbolTable", null);
        setField(term155676, term155676.getClass(), "transformationHandler", null);
        term155677 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term155678 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term155679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155680 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term155681 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term155677, term155677.getClass(), "number", 0.0);
        setIntField(term155677, term155677.getClass(), "type", 0);
        setField(term155677, term155677.getClass(), "next", null);
        setDoubleField(term155678, term155678.getClass(), "number", 0.0);
        setIntField(term155678, term155678.getClass(), "type", 0);
        setIntField(term155679, term155679.getClass(), "type", 37);
        setField(term155679, term155679.getClass(), "next", null);
        setDoubleField(term155680, term155680.getClass(), "number", 0.0);
        setIntField(term155680, term155680.getClass(), "type", 0);
        setField(term155680, term155680.getClass(), "next", null);
        setField(term155680, term155680.getClass(), "first", null);
        setField(term155680, term155680.getClass(), "last", null);
        setField(term155680, term155680.getClass(), "propListHead", null);
        setIntField(term155680, term155680.getClass(), "sourcePosition", 0);
        setField(term155680, term155680.getClass(), "jsType", null);
        setField(term155680, term155680.getClass(), "parent", null);
        setField(term155679, term155679.getClass(), "first", term155680);
        setField(term155679, term155679.getClass(), "last", null);
        setField(term155679, term155679.getClass(), "propListHead", null);
        setIntField(term155679, term155679.getClass(), "sourcePosition", 0);
        setField(term155679, term155679.getClass(), "jsType", null);
        setField(term155679, term155679.getClass(), "parent", null);
        setField(term155678, term155678.getClass(), "next", term155679);
        setDoubleField(term155681, term155681.getClass(), "number", 0.0);
        setIntField(term155681, term155681.getClass(), "type", 0);
        setField(term155681, term155681.getClass(), "next", null);
        setField(term155681, term155681.getClass(), "first", null);
        setField(term155681, term155681.getClass(), "last", null);
        setField(term155681, term155681.getClass(), "propListHead", null);
        setIntField(term155681, term155681.getClass(), "sourcePosition", 0);
        setField(term155681, term155681.getClass(), "jsType", null);
        setField(term155681, term155681.getClass(), "parent", null);
        setField(term155678, term155678.getClass(), "first", term155681);
        setField(term155678, term155678.getClass(), "last", null);
        setField(term155678, term155678.getClass(), "propListHead", null);
        setIntField(term155678, term155678.getClass(), "sourcePosition", 0);
        setField(term155678, term155678.getClass(), "jsType", null);
        setField(term155678, term155678.getClass(), "parent", null);
        setField(term155677, term155677.getClass(), "first", term155678);
        setField(term155677, term155677.getClass(), "last", null);
        setField(term155677, term155677.getClass(), "propListHead", null);
        setIntField(term155677, term155677.getClass(), "sourcePosition", 0);
        setField(term155677, term155677.getClass(), "jsType", null);
        setField(term155677, term155677.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term154552;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term154460, args);
        assertTrue(recursiveEquals(term154460, term155676));
        assertTrue(recursiveEquals(term154552, term155677));
    }

};


