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

public class TypeCheck_visitParameterList_2094647345211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96125;
     Object term96285;
     Object term96455;

    public TypeCheck_visitParameterList_2094647345211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96125 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term96215 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        setField(term96125, term96125.getClass(), "validator", term96215);
        term96285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96355, term96355.getClass(), "next", null);
        setField(term96285, term96285.getClass(), "first", term96355);
        term96455 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term96549 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term96619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term96689, term96689.getClass(), "next", null);
        setField(term96619, term96619.getClass(), "first", term96689);
        setField(term96619, term96619.getClass(), "last", null);
        setField(term96549, term96549.getClass(), "parameters", term96619);
        setField(term96455, term96455.getClass(), "call", term96549);
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
        args[1] = term96285;
        args[2] = term96455;
        try {
            callMethod(klass, "visitParameterList", argTypes, term96125, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


