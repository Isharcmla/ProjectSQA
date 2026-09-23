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

public class RemoveUnusedVars_traverseNode_121208155186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20786;
     Object term20856;

    public RemoveUnusedVars_traverseNode_121208155186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20786 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term20856 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20856, term20856.getClass(), "type", 64);
        setIntField(term20926, term20926.getClass(), "type", 64);
        setIntField(term20996, term20996.getClass(), "type", 0);
        setField(term20996, term20996.getClass(), "first", null);
        setField(term20996, term20996.getClass(), "next", null);
        setField(term20926, term20926.getClass(), "first", term20996);
        setIntField(term21066, term21066.getClass(), "type", 64);
        setIntField(term21136, term21136.getClass(), "type", 0);
        setField(term21136, term21136.getClass(), "first", null);
        setField(term21136, term21136.getClass(), "next", null);
        setField(term21066, term21066.getClass(), "first", term21136);
        setField(term21066, term21066.getClass(), "next", term21066);
        setField(term20926, term20926.getClass(), "next", term21066);
        setField(term20856, term20856.getClass(), "first", term20926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term20856;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term20786, args);
    }

};


