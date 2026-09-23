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
import java.lang.Object;

public class MakeDeclaredNamesUnique_findDeclaredNames_160439403025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3225;
     Object term3311;
     Object term3483;
     Object term4329;
     Object term4330;
     Object term4331;

    public MakeDeclaredNamesUnique_findDeclaredNames_160439403025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3225 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        term3311 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3397 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3311, term3311.getClass(), "type", -2147483638);
        setField(term3311, term3311.getClass(), "first", term3397);
        term3483 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3483, term3483.getClass(), "type", 2147483637);
        term4329 = newInstance(Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique"));
        setField(term4329, term4329.getClass(), "nameStack", null);
        setField(term4329, term4329.getClass(), "rootRenamer", null);
        term4330 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term4330, term4330.getClass(), "functionName", null);
        setBooleanField(term4330, term4330.getClass(), "itsNeedsActivation", false);
        setIntField(term4330, term4330.getClass(), "itsFunctionType", 0);
        setBooleanField(term4330, term4330.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4330, term4330.getClass(), "encodedSourceStart", 0);
        setIntField(term4330, term4330.getClass(), "encodedSourceEnd", 0);
        setField(term4330, term4330.getClass(), "sourceName", null);
        setIntField(term4330, term4330.getClass(), "baseLineno", 0);
        setIntField(term4330, term4330.getClass(), "endLineno", 0);
        setField(term4330, term4330.getClass(), "functions", null);
        setField(term4330, term4330.getClass(), "regexps", null);
        setField(term4330, term4330.getClass(), "itsVariables", null);
        setField(term4330, term4330.getClass(), "itsConst", null);
        setField(term4330, term4330.getClass(), "itsVariableNames", null);
        setIntField(term4330, term4330.getClass(), "varStart", 0);
        setField(term4330, term4330.getClass(), "compilerData", null);
        setIntField(term4330, term4330.getClass(), "type", 2147483637);
        setField(term4330, term4330.getClass(), "next", null);
        setField(term4330, term4330.getClass(), "first", null);
        setField(term4330, term4330.getClass(), "last", null);
        setField(term4330, term4330.getClass(), "propListHead", null);
        setIntField(term4330, term4330.getClass(), "sourcePosition", 0);
        setField(term4330, term4330.getClass(), "jsType", null);
        setField(term4330, term4330.getClass(), "parent", null);
        term4331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4332 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term4331, term4331.getClass(), "functionName", null);
        setBooleanField(term4331, term4331.getClass(), "itsNeedsActivation", false);
        setIntField(term4331, term4331.getClass(), "itsFunctionType", 0);
        setBooleanField(term4331, term4331.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4331, term4331.getClass(), "encodedSourceStart", 0);
        setIntField(term4331, term4331.getClass(), "encodedSourceEnd", 0);
        setField(term4331, term4331.getClass(), "sourceName", null);
        setIntField(term4331, term4331.getClass(), "baseLineno", 0);
        setIntField(term4331, term4331.getClass(), "endLineno", 0);
        setField(term4331, term4331.getClass(), "functions", null);
        setField(term4331, term4331.getClass(), "regexps", null);
        setField(term4331, term4331.getClass(), "itsVariables", null);
        setField(term4331, term4331.getClass(), "itsConst", null);
        setField(term4331, term4331.getClass(), "itsVariableNames", null);
        setIntField(term4331, term4331.getClass(), "varStart", 0);
        setField(term4331, term4331.getClass(), "compilerData", null);
        setIntField(term4331, term4331.getClass(), "type", -2147483638);
        setField(term4331, term4331.getClass(), "next", null);
        setField(term4332, term4332.getClass(), "functionName", null);
        setBooleanField(term4332, term4332.getClass(), "itsNeedsActivation", false);
        setIntField(term4332, term4332.getClass(), "itsFunctionType", 0);
        setBooleanField(term4332, term4332.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4332, term4332.getClass(), "encodedSourceStart", 0);
        setIntField(term4332, term4332.getClass(), "encodedSourceEnd", 0);
        setField(term4332, term4332.getClass(), "sourceName", null);
        setIntField(term4332, term4332.getClass(), "baseLineno", 0);
        setIntField(term4332, term4332.getClass(), "endLineno", 0);
        setField(term4332, term4332.getClass(), "functions", null);
        setField(term4332, term4332.getClass(), "regexps", null);
        setField(term4332, term4332.getClass(), "itsVariables", null);
        setField(term4332, term4332.getClass(), "itsConst", null);
        setField(term4332, term4332.getClass(), "itsVariableNames", null);
        setIntField(term4332, term4332.getClass(), "varStart", 0);
        setField(term4332, term4332.getClass(), "compilerData", null);
        setIntField(term4332, term4332.getClass(), "type", 0);
        setField(term4332, term4332.getClass(), "next", null);
        setField(term4332, term4332.getClass(), "first", null);
        setField(term4332, term4332.getClass(), "last", null);
        setField(term4332, term4332.getClass(), "propListHead", null);
        setIntField(term4332, term4332.getClass(), "sourcePosition", 0);
        setField(term4332, term4332.getClass(), "jsType", null);
        setField(term4332, term4332.getClass(), "parent", null);
        setField(term4331, term4331.getClass(), "first", term4332);
        setField(term4331, term4331.getClass(), "last", null);
        setField(term4331, term4331.getClass(), "propListHead", null);
        setIntField(term4331, term4331.getClass(), "sourcePosition", 0);
        setField(term4331, term4331.getClass(), "jsType", null);
        setField(term4331, term4331.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer");
        Object[] args = new Object[3];
        args[0] = term3311;
        args[1] = term3483;
        args[2] = null;
        callMethod(klass, "findDeclaredNames", argTypes, term3225, args);
        assertTrue(recursiveEquals(term3225, term4329));
        assertTrue(recursiveEquals(term3311, term4330));
        assertTrue(recursiveEquals(term3483, term4331));
    }

};


