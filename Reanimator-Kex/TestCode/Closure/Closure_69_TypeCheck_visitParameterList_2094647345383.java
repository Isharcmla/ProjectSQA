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

public class TypeCheck_visitParameterList_2094647345383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113286;
     Object term113356;
     Object term113526;

    public TypeCheck_visitParameterList_2094647345383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113286 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term113356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term113356, term113356.getClass(), "first", term113725);
        term113526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term113620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term113690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term113690, term113690.getClass(), "first", term113725);
        setField(term113620, term113620.getClass(), "parameters", term113690);
        setField(term113526, term113526.getClass(), "call", term113620);
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
        args[1] = term113356;
        args[2] = term113526;
        try {
            callMethod(klass, "visitParameterList", argTypes, term113286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


