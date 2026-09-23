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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3575028;
     Object term3575114;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3575028 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3575114 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3575206 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3575298 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3575390 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3575520 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3575114, term3575114.getClass(), "type", 37);
        setIntField(term3575206, term3575206.getClass(), "type", 35);
        setIntField(term3575390, term3575390.getClass(), "type", 40);
        setField(term3575390, term3575390.getClass(), "str", "lastIndexOf");
        setField(term3575298, term3575298.getClass(), "next", term3575390);
        setIntField(term3575298, term3575298.getClass(), "type", 40);
        setField(term3575206, term3575206.getClass(), "first", term3575298);
        setIntField(term3575520, term3575520.getClass(), "type", 39);
        setField(term3575206, term3575206.getClass(), "next", term3575520);
        setField(term3575114, term3575114.getClass(), "first", term3575206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3575114;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3575028, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


