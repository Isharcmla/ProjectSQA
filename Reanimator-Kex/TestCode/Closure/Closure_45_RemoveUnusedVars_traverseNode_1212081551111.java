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

public class RemoveUnusedVars_traverseNode_1212081551111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31139;
     Object term31317;

    public RemoveUnusedVars_traverseNode_1212081551111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31139 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term31247 = newInstance(Class.forName("com.google.javascript.jscomp.JqueryCodingConvention"));
        setField(term31139, term31139.getClass(), "codingConvention", term31247);
        term31317 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31387 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31317, term31317.getClass(), "type", 0);
        setIntField(term31387, term31387.getClass(), "type", 37);
        setField(term31317, term31317.getClass(), "first", term31387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term31317;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term31139, args);
    }

};


