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

public class TypeCheck_process_10560252651281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379545;
     Object term379793;

    public TypeCheck_process_10560252651281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379545 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term379649 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term379723 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term379545, term379545.getClass(), "scopeCreator", term379649);
        setField(term379723, term379723.getClass(), "parent", null);
        setField(term379545, term379545.getClass(), "topScope", term379723);
        setField(term379545, term379545.getClass(), "compiler", null);
        setBooleanField(term379545, term379545.getClass(), "inExterns", false);
        term379793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term379863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term379793, term379793.getClass(), "parent", term379863);
        setIntField(term379793, term379793.getClass(), "type", 44);
        setField(term379793, term379793.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term379793;
        try {
            callMethod(klass, "process", argTypes, term379545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


