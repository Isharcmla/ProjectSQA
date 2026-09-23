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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitParameterList_2094647345683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183814;
     Object term183884;
     Object term184054;

    public TypeCheck_visitParameterList_2094647345683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183814 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term183884 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term184183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term184183, term184183.getClass(), "next", term184183);
        setField(term184183, term184183.getClass(), "first", null);
        setField(term183884, term183884.getClass(), "first", term184183);
        term184054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term184148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term184148, term184148.getClass(), "parameters", term184183);
        setField(term184054, term184054.getClass(), "call", term184148);
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
        args[1] = term183884;
        args[2] = term184054;
        callMethod(klass, "visitParameterList", argTypes, term183814, args);
    }

};


