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

public class CheckSideEffects_process_152266774637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15105;
     Object term15175;
     Object term15761;
     Object term15762;

    public CheckSideEffects_process_152266774637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15105 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term15105, term15105.getClass(), "compiler", null);
        term15175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15175, term15175.getClass(), "type", 124);
        setField(term15175, term15175.getClass(), "parent", null);
        setField(term15175, term15175.getClass(), "first", null);
        term15761 = newInstance(Class.forName("com.google.javascript.jscomp.CheckSideEffects"));
        setField(term15761, term15761.getClass(), "level", null);
        setField(term15761, term15761.getClass(), "problemNodes", null);
        setField(term15761, term15761.getClass(), "compiler", null);
        setBooleanField(term15761, term15761.getClass(), "protectSideEffectFreeCode", false);
        term15762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15762, term15762.getClass(), "type", 124);
        setField(term15762, term15762.getClass(), "next", null);
        setField(term15762, term15762.getClass(), "first", null);
        setField(term15762, term15762.getClass(), "last", null);
        setField(term15762, term15762.getClass(), "propListHead", null);
        setIntField(term15762, term15762.getClass(), "sourcePosition", 0);
        setField(term15762, term15762.getClass(), "jsType", null);
        setField(term15762, term15762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term15175;
        callMethod(klass, "process", argTypes, term15105, args);
        assertTrue(recursiveEquals(term15105, term15761));
        assertTrue(recursiveEquals(term15175, null));
    }

};


