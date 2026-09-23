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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3587079;
     Object term3587165;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3587079 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3587165 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3587257 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3587349 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3587441 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3587571 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3587165, term3587165.getClass(), "type", 37);
        setIntField(term3587257, term3587257.getClass(), "type", 35);
        setIntField(term3587441, term3587441.getClass(), "type", 40);
        setField(term3587441, term3587441.getClass(), "str", "lastIndexOf");
        setField(term3587349, term3587349.getClass(), "next", term3587441);
        setIntField(term3587349, term3587349.getClass(), "type", 40);
        setField(term3587257, term3587257.getClass(), "first", term3587349);
        setIntField(term3587571, term3587571.getClass(), "type", 41);
        setField(term3587257, term3587257.getClass(), "next", term3587571);
        setField(term3587165, term3587165.getClass(), "first", term3587257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3587165;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3587079, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


