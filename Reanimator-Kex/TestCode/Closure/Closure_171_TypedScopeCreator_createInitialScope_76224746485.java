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

public class TypedScopeCreator_createInitialScope_76224746485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35063;
     Object term35133;

    public TypedScopeCreator_createInitialScope_76224746485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35063 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term35063, term35063.getClass(), "compiler", null);
        setField(term35063, term35063.getClass(), "typeRegistry", null);
        term35133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term35133, term35133.getClass(), "type", 0);
        setIntField(term35203, term35203.getClass(), "type", 0);
        setField(term35203, term35203.getClass(), "parent", null);
        setField(term35133, term35133.getClass(), "parent", term35203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term35133;
        callMethod(klass, "createInitialScope", argTypes, term35063, args);
    }

};


