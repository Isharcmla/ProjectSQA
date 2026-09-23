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

public class TypeCheck_visitParameterList_2094647345203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47216;
     Object term47286;
     Object term47456;

    public TypeCheck_visitParameterList_2094647345203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47216 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term47286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47356, term47356.getClass(), "next", null);
        setField(term47286, term47286.getClass(), "first", term47356);
        term47456 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term47550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term47620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47620, term47620.getClass(), "first", term47690);
        setField(term47550, term47550.getClass(), "parameters", term47620);
        setField(term47456, term47456.getClass(), "call", term47550);
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
        args[1] = term47286;
        args[2] = term47456;
        try {
            callMethod(klass, "visitParameterList", argTypes, term47216, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


