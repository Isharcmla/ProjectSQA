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

public class TypeCheck_process_1056025265389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107058;
     Object term107308;

    public TypeCheck_process_1056025265389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107058 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term107164 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term107238 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term107058, term107058.getClass(), "scopeCreator", term107164);
        setField(term107058, term107058.getClass(), "topScope", term107238);
        term107308 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term107308;
        try {
            callMethod(klass, "process", argTypes, term107058, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


