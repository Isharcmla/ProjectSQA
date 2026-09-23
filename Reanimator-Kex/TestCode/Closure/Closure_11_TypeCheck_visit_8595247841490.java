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

public class TypeCheck_visit_8595247841490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term465409;
     Object term465605;

    public TypeCheck_visit_8595247841490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term465409 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term465513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term465409, term465409.getClass(), "typeRegistry", term465513);
        term465605 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term465697 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term465605, term465605.getClass(), "type", 87);
        setField(term465697, term465697.getClass(), "jsType", null);
        setField(term465605, term465605.getClass(), "first", term465697);
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
        args[1] = term465605;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term465409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


