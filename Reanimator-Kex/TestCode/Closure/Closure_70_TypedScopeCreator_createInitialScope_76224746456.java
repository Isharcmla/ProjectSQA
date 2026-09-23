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

public class TypedScopeCreator_createInitialScope_76224746456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15447;
     Object term15621;

    public TypedScopeCreator_createInitialScope_76224746456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15447 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term15551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term15447, term15447.getClass(), "compiler", null);
        setField(term15447, term15447.getClass(), "typeRegistry", term15551);
        term15621 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15621, term15621.getClass(), "type", 126);
        setField(term15691, term15691.getClass(), "next", null);
        setIntField(term15691, term15691.getClass(), "type", 0);
        setField(term15621, term15621.getClass(), "first", term15691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15621;
        callMethod(klass, "createInitialScope", argTypes, term15447, args);
    }

};


