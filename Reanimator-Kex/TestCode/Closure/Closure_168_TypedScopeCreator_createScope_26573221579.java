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

public class TypedScopeCreator_createScope_26573221579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48567;
     Object term48659;

    public TypedScopeCreator_createScope_26573221579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48567 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term48567, term48567.getClass(), "compiler", null);
        setField(term48567, term48567.getClass(), "functionAnalysisResults", null);
        term48659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term48659;
        args[1] = null;
        try {
            callMethod(klass, "createScope", argTypes, term48567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


