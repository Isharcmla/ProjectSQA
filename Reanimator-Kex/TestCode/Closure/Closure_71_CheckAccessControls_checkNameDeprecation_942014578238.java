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

public class CheckAccessControls_checkNameDeprecation_942014578238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68519;
     Object term68609;
     Object term68839;

    public CheckAccessControls_checkNameDeprecation_942014578238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68519 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        ArrayList term68715 = new ArrayList();
        ArrayDeque term68663 = new ArrayDeque((Collection<? extends Object>) term68715);
        ArrayDeque term68769 = new ArrayDeque();
        term68609 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term68609, term68609.getClass(), "scopes", term68663);
        setField(term68609, term68609.getClass(), "scopeRoots", term68769);
        term68839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68839, term68839.getClass(), "type", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term68609;
        args[1] = null;
        args[2] = term68839;
        try {
            callMethod(klass, "checkNameDeprecation", argTypes, term68519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


