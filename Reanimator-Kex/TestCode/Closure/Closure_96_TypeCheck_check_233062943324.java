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

public class TypeCheck_check_233062943324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144352;
     Object term144682;

    public TypeCheck_check_233062943324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144352 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term144432 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term144538 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term144612 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term144352, term144352.getClass(), "compiler", term144432);
        setField(term144352, term144352.getClass(), "scopeCreator", term144538);
        setBooleanField(term144352, term144352.getClass(), "inExterns", false);
        setField(term144612, term144612.getClass(), "parent", null);
        setField(term144352, term144352.getClass(), "topScope", term144612);
        term144682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144892 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144962 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term144682, term144682.getClass(), "type", 0);
        setField(term144892, term144892.getClass(), "next", term144962);
        setIntField(term144892, term144892.getClass(), "type", 15);
        setField(term144892, term144892.getClass(), "first", null);
        setField(term144822, term144822.getClass(), "next", term144892);
        setIntField(term144822, term144822.getClass(), "type", 108);
        setField(term144822, term144822.getClass(), "first", null);
        setField(term144752, term144752.getClass(), "next", term144822);
        setIntField(term144752, term144752.getClass(), "type", 130);
        setField(term144752, term144752.getClass(), "first", null);
        setField(term144682, term144682.getClass(), "first", term144752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term144682;
        args[1] = true;
        callMethod(klass, "check", argTypes, term144352, args);
    }

};


