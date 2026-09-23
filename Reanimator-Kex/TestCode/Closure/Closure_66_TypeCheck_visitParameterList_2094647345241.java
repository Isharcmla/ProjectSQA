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

public class TypeCheck_visitParameterList_2094647345241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64069;
     Object term64139;
     Object term64309;

    public TypeCheck_visitParameterList_2094647345241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64069 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term64139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64508, term64508.getClass(), "next", null);
        setField(term64508, term64508.getClass(), "propListHead", null);
        setField(term64139, term64139.getClass(), "first", term64508);
        term64309 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term64403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term64473 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64473, term64473.getClass(), "first", term64508);
        setField(term64473, term64473.getClass(), "last", null);
        setField(term64403, term64403.getClass(), "parameters", term64473);
        setField(term64309, term64309.getClass(), "call", term64403);
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
        args[1] = term64139;
        args[2] = term64309;
        try {
            callMethod(klass, "visitParameterList", argTypes, term64069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


