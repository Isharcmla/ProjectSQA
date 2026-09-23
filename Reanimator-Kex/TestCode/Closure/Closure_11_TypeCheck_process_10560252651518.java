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

public class TypeCheck_process_10560252651518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474466;
     Object term474716;

    public TypeCheck_process_10560252651518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474466 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term474572 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term474646 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term474466, term474466.getClass(), "scopeCreator", term474572);
        setField(term474646, term474646.getClass(), "parent", null);
        setField(term474466, term474466.getClass(), "topScope", term474646);
        setField(term474466, term474466.getClass(), "compiler", null);
        setBooleanField(term474466, term474466.getClass(), "inExterns", false);
        term474716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term474786 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term474716, term474716.getClass(), "parent", term474786);
        setIntField(term474716, term474716.getClass(), "type", 34);
        setField(term474716, term474716.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term474716;
        try {
            callMethod(klass, "process", argTypes, term474466, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


