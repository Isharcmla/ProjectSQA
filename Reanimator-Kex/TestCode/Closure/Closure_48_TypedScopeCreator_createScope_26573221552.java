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

public class TypedScopeCreator_createScope_26573221552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23371;
     Object term23441;
     Object term23585;

    public TypedScopeCreator_createScope_26573221552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23371 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term23371, term23371.getClass(), "compiler", null);
        term23441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23441, term23441.getClass(), "jsType", null);
        setIntField(term23441, term23441.getClass(), "type", -133);
        setField(term23441, term23441.getClass(), "parent", term23511);
        term23585 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term23655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term23585, term23585.getClass(), "rootNode", term23655);
        setField(term23585, term23585.getClass(), "thisType", null);
        setIntField(term23585, term23585.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term23441;
        args[1] = term23585;
        try {
            callMethod(klass, "createScope", argTypes, term23371, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


