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

public class TypedScopeCreator_createScope_26573221554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16713;
     Object term16863;
     Object term17007;

    public TypedScopeCreator_createScope_26573221554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16713 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term16793 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term16713, term16713.getClass(), "compiler", term16793);
        term16863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16863, term16863.getClass(), "type", -133);
        setField(term16863, term16863.getClass(), "parent", term16933);
        term17007 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term17077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17007, term17007.getClass(), "rootNode", term17077);
        setIntField(term17007, term17007.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term16863;
        args[1] = term17007;
        try {
            callMethod(klass, "createScope", argTypes, term16713, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


