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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2697477;
     Object term2697563;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2697477 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2697563 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2697655 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2697747 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2697839 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2697563, term2697563.getClass(), "type", 37);
        setIntField(term2697655, term2697655.getClass(), "type", 35);
        setIntField(term2697839, term2697839.getClass(), "type", 40);
        setField(term2697839, term2697839.getClass(), "str", "toLowerCase");
        setField(term2697747, term2697747.getClass(), "next", term2697839);
        setIntField(term2697747, term2697747.getClass(), "type", 40);
        setField(term2697655, term2697655.getClass(), "first", term2697747);
        setField(term2697655, term2697655.getClass(), "next", null);
        setField(term2697563, term2697563.getClass(), "first", term2697655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2697563;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2697477, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


