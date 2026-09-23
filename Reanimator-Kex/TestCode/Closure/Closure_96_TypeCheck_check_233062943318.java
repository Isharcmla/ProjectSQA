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

public class TypeCheck_check_233062943318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141437;
     Object term141661;

    public TypeCheck_check_233062943318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141437 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term141517 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term141591 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term141437, term141437.getClass(), "compiler", term141517);
        setField(term141437, term141437.getClass(), "scopeCreator", null);
        setBooleanField(term141437, term141437.getClass(), "inExterns", false);
        setField(term141591, term141591.getClass(), "parent", null);
        setField(term141437, term141437.getClass(), "topScope", term141591);
        term141661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term141661, term141661.getClass(), "type", 0);
        setField(term141731, term141731.getClass(), "next", term141801);
        setIntField(term141731, term141731.getClass(), "type", 10);
        setField(term141731, term141731.getClass(), "first", null);
        setField(term141661, term141661.getClass(), "first", term141731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term141661;
        args[1] = true;
        callMethod(klass, "check", argTypes, term141437, args);
    }

};


