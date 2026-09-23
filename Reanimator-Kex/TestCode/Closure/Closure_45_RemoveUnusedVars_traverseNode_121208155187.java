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
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21273;
     Object term21343;

    public RemoveUnusedVars_traverseNode_121208155187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21273 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term21343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term21343, term21343.getClass(), "type", 0);
        setIntField(term21413, term21413.getClass(), "type", 0);
        setIntField(term21483, term21483.getClass(), "type", 64);
        setField(term21483, term21483.getClass(), "first", null);
        setField(term21483, term21483.getClass(), "next", null);
        setField(term21413, term21413.getClass(), "first", term21483);
        setIntField(term21553, term21553.getClass(), "type", 0);
        setIntField(term21623, term21623.getClass(), "type", 38);
        setField(term21553, term21553.getClass(), "first", term21623);
        setField(term21413, term21413.getClass(), "next", term21553);
        setField(term21343, term21343.getClass(), "first", term21413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term21343;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term21273, args);
    }

};


