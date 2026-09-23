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

public class FlowSensitiveInlineVariables_checkLeftOf_103352364764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14980;
     Object term15226;
     Object term17071;
     Object term17074;

    public FlowSensitiveInlineVariables_checkLeftOf_103352364764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term15050, term15050.getClass(), "parent", term15050);
        setField(term15050, term15050.getClass(), "first", term15120);
        setField(term14980, term14980.getClass(), "parent", term15050);
        term15226 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$1"));
        term17071 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17071, term17071.getClass(), "type", 0);
        setField(term17071, term17071.getClass(), "next", null);
        setField(term17071, term17071.getClass(), "first", null);
        setField(term17071, term17071.getClass(), "last", null);
        setField(term17071, term17071.getClass(), "propListHead", null);
        setIntField(term17071, term17071.getClass(), "sourcePosition", 0);
        setField(term17071, term17071.getClass(), "jsType", null);
        setIntField(term17072, term17072.getClass(), "type", 0);
        setField(term17072, term17072.getClass(), "next", null);
        setIntField(term17073, term17073.getClass(), "type", 0);
        setField(term17073, term17073.getClass(), "next", null);
        setField(term17073, term17073.getClass(), "first", null);
        setField(term17073, term17073.getClass(), "last", null);
        setField(term17073, term17073.getClass(), "propListHead", null);
        setIntField(term17073, term17073.getClass(), "sourcePosition", 0);
        setField(term17073, term17073.getClass(), "jsType", null);
        setField(term17073, term17073.getClass(), "parent", null);
        setField(term17072, term17072.getClass(), "first", term17073);
        setField(term17072, term17072.getClass(), "last", null);
        setField(term17072, term17072.getClass(), "propListHead", null);
        setIntField(term17072, term17072.getClass(), "sourcePosition", 0);
        setField(term17072, term17072.getClass(), "jsType", null);
        setField(term17072, term17072.getClass(), "parent", term17072);
        setField(term17071, term17071.getClass(), "parent", term17072);
        term17074 = newInstance(Class.forName("com.google.javascript.jscomp.SideEffectsAnalysis$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term14980;
        args[1] = null;
        args[2] = term15226;
        Object retValue = callMethod(klass, "checkLeftOf", argTypes, null, args);
        assertTrue(recursiveEquals(term14980, term17071));
        assertTrue(recursiveEquals(term15226, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


