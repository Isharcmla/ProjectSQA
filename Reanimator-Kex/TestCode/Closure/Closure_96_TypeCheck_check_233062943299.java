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

public class TypeCheck_check_233062943299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131142;
     Object term131366;

    public TypeCheck_check_233062943299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131142 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term131222 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term131296 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term131142, term131142.getClass(), "compiler", term131222);
        setField(term131142, term131142.getClass(), "scopeCreator", null);
        setBooleanField(term131142, term131142.getClass(), "inExterns", false);
        setField(term131296, term131296.getClass(), "parent", null);
        setField(term131142, term131142.getClass(), "topScope", term131296);
        term131366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term131366, term131366.getClass(), "type", 0);
        setField(term131436, term131436.getClass(), "next", term131506);
        setIntField(term131436, term131436.getClass(), "type", 136);
        setField(term131436, term131436.getClass(), "first", null);
        setField(term131366, term131366.getClass(), "first", term131436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term131366;
        args[1] = true;
        callMethod(klass, "check", argTypes, term131142, args);
    }

};


