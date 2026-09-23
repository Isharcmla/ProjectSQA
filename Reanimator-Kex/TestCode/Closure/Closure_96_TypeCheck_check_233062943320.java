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

public class TypeCheck_check_233062943320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142215;
     Object term142359;

    public TypeCheck_check_233062943320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142215 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term142289 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term142215, term142215.getClass(), "compiler", null);
        setField(term142215, term142215.getClass(), "scopeCreator", null);
        setBooleanField(term142215, term142215.getClass(), "inExterns", false);
        setField(term142289, term142289.getClass(), "parent", null);
        setField(term142215, term142215.getClass(), "topScope", term142289);
        term142359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term142569 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term142359, term142359.getClass(), "type", 0);
        setField(term142569, term142569.getClass(), "next", null);
        setIntField(term142569, term142569.getClass(), "type", 101);
        setField(term142569, term142569.getClass(), "first", null);
        setField(term142499, term142499.getClass(), "next", term142569);
        setIntField(term142499, term142499.getClass(), "type", 108);
        setField(term142499, term142499.getClass(), "first", null);
        setField(term142429, term142429.getClass(), "next", term142499);
        setIntField(term142429, term142429.getClass(), "type", 130);
        setField(term142429, term142429.getClass(), "first", null);
        setField(term142359, term142359.getClass(), "first", term142429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term142359;
        args[1] = true;
        callMethod(klass, "check", argTypes, term142215, args);
    }

};


