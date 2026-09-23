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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7051;
     Object term7137;
     Object term7223;
     Object term26620;
     Object term26621;
     Object term26622;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7051 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term7137 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term7223 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term7223, term7223.getClass(), "type", -106);
        term26620 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term26620, term26620.getClass(), "nameStack", null);
        setField(term26620, term26620.getClass(), "rootRenamer", null);
        term26621 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term26621, term26621.getClass(), "functionName", null);
        setBooleanField(term26621, term26621.getClass(), "itsNeedsActivation", false);
        setIntField(term26621, term26621.getClass(), "itsFunctionType", 0);
        setBooleanField(term26621, term26621.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term26621, term26621.getClass(), "encodedSourceStart", 0);
        setIntField(term26621, term26621.getClass(), "encodedSourceEnd", 0);
        setField(term26621, term26621.getClass(), "sourceName", null);
        setIntField(term26621, term26621.getClass(), "baseLineno", 0);
        setIntField(term26621, term26621.getClass(), "endLineno", 0);
        setField(term26621, term26621.getClass(), "functions", null);
        setField(term26621, term26621.getClass(), "regexps", null);
        setField(term26621, term26621.getClass(), "itsVariables", null);
        setField(term26621, term26621.getClass(), "itsConst", null);
        setField(term26621, term26621.getClass(), "itsVariableNames", null);
        setIntField(term26621, term26621.getClass(), "varStart", 0);
        setField(term26621, term26621.getClass(), "compilerData", null);
        setIntField(term26621, term26621.getClass(), "type", -106);
        setField(term26621, term26621.getClass(), "next", null);
        setField(term26621, term26621.getClass(), "first", null);
        setField(term26621, term26621.getClass(), "last", null);
        setField(term26621, term26621.getClass(), "propListHead", null);
        setIntField(term26621, term26621.getClass(), "sourcePosition", 0);
        setField(term26621, term26621.getClass(), "jsType", null);
        setField(term26621, term26621.getClass(), "parent", null);
        term26622 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term26622, term26622.getClass(), "functionName", null);
        setBooleanField(term26622, term26622.getClass(), "itsNeedsActivation", false);
        setIntField(term26622, term26622.getClass(), "itsFunctionType", 0);
        setBooleanField(term26622, term26622.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term26622, term26622.getClass(), "encodedSourceStart", 0);
        setIntField(term26622, term26622.getClass(), "encodedSourceEnd", 0);
        setField(term26622, term26622.getClass(), "sourceName", null);
        setIntField(term26622, term26622.getClass(), "baseLineno", 0);
        setIntField(term26622, term26622.getClass(), "endLineno", 0);
        setField(term26622, term26622.getClass(), "functions", null);
        setField(term26622, term26622.getClass(), "regexps", null);
        setField(term26622, term26622.getClass(), "itsVariables", null);
        setField(term26622, term26622.getClass(), "itsConst", null);
        setField(term26622, term26622.getClass(), "itsVariableNames", null);
        setIntField(term26622, term26622.getClass(), "varStart", 0);
        setField(term26622, term26622.getClass(), "compilerData", null);
        setIntField(term26622, term26622.getClass(), "type", 0);
        setField(term26622, term26622.getClass(), "next", null);
        setField(term26622, term26622.getClass(), "first", null);
        setField(term26622, term26622.getClass(), "last", null);
        setField(term26622, term26622.getClass(), "propListHead", null);
        setIntField(term26622, term26622.getClass(), "sourcePosition", 0);
        setField(term26622, term26622.getClass(), "jsType", null);
        setField(term26622, term26622.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term7137;
        args[1] = term7223;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term7051, args);
        assertTrue(recursiveEquals(term7051, term26620));
        assertTrue(recursiveEquals(term7137, term26621));
        assertTrue(recursiveEquals(term7223, term26622));
    }

};


