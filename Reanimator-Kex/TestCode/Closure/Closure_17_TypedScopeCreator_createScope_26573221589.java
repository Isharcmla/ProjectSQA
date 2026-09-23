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

public class TypedScopeCreator_createScope_26573221589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67827;
     Object term67977;
     Object term68261;

    public TypedScopeCreator_createScope_26573221589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67827 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term67907 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term67827, term67827.getClass(), "compiler", term67907);
        term67977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term67977, term67977.getClass(), "jsType", null);
        setIntField(term67977, term67977.getClass(), "type", 0);
        setField(term67977, term67977.getClass(), "parent", null);
        setField(term68047, term68047.getClass(), "next", term68117);
        setIntField(term68047, term68047.getClass(), "type", 0);
        setField(term68187, term68187.getClass(), "next", null);
        setIntField(term68187, term68187.getClass(), "type", 47);
        setField(term68187, term68187.getClass(), "first", null);
        setField(term68047, term68047.getClass(), "first", term68187);
        setField(term67977, term67977.getClass(), "first", term68047);
        term68261 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term68331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68261, term68261.getClass(), "rootNode", term68331);
        setField(term68261, term68261.getClass(), "thisType", null);
        setIntField(term68261, term68261.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term67977;
        args[1] = term68261;
        callMethod(klass, "createScope", argTypes, term67827, args);
    }

};


