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

public class TypeCheck_visit_8595247841286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381278;
     Object term381370;

    public TypeCheck_visit_8595247841286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381278 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term381370 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term381462 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term381556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setIntField(term381370, term381370.getClass(), "type", 52);
        setField(term381370, term381370.getClass(), "first", null);
        setField(term381462, term381462.getClass(), "jsType", term381556);
        setField(term381370, term381370.getClass(), "last", term381462);
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
        args[1] = term381370;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term381278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


