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

public class TypeCheck_visit_8595247841608 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510917;
     Object term511009;

    public TypeCheck_visit_8595247841608() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510917 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term511009 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term511101 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term511193 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term511009, term511009.getClass(), "type", 46);
        setIntField(term511101, term511101.getClass(), "type", 46);
        setField(term511009, term511009.getClass(), "first", term511101);
        setField(term511009, term511009.getClass(), "last", term511193);
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
        args[1] = term511009;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term510917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


