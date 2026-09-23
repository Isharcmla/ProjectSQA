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

public class TypeCheck_visit_8595247841160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333903;
     Object term334099;

    public TypeCheck_visit_8595247841160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333903 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term334007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term333903, term333903.getClass(), "typeRegistry", term334007);
        term334099 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term334191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term334283 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term334099, term334099.getClass(), "type", 45);
        setIntField(term334191, term334191.getClass(), "type", 0);
        setField(term334191, term334191.getClass(), "jsType", null);
        setField(term334099, term334099.getClass(), "first", term334191);
        setIntField(term334283, term334283.getClass(), "type", 0);
        setField(term334099, term334099.getClass(), "last", term334283);
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
        args[1] = term334099;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term333903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


