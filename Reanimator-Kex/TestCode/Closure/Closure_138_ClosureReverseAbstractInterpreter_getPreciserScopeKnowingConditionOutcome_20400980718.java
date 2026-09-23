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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3372;
     Object term3588;
     Object term3960;
     Object term3962;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3372 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term3502 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term3372, term3372.getClass(), "nextLink", term3502);
        term3588 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3588, term3588.getClass(), "type", -38);
        term3960 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        Object term3961 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term3960, term3960.getClass(), "restrictToArrayVisitor", null);
        setField(term3960, term3960.getClass(), "restrictToNotArrayVisitor", null);
        setField(term3960, term3960.getClass(), "restrictToObjectVisitor", null);
        setField(term3960, term3960.getClass(), "restrictToNotObjectVisitor", null);
        setField(term3960, term3960.getClass(), "restricters", null);
        setField(term3960, term3960.getClass(), "convention", null);
        setField(term3960, term3960.getClass(), "typeRegistry", null);
        setField(term3960, term3960.getClass(), "firstLink", null);
        setField(term3961, term3961.getClass(), "restrictToArrayVisitor", null);
        setField(term3961, term3961.getClass(), "restrictToNotArrayVisitor", null);
        setField(term3961, term3961.getClass(), "restrictToObjectVisitor", null);
        setField(term3961, term3961.getClass(), "restrictToNotObjectVisitor", null);
        setField(term3961, term3961.getClass(), "restricters", null);
        setField(term3961, term3961.getClass(), "convention", null);
        setField(term3961, term3961.getClass(), "typeRegistry", null);
        setField(term3961, term3961.getClass(), "firstLink", null);
        setField(term3961, term3961.getClass(), "nextLink", null);
        setField(term3961, term3961.getClass(), "restrictUndefinedVisitor", null);
        setField(term3961, term3961.getClass(), "restrictNullVisitor", null);
        setField(term3960, term3960.getClass(), "nextLink", term3961);
        setField(term3960, term3960.getClass(), "restrictUndefinedVisitor", null);
        setField(term3960, term3960.getClass(), "restrictNullVisitor", null);
        term3962 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term3962, term3962.getClass(), "functionName", null);
        setBooleanField(term3962, term3962.getClass(), "itsNeedsActivation", false);
        setIntField(term3962, term3962.getClass(), "itsFunctionType", 0);
        setBooleanField(term3962, term3962.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3962, term3962.getClass(), "encodedSourceStart", 0);
        setIntField(term3962, term3962.getClass(), "encodedSourceEnd", 0);
        setField(term3962, term3962.getClass(), "sourceName", null);
        setIntField(term3962, term3962.getClass(), "baseLineno", 0);
        setIntField(term3962, term3962.getClass(), "endLineno", 0);
        setField(term3962, term3962.getClass(), "functions", null);
        setField(term3962, term3962.getClass(), "regexps", null);
        setField(term3962, term3962.getClass(), "itsVariables", null);
        setField(term3962, term3962.getClass(), "itsConst", null);
        setField(term3962, term3962.getClass(), "itsVariableNames", null);
        setIntField(term3962, term3962.getClass(), "varStart", 0);
        setField(term3962, term3962.getClass(), "compilerData", null);
        setIntField(term3962, term3962.getClass(), "type", -38);
        setField(term3962, term3962.getClass(), "next", null);
        setField(term3962, term3962.getClass(), "first", null);
        setField(term3962, term3962.getClass(), "last", null);
        setField(term3962, term3962.getClass(), "propListHead", null);
        setIntField(term3962, term3962.getClass(), "sourcePosition", 0);
        setField(term3962, term3962.getClass(), "jsType", null);
        setField(term3962, term3962.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term3588;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term3372, args);
        assertTrue(recursiveEquals(term3372, term3960));
        assertTrue(recursiveEquals(term3588, term3962));
        assertTrue(recursiveEquals(retValue, null));
    }

};


