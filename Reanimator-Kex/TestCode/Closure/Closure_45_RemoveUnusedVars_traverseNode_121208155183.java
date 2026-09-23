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
import java.lang.Object;

public class RemoveUnusedVars_traverseNode_121208155183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19581;
     Object term19651;

    public RemoveUnusedVars_traverseNode_121208155183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19581 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term19651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19861 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19651, term19651.getClass(), "type", 58434042);
        setIntField(term19721, term19721.getClass(), "type", -58434043);
        setIntField(term19791, term19791.getClass(), "type", 64);
        setField(term19791, term19791.getClass(), "first", null);
        setField(term19791, term19791.getClass(), "next", null);
        setField(term19721, term19721.getClass(), "first", term19791);
        setIntField(term19861, term19861.getClass(), "type", 64);
        setField(term19861, term19861.getClass(), "first", null);
        setField(term19861, term19861.getClass(), "next", term19861);
        setField(term19721, term19721.getClass(), "next", term19861);
        setField(term19651, term19651.getClass(), "first", term19721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term19651;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term19581, args);
    }

};


