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

public class TypedScopeCreator_createScope_26573221567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42741;
     Object term42891;
     Object term43175;

    public TypedScopeCreator_createScope_26573221567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42741 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term42821 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term42741, term42741.getClass(), "compiler", term42821);
        term42891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term42891, term42891.getClass(), "jsType", null);
        setIntField(term42891, term42891.getClass(), "type", 0);
        setField(term42891, term42891.getClass(), "parent", null);
        setField(term43031, term43031.getClass(), "next", null);
        setIntField(term43031, term43031.getClass(), "type", 43);
        setField(term43031, term43031.getClass(), "first", null);
        setField(term42961, term42961.getClass(), "next", term43031);
        setIntField(term42961, term42961.getClass(), "type", 0);
        setField(term43101, term43101.getClass(), "next", null);
        setIntField(term43101, term43101.getClass(), "type", 0);
        setField(term43101, term43101.getClass(), "first", null);
        setField(term43101, term43101.getClass(), "parent", null);
        setField(term42961, term42961.getClass(), "first", term43101);
        setField(term42961, term42961.getClass(), "parent", null);
        setField(term42891, term42891.getClass(), "first", term42961);
        term43175 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term43175, term43175.getClass(), "rootNode", null);
        setField(term43175, term43175.getClass(), "thisType", null);
        setIntField(term43175, term43175.getClass(), "depth", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term42891;
        args[1] = term43175;
        try {
            callMethod(klass, "createScope", argTypes, term42741, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


