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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98457;
     Object term98549;
     Object term98796;
     Object term98797;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98457 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term98549 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98641 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98733 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term98549, term98549.getClass(), "type", 45);
        setIntField(term98641, term98641.getClass(), "type", -46);
        setField(term98549, term98549.getClass(), "first", term98641);
        setIntField(term98733, term98733.getClass(), "type", 45);
        setField(term98549, term98549.getClass(), "last", term98733);
        term98796 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term98796, term98796.getClass(), "INEQ", null);
        setField(term98796, term98796.getClass(), "convention", null);
        setField(term98796, term98796.getClass(), "typeRegistry", null);
        setField(term98796, term98796.getClass(), "firstLink", null);
        setField(term98796, term98796.getClass(), "nextLink", null);
        setField(term98796, term98796.getClass(), "restrictUndefinedVisitor", null);
        setField(term98796, term98796.getClass(), "restrictNullVisitor", null);
        term98797 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term98798 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term98799 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term98797, term98797.getClass(), "number", 0.0);
        setIntField(term98797, term98797.getClass(), "type", 45);
        setField(term98797, term98797.getClass(), "next", null);
        setField(term98798, term98798.getClass(), "str", null);
        setIntField(term98798, term98798.getClass(), "type", -46);
        setField(term98798, term98798.getClass(), "next", null);
        setField(term98798, term98798.getClass(), "first", null);
        setField(term98798, term98798.getClass(), "last", null);
        setField(term98798, term98798.getClass(), "propListHead", null);
        setIntField(term98798, term98798.getClass(), "sourcePosition", 0);
        setField(term98798, term98798.getClass(), "jsType", null);
        setField(term98798, term98798.getClass(), "parent", null);
        setField(term98797, term98797.getClass(), "first", term98798);
        setDoubleField(term98799, term98799.getClass(), "number", 0.0);
        setIntField(term98799, term98799.getClass(), "type", 45);
        setField(term98799, term98799.getClass(), "next", null);
        setField(term98799, term98799.getClass(), "first", null);
        setField(term98799, term98799.getClass(), "last", null);
        setField(term98799, term98799.getClass(), "propListHead", null);
        setIntField(term98799, term98799.getClass(), "sourcePosition", 0);
        setField(term98799, term98799.getClass(), "jsType", null);
        setField(term98799, term98799.getClass(), "parent", null);
        setField(term98797, term98797.getClass(), "last", term98799);
        setField(term98797, term98797.getClass(), "propListHead", null);
        setIntField(term98797, term98797.getClass(), "sourcePosition", 0);
        setField(term98797, term98797.getClass(), "jsType", null);
        setField(term98797, term98797.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term98549;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term98457, args);
        assertTrue(recursiveEquals(term98457, term98796));
        assertTrue(recursiveEquals(term98549, term98797));
        assertTrue(recursiveEquals(retValue, null));
    }

};


