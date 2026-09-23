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

public class TypeCheck_visitParameterList_2094647345498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130638;
     Object term130902;
     Object term131072;

    public TypeCheck_visitParameterList_2094647345498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130638 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term130728 = newInstance(Class.forName("com.google.javascript.jscomp.TypeValidator"));
        Object term130832 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term130638, term130638.getClass(), "validator", term130728);
        setField(term130638, term130638.getClass(), "typeRegistry", term130832);
        term130902 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term130902, term130902.getClass(), "first", term130972);
        term131072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term131166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term131236 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131376 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term131236, term131236.getClass(), "first", term131306);
        setField(term131236, term131236.getClass(), "next", term131376);
        setField(term131166, term131166.getClass(), "parameters", term131236);
        setField(term131072, term131072.getClass(), "call", term131166);
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
        args[1] = term130902;
        args[2] = term131072;
        try {
            callMethod(klass, "visitParameterList", argTypes, term130638, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


