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

public class CheckSideEffects_process_152266774676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33823;
     Object term33893;
     Object term173188;
     Object term173189;

    public CheckSideEffects_process_152266774676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33823 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term33823, term33823.getClass(), "compiler", null);
        term33893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term33893, term33893.getClass(), "type", 0);
        setField(term33893, term33893.getClass(), "parent", null);
        setField(term33893, term33893.getClass(), "first", null);
        term173188 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term173188, term173188.getClass(), "level", null);
        setField(term173188, term173188.getClass(), "problemNodes", null);
        setField(term173188, term173188.getClass(), "compiler", null);
        setBooleanField(term173188, term173188.getClass(), "protectSideEffectFreeCode", false);
        term173189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term173189, term173189.getClass(), "type", 0);
        setField(term173189, term173189.getClass(), "next", null);
        setField(term173189, term173189.getClass(), "first", null);
        setField(term173189, term173189.getClass(), "last", null);
        setField(term173189, term173189.getClass(), "propListHead", null);
        setIntField(term173189, term173189.getClass(), "sourcePosition", 0);
        setField(term173189, term173189.getClass(), "jsType", null);
        setField(term173189, term173189.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term33893;
        callMethod(klass, "process", argTypes, term33823, args);
        assertTrue(recursiveEquals(term33823, term173188));
        assertTrue(recursiveEquals(term33893, null));
    }

};


