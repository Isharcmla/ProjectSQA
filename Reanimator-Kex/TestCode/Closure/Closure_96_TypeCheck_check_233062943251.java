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

public class TypeCheck_check_233062943251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112388;
     Object term112630;

    public TypeCheck_check_233062943251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112388 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term112486 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term112560 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term112388, term112388.getClass(), "compiler", null);
        setField(term112388, term112388.getClass(), "scopeCreator", term112486);
        setBooleanField(term112388, term112388.getClass(), "inExterns", false);
        setField(term112560, term112560.getClass(), "parent", null);
        setField(term112388, term112388.getClass(), "topScope", term112560);
        term112630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term112630, term112630.getClass(), "type", 0);
        setField(term112700, term112700.getClass(), "next", term112770);
        setIntField(term112700, term112700.getClass(), "type", 40);
        setField(term112700, term112700.getClass(), "first", null);
        setField(term112630, term112630.getClass(), "first", term112700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term112630;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term112388, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


