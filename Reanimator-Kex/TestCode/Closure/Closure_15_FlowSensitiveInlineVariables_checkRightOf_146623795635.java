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

public class FlowSensitiveInlineVariables_checkRightOf_146623795635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5370;
     Object term6783;

    public FlowSensitiveInlineVariables_checkRightOf_146623795635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5370 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5370, term5370.getClass(), "next", null);
        setField(term5370, term5370.getClass(), "parent", term5440);
        term6783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6783, term6783.getClass(), "type", 0);
        setField(term6783, term6783.getClass(), "next", null);
        setField(term6783, term6783.getClass(), "first", null);
        setField(term6783, term6783.getClass(), "last", null);
        setField(term6783, term6783.getClass(), "propListHead", null);
        setIntField(term6783, term6783.getClass(), "sourcePosition", 0);
        setField(term6783, term6783.getClass(), "jsType", null);
        setIntField(term6784, term6784.getClass(), "type", 0);
        setField(term6784, term6784.getClass(), "next", null);
        setField(term6784, term6784.getClass(), "first", null);
        setField(term6784, term6784.getClass(), "last", null);
        setField(term6784, term6784.getClass(), "propListHead", null);
        setIntField(term6784, term6784.getClass(), "sourcePosition", 0);
        setField(term6784, term6784.getClass(), "jsType", null);
        setField(term6784, term6784.getClass(), "parent", null);
        setField(term6783, term6783.getClass(), "parent", term6784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term5370;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term5370, term6783));
        assertTrue(recursiveEquals(retValue, false));
    }

};


