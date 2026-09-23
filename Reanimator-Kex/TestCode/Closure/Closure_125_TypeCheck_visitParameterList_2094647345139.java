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

public class TypeCheck_visitParameterList_2094647345139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32885;
     Object term32955;
     Object term33125;

    public TypeCheck_visitParameterList_2094647345139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32885 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term32885, term32885.getClass(), "validator", null);
        term32955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33025 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term32955, term32955.getClass(), "first", term33025);
        term33125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term33219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term33289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term33289, term33289.getClass(), "first", term33359);
        setField(term33219, term33219.getClass(), "parameters", term33289);
        setField(term33125, term33125.getClass(), "call", term33219);
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
        args[1] = term32955;
        args[2] = term33125;
        try {
            callMethod(klass, "visitParameterList", argTypes, term32885, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


