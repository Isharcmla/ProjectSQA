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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypedScopeCreator_createScope_26573221556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26719;
     Object term27079;
     Object term27223;

    public TypedScopeCreator_createScope_26573221556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26719 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term26799 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term26903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object term27009 = newInstance(Class.forName("com.google.common.collect.Multimaps$CustomMultimap"));
        setField(term26719, term26719.getClass(), "compiler", term26799);
        setField(term26903, term26903.getClass(), "unresolvedNamedTypes", term27009);
        setField(term26719, term26719.getClass(), "typeRegistry", term26903);
        term27079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term27079, term27079.getClass(), "jsType", null);
        setIntField(term27079, term27079.getClass(), "type", 0);
        setField(term27149, term27149.getClass(), "next", null);
        setIntField(term27149, term27149.getClass(), "type", 0);
        setField(term27149, term27149.getClass(), "first", null);
        setField(term27079, term27079.getClass(), "first", term27149);
        term27223 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term27293 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term27223, term27223.getClass(), "rootNode", term27293);
        setField(term27223, term27223.getClass(), "thisType", term27393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[2];
        args[0] = term27079;
        args[1] = term27223;
        try {
            callMethod(klass, "createScope", argTypes, term26719, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


