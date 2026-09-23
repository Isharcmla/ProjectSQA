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

public class RemoveUnusedVars_traverseNode_121208155196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25800;
     Object term25978;

    public RemoveUnusedVars_traverseNode_121208155196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25800 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term25908 = newInstance(Class.forName("com.google.javascript.jscomp.JqueryCodingConvention"));
        setField(term25800, term25800.getClass(), "codingConvention", term25908);
        term25978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26118 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25978, term25978.getClass(), "type", 79);
        setIntField(term26048, term26048.getClass(), "type", 79);
        setIntField(term26118, term26118.getClass(), "type", -80);
        setField(term26118, term26118.getClass(), "first", null);
        setField(term26118, term26118.getClass(), "next", null);
        setField(term26048, term26048.getClass(), "first", term26118);
        setIntField(term26188, term26188.getClass(), "type", 37);
        setField(term26048, term26048.getClass(), "next", term26188);
        setField(term25978, term25978.getClass(), "first", term26048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term25978;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term25800, args);
    }

};


