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

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186377;
     Object term186469;
     Object term186720;
     Object term186721;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186377 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term186469 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term186469, term186469.getClass(), "type", 13);
        setIntField(term186561, term186561.getClass(), "type", 13);
        setField(term186469, term186469.getClass(), "first", term186561);
        setIntField(term186653, term186653.getClass(), "type", 13);
        setField(term186469, term186469.getClass(), "last", term186653);
        term186720 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term186720, term186720.getClass(), "INEQ", null);
        setField(term186720, term186720.getClass(), "convention", null);
        setField(term186720, term186720.getClass(), "typeRegistry", null);
        setField(term186720, term186720.getClass(), "firstLink", null);
        setField(term186720, term186720.getClass(), "nextLink", null);
        setField(term186720, term186720.getClass(), "restrictUndefinedVisitor", null);
        setField(term186720, term186720.getClass(), "restrictNullVisitor", null);
        term186721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term186722 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term186723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term186721, term186721.getClass(), "str", null);
        setIntField(term186721, term186721.getClass(), "type", 13);
        setField(term186721, term186721.getClass(), "next", null);
        setDoubleField(term186722, term186722.getClass(), "number", 0.0);
        setIntField(term186722, term186722.getClass(), "type", 13);
        setField(term186722, term186722.getClass(), "next", null);
        setField(term186722, term186722.getClass(), "first", null);
        setField(term186722, term186722.getClass(), "last", null);
        setField(term186722, term186722.getClass(), "propListHead", null);
        setIntField(term186722, term186722.getClass(), "sourcePosition", 0);
        setField(term186722, term186722.getClass(), "jsType", null);
        setField(term186722, term186722.getClass(), "parent", null);
        setField(term186721, term186721.getClass(), "first", term186722);
        setDoubleField(term186723, term186723.getClass(), "number", 0.0);
        setIntField(term186723, term186723.getClass(), "type", 13);
        setField(term186723, term186723.getClass(), "next", null);
        setField(term186723, term186723.getClass(), "first", null);
        setField(term186723, term186723.getClass(), "last", null);
        setField(term186723, term186723.getClass(), "propListHead", null);
        setIntField(term186723, term186723.getClass(), "sourcePosition", 0);
        setField(term186723, term186723.getClass(), "jsType", null);
        setField(term186723, term186723.getClass(), "parent", null);
        setField(term186721, term186721.getClass(), "last", term186723);
        setField(term186721, term186721.getClass(), "propListHead", null);
        setIntField(term186721, term186721.getClass(), "sourcePosition", 0);
        setField(term186721, term186721.getClass(), "jsType", null);
        setField(term186721, term186721.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term186469;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term186377, args);
        assertTrue(recursiveEquals(term186377, term186720));
        assertTrue(recursiveEquals(term186469, term186721));
        assertTrue(recursiveEquals(retValue, null));
    }

};


