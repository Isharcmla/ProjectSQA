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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class RenameLabels_process_15092268013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3270;
     Object term3360;
     Object term3710;
     Object term3711;

    public RenameLabels_process_15092268013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3270 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term3270, term3270.getClass(), "compiler", null);
        term3360 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term3710 = newInstance(Class.forName("com.google.javascript.jscomp.RenameLabels"));
        setField(term3710, term3710.getClass(), "compiler", null);
        setField(term3710, term3710.getClass(), "nameSupplier", null);
        setBooleanField(term3710, term3710.getClass(), "removeUnused", false);
        term3711 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3711, term3711.getClass(), "encodedSourceStart", 0);
        setIntField(term3711, term3711.getClass(), "encodedSourceEnd", 0);
        setField(term3711, term3711.getClass(), "sourceName", null);
        setIntField(term3711, term3711.getClass(), "baseLineno", 0);
        setIntField(term3711, term3711.getClass(), "endLineno", 0);
        setField(term3711, term3711.getClass(), "functions", null);
        setField(term3711, term3711.getClass(), "regexps", null);
        setField(term3711, term3711.getClass(), "itsVariables", null);
        setField(term3711, term3711.getClass(), "itsConst", null);
        setField(term3711, term3711.getClass(), "itsVariableNames", null);
        setIntField(term3711, term3711.getClass(), "varStart", 0);
        setField(term3711, term3711.getClass(), "compilerData", null);
        setIntField(term3711, term3711.getClass(), "type", 0);
        setField(term3711, term3711.getClass(), "next", null);
        setField(term3711, term3711.getClass(), "first", null);
        setField(term3711, term3711.getClass(), "last", null);
        setField(term3711, term3711.getClass(), "propListHead", null);
        setIntField(term3711, term3711.getClass(), "sourcePosition", 0);
        setField(term3711, term3711.getClass(), "jsType", null);
        setField(term3711, term3711.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RenameLabels");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3360;
        callMethod(klass, "process", argTypes, term3270, args);
        assertTrue(recursiveEquals(term3270, term3710));
        assertTrue(recursiveEquals(term3360, null));
    }

};


