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

public class TypeCheck_visit_8595247841355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410435;
     Object term410631;

    public TypeCheck_visit_8595247841355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410435 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term410539 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term410435, term410435.getClass(), "validator", null);
        setField(term410435, term410435.getClass(), "typeRegistry", term410539);
        term410631 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term410723 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term410631, term410631.getClass(), "type", 28);
        setField(term410723, term410723.getClass(), "jsType", null);
        setField(term410631, term410631.getClass(), "first", term410723);
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
        args[1] = term410631;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term410435, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


