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

public class CheckAccessControls_checkPropertyDeprecation_148944317670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17033;
     Object term17125;
     Object term17401;

    public CheckAccessControls_checkPropertyDeprecation_148944317670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17033 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term17125 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17217 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term17309 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term17217, term17217.getClass(), "jsType", null);
        setField(term17125, term17125.getClass(), "first", term17217);
        setField(term17125, term17125.getClass(), "last", term17309);
        term17401 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17401, term17401.getClass(), "type", -31);
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
        args[1] = term17125;
        args[2] = term17401;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term17033, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


