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

public class TypedScopeCreator_createInitialScope_76224746487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65457;
     Object term65607;

    public TypedScopeCreator_createInitialScope_76224746487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65457 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term65537 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term65457, term65457.getClass(), "compiler", term65537);
        setField(term65457, term65457.getClass(), "typeRegistry", null);
        term65607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65607, term65607.getClass(), "type", 0);
        setField(term65607, term65607.getClass(), "parent", null);
        setField(term65607, term65607.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65607;
        callMethod(klass, "createInitialScope", argTypes, term65457, args);
    }

};


