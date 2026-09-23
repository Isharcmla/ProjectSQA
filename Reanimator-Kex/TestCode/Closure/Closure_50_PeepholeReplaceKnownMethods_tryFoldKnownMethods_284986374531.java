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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3503900;
     Object term3503992;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3503900 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3503992 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3504084 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3504176 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3504268 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3504392 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3504084, term3504084.getClass(), "type", 35);
        setIntField(term3504268, term3504268.getClass(), "type", 40);
        setField(term3504268, term3504268.getClass(), "str", "charCodeAt");
        setField(term3504176, term3504176.getClass(), "next", term3504268);
        setIntField(term3504176, term3504176.getClass(), "type", 40);
        setField(term3504084, term3504084.getClass(), "first", term3504176);
        setIntField(term3504392, term3504392.getClass(), "type", 39);
        setField(term3504084, term3504084.getClass(), "next", term3504392);
        setField(term3503992, term3503992.getClass(), "first", term3504084);
        setIntField(term3503992, term3503992.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3503992;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3503900, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


