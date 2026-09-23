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

public class TypeCheck_visit_8595247841210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357856;
     Object term357948;

    public TypeCheck_visit_8595247841210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357856 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term357948 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term358040 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term358150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setIntField(term357948, term357948.getClass(), "type", 97);
        setIntField(term358040, term358040.getClass(), "type", 97);
        setField(term358040, term358040.getClass(), "jsType", term358150);
        setField(term357948, term357948.getClass(), "first", term358040);
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
        args[1] = term357948;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term357856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


