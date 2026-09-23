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

public class TypedScopeCreator_createScope_26573221553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27235;
     Object term27305;
     Object term27589;

    public TypedScopeCreator_createScope_26573221553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27235 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term27235, term27235.getClass(), "compiler", null);
        term27305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27305, term27305.getClass(), "jsType", null);
        setIntField(term27305, term27305.getClass(), "type", 0);
        setField(term27305, term27305.getClass(), "parent", null);
        setField(term27375, term27375.getClass(), "next", term27445);
        setIntField(term27375, term27375.getClass(), "type", 0);
        setField(term27515, term27515.getClass(), "next", null);
        setIntField(term27515, term27515.getClass(), "type", 39);
        setField(term27515, term27515.getClass(), "first", null);
        setField(term27375, term27375.getClass(), "first", term27515);
        setField(term27305, term27305.getClass(), "first", term27375);
        term27589 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term27659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27589, term27589.getClass(), "rootNode", term27659);
        setField(term27589, term27589.getClass(), "thisType", null);
        setIntField(term27589, term27589.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27305;
        args[1] = term27589;
        try {
            callMethod(klass, "createScope", argTypes, term27235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


