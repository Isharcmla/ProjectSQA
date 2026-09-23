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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FunctionToBlockMutator_getReplacementReturnStatement_158795101447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5639;
     Object term14771;
     Object term14764;

    public FunctionToBlockMutator_getReplacementReturnStatement_158795101447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5639 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term5731 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term5639, term5639.getClass(), "first", term5731);
        term14771 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term14772 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term14771, term14771.getClass(), "number", 0.0);
        setIntField(term14771, term14771.getClass(), "type", 0);
        setField(term14771, term14771.getClass(), "next", null);
        setDoubleField(term14772, term14772.getClass(), "number", 0.0);
        setIntField(term14772, term14772.getClass(), "type", 0);
        setField(term14772, term14772.getClass(), "next", null);
        setField(term14772, term14772.getClass(), "first", null);
        setField(term14772, term14772.getClass(), "last", null);
        setField(term14772, term14772.getClass(), "propListHead", null);
        setIntField(term14772, term14772.getClass(), "sourcePosition", 0);
        setField(term14772, term14772.getClass(), "jsType", null);
        setField(term14772, term14772.getClass(), "parent", null);
        setField(term14771, term14771.getClass(), "first", term14772);
        setField(term14771, term14771.getClass(), "last", null);
        setField(term14771, term14771.getClass(), "propListHead", null);
        setIntField(term14771, term14771.getClass(), "sourcePosition", 0);
        setField(term14771, term14771.getClass(), "jsType", null);
        setField(term14771, term14771.getClass(), "parent", null);
        term14764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14766 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term14764, term14764.getClass(), "type", 130);
        setField(term14764, term14764.getClass(), "next", null);
        setDoubleField(term14766, term14766.getClass(), "number", 0.0);
        setIntField(term14766, term14766.getClass(), "type", 0);
        setField(term14766, term14766.getClass(), "next", null);
        setField(term14766, term14766.getClass(), "first", null);
        setField(term14766, term14766.getClass(), "last", null);
        setField(term14766, term14766.getClass(), "propListHead", null);
        setIntField(term14766, term14766.getClass(), "sourcePosition", 0);
        setField(term14766, term14766.getClass(), "jsType", null);
        setField(term14766, term14766.getClass(), "parent", term14764);
        setField(term14764, term14764.getClass(), "first", term14766);
        setField(term14764, term14764.getClass(), "last", term14766);
        setField(term14764, term14764.getClass(), "propListHead", null);
        setIntField(term14764, term14764.getClass(), "sourcePosition", 0);
        setField(term14764, term14764.getClass(), "jsType", null);
        setField(term14764, term14764.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term5639;
        args[1] = null;
        Object retValue = callMethod(klass, "getReplacementReturnStatement", argTypes, null, args);
        assertTrue(recursiveEquals(term5639, term14771));
        assertTrue(recursiveEquals(retValue, term14764));
    }

};


