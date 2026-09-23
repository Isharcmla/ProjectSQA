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

public class RemoveUnusedVars_traverseNode_121208155168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14460;
     Object term14530;

    public RemoveUnusedVars_traverseNode_121208155168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14460 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term14530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14530, term14530.getClass(), "type", -1679224431);
        setIntField(term14600, term14600.getClass(), "type", 1679224430);
        setIntField(term14670, term14670.getClass(), "type", 105);
        setField(term14600, term14600.getClass(), "first", term14670);
        setField(term14530, term14530.getClass(), "first", term14600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term14530;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term14460, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


