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

public class TypeCheck_process_1056025265912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238854;
     Object term239096;

    public TypeCheck_process_1056025265912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238854 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term238952 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term239026 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term238854, term238854.getClass(), "scopeCreator", term238952);
        setField(term239026, term239026.getClass(), "parent", null);
        setField(term238854, term238854.getClass(), "topScope", term239026);
        setField(term238854, term238854.getClass(), "compiler", null);
        setBooleanField(term238854, term238854.getClass(), "inExterns", false);
        term239096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term239166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term239096, term239096.getClass(), "parent", term239166);
        setIntField(term239096, term239096.getClass(), "type", 145);
        setField(term239096, term239096.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term239096;
        try {
            callMethod(klass, "process", argTypes, term238854, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


