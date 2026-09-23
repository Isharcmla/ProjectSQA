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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19263;
     Object term19355;

    public RemoveUnusedVars_traverseNode_121208155191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19263 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term19355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term19447 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term19355, term19355.getClass(), "type", -620890193);
        setIntField(term19447, term19447.getClass(), "type", 620890192);
        setField(term19447, term19447.getClass(), "first", term19447);
        setField(term19355, term19355.getClass(), "first", term19447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term19355;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "traverseNode", argTypes, term19263, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


