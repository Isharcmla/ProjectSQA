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

public class TypeCheck_visit_8595247841643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554738;
     Object term554830;

    public TypeCheck_visit_8595247841643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554738 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term554830 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term554922 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term555014 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term554830, term554830.getClass(), "type", 12);
        setIntField(term554922, term554922.getClass(), "type", 12);
        setField(term554830, term554830.getClass(), "first", term554922);
        setField(term554830, term554830.getClass(), "last", term555014);
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
        args[1] = term554830;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term554738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


