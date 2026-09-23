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

public class CheckSideEffects_hotSwapScript_77035414238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16249;
     Object term16319;
     Object term17063;
     Object term17064;

    public CheckSideEffects_hotSwapScript_77035414238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16249 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term16249, term16249.getClass(), "compiler", null);
        term16319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16319, term16319.getClass(), "type", 0);
        setField(term16319, term16319.getClass(), "parent", null);
        setField(term16389, term16389.getClass(), "next", null);
        setIntField(term16389, term16389.getClass(), "type", 0);
        setField(term16389, term16389.getClass(), "first", null);
        setField(term16319, term16319.getClass(), "first", term16389);
        term17063 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term17063, term17063.getClass(), "level", null);
        setField(term17063, term17063.getClass(), "problemNodes", null);
        setField(term17063, term17063.getClass(), "compiler", null);
        setBooleanField(term17063, term17063.getClass(), "protectSideEffectFreeCode", false);
        term17064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17064, term17064.getClass(), "type", 0);
        setField(term17064, term17064.getClass(), "next", null);
        setIntField(term17065, term17065.getClass(), "type", 0);
        setField(term17065, term17065.getClass(), "next", null);
        setField(term17065, term17065.getClass(), "first", null);
        setField(term17065, term17065.getClass(), "last", null);
        setField(term17065, term17065.getClass(), "propListHead", null);
        setIntField(term17065, term17065.getClass(), "sourcePosition", 0);
        setField(term17065, term17065.getClass(), "jsType", null);
        setField(term17065, term17065.getClass(), "parent", null);
        setField(term17064, term17064.getClass(), "first", term17065);
        setField(term17064, term17064.getClass(), "last", null);
        setField(term17064, term17064.getClass(), "propListHead", null);
        setIntField(term17064, term17064.getClass(), "sourcePosition", 0);
        setField(term17064, term17064.getClass(), "jsType", null);
        setField(term17064, term17064.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term16319;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term16249, args);
        assertTrue(recursiveEquals(term16249, term17063));
        assertTrue(recursiveEquals(term16319, term17064));
    }

};


