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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3578235;
     Object term3578321;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3578235 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3578321 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3578413 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3578505 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3578597 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3578683 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3578321, term3578321.getClass(), "type", 37);
        setIntField(term3578413, term3578413.getClass(), "type", 35);
        setIntField(term3578597, term3578597.getClass(), "type", 40);
        setField(term3578597, term3578597.getClass(), "str", null);
        setField(term3578505, term3578505.getClass(), "next", term3578597);
        setIntField(term3578505, term3578505.getClass(), "type", 40);
        setField(term3578413, term3578413.getClass(), "first", term3578505);
        setIntField(term3578683, term3578683.getClass(), "type", 40);
        setField(term3578413, term3578413.getClass(), "next", term3578683);
        setField(term3578321, term3578321.getClass(), "first", term3578413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3578321;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3578235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


