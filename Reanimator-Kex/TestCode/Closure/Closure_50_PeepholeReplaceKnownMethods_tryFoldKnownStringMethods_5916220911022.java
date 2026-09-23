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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4445781;
     Object term4445867;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4445781 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4445867 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4445959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4446051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4446181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4445867, term4445867.getClass(), "type", 37);
        setIntField(term4445959, term4445959.getClass(), "type", 35);
        setField(term4446051, term4446051.getClass(), "next", term4446051);
        setIntField(term4446051, term4446051.getClass(), "type", 40);
        setField(term4446051, term4446051.getClass(), "str", "substr");
        setField(term4445959, term4445959.getClass(), "first", term4446051);
        setIntField(term4446181, term4446181.getClass(), "type", 39);
        setField(term4445959, term4445959.getClass(), "next", term4446181);
        setField(term4445867, term4445867.getClass(), "first", term4445959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4445867;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4445781, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


