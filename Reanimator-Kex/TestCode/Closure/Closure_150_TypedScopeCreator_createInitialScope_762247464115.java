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

public class TypedScopeCreator_createInitialScope_762247464115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69258;
     Object term69432;

    public TypedScopeCreator_createInitialScope_762247464115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69258 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term69362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term69258, term69258.getClass(), "compiler", null);
        setField(term69258, term69258.getClass(), "typeRegistry", term69362);
        term69432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69572 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term69432, term69432.getClass(), "type", 0);
        setField(term69572, term69572.getClass(), "next", null);
        setIntField(term69572, term69572.getClass(), "type", 0);
        setField(term69572, term69572.getClass(), "first", term69642);
        setField(term69502, term69502.getClass(), "next", term69572);
        setIntField(term69502, term69502.getClass(), "type", 0);
        setField(term69712, term69712.getClass(), "next", null);
        setIntField(term69712, term69712.getClass(), "type", 0);
        setField(term69712, term69712.getClass(), "first", null);
        setField(term69502, term69502.getClass(), "first", term69712);
        setField(term69432, term69432.getClass(), "first", term69502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term69432;
        try {
            callMethod(klass, "createInitialScope", argTypes, term69258, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


