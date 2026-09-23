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

public class TypeCheck_process_10560252651141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330777;
     Object term331105;

    public TypeCheck_process_10560252651141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330777 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term330881 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term330955 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term331035 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term330777, term330777.getClass(), "scopeCreator", term330881);
        setField(term330955, term330955.getClass(), "parent", null);
        setField(term330777, term330777.getClass(), "topScope", term330955);
        setField(term330777, term330777.getClass(), "compiler", term331035);
        setBooleanField(term330777, term330777.getClass(), "inExterns", false);
        term331105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term331175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term331105, term331105.getClass(), "parent", term331175);
        setIntField(term331105, term331105.getClass(), "type", 9);
        setField(term331105, term331105.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term331105;
        try {
            callMethod(klass, "process", argTypes, term330777, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


