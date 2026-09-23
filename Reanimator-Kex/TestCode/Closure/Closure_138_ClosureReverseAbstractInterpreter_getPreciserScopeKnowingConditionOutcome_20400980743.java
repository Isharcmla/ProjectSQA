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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15649;
     Object term15735;
     Object term15997;
     Object term15998;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15649 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term15735 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term15821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term15907 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term15735, term15735.getClass(), "type", 37);
        setField(term15821, term15821.getClass(), "next", term15907);
        setField(term15735, term15735.getClass(), "first", term15821);
        term15997 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term15997, term15997.getClass(), "restrictToArrayVisitor", null);
        setField(term15997, term15997.getClass(), "restrictToNotArrayVisitor", null);
        setField(term15997, term15997.getClass(), "restrictToObjectVisitor", null);
        setField(term15997, term15997.getClass(), "restrictToNotObjectVisitor", null);
        setField(term15997, term15997.getClass(), "restricters", null);
        setField(term15997, term15997.getClass(), "convention", null);
        setField(term15997, term15997.getClass(), "typeRegistry", null);
        setField(term15997, term15997.getClass(), "firstLink", null);
        setField(term15997, term15997.getClass(), "nextLink", null);
        setField(term15997, term15997.getClass(), "restrictUndefinedVisitor", null);
        setField(term15997, term15997.getClass(), "restrictNullVisitor", null);
        term15998 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term15999 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term16000 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term15998, term15998.getClass(), "functionName", null);
        setBooleanField(term15998, term15998.getClass(), "itsNeedsActivation", false);
        setIntField(term15998, term15998.getClass(), "itsFunctionType", 0);
        setBooleanField(term15998, term15998.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term15998, term15998.getClass(), "encodedSourceStart", 0);
        setIntField(term15998, term15998.getClass(), "encodedSourceEnd", 0);
        setField(term15998, term15998.getClass(), "sourceName", null);
        setIntField(term15998, term15998.getClass(), "baseLineno", 0);
        setIntField(term15998, term15998.getClass(), "endLineno", 0);
        setField(term15998, term15998.getClass(), "functions", null);
        setField(term15998, term15998.getClass(), "regexps", null);
        setField(term15998, term15998.getClass(), "itsVariables", null);
        setField(term15998, term15998.getClass(), "itsConst", null);
        setField(term15998, term15998.getClass(), "itsVariableNames", null);
        setIntField(term15998, term15998.getClass(), "varStart", 0);
        setField(term15998, term15998.getClass(), "compilerData", null);
        setIntField(term15998, term15998.getClass(), "type", 37);
        setField(term15998, term15998.getClass(), "next", null);
        setField(term15999, term15999.getClass(), "functionName", null);
        setBooleanField(term15999, term15999.getClass(), "itsNeedsActivation", false);
        setIntField(term15999, term15999.getClass(), "itsFunctionType", 0);
        setBooleanField(term15999, term15999.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term15999, term15999.getClass(), "encodedSourceStart", 0);
        setIntField(term15999, term15999.getClass(), "encodedSourceEnd", 0);
        setField(term15999, term15999.getClass(), "sourceName", null);
        setIntField(term15999, term15999.getClass(), "baseLineno", 0);
        setIntField(term15999, term15999.getClass(), "endLineno", 0);
        setField(term15999, term15999.getClass(), "functions", null);
        setField(term15999, term15999.getClass(), "regexps", null);
        setField(term15999, term15999.getClass(), "itsVariables", null);
        setField(term15999, term15999.getClass(), "itsConst", null);
        setField(term15999, term15999.getClass(), "itsVariableNames", null);
        setIntField(term15999, term15999.getClass(), "varStart", 0);
        setField(term15999, term15999.getClass(), "compilerData", null);
        setIntField(term15999, term15999.getClass(), "type", 0);
        setField(term16000, term16000.getClass(), "functionName", null);
        setBooleanField(term16000, term16000.getClass(), "itsNeedsActivation", false);
        setIntField(term16000, term16000.getClass(), "itsFunctionType", 0);
        setBooleanField(term16000, term16000.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term16000, term16000.getClass(), "encodedSourceStart", 0);
        setIntField(term16000, term16000.getClass(), "encodedSourceEnd", 0);
        setField(term16000, term16000.getClass(), "sourceName", null);
        setIntField(term16000, term16000.getClass(), "baseLineno", 0);
        setIntField(term16000, term16000.getClass(), "endLineno", 0);
        setField(term16000, term16000.getClass(), "functions", null);
        setField(term16000, term16000.getClass(), "regexps", null);
        setField(term16000, term16000.getClass(), "itsVariables", null);
        setField(term16000, term16000.getClass(), "itsConst", null);
        setField(term16000, term16000.getClass(), "itsVariableNames", null);
        setIntField(term16000, term16000.getClass(), "varStart", 0);
        setField(term16000, term16000.getClass(), "compilerData", null);
        setIntField(term16000, term16000.getClass(), "type", 0);
        setField(term16000, term16000.getClass(), "next", null);
        setField(term16000, term16000.getClass(), "first", null);
        setField(term16000, term16000.getClass(), "last", null);
        setField(term16000, term16000.getClass(), "propListHead", null);
        setIntField(term16000, term16000.getClass(), "sourcePosition", 0);
        setField(term16000, term16000.getClass(), "jsType", null);
        setField(term16000, term16000.getClass(), "parent", null);
        setField(term15999, term15999.getClass(), "next", term16000);
        setField(term15999, term15999.getClass(), "first", null);
        setField(term15999, term15999.getClass(), "last", null);
        setField(term15999, term15999.getClass(), "propListHead", null);
        setIntField(term15999, term15999.getClass(), "sourcePosition", 0);
        setField(term15999, term15999.getClass(), "jsType", null);
        setField(term15999, term15999.getClass(), "parent", null);
        setField(term15998, term15998.getClass(), "first", term15999);
        setField(term15998, term15998.getClass(), "last", null);
        setField(term15998, term15998.getClass(), "propListHead", null);
        setIntField(term15998, term15998.getClass(), "sourcePosition", 0);
        setField(term15998, term15998.getClass(), "jsType", null);
        setField(term15998, term15998.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term15735;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term15649, args);
        assertTrue(recursiveEquals(term15649, term15997));
        assertTrue(recursiveEquals(term15735, term15998));
        assertTrue(recursiveEquals(retValue, null));
    }

};


