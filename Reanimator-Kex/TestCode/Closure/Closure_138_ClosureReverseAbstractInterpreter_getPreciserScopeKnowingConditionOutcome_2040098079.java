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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2040098079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1856;
     Object term1942;
     Object term2455;
     Object term2456;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2040098079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1856 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term1942 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term2455 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term2455, term2455.getClass(), "restrictToArrayVisitor", null);
        setField(term2455, term2455.getClass(), "restrictToNotArrayVisitor", null);
        setField(term2455, term2455.getClass(), "restrictToObjectVisitor", null);
        setField(term2455, term2455.getClass(), "restrictToNotObjectVisitor", null);
        setField(term2455, term2455.getClass(), "restricters", null);
        setField(term2455, term2455.getClass(), "convention", null);
        setField(term2455, term2455.getClass(), "typeRegistry", null);
        setField(term2455, term2455.getClass(), "firstLink", null);
        setField(term2455, term2455.getClass(), "nextLink", null);
        setField(term2455, term2455.getClass(), "restrictUndefinedVisitor", null);
        setField(term2455, term2455.getClass(), "restrictNullVisitor", null);
        term2456 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term2456, term2456.getClass(), "functionName", null);
        setBooleanField(term2456, term2456.getClass(), "itsNeedsActivation", false);
        setIntField(term2456, term2456.getClass(), "itsFunctionType", 0);
        setBooleanField(term2456, term2456.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2456, term2456.getClass(), "encodedSourceStart", 0);
        setIntField(term2456, term2456.getClass(), "encodedSourceEnd", 0);
        setField(term2456, term2456.getClass(), "sourceName", null);
        setIntField(term2456, term2456.getClass(), "baseLineno", 0);
        setIntField(term2456, term2456.getClass(), "endLineno", 0);
        setField(term2456, term2456.getClass(), "functions", null);
        setField(term2456, term2456.getClass(), "regexps", null);
        setField(term2456, term2456.getClass(), "itsVariables", null);
        setField(term2456, term2456.getClass(), "itsConst", null);
        setField(term2456, term2456.getClass(), "itsVariableNames", null);
        setIntField(term2456, term2456.getClass(), "varStart", 0);
        setField(term2456, term2456.getClass(), "compilerData", null);
        setIntField(term2456, term2456.getClass(), "type", 0);
        setField(term2456, term2456.getClass(), "next", null);
        setField(term2456, term2456.getClass(), "first", null);
        setField(term2456, term2456.getClass(), "last", null);
        setField(term2456, term2456.getClass(), "propListHead", null);
        setIntField(term2456, term2456.getClass(), "sourcePosition", 0);
        setField(term2456, term2456.getClass(), "jsType", null);
        setField(term2456, term2456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1942;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term1856, args);
        assertTrue(recursiveEquals(term1856, term2455));
        assertTrue(recursiveEquals(term1942, term2456));
        assertTrue(recursiveEquals(retValue, null));
    }

};


