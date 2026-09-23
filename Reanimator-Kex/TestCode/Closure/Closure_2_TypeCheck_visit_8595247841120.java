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

public class TypeCheck_visit_8595247841120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321154;
     Object term321246;

    public TypeCheck_visit_8595247841120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321154 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term321246 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term321338 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term321438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setIntField(term321246, term321246.getClass(), "type", 37);
        setField(term321338, term321338.getClass(), "jsType", term321438);
        setField(term321246, term321246.getClass(), "first", term321338);
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
        args[1] = term321246;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term321154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


