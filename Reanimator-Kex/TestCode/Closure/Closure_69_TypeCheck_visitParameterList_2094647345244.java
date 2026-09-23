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

public class TypeCheck_visitParameterList_2094647345244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69559;
     Object term69629;
     Object term69799;

    public TypeCheck_visitParameterList_2094647345244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69559 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term69629 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69998, term69998.getClass(), "next", null);
        setField(term69998, term69998.getClass(), "propListHead", null);
        setField(term69629, term69629.getClass(), "first", term69998);
        term69799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69893 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term69963 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69963, term69963.getClass(), "first", term69998);
        setField(term69963, term69963.getClass(), "last", null);
        setField(term69893, term69893.getClass(), "parameters", term69963);
        setField(term69799, term69799.getClass(), "call", term69893);
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
        args[1] = term69629;
        args[2] = term69799;
        try {
            callMethod(klass, "visitParameterList", argTypes, term69559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


