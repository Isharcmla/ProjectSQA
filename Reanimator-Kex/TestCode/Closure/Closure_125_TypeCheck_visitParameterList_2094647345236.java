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

public class TypeCheck_visitParameterList_2094647345236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55964;
     Object term56034;
     Object term56204;

    public TypeCheck_visitParameterList_2094647345236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55964 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term56034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56034, term56034.getClass(), "first", term56403);
        term56204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term56298 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term56368 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term56368, term56368.getClass(), "first", term56403);
        setField(term56298, term56298.getClass(), "parameters", term56368);
        setField(term56204, term56204.getClass(), "call", term56298);
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
        args[1] = term56034;
        args[2] = term56204;
        try {
            callMethod(klass, "visitParameterList", argTypes, term55964, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


