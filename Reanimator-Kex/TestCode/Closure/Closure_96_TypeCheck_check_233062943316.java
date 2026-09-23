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

public class TypeCheck_check_233062943316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139828;
     Object term140156;

    public TypeCheck_check_233062943316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139828 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term139908 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term140012 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term140086 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term139828, term139828.getClass(), "compiler", term139908);
        setField(term139828, term139828.getClass(), "scopeCreator", term140012);
        setBooleanField(term139828, term139828.getClass(), "inExterns", false);
        setField(term140086, term140086.getClass(), "parent", null);
        setField(term139828, term139828.getClass(), "topScope", term140086);
        term140156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term140156, term140156.getClass(), "type", 0);
        setField(term140296, term140296.getClass(), "next", term140366);
        setIntField(term140296, term140296.getClass(), "type", 15);
        setField(term140296, term140296.getClass(), "first", null);
        setField(term140226, term140226.getClass(), "next", term140296);
        setIntField(term140226, term140226.getClass(), "type", 130);
        setField(term140226, term140226.getClass(), "first", null);
        setField(term140156, term140156.getClass(), "first", term140226);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term140156;
        args[1] = true;
        callMethod(klass, "check", argTypes, term139828, args);
    }

};


