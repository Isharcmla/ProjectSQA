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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3604545;
     Object term3604637;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3604545 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3604637 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604729 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604821 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3604913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3605037 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3604729, term3604729.getClass(), "type", 35);
        setIntField(term3604913, term3604913.getClass(), "type", 40);
        setField(term3604913, term3604913.getClass(), "str", "lastIndexOf");
        setField(term3604821, term3604821.getClass(), "next", term3604913);
        setIntField(term3604821, term3604821.getClass(), "type", 40);
        setField(term3604729, term3604729.getClass(), "first", term3604821);
        setIntField(term3605037, term3605037.getClass(), "type", 44);
        setField(term3604729, term3604729.getClass(), "next", term3605037);
        setField(term3604637, term3604637.getClass(), "first", term3604729);
        setIntField(term3604637, term3604637.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3604637;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3604545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


