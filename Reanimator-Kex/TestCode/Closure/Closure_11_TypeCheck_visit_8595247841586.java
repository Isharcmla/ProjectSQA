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

public class TypeCheck_visit_8595247841586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501493;
     Object term501585;

    public TypeCheck_visit_8595247841586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501493 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term501493, term501493.getClass(), "validator", null);
        term501585 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term501677 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term501585, term501585.getClass(), "type", 102);
        setField(term501585, term501585.getClass(), "first", term501677);
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
        args[1] = term501585;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term501493, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


