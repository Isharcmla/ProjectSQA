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
import java.lang.Object;

public class CheckAccessControls_checkPropertyDeprecation_148944317667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15119;
     Object term15209;
     Object term15459;

    public CheckAccessControls_checkPropertyDeprecation_148944317667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15119 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term15209 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term15279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15369 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term15279, term15279.getClass(), "jsType", null);
        setField(term15209, term15209.getClass(), "first", term15279);
        setField(term15209, term15209.getClass(), "last", term15369);
        term15459 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term15459, term15459.getClass(), "type", -31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term15209;
        args[2] = term15459;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term15119, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


