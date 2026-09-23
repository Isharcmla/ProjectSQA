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

public class FunctionToBlockMutator_replaceReturnWithBreak_72549219828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3872;
     Object term4386;
     Object term4357;

    public FunctionToBlockMutator_replaceReturnWithBreak_72549219828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3872 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3964 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3872, term3872.getClass(), "type", 0);
        setField(term3872, term3872.getClass(), "first", term3964);
        term4386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4387 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4386, term4386.getClass(), "str", null);
        setIntField(term4386, term4386.getClass(), "type", 0);
        setField(term4386, term4386.getClass(), "next", null);
        setField(term4387, term4387.getClass(), "str", null);
        setIntField(term4387, term4387.getClass(), "type", 0);
        setField(term4387, term4387.getClass(), "next", null);
        setField(term4387, term4387.getClass(), "first", null);
        setField(term4387, term4387.getClass(), "last", null);
        setField(term4387, term4387.getClass(), "propListHead", null);
        setIntField(term4387, term4387.getClass(), "sourcePosition", 0);
        setField(term4387, term4387.getClass(), "jsType", null);
        setField(term4387, term4387.getClass(), "parent", null);
        setField(term4386, term4386.getClass(), "first", term4387);
        setField(term4386, term4386.getClass(), "last", null);
        setField(term4386, term4386.getClass(), "propListHead", null);
        setIntField(term4386, term4386.getClass(), "sourcePosition", 0);
        setField(term4386, term4386.getClass(), "jsType", null);
        setField(term4386, term4386.getClass(), "parent", null);
        term4357 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4359 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term4357, term4357.getClass(), "str", null);
        setIntField(term4357, term4357.getClass(), "type", 0);
        setField(term4357, term4357.getClass(), "next", null);
        setField(term4359, term4359.getClass(), "str", null);
        setIntField(term4359, term4359.getClass(), "type", 0);
        setField(term4359, term4359.getClass(), "next", null);
        setField(term4359, term4359.getClass(), "first", null);
        setField(term4359, term4359.getClass(), "last", null);
        setField(term4359, term4359.getClass(), "propListHead", null);
        setIntField(term4359, term4359.getClass(), "sourcePosition", 0);
        setField(term4359, term4359.getClass(), "jsType", null);
        setField(term4359, term4359.getClass(), "parent", null);
        setField(term4357, term4357.getClass(), "first", term4359);
        setField(term4357, term4357.getClass(), "last", null);
        setField(term4357, term4357.getClass(), "propListHead", null);
        setIntField(term4357, term4357.getClass(), "sourcePosition", 0);
        setField(term4357, term4357.getClass(), "jsType", null);
        setField(term4357, term4357.getClass(), "parent", null);
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
        args[0] = term3872;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "replaceReturnWithBreak", argTypes, null, args);
        assertTrue(recursiveEquals(term3872, term4386));
        assertTrue(recursiveEquals(retValue, term4357));
    }

};


