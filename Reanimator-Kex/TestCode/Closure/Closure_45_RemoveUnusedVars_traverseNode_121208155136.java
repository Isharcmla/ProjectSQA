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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5338;
     Object term5408;

    public RemoveUnusedVars_traverseNode_121208155136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5338 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term5408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5478 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5408, term5408.getClass(), "type", -1679224431);
        setIntField(term5478, term5478.getClass(), "type", 1679224430);
        setIntField(term5548, term5548.getClass(), "type", 86);
        setField(term5478, term5478.getClass(), "first", term5548);
        setField(term5408, term5408.getClass(), "first", term5478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term5408;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term5338, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


