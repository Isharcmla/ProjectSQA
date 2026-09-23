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

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5021;
     Object term5107;
     Object term5193;
     Object term24307;
     Object term24308;
     Object term24309;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5021 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term5107 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term5193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term5193, term5193.getClass(), "type", -106);
        term24307 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term24307, term24307.getClass(), "nameStack", null);
        setField(term24307, term24307.getClass(), "rootRenamer", null);
        term24308 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term24308, term24308.getClass(), "functionName", null);
        setBooleanField(term24308, term24308.getClass(), "itsNeedsActivation", false);
        setIntField(term24308, term24308.getClass(), "itsFunctionType", 0);
        setBooleanField(term24308, term24308.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term24308, term24308.getClass(), "encodedSourceStart", 0);
        setIntField(term24308, term24308.getClass(), "encodedSourceEnd", 0);
        setField(term24308, term24308.getClass(), "sourceName", null);
        setIntField(term24308, term24308.getClass(), "baseLineno", 0);
        setIntField(term24308, term24308.getClass(), "endLineno", 0);
        setField(term24308, term24308.getClass(), "functions", null);
        setField(term24308, term24308.getClass(), "regexps", null);
        setField(term24308, term24308.getClass(), "itsVariables", null);
        setField(term24308, term24308.getClass(), "itsConst", null);
        setField(term24308, term24308.getClass(), "itsVariableNames", null);
        setIntField(term24308, term24308.getClass(), "varStart", 0);
        setField(term24308, term24308.getClass(), "compilerData", null);
        setIntField(term24308, term24308.getClass(), "type", -106);
        setField(term24308, term24308.getClass(), "next", null);
        setField(term24308, term24308.getClass(), "first", null);
        setField(term24308, term24308.getClass(), "last", null);
        setField(term24308, term24308.getClass(), "propListHead", null);
        setIntField(term24308, term24308.getClass(), "sourcePosition", 0);
        setField(term24308, term24308.getClass(), "jsType", null);
        setField(term24308, term24308.getClass(), "parent", null);
        term24309 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term24309, term24309.getClass(), "functionName", null);
        setBooleanField(term24309, term24309.getClass(), "itsNeedsActivation", false);
        setIntField(term24309, term24309.getClass(), "itsFunctionType", 0);
        setBooleanField(term24309, term24309.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term24309, term24309.getClass(), "encodedSourceStart", 0);
        setIntField(term24309, term24309.getClass(), "encodedSourceEnd", 0);
        setField(term24309, term24309.getClass(), "sourceName", null);
        setIntField(term24309, term24309.getClass(), "baseLineno", 0);
        setIntField(term24309, term24309.getClass(), "endLineno", 0);
        setField(term24309, term24309.getClass(), "functions", null);
        setField(term24309, term24309.getClass(), "regexps", null);
        setField(term24309, term24309.getClass(), "itsVariables", null);
        setField(term24309, term24309.getClass(), "itsConst", null);
        setField(term24309, term24309.getClass(), "itsVariableNames", null);
        setIntField(term24309, term24309.getClass(), "varStart", 0);
        setField(term24309, term24309.getClass(), "compilerData", null);
        setIntField(term24309, term24309.getClass(), "type", 0);
        setField(term24309, term24309.getClass(), "next", null);
        setField(term24309, term24309.getClass(), "first", null);
        setField(term24309, term24309.getClass(), "last", null);
        setField(term24309, term24309.getClass(), "propListHead", null);
        setIntField(term24309, term24309.getClass(), "sourcePosition", 0);
        setField(term24309, term24309.getClass(), "jsType", null);
        setField(term24309, term24309.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term5107;
        args[1] = term5193;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term5021, args);
        assertTrue(recursiveEquals(term5021, term24307));
        assertTrue(recursiveEquals(term5107, term24308));
        assertTrue(recursiveEquals(term5193, term24309));
    }

};


