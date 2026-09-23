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

public class TypeCheck_check_233062943301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131931;
     Object term132261;

    public TypeCheck_check_233062943301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131931 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term132011 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term132117 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term132191 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term131931, term131931.getClass(), "compiler", term132011);
        setField(term131931, term131931.getClass(), "scopeCreator", term132117);
        setBooleanField(term131931, term131931.getClass(), "inExterns", false);
        setField(term132191, term132191.getClass(), "parent", null);
        setField(term131931, term131931.getClass(), "topScope", term132191);
        term132261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132331 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132261, term132261.getClass(), "type", 0);
        setField(term132401, term132401.getClass(), "next", term132471);
        setIntField(term132401, term132401.getClass(), "type", 115);
        setField(term132401, term132401.getClass(), "first", null);
        setField(term132331, term132331.getClass(), "next", term132401);
        setIntField(term132331, term132331.getClass(), "type", 130);
        setField(term132331, term132331.getClass(), "first", null);
        setField(term132261, term132261.getClass(), "first", term132331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term132261;
        args[1] = true;
        callMethod(klass, "check", argTypes, term131931, args);
    }

};


