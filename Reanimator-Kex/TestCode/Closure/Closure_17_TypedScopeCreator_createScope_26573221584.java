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

public class TypedScopeCreator_createScope_26573221584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63255;
     Object term63405;
     Object term63759;

    public TypedScopeCreator_createScope_26573221584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63255 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term63335 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term63255, term63255.getClass(), "compiler", term63335);
        term63405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term63405, term63405.getClass(), "jsType", null);
        setIntField(term63405, term63405.getClass(), "type", 0);
        setField(term63405, term63405.getClass(), "parent", null);
        setField(term63475, term63475.getClass(), "next", null);
        setIntField(term63475, term63475.getClass(), "type", 0);
        setField(term63545, term63545.getClass(), "next", term63615);
        setIntField(term63545, term63545.getClass(), "type", 0);
        setField(term63545, term63545.getClass(), "first", term63685);
        setField(term63475, term63475.getClass(), "first", term63545);
        setField(term63405, term63405.getClass(), "first", term63475);
        term63759 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term63759, term63759.getClass(), "rootNode", null);
        setField(term63759, term63759.getClass(), "thisType", null);
        setIntField(term63759, term63759.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term63405;
        args[1] = term63759;
        callMethod(klass, "createScope", argTypes, term63255, args);
    }

};


