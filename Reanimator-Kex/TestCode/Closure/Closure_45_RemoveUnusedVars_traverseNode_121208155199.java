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

public class RemoveUnusedVars_traverseNode_121208155199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27216;
     Object term27286;

    public RemoveUnusedVars_traverseNode_121208155199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27216 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term27286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27286, term27286.getClass(), "type", -1679224431);
        setIntField(term27356, term27356.getClass(), "type", 1679224430);
        setIntField(term27426, term27426.getClass(), "type", 38);
        setField(term27356, term27356.getClass(), "first", term27426);
        setField(term27286, term27286.getClass(), "first", term27356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term27286;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term27216, args);
    }

};


