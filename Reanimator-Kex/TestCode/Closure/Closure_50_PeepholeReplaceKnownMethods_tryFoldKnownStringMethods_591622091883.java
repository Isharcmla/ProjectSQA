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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3738492;
     Object term3738578;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3738492 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3738578 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3738670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3738762 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3738854 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3739022 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3739114 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3738578, term3738578.getClass(), "type", 37);
        setIntField(term3738670, term3738670.getClass(), "type", 35);
        setIntField(term3738854, term3738854.getClass(), "type", 40);
        setField(term3738854, term3738854.getClass(), "str", "lastIndexOf");
        setField(term3738762, term3738762.getClass(), "next", term3738854);
        setIntField(term3738762, term3738762.getClass(), "type", 40);
        setField(term3738762, term3738762.getClass(), "str", "lastIndexOf");
        setField(term3738670, term3738670.getClass(), "first", term3738762);
        setIntField(term3739022, term3739022.getClass(), "type", 41);
        setField(term3739022, term3739022.getClass(), "next", null);
        setField(term3738670, term3738670.getClass(), "next", term3739022);
        setField(term3738578, term3738578.getClass(), "first", term3738670);
        setField(term3738578, term3738578.getClass(), "parent", term3739114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3738578;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3738492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


