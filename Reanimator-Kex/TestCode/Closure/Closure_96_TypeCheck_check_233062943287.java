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

public class TypeCheck_check_233062943287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125440;
     Object term125768;

    public TypeCheck_check_233062943287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125440 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term125520 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term125624 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term125698 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term125440, term125440.getClass(), "compiler", term125520);
        setField(term125440, term125440.getClass(), "scopeCreator", term125624);
        setBooleanField(term125440, term125440.getClass(), "inExterns", false);
        setField(term125698, term125698.getClass(), "parent", null);
        setField(term125440, term125440.getClass(), "topScope", term125698);
        term125768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term125768, term125768.getClass(), "type", 0);
        setField(term125908, term125908.getClass(), "next", term125978);
        setIntField(term125908, term125908.getClass(), "type", 146);
        setField(term125908, term125908.getClass(), "first", null);
        setField(term125838, term125838.getClass(), "next", term125908);
        setIntField(term125838, term125838.getClass(), "type", 130);
        setField(term125838, term125838.getClass(), "first", null);
        setField(term125768, term125768.getClass(), "first", term125838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term125768;
        args[1] = true;
        callMethod(klass, "check", argTypes, term125440, args);
    }

};


