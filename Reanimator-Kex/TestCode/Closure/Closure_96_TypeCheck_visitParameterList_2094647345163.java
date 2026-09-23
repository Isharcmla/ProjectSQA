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

public class TypeCheck_visitParameterList_2094647345163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81087;
     Object term81157;
     Object term81327;

    public TypeCheck_visitParameterList_2094647345163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81087 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term81157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term81526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81526, term81526.getClass(), "next", null);
        setField(term81157, term81157.getClass(), "first", term81526);
        term81327 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term81421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term81491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term81491, term81491.getClass(), "first", term81526);
        setField(term81491, term81491.getClass(), "last", null);
        setField(term81421, term81421.getClass(), "parameters", term81491);
        setField(term81327, term81327.getClass(), "call", term81421);
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
        args[1] = term81157;
        args[2] = term81327;
        try {
            callMethod(klass, "visitParameterList", argTypes, term81087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


