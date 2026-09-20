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

public class RemoveUnusedVars_process_26289943131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6460;
     Object term6530;

    public RemoveUnusedVars_process_26289943131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6460 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term6460, term6460.getClass(), "modifyCallSites", false);
        setField(term6460, term6460.getClass(), "compiler", null);
        term6530 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6670 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6530, term6530.getClass(), "type", 0);
        setIntField(term6600, term6600.getClass(), "type", 0);
        setIntField(term6670, term6670.getClass(), "type", 0);
        setField(term6670, term6670.getClass(), "first", null);
        setField(term6670, term6670.getClass(), "next", null);
        setField(term6600, term6600.getClass(), "first", term6670);
        setIntField(term6740, term6740.getClass(), "type", 0);
        setField(term6740, term6740.getClass(), "first", null);
        setField(term6740, term6740.getClass(), "next", term6740);
        setField(term6600, term6600.getClass(), "next", term6740);
        setField(term6530, term6530.getClass(), "first", term6600);
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
        args[1] = term6530;
        args[2] = null;
        callMethod(klass, "process", argTypes, term6460, args);
    }

};
