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

public class TypeCheck_visit_8595247841196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348636;
     Object term348810;

    public TypeCheck_visit_8595247841196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348636 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term348740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term348636, term348636.getClass(), "typeRegistry", term348740);
        term348810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term348810, term348810.getClass(), "type", 88);
        setIntField(term348880, term348880.getClass(), "type", 0);
        setField(term348880, term348880.getClass(), "jsType", null);
        setField(term348810, term348810.getClass(), "first", term348880);
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
        args[1] = term348810;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term348636, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


