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

public class TypeCheck_check_233062943317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140621;
     Object term140949;

    public TypeCheck_check_233062943317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140621 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term140701 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term140805 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term140879 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term140621, term140621.getClass(), "compiler", term140701);
        setField(term140621, term140621.getClass(), "scopeCreator", term140805);
        setBooleanField(term140621, term140621.getClass(), "inExterns", false);
        setField(term140879, term140879.getClass(), "parent", null);
        setField(term140621, term140621.getClass(), "topScope", term140879);
        term140949 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140949, term140949.getClass(), "type", 0);
        setField(term141159, term141159.getClass(), "next", term141229);
        setIntField(term141159, term141159.getClass(), "type", 111);
        setField(term141159, term141159.getClass(), "first", null);
        setField(term141089, term141089.getClass(), "next", term141159);
        setIntField(term141089, term141089.getClass(), "type", 108);
        setField(term141089, term141089.getClass(), "first", null);
        setField(term141019, term141019.getClass(), "next", term141089);
        setIntField(term141019, term141019.getClass(), "type", 130);
        setField(term141019, term141019.getClass(), "first", null);
        setField(term140949, term140949.getClass(), "first", term141019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term140949;
        args[1] = true;
        callMethod(klass, "check", argTypes, term140621, args);
    }

};


