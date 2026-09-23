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

public class ScopedAliases_hotSwapScript_8834170929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12915;
     Object term12985;
     Object term13678;
     Object term13679;

    public ScopedAliases_hotSwapScript_8834170929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12915 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term12915, term12915.getClass(), "compiler", null);
        term12985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12985, term12985.getClass(), "type", 0);
        setField(term12985, term12985.getClass(), "parent", null);
        setField(term13125, term13125.getClass(), "next", null);
        setIntField(term13125, term13125.getClass(), "type", 0);
        setField(term13125, term13125.getClass(), "first", null);
        setField(term13055, term13055.getClass(), "next", term13125);
        setIntField(term13055, term13055.getClass(), "type", 0);
        setField(term13195, term13195.getClass(), "next", null);
        setIntField(term13195, term13195.getClass(), "type", 0);
        setField(term13195, term13195.getClass(), "first", null);
        setField(term13055, term13055.getClass(), "first", term13195);
        setField(term12985, term12985.getClass(), "first", term13055);
        term13678 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term13678, term13678.getClass(), "compiler", null);
        setField(term13678, term13678.getClass(), "preprocessorSymbolTable", null);
        setField(term13678, term13678.getClass(), "transformationHandler", null);
        term13679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13679, term13679.getClass(), "type", 0);
        setField(term13679, term13679.getClass(), "next", null);
        setIntField(term13680, term13680.getClass(), "type", 0);
        setIntField(term13681, term13681.getClass(), "type", 0);
        setField(term13681, term13681.getClass(), "next", null);
        setField(term13681, term13681.getClass(), "first", null);
        setField(term13681, term13681.getClass(), "last", null);
        setField(term13681, term13681.getClass(), "propListHead", null);
        setIntField(term13681, term13681.getClass(), "sourcePosition", 0);
        setField(term13681, term13681.getClass(), "jsType", null);
        setField(term13681, term13681.getClass(), "parent", null);
        setField(term13680, term13680.getClass(), "next", term13681);
        setIntField(term13682, term13682.getClass(), "type", 0);
        setField(term13682, term13682.getClass(), "next", null);
        setField(term13682, term13682.getClass(), "first", null);
        setField(term13682, term13682.getClass(), "last", null);
        setField(term13682, term13682.getClass(), "propListHead", null);
        setIntField(term13682, term13682.getClass(), "sourcePosition", 0);
        setField(term13682, term13682.getClass(), "jsType", null);
        setField(term13682, term13682.getClass(), "parent", null);
        setField(term13680, term13680.getClass(), "first", term13682);
        setField(term13680, term13680.getClass(), "last", null);
        setField(term13680, term13680.getClass(), "propListHead", null);
        setIntField(term13680, term13680.getClass(), "sourcePosition", 0);
        setField(term13680, term13680.getClass(), "jsType", null);
        setField(term13680, term13680.getClass(), "parent", null);
        setField(term13679, term13679.getClass(), "first", term13680);
        setField(term13679, term13679.getClass(), "last", null);
        setField(term13679, term13679.getClass(), "propListHead", null);
        setIntField(term13679, term13679.getClass(), "sourcePosition", 0);
        setField(term13679, term13679.getClass(), "jsType", null);
        setField(term13679, term13679.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term12985;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term12915, args);
        assertTrue(recursiveEquals(term12915, term13678));
        assertTrue(recursiveEquals(term12985, term13679));
    }

};


