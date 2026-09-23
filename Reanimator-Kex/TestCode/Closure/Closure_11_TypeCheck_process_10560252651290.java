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

public class TypeCheck_process_10560252651290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382514;
     Object term382764;

    public TypeCheck_process_10560252651290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382514 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term382620 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term382694 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term382514, term382514.getClass(), "scopeCreator", term382620);
        setField(term382694, term382694.getClass(), "parent", null);
        setField(term382514, term382514.getClass(), "topScope", term382694);
        setField(term382514, term382514.getClass(), "compiler", null);
        setBooleanField(term382514, term382514.getClass(), "inExterns", false);
        term382764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term382834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term382764, term382764.getClass(), "parent", term382834);
        setIntField(term382764, term382764.getClass(), "type", 23);
        setField(term382764, term382764.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term382764;
        try {
            callMethod(klass, "process", argTypes, term382514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


