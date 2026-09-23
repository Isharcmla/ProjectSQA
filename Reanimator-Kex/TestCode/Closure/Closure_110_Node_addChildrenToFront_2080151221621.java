package com.google.javascript.rhino;

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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_addChildrenToFront_2080151221621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54600;
     Object term54670;

    public Node_addChildrenToFront_2080151221621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term54670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term54670, term54670.getClass(), "parent", null);
        setField(term54740, term54740.getClass(), "parent", term54810);
        setField(term54670, term54670.getClass(), "next", term54740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term54670;
        try {
            callMethod(klass, "addChildrenToFront", argTypes, term54600, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


