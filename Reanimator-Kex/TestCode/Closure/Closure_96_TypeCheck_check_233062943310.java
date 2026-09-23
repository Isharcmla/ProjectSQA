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

public class TypeCheck_check_233062943310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136676;
     Object term136998;

    public TypeCheck_check_233062943310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136676 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term136756 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term136854 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term136928 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term136676, term136676.getClass(), "compiler", term136756);
        setField(term136676, term136676.getClass(), "scopeCreator", term136854);
        setBooleanField(term136676, term136676.getClass(), "inExterns", false);
        setField(term136928, term136928.getClass(), "parent", null);
        setField(term136676, term136676.getClass(), "topScope", term136928);
        term136998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term136998, term136998.getClass(), "type", 0);
        setField(term137138, term137138.getClass(), "next", term137208);
        setIntField(term137138, term137138.getClass(), "type", 122);
        setField(term137138, term137138.getClass(), "first", null);
        setField(term137068, term137068.getClass(), "next", term137138);
        setIntField(term137068, term137068.getClass(), "type", 77);
        setField(term137068, term137068.getClass(), "first", null);
        setField(term136998, term136998.getClass(), "first", term137068);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term136998;
        args[1] = true;
        callMethod(klass, "check", argTypes, term136676, args);
    }

};


