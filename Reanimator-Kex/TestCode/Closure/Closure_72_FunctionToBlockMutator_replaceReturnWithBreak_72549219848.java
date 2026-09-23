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

public class FunctionToBlockMutator_replaceReturnWithBreak_72549219848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5824;
     Object term14798;
     Object term14774;

    public FunctionToBlockMutator_replaceReturnWithBreak_72549219848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5824, term5824.getClass(), "type", 0);
        setIntField(term5894, term5894.getClass(), "type", 105);
        setField(term5824, term5824.getClass(), "first", term5894);
        term14798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14798, term14798.getClass(), "type", 0);
        setField(term14798, term14798.getClass(), "next", null);
        setIntField(term14799, term14799.getClass(), "type", 105);
        setField(term14799, term14799.getClass(), "next", null);
        setField(term14799, term14799.getClass(), "first", null);
        setField(term14799, term14799.getClass(), "last", null);
        setField(term14799, term14799.getClass(), "propListHead", null);
        setIntField(term14799, term14799.getClass(), "sourcePosition", 0);
        setField(term14799, term14799.getClass(), "jsType", null);
        setField(term14799, term14799.getClass(), "parent", null);
        setField(term14798, term14798.getClass(), "first", term14799);
        setField(term14798, term14798.getClass(), "last", null);
        setField(term14798, term14798.getClass(), "propListHead", null);
        setIntField(term14798, term14798.getClass(), "sourcePosition", 0);
        setField(term14798, term14798.getClass(), "jsType", null);
        setField(term14798, term14798.getClass(), "parent", null);
        term14774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14774, term14774.getClass(), "type", 0);
        setField(term14774, term14774.getClass(), "next", null);
        setIntField(term14776, term14776.getClass(), "type", 105);
        setField(term14776, term14776.getClass(), "next", null);
        setField(term14776, term14776.getClass(), "first", null);
        setField(term14776, term14776.getClass(), "last", null);
        setField(term14776, term14776.getClass(), "propListHead", null);
        setIntField(term14776, term14776.getClass(), "sourcePosition", 0);
        setField(term14776, term14776.getClass(), "jsType", null);
        setField(term14776, term14776.getClass(), "parent", null);
        setField(term14774, term14774.getClass(), "first", term14776);
        setField(term14774, term14774.getClass(), "last", null);
        setField(term14774, term14774.getClass(), "propListHead", null);
        setIntField(term14774, term14774.getClass(), "sourcePosition", 0);
        setField(term14774, term14774.getClass(), "jsType", null);
        setField(term14774, term14774.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term5824;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "replaceReturnWithBreak", argTypes, null, args);
        assertTrue(recursiveEquals(term5824, term14798));
        assertTrue(recursiveEquals(retValue, term14774));
    }

};


