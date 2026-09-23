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

public class TypeCheck_visitParameterList_2094647345183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48496;
     Object term48566;
     Object term48736;

    public TypeCheck_visitParameterList_2094647345183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48496 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term48566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48636, term48636.getClass(), "next", null);
        setField(term48566, term48566.getClass(), "first", term48636);
        term48736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term48830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term48900 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48900, term48900.getClass(), "first", term48970);
        setField(term48830, term48830.getClass(), "parameters", term48900);
        setField(term48736, term48736.getClass(), "call", term48830);
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
        args[1] = term48566;
        args[2] = term48736;
        try {
            callMethod(klass, "visitParameterList", argTypes, term48496, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


