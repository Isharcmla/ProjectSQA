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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class NodeTraversal_getCurrentNode_162309536479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5104;
     Object term11550;

    public NodeTraversal_getCurrentNode_162309536479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5104 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term5104, term5104.getClass(), "compiler", null);
        setField(term5104, term5104.getClass(), "callback", null);
        setField(term5104, term5104.getClass(), "curNode", null);
        setField(term5104, term5104.getClass(), "scopes", null);
        setField(term5104, term5104.getClass(), "scopeRoots", null);
        setField(term5104, term5104.getClass(), "cfgs", null);
        setField(term5104, term5104.getClass(), "sourceName", null);
        setField(term5104, term5104.getClass(), "inputId", null);
        setField(term5104, term5104.getClass(), "scopeCreator", null);
        setField(term5104, term5104.getClass(), "scopeCallback", null);
        term11550 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term11550, term11550.getClass(), "compiler", null);
        setField(term11550, term11550.getClass(), "callback", null);
        setField(term11550, term11550.getClass(), "curNode", null);
        setField(term11550, term11550.getClass(), "scopes", null);
        setField(term11550, term11550.getClass(), "scopeRoots", null);
        setField(term11550, term11550.getClass(), "cfgs", null);
        setField(term11550, term11550.getClass(), "sourceName", null);
        setField(term11550, term11550.getClass(), "inputId", null);
        setField(term11550, term11550.getClass(), "scopeCreator", null);
        setField(term11550, term11550.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCurrentNode", argTypes, term5104, args);
        assertTrue(recursiveEquals(term5104, term11550));
        assertTrue(recursiveEquals(retValue, null));
    }

};


