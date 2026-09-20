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

public class RemoveUnusedVars_traverseNode_121208155148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12614;
     Object term12684;

    public RemoveUnusedVars_traverseNode_121208155148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12614 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term12684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12824 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12894 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12684, term12684.getClass(), "type", 58434042);
        setIntField(term12754, term12754.getClass(), "type", -58434043);
        setIntField(term12824, term12824.getClass(), "type", 64);
        setField(term12824, term12824.getClass(), "first", null);
        setField(term12824, term12824.getClass(), "next", null);
        setField(term12754, term12754.getClass(), "first", term12824);
        setIntField(term12894, term12894.getClass(), "type", 64);
        setField(term12894, term12894.getClass(), "first", null);
        setField(term12894, term12894.getClass(), "next", term12894);
        setField(term12754, term12754.getClass(), "next", term12894);
        setField(term12684, term12684.getClass(), "first", term12754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term12684;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term12614, args);
    }

};
