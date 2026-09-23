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

public class TypedScopeCreator_createScope_26573221573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43034;
     Object term43104;
     Object term43178;

    public TypedScopeCreator_createScope_26573221573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43034 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term43034, term43034.getClass(), "compiler", null);
        term43104 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43104, term43104.getClass(), "jsType", null);
        setIntField(term43104, term43104.getClass(), "type", 0);
        setField(term43104, term43104.getClass(), "parent", null);
        setField(term43104, term43104.getClass(), "first", null);
        term43178 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term43178, term43178.getClass(), "rootNode", null);
        setField(term43178, term43178.getClass(), "thisType", null);
        setIntField(term43178, term43178.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term43104;
        args[1] = term43178;
        try {
            callMethod(klass, "createScope", argTypes, term43034, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


