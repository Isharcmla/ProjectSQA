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

public class TypedScopeCreator_createScope_26573221563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26802;
     Object term26952;
     Object term27096;

    public TypedScopeCreator_createScope_26573221563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26802 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term26882 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26882, term26882.getClass(), "phaseOptimizer", null);
        setField(term26802, term26802.getClass(), "compiler", term26882);
        term26952 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26952, term26952.getClass(), "type", 0);
        setIntField(term27022, term27022.getClass(), "type", 0);
        setField(term27022, term27022.getClass(), "parent", null);
        setField(term26952, term26952.getClass(), "parent", term27022);
        setField(term26952, term26952.getClass(), "first", null);
        term27096 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term27166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27096, term27096.getClass(), "rootNode", term27166);
        setIntField(term27096, term27096.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term26952;
        args[1] = term27096;
        callMethod(klass, "createScope", argTypes, term26802, args);
    }

};


