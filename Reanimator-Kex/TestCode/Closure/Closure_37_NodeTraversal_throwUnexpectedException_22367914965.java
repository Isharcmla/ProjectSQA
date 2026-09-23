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

public class NodeTraversal_throwUnexpectedException_22367914965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3668;

    public NodeTraversal_throwUnexpectedException_22367914965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3668 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term3668, term3668.getClass(), "compiler", null);
        setField(term3668, term3668.getClass(), "callback", null);
        setField(term3668, term3668.getClass(), "curNode", null);
        setField(term3668, term3668.getClass(), "scopes", null);
        setField(term3668, term3668.getClass(), "scopeRoots", null);
        setField(term3668, term3668.getClass(), "cfgs", null);
        setField(term3668, term3668.getClass(), "sourceName", null);
        setField(term3668, term3668.getClass(), "inputId", null);
        setField(term3668, term3668.getClass(), "scopeCreator", null);
        setField(term3668, term3668.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Exception");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "throwUnexpectedException", argTypes, term3668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


