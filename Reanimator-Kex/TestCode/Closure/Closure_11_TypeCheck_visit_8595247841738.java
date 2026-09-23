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
import java.lang.Object;

public class TypeCheck_visit_8595247841738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565008;
     Object term565204;

    public TypeCheck_visit_8595247841738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565008 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term565112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term565008, term565008.getClass(), "typeRegistry", term565112);
        term565204 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term565296 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term565204, term565204.getClass(), "type", 18);
        setField(term565296, term565296.getClass(), "jsType", null);
        setField(term565204, term565204.getClass(), "first", term565296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term565204;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term565008, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


