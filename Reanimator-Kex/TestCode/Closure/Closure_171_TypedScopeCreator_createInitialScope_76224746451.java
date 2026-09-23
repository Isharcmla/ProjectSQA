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

public class TypedScopeCreator_createInitialScope_76224746451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15795;
     Object term15865;

    public TypedScopeCreator_createInitialScope_76224746451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15795 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term15795, term15795.getClass(), "compiler", null);
        setField(term15795, term15795.getClass(), "typeRegistry", null);
        term15865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15865, term15865.getClass(), "type", -133);
        setField(term15865, term15865.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15865;
        try {
            callMethod(klass, "createInitialScope", argTypes, term15795, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


