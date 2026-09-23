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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5740;
     Object term5956;
     Object term7921;
     Object term7923;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5740 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term5870 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term5740, term5740.getClass(), "nextLink", term5870);
        term5956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term5956, term5956.getClass(), "type", 37);
        setField(term5956, term5956.getClass(), "first", null);
        term7921 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term7922 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term7921, term7921.getClass(), "restrictToArrayVisitor", null);
        setField(term7921, term7921.getClass(), "restrictToNotArrayVisitor", null);
        setField(term7921, term7921.getClass(), "restrictToObjectVisitor", null);
        setField(term7921, term7921.getClass(), "restrictToNotObjectVisitor", null);
        setField(term7921, term7921.getClass(), "restricters", null);
        setField(term7921, term7921.getClass(), "convention", null);
        setField(term7921, term7921.getClass(), "typeRegistry", null);
        setField(term7921, term7921.getClass(), "firstLink", null);
        setField(term7922, term7922.getClass(), "restrictToArrayVisitor", null);
        setField(term7922, term7922.getClass(), "restrictToNotArrayVisitor", null);
        setField(term7922, term7922.getClass(), "restrictToObjectVisitor", null);
        setField(term7922, term7922.getClass(), "restrictToNotObjectVisitor", null);
        setField(term7922, term7922.getClass(), "restricters", null);
        setField(term7922, term7922.getClass(), "convention", null);
        setField(term7922, term7922.getClass(), "typeRegistry", null);
        setField(term7922, term7922.getClass(), "firstLink", null);
        setField(term7922, term7922.getClass(), "nextLink", null);
        setField(term7922, term7922.getClass(), "restrictUndefinedVisitor", null);
        setField(term7922, term7922.getClass(), "restrictNullVisitor", null);
        setField(term7921, term7921.getClass(), "nextLink", term7922);
        setField(term7921, term7921.getClass(), "restrictUndefinedVisitor", null);
        setField(term7921, term7921.getClass(), "restrictNullVisitor", null);
        term7923 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term7923, term7923.getClass(), "functionName", null);
        setBooleanField(term7923, term7923.getClass(), "itsNeedsActivation", false);
        setIntField(term7923, term7923.getClass(), "itsFunctionType", 0);
        setBooleanField(term7923, term7923.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term7923, term7923.getClass(), "encodedSourceStart", 0);
        setIntField(term7923, term7923.getClass(), "encodedSourceEnd", 0);
        setField(term7923, term7923.getClass(), "sourceName", null);
        setIntField(term7923, term7923.getClass(), "baseLineno", 0);
        setIntField(term7923, term7923.getClass(), "endLineno", 0);
        setField(term7923, term7923.getClass(), "functions", null);
        setField(term7923, term7923.getClass(), "regexps", null);
        setField(term7923, term7923.getClass(), "itsVariables", null);
        setField(term7923, term7923.getClass(), "itsConst", null);
        setField(term7923, term7923.getClass(), "itsVariableNames", null);
        setIntField(term7923, term7923.getClass(), "varStart", 0);
        setField(term7923, term7923.getClass(), "compilerData", null);
        setIntField(term7923, term7923.getClass(), "type", 37);
        setField(term7923, term7923.getClass(), "next", null);
        setField(term7923, term7923.getClass(), "first", null);
        setField(term7923, term7923.getClass(), "last", null);
        setField(term7923, term7923.getClass(), "propListHead", null);
        setIntField(term7923, term7923.getClass(), "sourcePosition", 0);
        setField(term7923, term7923.getClass(), "jsType", null);
        setField(term7923, term7923.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term5956;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term5740, args);
        assertTrue(recursiveEquals(term5740, term7921));
        assertTrue(recursiveEquals(term5956, term7923));
        assertTrue(recursiveEquals(retValue, null));
    }

};


