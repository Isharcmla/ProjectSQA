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

public class TypeCheck_visit_8595247841302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392996;
     Object term393088;

    public TypeCheck_visit_8595247841302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392996 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term393088 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term393180 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term393304 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term393396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term393088, term393088.getClass(), "type", 45);
        setIntField(term393180, term393180.getClass(), "type", 369387648);
        setField(term393180, term393180.getClass(), "jsType", term393304);
        setField(term393088, term393088.getClass(), "first", term393180);
        setIntField(term393396, term393396.getClass(), "type", 536876655);
        setField(term393396, term393396.getClass(), "jsType", term393304);
        setField(term393088, term393088.getClass(), "last", term393396);
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
        args[1] = term393088;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term392996, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


