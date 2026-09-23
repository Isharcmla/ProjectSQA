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

public class FunctionToBlockMutator_replaceReturnWithBreak_72549219841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4469;
     Object term14355;
     Object term14351;

    public FunctionToBlockMutator_replaceReturnWithBreak_72549219841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4469, term4469.getClass(), "type", 105);
        term14355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14355, term14355.getClass(), "type", 105);
        setField(term14355, term14355.getClass(), "next", null);
        setField(term14355, term14355.getClass(), "first", null);
        setField(term14355, term14355.getClass(), "last", null);
        setField(term14355, term14355.getClass(), "propListHead", null);
        setIntField(term14355, term14355.getClass(), "sourcePosition", 0);
        setField(term14355, term14355.getClass(), "jsType", null);
        setField(term14355, term14355.getClass(), "parent", null);
        term14351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14351, term14351.getClass(), "type", 105);
        setField(term14351, term14351.getClass(), "next", null);
        setField(term14351, term14351.getClass(), "first", null);
        setField(term14351, term14351.getClass(), "last", null);
        setField(term14351, term14351.getClass(), "propListHead", null);
        setIntField(term14351, term14351.getClass(), "sourcePosition", 0);
        setField(term14351, term14351.getClass(), "jsType", null);
        setField(term14351, term14351.getClass(), "parent", null);
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
        args[0] = term4469;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "replaceReturnWithBreak", argTypes, null, args);
        assertTrue(recursiveEquals(term4469, term14355));
        assertTrue(recursiveEquals(retValue, term14351));
    }

};


