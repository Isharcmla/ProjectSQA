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

public class NodeTraversal_popScope_188982663388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5855;

    public NodeTraversal_popScope_188982663388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5855 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term5855, term5855.getClass(), "compiler", null);
        setField(term5855, term5855.getClass(), "callback", null);
        setField(term5855, term5855.getClass(), "curNode", null);
        setField(term5855, term5855.getClass(), "scopes", null);
        setField(term5855, term5855.getClass(), "scopeRoots", null);
        setField(term5855, term5855.getClass(), "cfgs", null);
        setField(term5855, term5855.getClass(), "sourceName", null);
        setField(term5855, term5855.getClass(), "inputId", null);
        setField(term5855, term5855.getClass(), "scopeCreator", null);
        setField(term5855, term5855.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "popScope", argTypes, term5855, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


