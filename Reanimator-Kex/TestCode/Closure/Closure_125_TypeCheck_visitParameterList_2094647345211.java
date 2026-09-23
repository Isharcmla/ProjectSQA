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
     Object term50120;
     Object term50190;
     Object term50360;

    public TypeCheck_visitParameterList_2094647345211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50120 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term50190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50559, term50559.getClass(), "next", null);
        setField(term50190, term50190.getClass(), "first", term50559);
        term50360 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term50454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term50524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term50524, term50524.getClass(), "first", term50559);
        setField(term50454, term50454.getClass(), "parameters", term50524);
        setField(term50360, term50360.getClass(), "call", term50454);
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
        args[1] = term50190;
        args[2] = term50360;
        try {
            callMethod(klass, "visitParameterList", argTypes, term50120, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


