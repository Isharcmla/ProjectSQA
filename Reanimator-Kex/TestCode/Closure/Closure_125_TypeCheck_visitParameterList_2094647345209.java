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

public class TypeCheck_visitParameterList_2094647345209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49428;
     Object term49588;
     Object term49758;

    public TypeCheck_visitParameterList_2094647345209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49428 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term49518 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term49428, term49428.getClass(), "validator", term49518);
        term49588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49658, term49658.getClass(), "next", null);
        setField(term49588, term49588.getClass(), "first", term49658);
        term49758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term49852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term49922 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49992, term49992.getClass(), "next", null);
        setField(term49922, term49922.getClass(), "first", term49992);
        setField(term49922, term49922.getClass(), "last", null);
        setField(term49852, term49852.getClass(), "parameters", term49922);
        setField(term49758, term49758.getClass(), "call", term49852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term49588;
        args[2] = term49758;
        try {
            callMethod(klass, "visitParameterList", argTypes, term49428, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


