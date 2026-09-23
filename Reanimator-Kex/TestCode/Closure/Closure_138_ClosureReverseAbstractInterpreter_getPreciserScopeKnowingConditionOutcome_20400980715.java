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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3104;
     Object term3190;
     Object term3220;
     Object term3221;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3104 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term3190 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3190, term3190.getClass(), "type", 37);
        term3220 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term3220, term3220.getClass(), "restrictToArrayVisitor", null);
        setField(term3220, term3220.getClass(), "restrictToNotArrayVisitor", null);
        setField(term3220, term3220.getClass(), "restrictToObjectVisitor", null);
        setField(term3220, term3220.getClass(), "restrictToNotObjectVisitor", null);
        setField(term3220, term3220.getClass(), "restricters", null);
        setField(term3220, term3220.getClass(), "convention", null);
        setField(term3220, term3220.getClass(), "typeRegistry", null);
        setField(term3220, term3220.getClass(), "firstLink", null);
        setField(term3220, term3220.getClass(), "nextLink", null);
        setField(term3220, term3220.getClass(), "restrictUndefinedVisitor", null);
        setField(term3220, term3220.getClass(), "restrictNullVisitor", null);
        term3221 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term3221, term3221.getClass(), "functionName", null);
        setBooleanField(term3221, term3221.getClass(), "itsNeedsActivation", false);
        setIntField(term3221, term3221.getClass(), "itsFunctionType", 0);
        setBooleanField(term3221, term3221.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3221, term3221.getClass(), "encodedSourceStart", 0);
        setIntField(term3221, term3221.getClass(), "encodedSourceEnd", 0);
        setField(term3221, term3221.getClass(), "sourceName", null);
        setIntField(term3221, term3221.getClass(), "baseLineno", 0);
        setIntField(term3221, term3221.getClass(), "endLineno", 0);
        setField(term3221, term3221.getClass(), "functions", null);
        setField(term3221, term3221.getClass(), "regexps", null);
        setField(term3221, term3221.getClass(), "itsVariables", null);
        setField(term3221, term3221.getClass(), "itsConst", null);
        setField(term3221, term3221.getClass(), "itsVariableNames", null);
        setIntField(term3221, term3221.getClass(), "varStart", 0);
        setField(term3221, term3221.getClass(), "compilerData", null);
        setIntField(term3221, term3221.getClass(), "type", 37);
        setField(term3221, term3221.getClass(), "next", null);
        setField(term3221, term3221.getClass(), "first", null);
        setField(term3221, term3221.getClass(), "last", null);
        setField(term3221, term3221.getClass(), "propListHead", null);
        setIntField(term3221, term3221.getClass(), "sourcePosition", 0);
        setField(term3221, term3221.getClass(), "jsType", null);
        setField(term3221, term3221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3190;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term3104, args);
        assertTrue(recursiveEquals(term3104, term3220));
        assertTrue(recursiveEquals(term3190, term3221));
        assertTrue(recursiveEquals(retValue, null));
    }

};


