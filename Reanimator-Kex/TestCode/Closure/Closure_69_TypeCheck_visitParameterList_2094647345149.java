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

public class TypeCheck_visitParameterList_2094647345149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39223;
     Object term39293;
     Object term39463;

    public TypeCheck_visitParameterList_2094647345149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39223 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term39293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39363, term39363.getClass(), "next", null);
        setField(term39293, term39293.getClass(), "first", term39363);
        term39463 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term39557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term39627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term39697, term39697.getClass(), "next", null);
        setField(term39627, term39627.getClass(), "first", term39697);
        setField(term39557, term39557.getClass(), "parameters", term39627);
        setField(term39463, term39463.getClass(), "call", term39557);
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
        args[1] = term39293;
        args[2] = term39463;
        try {
            callMethod(klass, "visitParameterList", argTypes, term39223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


