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

public class CheckSideEffects_process_152266774614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7107;
     Object term7177;
     Object term7251;
     Object term7252;

    public CheckSideEffects_process_152266774614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7107 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term7107, term7107.getClass(), "compiler", null);
        term7177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7177, term7177.getClass(), "type", 0);
        setField(term7177, term7177.getClass(), "parent", null);
        setField(term7177, term7177.getClass(), "first", null);
        term7251 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term7251, term7251.getClass(), "level", null);
        setField(term7251, term7251.getClass(), "problemNodes", null);
        setField(term7251, term7251.getClass(), "compiler", null);
        setBooleanField(term7251, term7251.getClass(), "protectSideEffectFreeCode", false);
        term7252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7252, term7252.getClass(), "type", 0);
        setField(term7252, term7252.getClass(), "next", null);
        setField(term7252, term7252.getClass(), "first", null);
        setField(term7252, term7252.getClass(), "last", null);
        setField(term7252, term7252.getClass(), "propListHead", null);
        setIntField(term7252, term7252.getClass(), "sourcePosition", 0);
        setField(term7252, term7252.getClass(), "jsType", null);
        setField(term7252, term7252.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term7177;
        callMethod(klass, "process", argTypes, term7107, args);
        assertTrue(recursiveEquals(term7107, term7251));
        assertTrue(recursiveEquals(term7177, null));
    }

};


