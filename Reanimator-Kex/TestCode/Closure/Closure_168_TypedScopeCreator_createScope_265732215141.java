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
import java.util.HashMap;

public class TypedScopeCreator_createScope_265732215141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89595;
     Object term89793;
     Object term89937;

    public TypedScopeCreator_createScope_265732215141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term89723 = new HashMap();
        term89595 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term89675 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term89595, term89595.getClass(), "compiler", term89675);
        setField(term89595, term89595.getClass(), "functionAnalysisResults", term89723);
        term89793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term89793, term89793.getClass(), "jsType", null);
        setIntField(term89793, term89793.getClass(), "type", 126);
        setField(term89793, term89793.getClass(), "parent", null);
        setIntField(term89863, term89863.getClass(), "type", 0);
        setField(term89863, term89863.getClass(), "next", null);
        setField(term89863, term89863.getClass(), "first", null);
        setField(term89863, term89863.getClass(), "parent", null);
        setField(term89793, term89793.getClass(), "first", term89863);
        term89937 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term90007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term89937, term89937.getClass(), "rootNode", term90007);
        setField(term89937, term89937.getClass(), "thisType", term90115);
        setIntField(term89937, term89937.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term89793;
        args[1] = term89937;
        try {
            callMethod(klass, "createScope", argTypes, term89595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


