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
     Object term55410;
     Object term55480;
     Object term55764;

    public TypedScopeCreator_createScope_26573221577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55410 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term55410, term55410.getClass(), "compiler", null);
        term55480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55480, term55480.getClass(), "jsType", null);
        setIntField(term55480, term55480.getClass(), "type", 0);
        setField(term55480, term55480.getClass(), "parent", null);
        setField(term55620, term55620.getClass(), "next", null);
        setIntField(term55620, term55620.getClass(), "type", 125);
        setField(term55620, term55620.getClass(), "first", null);
        setField(term55620, term55620.getClass(), "parent", null);
        setField(term55550, term55550.getClass(), "next", term55620);
        setIntField(term55550, term55550.getClass(), "type", 0);
        setField(term55690, term55690.getClass(), "next", null);
        setIntField(term55690, term55690.getClass(), "type", 0);
        setField(term55690, term55690.getClass(), "first", null);
        setField(term55690, term55690.getClass(), "parent", null);
        setField(term55550, term55550.getClass(), "first", term55690);
        setField(term55550, term55550.getClass(), "parent", null);
        setField(term55480, term55480.getClass(), "first", term55550);
        term55764 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term55764, term55764.getClass(), "rootNode", null);
        setField(term55764, term55764.getClass(), "thisType", null);
        setIntField(term55764, term55764.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term55480;
        args[1] = term55764;
        try {
            callMethod(klass, "createScope", argTypes, term55410, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


