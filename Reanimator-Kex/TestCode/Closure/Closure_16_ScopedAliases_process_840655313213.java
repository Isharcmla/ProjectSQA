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

public class ScopedAliases_process_840655313213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131520;
     Object term131612;
     Object term132215;
     Object term132216;

    public ScopedAliases_process_840655313213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131520 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term131520, term131520.getClass(), "compiler", null);
        term131612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term131796 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term131612, term131612.getClass(), "type", 0);
        setIntField(term131704, term131704.getClass(), "type", 0);
        setField(term131704, term131704.getClass(), "parent", null);
        setField(term131612, term131612.getClass(), "parent", term131704);
        setField(term131796, term131796.getClass(), "next", null);
        setIntField(term131796, term131796.getClass(), "type", 0);
        setField(term131796, term131796.getClass(), "first", null);
        setField(term131612, term131612.getClass(), "first", term131796);
        term132215 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term132215, term132215.getClass(), "compiler", null);
        setField(term132215, term132215.getClass(), "preprocessorSymbolTable", null);
        setField(term132215, term132215.getClass(), "transformationHandler", null);
        term132216 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132217 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term132218 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term132216, term132216.getClass(), "str", null);
        setIntField(term132216, term132216.getClass(), "type", 0);
        setField(term132216, term132216.getClass(), "next", null);
        setField(term132217, term132217.getClass(), "str", null);
        setIntField(term132217, term132217.getClass(), "type", 0);
        setField(term132217, term132217.getClass(), "next", null);
        setField(term132217, term132217.getClass(), "first", null);
        setField(term132217, term132217.getClass(), "last", null);
        setField(term132217, term132217.getClass(), "propListHead", null);
        setIntField(term132217, term132217.getClass(), "sourcePosition", 0);
        setField(term132217, term132217.getClass(), "jsType", null);
        setField(term132217, term132217.getClass(), "parent", null);
        setField(term132216, term132216.getClass(), "first", term132217);
        setField(term132216, term132216.getClass(), "last", null);
        setField(term132216, term132216.getClass(), "propListHead", null);
        setIntField(term132216, term132216.getClass(), "sourcePosition", 0);
        setField(term132216, term132216.getClass(), "jsType", null);
        setField(term132218, term132218.getClass(), "str", null);
        setIntField(term132218, term132218.getClass(), "type", 0);
        setField(term132218, term132218.getClass(), "next", null);
        setField(term132218, term132218.getClass(), "first", null);
        setField(term132218, term132218.getClass(), "last", null);
        setField(term132218, term132218.getClass(), "propListHead", null);
        setIntField(term132218, term132218.getClass(), "sourcePosition", 0);
        setField(term132218, term132218.getClass(), "jsType", null);
        setField(term132218, term132218.getClass(), "parent", null);
        setField(term132216, term132216.getClass(), "parent", term132218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term131612;
        callMethod(klass, "process", argTypes, term131520, args);
        assertTrue(recursiveEquals(term131520, term132215));
        assertTrue(recursiveEquals(term131612, null));
    }

};


