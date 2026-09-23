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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Collection;
import java.util.ArrayDeque;

public class CheckAccessControls_checkNameVisibility_258934486389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198517;
     Object term198607;

    public CheckAccessControls_checkNameVisibility_258934486389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198517 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        ArrayList term198713 = new ArrayList();
        ArrayDeque term198661 = new ArrayDeque((Collection<? extends Object>) term198713);
        ArrayDeque term198767 = new ArrayDeque();
        term198607 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term198607, term198607.getClass(), "scopes", term198661);
        setField(term198607, term198607.getClass(), "scopeRoots", term198767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term198607;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "checkNameVisibility", argTypes, term198517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


