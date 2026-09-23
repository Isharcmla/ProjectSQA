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

public class TypedScopeCreator_createInitialScope_76224746470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42200;
     Object term42350;

    public TypedScopeCreator_createInitialScope_76224746470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42200 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term42280 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42200, term42200.getClass(), "compiler", term42280);
        setField(term42200, term42200.getClass(), "typeRegistry", null);
        term42350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term42350, term42350.getClass(), "type", 0);
        setField(term42350, term42350.getClass(), "parent", null);
        setField(term42350, term42350.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term42350;
        try {
            callMethod(klass, "createInitialScope", argTypes, term42200, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


