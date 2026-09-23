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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4454550;
     Object term4454642;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_2849863741030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4454550 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4454642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4454734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4454826 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4454918 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4455080 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4454734, term4454734.getClass(), "type", 35);
        setIntField(term4454918, term4454918.getClass(), "type", 40);
        setField(term4454918, term4454918.getClass(), "str", "indexOf");
        setField(term4454826, term4454826.getClass(), "next", term4454918);
        setIntField(term4454826, term4454826.getClass(), "type", 40);
        setField(term4454826, term4454826.getClass(), "str", "");
        setField(term4454734, term4454734.getClass(), "first", term4454826);
        setIntField(term4455080, term4455080.getClass(), "type", 44);
        setField(term4455080, term4455080.getClass(), "next", null);
        setField(term4454734, term4454734.getClass(), "next", term4455080);
        setField(term4454642, term4454642.getClass(), "first", term4454734);
        setIntField(term4454642, term4454642.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4454642;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term4454550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


