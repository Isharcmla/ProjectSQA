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

public class RemoveUnusedVars_traverseNode_121208155133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5727;
     Object term5797;

    public RemoveUnusedVars_traverseNode_121208155133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5727 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term5797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5797, term5797.getClass(), "type", 64);
        setIntField(term5867, term5867.getClass(), "type", 64);
        setIntField(term5937, term5937.getClass(), "type", 0);
        setField(term5937, term5937.getClass(), "first", null);
        setField(term5937, term5937.getClass(), "next", null);
        setField(term5867, term5867.getClass(), "first", term5937);
        setIntField(term6007, term6007.getClass(), "type", 37);
        setField(term5867, term5867.getClass(), "next", term6007);
        setField(term5797, term5797.getClass(), "first", term5867);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term5797;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term5727, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
