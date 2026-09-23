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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3545484;
     Object term3545576;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3545484 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3545576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3545668 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3545760 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3545888 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3545668, term3545668.getClass(), "type", 35);
        setField(term3545760, term3545760.getClass(), "next", term3545760);
        setIntField(term3545760, term3545760.getClass(), "type", 40);
        setField(term3545760, term3545760.getClass(), "str", "indexOf");
        setField(term3545668, term3545668.getClass(), "first", term3545760);
        setIntField(term3545888, term3545888.getClass(), "type", 41);
        setField(term3545668, term3545668.getClass(), "next", term3545888);
        setField(term3545576, term3545576.getClass(), "first", term3545668);
        setIntField(term3545576, term3545576.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3545576;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3545484, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


