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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11423;
     Object term11573;
     Object term11717;

    public TypedScopeCreator_createScope_26573221536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11423 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term11503 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term11423, term11423.getClass(), "compiler", term11503);
        term11573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11573, term11573.getClass(), "jsType", null);
        setIntField(term11573, term11573.getClass(), "type", 0);
        setField(term11573, term11573.getClass(), "parent", null);
        setField(term11643, term11643.getClass(), "next", null);
        setIntField(term11643, term11643.getClass(), "type", 105);
        setField(term11573, term11573.getClass(), "first", term11643);
        term11717 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term11787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term11717, term11717.getClass(), "rootNode", term11787);
        setField(term11717, term11717.getClass(), "thisType", term11887);
        setIntField(term11717, term11717.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term11573;
        args[1] = term11717;
        try {
            callMethod(klass, "createScope", argTypes, term11423, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


