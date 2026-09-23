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

public class ScopedAliases_process_840655313355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242671;
     Object term242741;
     Object term243558;
     Object term243559;

    public ScopedAliases_process_840655313355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242671 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term242671, term242671.getClass(), "compiler", null);
        term242741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242881 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term242741, term242741.getClass(), "type", 37);
        setField(term242741, term242741.getClass(), "parent", null);
        setField(term242881, term242881.getClass(), "next", null);
        setIntField(term242881, term242881.getClass(), "type", 0);
        setField(term242881, term242881.getClass(), "first", null);
        setField(term242811, term242811.getClass(), "next", term242881);
        setIntField(term242811, term242811.getClass(), "type", 0);
        setField(term242951, term242951.getClass(), "next", null);
        setIntField(term242951, term242951.getClass(), "type", 0);
        setField(term242951, term242951.getClass(), "first", null);
        setField(term242811, term242811.getClass(), "first", term242951);
        setField(term242741, term242741.getClass(), "first", term242811);
        term243558 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term243558, term243558.getClass(), "compiler", null);
        setField(term243558, term243558.getClass(), "preprocessorSymbolTable", null);
        setField(term243558, term243558.getClass(), "transformationHandler", null);
        term243559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term243559, term243559.getClass(), "type", 37);
        setField(term243559, term243559.getClass(), "next", null);
        setIntField(term243560, term243560.getClass(), "type", 0);
        setIntField(term243561, term243561.getClass(), "type", 0);
        setField(term243561, term243561.getClass(), "next", null);
        setField(term243561, term243561.getClass(), "first", null);
        setField(term243561, term243561.getClass(), "last", null);
        setField(term243561, term243561.getClass(), "propListHead", null);
        setIntField(term243561, term243561.getClass(), "sourcePosition", 0);
        setField(term243561, term243561.getClass(), "jsType", null);
        setField(term243561, term243561.getClass(), "parent", null);
        setField(term243560, term243560.getClass(), "next", term243561);
        setIntField(term243562, term243562.getClass(), "type", 0);
        setField(term243562, term243562.getClass(), "next", null);
        setField(term243562, term243562.getClass(), "first", null);
        setField(term243562, term243562.getClass(), "last", null);
        setField(term243562, term243562.getClass(), "propListHead", null);
        setIntField(term243562, term243562.getClass(), "sourcePosition", 0);
        setField(term243562, term243562.getClass(), "jsType", null);
        setField(term243562, term243562.getClass(), "parent", null);
        setField(term243560, term243560.getClass(), "first", term243562);
        setField(term243560, term243560.getClass(), "last", null);
        setField(term243560, term243560.getClass(), "propListHead", null);
        setIntField(term243560, term243560.getClass(), "sourcePosition", 0);
        setField(term243560, term243560.getClass(), "jsType", null);
        setField(term243560, term243560.getClass(), "parent", null);
        setField(term243559, term243559.getClass(), "first", term243560);
        setField(term243559, term243559.getClass(), "last", null);
        setField(term243559, term243559.getClass(), "propListHead", null);
        setIntField(term243559, term243559.getClass(), "sourcePosition", 0);
        setField(term243559, term243559.getClass(), "jsType", null);
        setField(term243559, term243559.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term242741;
        callMethod(klass, "process", argTypes, term242671, args);
        assertTrue(recursiveEquals(term242671, term243558));
        assertTrue(recursiveEquals(term242741, null));
    }

};


