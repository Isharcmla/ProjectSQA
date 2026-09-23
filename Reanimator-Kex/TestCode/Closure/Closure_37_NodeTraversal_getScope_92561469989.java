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

public class NodeTraversal_getScope_92561469989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5925;

    public NodeTraversal_getScope_92561469989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5925 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term5925, term5925.getClass(), "compiler", null);
        setField(term5925, term5925.getClass(), "callback", null);
        setField(term5925, term5925.getClass(), "curNode", null);
        setField(term5925, term5925.getClass(), "scopes", null);
        setField(term5925, term5925.getClass(), "scopeRoots", null);
        setField(term5925, term5925.getClass(), "cfgs", null);
        setField(term5925, term5925.getClass(), "sourceName", null);
        setField(term5925, term5925.getClass(), "inputId", null);
        setField(term5925, term5925.getClass(), "scopeCreator", null);
        setField(term5925, term5925.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getScope", argTypes, term5925, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


