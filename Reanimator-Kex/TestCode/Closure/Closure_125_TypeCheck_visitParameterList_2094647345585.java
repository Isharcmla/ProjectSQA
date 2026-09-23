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

public class TypeCheck_visitParameterList_2094647345585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155645;
     Object term155715;
     Object term155885;

    public TypeCheck_visitParameterList_2094647345585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155645 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term155715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term155785, term155785.getClass(), "next", null);
        setField(term155715, term155715.getClass(), "first", term155785);
        term155885 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term155979 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term156049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term156189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term156119, term156119.getClass(), "next", term156189);
        setField(term156049, term156049.getClass(), "first", term156119);
        setField(term156049, term156049.getClass(), "last", null);
        setField(term155979, term155979.getClass(), "parameters", term156049);
        setField(term155885, term155885.getClass(), "call", term155979);
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
        args[1] = term155715;
        args[2] = term155885;
        try {
            callMethod(klass, "visitParameterList", argTypes, term155645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


