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

public class TypeCheck_process_1056025265910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237975;
     Object term238225;

    public TypeCheck_process_1056025265910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237975 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term238081 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term238155 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term237975, term237975.getClass(), "scopeCreator", term238081);
        setField(term238155, term238155.getClass(), "parent", null);
        setField(term237975, term237975.getClass(), "topScope", term238155);
        setField(term237975, term237975.getClass(), "compiler", null);
        setBooleanField(term237975, term237975.getClass(), "inExterns", false);
        term238225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term238295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term238225, term238225.getClass(), "parent", term238295);
        setIntField(term238225, term238225.getClass(), "type", 55);
        setField(term238225, term238225.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term238225;
        try {
            callMethod(klass, "process", argTypes, term237975, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


