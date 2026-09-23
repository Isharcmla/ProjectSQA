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

public class TypeCheck_check_233062943291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127387;
     Object term127611;

    public TypeCheck_check_233062943291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127387 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term127467 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term127541 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term127387, term127387.getClass(), "compiler", term127467);
        setField(term127387, term127387.getClass(), "scopeCreator", null);
        setBooleanField(term127387, term127387.getClass(), "inExterns", false);
        setField(term127541, term127541.getClass(), "parent", null);
        setField(term127387, term127387.getClass(), "topScope", term127541);
        term127611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term127611, term127611.getClass(), "type", 0);
        setField(term127681, term127681.getClass(), "next", term127751);
        setIntField(term127681, term127681.getClass(), "type", 133);
        setField(term127681, term127681.getClass(), "first", null);
        setField(term127611, term127611.getClass(), "first", term127681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term127611;
        args[1] = true;
        callMethod(klass, "check", argTypes, term127387, args);
    }

};


