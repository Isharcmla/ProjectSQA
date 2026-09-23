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

public class TypeCheck_process_10560252651178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340878;
     Object term341128;

    public TypeCheck_process_10560252651178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term340878 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term340984 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term341058 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term340878, term340878.getClass(), "scopeCreator", term340984);
        setField(term341058, term341058.getClass(), "parent", null);
        setField(term340878, term340878.getClass(), "topScope", term341058);
        setField(term340878, term340878.getClass(), "compiler", null);
        setBooleanField(term340878, term340878.getClass(), "inExterns", false);
        term341128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term341128, term341128.getClass(), "parent", term341198);
        setIntField(term341128, term341128.getClass(), "type", 15);
        setField(term341128, term341128.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term341128;
        try {
            callMethod(klass, "process", argTypes, term340878, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


