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

public class TypeCheck_check_233062943313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137780;
     Object term138004;

    public TypeCheck_check_233062943313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137780 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term137860 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term137934 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term137780, term137780.getClass(), "compiler", term137860);
        setField(term137780, term137780.getClass(), "scopeCreator", null);
        setBooleanField(term137780, term137780.getClass(), "inExterns", false);
        setField(term137934, term137934.getClass(), "parent", null);
        setField(term137780, term137780.getClass(), "topScope", term137934);
        term138004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138004, term138004.getClass(), "type", 0);
        setField(term138074, term138074.getClass(), "next", term138144);
        setIntField(term138074, term138074.getClass(), "type", 58);
        setField(term138074, term138074.getClass(), "first", null);
        setField(term138004, term138004.getClass(), "first", term138074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term138004;
        args[1] = true;
        callMethod(klass, "check", argTypes, term137780, args);
    }

};


