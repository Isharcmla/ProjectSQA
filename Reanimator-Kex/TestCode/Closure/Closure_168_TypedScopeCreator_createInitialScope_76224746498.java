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

public class TypedScopeCreator_createInitialScope_76224746498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61284;
     Object term61354;

    public TypedScopeCreator_createInitialScope_76224746498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61284 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term61284, term61284.getClass(), "compiler", null);
        setField(term61284, term61284.getClass(), "typeRegistry", null);
        term61354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61516 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term61354, term61354.getClass(), "type", 0);
        setField(term61354, term61354.getClass(), "parent", null);
        setField(term61424, term61424.getClass(), "next", term61516);
        setIntField(term61424, term61424.getClass(), "type", 0);
        setField(term61354, term61354.getClass(), "first", term61424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term61354;
        callMethod(klass, "createInitialScope", argTypes, term61284, args);
    }

};


