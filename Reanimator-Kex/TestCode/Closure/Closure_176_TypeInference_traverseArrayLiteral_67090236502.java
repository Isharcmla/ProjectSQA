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

public class TypeInference_traverseArrayLiteral_67090236502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2219309;
     Object term2219379;

    public TypeInference_traverseArrayLiteral_67090236502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2219309 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2219379 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2219939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220849 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2220989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221129 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221479 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221829 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2221969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222319 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2222389 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2219449, term2219449.getClass(), "type", 83);
        setIntField(term2219519, term2219519.getClass(), "type", 83);
        setIntField(term2219589, term2219589.getClass(), "type", 83);
        setIntField(term2219659, term2219659.getClass(), "type", 83);
        setIntField(term2219729, term2219729.getClass(), "type", 83);
        setIntField(term2219799, term2219799.getClass(), "type", 83);
        setIntField(term2219869, term2219869.getClass(), "type", 83);
        setIntField(term2219939, term2219939.getClass(), "type", 83);
        setIntField(term2220009, term2220009.getClass(), "type", 83);
        setIntField(term2220079, term2220079.getClass(), "type", 83);
        setIntField(term2220149, term2220149.getClass(), "type", 83);
        setIntField(term2220219, term2220219.getClass(), "type", 83);
        setIntField(term2220289, term2220289.getClass(), "type", 83);
        setIntField(term2220359, term2220359.getClass(), "type", 83);
        setIntField(term2220429, term2220429.getClass(), "type", 83);
        setIntField(term2220499, term2220499.getClass(), "type", 83);
        setIntField(term2220569, term2220569.getClass(), "type", 83);
        setIntField(term2220639, term2220639.getClass(), "type", 83);
        setIntField(term2220709, term2220709.getClass(), "type", 83);
        setIntField(term2220779, term2220779.getClass(), "type", 83);
        setIntField(term2220849, term2220849.getClass(), "type", 83);
        setIntField(term2220919, term2220919.getClass(), "type", 83);
        setIntField(term2220989, term2220989.getClass(), "type", 83);
        setIntField(term2221059, term2221059.getClass(), "type", 83);
        setIntField(term2221129, term2221129.getClass(), "type", 83);
        setIntField(term2221199, term2221199.getClass(), "type", 83);
        setIntField(term2221269, term2221269.getClass(), "type", 83);
        setIntField(term2221339, term2221339.getClass(), "type", 83);
        setIntField(term2221409, term2221409.getClass(), "type", 83);
        setIntField(term2221479, term2221479.getClass(), "type", 83);
        setIntField(term2221549, term2221549.getClass(), "type", 83);
        setIntField(term2221619, term2221619.getClass(), "type", 83);
        setIntField(term2221689, term2221689.getClass(), "type", 83);
        setIntField(term2221759, term2221759.getClass(), "type", 83);
        setIntField(term2221829, term2221829.getClass(), "type", 83);
        setIntField(term2221899, term2221899.getClass(), "type", 83);
        setIntField(term2221969, term2221969.getClass(), "type", 83);
        setIntField(term2222039, term2222039.getClass(), "type", 83);
        setIntField(term2222109, term2222109.getClass(), "type", 83);
        setIntField(term2222179, term2222179.getClass(), "type", 83);
        setIntField(term2222249, term2222249.getClass(), "type", 83);
        setIntField(term2222319, term2222319.getClass(), "type", 83);
        setIntField(term2222389, term2222389.getClass(), "type", 116);
        setField(term2222319, term2222319.getClass(), "first", term2222389);
        setField(term2222249, term2222249.getClass(), "first", term2222319);
        setField(term2222179, term2222179.getClass(), "first", term2222249);
        setField(term2222109, term2222109.getClass(), "first", term2222179);
        setField(term2222039, term2222039.getClass(), "first", term2222109);
        setField(term2221969, term2221969.getClass(), "first", term2222039);
        setField(term2221899, term2221899.getClass(), "first", term2221969);
        setField(term2221829, term2221829.getClass(), "first", term2221899);
        setField(term2221759, term2221759.getClass(), "first", term2221829);
        setField(term2221689, term2221689.getClass(), "first", term2221759);
        setField(term2221619, term2221619.getClass(), "first", term2221689);
        setField(term2221549, term2221549.getClass(), "first", term2221619);
        setField(term2221479, term2221479.getClass(), "first", term2221549);
        setField(term2221409, term2221409.getClass(), "first", term2221479);
        setField(term2221339, term2221339.getClass(), "first", term2221409);
        setField(term2221269, term2221269.getClass(), "first", term2221339);
        setField(term2221199, term2221199.getClass(), "first", term2221269);
        setField(term2221129, term2221129.getClass(), "first", term2221199);
        setField(term2221059, term2221059.getClass(), "first", term2221129);
        setField(term2220989, term2220989.getClass(), "first", term2221059);
        setField(term2220919, term2220919.getClass(), "first", term2220989);
        setField(term2220849, term2220849.getClass(), "first", term2220919);
        setField(term2220779, term2220779.getClass(), "first", term2220849);
        setField(term2220709, term2220709.getClass(), "first", term2220779);
        setField(term2220639, term2220639.getClass(), "first", term2220709);
        setField(term2220569, term2220569.getClass(), "first", term2220639);
        setField(term2220499, term2220499.getClass(), "first", term2220569);
        setField(term2220429, term2220429.getClass(), "first", term2220499);
        setField(term2220359, term2220359.getClass(), "first", term2220429);
        setField(term2220289, term2220289.getClass(), "first", term2220359);
        setField(term2220219, term2220219.getClass(), "first", term2220289);
        setField(term2220149, term2220149.getClass(), "first", term2220219);
        setField(term2220079, term2220079.getClass(), "first", term2220149);
        setField(term2220009, term2220009.getClass(), "first", term2220079);
        setField(term2219939, term2219939.getClass(), "first", term2220009);
        setField(term2219869, term2219869.getClass(), "first", term2219939);
        setField(term2219799, term2219799.getClass(), "first", term2219869);
        setField(term2219729, term2219729.getClass(), "first", term2219799);
        setField(term2219659, term2219659.getClass(), "first", term2219729);
        setField(term2219589, term2219589.getClass(), "first", term2219659);
        setField(term2219519, term2219519.getClass(), "first", term2219589);
        setField(term2219449, term2219449.getClass(), "first", term2219519);
        setField(term2219379, term2219379.getClass(), "first", term2219449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2219379;
        args[1] = null;
        try {
            callMethod(klass, "traverseArrayLiteral", argTypes, term2219309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


