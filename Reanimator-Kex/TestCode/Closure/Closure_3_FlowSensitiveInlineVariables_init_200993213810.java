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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FlowSensitiveInlineVariables_init_200993213810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530;

    public FlowSensitiveInlineVariables_init_200993213810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term532 = new HashMap();
        Set<Object> term533 =  ((Map) term532).keySet();
        HashSet term531 = new HashSet((Collection<? extends Object>) term533);
        term530 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term530, term530.getClass(), "compiler", null);
        setField(term530, term530.getClass(), "inlinedNewDependencies", term531);
        setField(term530, term530.getClass(), "cfg", null);
        setField(term530, term530.getClass(), "candidates", null);
        setField(term530, term530.getClass(), "reachingDef", null);
        setField(term530, term530.getClass(), "reachingUses", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term530));
    }

};


