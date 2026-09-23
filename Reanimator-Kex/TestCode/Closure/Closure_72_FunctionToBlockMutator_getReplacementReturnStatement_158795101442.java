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

public class FunctionToBlockMutator_getReplacementReturnStatement_158795101442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4589;
     Object term14487;
     Object term14481;

    public FunctionToBlockMutator_getReplacementReturnStatement_158795101442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4589 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term4681 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4681, term4681.getClass(), "first", null);
        setField(term4589, term4589.getClass(), "first", term4681);
        term14487 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14488 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term14487, term14487.getClass(), "number", 0.0);
        setIntField(term14487, term14487.getClass(), "type", 0);
        setField(term14487, term14487.getClass(), "next", null);
        setField(term14488, term14488.getClass(), "str", null);
        setIntField(term14488, term14488.getClass(), "type", 0);
        setField(term14488, term14488.getClass(), "next", null);
        setField(term14488, term14488.getClass(), "first", null);
        setField(term14488, term14488.getClass(), "last", null);
        setField(term14488, term14488.getClass(), "propListHead", null);
        setIntField(term14488, term14488.getClass(), "sourcePosition", 0);
        setField(term14488, term14488.getClass(), "jsType", null);
        setField(term14488, term14488.getClass(), "parent", null);
        setField(term14487, term14487.getClass(), "first", term14488);
        setField(term14487, term14487.getClass(), "last", null);
        setField(term14487, term14487.getClass(), "propListHead", null);
        setIntField(term14487, term14487.getClass(), "sourcePosition", 0);
        setField(term14487, term14487.getClass(), "jsType", null);
        setField(term14487, term14487.getClass(), "parent", null);
        term14481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term14481, term14481.getClass(), "type", 130);
        setField(term14481, term14481.getClass(), "next", null);
        setField(term14483, term14483.getClass(), "str", null);
        setIntField(term14483, term14483.getClass(), "type", 0);
        setField(term14483, term14483.getClass(), "next", null);
        setField(term14483, term14483.getClass(), "first", null);
        setField(term14483, term14483.getClass(), "last", null);
        setField(term14483, term14483.getClass(), "propListHead", null);
        setIntField(term14483, term14483.getClass(), "sourcePosition", 0);
        setField(term14483, term14483.getClass(), "jsType", null);
        setField(term14483, term14483.getClass(), "parent", term14481);
        setField(term14481, term14481.getClass(), "first", term14483);
        setField(term14481, term14481.getClass(), "last", term14483);
        setField(term14481, term14481.getClass(), "propListHead", null);
        setIntField(term14481, term14481.getClass(), "sourcePosition", 0);
        setField(term14481, term14481.getClass(), "jsType", null);
        setField(term14481, term14481.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4589;
        args[1] = null;
        Object retValue = callMethod(klass, "getReplacementReturnStatement", argTypes, null, args);
        assertTrue(recursiveEquals(term4589, term14487));
        assertTrue(recursiveEquals(retValue, term14481));
    }

};


