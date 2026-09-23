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

public class RemoveUnusedVars_traverseNode_121208155140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6855;
     Object term6925;

    public RemoveUnusedVars_traverseNode_121208155140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6855 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term6925 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6925, term6925.getClass(), "type", 64);
        setIntField(term6995, term6995.getClass(), "type", 37);
        setField(term6925, term6925.getClass(), "first", term6995);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term6925;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term6855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


