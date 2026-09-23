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

public class TypedScopeCreator_createScope_265732215107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69000;
     Object term69070;
     Object term69144;

    public TypedScopeCreator_createScope_265732215107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69000 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term69000, term69000.getClass(), "compiler", null);
        term69070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69070, term69070.getClass(), "jsType", null);
        setIntField(term69070, term69070.getClass(), "type", 0);
        setField(term69070, term69070.getClass(), "first", null);
        term69144 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term69214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term69144, term69144.getClass(), "rootNode", term69214);
        setField(term69144, term69144.getClass(), "thisType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term69070;
        args[1] = term69144;
        try {
            callMethod(klass, "createScope", argTypes, term69000, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


