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

public class TypeCheck_process_10560252651250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366527;
     Object term366777;

    public TypeCheck_process_10560252651250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366527 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term366633 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term366707 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term366527, term366527.getClass(), "scopeCreator", term366633);
        setField(term366707, term366707.getClass(), "parent", null);
        setField(term366527, term366527.getClass(), "topScope", term366707);
        setField(term366527, term366527.getClass(), "compiler", null);
        setBooleanField(term366527, term366527.getClass(), "inExterns", false);
        term366777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term366847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term366777, term366777.getClass(), "parent", term366847);
        setIntField(term366777, term366777.getClass(), "type", 119);
        setField(term366777, term366777.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term366777;
        try {
            callMethod(klass, "process", argTypes, term366527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


