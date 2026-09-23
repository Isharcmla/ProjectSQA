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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4444963;
     Object term4445049;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4444963 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4445049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4445141 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4445233 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4445325 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4445487 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4445049, term4445049.getClass(), "type", 37);
        setIntField(term4445141, term4445141.getClass(), "type", 35);
        setIntField(term4445325, term4445325.getClass(), "type", 40);
        setField(term4445325, term4445325.getClass(), "str", "lastIndexOf");
        setField(term4445233, term4445233.getClass(), "next", term4445325);
        setIntField(term4445233, term4445233.getClass(), "type", 40);
        setField(term4445233, term4445233.getClass(), "str", "");
        setField(term4445141, term4445141.getClass(), "first", term4445233);
        setIntField(term4445487, term4445487.getClass(), "type", 44);
        setField(term4445487, term4445487.getClass(), "next", null);
        setField(term4445141, term4445141.getClass(), "next", term4445487);
        setField(term4445049, term4445049.getClass(), "first", term4445141);
        setField(term4445049, term4445049.getClass(), "parent", term4445325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4445049;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4444963, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


