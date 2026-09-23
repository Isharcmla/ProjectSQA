package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55525;
     Object term55617;
     Object term55858;
     Object term55859;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55525 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term55617 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55709 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55801 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term55617, term55617.getClass(), "type", 13);
        setField(term55617, term55617.getClass(), "first", term55709);
        setField(term55617, term55617.getClass(), "last", term55801);
        term55858 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term55858, term55858.getClass(), "INEQ", null);
        setField(term55858, term55858.getClass(), "convention", null);
        setField(term55858, term55858.getClass(), "typeRegistry", null);
        setField(term55858, term55858.getClass(), "firstLink", null);
        setField(term55858, term55858.getClass(), "nextLink", null);
        setField(term55858, term55858.getClass(), "restrictUndefinedVisitor", null);
        setField(term55858, term55858.getClass(), "restrictNullVisitor", null);
        term55859 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55860 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term55861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term55859, term55859.getClass(), "str", null);
        setIntField(term55859, term55859.getClass(), "type", 13);
        setField(term55859, term55859.getClass(), "next", null);
        setField(term55860, term55860.getClass(), "str", null);
        setIntField(term55860, term55860.getClass(), "type", 0);
        setField(term55860, term55860.getClass(), "next", null);
        setField(term55860, term55860.getClass(), "first", null);
        setField(term55860, term55860.getClass(), "last", null);
        setField(term55860, term55860.getClass(), "propListHead", null);
        setIntField(term55860, term55860.getClass(), "sourcePosition", 0);
        setField(term55860, term55860.getClass(), "jsType", null);
        setField(term55860, term55860.getClass(), "parent", null);
        setField(term55859, term55859.getClass(), "first", term55860);
        setField(term55861, term55861.getClass(), "str", null);
        setIntField(term55861, term55861.getClass(), "type", 0);
        setField(term55861, term55861.getClass(), "next", null);
        setField(term55861, term55861.getClass(), "first", null);
        setField(term55861, term55861.getClass(), "last", null);
        setField(term55861, term55861.getClass(), "propListHead", null);
        setIntField(term55861, term55861.getClass(), "sourcePosition", 0);
        setField(term55861, term55861.getClass(), "jsType", null);
        setField(term55861, term55861.getClass(), "parent", null);
        setField(term55859, term55859.getClass(), "last", term55861);
        setField(term55859, term55859.getClass(), "propListHead", null);
        setIntField(term55859, term55859.getClass(), "sourcePosition", 0);
        setField(term55859, term55859.getClass(), "jsType", null);
        setField(term55859, term55859.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term55617;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term55525, args);
        assertTrue(recursiveEquals(term55525, term55858));
        assertTrue(recursiveEquals(term55617, term55859));
        assertTrue(recursiveEquals(retValue, null));
    }

};


