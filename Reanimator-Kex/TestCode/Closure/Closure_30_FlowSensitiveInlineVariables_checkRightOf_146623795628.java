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

public class FlowSensitiveInlineVariables_checkRightOf_146623795628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4663;
     Object term5005;

    public FlowSensitiveInlineVariables_checkRightOf_146623795628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4663, term4663.getClass(), "next", null);
        setField(term4663, term4663.getClass(), "parent", term4733);
        term5005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5005, term5005.getClass(), "type", 0);
        setField(term5005, term5005.getClass(), "next", null);
        setField(term5005, term5005.getClass(), "first", null);
        setField(term5005, term5005.getClass(), "last", null);
        setField(term5005, term5005.getClass(), "propListHead", null);
        setIntField(term5005, term5005.getClass(), "sourcePosition", 0);
        setField(term5005, term5005.getClass(), "jsType", null);
        setIntField(term5006, term5006.getClass(), "type", 0);
        setField(term5006, term5006.getClass(), "next", null);
        setField(term5006, term5006.getClass(), "first", null);
        setField(term5006, term5006.getClass(), "last", null);
        setField(term5006, term5006.getClass(), "propListHead", null);
        setIntField(term5006, term5006.getClass(), "sourcePosition", 0);
        setField(term5006, term5006.getClass(), "jsType", null);
        setField(term5006, term5006.getClass(), "parent", null);
        setField(term5005, term5005.getClass(), "parent", term5006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4663;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term4663, term5005));
        assertTrue(recursiveEquals(retValue, false));
    }

};


