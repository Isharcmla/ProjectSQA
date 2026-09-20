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

public class RemoveUnusedVars_process_26289943141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10358;
     Object term10428;

    public RemoveUnusedVars_process_26289943141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10358 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term10358, term10358.getClass(), "modifyCallSites", false);
        setField(term10358, term10358.getClass(), "compiler", null);
        term10428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10568 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10428, term10428.getClass(), "type", 0);
        setIntField(term10498, term10498.getClass(), "type", 0);
        setIntField(term10568, term10568.getClass(), "type", 105);
        setField(term10498, term10498.getClass(), "first", term10568);
        setField(term10428, term10428.getClass(), "first", term10498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.SimpleDefinitionFinder");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term10428;
        args[2] = null;
        callMethod(klass, "process", argTypes, term10358, args);
    }

};
