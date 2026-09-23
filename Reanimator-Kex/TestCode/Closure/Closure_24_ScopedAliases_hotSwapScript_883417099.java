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

public class ScopedAliases_hotSwapScript_883417099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3337;
     Object term3407;
     Object term4641;
     Object term4642;

    public ScopedAliases_hotSwapScript_883417099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3337 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term3337, term3337.getClass(), "compiler", null);
        term3407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3617 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3407, term3407.getClass(), "type", 0);
        setField(term3407, term3407.getClass(), "parent", null);
        setField(term3547, term3547.getClass(), "next", null);
        setIntField(term3547, term3547.getClass(), "type", 0);
        setField(term3547, term3547.getClass(), "first", null);
        setField(term3477, term3477.getClass(), "next", term3547);
        setIntField(term3477, term3477.getClass(), "type", 0);
        setField(term3617, term3617.getClass(), "next", null);
        setIntField(term3617, term3617.getClass(), "type", 0);
        setField(term3617, term3617.getClass(), "first", null);
        setField(term3477, term3477.getClass(), "first", term3617);
        setField(term3407, term3407.getClass(), "first", term3477);
        term4641 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term4641, term4641.getClass(), "compiler", null);
        setField(term4641, term4641.getClass(), "preprocessorSymbolTable", null);
        setField(term4641, term4641.getClass(), "transformationHandler", null);
        term4642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4642, term4642.getClass(), "type", 0);
        setField(term4642, term4642.getClass(), "next", null);
        setIntField(term4643, term4643.getClass(), "type", 0);
        setIntField(term4644, term4644.getClass(), "type", 0);
        setField(term4644, term4644.getClass(), "next", null);
        setField(term4644, term4644.getClass(), "first", null);
        setField(term4644, term4644.getClass(), "last", null);
        setField(term4644, term4644.getClass(), "propListHead", null);
        setIntField(term4644, term4644.getClass(), "sourcePosition", 0);
        setField(term4644, term4644.getClass(), "jsType", null);
        setField(term4644, term4644.getClass(), "parent", null);
        setField(term4643, term4643.getClass(), "next", term4644);
        setIntField(term4645, term4645.getClass(), "type", 0);
        setField(term4645, term4645.getClass(), "next", null);
        setField(term4645, term4645.getClass(), "first", null);
        setField(term4645, term4645.getClass(), "last", null);
        setField(term4645, term4645.getClass(), "propListHead", null);
        setIntField(term4645, term4645.getClass(), "sourcePosition", 0);
        setField(term4645, term4645.getClass(), "jsType", null);
        setField(term4645, term4645.getClass(), "parent", null);
        setField(term4643, term4643.getClass(), "first", term4645);
        setField(term4643, term4643.getClass(), "last", null);
        setField(term4643, term4643.getClass(), "propListHead", null);
        setIntField(term4643, term4643.getClass(), "sourcePosition", 0);
        setField(term4643, term4643.getClass(), "jsType", null);
        setField(term4643, term4643.getClass(), "parent", null);
        setField(term4642, term4642.getClass(), "first", term4643);
        setField(term4642, term4642.getClass(), "last", null);
        setField(term4642, term4642.getClass(), "propListHead", null);
        setIntField(term4642, term4642.getClass(), "sourcePosition", 0);
        setField(term4642, term4642.getClass(), "jsType", null);
        setField(term4642, term4642.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term3407;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term3337, args);
        assertTrue(recursiveEquals(term3337, term4641));
        assertTrue(recursiveEquals(term3407, term4642));
    }

};


