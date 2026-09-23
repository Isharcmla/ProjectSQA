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

public class TypeCheck_visitParameterList_2094647345221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100241;
     Object term100311;
     Object term100481;

    public TypeCheck_visitParameterList_2094647345221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100241 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term100311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100381, term100381.getClass(), "next", null);
        setField(term100311, term100311.getClass(), "first", term100381);
        term100481 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term100575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term100645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term100645, term100645.getClass(), "first", term100715);
        setField(term100575, term100575.getClass(), "parameters", term100645);
        setField(term100481, term100481.getClass(), "call", term100575);
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
        args[1] = term100311;
        args[2] = term100481;
        try {
            callMethod(klass, "visitParameterList", argTypes, term100241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


