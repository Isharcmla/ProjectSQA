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

public class TypeCheck_process_10560252651074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306920;
     Object term307170;

    public TypeCheck_process_10560252651074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306920 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term307026 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term307100 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term306920, term306920.getClass(), "scopeCreator", term307026);
        setField(term307100, term307100.getClass(), "parent", null);
        setField(term306920, term306920.getClass(), "topScope", term307100);
        setField(term306920, term306920.getClass(), "compiler", null);
        setBooleanField(term306920, term306920.getClass(), "inExterns", false);
        term307170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term307240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term307170, term307170.getClass(), "parent", term307240);
        setIntField(term307170, term307170.getClass(), "type", 17);
        setField(term307170, term307170.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term307170;
        try {
            callMethod(klass, "process", argTypes, term306920, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


