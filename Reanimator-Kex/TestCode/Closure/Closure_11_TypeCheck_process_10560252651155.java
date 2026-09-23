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

public class TypeCheck_process_10560252651155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334753;
     Object term335003;

    public TypeCheck_process_10560252651155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334753 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term334859 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term334933 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term334753, term334753.getClass(), "scopeCreator", term334859);
        setField(term334933, term334933.getClass(), "parent", null);
        setField(term334753, term334753.getClass(), "topScope", term334933);
        setField(term334753, term334753.getClass(), "compiler", null);
        setBooleanField(term334753, term334753.getClass(), "inExterns", false);
        term335003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term335003, term335003.getClass(), "parent", term335073);
        setIntField(term335003, term335003.getClass(), "type", 58);
        setField(term335003, term335003.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term335003;
        try {
            callMethod(klass, "process", argTypes, term334753, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


