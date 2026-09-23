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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8649;
     Object term8735;
     Object term10094;
     Object term10095;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8649 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term8735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term8821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term8735, term8735.getClass(), "type", 37);
        setField(term8735, term8735.getClass(), "first", term8821);
        term10094 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term10094, term10094.getClass(), "restrictToArrayVisitor", null);
        setField(term10094, term10094.getClass(), "restrictToNotArrayVisitor", null);
        setField(term10094, term10094.getClass(), "restrictToObjectVisitor", null);
        setField(term10094, term10094.getClass(), "restrictToNotObjectVisitor", null);
        setField(term10094, term10094.getClass(), "restricters", null);
        setField(term10094, term10094.getClass(), "convention", null);
        setField(term10094, term10094.getClass(), "typeRegistry", null);
        setField(term10094, term10094.getClass(), "firstLink", null);
        setField(term10094, term10094.getClass(), "nextLink", null);
        setField(term10094, term10094.getClass(), "restrictUndefinedVisitor", null);
        setField(term10094, term10094.getClass(), "restrictNullVisitor", null);
        term10095 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term10096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term10095, term10095.getClass(), "functionName", null);
        setBooleanField(term10095, term10095.getClass(), "itsNeedsActivation", false);
        setIntField(term10095, term10095.getClass(), "itsFunctionType", 0);
        setBooleanField(term10095, term10095.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10095, term10095.getClass(), "encodedSourceStart", 0);
        setIntField(term10095, term10095.getClass(), "encodedSourceEnd", 0);
        setField(term10095, term10095.getClass(), "sourceName", null);
        setIntField(term10095, term10095.getClass(), "baseLineno", 0);
        setIntField(term10095, term10095.getClass(), "endLineno", 0);
        setField(term10095, term10095.getClass(), "functions", null);
        setField(term10095, term10095.getClass(), "regexps", null);
        setField(term10095, term10095.getClass(), "itsVariables", null);
        setField(term10095, term10095.getClass(), "itsConst", null);
        setField(term10095, term10095.getClass(), "itsVariableNames", null);
        setIntField(term10095, term10095.getClass(), "varStart", 0);
        setField(term10095, term10095.getClass(), "compilerData", null);
        setIntField(term10095, term10095.getClass(), "type", 37);
        setField(term10095, term10095.getClass(), "next", null);
        setField(term10096, term10096.getClass(), "functionName", null);
        setBooleanField(term10096, term10096.getClass(), "itsNeedsActivation", false);
        setIntField(term10096, term10096.getClass(), "itsFunctionType", 0);
        setBooleanField(term10096, term10096.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term10096, term10096.getClass(), "encodedSourceStart", 0);
        setIntField(term10096, term10096.getClass(), "encodedSourceEnd", 0);
        setField(term10096, term10096.getClass(), "sourceName", null);
        setIntField(term10096, term10096.getClass(), "baseLineno", 0);
        setIntField(term10096, term10096.getClass(), "endLineno", 0);
        setField(term10096, term10096.getClass(), "functions", null);
        setField(term10096, term10096.getClass(), "regexps", null);
        setField(term10096, term10096.getClass(), "itsVariables", null);
        setField(term10096, term10096.getClass(), "itsConst", null);
        setField(term10096, term10096.getClass(), "itsVariableNames", null);
        setIntField(term10096, term10096.getClass(), "varStart", 0);
        setField(term10096, term10096.getClass(), "compilerData", null);
        setIntField(term10096, term10096.getClass(), "type", 0);
        setField(term10096, term10096.getClass(), "next", null);
        setField(term10096, term10096.getClass(), "first", null);
        setField(term10096, term10096.getClass(), "last", null);
        setField(term10096, term10096.getClass(), "propListHead", null);
        setIntField(term10096, term10096.getClass(), "sourcePosition", 0);
        setField(term10096, term10096.getClass(), "jsType", null);
        setField(term10096, term10096.getClass(), "parent", null);
        setField(term10095, term10095.getClass(), "first", term10096);
        setField(term10095, term10095.getClass(), "last", null);
        setField(term10095, term10095.getClass(), "propListHead", null);
        setIntField(term10095, term10095.getClass(), "sourcePosition", 0);
        setField(term10095, term10095.getClass(), "jsType", null);
        setField(term10095, term10095.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term8735;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term8649, args);
        assertTrue(recursiveEquals(term8649, term10094));
        assertTrue(recursiveEquals(term8735, term10095));
        assertTrue(recursiveEquals(retValue, null));
    }

};


