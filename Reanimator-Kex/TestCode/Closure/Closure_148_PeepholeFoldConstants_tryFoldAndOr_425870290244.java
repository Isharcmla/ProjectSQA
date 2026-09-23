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

public class PeepholeFoldConstants_tryFoldAndOr_425870290244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46351;
     Object term46437;
     Object term46527;
     Object term46613;
     Object term46732;
     Object term46733;
     Object term46734;
     Object term46735;
     Object term46673;

    public PeepholeFoldConstants_tryFoldAndOr_425870290244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46351 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term46437 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46437, term46437.getClass(), "parent", null);
        setIntField(term46437, term46437.getClass(), "type", 0);
        term46527 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term46527, term46527.getClass(), "type", 0);
        term46613 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term46732 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term46732, term46732.getClass(), "currentTraversal", null);
        term46733 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46733, term46733.getClass(), "functionName", null);
        setBooleanField(term46733, term46733.getClass(), "itsNeedsActivation", false);
        setIntField(term46733, term46733.getClass(), "itsFunctionType", 0);
        setBooleanField(term46733, term46733.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46733, term46733.getClass(), "encodedSourceStart", 0);
        setIntField(term46733, term46733.getClass(), "encodedSourceEnd", 0);
        setField(term46733, term46733.getClass(), "sourceName", null);
        setIntField(term46733, term46733.getClass(), "baseLineno", 0);
        setIntField(term46733, term46733.getClass(), "endLineno", 0);
        setField(term46733, term46733.getClass(), "functions", null);
        setField(term46733, term46733.getClass(), "regexps", null);
        setField(term46733, term46733.getClass(), "itsVariables", null);
        setField(term46733, term46733.getClass(), "itsConst", null);
        setField(term46733, term46733.getClass(), "itsVariableNames", null);
        setIntField(term46733, term46733.getClass(), "varStart", 0);
        setField(term46733, term46733.getClass(), "compilerData", null);
        setIntField(term46733, term46733.getClass(), "type", 0);
        setField(term46733, term46733.getClass(), "next", null);
        setField(term46733, term46733.getClass(), "first", null);
        setField(term46733, term46733.getClass(), "last", null);
        setField(term46733, term46733.getClass(), "propListHead", null);
        setIntField(term46733, term46733.getClass(), "sourcePosition", 0);
        setField(term46733, term46733.getClass(), "jsType", null);
        setField(term46733, term46733.getClass(), "parent", null);
        term46734 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term46734, term46734.getClass(), "encodedSourceStart", 0);
        setIntField(term46734, term46734.getClass(), "encodedSourceEnd", 0);
        setField(term46734, term46734.getClass(), "sourceName", null);
        setIntField(term46734, term46734.getClass(), "baseLineno", 0);
        setIntField(term46734, term46734.getClass(), "endLineno", 0);
        setField(term46734, term46734.getClass(), "functions", null);
        setField(term46734, term46734.getClass(), "regexps", null);
        setField(term46734, term46734.getClass(), "itsVariables", null);
        setField(term46734, term46734.getClass(), "itsConst", null);
        setField(term46734, term46734.getClass(), "itsVariableNames", null);
        setIntField(term46734, term46734.getClass(), "varStart", 0);
        setField(term46734, term46734.getClass(), "compilerData", null);
        setIntField(term46734, term46734.getClass(), "type", 0);
        setField(term46734, term46734.getClass(), "next", null);
        setField(term46734, term46734.getClass(), "first", null);
        setField(term46734, term46734.getClass(), "last", null);
        setField(term46734, term46734.getClass(), "propListHead", null);
        setIntField(term46734, term46734.getClass(), "sourcePosition", 0);
        setField(term46734, term46734.getClass(), "jsType", null);
        setField(term46734, term46734.getClass(), "parent", null);
        term46735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46735, term46735.getClass(), "functionName", null);
        setBooleanField(term46735, term46735.getClass(), "itsNeedsActivation", false);
        setIntField(term46735, term46735.getClass(), "itsFunctionType", 0);
        setBooleanField(term46735, term46735.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46735, term46735.getClass(), "encodedSourceStart", 0);
        setIntField(term46735, term46735.getClass(), "encodedSourceEnd", 0);
        setField(term46735, term46735.getClass(), "sourceName", null);
        setIntField(term46735, term46735.getClass(), "baseLineno", 0);
        setIntField(term46735, term46735.getClass(), "endLineno", 0);
        setField(term46735, term46735.getClass(), "functions", null);
        setField(term46735, term46735.getClass(), "regexps", null);
        setField(term46735, term46735.getClass(), "itsVariables", null);
        setField(term46735, term46735.getClass(), "itsConst", null);
        setField(term46735, term46735.getClass(), "itsVariableNames", null);
        setIntField(term46735, term46735.getClass(), "varStart", 0);
        setField(term46735, term46735.getClass(), "compilerData", null);
        setIntField(term46735, term46735.getClass(), "type", 0);
        setField(term46735, term46735.getClass(), "next", null);
        setField(term46735, term46735.getClass(), "first", null);
        setField(term46735, term46735.getClass(), "last", null);
        setField(term46735, term46735.getClass(), "propListHead", null);
        setIntField(term46735, term46735.getClass(), "sourcePosition", 0);
        setField(term46735, term46735.getClass(), "jsType", null);
        setField(term46735, term46735.getClass(), "parent", null);
        term46673 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term46673, term46673.getClass(), "functionName", null);
        setBooleanField(term46673, term46673.getClass(), "itsNeedsActivation", false);
        setIntField(term46673, term46673.getClass(), "itsFunctionType", 0);
        setBooleanField(term46673, term46673.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term46673, term46673.getClass(), "encodedSourceStart", 0);
        setIntField(term46673, term46673.getClass(), "encodedSourceEnd", 0);
        setField(term46673, term46673.getClass(), "sourceName", null);
        setIntField(term46673, term46673.getClass(), "baseLineno", 0);
        setIntField(term46673, term46673.getClass(), "endLineno", 0);
        setField(term46673, term46673.getClass(), "functions", null);
        setField(term46673, term46673.getClass(), "regexps", null);
        setField(term46673, term46673.getClass(), "itsVariables", null);
        setField(term46673, term46673.getClass(), "itsConst", null);
        setField(term46673, term46673.getClass(), "itsVariableNames", null);
        setIntField(term46673, term46673.getClass(), "varStart", 0);
        setField(term46673, term46673.getClass(), "compilerData", null);
        setIntField(term46673, term46673.getClass(), "type", 0);
        setField(term46673, term46673.getClass(), "next", null);
        setField(term46673, term46673.getClass(), "first", null);
        setField(term46673, term46673.getClass(), "last", null);
        setField(term46673, term46673.getClass(), "propListHead", null);
        setIntField(term46673, term46673.getClass(), "sourcePosition", 0);
        setField(term46673, term46673.getClass(), "jsType", null);
        setField(term46673, term46673.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term46437;
        args[1] = term46527;
        args[2] = term46613;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term46351, args);
        assertTrue(recursiveEquals(term46351, term46732));
        assertTrue(recursiveEquals(term46437, term46733));
        assertTrue(recursiveEquals(term46527, term46734));
        assertTrue(recursiveEquals(term46613, term46735));
        assertTrue(recursiveEquals(retValue, term46673));
    }

};


