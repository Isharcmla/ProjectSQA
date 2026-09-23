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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitAssign_1165544828331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91676;
     Object term91746;

    public TypeCheck_visitAssign_1165544828331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91676 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term91746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term91842 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term91842, term91842.getClass(), "type", -30);
        setField(term91842, term91842.getClass(), "next", null);
        setField(term91746, term91746.getClass(), "propListHead", term91842);
        setField(term91746, term91746.getClass(), "first", term91746);
        setField(term91746, term91746.getClass(), "last", null);
        setIntField(term91746, term91746.getClass(), "type", 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term91746;
        callMethod(klass, "visitAssign", argTypes, term91676, args);
    }

};


