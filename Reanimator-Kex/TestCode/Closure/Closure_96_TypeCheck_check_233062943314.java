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

public class TypeCheck_check_233062943314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138390;
     Object term138720;

    public TypeCheck_check_233062943314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138390 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term138470 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term138576 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term138650 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term138390, term138390.getClass(), "compiler", term138470);
        setField(term138390, term138390.getClass(), "scopeCreator", term138576);
        setBooleanField(term138390, term138390.getClass(), "inExterns", false);
        setField(term138650, term138650.getClass(), "parent", null);
        setField(term138390, term138390.getClass(), "topScope", term138650);
        term138720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term138930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term138720, term138720.getClass(), "type", 0);
        setField(term138860, term138860.getClass(), "next", term138930);
        setIntField(term138860, term138860.getClass(), "type", 153);
        setField(term138860, term138860.getClass(), "first", null);
        setField(term138790, term138790.getClass(), "next", term138860);
        setIntField(term138790, term138790.getClass(), "type", 77);
        setField(term138790, term138790.getClass(), "first", null);
        setField(term138720, term138720.getClass(), "first", term138790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term138720;
        args[1] = true;
        callMethod(klass, "check", argTypes, term138390, args);
    }

};


