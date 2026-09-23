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

public class FunctionToBlockMutator_replaceReturnWithBreak_72549219845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5323;
     Object term14594;
     Object term14588;

    public FunctionToBlockMutator_replaceReturnWithBreak_72549219845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5323, term5323.getClass(), "type", 130);
        term14594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14594, term14594.getClass(), "type", 130);
        setField(term14594, term14594.getClass(), "next", null);
        setField(term14594, term14594.getClass(), "first", null);
        setField(term14594, term14594.getClass(), "last", null);
        setField(term14594, term14594.getClass(), "propListHead", null);
        setIntField(term14594, term14594.getClass(), "sourcePosition", 0);
        setField(term14594, term14594.getClass(), "jsType", null);
        setField(term14594, term14594.getClass(), "parent", null);
        term14588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14588, term14588.getClass(), "type", 130);
        setField(term14588, term14588.getClass(), "next", null);
        setField(term14588, term14588.getClass(), "first", null);
        setField(term14588, term14588.getClass(), "last", null);
        setField(term14588, term14588.getClass(), "propListHead", null);
        setIntField(term14588, term14588.getClass(), "sourcePosition", 0);
        setField(term14588, term14588.getClass(), "jsType", null);
        setField(term14588, term14588.getClass(), "parent", null);
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
        args[0] = term5323;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "replaceReturnWithBreak", argTypes, null, args);
        assertTrue(recursiveEquals(term5323, term14594));
        assertTrue(recursiveEquals(retValue, term14588));
    }

};


