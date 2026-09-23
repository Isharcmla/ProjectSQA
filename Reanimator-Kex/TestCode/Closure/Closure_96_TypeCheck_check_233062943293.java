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

public class TypeCheck_check_233062943293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128155;
     Object term128483;

    public TypeCheck_check_233062943293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128155 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term128235 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term128339 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term128413 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term128155, term128155.getClass(), "compiler", term128235);
        setField(term128155, term128155.getClass(), "scopeCreator", term128339);
        setBooleanField(term128155, term128155.getClass(), "inExterns", false);
        setField(term128413, term128413.getClass(), "parent", null);
        setField(term128155, term128155.getClass(), "topScope", term128413);
        term128483 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term128483, term128483.getClass(), "type", 0);
        setField(term128623, term128623.getClass(), "next", term128693);
        setIntField(term128623, term128623.getClass(), "type", 104);
        setField(term128623, term128623.getClass(), "first", null);
        setField(term128553, term128553.getClass(), "next", term128623);
        setIntField(term128553, term128553.getClass(), "type", 77);
        setField(term128553, term128553.getClass(), "first", null);
        setField(term128483, term128483.getClass(), "first", term128553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term128483;
        args[1] = true;
        callMethod(klass, "check", argTypes, term128155, args);
    }

};


