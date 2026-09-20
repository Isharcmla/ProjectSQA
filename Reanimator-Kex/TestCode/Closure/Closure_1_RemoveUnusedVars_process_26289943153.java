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

public class RemoveUnusedVars_process_26289943153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14021;
     Object term14171;

    public RemoveUnusedVars_process_26289943153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14021 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        Object term14101 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setBooleanField(term14021, term14021.getClass(), "modifyCallSites", false);
        setField(term14021, term14021.getClass(), "compiler", term14101);
        setBooleanField(term14021, term14021.getClass(), "removeGlobals", true);
        term14171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14171, term14171.getClass(), "type", 0);
        setIntField(term14241, term14241.getClass(), "type", 0);
        setIntField(term14311, term14311.getClass(), "type", 0);
        setField(term14311, term14311.getClass(), "first", null);
        setField(term14311, term14311.getClass(), "next", null);
        setField(term14241, term14241.getClass(), "first", term14311);
        setIntField(term14381, term14381.getClass(), "type", 0);
        setField(term14381, term14381.getClass(), "first", null);
        setField(term14381, term14381.getClass(), "next", null);
        setField(term14241, term14241.getClass(), "next", term14381);
        setField(term14171, term14171.getClass(), "first", term14241);
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
        args[1] = term14171;
        args[2] = null;
        callMethod(klass, "process", argTypes, term14021, args);
    }

};
