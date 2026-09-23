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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16557;
     Object term16643;
     Object term17027;
     Object term17028;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16557 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term16643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term16729 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term16815 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term16901 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term16643, term16643.getClass(), "type", 37);
        setField(term16815, term16815.getClass(), "next", null);
        setField(term16729, term16729.getClass(), "next", term16815);
        setIntField(term16729, term16729.getClass(), "type", 33);
        setField(term16643, term16643.getClass(), "first", term16729);
        setField(term16643, term16643.getClass(), "last", term16901);
        term17027 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term17027, term17027.getClass(), "restrictToArrayVisitor", null);
        setField(term17027, term17027.getClass(), "restrictToNotArrayVisitor", null);
        setField(term17027, term17027.getClass(), "restrictToObjectVisitor", null);
        setField(term17027, term17027.getClass(), "restrictToNotObjectVisitor", null);
        setField(term17027, term17027.getClass(), "restricters", null);
        setField(term17027, term17027.getClass(), "convention", null);
        setField(term17027, term17027.getClass(), "typeRegistry", null);
        setField(term17027, term17027.getClass(), "firstLink", null);
        setField(term17027, term17027.getClass(), "nextLink", null);
        setField(term17027, term17027.getClass(), "restrictUndefinedVisitor", null);
        setField(term17027, term17027.getClass(), "restrictNullVisitor", null);
        term17028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17029 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17030 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term17028, term17028.getClass(), "functionName", null);
        setBooleanField(term17028, term17028.getClass(), "itsNeedsActivation", false);
        setIntField(term17028, term17028.getClass(), "itsFunctionType", 0);
        setBooleanField(term17028, term17028.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17028, term17028.getClass(), "encodedSourceStart", 0);
        setIntField(term17028, term17028.getClass(), "encodedSourceEnd", 0);
        setField(term17028, term17028.getClass(), "sourceName", null);
        setIntField(term17028, term17028.getClass(), "baseLineno", 0);
        setIntField(term17028, term17028.getClass(), "endLineno", 0);
        setField(term17028, term17028.getClass(), "functions", null);
        setField(term17028, term17028.getClass(), "regexps", null);
        setField(term17028, term17028.getClass(), "itsVariables", null);
        setField(term17028, term17028.getClass(), "itsConst", null);
        setField(term17028, term17028.getClass(), "itsVariableNames", null);
        setIntField(term17028, term17028.getClass(), "varStart", 0);
        setField(term17028, term17028.getClass(), "compilerData", null);
        setIntField(term17028, term17028.getClass(), "type", 37);
        setField(term17028, term17028.getClass(), "next", null);
        setField(term17029, term17029.getClass(), "functionName", null);
        setBooleanField(term17029, term17029.getClass(), "itsNeedsActivation", false);
        setIntField(term17029, term17029.getClass(), "itsFunctionType", 0);
        setBooleanField(term17029, term17029.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17029, term17029.getClass(), "encodedSourceStart", 0);
        setIntField(term17029, term17029.getClass(), "encodedSourceEnd", 0);
        setField(term17029, term17029.getClass(), "sourceName", null);
        setIntField(term17029, term17029.getClass(), "baseLineno", 0);
        setIntField(term17029, term17029.getClass(), "endLineno", 0);
        setField(term17029, term17029.getClass(), "functions", null);
        setField(term17029, term17029.getClass(), "regexps", null);
        setField(term17029, term17029.getClass(), "itsVariables", null);
        setField(term17029, term17029.getClass(), "itsConst", null);
        setField(term17029, term17029.getClass(), "itsVariableNames", null);
        setIntField(term17029, term17029.getClass(), "varStart", 0);
        setField(term17029, term17029.getClass(), "compilerData", null);
        setIntField(term17029, term17029.getClass(), "type", 33);
        setField(term17030, term17030.getClass(), "functionName", null);
        setBooleanField(term17030, term17030.getClass(), "itsNeedsActivation", false);
        setIntField(term17030, term17030.getClass(), "itsFunctionType", 0);
        setBooleanField(term17030, term17030.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17030, term17030.getClass(), "encodedSourceStart", 0);
        setIntField(term17030, term17030.getClass(), "encodedSourceEnd", 0);
        setField(term17030, term17030.getClass(), "sourceName", null);
        setIntField(term17030, term17030.getClass(), "baseLineno", 0);
        setIntField(term17030, term17030.getClass(), "endLineno", 0);
        setField(term17030, term17030.getClass(), "functions", null);
        setField(term17030, term17030.getClass(), "regexps", null);
        setField(term17030, term17030.getClass(), "itsVariables", null);
        setField(term17030, term17030.getClass(), "itsConst", null);
        setField(term17030, term17030.getClass(), "itsVariableNames", null);
        setIntField(term17030, term17030.getClass(), "varStart", 0);
        setField(term17030, term17030.getClass(), "compilerData", null);
        setIntField(term17030, term17030.getClass(), "type", 0);
        setField(term17030, term17030.getClass(), "next", null);
        setField(term17030, term17030.getClass(), "first", null);
        setField(term17030, term17030.getClass(), "last", null);
        setField(term17030, term17030.getClass(), "propListHead", null);
        setIntField(term17030, term17030.getClass(), "sourcePosition", 0);
        setField(term17030, term17030.getClass(), "jsType", null);
        setField(term17030, term17030.getClass(), "parent", null);
        setField(term17029, term17029.getClass(), "next", term17030);
        setField(term17029, term17029.getClass(), "first", null);
        setField(term17029, term17029.getClass(), "last", null);
        setField(term17029, term17029.getClass(), "propListHead", null);
        setIntField(term17029, term17029.getClass(), "sourcePosition", 0);
        setField(term17029, term17029.getClass(), "jsType", null);
        setField(term17029, term17029.getClass(), "parent", null);
        setField(term17028, term17028.getClass(), "first", term17029);
        setField(term17031, term17031.getClass(), "functionName", null);
        setBooleanField(term17031, term17031.getClass(), "itsNeedsActivation", false);
        setIntField(term17031, term17031.getClass(), "itsFunctionType", 0);
        setBooleanField(term17031, term17031.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17031, term17031.getClass(), "encodedSourceStart", 0);
        setIntField(term17031, term17031.getClass(), "encodedSourceEnd", 0);
        setField(term17031, term17031.getClass(), "sourceName", null);
        setIntField(term17031, term17031.getClass(), "baseLineno", 0);
        setIntField(term17031, term17031.getClass(), "endLineno", 0);
        setField(term17031, term17031.getClass(), "functions", null);
        setField(term17031, term17031.getClass(), "regexps", null);
        setField(term17031, term17031.getClass(), "itsVariables", null);
        setField(term17031, term17031.getClass(), "itsConst", null);
        setField(term17031, term17031.getClass(), "itsVariableNames", null);
        setIntField(term17031, term17031.getClass(), "varStart", 0);
        setField(term17031, term17031.getClass(), "compilerData", null);
        setIntField(term17031, term17031.getClass(), "type", 0);
        setField(term17031, term17031.getClass(), "next", null);
        setField(term17031, term17031.getClass(), "first", null);
        setField(term17031, term17031.getClass(), "last", null);
        setField(term17031, term17031.getClass(), "propListHead", null);
        setIntField(term17031, term17031.getClass(), "sourcePosition", 0);
        setField(term17031, term17031.getClass(), "jsType", null);
        setField(term17031, term17031.getClass(), "parent", null);
        setField(term17028, term17028.getClass(), "last", term17031);
        setField(term17028, term17028.getClass(), "propListHead", null);
        setIntField(term17028, term17028.getClass(), "sourcePosition", 0);
        setField(term17028, term17028.getClass(), "jsType", null);
        setField(term17028, term17028.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term16643;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term16557, args);
        assertTrue(recursiveEquals(term16557, term17027));
        assertTrue(recursiveEquals(term16643, term17028));
        assertTrue(recursiveEquals(retValue, null));
    }

};


