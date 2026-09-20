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

public class RemoveUnusedVars_process_26289943154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14577;
     Object term14647;

    public RemoveUnusedVars_process_26289943154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14577 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setBooleanField(term14577, term14577.getClass(), "modifyCallSites", false);
        setField(term14577, term14577.getClass(), "compiler", null);
        term14647 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14647, term14647.getClass(), "type", 0);
        setIntField(term14717, term14717.getClass(), "type", 0);
        setIntField(term14787, term14787.getClass(), "type", 0);
        setField(term14787, term14787.getClass(), "first", null);
        setField(term14787, term14787.getClass(), "next", null);
        setField(term14717, term14717.getClass(), "first", term14787);
        setIntField(term14857, term14857.getClass(), "type", 0);
        setField(term14857, term14857.getClass(), "first", term14857);
        setField(term14717, term14717.getClass(), "next", term14857);
        setField(term14647, term14647.getClass(), "first", term14717);
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
        args[1] = term14647;
        args[2] = null;
        callMethod(klass, "process", argTypes, term14577, args);
    }

};
