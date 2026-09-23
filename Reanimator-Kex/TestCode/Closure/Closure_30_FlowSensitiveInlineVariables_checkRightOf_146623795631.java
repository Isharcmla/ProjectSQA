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

public class FlowSensitiveInlineVariables_checkRightOf_146623795631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5100;
     Object term5205;
     Object term5444;
     Object term5446;

    public FlowSensitiveInlineVariables_checkRightOf_146623795631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term5205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5100, term5100.getClass(), "next", null);
        setField(term5100, term5100.getClass(), "parent", term5205);
        term5444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5445 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5444, term5444.getClass(), "type", 0);
        setField(term5444, term5444.getClass(), "next", null);
        setField(term5444, term5444.getClass(), "first", null);
        setField(term5444, term5444.getClass(), "last", null);
        setField(term5444, term5444.getClass(), "propListHead", null);
        setIntField(term5444, term5444.getClass(), "sourcePosition", 0);
        setField(term5444, term5444.getClass(), "jsType", null);
        setIntField(term5445, term5445.getClass(), "type", 0);
        setField(term5445, term5445.getClass(), "next", null);
        setField(term5445, term5445.getClass(), "first", null);
        setField(term5445, term5445.getClass(), "last", null);
        setField(term5445, term5445.getClass(), "propListHead", null);
        setIntField(term5445, term5445.getClass(), "sourcePosition", 0);
        setField(term5445, term5445.getClass(), "jsType", null);
        setField(term5445, term5445.getClass(), "parent", null);
        setField(term5444, term5444.getClass(), "parent", term5445);
        term5446 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5446, term5446.getClass(), "type", 0);
        setField(term5446, term5446.getClass(), "next", null);
        setField(term5446, term5446.getClass(), "first", null);
        setField(term5446, term5446.getClass(), "last", null);
        setField(term5446, term5446.getClass(), "propListHead", null);
        setIntField(term5446, term5446.getClass(), "sourcePosition", 0);
        setField(term5446, term5446.getClass(), "jsType", null);
        setField(term5446, term5446.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term5100;
        args[1] = term5205;
        args[2] = null;
        Object retValue = callMethod(klass, "checkRightOf", argTypes, null, args);
        assertTrue(recursiveEquals(term5100, term5444));
        assertTrue(recursiveEquals(term5205, term5446));
        assertTrue(recursiveEquals(retValue, false));
    }

};


