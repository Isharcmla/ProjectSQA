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

public class TypeCheck_visitBinaryOperator_20675338601630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term549258;
     Object term549328;

    public TypeCheck_visitBinaryOperator_20675338601630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term549258 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term549328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term549398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term549492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnionType"));
        Object term549562 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term549662 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term549398, term549398.getClass(), "jsType", term549492);
        setField(term549328, term549328.getClass(), "first", term549398);
        setField(term549562, term549562.getClass(), "jsType", term549662);
        setField(term549328, term549328.getClass(), "last", term549562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = 16;
        args[1] = null;
        args[2] = term549328;
        try {
            callMethod(klass, "visitBinaryOperator", argTypes, term549258, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


