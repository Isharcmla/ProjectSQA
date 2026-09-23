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

public class TypedScopeCreator_createInitialScope_76224746499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62930;
     Object term63000;

    public TypedScopeCreator_createInitialScope_76224746499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62930 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term62930, term62930.getClass(), "compiler", null);
        setField(term62930, term62930.getClass(), "typeRegistry", null);
        term63000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term63000, term63000.getClass(), "type", 0);
        setField(term63000, term63000.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term63000;
        try {
            callMethod(klass, "createInitialScope", argTypes, term62930, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


