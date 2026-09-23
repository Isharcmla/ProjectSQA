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
     Object term41288;
     Object term41358;

    public TypedScopeCreator_createInitialScope_76224746498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41288 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term41288, term41288.getClass(), "compiler", null);
        setField(term41288, term41288.getClass(), "typeRegistry", null);
        term41358 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41358, term41358.getClass(), "type", 0);
        setIntField(term41428, term41428.getClass(), "type", 0);
        setField(term41428, term41428.getClass(), "parent", null);
        setField(term41358, term41358.getClass(), "parent", term41428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term41358;
        callMethod(klass, "createInitialScope", argTypes, term41288, args);
    }

};


