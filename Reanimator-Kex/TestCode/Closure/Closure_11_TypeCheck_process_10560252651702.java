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

public class TypeCheck_process_10560252651702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551587;
     Object term551917;

    public TypeCheck_process_10560252651702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551587 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term551693 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term551767 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term551847 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term551587, term551587.getClass(), "scopeCreator", term551693);
        setField(term551767, term551767.getClass(), "parent", null);
        setField(term551587, term551587.getClass(), "topScope", term551767);
        setField(term551587, term551587.getClass(), "compiler", term551847);
        setBooleanField(term551587, term551587.getClass(), "inExterns", false);
        term551917 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term551987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term551917, term551917.getClass(), "parent", term551987);
        setIntField(term551917, term551917.getClass(), "type", 152);
        setField(term551917, term551917.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term551917;
        try {
            callMethod(klass, "process", argTypes, term551587, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


