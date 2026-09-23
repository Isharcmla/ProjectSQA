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

public class FlowSensitiveInlineVariables_checkRightOf_146623795646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8094;
     Object term10695;

    public FlowSensitiveInlineVariables_checkRightOf_146623795646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8094, term8094.getClass(), "next", null);
        setField(term8094, term8094.getClass(), "parent", term8164);
        term10695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10695, term10695.getClass(), "type", 0);
        setField(term10695, term10695.getClass(), "next", null);
        setField(term10695, term10695.getClass(), "first", null);
        setField(term10695, term10695.getClass(), "last", null);
        setField(term10695, term10695.getClass(), "propListHead", null);
        setIntField(term10695, term10695.getClass(), "sourcePosition", 0);
        setField(term10695, term10695.getClass(), "jsType", null);
        setIntField(term10696, term10696.getClass(), "type", 0);
        setField(term10696, term10696.getClass(), "next", null);
        setField(term10696, term10696.getClass(), "first", null);
        setField(term10696, term10696.getClass(), "last", null);
        setField(term10696, term10696.getClass(), "propListHead", null);
        setIntField(term10696, term10696.getClass(), "sourcePosition", 0);
        setField(term10696, term10696.getClass(), "jsType", null);
        setField(term10696, term10696.getClass(), "parent", null);
        setField(term10695, term10695.getClass(), "parent", term10696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term8094;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term8094, term10695));
        assertTrue(recursiveEquals(retValue, false));
    }

};


