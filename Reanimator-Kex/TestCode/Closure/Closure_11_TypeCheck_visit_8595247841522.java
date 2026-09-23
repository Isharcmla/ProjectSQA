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

public class TypeCheck_visit_8595247841522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475699;
     Object term475791;

    public TypeCheck_visit_8595247841522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475699 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term475699, term475699.getClass(), "validator", null);
        term475791 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475883 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term475977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term475791, term475791.getClass(), "type", 52);
        setField(term475883, term475883.getClass(), "jsType", term475977);
        setField(term475791, term475791.getClass(), "first", term475883);
        setField(term475791, term475791.getClass(), "last", term475883);
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
        args[1] = term475791;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term475699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


