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

public class TypeCheck_process_1056025265998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273195;
     Object term273443;

    public TypeCheck_process_1056025265998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273195 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term273299 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term273373 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term273195, term273195.getClass(), "scopeCreator", term273299);
        setField(term273373, term273373.getClass(), "parent", null);
        setField(term273195, term273195.getClass(), "topScope", term273373);
        setField(term273195, term273195.getClass(), "compiler", null);
        setBooleanField(term273195, term273195.getClass(), "inExterns", false);
        term273443 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term273513 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term273443, term273443.getClass(), "parent", term273513);
        setIntField(term273443, term273443.getClass(), "type", 146);
        setField(term273443, term273443.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term273443;
        try {
            callMethod(klass, "process", argTypes, term273195, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


