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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class CheckAccessControls_checkNameDeprecation_942014578330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105914;
     Object term106004;
     Object term106234;
     Object term106304;

    public CheckAccessControls_checkNameDeprecation_942014578330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105914 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        ArrayList term106110 = new ArrayList();
        ArrayDeque term106058 = new ArrayDeque((Collection<? extends Object>) term106110);
        ArrayDeque term106164 = new ArrayDeque((Collection<? extends Object>) term106110);
        term106004 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term106004, term106004.getClass(), "scopes", term106058);
        setField(term106004, term106004.getClass(), "scopeRoots", term106164);
        term106234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term106304 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term106304, term106304.getClass(), "type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term106004;
        args[1] = term106234;
        args[2] = term106304;
        try {
            callMethod(klass, "checkNameDeprecation", argTypes, term105914, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


