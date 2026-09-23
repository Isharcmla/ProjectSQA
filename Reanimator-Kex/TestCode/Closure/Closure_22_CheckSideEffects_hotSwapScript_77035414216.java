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

public class CheckSideEffects_hotSwapScript_77035414216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7860;
     Object term7930;
     Object term8249;
     Object term8250;

    public CheckSideEffects_hotSwapScript_77035414216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7860 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term7860, term7860.getClass(), "compiler", null);
        term7930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7930, term7930.getClass(), "type", 0);
        setField(term7930, term7930.getClass(), "parent", null);
        setField(term8000, term8000.getClass(), "next", null);
        setIntField(term8000, term8000.getClass(), "type", 115);
        setField(term8070, term8070.getClass(), "next", null);
        setIntField(term8070, term8070.getClass(), "type", 0);
        setField(term8070, term8070.getClass(), "first", null);
        setField(term8000, term8000.getClass(), "first", term8070);
        setField(term7930, term7930.getClass(), "first", term8000);
        term8249 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term8249, term8249.getClass(), "level", null);
        setField(term8249, term8249.getClass(), "problemNodes", null);
        setField(term8249, term8249.getClass(), "compiler", null);
        setBooleanField(term8249, term8249.getClass(), "protectSideEffectFreeCode", false);
        term8250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term8250, term8250.getClass(), "type", 0);
        setField(term8250, term8250.getClass(), "next", null);
        setIntField(term8251, term8251.getClass(), "type", 115);
        setField(term8251, term8251.getClass(), "next", null);
        setIntField(term8252, term8252.getClass(), "type", 0);
        setField(term8252, term8252.getClass(), "next", null);
        setField(term8252, term8252.getClass(), "first", null);
        setField(term8252, term8252.getClass(), "last", null);
        setField(term8252, term8252.getClass(), "propListHead", null);
        setIntField(term8252, term8252.getClass(), "sourcePosition", 0);
        setField(term8252, term8252.getClass(), "jsType", null);
        setField(term8252, term8252.getClass(), "parent", null);
        setField(term8251, term8251.getClass(), "first", term8252);
        setField(term8251, term8251.getClass(), "last", null);
        setField(term8251, term8251.getClass(), "propListHead", null);
        setIntField(term8251, term8251.getClass(), "sourcePosition", 0);
        setField(term8251, term8251.getClass(), "jsType", null);
        setField(term8251, term8251.getClass(), "parent", null);
        setField(term8250, term8250.getClass(), "first", term8251);
        setField(term8250, term8250.getClass(), "last", null);
        setField(term8250, term8250.getClass(), "propListHead", null);
        setIntField(term8250, term8250.getClass(), "sourcePosition", 0);
        setField(term8250, term8250.getClass(), "jsType", null);
        setField(term8250, term8250.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term7930;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term7860, args);
        assertTrue(recursiveEquals(term7860, term8249));
        assertTrue(recursiveEquals(term7930, term8250));
    }

};


