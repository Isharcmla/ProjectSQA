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

public class FlowSensitiveInlineVariables_checkRightOf_146623795632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4112;
     Object term4224;

    public FlowSensitiveInlineVariables_checkRightOf_146623795632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4182 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4112, term4112.getClass(), "next", null);
        setField(term4112, term4112.getClass(), "parent", term4182);
        term4224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4224, term4224.getClass(), "type", 0);
        setField(term4224, term4224.getClass(), "next", null);
        setField(term4224, term4224.getClass(), "first", null);
        setField(term4224, term4224.getClass(), "last", null);
        setField(term4224, term4224.getClass(), "propListHead", null);
        setIntField(term4224, term4224.getClass(), "sourcePosition", 0);
        setField(term4224, term4224.getClass(), "jsType", null);
        setIntField(term4225, term4225.getClass(), "type", 0);
        setField(term4225, term4225.getClass(), "next", null);
        setField(term4225, term4225.getClass(), "first", null);
        setField(term4225, term4225.getClass(), "last", null);
        setField(term4225, term4225.getClass(), "propListHead", null);
        setIntField(term4225, term4225.getClass(), "sourcePosition", 0);
        setField(term4225, term4225.getClass(), "jsType", null);
        setField(term4225, term4225.getClass(), "parent", null);
        setField(term4224, term4224.getClass(), "parent", term4225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4112;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term4112, term4224));
        assertTrue(recursiveEquals(retValue, false));
    }

};


