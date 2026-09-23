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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ScopedAliases_hotSwapScript_8834170957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59779;
     Object term59871;

    public ScopedAliases_hotSwapScript_8834170957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59779 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term59779, term59779.getClass(), "compiler", null);
        term59871 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term59963 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60055 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60401 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60493 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60585 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60747 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60909 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term60979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61163 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61255 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61347 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61509 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61601 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term61693 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term59871, term59871.getClass(), "type", 0);
        setField(term59871, term59871.getClass(), "parent", null);
        setField(term60055, term60055.getClass(), "next", term60125);
        setIntField(term60055, term60055.getClass(), "type", 0);
        setField(term60217, term60217.getClass(), "next", null);
        setIntField(term60217, term60217.getClass(), "type", 0);
        setField(term60401, term60401.getClass(), "next", null);
        setIntField(term60401, term60401.getClass(), "type", 0);
        setField(term60585, term60585.getClass(), "next", term60655);
        setIntField(term60585, term60585.getClass(), "type", 0);
        setField(term60747, term60747.getClass(), "next", term60817);
        setIntField(term60747, term60747.getClass(), "type", 0);
        setField(term60747, term60747.getClass(), "first", null);
        setField(term60585, term60585.getClass(), "first", term60747);
        setField(term60493, term60493.getClass(), "next", term60585);
        setIntField(term60493, term60493.getClass(), "type", 0);
        setField(term60909, term60909.getClass(), "next", term60979);
        setIntField(term60909, term60909.getClass(), "type", 0);
        setField(term61071, term61071.getClass(), "next", term60401);
        setIntField(term61071, term61071.getClass(), "type", 0);
        setField(term61163, term61163.getClass(), "next", null);
        setIntField(term61163, term61163.getClass(), "type", 0);
        setField(term61255, term61255.getClass(), "next", null);
        setIntField(term61255, term61255.getClass(), "type", 0);
        setField(term61347, term61347.getClass(), "next", term61417);
        setIntField(term61347, term61347.getClass(), "type", 0);
        setField(term61347, term61347.getClass(), "first", term60055);
        setField(term61255, term61255.getClass(), "first", term61347);
        setField(term61163, term61163.getClass(), "first", term61255);
        setField(term61071, term61071.getClass(), "first", term61163);
        setField(term60909, term60909.getClass(), "first", term61071);
        setField(term60493, term60493.getClass(), "first", term60909);
        setField(term60401, term60401.getClass(), "first", term60493);
        setField(term60309, term60309.getClass(), "next", term60401);
        setIntField(term60309, term60309.getClass(), "type", 0);
        setField(term61601, term61601.getClass(), "next", term60979);
        setIntField(term61601, term61601.getClass(), "type", 0);
        setField(term61601, term61601.getClass(), "first", term60401);
        setField(term61509, term61509.getClass(), "next", term61601);
        setIntField(term61509, term61509.getClass(), "type", 0);
        setField(term61693, term61693.getClass(), "next", null);
        setIntField(term61693, term61693.getClass(), "type", 0);
        setField(term61693, term61693.getClass(), "first", term60585);
        setField(term61509, term61509.getClass(), "first", term61693);
        setField(term60309, term60309.getClass(), "first", term61509);
        setField(term60217, term60217.getClass(), "first", term60309);
        setField(term60055, term60055.getClass(), "first", term60217);
        setField(term59963, term59963.getClass(), "next", term60055);
        setIntField(term59963, term59963.getClass(), "type", 0);
        setField(term59963, term59963.getClass(), "first", term61601);
        setField(term59871, term59871.getClass(), "first", term59963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term59871;
        args[1] = null;
        try {
            callMethod(klass, "hotSwapScript", argTypes, term59779, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


