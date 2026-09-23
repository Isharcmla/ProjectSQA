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

public class TypedScopeCreator_createInitialScope_76224746445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13250;
     Object term13320;

    public TypedScopeCreator_createInitialScope_76224746445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13250 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term13250, term13250.getClass(), "compiler", null);
        setField(term13250, term13250.getClass(), "typeRegistry", null);
        term13320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13320, term13320.getClass(), "type", -133);
        setField(term13320, term13320.getClass(), "parent", term13390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13320;
        try {
            callMethod(klass, "createInitialScope", argTypes, term13250, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


