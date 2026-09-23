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

public class CheckSideEffects_process_152266774626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12037;
     Object term12107;
     Object term12292;
     Object term12293;

    public CheckSideEffects_process_152266774626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12037 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term12037, term12037.getClass(), "compiler", null);
        term12107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12107, term12107.getClass(), "type", 0);
        setField(term12107, term12107.getClass(), "parent", null);
        setField(term12177, term12177.getClass(), "next", null);
        setIntField(term12177, term12177.getClass(), "type", 0);
        setField(term12177, term12177.getClass(), "first", null);
        setField(term12107, term12107.getClass(), "first", term12177);
        term12292 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term12292, term12292.getClass(), "level", null);
        setField(term12292, term12292.getClass(), "problemNodes", null);
        setField(term12292, term12292.getClass(), "compiler", null);
        setBooleanField(term12292, term12292.getClass(), "protectSideEffectFreeCode", false);
        term12293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12293, term12293.getClass(), "type", 0);
        setField(term12293, term12293.getClass(), "next", null);
        setIntField(term12294, term12294.getClass(), "type", 0);
        setField(term12294, term12294.getClass(), "next", null);
        setField(term12294, term12294.getClass(), "first", null);
        setField(term12294, term12294.getClass(), "last", null);
        setField(term12294, term12294.getClass(), "propListHead", null);
        setIntField(term12294, term12294.getClass(), "sourcePosition", 0);
        setField(term12294, term12294.getClass(), "jsType", null);
        setField(term12294, term12294.getClass(), "parent", null);
        setField(term12293, term12293.getClass(), "first", term12294);
        setField(term12293, term12293.getClass(), "last", null);
        setField(term12293, term12293.getClass(), "propListHead", null);
        setIntField(term12293, term12293.getClass(), "sourcePosition", 0);
        setField(term12293, term12293.getClass(), "jsType", null);
        setField(term12293, term12293.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12107;
        callMethod(klass, "process", argTypes, term12037, args);
        assertTrue(recursiveEquals(term12037, term12292));
        assertTrue(recursiveEquals(term12107, null));
    }

};


