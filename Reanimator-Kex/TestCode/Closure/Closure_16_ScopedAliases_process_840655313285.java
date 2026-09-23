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

public class ScopedAliases_process_840655313285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184438;
     Object term184508;
     Object term185044;
     Object term185045;

    public ScopedAliases_process_840655313285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184438 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term184438, term184438.getClass(), "compiler", null);
        term184508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term184508, term184508.getClass(), "type", 0);
        setIntField(term184578, term184578.getClass(), "type", 0);
        setField(term184578, term184578.getClass(), "parent", term184648);
        setField(term184508, term184508.getClass(), "parent", term184578);
        term185044 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term185044, term185044.getClass(), "compiler", null);
        setField(term185044, term185044.getClass(), "preprocessorSymbolTable", null);
        setField(term185044, term185044.getClass(), "transformationHandler", null);
        term185045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term185046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term185047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term185045, term185045.getClass(), "type", 0);
        setField(term185045, term185045.getClass(), "next", null);
        setField(term185045, term185045.getClass(), "first", null);
        setField(term185045, term185045.getClass(), "last", null);
        setField(term185045, term185045.getClass(), "propListHead", null);
        setIntField(term185045, term185045.getClass(), "sourcePosition", 0);
        setField(term185045, term185045.getClass(), "jsType", null);
        setIntField(term185046, term185046.getClass(), "type", 0);
        setField(term185046, term185046.getClass(), "next", null);
        setField(term185046, term185046.getClass(), "first", null);
        setField(term185046, term185046.getClass(), "last", null);
        setField(term185046, term185046.getClass(), "propListHead", null);
        setIntField(term185046, term185046.getClass(), "sourcePosition", 0);
        setField(term185046, term185046.getClass(), "jsType", null);
        setIntField(term185047, term185047.getClass(), "type", 0);
        setField(term185047, term185047.getClass(), "next", null);
        setField(term185047, term185047.getClass(), "first", null);
        setField(term185047, term185047.getClass(), "last", null);
        setField(term185047, term185047.getClass(), "propListHead", null);
        setIntField(term185047, term185047.getClass(), "sourcePosition", 0);
        setField(term185047, term185047.getClass(), "jsType", null);
        setField(term185047, term185047.getClass(), "parent", null);
        setField(term185046, term185046.getClass(), "parent", term185047);
        setField(term185045, term185045.getClass(), "parent", term185046);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term184508;
        callMethod(klass, "process", argTypes, term184438, args);
        assertTrue(recursiveEquals(term184438, term185044));
        assertTrue(recursiveEquals(term184508, null));
    }

};


