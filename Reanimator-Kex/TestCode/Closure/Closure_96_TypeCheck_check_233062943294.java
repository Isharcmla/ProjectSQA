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

public class TypeCheck_check_233062943294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128919;
     Object term129063;

    public TypeCheck_check_233062943294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128919 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term128993 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term128919, term128919.getClass(), "compiler", null);
        setField(term128919, term128919.getClass(), "scopeCreator", null);
        setBooleanField(term128919, term128919.getClass(), "inExterns", false);
        setField(term128993, term128993.getClass(), "parent", null);
        setField(term128919, term128919.getClass(), "topScope", term128993);
        term129063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term129063, term129063.getClass(), "type", 0);
        setField(term129203, term129203.getClass(), "next", null);
        setIntField(term129203, term129203.getClass(), "type", 78);
        setField(term129203, term129203.getClass(), "first", null);
        setField(term129133, term129133.getClass(), "next", term129203);
        setIntField(term129133, term129133.getClass(), "type", 130);
        setField(term129133, term129133.getClass(), "first", null);
        setField(term129063, term129063.getClass(), "first", term129133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term129063;
        args[1] = true;
        callMethod(klass, "check", argTypes, term128919, args);
    }

};


