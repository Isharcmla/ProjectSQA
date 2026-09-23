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

public class TypeCheck_visit_8595247841565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519006;
     Object term519098;

    public TypeCheck_visit_8595247841565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519006 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term519098 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term519190 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term519290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term519382 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term519098, term519098.getClass(), "type", 24);
        setField(term519190, term519190.getClass(), "jsType", term519290);
        setField(term519098, term519098.getClass(), "first", term519190);
        setField(term519098, term519098.getClass(), "last", term519382);
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
        args[1] = term519098;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term519006, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


