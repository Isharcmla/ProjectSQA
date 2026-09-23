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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3689866;
     Object term3689952;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3689866 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3689952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3690044 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3690136 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3690228 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3690352 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3689952, term3689952.getClass(), "type", 37);
        setIntField(term3690044, term3690044.getClass(), "type", 35);
        setIntField(term3690228, term3690228.getClass(), "type", 40);
        setField(term3690228, term3690228.getClass(), "str", "substr");
        setField(term3690136, term3690136.getClass(), "next", term3690228);
        setIntField(term3690136, term3690136.getClass(), "type", 40);
        setField(term3690044, term3690044.getClass(), "first", term3690136);
        setIntField(term3690352, term3690352.getClass(), "type", 39);
        setField(term3690044, term3690044.getClass(), "next", term3690352);
        setField(term3689952, term3689952.getClass(), "first", term3690044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3689952;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3689866, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


