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

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2368;
     Object term2438;
     Object term2724;
     Object term2725;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2368 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term2438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2438, term2438.getClass(), "type", 37);
        term2724 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term2724, term2724.getClass(), "restrictToArrayVisitor", null);
        setField(term2724, term2724.getClass(), "restrictToNotArrayVisitor", null);
        setField(term2724, term2724.getClass(), "restrictToObjectVisitor", null);
        setField(term2724, term2724.getClass(), "restrictToNotObjectVisitor", null);
        setField(term2724, term2724.getClass(), "restricters", null);
        setField(term2724, term2724.getClass(), "convention", null);
        setField(term2724, term2724.getClass(), "typeRegistry", null);
        setField(term2724, term2724.getClass(), "firstLink", null);
        setField(term2724, term2724.getClass(), "nextLink", null);
        setField(term2724, term2724.getClass(), "restrictUndefinedVisitor", null);
        setField(term2724, term2724.getClass(), "restrictNullVisitor", null);
        term2725 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2725, term2725.getClass(), "type", 37);
        setField(term2725, term2725.getClass(), "next", null);
        setField(term2725, term2725.getClass(), "first", null);
        setField(term2725, term2725.getClass(), "last", null);
        setField(term2725, term2725.getClass(), "propListHead", null);
        setIntField(term2725, term2725.getClass(), "sourcePosition", 0);
        setField(term2725, term2725.getClass(), "jsType", null);
        setField(term2725, term2725.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term2438;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term2368, args);
        assertTrue(recursiveEquals(term2368, term2724));
        assertTrue(recursiveEquals(term2438, term2725));
        assertTrue(recursiveEquals(retValue, null));
    }

};


