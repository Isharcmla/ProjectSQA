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

public class TypeCheck_visit_8595247841184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343897;
     Object term343989;

    public TypeCheck_visit_8595247841184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343897 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term343989 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344081 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term344173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term343989, term343989.getClass(), "type", 12);
        setIntField(term344081, term344081.getClass(), "type", 12);
        setField(term343989, term343989.getClass(), "first", term344081);
        setField(term343989, term343989.getClass(), "last", term344173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term343989;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term343897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


