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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2689528;
     Object term2689614;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2689528 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2689614 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2689706 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2689798 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2689890 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term2689614, term2689614.getClass(), "type", 37);
        setIntField(term2689706, term2689706.getClass(), "type", 35);
        setIntField(term2689890, term2689890.getClass(), "type", 40);
        setField(term2689798, term2689798.getClass(), "next", term2689890);
        setIntField(term2689798, term2689798.getClass(), "type", 40);
        setField(term2689706, term2689706.getClass(), "first", term2689798);
        setField(term2689614, term2689614.getClass(), "first", term2689706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2689614;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2689528, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


