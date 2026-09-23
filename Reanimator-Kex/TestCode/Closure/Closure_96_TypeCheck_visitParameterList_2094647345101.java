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

public class TypeCheck_visitParameterList_2094647345101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60395;
     Object term60465;
     Object term60635;

    public TypeCheck_visitParameterList_2094647345101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60395 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term60465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60535 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60465, term60465.getClass(), "first", term60535);
        term60635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term60729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term60799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term60799, term60799.getClass(), "next", term60869);
        setField(term60799, term60799.getClass(), "first", term60939);
        setField(term60729, term60729.getClass(), "parameters", term60799);
        setField(term60635, term60635.getClass(), "call", term60729);
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
        args[1] = term60465;
        args[2] = term60635;
        try {
            callMethod(klass, "visitParameterList", argTypes, term60395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


