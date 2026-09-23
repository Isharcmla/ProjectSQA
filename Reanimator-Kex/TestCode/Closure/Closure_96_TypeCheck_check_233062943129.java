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

public class TypeCheck_check_233062943129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68603;
     Object term68853;

    public TypeCheck_check_233062943129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68603 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term68709 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term68783 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term68603, term68603.getClass(), "compiler", null);
        setField(term68603, term68603.getClass(), "scopeCreator", term68709);
        setBooleanField(term68603, term68603.getClass(), "inExterns", false);
        setField(term68783, term68783.getClass(), "parent", null);
        setField(term68603, term68603.getClass(), "topScope", term68783);
        term68853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term68853, term68853.getClass(), "type", 0);
        setField(term68923, term68923.getClass(), "next", term68993);
        setIntField(term68923, term68923.getClass(), "type", 137);
        setField(term68923, term68923.getClass(), "first", null);
        setField(term68853, term68853.getClass(), "first", term68923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term68853;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term68603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


