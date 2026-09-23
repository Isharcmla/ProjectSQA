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

public class TypeCheck_visit_8595247841360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416959;
     Object term417051;

    public TypeCheck_visit_8595247841360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term416959 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term417051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term417143 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term417237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term417329 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term417051, term417051.getClass(), "type", 9);
        setField(term417143, term417143.getClass(), "jsType", term417237);
        setField(term417051, term417051.getClass(), "first", term417143);
        setField(term417051, term417051.getClass(), "last", term417329);
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
        args[1] = term417051;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term416959, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


