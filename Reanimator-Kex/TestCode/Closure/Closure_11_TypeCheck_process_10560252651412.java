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

public class TypeCheck_process_10560252651412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431589;
     Object term431839;

    public TypeCheck_process_10560252651412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431589 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term431695 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term431769 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term431589, term431589.getClass(), "scopeCreator", term431695);
        setField(term431769, term431769.getClass(), "parent", null);
        setField(term431589, term431589.getClass(), "topScope", term431769);
        setField(term431589, term431589.getClass(), "compiler", null);
        setBooleanField(term431589, term431589.getClass(), "inExterns", false);
        term431839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term431909 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term431839, term431839.getClass(), "parent", term431909);
        setIntField(term431839, term431839.getClass(), "type", 121);
        setField(term431839, term431839.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term431839;
        try {
            callMethod(klass, "process", argTypes, term431589, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


