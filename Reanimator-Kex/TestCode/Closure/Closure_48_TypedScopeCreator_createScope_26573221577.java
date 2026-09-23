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

public class TypedScopeCreator_createScope_26573221577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42785;
     Object term42877;
     Object term43043;

    public TypedScopeCreator_createScope_26573221577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42785 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term42785, term42785.getClass(), "compiler", null);
        term42877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term42969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term42877, term42877.getClass(), "jsType", null);
        setIntField(term42877, term42877.getClass(), "type", -133);
        setField(term42877, term42877.getClass(), "parent", term42969);
        term43043 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term43043, term43043.getClass(), "rootNode", null);
        setField(term43043, term43043.getClass(), "thisType", null);
        setIntField(term43043, term43043.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42877;
        args[1] = term43043;
        try {
            callMethod(klass, "createScope", argTypes, term42785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


