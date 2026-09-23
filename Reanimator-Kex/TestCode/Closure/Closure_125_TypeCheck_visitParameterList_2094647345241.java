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
     Object term57584;
     Object term57654;
     Object term57824;

    public TypeCheck_visitParameterList_2094647345241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57584 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term57654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term57724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57724, term57724.getClass(), "next", null);
        setField(term57654, term57654.getClass(), "first", term57724);
        term57824 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term57918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term57988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58058 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term57988, term57988.getClass(), "first", term58058);
        setField(term57918, term57918.getClass(), "parameters", term57988);
        setField(term57824, term57824.getClass(), "call", term57918);
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
        args[1] = term57654;
        args[2] = term57824;
        try {
            callMethod(klass, "visitParameterList", argTypes, term57584, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


