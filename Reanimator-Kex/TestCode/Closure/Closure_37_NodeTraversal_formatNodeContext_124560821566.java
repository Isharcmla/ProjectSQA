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

public class NodeTraversal_formatNodeContext_124560821566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3790;
     Object term9050;

    public NodeTraversal_formatNodeContext_124560821566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3790 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term3790, term3790.getClass(), "compiler", null);
        setField(term3790, term3790.getClass(), "callback", null);
        setField(term3790, term3790.getClass(), "curNode", null);
        setField(term3790, term3790.getClass(), "scopes", null);
        setField(term3790, term3790.getClass(), "scopeRoots", null);
        setField(term3790, term3790.getClass(), "cfgs", null);
        setField(term3790, term3790.getClass(), "sourceName", null);
        setField(term3790, term3790.getClass(), "inputId", null);
        setField(term3790, term3790.getClass(), "scopeCreator", null);
        setField(term3790, term3790.getClass(), "scopeCallback", null);
        term9050 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term9050, term9050.getClass(), "compiler", null);
        setField(term9050, term9050.getClass(), "callback", null);
        setField(term9050, term9050.getClass(), "curNode", null);
        setField(term9050, term9050.getClass(), "scopes", null);
        setField(term9050, term9050.getClass(), "scopeRoots", null);
        setField(term9050, term9050.getClass(), "cfgs", null);
        setField(term9050, term9050.getClass(), "sourceName", null);
        setField(term9050, term9050.getClass(), "inputId", null);
        setField(term9050, term9050.getClass(), "scopeCreator", null);
        setField(term9050, term9050.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "formatNodeContext", argTypes, term3790, args);
        assertTrue(recursiveEquals(term3790, term9050));
        assertTrue(recursiveEquals(retValue, "  null: NULL"));
    }

};


