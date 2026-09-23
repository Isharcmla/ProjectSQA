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

public class TypeCheck_check_233062943323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143560;
     Object term143888;

    public TypeCheck_check_233062943323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143560 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term143640 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term143744 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term143818 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term143560, term143560.getClass(), "compiler", term143640);
        setField(term143560, term143560.getClass(), "scopeCreator", term143744);
        setBooleanField(term143560, term143560.getClass(), "inExterns", false);
        setField(term143818, term143818.getClass(), "parent", null);
        setField(term143560, term143560.getClass(), "topScope", term143818);
        term143888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term143888, term143888.getClass(), "type", 0);
        setField(term144028, term144028.getClass(), "next", term144098);
        setIntField(term144028, term144028.getClass(), "type", 111);
        setField(term144028, term144028.getClass(), "first", null);
        setField(term143958, term143958.getClass(), "next", term144028);
        setIntField(term143958, term143958.getClass(), "type", 77);
        setField(term143958, term143958.getClass(), "first", null);
        setField(term143888, term143888.getClass(), "first", term143958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term143888;
        args[1] = true;
        callMethod(klass, "check", argTypes, term143560, args);
    }

};


