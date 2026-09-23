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

public class TypeCheck_visitParameterList_2094647345224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57962;
     Object term58032;
     Object term58202;

    public TypeCheck_visitParameterList_2094647345224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57962 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term58032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58032, term58032.getClass(), "first", term58401);
        term58202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term58296 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term58366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term58366, term58366.getClass(), "first", term58401);
        setField(term58296, term58296.getClass(), "parameters", term58366);
        setField(term58202, term58202.getClass(), "call", term58296);
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
        args[1] = term58032;
        args[2] = term58202;
        try {
            callMethod(klass, "visitParameterList", argTypes, term57962, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


